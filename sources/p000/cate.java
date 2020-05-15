package p000;

import java.util.Calendar;

/* renamed from: cate */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cate {

    /* renamed from: a */
    public final int f175817a;

    /* renamed from: b */
    public final int f175818b;

    /* renamed from: c */
    public final int f175819c;

    public cate() {
        Calendar instance = Calendar.getInstance();
        this.f175817a = instance.get(1);
        this.f175819c = instance.get(2) + 1;
        this.f175818b = instance.get(5);
    }

    /* renamed from: a */
    public final boolean mo74839a() {
        Calendar instance = Calendar.getInstance();
        instance.clear();
        int i = this.f175817a;
        if (i == 0 && this.f175819c == 0 && this.f175818b == 0) {
            return true;
        }
        if (i <= 2000) {
            return false;
        }
        instance.set(1, i);
        int i2 = this.f175819c;
        if (i2 <= 0 || i2 > 12) {
            return false;
        }
        instance.set(2, i2 - 1);
        int actualMaximum = instance.getActualMaximum(5);
        int actualMinimum = instance.getActualMinimum(5);
        int i3 = this.f175818b;
        if (actualMinimum > i3 || i3 > actualMaximum) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.f175817a;
        int i2 = this.f175818b;
        int i3 = this.f175819c;
        StringBuilder sb = new StringBuilder(58);
        sb.append("Date{Year=");
        sb.append(i);
        sb.append(", Day=");
        sb.append(i2);
        sb.append(", Month=");
        sb.append(i3);
        sb.append('}');
        return sb.toString();
    }

    public cate(int i, int i2, int i3) {
        this.f175817a = i;
        this.f175819c = i2;
        this.f175818b = i3;
    }
}
