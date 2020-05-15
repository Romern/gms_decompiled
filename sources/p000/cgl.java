package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: cgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cgl implements cdg {

    /* renamed from: b */
    private static final cqy f6805b = new cqy(50);

    /* renamed from: c */
    private final cgr f6806c;

    /* renamed from: d */
    private final cdg f6807d;

    /* renamed from: e */
    private final cdg f6808e;

    /* renamed from: f */
    private final int f6809f;

    /* renamed from: g */
    private final int f6810g;

    /* renamed from: h */
    private final Class f6811h;

    /* renamed from: i */
    private final cdk f6812i;

    /* renamed from: j */
    private final cdo f6813j;

    public cgl(cgr cgr, cdg cdg, cdg cdg2, int i, int i2, cdo cdo, Class cls, cdk cdk) {
        this.f6806c = cgr;
        this.f6807d = cdg;
        this.f6808e = cdg2;
        this.f6809f = i;
        this.f6810g = i2;
        this.f6813j = cdo;
        this.f6811h = cls;
        this.f6812i = cdk;
    }

    /* renamed from: a */
    public final void mo3732a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f6806c.mo3871a(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f6809f).putInt(this.f6810g).array();
        this.f6808e.mo3732a(messageDigest);
        this.f6807d.mo3732a(messageDigest);
        messageDigest.update(bArr);
        cdo cdo = this.f6813j;
        if (cdo != null) {
            cdo.mo3732a(messageDigest);
        }
        this.f6812i.mo3732a(messageDigest);
        byte[] bArr2 = (byte[]) f6805b.mo8173b(this.f6811h);
        if (bArr2 == null) {
            bArr2 = this.f6811h.getName().getBytes(f6570a);
            f6805b.mo8174b(this.f6811h, bArr2);
        }
        messageDigest.update(bArr2);
        this.f6806c.mo3874a(bArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cgl) {
            cgl cgl = (cgl) obj;
            if (this.f6810g != cgl.f6810g || this.f6809f != cgl.f6809f || !crd.m7395a(this.f6813j, cgl.f6813j) || !this.f6811h.equals(cgl.f6811h) || !this.f6807d.equals(cgl.f6807d) || !this.f6808e.equals(cgl.f6808e) || !this.f6812i.equals(cgl.f6812i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f6807d.hashCode() * 31) + this.f6808e.hashCode()) * 31) + this.f6809f) * 31) + this.f6810g;
        cdo cdo = this.f6813j;
        if (cdo != null) {
            hashCode = (hashCode * 31) + cdo.hashCode();
        }
        return (((hashCode * 31) + this.f6811h.hashCode()) * 31) + this.f6812i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6807d);
        String valueOf2 = String.valueOf(this.f6808e);
        int i = this.f6809f;
        int i2 = this.f6810g;
        String valueOf3 = String.valueOf(this.f6811h);
        String valueOf4 = String.valueOf(this.f6813j);
        String valueOf5 = String.valueOf(this.f6812i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 131 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(valueOf);
        sb.append(", signature=");
        sb.append(valueOf2);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", decodedResourceClass=");
        sb.append(valueOf3);
        sb.append(", transformation='");
        sb.append(valueOf4);
        sb.append("', options=");
        sb.append(valueOf5);
        sb.append('}');
        return sb.toString();
    }
}
