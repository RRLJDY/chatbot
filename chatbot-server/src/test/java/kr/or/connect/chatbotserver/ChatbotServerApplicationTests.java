package kr.or.connect.chatbotserver;

import kr.or.connect.chatbotserver.dao.LostDAO;
import kr.or.connect.chatbotserver.dao.VoteDAO;
import kr.or.connect.chatbotserver.model.CafeteriaManagement;
import kr.or.connect.chatbotserver.model.CafeteriaMenu;
import kr.or.connect.chatbotserver.model.Rank;
import kr.or.connect.chatbotserver.model.Vote;
import kr.or.connect.chatbotserver.service.CafeteriaMenuService;
import kr.or.connect.chatbotserver.service.LectureInformationService;
import kr.or.connect.chatbotserver.service.PhoneNumberOfUniversityService;
import kr.or.connect.chatbotserver.service.ScheduleService;
import org.json.simple.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatbotServerApplicationTests {

	@Autowired
	ScheduleService scheduleService;

	@Autowired
	CafeteriaMenuService cafeteriaMenuService;

	@Autowired
	LostDAO lostDAO;

	@Autowired
	LectureInformationService lectureInformationService;
	@Autowired
	PhoneNumberOfUniversityService phoneNumberOfUniversityService;
	@Autowired
	VoteDAO voteDAO;
	@Test
	public void contextLoads() throws IOException {

	}



}
