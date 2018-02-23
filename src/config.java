
public class config {
	
public int year;
public int month;

public String inputlanguage;
public String outputlanguage;
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public String getInputlanguage() {
	return inputlanguage;
}
public void setInputlanguage(String inputlanguage) {
	this.inputlanguage = inputlanguage;
}
public String getOutputlanguage() {
	return outputlanguage;
}
public void setOutputlanguage(String outputlanguage) {
	this.outputlanguage = outputlanguage;
}



@Override
public String toString() {
	return "config [year=" + year + ", month=" + month + ", inputlanguage=" + inputlanguage + ", outputlanguage="
			+ outputlanguage + "]";
}





}
