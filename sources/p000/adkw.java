package p000;

/* renamed from: adkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adkw extends adkt {

    /* renamed from: a */
    public final String f62088a;

    /* renamed from: b */
    public final int f62089b;

    /* renamed from: c */
    public final int f62090c;

    /* renamed from: d */
    public final adkz f62091d;

    /* renamed from: e */
    public final boolean f62092e;

    /* renamed from: f */
    public final String f62093f;

    /* renamed from: g */
    public final String f62094g;

    /* renamed from: h */
    public final boolean f62095h;

    public adkw(String str, int i, int i2, adkz adkz, boolean z, String str2, String str3, boolean z2) {
        this.f62088a = str;
        this.f62089b = i;
        this.f62090c = i2;
        this.f62091d = adkz;
        this.f62092e = z;
        this.f62093f = str2;
        this.f62094g = str3;
        this.f62095h = z2;
    }

    /* renamed from: a */
    public final String mo33616a() {
        return this.f62088a;
    }

    /* renamed from: b */
    public final int mo33617b() {
        return this.f62089b;
    }

    /* renamed from: c */
    public final int mo33618c() {
        return this.f62090c;
    }

    /* renamed from: d */
    public final adkz mo33619d() {
        return this.f62091d;
    }

    /* renamed from: e */
    public final boolean mo33620e() {
        return this.f62092e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adkt)) {
            return false;
        }
        adkt adkt = (adkt) obj;
        return this.f62088a.equals(adkt.mo33616a()) && this.f62089b == adkt.mo33617b() && this.f62090c == adkt.mo33618c() && this.f62091d.equals(adkt.mo33619d()) && this.f62092e == adkt.mo33620e() && ((str = this.f62093f) == null ? adkt.mo33621f() == null : str.equals(adkt.mo33621f())) && ((str2 = this.f62094g) == null ? adkt.mo33622g() == null : str2.equals(adkt.mo33622g())) && this.f62095h == adkt.mo33623h();
    }

    /* renamed from: f */
    public final String mo33621f() {
        return this.f62093f;
    }

    /* renamed from: g */
    public final String mo33622g() {
        return this.f62094g;
    }

    /* renamed from: h */
    public final boolean mo33623h() {
        return this.f62095h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((((((this.f62088a.hashCode() ^ 1000003) * 1000003) ^ this.f62089b) * 1000003) ^ this.f62090c) * 1000003) ^ this.f62091d.hashCode()) * 1000003;
        int i3 = 1237;
        if (!this.f62092e) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = (hashCode ^ i) * 1000003;
        String str = this.f62093f;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i4 ^ i2) * 1000003;
        String str2 = this.f62094g;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        int i7 = (i6 ^ i5) * 1000003;
        if (this.f62095h) {
            i3 = 1231;
        }
        return i7 ^ i3;
    }

    public final String toString() {
        String str = this.f62088a;
        int i = this.f62089b;
        int i2 = this.f62090c;
        String valueOf = String.valueOf(this.f62091d);
        boolean z = this.f62092e;
        String str2 = this.f62093f;
        String str3 = this.f62094g;
        boolean z2 = this.f62095h;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 162 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("AppInfoRequest{packageName=");
        sb.append(str);
        sb.append(", versionCode=");
        sb.append(i);
        sb.append(", derivedId=");
        sb.append(i2);
        sb.append(", eventLog=");
        sb.append(valueOf);
        sb.append(", populateRoutes=");
        sb.append(z);
        sb.append(", splitName=");
        sb.append(str2);
        sb.append(", activityName=");
        sb.append(str3);
        sb.append(", addSyntheticRoutes=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
