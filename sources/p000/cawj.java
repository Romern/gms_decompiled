package p000;

/* renamed from: cawj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawj {

    /* renamed from: a */
    public final cipu f176254a;

    public cawj(cipu cipu) {
        this.f176254a = cipu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo75022a(int i, int i2) {
        if (i >= i2) {
            this.f176254a.mo86316h(i2);
            int i3 = i - i2;
            while (i3 >= 128) {
                this.f176254a.mo86316h(128 | (i3 & 127));
                i3 >>>= 7;
            }
            this.f176254a.mo86316h(i3);
            return;
        }
        this.f176254a.mo86316h(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo75023a(cipx cipx) {
        mo75022a(cipx.mo86345e(), 127);
        this.f176254a.mo86292b(cipx);
    }
}
