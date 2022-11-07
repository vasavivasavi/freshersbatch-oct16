package desert;
public class Cookie extends DesertItem {
    int euroCurrency=70;

    @Override
    int getcost(int cost) {
        return cost*euroCurrency;
    }

}