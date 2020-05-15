package p000;

import java.util.Arrays;

/* renamed from: acak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acak implements Comparable {

    /* renamed from: a */
    final String f59106a;

    /* renamed from: b */
    final String f59107b;

    /* renamed from: c */
    final String f59108c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public acak(abss abss) {
        this(r0, r1, r3);
        absr absr = abss.f58157b;
        String str = (absr == null ? absr.f58134s : absr).f58140e;
        absr absr2 = abss.f58157b;
        String str2 = (absr2 == null ? absr.f58134s : absr2).f58138c;
        absy absy = abss.f58158c;
        int a = absx.m48236a((absy == null ? absy.f58176h : absy).f58180c);
        String str3 = null;
        if (a != 0 && a == 3) {
            absr absr3 = abss.f58157b;
            str3 = Integer.toString((absr3 == null ? absr.f58134s : absr3).f58137b);
        }
    }

    /* renamed from: a */
    public final int compareTo(acak acak) {
        int compareTo = this.f59106a.compareTo(acak.f59106a);
        if (compareTo != 0 || (compareTo = this.f59107b.compareTo(acak.f59107b)) != 0) {
            return compareTo;
        }
        String str = this.f59108c;
        if (str == null) {
            return acak.f59108c != null ? -1 : 0;
        }
        String str2 = acak.f59108c;
        if (str2 != null) {
            return str.compareTo(str2);
        }
        return 1;
    }

    /* renamed from: b */
    public final String mo32584b() {
        String str;
        if (!sre.m36079a() || !this.f59107b.startsWith("messages/")) {
            str = this.f59107b;
        } else {
            str = "messages/<redacted>";
        }
        return bmxr.m108544a("-").mo66873a().mo66875a(this.f59106a, str, this.f59108c);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof acak) && compareTo((acak) obj) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59106a, this.f59107b, this.f59108c});
    }

    /* renamed from: a */
    public final String mo32583a() {
        return bmxr.m108544a("-").mo66873a().mo66875a(this.f59106a, this.f59107b, this.f59108c);
    }

    public acak(String str, String str2) {
        this(str, str2, null);
    }

    public acak(String str, String str2, String str3) {
        this.f59106a = str;
        this.f59107b = str2;
        this.f59108c = str3;
    }
}
