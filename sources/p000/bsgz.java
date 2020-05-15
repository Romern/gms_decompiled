package p000;

import java.math.BigInteger;

/* renamed from: bsgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgz extends bsgt {

    /* renamed from: a */
    private static final Class[] f144550a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b */
    private Object f144551b;

    public bsgz(Boolean bool) {
        mo70543a(bool);
    }

    /* renamed from: a */
    private static boolean m115762a(bsgz bsgz) {
        Object obj = bsgz.f144551b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: b */
    public final Boolean mo70545b() {
        return (Boolean) this.f144551b;
    }

    /* renamed from: c */
    public final boolean mo70546c() {
        return this.f144551b instanceof Number;
    }

    /* renamed from: d */
    public final Number mo70547d() {
        Object obj = this.f144551b;
        return obj instanceof String ? new bshc((String) obj) : (Number) obj;
    }

    /* renamed from: e */
    public final String mo70548e() {
        if (mo70546c()) {
            return mo70547d().toString();
        }
        if (mo70544a()) {
            return mo70545b().toString();
        }
        return (String) this.f144551b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bsgz bsgz = (bsgz) obj;
        if (this.f144551b == null) {
            return bsgz.f144551b == null;
        }
        if (m115762a(this) && m115762a(bsgz)) {
            return mo70547d().longValue() == bsgz.mo70547d().longValue();
        }
        Object obj2 = this.f144551b;
        if (!(obj2 instanceof Number) || !(bsgz.f144551b instanceof Number)) {
            return obj2.equals(bsgz.f144551b);
        }
        double doubleValue = mo70547d().doubleValue();
        double doubleValue2 = bsgz.mo70547d().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        if (this.f144551b == null) {
            return 31;
        }
        if (m115762a(this)) {
            long longValue = mo70547d().longValue();
            return (int) ((longValue >>> 32) ^ longValue);
        }
        Object obj = this.f144551b;
        if (!(obj instanceof Number)) {
            return obj.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(mo70547d().doubleValue());
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public bsgz(Number number) {
        mo70543a(number);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70543a(Object obj) {
        if (obj instanceof Character) {
            this.f144551b = String.valueOf(((Character) obj).charValue());
            return;
        }
        if (!(obj instanceof Number) && !(obj instanceof String)) {
            Class<?> cls = obj.getClass();
            Class[] clsArr = f144550a;
            int length = clsArr.length;
            int i = 0;
            while (i < length) {
                if (!clsArr[i].isAssignableFrom(cls)) {
                    i++;
                }
            }
            throw new IllegalArgumentException();
        }
        this.f144551b = obj;
    }

    public bsgz(String str) {
        mo70543a(str);
    }

    /* renamed from: a */
    public final boolean mo70544a() {
        return this.f144551b instanceof Boolean;
    }
}
