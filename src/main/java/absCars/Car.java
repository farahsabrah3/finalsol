package absCars;

public abstract class Car {
	float height;
	float weight;
	int numberOfWheels;

	abstract void autopilot();

	abstract void stremingServices();

	abstract void parckingSensors();

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

}
