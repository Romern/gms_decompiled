package p000;

import java.util.Collections;
import java.util.Set;

/* renamed from: abzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abzc implements abzg {

    /* renamed from: a */
    final /* synthetic */ Set f58786a;

    /* renamed from: b */
    final /* synthetic */ String f58787b;

    /* renamed from: c */
    final /* synthetic */ Set f58788c;

    /* renamed from: d */
    final /* synthetic */ abyy f58789d;

    /* renamed from: e */
    final /* synthetic */ boolean f58790e;

    /* renamed from: f */
    final /* synthetic */ abzm f58791f;

    public abzc(abzm abzm, Set set, String str, Set set2, abyy abyy, boolean z) {
        this.f58791f = abzm;
        this.f58786a = set;
        this.f58787b = str;
        this.f58788c = set2;
        this.f58789d = abyy;
        this.f58790e = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abyv.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      abyv.a(java.lang.String, com.google.android.gms.appdatasearch.GlobalSearchApplication):android.content.Intent
      abyv.a(java.lang.String, boolean):boolean */
    /* renamed from: a */
    public final int mo32515a(abss abss) {
        abww a;
        absr absr = abss.f58157b;
        if (absr == null) {
            absr = absr.f58134s;
        }
        Set set = this.f58786a;
        if (set != null && !set.contains(absr.f58138c)) {
            return 2;
        }
        String str = this.f58787b;
        if (str != null && !str.equals(absr.f58140e)) {
            return 2;
        }
        Set set2 = this.f58788c;
        if (set2 == null || set2.contains(abss)) {
            return 1;
        }
        if (this.f58789d.mo32512a() && this.f58790e) {
            if (!this.f58791f.mo32532a(this.f58789d, absr)) {
                return 3;
            }
            abyv d = this.f58791f.f58814c.mo32506d(absr.f58140e);
            if (d != null && this.f58791f.f58814c.mo32509e(absr.f58140e) && d.mo32468a(absr.f58138c, true) && !absr.f58146k.isEmpty()) {
                return 1;
            }
        }
        if (((Boolean) abzt.f58913bA.mo58455c()).booleanValue() && this.f58791f.mo32532a(this.f58789d, absr) && this.f58791f.f58814c.mo32506d(absr.f58140e) != null) {
            acxb acxb = this.f58791f.f58815d;
            abyy abyy = this.f58789d;
            String str2 = absr.f58140e;
            if ((!abyy.f58776b && !abyy.f58778d) || !((Boolean) abzt.f58838F.mo58455c()).booleanValue() || !abzt.m48727a(str2)) {
                String str3 = abyy.f58780f;
                if (abyy.f58779e) {
                    Set set3 = (Set) acxb.m49920b().get(str3);
                    if (set3 == null) {
                        set3 = Collections.emptySet();
                    }
                    if (set3.isEmpty() || (a = abww.m48411a(absr.f58138c, absr.f58140e, abxt.m48504a(acxb.f61001a))) == null || a.f58663c == 1 || !set3.contains(a.f58661a.f58531b)) {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return 3;
    }
}
