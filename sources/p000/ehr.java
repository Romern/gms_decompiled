package p000;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

/* renamed from: ehr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ehr implements ehb {

    /* renamed from: a */
    public final byte[] f14996a;

    /* renamed from: b */
    public final byte[] f14997b;

    /* renamed from: c */
    public final PrivateKey f14998c;

    /* renamed from: d */
    private final String f14999d;

    /* renamed from: e */
    private final String f15000e;

    /* renamed from: f */
    private final byte[] f15001f;

    /* renamed from: g */
    private final bqmb f15002g;

    /* renamed from: h */
    private final ehp f15003h;

    /* renamed from: i */
    private final PublicKey f15004i;

    /* renamed from: j */
    private final long f15005j;

    /* renamed from: k */
    private final long f15006k;

    /* renamed from: l */
    private final int f15007l;

    public ehr(String str, String str2, byte[] bArr, bqmb bqmb, ehp ehp, int i, KeyPair keyPair, long j, long j2) {
        this.f15001f = (byte[]) bmxy.m108581a(bArr);
        bmxy.m108581a(str2);
        this.f15000e = str2;
        this.f14999d = str;
        this.f15002g = bqmb;
        this.f15003h = ehp;
        this.f15007l = i;
        bmxy.m108581a(keyPair);
        PublicKey publicKey = keyPair.getPublic();
        this.f15004i = publicKey;
        this.f14996a = ehv.m10472b(publicKey);
        PrivateKey privateKey = keyPair.getPrivate();
        this.f14998c = privateKey;
        this.f14997b = ehv.m10464a(privateKey);
        this.f15005j = j;
        this.f15006k = j2;
    }

    /* renamed from: a */
    public final String mo10125a() {
        return this.f14999d;
    }

    /* renamed from: b */
    public final byte[] mo10126b() {
        return this.f15001f;
    }

    /* renamed from: c */
    public final byte[] mo10127c() {
        return this.f14996a;
    }

    /* renamed from: d */
    public final bqmb mo10128d() {
        return this.f15002g;
    }

    /* renamed from: e */
    public final String mo10129e() {
        return this.f15000e;
    }

    /* renamed from: f */
    public final long mo10130f() {
        return this.f15005j;
    }

    /* renamed from: g */
    public final long mo10131g() {
        return this.f15006k;
    }

    /* renamed from: h */
    public final ehp mo10132h() {
        return this.f15003h;
    }

    /* renamed from: i */
    public final int mo10133i() {
        return this.f15007l;
    }

    public final String toString() {
        String str = this.f14999d;
        String name = this.f15002g.name();
        String str2 = this.f15000e;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(name).length() + str2.length());
        sb.append("keyname=");
        sb.append(str);
        sb.append(",keyType=");
        sb.append(name);
        sb.append(",account=");
        sb.append(str2);
        return sb.toString();
    }
}
