package p000;

/* renamed from: qht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum qht implements bxvp {
    VOICE(0),
    DATA(1),
    SMS(2);
    

    /* renamed from: d */
    public final int f41417d;

    private qht(int i) {
        this.f41417d = i;
    }

    /* renamed from: a */
    public static qht m32187a(int i) {
        if (i == 0) {
            return VOICE;
        }
        if (i == 1) {
            return DATA;
        }
        if (i != 2) {
            return null;
        }
        return SMS;
    }

    /* renamed from: b */
    public static bxvr m32188b() {
        return qhs.f41412a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f41417d;
    }

    public final String toString() {
        return Integer.toString(this.f41417d);
    }
}
