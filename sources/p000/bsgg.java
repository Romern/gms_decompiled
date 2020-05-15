package p000;

/* renamed from: bsgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgg {

    /* renamed from: a */
    public long f144526a = 0;

    /* renamed from: a */
    public final bsgh mo70527a() {
        boolean z;
        if (this.f144526a != 0) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122542a(z, "Cannot init SeedBox with zero master seed");
        return new bsgh(this);
    }

    /* renamed from: a */
    public final void mo70528a(long j) {
        this.f144526a = j ^ this.f144526a;
    }
}
