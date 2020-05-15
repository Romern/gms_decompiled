package p000;

import java.util.Calendar;

/* renamed from: akta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akta {

    /* renamed from: a */
    private final Calendar f72701a;

    /* renamed from: b */
    private final boolean f72702b;

    public akta(Calendar calendar, boolean z) {
        this.f72701a = calendar;
        this.f72702b = z;
    }

    /* renamed from: a */
    public final boolean mo39831a(int i, int i2) {
        if (i2 <= 12 && i2 > 0 && i <= 60) {
            Calendar instance = Calendar.getInstance();
            instance.set(1, i + 2000);
            instance.set(2, i2);
            instance.set(5, 1);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(this.f72701a.getTime());
            instance2.set(5, 1);
            if (!instance.before(instance2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo39832a(String str) {
        String replaceAll;
        int length;
        if (this.f72702b) {
            return true;
        }
        if (str == null || ((length = (replaceAll = str.replaceAll("\\s", "")).length()) != 15 && length != 16 && length != 19)) {
            return false;
        }
        String stringBuffer = new StringBuffer(replaceAll).reverse().toString();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < stringBuffer.length(); i3++) {
            int digit = Character.digit(stringBuffer.charAt(i3), 10);
            if (i3 % 2 != 0) {
                i2 += digit + digit;
                if (digit >= 5) {
                    i2 -= 9;
                }
            } else {
                i += digit;
            }
        }
        return (i + i2) % 10 == 0;
    }
}
