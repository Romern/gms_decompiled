package p000;

import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* renamed from: acyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyb {

    /* renamed from: a */
    private final Mac f61071a;

    public acyb() {
        this.f61071a = null;
    }

    /* renamed from: a */
    public final void mo33233a(SecretKey secretKey) {
        this.f61071a.init(secretKey);
    }

    /* renamed from: b */
    public final byte[] mo33235b(byte[] bArr) {
        return this.f61071a.doFinal(bArr);
    }

    public acyb(Mac mac) {
        this.f61071a = mac;
    }

    /* renamed from: a */
    public final void mo33234a(byte[] bArr) {
        this.f61071a.update(bArr);
    }
}
