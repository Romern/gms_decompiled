package p000;

import java.util.Arrays;

/* renamed from: bgzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzj {

    /* renamed from: a */
    private final bgvr f118159a;

    public bgzj(bgvr bgvr) {
        this.f118159a = bgvr;
    }

    /* renamed from: a */
    public static int m100451a(double d) {
        return (int) Math.round(d * 1.0E7d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bgzj) {
            bgvr bgvr = ((bgzj) obj).f118159a;
            bgvr bgvr2 = this.f118159a;
            if (bgvr2.f117718d == bgvr.f117718d) {
                bgvu bgvu = bgvr2.f117716b;
                if (bgvu == null) {
                    bgvu = bgvu.f117746d;
                }
                bgvu bgvu2 = bgvr.f117716b;
                if (bgvu2 == null) {
                    bgvu2 = bgvu.f117746d;
                }
                if (bgvu.equals(bgvu2)) {
                    bgvq a = bgvq.m100134a(this.f118159a.f117717c);
                    if (a == null) {
                        a = bgvq.WIFI;
                    }
                    bgvq a2 = bgvq.m100134a(bgvr.f117717c);
                    if (a2 == null) {
                        a2 = bgvq.WIFI;
                    }
                    if (a.equals(a2)) {
                        bgvr bgvr3 = this.f118159a;
                        if (bgvr3.f117719e == bgvr.f117719e && bgvr3.f117720f == bgvr.f117720f && bgvr3.f117721g == bgvr.f117721g && bgvr3.f117722h == bgvr.f117722h && bgvr3.f117734t == bgvr.f117734t && bgvr3.f117723i == bgvr.f117723i) {
                            bgvj bgvj = bgvr3.f117729o;
                            if (bgvj == null) {
                                bgvj = bgvj.f117660f;
                            }
                            bgvj bgvj2 = bgvr.f117729o;
                            if (bgvj2 == null) {
                                bgvj2 = bgvj.f117660f;
                            }
                            if (bgvj.equals(bgvj2)) {
                                bgvr bgvr4 = this.f118159a;
                                if (bgvr4.f117725k == bgvr.f117725k && bgvr4.f117726l.equals(bgvr.f117726l)) {
                                    bgvr bgvr5 = this.f118159a;
                                    if (bgvr5.f117727m == bgvr.f117727m && bgvr5.f117732r == bgvr.f117732r && bgvr5.f117733s == bgvr.f117733s) {
                                        return true;
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[15];
        objArr[0] = Long.valueOf(this.f118159a.f117718d);
        bgvu bgvu = this.f118159a.f117716b;
        if (bgvu == null) {
            bgvu = bgvu.f117746d;
        }
        objArr[1] = bgvu;
        bgvq a = bgvq.m100134a(this.f118159a.f117717c);
        if (a == null) {
            a = bgvq.WIFI;
        }
        objArr[2] = a;
        objArr[3] = Float.valueOf(this.f118159a.f117719e);
        objArr[4] = Float.valueOf(this.f118159a.f117720f);
        objArr[5] = Double.valueOf(this.f118159a.f117721g);
        objArr[6] = Float.valueOf(this.f118159a.f117722h);
        objArr[7] = Float.valueOf(this.f118159a.f117734t);
        objArr[8] = Integer.valueOf(this.f118159a.f117723i);
        bgvj bgvj = this.f118159a.f117729o;
        if (bgvj == null) {
            bgvj = bgvj.f117660f;
        }
        objArr[9] = bgvj;
        objArr[10] = Boolean.valueOf(this.f118159a.f117725k);
        bgvr bgvr = this.f118159a;
        objArr[11] = bgvr.f117726l;
        objArr[12] = Integer.valueOf(bgvr.f117727m);
        objArr[13] = Long.valueOf(this.f118159a.f117732r);
        objArr[14] = Boolean.valueOf(this.f118159a.f117733s);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        bgvu bgvu = this.f118159a.f117716b;
        if (bgvu == null) {
            bgvu = bgvu.f117746d;
        }
        bxbk a = bxbl.m122537a(this);
        a.mo73559a("time", Long.valueOf(this.f118159a.f117718d));
        a.mo73559a("latE7", Integer.valueOf(bgvu.f117749b));
        a.mo73559a("lngE7", Integer.valueOf(bgvu.f117750c));
        bgvq a2 = bgvq.m100134a(this.f118159a.f117717c);
        if (a2 == null) {
            a2 = bgvq.WIFI;
        }
        a.mo73559a("source", Integer.valueOf(a2.f117712f));
        a.mo73559a("speed", Float.valueOf(this.f118159a.f117719e));
        a.mo73559a("heading", Float.valueOf(this.f118159a.f117720f));
        a.mo73559a("altitude", Double.valueOf(this.f118159a.f117721g));
        a.mo73559a("accuracy", Float.valueOf(this.f118159a.f117722h));
        a.mo73559a("verticalAccuracy", Float.valueOf(this.f118159a.f117734t));
        a.mo73559a("gmmNlpVersion", Integer.valueOf(this.f118159a.f117723i));
        bgvj bgvj = this.f118159a.f117729o;
        if (bgvj == null) {
            bgvj = bgvj.f117660f;
        }
        StringBuilder sb = new StringBuilder("{");
        if (bgvj != null) {
            sb.append("charging: ");
            int a3 = bgvi.m100126a(bgvj.f117663b);
            if (a3 == 0) {
                a3 = 1;
            }
            sb.append(a3 - 1);
            sb.append(", level: ");
            sb.append(bgvj.f117664c);
            sb.append(", scale: ");
            sb.append(bgvj.f117665d);
            sb.append(", voltage: ");
            sb.append(bgvj.f117666e);
        }
        sb.append("}");
        a.mo73559a("batteryCondition", sb.toString());
        a.mo73559a("stationary", Boolean.valueOf(this.f118159a.f117725k));
        a.mo73559a("levelId", this.f118159a.f117726l);
        a.mo73559a("levelNumberE3", Integer.valueOf(this.f118159a.f117727m));
        a.mo73559a("batchDeliveryTime", Long.valueOf(this.f118159a.f117732r));
        a.mo73559a("isOversampled", Boolean.valueOf(this.f118159a.f117733s));
        return a.toString();
    }
}
