package p000;

/* renamed from: buac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buac extends buat {

    /* renamed from: a */
    final /* synthetic */ buad f153141a;

    /* renamed from: b */
    private Object[] f153142b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buac(buad buad, buat buat) {
        super(buat);
        this.f153141a = buad;
    }

    /* renamed from: a */
    public final void mo61442a() {
        this.f153142b = this.f153141a.f153144b;
        super.mo61442a();
    }

    /* renamed from: b */
    public final void mo61445b() {
        this.f153142b = null;
        super.mo61445b();
    }

    /* renamed from: a */
    public final void mo61443a(int i) {
        this.f153141a.f153144b = new Object[i];
        super.mo61443a(i);
    }

    /* renamed from: b */
    public final void mo61446b(int i) {
        this.f153141a.f153144b[i] = null;
    }

    /* renamed from: a */
    public final void mo61444a(int i, int i2) {
        this.f153141a.f153144b[i2] = this.f153142b[i];
        super.mo61444a(i, i2);
    }
}
