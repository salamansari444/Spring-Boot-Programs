package in.ineuron.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMsgServiceImpl implements IWishMsgService {


	@Override
	public String getWishMsg() {
		LocalDateTime ltd = LocalDateTime.now();
		int hour=ltd.getHour();
		if (hour < 12)
			return "Good Morning ";
		else if (hour < 16)
			return "Good Afternoon";
		else if (hour < 20)
			return "Good Evening";
		else
			return "Good Night";
	}

}
