package p000;

import javax.crypto.Mac;

/* renamed from: bnzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnzq extends bnyo {

    /* renamed from: a */
    private final Mac f132410a;

    /* renamed from: b */
    private boolean f132411b;

    public bnzq(Mac mac) {
        this.f132410a = mac;
    }

    /* renamed from: b */
    private final void m110917b() {
        bmxy.m108601b(!this.f132411b, "Cannot re-use a Hasher after calling hash() on it");
    }

    /* renamed from: a */
    public final bnzb mo68729a() {
        m110917b();
        this.f132411b = true;
        return bnzb.m110872b(this.f132410a.doFinal());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68710a(byte b) {
        m110917b();
        this.f132410a.update(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68714a(byte[] bArr) {
        m110917b();
        this.f132410a.update(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68715a(byte[] bArr, int i, int i2) {
        m110917b();
        this.f132410a.update(bArr, i, i2);
    }
}
