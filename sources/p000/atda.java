package p000;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: atda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atda {

    /* renamed from: a */
    public final askf f90100a;

    /* renamed from: b */
    public String f90101b;

    /* renamed from: c */
    public final String f90102c;

    /* renamed from: d */
    public String f90103d;

    /* renamed from: e */
    public String f90104e;

    /* renamed from: f */
    public byte[] f90105f;

    /* renamed from: g */
    public byte[] f90106g;

    /* renamed from: h */
    public long f90107h;

    /* renamed from: i */
    public atcv f90108i;

    /* renamed from: j */
    public byda f90109j;

    /* renamed from: k */
    public String f90110k;

    public atda(askf askf, String str, String str2, String str3) {
        this.f90100a = askf;
        this.f90102c = str;
        this.f90101b = str2;
        this.f90103d = str3;
    }

    /* renamed from: a */
    private static final byda m75572a(byda byda) {
        return byda == null ? byda.f165750e : byda;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atda) {
            atda atda = (atda) obj;
            return this.f90107h == atda.f90107h && Objects.equals(this.f90100a, atda.f90100a) && Objects.equals(this.f90101b, atda.f90101b) && Objects.equals(this.f90102c, atda.f90102c) && Objects.equals(this.f90103d, atda.f90103d) && Objects.equals(this.f90104e, atda.f90104e) && Arrays.equals(this.f90105f, atda.f90105f) && Arrays.equals(this.f90106g, atda.f90106g) && Objects.equals(this.f90108i, atda.f90108i) && m75572a(this.f90109j).equals(m75572a(atda.f90109j)) && Objects.equals(this.f90110k, atda.f90110k);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f90100a, this.f90101b, this.f90102c, this.f90103d, this.f90104e, Integer.valueOf(Arrays.hashCode(this.f90105f)), Integer.valueOf(Arrays.hashCode(this.f90106g)), Long.valueOf(this.f90107h), this.f90108i, Integer.valueOf(Arrays.hashCode(m75572a(this.f90109j).serializeToBytes())), this.f90110k);
    }

    public final String toString() {
        String str;
        bmxt a = bmxu.m108564a("Token");
        a.mo66885a("requestContext", this.f90100a);
        a.mo66885a("bundleType", this.f90101b);
        a.mo66885a("clientTokenId", this.f90102c);
        a.mo66885a("bundleState", this.f90103d);
        a.mo66885a("sessionId", this.f90104e);
        String str2 = null;
        if (this.f90105f != null) {
            str = "**redacted**";
        } else {
            str = null;
        }
        a.mo66885a("encryptionParameters", str);
        a.mo66885a("bundleHandle", this.f90106g);
        a.mo66884a("pollTimestamp", this.f90107h);
        atcv atcv = this.f90108i;
        if (atcv != null) {
            str2 = atcv.getClass().getSimpleName();
        }
        a.mo66885a("bundle", str2);
        a.mo66885a("bundleInfo", this.f90109j);
        a.mo66885a("newBundleType", this.f90110k);
        return a.toString();
    }

    public atda(askf askf, String str, String str2, String str3, String str4, byte[] bArr, byte[] bArr2, long j, atcv atcv, byda byda, String str5) {
        this.f90100a = askf;
        this.f90101b = str;
        this.f90102c = str2;
        this.f90103d = str3;
        this.f90104e = str4;
        this.f90105f = bArr;
        this.f90106g = bArr2;
        this.f90107h = j;
        this.f90108i = atcv;
        this.f90109j = byda;
        this.f90110k = str5;
    }
}
