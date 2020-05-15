package p000;

import java.util.Locale;

/* renamed from: bewb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewb {

    /* renamed from: a */
    public final int f112776a;

    /* renamed from: b */
    public final long f112777b;

    /* renamed from: c */
    public final long f112778c;

    /* renamed from: d */
    public final float f112779d;

    /* renamed from: e */
    public final int f112780e;

    public bewb(int i, long j, long j2, float f, int i2) {
        this.f112776a = i;
        this.f112777b = j;
        this.f112778c = j2;
        this.f112779d = f;
        this.f112780e = i2;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        switch (this.f112776a) {
            case 0:
                str = "NOT_FLOOR_CHANGE";
                break;
            case 1:
                str = "STAIRS_UP";
                break;
            case 2:
                str = "STAIRS_DOWN";
                break;
            case 3:
                str = "ELEVATOR_UP";
                break;
            case 4:
                str = "ELEVATOR_DOWN";
                break;
            case 5:
                str = "ESCALATOR_UP";
                break;
            case 6:
                str = "ESCALATOR_DOWN";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(this.f112780e);
        objArr[2] = Float.valueOf(this.f112779d);
        double d = (double) this.f112777b;
        Double.isNaN(d);
        objArr[3] = Double.valueOf(d * 1.0E-9d);
        double d2 = (double) this.f112778c;
        Double.isNaN(d2);
        objArr[4] = Double.valueOf(d2 * 1.0E-9d);
        return String.format(locale, "FloorChangeActivity [type=%s, confidence=%d, altitudeChange=%.2f, start=%.2fs, end=%.2fs]", objArr);
    }
}
