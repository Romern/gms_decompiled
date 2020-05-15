package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: cga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cga implements cdg {

    /* renamed from: b */
    private final Object f6763b;

    /* renamed from: c */
    private final int f6764c;

    /* renamed from: d */
    private final int f6765d;

    /* renamed from: e */
    private final Class f6766e;

    /* renamed from: f */
    private final Class f6767f;

    /* renamed from: g */
    private final cdg f6768g;

    /* renamed from: h */
    private final Map f6769h;

    /* renamed from: i */
    private final cdk f6770i;

    /* renamed from: j */
    private int f6771j;

    public cga(Object obj, cdg cdg, int i, int i2, Map map, Class cls, Class cls2, cdk cdk) {
        crb.m7382a(obj);
        this.f6763b = obj;
        crb.m7383a(cdg, "Signature must not be null");
        this.f6768g = cdg;
        this.f6764c = i;
        this.f6765d = i2;
        crb.m7382a(map);
        this.f6769h = map;
        crb.m7383a(cls, "Resource class must not be null");
        this.f6766e = cls;
        crb.m7383a(cls2, "Transcode class must not be null");
        this.f6767f = cls2;
        crb.m7382a(cdk);
        this.f6770i = cdk;
    }

    /* renamed from: a */
    public final void mo3732a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cga) {
            cga cga = (cga) obj;
            if (!this.f6763b.equals(cga.f6763b) || !this.f6768g.equals(cga.f6768g) || this.f6765d != cga.f6765d || this.f6764c != cga.f6764c || !this.f6769h.equals(cga.f6769h) || !this.f6766e.equals(cga.f6766e) || !this.f6767f.equals(cga.f6767f) || !this.f6770i.equals(cga.f6770i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f6771j;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f6763b.hashCode();
        this.f6771j = hashCode;
        int hashCode2 = (((((hashCode * 31) + this.f6768g.hashCode()) * 31) + this.f6764c) * 31) + this.f6765d;
        this.f6771j = hashCode2;
        int hashCode3 = (hashCode2 * 31) + this.f6769h.hashCode();
        this.f6771j = hashCode3;
        int hashCode4 = (hashCode3 * 31) + this.f6766e.hashCode();
        this.f6771j = hashCode4;
        int hashCode5 = (hashCode4 * 31) + this.f6767f.hashCode();
        this.f6771j = hashCode5;
        int hashCode6 = (hashCode5 * 31) + this.f6770i.hashCode();
        this.f6771j = hashCode6;
        return hashCode6;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6763b);
        int i = this.f6764c;
        int i2 = this.f6765d;
        String valueOf2 = String.valueOf(this.f6766e);
        String valueOf3 = String.valueOf(this.f6767f);
        String valueOf4 = String.valueOf(this.f6768g);
        int i3 = this.f6771j;
        String valueOf5 = String.valueOf(this.f6769h);
        String valueOf6 = String.valueOf(this.f6770i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + MfiClientException.TYPE_MFICLIENT_NOT_FOUND + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length());
        sb.append("EngineKey{model=");
        sb.append(valueOf);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", resourceClass=");
        sb.append(valueOf2);
        sb.append(", transcodeClass=");
        sb.append(valueOf3);
        sb.append(", signature=");
        sb.append(valueOf4);
        sb.append(", hashCode=");
        sb.append(i3);
        sb.append(", transformations=");
        sb.append(valueOf5);
        sb.append(", options=");
        sb.append(valueOf6);
        sb.append('}');
        return sb.toString();
    }
}
