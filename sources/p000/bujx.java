package p000;

/* renamed from: bujx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bujx extends buat {

    /* renamed from: a */
    final /* synthetic */ bujy f154052a;

    /* renamed from: b */
    private long[] f154053b;

    /* renamed from: c */
    private long[] f154054c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bujx(bujy bujy) {
        super(null);
        this.f154052a = bujy;
    }

    /* renamed from: a */
    public final void mo61442a() {
        bujy bujy = this.f154052a;
        this.f154053b = bujy.f154055a;
        this.f154054c = bujy.f154056b;
    }

    /* renamed from: b */
    public final void mo61445b() {
        this.f154053b = null;
        this.f154054c = null;
    }

    /* renamed from: b */
    public final void mo61446b(int i) {
    }

    /* renamed from: a */
    public final void mo61443a(int i) {
        bujy bujy = this.f154052a;
        bujy.f154055a = new long[i];
        bujy.f154056b = new long[i];
    }

    /* renamed from: a */
    public final void mo61444a(int i, int i2) {
        bujy bujy = this.f154052a;
        bujy.f154055a[i2] = this.f154053b[i];
        bujy.f154056b[i2] = this.f154054c[i];
    }
}
