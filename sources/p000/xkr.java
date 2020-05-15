package p000;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;

/* renamed from: xkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xkr {

    /* renamed from: a */
    public PublicKeyCredentialDescriptor f52578a;

    /* renamed from: b */
    public xls f52579b;

    /* renamed from: c */
    public Integer f52580c;

    /* renamed from: d */
    private byte[] f52581d;

    /* renamed from: e */
    private byte[] f52582e;

    /* renamed from: a */
    public final xks mo29871a() {
        boolean z;
        boolean z2 = true;
        if (this.f52581d != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (this.f52582e == null) {
            z2 = false;
        }
        sdo.m34970a(z2);
        return new xks(this.f52578a, this.f52581d, this.f52582e, this.f52579b, this.f52580c);
    }

    /* renamed from: b */
    public final void mo29873b(byte[] bArr) {
        sdo.m34974b(bArr != null);
        this.f52582e = bArr;
    }

    /* renamed from: a */
    public final void mo29872a(byte[] bArr) {
        sdo.m34974b(bArr != null);
        this.f52581d = bArr;
    }
}
