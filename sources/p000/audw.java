package p000;

import java.util.Map;

/* renamed from: audw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audw extends auem {

    /* renamed from: a */
    public final Map f91447a;

    /* renamed from: b */
    public final String f91448b;

    /* renamed from: c */
    public final int f91449c;

    /* renamed from: d */
    public final auds f91450d;

    /* renamed from: e */
    public final audt f91451e;

    /* renamed from: f */
    public final audx f91452f;

    /* renamed from: g */
    public final audz f91453g;

    /* renamed from: h */
    public final auec f91454h;

    /* renamed from: i */
    public final auep f91455i;

    /* renamed from: j */
    public final auea f91456j;

    /* renamed from: k */
    public final aueq f91457k;

    /* renamed from: l */
    public final aued f91458l;

    /* renamed from: m */
    public final boolean f91459m;

    /* renamed from: n */
    private final String f91460n;

    public audw(Map map, String str, int i, String str2, auds auds, audt audt, audx audx, audz audz, auec auec, auep auep, auea auea, aueq aueq, aued aued, boolean z) {
        this.f91447a = map;
        this.f91448b = str;
        this.f91449c = i;
        this.f91460n = str2;
        this.f91450d = auds;
        this.f91451e = audt;
        this.f91452f = audx;
        this.f91453g = audz;
        this.f91454h = auec;
        this.f91455i = auep;
        this.f91456j = auea;
        this.f91457k = aueq;
        this.f91458l = aued;
        this.f91459m = z;
    }

    /* renamed from: a */
    public final Map mo50467a() {
        return this.f91447a;
    }

    /* renamed from: b */
    public final String mo50468b() {
        return this.f91448b;
    }

    /* renamed from: c */
    public final int mo50469c() {
        return this.f91449c;
    }

    /* renamed from: d */
    public final String mo50470d() {
        return this.f91460n;
    }

    /* renamed from: e */
    public final auds mo50471e() {
        return this.f91450d;
    }

    public final boolean equals(Object obj) {
        auds auds;
        audt audt;
        auec auec;
        aueq aueq;
        aued aued;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof auem)) {
            return false;
        }
        auem auem = (auem) obj;
        return this.f91447a.equals(auem.mo50467a()) && this.f91448b.equals(auem.mo50468b()) && this.f91449c == auem.mo50469c() && this.f91460n.equals(auem.mo50470d()) && ((auds = this.f91450d) == null ? auem.mo50471e() == null : auds.equals(auem.mo50471e())) && ((audt = this.f91451e) == null ? auem.mo50473f() == null : audt.equals(auem.mo50473f())) && this.f91452f.equals(auem.mo50474g()) && this.f91453g.equals(auem.mo50475h()) && ((auec = this.f91454h) == null ? auem.mo50477i() == null : auec.equals(auem.mo50477i())) && this.f91455i.equals(auem.mo50478j()) && this.f91456j.equals(auem.mo50479k()) && ((aueq = this.f91457k) == null ? auem.mo50480l() == null : aueq.equals(auem.mo50480l())) && ((aued = this.f91458l) == null ? auem.mo50481m() == null : aued.equals(auem.mo50481m())) && this.f91459m == auem.mo50482n();
    }

    /* renamed from: f */
    public final audt mo50473f() {
        return this.f91451e;
    }

    /* renamed from: g */
    public final audx mo50474g() {
        return this.f91452f;
    }

    /* renamed from: h */
    public final audz mo50475h() {
        return this.f91453g;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((((((this.f91447a.hashCode() ^ 1000003) * 1000003) ^ this.f91448b.hashCode()) * 1000003) ^ this.f91449c) * 1000003) ^ this.f91460n.hashCode()) * 1000003;
        auds auds = this.f91450d;
        int i5 = 0;
        if (auds != null) {
            i = auds.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode ^ i) * 1000003;
        audt audt = this.f91451e;
        if (audt != null) {
            i2 = audt.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((((i6 ^ i2) * 1000003) ^ this.f91452f.hashCode()) * 1000003) ^ this.f91453g.hashCode()) * 1000003;
        auec auec = this.f91454h;
        if (auec != null) {
            i3 = auec.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode3 = (((((hashCode2 ^ i3) * 1000003) ^ this.f91455i.hashCode()) * 1000003) ^ this.f91456j.hashCode()) * 1000003;
        aueq aueq = this.f91457k;
        if (aueq != null) {
            i4 = aueq.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = (hashCode3 ^ i4) * 1000003;
        aued aued = this.f91458l;
        if (aued != null) {
            i5 = aued.hashCode();
        }
        return ((i7 ^ i5) * 1000003) ^ (!this.f91459m ? 1237 : 1231);
    }

    /* renamed from: i */
    public final auec mo50477i() {
        return this.f91454h;
    }

    /* renamed from: j */
    public final auep mo50478j() {
        return this.f91455i;
    }

    /* renamed from: k */
    public final auea mo50479k() {
        return this.f91456j;
    }

    /* renamed from: l */
    public final aueq mo50480l() {
        return this.f91457k;
    }

    /* renamed from: m */
    public final aued mo50481m() {
        return this.f91458l;
    }

    /* renamed from: n */
    public final boolean mo50482n() {
        return this.f91459m;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f91447a);
        String str = this.f91448b;
        int i = this.f91449c;
        String str2 = this.f91460n;
        String valueOf2 = String.valueOf(this.f91450d);
        String valueOf3 = String.valueOf(this.f91451e);
        String valueOf4 = String.valueOf(this.f91452f);
        String valueOf5 = String.valueOf(this.f91453g);
        String valueOf6 = String.valueOf(this.f91454h);
        String valueOf7 = String.valueOf(this.f91455i);
        String valueOf8 = String.valueOf(this.f91456j);
        String valueOf9 = String.valueOf(this.f91457k);
        String valueOf10 = String.valueOf(this.f91458l);
        boolean z = this.f91459m;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        int length10 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 167 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("SipMessage{headers=");
        sb.append(valueOf);
        sb.append(", method=");
        sb.append(str);
        sb.append(", size=");
        sb.append(i);
        sb.append(", body=");
        sb.append(str2);
        sb.append(", accept=");
        sb.append(valueOf2);
        sb.append(", allow=");
        sb.append(valueOf3);
        sb.append(", callID=");
        sb.append(valueOf4);
        sb.append(", contact=");
        sb.append(valueOf5);
        sb.append(", pai=");
        sb.append(valueOf6);
        sb.append(", toHeader=");
        sb.append(valueOf7);
        sb.append(", fromHeader=");
        sb.append(valueOf8);
        sb.append(", userAgent=");
        sb.append(valueOf9);
        sb.append(", pchargingVector=");
        sb.append(valueOf10);
        sb.append(", isRequest=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
