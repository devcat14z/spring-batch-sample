package example;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;

public class ExampleItemProcessor implements
		ItemProcessor<Step2InputEntity, Step2InputEntity> {

	private Date bizDate;

	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public Step2InputEntity process(Step2InputEntity arg0) throws Exception {

		if (bizDate.before(arg0.getBizDate())) {
			// throw Exception for Skip
			throw new ExampleSkipException("input date is old.");
		}

		return arg0;

	}

}
