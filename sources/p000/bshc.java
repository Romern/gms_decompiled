package p000;

import java.math.BigDecimal;

/* renamed from: bshc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bshc extends Number {

    /* renamed from: a */
    private final String f144552a;

    public bshc(String str) {
        this.f144552a = str;
    }

    private Object writeReplace() {
        return new BigDecimal(this.f144552a);
    }

    public final double doubleValue() {
        return Double.parseDouble(this.f144552a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bshc)) {
            return false;
        }
        String str = this.f144552a;
        String str2 = ((bshc) obj).f144552a;
        return str == str2 || str.equals(str2);
    }

    public final float floatValue() {
        return Float.parseFloat(this.f144552a);
    }

    public final int hashCode() {
        return this.f144552a.hashCode();
    }

    public final int intValue() {
        try {
            return Integer.parseInt(this.f144552a);
        } catch (NumberFormatException e) {
            try {
                return (int) Long.parseLong(this.f144552a);
            } catch (NumberFormatException e2) {
                return new BigDecimal(this.f144552a).intValue();
            }
        }
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.f144552a);
        } catch (NumberFormatException e) {
            return new BigDecimal(this.f144552a).longValue();
        }
    }

    public final String toString() {
        return this.f144552a;
    }
}
