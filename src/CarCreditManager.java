public class CarCreditManager extends BaseCreditManager implements ICreditManager{

    @Override
    public void calculate() {
        System.out.println("Arba kredisi hesapland─▒");
    }

    @Override
    public void save() {
        super.save();
    }
}
