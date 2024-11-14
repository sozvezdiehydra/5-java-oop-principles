package com.example.task02;

import java.text.DecimalFormat;

public class DiscountBill extends Bill{
    private double discount;

    public long getPrice() {
        long basePrice = super.getPrice();
        return getDiscountedPrice(basePrice);
    }

    private long getDiscountedPrice(long price) {
        return (long)(price * (1 - discount));
    }

    public String formatDiscount() {
        double discountPercent = discount * 100;

        DecimalFormat decimalFormat = new DecimalFormat();
        String formattedDiscount = decimalFormat.format(discountPercent);

        return String.format("%s%%", formattedDiscount);
    }

    public long getAbsoluteDiscount() {
        return super.getPrice() - this.getPrice();
    }

    public double getDiscount() {
        return discount;
    }
}
