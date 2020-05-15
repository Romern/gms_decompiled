package p000;

import java.util.Arrays;

/* renamed from: xjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xjm {

    /* renamed from: a */
    public final byte[] f52426a;

    /* renamed from: b */
    public final byte[] f52427b;

    /* renamed from: c */
    public final byte[] f52428c;

    /* renamed from: d */
    public final byte[] f52429d;

    /* renamed from: e */
    public final bmxv f52430e;

    /* renamed from: f */
    public final String f52431f;

    public xjm(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, bmxv bmxv, String str) {
        this.f52426a = (byte[]) sdo.m34959a(bArr);
        this.f52427b = (byte[]) sdo.m34959a(bArr2);
        this.f52428c = (byte[]) sdo.m34959a(bArr3);
        this.f52429d = (byte[]) sdo.m34959a(bArr4);
        sdo.m34959a(bmxv);
        this.f52430e = bmxv;
        this.f52431f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xjm) {
            xjm xjm = (xjm) obj;
            return Arrays.equals(this.f52426a, xjm.f52426a) && Arrays.equals(this.f52427b, xjm.f52427b) && Arrays.equals(this.f52428c, xjm.f52428c) && Arrays.equals(this.f52429d, xjm.f52429d) && sdg.m34949a(this.f52430e, xjm.f52430e) && sdg.m34949a(this.f52431f, xjm.f52431f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f52426a)), Integer.valueOf(Arrays.hashCode(this.f52427b)), Integer.valueOf(Arrays.hashCode(this.f52428c)), Integer.valueOf(Arrays.hashCode(this.f52429d)), this.f52430e, this.f52431f});
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[6];
        objArr[0] = srv.m36164d(this.f52426a);
        objArr[1] = srv.m36164d(this.f52427b);
        objArr[2] = srv.m36164d(this.f52428c);
        objArr[3] = srv.m36164d(this.f52429d);
        if (this.f52430e.mo66813a()) {
            str = ((xjx) this.f52430e.mo66814b()).toString();
        } else {
            str = "No CredentialIdentifier present";
        }
        objArr[4] = str;
        String str2 = this.f52431f;
        if (str2 == null) {
            str2 = "none";
        }
        objArr[5] = str2;
        return String.format("{\n  nonce             = %s,\n  client_eid        = %s,\n  authenticator_eid = %s,\n  session_pre_key       = %s,\n  credential_identifier = %s,\n   account           = %s,\n}", objArr);
    }
}
