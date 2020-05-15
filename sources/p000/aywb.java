package p000;

import java.util.Arrays;

/* renamed from: aywb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aywb extends aywd {

    /* renamed from: a */
    public final String f98596a;

    /* renamed from: b */
    public final bxxc f98597b;

    /* renamed from: c */
    public final boki f98598c;

    /* renamed from: d */
    public final Integer f98599d;

    /* renamed from: e */
    public final Long f98600e;

    /* renamed from: f */
    public final Long f98601f;

    /* renamed from: g */
    public final cagz f98602g;

    /* renamed from: h */
    public final int[] f98603h;

    public aywb(String str, bxxc bxxc, boki boki, Integer num, Long l, Long l2, cagz cagz, int[] iArr) {
        this.f98596a = str;
        this.f98597b = bxxc;
        this.f98598c = boki;
        this.f98599d = num;
        this.f98600e = l;
        this.f98601f = l2;
        this.f98602g = cagz;
        this.f98603h = iArr;
    }

    /* renamed from: a */
    public final String mo54461a() {
        return this.f98596a;
    }

    /* renamed from: b */
    public final bxxc mo54462b() {
        return this.f98597b;
    }

    /* renamed from: c */
    public final boki mo54463c() {
        return this.f98598c;
    }

    /* renamed from: d */
    public final Integer mo54464d() {
        return this.f98599d;
    }

    /* renamed from: e */
    public final Long mo54465e() {
        return this.f98600e;
    }

    public final boolean equals(Object obj) {
        boki boki;
        Integer num;
        Long l;
        Long l2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aywd)) {
            return false;
        }
        aywd aywd = (aywd) obj;
        if (this.f98596a.equals(aywd.mo54461a()) && this.f98597b.equals(aywd.mo54462b()) && ((boki = this.f98598c) == null ? aywd.mo54463c() == null : boki.equals(aywd.mo54463c())) && ((num = this.f98599d) == null ? aywd.mo54464d() == null : num.equals(aywd.mo54464d())) && ((l = this.f98600e) == null ? aywd.mo54465e() == null : l.equals(aywd.mo54465e())) && ((l2 = this.f98601f) == null ? aywd.mo54467f() == null : l2.equals(aywd.mo54467f())) && this.f98602g.equals(aywd.mo54468g())) {
            if (Arrays.equals(this.f98603h, aywd instanceof aywb ? ((aywb) aywd).f98603h : aywd.mo54469h())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Long mo54467f() {
        return this.f98601f;
    }

    /* renamed from: g */
    public final cagz mo54468g() {
        return this.f98602g;
    }

    /* renamed from: h */
    public final int[] mo54469h() {
        return this.f98603h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((this.f98596a.hashCode() ^ 1000003) * 1000003) ^ this.f98597b.hashCode()) * 1000003;
        boki boki = this.f98598c;
        int i4 = 0;
        if (boki != null) {
            i = boki.f164758ag;
            if (i == 0) {
                i = bxxm.f165037a.mo74228a(boki).mo74216a(boki);
                boki.f164758ag = i;
            }
        } else {
            i = 0;
        }
        int i5 = (hashCode ^ i) * 1000003;
        Integer num = this.f98599d;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 ^ i2) * 1000003;
        Long l = this.f98600e;
        if (l != null) {
            i3 = l.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 ^ i3) * 1000003;
        Long l2 = this.f98601f;
        if (l2 != null) {
            i4 = l2.hashCode();
        }
        return ((((i7 ^ i4) * 1000003) ^ this.f98602g.hashCode()) * 1000003) ^ Arrays.hashCode(this.f98603h);
    }

    public final String toString() {
        String str = this.f98596a;
        String valueOf = String.valueOf(this.f98597b);
        String valueOf2 = String.valueOf(this.f98598c);
        String valueOf3 = String.valueOf(this.f98599d);
        String valueOf4 = String.valueOf(this.f98600e);
        String valueOf5 = String.valueOf(this.f98601f);
        String valueOf6 = String.valueOf(this.f98602g);
        String arrays = Arrays.toString(this.f98603h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 114 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf6).length() + String.valueOf(arrays).length());
        sb.append("ClearcutData{logSource=");
        sb.append(str);
        sb.append(", message=");
        sb.append(valueOf);
        sb.append(", visualElements=");
        sb.append(valueOf2);
        sb.append(", eventCode=");
        sb.append(valueOf3);
        sb.append(", wallTime=");
        sb.append(valueOf4);
        sb.append(", elapsedTime=");
        sb.append(valueOf5);
        sb.append(", qosTier=");
        sb.append(valueOf6);
        sb.append(", experimentIds=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
