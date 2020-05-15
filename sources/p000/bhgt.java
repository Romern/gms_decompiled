package p000;

/* renamed from: bhgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhgt extends bhhu {

    /* renamed from: a */
    final /* synthetic */ int f118624a;

    /* renamed from: b */
    final /* synthetic */ bhhb f118625b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhgt(bhhb bhhb, int i, int i2) {
        super(i);
        this.f118625b = bhhb;
        this.f118624a = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo55a(acj acj, int[] iArr) {
        if (this.f118624a == 0) {
            iArr[0] = this.f118625b.f118642aa.getWidth();
            iArr[1] = this.f118625b.f118642aa.getWidth();
            return;
        }
        iArr[0] = this.f118625b.f118642aa.getHeight();
        iArr[1] = this.f118625b.f118642aa.getHeight();
    }
}
