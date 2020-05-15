package p000;

import com.google.android.gms.drive.DriveSpace;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: vpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpb {

    /* renamed from: a */
    private static final sbw f49700a = new sbw("GenoaValuesHelper", "");

    /* renamed from: a */
    public static ukt m40984a(uhn uhn, ujx ujx) {
        sdo.m34970a(uhn.mo27382b());
        ukt ah = ujx.mo27572ah();
        if (ah != null) {
            return ah;
        }
        ukt a = uhn.mo27404a(ujx);
        ujx.mo27620j(true);
        return a;
    }

    /* renamed from: b */
    public static int m40991b(uhn uhn, uih uih, long j, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        uhn uhn2 = uhn;
        long j2 = j;
        uhn.mo27435d();
        uey a = uey.m38255a(uih);
        try {
            Set<ukt> i = uhn2.mo27450i(j2);
            boolean z10 = z;
            boolean z11 = false;
            for (ukt ukt : i) {
                ujx a2 = uhn2.mo27402a(a, ukt.f48053a);
                ula b = ukt.mo27662b();
                boolean z12 = true;
                if (b.mo27683a() && b.mo27687c() == j2) {
                    String u = a2.mo27638u();
                    String str = (String) b.mo27684b();
                    z11 |= !sdg.m34949a(u, str);
                    a2.mo27592c(str);
                    b.mo27688d();
                }
                ula ula = ukt.f48055c;
                if (ula.mo27683a() && ula.mo27687c() == j2) {
                    ung v = a2.mo27639v();
                    ung ung = (ung) ula.mo27684b();
                    if (v != ung) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z11 |= z9;
                    a2.mo27561a(ung);
                    ula.mo27688d();
                }
                ula d = ukt.mo27664d();
                if (d.mo27683a() && d.mo27687c() == j2) {
                    String P = a2.mo27538P();
                    String str2 = (String) d.mo27684b();
                    z11 |= !P.equals(str2);
                    a2.mo27557a(str2);
                    d.mo27688d();
                }
                ula g = ukt.mo27667g();
                if (g.mo27683a() && g.mo27687c() == j2) {
                    String T = a2.mo27542T();
                    String str3 = (String) g.mo27684b();
                    z11 |= !sdg.m34949a(T, str3);
                    a2.mo27614h(str3);
                    g.mo27688d();
                }
                ula c = ukt.mo27663c();
                if (c.mo27683a() && c.mo27687c() == j2) {
                    String H = a2.mo27530H();
                    String str4 = (String) c.mo27684b();
                    z11 |= !sdg.m34949a(H, str4);
                    a2.mo27611g(str4);
                    c.mo27688d();
                }
                ula h = ukt.mo27668h();
                if (h.mo27683a()) {
                    if (h.mo27687c() == j2) {
                        Date G = a2.mo27529G();
                        Date date = (Date) h.mo27684b();
                        z11 |= !sdg.m34949a(G, date);
                        a2.mo27603e(date);
                        h.mo27688d();
                    }
                }
                ula i2 = ukt.mo27669i();
                if (i2.mo27683a() && i2.mo27687c() == j2) {
                    boolean U = a2.mo27543U();
                    boolean booleanValue = ((Boolean) i2.mo27684b()).booleanValue();
                    if (U != booleanValue) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z11 |= z8;
                    a2.mo27600d(booleanValue);
                    i2.mo27688d();
                }
                ula f = ukt.mo27666f();
                if (f.mo27683a() && f.mo27687c() == j2) {
                    boolean Q = a2.mo27539Q();
                    boolean booleanValue2 = ((Boolean) f.mo27684b()).booleanValue();
                    if (Q != booleanValue2) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z11 |= z7;
                    a2.mo27588b(booleanValue2);
                    f.mo27688d();
                }
                ula e = ukt.mo27665e();
                if (e.mo27683a() && e.mo27687c() == j2) {
                    String Z = a2.mo27548Z();
                    String str5 = (String) e.mo27684b();
                    z11 |= !sdg.m34949a(Z, str5);
                    a2.mo27619j(str5);
                    e.mo27688d();
                }
                ula j3 = ukt.mo27670j();
                if (j3.mo27683a() && j3.mo27687c() == j2) {
                    boolean contains = a2.mo27574aj().contains(DriveSpace.f30734a);
                    boolean booleanValue3 = ((Boolean) j3.mo27684b()).booleanValue();
                    if (contains != booleanValue3) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z11 |= z6;
                    a2.mo27622k(booleanValue3);
                    j3.mo27688d();
                }
                ula k = ukt.mo27671k();
                if (k.mo27683a() && k.mo27687c() == j2) {
                    boolean B = a2.mo27524B();
                    boolean booleanValue4 = ((Boolean) k.mo27684b()).booleanValue();
                    if (B != booleanValue4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z11 |= z5;
                    a2.mo27562a(booleanValue4);
                    k.mo27688d();
                }
                ula l = ukt.mo27672l();
                if (l.mo27683a() && l.mo27687c() == j2) {
                    boolean R = a2.mo27540R();
                    boolean booleanValue5 = ((Boolean) l.mo27684b()).booleanValue();
                    if (R != booleanValue5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z11 |= z4;
                    a2.mo27595c(booleanValue5);
                    l.mo27688d();
                }
                ula ula2 = ukt.f48056d;
                if (ula2.mo27683a() && ula2.mo27687c() == j2) {
                    Long V = a2.mo27544V();
                    Long l2 = (Long) ula2.mo27684b();
                    z11 |= !sdg.m34949a(V, l2);
                    a2.mo27590c(l2.longValue());
                    ula2.mo27688d();
                }
                ula m = ukt.mo27673m();
                if (m.mo27683a() && m.mo27687c() == j2) {
                    Date F = a2.mo27528F();
                    Date date2 = (Date) m.mo27684b();
                    z11 |= !sdg.m34949a(F, date2);
                    a2.mo27599d(date2);
                    m.mo27688d();
                }
                ula ula3 = ukt.f48057e;
                if (ula3.mo27683a() && ula3.mo27687c() == j2) {
                    bngx S = a2.mo27541S();
                    bngx a3 = bngx.m109368a((Collection) ula3.mo27684b());
                    if (S != null) {
                        if (a3 != null && S.size() == a3.size() && S.containsAll(a3)) {
                            z3 = true;
                            z11 |= z3;
                            a2.mo27554a(a3);
                            ula3.mo27688d();
                        }
                    } else if (a3 == null) {
                        z3 = true;
                        z11 |= z3;
                        a2.mo27554a(a3);
                        ula3.mo27688d();
                    }
                    z3 = false;
                    z11 |= z3;
                    a2.mo27554a(a3);
                    ula3.mo27688d();
                }
                ula n = ukt.mo27674n();
                if (n.mo27683a() && n.mo27687c() == j2) {
                    boolean Y = a2.mo27547Y();
                    boolean booleanValue6 = ((Boolean) n.mo27684b()).booleanValue();
                    if (Y != booleanValue6) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z11 |= z2;
                    a2.mo27609f(booleanValue6);
                    n.mo27688d();
                }
                ula o = ukt.mo27675o();
                if (o.mo27683a() && o.mo27687c() == j2) {
                    Date C = a2.mo27525C();
                    Date date3 = (Date) o.mo27684b();
                    z11 |= !C.equals(date3);
                    a2.mo27559a(date3);
                    o.mo27688d();
                }
                ula p = ukt.mo27676p();
                if (p.mo27683a() && p.mo27687c() == j2) {
                    Date D = a2.mo27526D();
                    Date date4 = (Date) p.mo27684b();
                    z11 |= !sdg.m34949a(D, date4);
                    a2.mo27587b(date4);
                    p.mo27688d();
                }
                ula q = ukt.mo27677q();
                if (q.mo27683a() && q.mo27687c() == j2) {
                    Date E = a2.mo27527E();
                    Date date5 = (Date) q.mo27684b();
                    z11 |= !E.equals(date5);
                    a2.mo27594c(date5);
                    q.mo27688d();
                }
                Iterator it = ukt.f48054b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ula) it.next()).mo27683a()) {
                            ukt.mo27725t();
                            break;
                        }
                    } else {
                        ukt.mo27726u();
                        a2.mo27620j(false);
                        break;
                    }
                }
                z10 &= z11;
                if (!z10) {
                    z12 = false;
                }
                a2.mo27627m(z12);
            }
            uhn.mo27442f();
            int size = i.size();
            uhn.mo27439e();
            return size;
        } catch (uaa e2) {
            f49700a.mo25378c("GenoaValuesHelper", "Entry no longer exists", e2);
        } catch (Throwable th) {
            uhn.mo27439e();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ujx.a(java.lang.String, boolean):java.util.List
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      ujx.a(boolean, boolean):void
      ujx.a(java.lang.String, java.lang.String):uot
      ujx.a(boolean, long):void
      ujx.a(java.lang.String, boolean):java.util.List */
    /* renamed from: a */
    public static void m40985a(uhl uhl, uih uih, long j) {
        ujx ujx;
        sdo.m34970a(uhl.mo27382b());
        List<uot> a = uhl.mo27356a(Long.valueOf(j));
        HashSet<uif> hashSet = new HashSet();
        for (uot uot : a) {
            ula g = uot.mo27787g();
            if (j == g.mo27687c()) {
                ((uje) uot.mo27777a()).mo27516a((String) g.mo27684b());
                g.mo27688d();
            }
            uot.mo27779c();
            hashSet.add(uot.f48430d.f49102b);
        }
        for (uif uif : hashSet) {
            if (uif.mo27498a()) {
                ujx = ((ugx) uhl).mo27369a(uey.m38255a(uih), "EntryView", "ScopedEntryView", voz.m40961a(uih.f47683b, uif.f47676a.longValue()));
            } else {
                ujx = null;
            }
            if (ujx != null) {
                ujx.mo27550a((String) null, true);
                ujx.mo27606f();
            }
        }
        a.size();
    }

    /* renamed from: a */
    public static void m40986a(uhn uhn, uih uih, long j, long j2) {
        sdo.m34970a(uhn.mo27382b());
        for (ukt ukt : uhn.mo27450i(j)) {
            List list = ukt.f48054b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ula ula = (ula) list.get(i);
                if (ula.mo27683a() && ula.mo27687c() == j) {
                    ula.mo27680a(j2);
                }
            }
            ukt.mo27725t();
        }
        for (uot uot : uhn.mo27356a(Long.valueOf(j))) {
            ula g = uot.mo27787g();
            if (g.mo27683a() && g.mo27687c() == j) {
                g.mo27680a(j2);
            }
            uot.mo27779c();
        }
        uig a = uhn.mo27396a(uih, j);
        try {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                ujx ujx = (ujx) it.next();
                Long l = ujx.f47825a.f47916h;
                if (l != null && j == l.longValue()) {
                    ujx.f47825a.f47916h = Long.valueOf(j2);
                }
                Long p = ujx.mo27632p();
                if (p != null && j == p.longValue()) {
                    ujx.mo27584b(Long.valueOf(j2));
                }
                ujx.mo27606f();
            }
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public static void m40987a(uhn uhn, uih uih, long j, boolean z) {
        boolean z2;
        uhn.mo27435d();
        try {
            for (ukc ukc : ((ugx) uhn).mo27359a(uoh.m39072b(uke.GENOA_ROLE_ACTION_ID.f47867m.mo27717e(j), uke.GENOA_IS_LINK_REQUIRED_ACTION_ID.f47867m.mo27717e(j)))) {
                Long l = ukc.f47849h;
                if (l == null || ukc.f47848g == null || l.longValue() != j) {
                    z2 = false;
                } else {
                    ukc.f47847f = ukc.f47848g.intValue();
                    ukc.f47848g = null;
                    ukc.f47849h = null;
                    z2 = true;
                }
                Long l2 = ukc.f47852k;
                if (l2 != null) {
                    if (ukc.f47851j != null && l2.longValue() == j) {
                        ukc.f47850i = ukc.f47851j.booleanValue();
                        ukc.f47851j = null;
                        ukc.f47852k = null;
                        z2 = true;
                    }
                }
                if (ukc.f47849h == null && ukc.f47852k == null && ukc.f47847f == -100) {
                    ukc.mo27726u();
                } else if (z2) {
                    ukc.mo27725t();
                }
            }
            m40991b(uhn, uih, j, z);
            tyk.m37742a(uhn, uih, j, z);
            uhn.mo27442f();
        } finally {
            uhn.mo27439e();
        }
    }

    /* renamed from: a */
    public static void m40988a(uhn uhn, uih uih, ukk ukk, long j, boolean z) {
        uig a;
        uhn.mo27435d();
        try {
            ujx a2 = uhn.mo27402a(uey.m38255a(uih), ukk);
            Long p = a2.mo27632p();
            if (p == null || p.longValue() != j) {
                uhn.mo27442f();
                uhn.mo27439e();
            }
            ugx ugx = (ugx) uhn;
            a = ugx.mo27363a(((ugx) uhn).f47578a.mo27468a(umc.f48191a.mo27735b(), (String[]) null, umb.ENTRY_ID.f48190k.mo27717e(ukk.f47941a), String.valueOf(umc.f48191a.f48341a.mo27700a()).concat(" DESC")), uib.f47672a);
            if (!a.isEmpty()) {
                Long valueOf = Long.valueOf(j);
                if (!valueOf.equals(((ulz) a.get(0)).f48175b)) {
                    f49700a.mo25374b("GenoaValuesHelper", "Last content action ID (%s) doesn't match what we're told (%s)", ((ulz) a.get(0)).f48175b, valueOf);
                } else {
                    if (a.size() != 1) {
                        if (z) {
                            ulz ulz = (ulz) a.get(1);
                            String str = ulz.f48174a;
                            if (!sdg.m34949a(str, a2.mo27633q())) {
                                a2.mo27593c(str, vpc.m40995b(str));
                            }
                            a2.mo27553a(uhn.mo27434d(str).f48038f);
                            a2.mo27584b(ulz.f48175b);
                            a2.mo27627m(false);
                            a.close();
                            uhn.mo27442f();
                            uhn.mo27439e();
                        }
                    }
                    String n = a2.mo27628n();
                    if (!sdg.m34949a(n, a2.mo27633q())) {
                        a2.mo27593c(n, vpc.m40995b(n));
                    }
                    if (a2.mo27636t() != null) {
                        a2.mo27553a(a2.mo27636t().longValue());
                        a2.mo27591c((Long) null);
                    }
                    a2.mo27584b((Long) null);
                    a2.mo27627m(false);
                    a.close();
                    uhn.mo27442f();
                    uhn.mo27439e();
                }
            } else {
                f49700a.mo25377c("GenoaValuesHelper", "No pending uploads when cleaning up content action!?");
            }
            a.close();
            uhn.mo27439e();
        } catch (uaa e) {
            try {
                f49700a.mo25378c("GenoaValuesHelper", "Entry doesn't exist?!", e);
            } catch (Throwable th) {
                uhn.mo27439e();
                throw th;
            }
        } catch (Throwable th2) {
            a.close();
            throw th2;
        }
    }

    /* renamed from: a */
    public static void m40989a(ujx ujx, ukt ukt, ung ung, long j) {
        ula ula = ukt.f48055c;
        if (!ula.mo27683a()) {
            ula.mo27682a(ujx.mo27639v(), j);
        } else {
            ula.mo27680a(j);
        }
        ujx.mo27561a(ung);
    }

    /* renamed from: a */
    public static void m40990a(ujx ujx, ukt ukt, boolean z, long j) {
        ula k = ukt.mo27671k();
        if (k.mo27683a()) {
            k.mo27680a(j);
        } else {
            k.mo27682a(Boolean.valueOf(ujx.mo27524B()), j);
        }
        ujx.mo27562a(z);
    }
}
