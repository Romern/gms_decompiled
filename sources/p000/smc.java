package p000;

import java.util.Objects;

/* renamed from: smc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class smc extends smi {

    /* renamed from: a */
    public static final String f44718a = String.format("%25.25s\t%10.10s\t%7.7s\t%6.6s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\n", "Component", "Tag", "Iface", "Type", "TTL B", "TTL BBg", "TTL BFg", "Bg BRx", "Fg BRx", "Bg BTx", "Fg BTx", "Bg PRx", "Fg PRx", "Bg PTx", "Fg PTx");

    /* renamed from: b */
    public String f44719b;

    /* renamed from: c */
    public long f44720c = 0;

    /* renamed from: d */
    public long f44721d = 0;

    /* renamed from: e */
    public long f44722e = 0;

    /* renamed from: f */
    public long f44723f = 0;

    /* renamed from: g */
    public long f44724g = 0;

    /* renamed from: h */
    public long f44725h = 0;

    /* renamed from: i */
    public long f44726i = 0;

    /* renamed from: j */
    public long f44727j = 0;

    public smc(String str, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.f44719b = str;
    }

    /* renamed from: a */
    public final long mo25737a() {
        return this.f44720c + this.f44722e;
    }

    /* renamed from: b */
    public final long mo25739b() {
        return this.f44724g + this.f44726i;
    }

    /* renamed from: c */
    public final long mo25740c() {
        return this.f44720c + this.f44724g;
    }

    /* renamed from: d */
    public final long mo25741d() {
        return this.f44722e + this.f44726i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof smc) {
            smc smc = (smc) obj;
            if (this.f44749m == smc.f44749m && this.f44748l == smc.f44748l && this.f44750n == smc.f44750n && this.f44751o == smc.f44751o && this.f44752p == smc.f44752p && this.f44753q == smc.f44753q && this.f44720c == smc.f44720c && this.f44721d == smc.f44721d && this.f44722e == smc.f44722e && this.f44723f == smc.f44723f && this.f44724g == smc.f44724g && this.f44725h == smc.f44725h && this.f44726i == smc.f44726i && this.f44727j == smc.f44727j && Objects.equals(this.f44719b, smc.f44719b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f44749m), Integer.valueOf(this.f44748l), Integer.valueOf(this.f44750n), Integer.valueOf(this.f44751o), Long.valueOf(this.f44752p), Long.valueOf(this.f44753q), Long.valueOf(this.f44720c), Long.valueOf(this.f44722e), Long.valueOf(this.f44721d), Long.valueOf(this.f44723f), Long.valueOf(this.f44724g), Long.valueOf(this.f44726i), Long.valueOf(this.f44725h), Long.valueOf(this.f44727j));
    }

    public final String toString() {
        return String.format("%25.25s\t%10.10s\t%7.7s\t%6.6s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\n", shq.m35306a(this.f44748l), mo25755f(), this.f44719b, sks.m35543a(this.f44751o), smi.m35662b(mo25754e()), smi.m35662b(mo25737a()), smi.m35662b(mo25739b()), smi.m35662b(this.f44720c), smi.m35662b(this.f44724g), smi.m35662b(this.f44722e), smi.m35662b(this.f44726i), Long.valueOf(this.f44721d), Long.valueOf(this.f44725h), Long.valueOf(this.f44723f), Long.valueOf(this.f44727j));
    }

    /* renamed from: a */
    public final void mo25738a(smi smi) {
        if (smi instanceof smc) {
            super.mo25738a(smi);
            smc smc = (smc) smi;
            this.f44720c += smc.f44720c;
            this.f44721d += smc.f44721d;
            this.f44722e += smc.f44722e;
            this.f44723f += smc.f44723f;
            this.f44724g += smc.f44724g;
            this.f44725h += smc.f44725h;
            this.f44726i += smc.f44726i;
            this.f44727j += smc.f44727j;
        }
    }
}
