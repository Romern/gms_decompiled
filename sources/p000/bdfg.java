package p000;

/* renamed from: bdfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdfg extends bdhk {

    /* renamed from: a */
    public final bdmd f105441a;

    /* renamed from: b */
    public final bmxv f105442b;

    /* renamed from: c */
    public final bmxv f105443c;

    /* renamed from: d */
    public final bmxv f105444d;

    /* renamed from: e */
    public final bmxv f105445e;

    /* renamed from: f */
    private final cijl f105446f;

    /* renamed from: g */
    private final bmxv f105447g;

    /* renamed from: h */
    private final bmxv f105448h;

    /* renamed from: i */
    private final bmxv f105449i;

    /* renamed from: j */
    private final bmxv f105450j;

    /* renamed from: k */
    private final bmxv f105451k;

    /* renamed from: l */
    private final bmxv f105452l;

    public bdfg(cijl cijl, bmxv bmxv, bdmd bdmd, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4, bmxv bmxv5, bmxv bmxv6, bmxv bmxv7, bmxv bmxv8, bmxv bmxv9, bmxv bmxv10) {
        this.f105446f = cijl;
        this.f105447g = bmxv;
        this.f105441a = bdmd;
        this.f105442b = bmxv2;
        this.f105448h = bmxv3;
        this.f105443c = bmxv4;
        this.f105444d = bmxv5;
        this.f105449i = bmxv6;
        this.f105445e = bmxv7;
        this.f105450j = bmxv8;
        this.f105451k = bmxv9;
        this.f105452l = bmxv10;
    }

    /* renamed from: a */
    public final cijl mo57967a() {
        return this.f105446f;
    }

    /* renamed from: b */
    public final bmxv mo57968b() {
        return this.f105447g;
    }

    /* renamed from: c */
    public final bdmd mo57969c() {
        return this.f105441a;
    }

    /* renamed from: d */
    public final bmxv mo57970d() {
        return this.f105442b;
    }

    /* renamed from: e */
    public final bmxv mo57971e() {
        return this.f105448h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhk) {
            bdhk bdhk = (bdhk) obj;
            return this.f105446f.equals(bdhk.mo57967a()) && this.f105447g.equals(bdhk.mo57968b()) && this.f105441a.equals(bdhk.mo57969c()) && this.f105442b.equals(bdhk.mo57970d()) && this.f105448h.equals(bdhk.mo57971e()) && this.f105443c.equals(bdhk.mo57973f()) && this.f105444d.equals(bdhk.mo57974g()) && this.f105449i.equals(bdhk.mo57975h()) && this.f105445e.equals(bdhk.mo57977i()) && this.f105450j.equals(bdhk.mo57978j()) && this.f105451k.equals(bdhk.mo57979k()) && this.f105452l.equals(bdhk.mo57980l());
        }
    }

    /* renamed from: f */
    public final bmxv mo57973f() {
        return this.f105443c;
    }

    /* renamed from: g */
    public final bmxv mo57974g() {
        return this.f105444d;
    }

    /* renamed from: h */
    public final bmxv mo57975h() {
        return this.f105449i;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.f105446f.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.f105441a.hashCode()) * 1000003) ^ this.f105442b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f105443c.hashCode()) * 1000003) ^ this.f105444d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f105445e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f105452l.hashCode();
    }

    /* renamed from: i */
    public final bmxv mo57977i() {
        return this.f105445e;
    }

    /* renamed from: j */
    public final bmxv mo57978j() {
        return this.f105450j;
    }

    /* renamed from: k */
    public final bmxv mo57979k() {
        return this.f105451k;
    }

    /* renamed from: l */
    public final bmxv mo57980l() {
        return this.f105452l;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105446f);
        String valueOf2 = String.valueOf(this.f105447g);
        String valueOf3 = String.valueOf(this.f105441a);
        String valueOf4 = String.valueOf(this.f105442b);
        String valueOf5 = String.valueOf(this.f105448h);
        String valueOf6 = String.valueOf(this.f105443c);
        String valueOf7 = String.valueOf(this.f105444d);
        String valueOf8 = String.valueOf(this.f105449i);
        String valueOf9 = String.valueOf(this.f105445e);
        String valueOf10 = String.valueOf(this.f105450j);
        String valueOf11 = String.valueOf(this.f105451k);
        String valueOf12 = String.valueOf(this.f105452l);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        StringBuilder sb = new StringBuilder(length + 316 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf11).length() + String.valueOf(valueOf12).length());
        sb.append("PrimesConfigurations{metricTransmitterProvider=");
        sb.append(valueOf);
        sb.append(", globalConfigurations=");
        sb.append(valueOf2);
        sb.append(", memoryConfigurations=");
        sb.append(valueOf3);
        sb.append(", timerConfigurations=");
        sb.append(valueOf4);
        sb.append(", crashConfigurations=");
        sb.append(valueOf5);
        sb.append(", networkConfigurations=");
        sb.append(valueOf6);
        sb.append(", storageConfigurations=");
        sb.append(valueOf7);
        sb.append(", jankConfigurations=");
        sb.append(valueOf8);
        sb.append(", tikTokTraceConfigurations=");
        sb.append(valueOf9);
        sb.append(", primesTraceConfigurations=");
        sb.append(valueOf10);
        sb.append(", batteryConfigurations=");
        sb.append(valueOf11);
        sb.append(", experimentalConfigurations=");
        sb.append(valueOf12);
        sb.append("}");
        return sb.toString();
    }
}
