package p000;

/* renamed from: bpde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpde implements bxvp {
    UNKNOWN_GEAR(-1),
    GEAR_NEUTRAL(0),
    GEAR_1(1),
    GEAR_2(2),
    GEAR_3(3),
    GEAR_4(4),
    GEAR_5(5),
    GEAR_6(6),
    GEAR_DRIVE(10),
    GEAR_PARK(11),
    GEAR_REVERSE(12);
    

    /* renamed from: l */
    public final int f135928l;

    private bpde(int i) {
        this.f135928l = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f135928l;
    }

    public final String toString() {
        return Integer.toString(this.f135928l);
    }
}
