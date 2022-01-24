package com.john.dojo.overflow.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

import com.john.dojo.overflow.models.Question;
import com.john.dojo.overflow.repositories.QuestionRepository;
import com.john.dojo.overflow.models.Tag;
import com.john.dojo.overflow.repositories.TagRepository;
import com.john.dojo.overflow.models.Answer;
import com.john.dojo.overflow.repositories.AnswerRepository;

@Service
public class OneService {

	private final QuestionRepository oneRepository;
	private final AnswerRepository twoRepository;
	private final TagRepository threeRepository;

	public OneService(QuestionRepository oneRepository, AnswerRepository twoRepository, TagRepository threeRepository) {
		this.oneRepository = oneRepository;
		this.twoRepository = twoRepository;
		this.threeRepository = threeRepository;
	}
	public Question createQuestion(Question newQ) {
		List<Tag> questionTags = new ArrayList<Tag>();
		for (String subject : newQ.splitTags()) {
			Tag tagToBeAdded = this.threeRepository.findBySubject(subject).orElse(null);
			if (tagToBeAdded == null) {
				tagToBeAdded = new Tag(subject);
				this.threeRepository.save(tagToBeAdded);
				}
			if(!questionTags.contains(tagToBeAdded)) {
				questionTags.add(tagToBeAdded);
			}	
		}
		newQ.setTags(questionTags);
		return this.oneRepository.save(newQ);
	}
	public Answer createAnswer(Answer b) {
            return twoRepository.save(b);
		}
	public List<Question> getAllQuestions() {
        return oneRepository.findAll();
	}
	public Question getQuestionById(Long id) {
		return this.oneRepository.findById(id).orElse(null);
	}
	public Answer getAnswerById(Long id) {
		return this.twoRepository.findById(id).orElse(null);
	}
}