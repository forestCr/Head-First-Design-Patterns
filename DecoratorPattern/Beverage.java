package DecoratorPattern;

/*Beverage��һ�������࣬������������getDescription()��cost()*/
public abstract class Beverage {
	
	String description = "Unkown Beverage";
	
	/*getDescription()�Ѿ��ڴ�ʵ���ˣ�����cost()������������ʵ��*/
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}