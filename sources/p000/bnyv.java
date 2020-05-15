package p000;

import java.util.zip.Checksum;

/* renamed from: bnyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnyv extends bnyo {

    /* renamed from: a */
    private final Checksum f132385a;

    public bnyv(Checksum checksum) {
        bmxy.m108581a(checksum);
        this.f132385a = checksum;
    }

    /* renamed from: a */
    public final bnzb mo68729a() {
        return bnzb.m110868a((int) this.f132385a.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68710a(byte b) {
        this.f132385a.update(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68715a(byte[] bArr, int i, int i2) {
        this.f132385a.update(bArr, i, i2);
    }
}
