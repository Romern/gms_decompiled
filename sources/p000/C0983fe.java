package p000;

/* renamed from: fe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0983fe {

    /* renamed from: a */
    public int f16357a = -1;

    /* renamed from: b */
    public int f16358b = -1;

    /* renamed from: c */
    public int f16359c = 0;

    /* renamed from: d */
    public float f16360d;

    /* renamed from: e */
    public final float[] f16361e = new float[6];

    /* renamed from: f */
    C0977ez[] f16362f = new C0977ez[8];

    /* renamed from: g */
    int f16363g = 0;

    /* renamed from: h */
    public int f16364h;

    public C0983fe(int i) {
        this.f16364h = i;
    }

    /* renamed from: a */
    public final void mo10744a() {
        this.f16364h = 5;
        this.f16359c = 0;
        this.f16357a = -1;
        this.f16358b = -1;
        this.f16360d = 0.0f;
        this.f16363g = 0;
    }

    public final String toString() {
        return "null";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10745a(C0977ez ezVar) {
        int i = 0;
        int i2 = 0;
        while (i2 < this.f16363g) {
            if (this.f16362f[i2] != ezVar) {
                i2++;
            } else {
                while (true) {
                    int i3 = this.f16363g;
                    if (i < (i3 - i2) - 1) {
                        C0977ez[] ezVarArr = this.f16362f;
                        int i4 = i2 + i;
                        ezVarArr[i4] = ezVarArr[i4 + 1];
                        i++;
                    } else {
                        this.f16363g = i3 - 1;
                        return;
                    }
                }
            }
        }
    }
}
