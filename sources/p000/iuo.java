package p000;

import javax.crypto.SecretKey;

/* renamed from: iuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iuo implements bqfp {

    /* renamed from: a */
    final /* synthetic */ byti f21810a;

    /* renamed from: b */
    final /* synthetic */ byte[] f21811b;

    /* renamed from: c */
    final /* synthetic */ bqgy f21812c;

    public iuo(byti byti, byte[] bArr, bqgy bqgy) {
        this.f21810a = byti;
        this.f21811b = bArr;
        this.f21812c = bqgy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        SecretKey secretKey = (SecretKey) obj;
        try {
            iuq.f21814a.mo25414c("Decrypting challenge with symmetric key...", new Object[0]);
            this.f21812c.mo69138b(iuq.m16176a(this.f21810a, secretKey, this.f21811b));
        } catch (iuk e) {
            this.f21812c.mo69136a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f21812c.mo69136a(th);
    }
}
