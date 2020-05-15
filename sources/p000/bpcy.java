package p000;

/* renamed from: bpcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpcy implements bxvp {
    DOMAIN_UNSPECIFIED(0),
    GEARHEAD(1),
    CONNECTIVITY(2),
    FRX(3),
    CAR_SERVICE(4);
    

    /* renamed from: f */
    public final int f135894f;

    private bpcy(int i) {
        this.f135894f = i;
    }

    /* renamed from: a */
    public static bpcy m111790a(int i) {
        if (i == 0) {
            return DOMAIN_UNSPECIFIED;
        }
        if (i == 1) {
            return GEARHEAD;
        }
        if (i == 2) {
            return CONNECTIVITY;
        }
        if (i == 3) {
            return FRX;
        }
        if (i != 4) {
            return null;
        }
        return CAR_SERVICE;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f135894f;
    }

    public final String toString() {
        return Integer.toString(this.f135894f);
    }
}
