package example;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class Step2InputEntityFieldSetMapper implements
		FieldSetMapper<Step2InputEntity> {

	public Step2InputEntity mapFieldSet(FieldSet arg0) throws BindException {

		if (arg0 == null) {
			return null;
		}

		Step2InputEntity entity = new Step2InputEntity();
		entity.setId(arg0.readString("ID"));
		entity.setBizDate(arg0.readDate("bizDate"));
		entity.setUserName(arg0.readString("userName"));

		return entity;

	}

}
