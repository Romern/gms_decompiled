package p000;

import java.text.DecimalFormat;
import java.util.Objects;

/* renamed from: smi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class smi implements Comparable {

    /* renamed from: a */
    private static final DecimalFormat f44746a = new DecimalFormat("#.##");

    /* renamed from: k */
    public static final String f44747k = String.format("%25s\t%10s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\n", "Component", "Tag", "Type", "TTL B", "TTL BRx", "TTL BTx", "TTL PRx", "TTL PTx");

    /* renamed from: l */
    public int f44748l;

    /* renamed from: m */
    protected int f44749m;

    /* renamed from: n */
    protected int f44750n;

    /* renamed from: o */
    protected int f44751o;

    /* renamed from: p */
    public long f44752p = 0;

    /* renamed from: q */
    public long f44753q = 0;

    /* renamed from: r */
    public long f44754r = 0;

    /* renamed from: s */
    public long f44755s = 0;

    /* renamed from: t */
    public long f44756t = 0;

    /* renamed from: u */
    public long f44757u = 0;

    public smi(int i, int i2, int i3, int i4) {
        this.f44748l = i;
        this.f44749m = i2;
        this.f44751o = i4;
        this.f44750n = i3;
    }

    /* renamed from: a */
    public static String m35660a(long j) {
        return m35661a(j, false);
    }

    /* renamed from: b */
    public static String m35662b(long j) {
        return m35661a(j, true);
    }

    /* renamed from: c */
    public long mo25740c() {
        return this.f44754r;
    }

    /* renamed from: d */
    public long mo25741d() {
        return this.f44756t;
    }

    /* renamed from: e */
    public final long mo25754e() {
        return mo25740c() + mo25741d();
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            smi smi = (smi) obj;
            if (this.f44749m == smi.f44749m && this.f44748l == smi.f44748l && this.f44750n == smi.f44750n && this.f44751o == smi.f44751o && this.f44752p == smi.f44752p && this.f44753q == smi.f44753q && mo25740c() == smi.mo25740c() && mo25741d() == smi.mo25741d() && this.f44755s == smi.f44755s && this.f44757u == smi.f44757u && mo25754e() == smi.mo25754e()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final String mo25755f() {
        String valueOf = String.valueOf(Integer.toHexString(this.f44748l));
        return valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f44749m), Integer.valueOf(this.f44748l), Integer.valueOf(this.f44750n), Integer.valueOf(this.f44751o), Long.valueOf(this.f44752p), Long.valueOf(this.f44753q), Long.valueOf(mo25740c()), Long.valueOf(mo25741d()), Long.valueOf(this.f44755s), Long.valueOf(this.f44757u));
    }

    public String toString() {
        return String.format("%25s\t%10s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\n", shq.m35306a(this.f44748l), mo25755f(), sks.m35543a(this.f44751o), m35662b(mo25754e()), m35662b(mo25740c()), m35662b(mo25741d()), Long.valueOf(this.f44755s), Long.valueOf(this.f44757u));
    }

    /* renamed from: a */
    private static String m35661a(long j, boolean z) {
        String str;
        double d;
        int i;
        double abs = (double) Math.abs(j);
        if (abs > 1.048576E8d) {
            Double.isNaN(abs);
            d = abs / 1.073741824E9d;
            str = !z ? " GB" : "G";
        } else if (abs <= 102400.0d) {
            Double.isNaN(abs);
            d = abs / 1024.0d;
            str = !z ? " KB" : "K";
        } else {
            Double.isNaN(abs);
            d = abs / 1048576.0d;
            str = !z ? " MB" : "M";
        }
        if (j < 0) {
            i = -1;
        } else {
            i = 1;
        }
        DecimalFormat decimalFormat = f44746a;
        double d2 = (double) i;
        Double.isNaN(d2);
        String valueOf = String.valueOf(decimalFormat.format(d * d2));
        return str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
    }

    /* renamed from: b */
    public final int compareTo(smi smi) {
        long e = smi.mo25754e();
        long e2 = mo25754e();
        if (e2 >= e) {
            return e2 <= e ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: a */
    public void mo25738a(smi smi) {
        long j = this.f44752p;
        if (j == 0 || smi.f44752p < j) {
            this.f44752p = smi.f44752p;
        }
        long j2 = this.f44753q;
        if (j2 == 0 || smi.f44753q > j2) {
            this.f44753q = smi.f44753q;
        }
        this.f44754r += smi.mo25740c();
        this.f44756t += smi.mo25741d();
        this.f44755s += smi.f44755s;
        this.f44757u += smi.f44757u;
    }
}
