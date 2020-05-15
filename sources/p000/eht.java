package p000;

/* renamed from: eht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eht implements ehb {

    /* renamed from: a */
    public final String f15013a;

    /* renamed from: b */
    public final bqmb f15014b;

    /* renamed from: c */
    public final byte[] f15015c;

    /* renamed from: d */
    private final String f15016d;

    /* renamed from: e */
    private final byte[] f15017e;

    /* renamed from: f */
    private final ehp f15018f;

    /* renamed from: g */
    private final long f15019g;

    /* renamed from: h */
    private final long f15020h;

    /* renamed from: i */
    private final int f15021i;

    public eht(String str, String str2, byte[] bArr, bqmb bqmb, ehp ehp, int i, byte[] bArr2, long j, long j2) {
        this.f15017e = bArr;
        this.f15013a = str2;
        this.f15016d = str;
        this.f15014b = bqmb;
        this.f15018f = ehp;
        this.f15021i = i;
        this.f15015c = bArr2;
        this.f15019g = j;
        this.f15020h = j2;
    }

    /* renamed from: a */
    public final String mo10125a() {
        return this.f15016d;
    }

    /* renamed from: b */
    public final byte[] mo10126b() {
        return this.f15017e;
    }

    /* renamed from: c */
    public final byte[] mo10127c() {
        return this.f15015c;
    }

    /* renamed from: d */
    public final bqmb mo10128d() {
        return this.f15014b;
    }

    /* renamed from: e */
    public final String mo10129e() {
        return this.f15013a;
    }

    /* renamed from: f */
    public final long mo10130f() {
        return this.f15019g;
    }

    /* renamed from: g */
    public final long mo10131g() {
        return this.f15020h;
    }

    /* renamed from: h */
    public final ehp mo10132h() {
        return this.f15018f;
    }

    /* renamed from: i */
    public final int mo10133i() {
        return this.f15021i;
    }

    public final String toString() {
        String str = this.f15016d;
        String name = this.f15014b.name();
        String str2 = this.f15013a;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(name).length() + String.valueOf(str2).length());
        sb.append("keyname=");
        sb.append(str);
        sb.append(",keyType=");
        sb.append(name);
        sb.append(",account=");
        sb.append(str2);
        return sb.toString();
    }
}
