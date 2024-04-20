package Dataprovider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {
	
	public List<HashMap<String, String>> jsondataTohashmapdata() throws IOException {
		
		//read jason data into string
		String jsondata=FileUtils.readFileToString(new File ("C:\\Users\\Montran\\Desktop\\Workspace\\SeleniumAutoTestingOnMaven\\src\\test\\java\\Dataprovider\\practisejasondata.json"));
		
	
		//convert String into hashmap (jackson databind dependency)
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data=mapper.readValue(jsondata, new TypeReference<List<HashMap<String, String>>>(){});
		return data;
	
	} 

}
