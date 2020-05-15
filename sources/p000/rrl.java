package p000;

/* renamed from: rrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rrl {

    /* renamed from: a */
    public final int f43550a;

    public rrl(int i) {
        this.f43550a = i;
    }

    /* renamed from: a */
    public static rrl m34298a(Integer num) {
        if (num == null) {
            return new rrl(0);
        }
        int intValue = num.intValue();
        if (intValue == 1 || intValue == 2) {
            return new rrl(num.intValue());
        }
        return new rrl(0);
    }
}
