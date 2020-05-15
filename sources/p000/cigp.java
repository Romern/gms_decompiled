package p000;

/* renamed from: cigp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cigp implements cifi {

    /* renamed from: a */
    public final cipu f190154a;

    /* renamed from: b */
    private int f190155b;

    /* renamed from: c */
    private int f190156c;

    public cigp(cipu cipu, int i) {
        this.f190154a = cipu;
        this.f190155b = i;
    }

    /* renamed from: a */
    public final int mo85751a() {
        return this.f190155b;
    }

    /* renamed from: b */
    public final int mo85754b() {
        return this.f190156c;
    }

    /* renamed from: a */
    public final void mo85752a(byte b) {
        this.f190154a.mo86316h((int) b);
        this.f190155b--;
        this.f190156c++;
    }

    /* renamed from: a */
    public final void mo85753a(byte[] bArr, int i, int i2) {
        this.f190154a.mo86294b(bArr, i, i2);
        this.f190155b -= i2;
        this.f190156c += i2;
    }
}
