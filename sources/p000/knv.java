package p000;

/* renamed from: knv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class knv extends kny {

    /* renamed from: b */
    private final int f24547b;

    public knv(int i, int i2) {
        super(i);
        this.f24547b = i2;
    }

    /* renamed from: b */
    public final boolean mo14729b(kom kom) {
        int i = kom.f24604c;
        int i2 = this.f24547b;
        return (i2 & 15) == (i & 15) && (i2 & 4080) == (i & 4080);
    }
}
