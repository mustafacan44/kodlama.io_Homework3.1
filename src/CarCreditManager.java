public class CarCreditManager extends BaseCreditManager implements ICreditManager{

    @Override
    public void calculate() {
        System.out.println("Arba kredisi hesaplandı");
    }

    @Override
    public void save() {
        super.save();
    }
}
