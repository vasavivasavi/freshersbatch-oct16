package desert;
    public class CandyItem extends DesertItem{
        int dollarCurrency=60;

        @Override
        int getcost(int cost) {
            return cost*dollarCurrency;
        }

    }

