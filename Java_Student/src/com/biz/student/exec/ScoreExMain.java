package com.biz.student.exec;

import com.biz.student.service.ScoreService;
import com.biz.student.service.ScoreServiceImplV1;

public class ScoreExMain {
	public static void main(String[] args) {
		ScoreService sService = new ScoreServiceImplV1();
		sService.inputStudent();
		sService.inputScore();
		sService.scoreList();
	}

}
