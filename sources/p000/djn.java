package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: djn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djn implements Comparable {

    /* renamed from: h */
    public static final Comparator f13336h = djm.f13335a;

    /* renamed from: j */
    private static final Map f13337j = adyi.m51410a();

    /* renamed from: a */
    public final String f13338a;

    /* renamed from: b */
    public final int f13339b;

    /* renamed from: c */
    public final List f13340c;

    /* renamed from: d */
    public final din f13341d;

    /* renamed from: e */
    public final dmn f13342e;

    /* renamed from: f */
    public int f13343f = -1;

    /* renamed from: g */
    public final Set f13344g;

    /* renamed from: i */
    private final List f13345i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djn.a(java.util.Collection, boolean):boolean
     arg types: [bxwc, int]
     candidates:
      djn.a(java.lang.String, java.lang.String):boolean
      djn.a(java.util.Collection, boolean):boolean */
    public djn(dmn dmn, din din) {
        this.f13342e = dmn;
        this.f13344g = adyi.f62902a.mo33928a(dmn.f13556f);
        String str = dmn.f13552b;
        String str2 = (String) f13337j.get(str);
        if (str2 == null) {
            f13337j.put(str, str);
        } else {
            str = str2;
        }
        this.f13338a = str;
        this.f13340c = dmn.f13553c;
        this.f13339b = dmn.f13554d;
        if (dmn.f13556f.size() > 0) {
            this.f13345i = new ArrayList(dmn.f13556f);
            mo9131a((Collection) this.f13342e.f13558h, true);
        } else {
            this.f13345i = Collections.emptyList();
        }
        this.f13341d = din;
    }

    /* renamed from: a */
    public static void m8655a() {
        f13337j.clear();
    }

    /* renamed from: a */
    public static boolean m8656a(String str, String str2) {
        return str == str2;
    }

    /* renamed from: b */
    public final List mo9132b() {
        return Collections.unmodifiableList(this.f13345i);
    }

    /* renamed from: c */
    public final dmn mo9133c() {
        bmxy.m108600b(this.f13343f != -1);
        dmn dmn = this.f13342e;
        bxvd bxvd = (bxvd) dmn.mo74142c(5);
        bxvd.mo73625a((bxvk) dmn);
        for (int i = 0; i < ((dmn) bxvd.f164949b).f13559i.size(); i++) {
            dms i2 = bxvd.mo74063i(i);
            bxvd bxvd2 = (bxvd) i2.mo74142c(5);
            bxvd2.mo73625a((bxvk) i2);
            int i3 = this.f13343f;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            dms dms = (dms) bxvd2.f164949b;
            dms dms2 = dms.f13598e;
            dms.f13600a |= 4;
            dms.f13603d = i3;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn2 = (dmn) bxvd.f164949b;
            dms dms3 = (dms) bxvd2.mo74062i();
            dmn dmn3 = dmn.f13549v;
            dms3.getClass();
            dmn2.mo9279a();
            dmn2.f13559i.set(i, dms3);
        }
        for (int i4 = 0; i4 < ((dmn) bxvd.f164949b).f13560j.size(); i4++) {
            dmq j = bxvd.mo74068j(i4);
            bxvd bxvd3 = (bxvd) j.mo74142c(5);
            bxvd3.mo73625a((bxvk) j);
            int i5 = this.f13343f;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            dmq dmq = (dmq) bxvd3.f164949b;
            dmq dmq2 = dmq.f13586e;
            dmq.f13588a |= 4;
            dmq.f13591d = i5;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn4 = (dmn) bxvd.f164949b;
            dmq dmq3 = (dmq) bxvd3.mo74062i();
            dmn dmn5 = dmn.f13549v;
            dmq3.getClass();
            dmn4.mo9280b();
            dmn4.f13560j.set(i4, dmq3);
        }
        for (int i6 = 0; i6 < ((dmn) bxvd.f164949b).f13563m.size(); i6++) {
            dmb l = bxvd.mo74078l(i6);
            bxvd bxvd4 = (bxvd) l.mo74142c(5);
            bxvd4.mo73625a((bxvk) l);
            int i7 = this.f13343f;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            dmb dmb = (dmb) bxvd4.f164949b;
            dmb dmb2 = dmb.f13483f;
            dmb.f13485a |= 8;
            dmb.f13489e = i7;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn6 = (dmn) bxvd.f164949b;
            dmb dmb3 = (dmb) bxvd4.mo74062i();
            dmn dmn7 = dmn.f13549v;
            dmb3.getClass();
            dmn6.mo9282d();
            dmn6.f13563m.set(i6, dmb3);
        }
        for (int i8 = 0; i8 < ((dmn) bxvd.f164949b).f13561k.size(); i8++) {
            dmp k = bxvd.mo74072k(i8);
            bxvd bxvd5 = (bxvd) k.mo74142c(5);
            bxvd5.mo73625a((bxvk) k);
            int i9 = this.f13343f;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            dmp dmp = (dmp) bxvd5.f164949b;
            dmp dmp2 = dmp.f13579f;
            dmp.f13581a |= 8;
            dmp.f13585e = i9;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn8 = (dmn) bxvd.f164949b;
            dmp dmp3 = (dmp) bxvd5.mo74062i();
            dmn dmn9 = dmn.f13549v;
            dmp3.getClass();
            dmn8.mo9281c();
            dmn8.f13561k.set(i8, dmp3);
        }
        for (int i10 = 0; i10 < ((dmn) bxvd.f164949b).f13570t.size(); i10++) {
            dmt p = bxvd.mo74095p(i10);
            bxvd bxvd6 = (bxvd) p.mo74142c(5);
            bxvd6.mo73625a((bxvk) p);
            int i11 = this.f13343f;
            if (bxvd6.f164950c) {
                bxvd6.mo74035c();
                bxvd6.f164950c = false;
            }
            dmt dmt = (dmt) bxvd6.f164949b;
            dmt dmt2 = dmt.f13604f;
            dmt.f13606a |= 4;
            dmt.f13610e = i11;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn10 = (dmn) bxvd.f164949b;
            dmt dmt3 = (dmt) bxvd6.mo74062i();
            dmn dmn11 = dmn.f13549v;
            dmt3.getClass();
            dmn10.mo9287i();
            dmn10.f13570t.set(i10, dmt3);
        }
        for (int i12 = 0; i12 < ((dmn) bxvd.f164949b).f13564n.size(); i12++) {
            dmi m = bxvd.mo74082m(i12);
            bxvd bxvd7 = (bxvd) m.mo74142c(5);
            bxvd7.mo73625a((bxvk) m);
            for (int i13 = 0; i13 < ((dmi) bxvd7.f164949b).f13536c.size(); i13++) {
                dmh g = bxvd7.mo74054g(i13);
                bxvd bxvd8 = (bxvd) g.mo74142c(5);
                bxvd8.mo73625a((bxvk) g);
                for (int i14 = 0; i14 < ((dmh) bxvd8.f164949b).f13531c.size(); i14++) {
                    dmg f = bxvd8.mo74050f(i14);
                    bxvd bxvd9 = (bxvd) f.mo74142c(5);
                    bxvd9.mo73625a((bxvk) f);
                    int i15 = this.f13343f;
                    if (bxvd9.f164950c) {
                        bxvd9.mo74035c();
                        bxvd9.f164950c = false;
                    }
                    dmg dmg = (dmg) bxvd9.f164949b;
                    dmg dmg2 = dmg.f13517i;
                    dmg.f13519a |= 64;
                    dmg.f13526h = i15;
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    dmh dmh = (dmh) bxvd8.f164949b;
                    dmg dmg3 = (dmg) bxvd9.mo74062i();
                    dmh dmh2 = dmh.f13527d;
                    dmg3.getClass();
                    dmh.mo9277a();
                    dmh.f13531c.set(i14, dmg3);
                }
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                dmi dmi = (dmi) bxvd7.f164949b;
                dmh dmh3 = (dmh) bxvd8.mo74062i();
                dmi dmi2 = dmi.f13532d;
                dmh3.getClass();
                dmi.mo9278a();
                dmi.f13536c.set(i13, dmh3);
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn12 = (dmn) bxvd.f164949b;
            dmi dmi3 = (dmi) bxvd7.mo74062i();
            dmn dmn13 = dmn.f13549v;
            dmi3.getClass();
            dmn12.mo9283e();
            dmn12.f13564n.set(i12, dmi3);
        }
        for (int i16 = 0; i16 < ((dmn) bxvd.f164949b).f13566p.size(); i16++) {
            dmd n = bxvd.mo74087n(i16);
            bxvd bxvd10 = (bxvd) n.mo74142c(5);
            bxvd10.mo73625a((bxvk) n);
            int i17 = this.f13343f;
            if (bxvd10.f164950c) {
                bxvd10.mo74035c();
                bxvd10.f164950c = false;
            }
            dmd dmd = (dmd) bxvd10.f164949b;
            dmd dmd2 = dmd.f13495g;
            dmd.f13497a |= 16;
            dmd.f13502f = i17;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn14 = (dmn) bxvd.f164949b;
            dmd dmd3 = (dmd) bxvd10.mo74062i();
            dmn dmn15 = dmn.f13549v;
            dmd3.getClass();
            dmn14.mo9284f();
            dmn14.f13566p.set(i16, dmd3);
        }
        for (int i18 = 0; i18 < ((dmn) bxvd.f164949b).f13568r.size(); i18++) {
            dmm dmm = (dmm) ((dmn) bxvd.f164949b).f13568r.get(i18);
            bxvd bxvd11 = (bxvd) dmm.mo74142c(5);
            bxvd11.mo73625a((bxvk) dmm);
            int i19 = this.f13343f;
            if (bxvd11.f164950c) {
                bxvd11.mo74035c();
                bxvd11.f164950c = false;
            }
            dmm dmm2 = (dmm) bxvd11.f164949b;
            dmm dmm3 = dmm.f13541g;
            dmm2.f13543a |= 128;
            dmm2.f13548f = i19;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn16 = (dmn) bxvd.f164949b;
            dmm dmm4 = (dmm) bxvd11.mo74062i();
            dmn dmn17 = dmn.f13549v;
            dmm4.getClass();
            dmn16.mo9285g();
            dmn16.f13568r.set(i18, dmm4);
        }
        for (int i20 = 0; i20 < ((dmn) bxvd.f164949b).f13569s.size(); i20++) {
            dme o = bxvd.mo74091o(i20);
            bxvd bxvd12 = (bxvd) o.mo74142c(5);
            bxvd12.mo73625a((bxvk) o);
            int i21 = this.f13343f;
            if (bxvd12.f164950c) {
                bxvd12.mo74035c();
                bxvd12.f164950c = false;
            }
            dme dme = (dme) bxvd12.f164949b;
            dme dme2 = dme.f13503d;
            dme.f13505a |= 2;
            dme.f13507c = i21;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn18 = (dmn) bxvd.f164949b;
            dme dme3 = (dme) bxvd12.mo74062i();
            dmn dmn19 = dmn.f13549v;
            dme3.getClass();
            dmn18.mo9286h();
            dmn18.f13569s.set(i20, dme3);
        }
        dmn dmn20 = (dmn) bxvd.f164949b;
        if ((dmn20.f13551a & 16) != 0) {
            dmc dmc = dmn20.f13571u;
            if (dmc == null) {
                dmc = dmc.f13490d;
            }
            bxvd bxvd13 = (bxvd) dmc.mo74142c(5);
            bxvd13.mo73625a((bxvk) dmc);
            int i22 = this.f13343f;
            if (bxvd13.f164950c) {
                bxvd13.mo74035c();
                bxvd13.f164950c = false;
            }
            dmc dmc2 = (dmc) bxvd13.f164949b;
            dmc2.f13492a |= 2;
            dmc2.f13494c = i22;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn21 = (dmn) bxvd.f164949b;
            dmc dmc3 = (dmc) bxvd13.mo74062i();
            dmn dmn22 = dmn.f13549v;
            dmc3.getClass();
            dmn21.f13571u = dmc3;
            dmn21.f13551a |= 16;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        dmn dmn23 = dmn.f13549v;
        ((dmn) bxvd.f164949b).f13556f = bxvk.m124030de();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((dmn) bxvd.f164949b).f13557g = bxvk.m124030de();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((dmn) bxvd.f164949b).f13558h = bxvk.m124030de();
        return (dmn) bxvd.mo74062i();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof djn) || compareTo((djn) obj) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13338a.hashCode() + this.f13339b;
    }

    public final String toString() {
        String str = !this.f13338a.equals("") ? this.f13338a : "built-in";
        int i = this.f13339b;
        String a = dff.m8283a(this.f13341d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(a).length());
        sb.append("module(");
        sb.append(str);
        sb.append(",v");
        sb.append(i);
        sb.append(",");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final int compareTo(djn djn) {
        int a;
        if (!m8656a(this.f13338a, djn.f13338a)) {
            return this.f13338a.compareTo(djn.f13338a);
        }
        bneu a2 = bneu.f131545b.mo67471a(djn.f13339b, this.f13339b).mo67471a(djn.f13341d.f13243m, this.f13341d.f13243m);
        int a3 = dim.m8578a(this.f13341d.f13241k);
        int i = 1;
        if (a3 == 0) {
            a3 = 1;
        }
        int i2 = a3 - 1;
        int a4 = dim.m8578a(djn.f13341d.f13241k);
        if (a4 != 0) {
            i = a4;
        }
        bneu a5 = a2.mo67471a(i2, i - 1);
        int a6 = dkc.m8723a(this.f13341d.f13239i);
        if (a6 != 0 && a6 == 2 && (a = dkc.m8723a(djn.f13341d.f13239i)) != 0 && a == 2) {
            a5 = a5.mo67471a(djn.f13341d.f13238h, this.f13341d.f13238h);
        }
        return a5.mo67472a(djn.f13341d.f13234d, this.f13341d.f13234d).mo67470a();
    }

    /* renamed from: a */
    public final boolean mo9131a(Collection collection, boolean z) {
        int i;
        boolean isEmpty = this.f13345i.isEmpty();
        if (isEmpty || collection.isEmpty()) {
            return isEmpty;
        }
        int size = this.f13345i.size();
        Iterator it = collection.iterator();
        dmo dmo = (dmo) it.next();
        int i2 = 0;
        int i3 = 0;
        do {
            dmr dmr = (dmr) this.f13345i.get(i2);
            int compareTo = dmr.f13595b.compareTo(dmo.f13575b);
            if (compareTo < 0) {
                i2++;
                if (!z) {
                    return false;
                }
            } else {
                if (compareTo == 0 && (i = dmo.f13576c) >= dmr.f13596c && i <= dmr.f13597d) {
                    if (z) {
                        this.f13345i.remove(i2);
                    } else {
                        i2++;
                    }
                    i3++;
                }
                dmo = it.hasNext() ? (dmo) it.next() : null;
            }
            if (i2 >= this.f13345i.size()) {
                break;
            }
        } while (dmo != null);
        if (i3 == size) {
            return true;
        }
        return false;
    }
}
