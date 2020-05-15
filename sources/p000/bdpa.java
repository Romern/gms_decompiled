package p000;

/* renamed from: bdpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdpa {

    /* renamed from: a */
    public Boolean f106183a;

    /* renamed from: b */
    public bdqa f106184b;

    /* renamed from: c */
    public Integer f106185c;

    /* renamed from: d */
    public bmxv f106186d;

    public bdpa() {
    }

    /* renamed from: a */
    public final void mo58257a(float f) {
        boolean z = false;
        if (f > 0.0f && f <= 1.0f) {
            z = true;
        }
        bmxy.m108601b(z, "Sampling Probability shall be > 0 and <= 1");
        this.f106184b = bdqa.m91274a(f);
    }

    public bdpa(byte[] bArr) {
        this.f106186d = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo58258a(int i) {
        this.f106185c = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo58259a(boolean z) {
        this.f106183a = Boolean.valueOf(z);
    }
}
