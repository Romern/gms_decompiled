package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: dmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmv {
    /* renamed from: a */
    public static dmg m8833a(dmf dmf) {
        bxvd da = dmg.f13517i.mo74144da();
        String str = dmf.f13511b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        dmg dmg = (dmg) da.f164949b;
        str.getClass();
        int i = dmg.f13519a | 1;
        dmg.f13519a = i;
        dmg.f13520b = str;
        if ((dmf.f13510a & 8) != 0) {
            int i2 = dmf.f13514e;
            i |= 2;
            dmg.f13519a = i;
            dmg.f13521c = i2;
        }
        if ((dmf.f13510a & 16) != 0) {
            boolean z = dmf.f13515f;
            i |= 4;
            dmg.f13519a = i;
            dmg.f13522d = z;
        }
        if ((dmf.f13510a & 32) != 0) {
            int i3 = dmf.f13516g;
            dmg.f13519a = i | 64;
            dmg.f13526h = i3;
        }
        return (dmg) da.mo74062i();
    }

    /* renamed from: b */
    public static String m8840b(String str, String str2) {
        if (str2 == null || str2.length() <= 0 || str2.charAt(0) != '.') {
            return str2;
        }
        String valueOf = String.valueOf(str);
        return str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2);
    }

    /* renamed from: c */
    public static List m8842c(List list, List list2) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            dmd dmd = (dmd) it.next();
            int binarySearch = Collections.binarySearch(arrayList, dmd, dma.f13480l);
            if (binarySearch >= 0) {
                String valueOf = String.valueOf(dmd.f13498b);
                throw new dmu(valueOf.length() == 0 ? new String("bound-service actions should be unique: ") : "bound-service actions should be unique: ".concat(valueOf));
            }
            arrayList.add((-binarySearch) - 1, dmd);
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List m8843d(List list, List list2) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            dmi dmi = (dmi) it.next();
            int binarySearch = Collections.binarySearch(arrayList, dmi, dma.f13475g);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
                bxvd da = dmi.f13532d.mo74144da();
                String str = dmi.f13535b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                dmi dmi2 = (dmi) da.f164949b;
                str.getClass();
                dmi2.f13534a |= 1;
                dmi2.f13535b = str;
                arrayList.add(binarySearch, (dmi) da.mo74062i());
            }
            bxwc bxwc = ((dmi) arrayList.get(binarySearch)).f13536c;
            bxwc bxwc2 = dmi.f13536c;
            ArrayList arrayList2 = new ArrayList(bxwc);
            int size = bxwc2.size();
            for (int i = 0; i < size; i++) {
                dmh dmh = (dmh) bxwc2.get(i);
                int binarySearch2 = Collections.binarySearch(arrayList2, dmh, dma.f13476h);
                if (binarySearch2 < 0) {
                    binarySearch2 = (-binarySearch2) - 1;
                    bxvd da2 = dmh.f13527d.mo74144da();
                    String str2 = dmh.f13530b;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    dmh dmh2 = (dmh) da2.f164949b;
                    str2.getClass();
                    dmh2.f13529a |= 1;
                    dmh2.f13530b = str2;
                    arrayList2.add(binarySearch2, (dmh) da2.mo74062i());
                }
                bxwc bxwc3 = ((dmh) arrayList2.get(binarySearch2)).f13531c;
                bxwc bxwc4 = dmh.f13531c;
                ArrayList arrayList3 = new ArrayList(bxwc3);
                int size2 = bxwc4.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dmg dmg = (dmg) bxwc4.get(i2);
                    int binarySearch3 = Collections.binarySearch(arrayList3, dmg, dma.f13477i);
                    if (binarySearch3 >= 0) {
                        String valueOf = String.valueOf(dmg.f13520b);
                        throw new dmu(valueOf.length() == 0 ? new String("Duplicate ModuleIntentOperation ") : "Duplicate ModuleIntentOperation ".concat(valueOf));
                    }
                    arrayList3.add((-binarySearch3) - 1, dmg);
                }
                dmh dmh3 = (dmh) arrayList2.get(binarySearch2);
                bxvd bxvd = (bxvd) dmh3.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) dmh3);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmh dmh4 = dmh.f13527d;
                ((dmh) bxvd.f164949b).f13531c = GeneratedMessageLite.m124030de();
                bxvd.mo74080l(arrayList3);
                arrayList2.set(binarySearch2, (dmh) bxvd.mo74062i());
            }
            dmi dmi3 = (dmi) arrayList.get(binarySearch);
            bxvd bxvd2 = (bxvd) dmi3.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) dmi3);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            dmi dmi4 = dmi.f13532d;
            ((dmi) bxvd2.f164949b).f13536c = GeneratedMessageLite.m124030de();
            bxvd2.mo74085m(arrayList2);
            arrayList.set(binarySearch, (dmi) bxvd2.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m8841b(List list, List list2) {
        C1225nr nrVar = new C1225nr();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nrVar.add(((dmp) it.next()).f13582b);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str = ((dmt) it2.next()).f13607b;
            if (nrVar.contains(str)) {
                String valueOf = String.valueOf(str);
                throw new dmu(valueOf.length() == 0 ? new String("Unexpected duplicated content-provider proxy from <module-provider> and <module-slice-provider> tags: ") : "Unexpected duplicated content-provider proxy from <module-provider> and <module-slice-provider> tags: ".concat(valueOf));
            }
        }
    }

    /* renamed from: a */
    public static String m8834a(String str, String str2) {
        int length;
        return (str2 == null || str == null || (length = str.length()) <= 0 || !str2.startsWith(str) || str2.charAt(length) != '.') ? str2 : str2.substring(length);
    }

    /* renamed from: a */
    public static List m8835a(List list) {
        if (list.isEmpty()) {
            return bngx.m109376e();
        }
        List a = m8836a(list, dma.f13469a);
        int size = a.size();
        int i = 0;
        String str = null;
        while (i < size) {
            dmr dmr = (dmr) a.get(i);
            if (dmr.f13597d < dmr.f13596c) {
                String str2 = dmr.f13595b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53);
                sb.append("Required-API entry for API '");
                sb.append(str2);
                sb.append("' has invalid max version");
                throw new dmu(sb.toString());
            } else if (str != null && dmr.f13595b.equals(str)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 38);
                sb2.append("Multiple <uses-api> entries for API '");
                sb2.append(str);
                sb2.append("'");
                throw new dmu(sb2.toString());
            } else {
                str = dmr.f13595b;
                i++;
            }
        }
        return a;
    }

    /* renamed from: a */
    public static List m8836a(List list, Comparator comparator) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, comparator);
        return arrayList;
    }

    /* renamed from: a */
    public static List m8837a(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            dmr dmr = (dmr) list2.get(i2);
            int binarySearch = Collections.binarySearch(arrayList, dmr, dma.f13469a);
            if (binarySearch < 0) {
                arrayList.add((-binarySearch) - 1, dmr);
            } else {
                dmr dmr2 = (dmr) arrayList.get(binarySearch);
                bxvd bxvd = (bxvd) dmr2.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) dmr2);
                int i3 = dmr.f13596c;
                dmr dmr3 = (dmr) bxvd.f164949b;
                int i4 = dmr3.f13597d;
                if (i3 > i4 || (i = dmr3.f13596c) > dmr.f13597d) {
                    String str = dmr.f13595b;
                    int i5 = dmr.f13597d;
                    int i6 = dmr3.f13596c;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 167);
                    sb.append("Can't merge <uses-api name='");
                    sb.append(str);
                    sb.append("'>. The requested API versions [");
                    sb.append(i3);
                    sb.append(",");
                    sb.append(i5);
                    sb.append("] are incompatible with the existing required API versions [");
                    sb.append(i6);
                    sb.append(",");
                    sb.append(i4);
                    sb.append("]");
                    throw new dmu(sb.toString());
                }
                if (i3 > i) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    dmr dmr4 = (dmr) bxvd.f164949b;
                    dmr dmr5 = dmr.f13592e;
                    dmr4.f13594a |= 2;
                    dmr4.f13596c = i3;
                }
                int i7 = ((dmr) bxvd.f164949b).f13597d;
                int i8 = dmr.f13597d;
                if (i7 > i8 && i8 != i7) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    dmr dmr6 = (dmr) bxvd.f164949b;
                    dmr dmr7 = dmr.f13592e;
                    dmr6.f13594a |= 4;
                    dmr6.f13597d = i8;
                }
                arrayList.set(binarySearch, (dmr) bxvd.mo74062i());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m8838a(String str, bxvd bxvd) {
        String str2 = ((dmn) bxvd.f164949b).f13565o;
        if (!str2.equals(str)) {
            for (int i = 0; i < ((dmn) bxvd.f164949b).f13559i.size(); i++) {
                dms i2 = bxvd.mo74063i(i);
                bxvd bxvd2 = (bxvd) i2.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) i2);
                String a = m8834a(str, m8840b(str2, ((dms) bxvd2.f164949b).f13602c));
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                dms dms = (dms) bxvd2.f164949b;
                dms dms2 = dms.f13598e;
                a.getClass();
                dms.f13600a |= 2;
                dms.f13602c = a;
                String a2 = m8834a(str, m8840b(str2, dms.f13601b));
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                dms dms3 = (dms) bxvd2.f164949b;
                a2.getClass();
                dms3.f13600a |= 1;
                dms3.f13601b = a2;
                dms dms4 = (dms) bxvd2.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmn dmn = (dmn) bxvd.f164949b;
                dmn dmn2 = dmn.f13549v;
                dms4.getClass();
                dmn.mo9279a();
                dmn.f13559i.set(i, dms4);
            }
            for (int i3 = 0; i3 < ((dmn) bxvd.f164949b).f13560j.size(); i3++) {
                dmq j = bxvd.mo74068j(i3);
                bxvd bxvd3 = (bxvd) j.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) j);
                String a3 = m8834a(str, m8840b(str2, ((dmq) bxvd3.f164949b).f13590c));
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                dmq dmq = (dmq) bxvd3.f164949b;
                dmq dmq2 = dmq.f13586e;
                a3.getClass();
                dmq.f13588a |= 2;
                dmq.f13590c = a3;
                String a4 = m8834a(str, m8840b(str2, dmq.f13589b));
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                dmq dmq3 = (dmq) bxvd3.f164949b;
                a4.getClass();
                dmq3.f13588a |= 1;
                dmq3.f13589b = a4;
                dmq dmq4 = (dmq) bxvd3.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmn dmn3 = (dmn) bxvd.f164949b;
                dmn dmn4 = dmn.f13549v;
                dmq4.getClass();
                dmn3.mo9280b();
                dmn3.f13560j.set(i3, dmq4);
            }
            for (int i4 = 0; i4 < ((dmn) bxvd.f164949b).f13561k.size(); i4++) {
                dmp k = bxvd.mo74072k(i4);
                bxvd bxvd4 = (bxvd) k.mo74142c(5);
                bxvd4.mo73625a((GeneratedMessageLite) k);
                String a5 = m8834a(str, m8840b(str2, ((dmp) bxvd4.f164949b).f13583c));
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                dmp dmp = (dmp) bxvd4.f164949b;
                dmp dmp2 = dmp.f13579f;
                a5.getClass();
                dmp.f13581a |= 2;
                dmp.f13583c = a5;
                String a6 = m8834a(str, m8840b(str2, dmp.f13582b));
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                dmp dmp3 = (dmp) bxvd4.f164949b;
                a6.getClass();
                dmp3.f13581a |= 1;
                dmp3.f13582b = a6;
                dmp dmp4 = (dmp) bxvd4.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmn dmn5 = (dmn) bxvd.f164949b;
                dmn dmn6 = dmn.f13549v;
                dmp4.getClass();
                dmn5.mo9281c();
                dmn5.f13561k.set(i4, dmp4);
            }
            for (int i5 = 0; i5 < ((dmn) bxvd.f164949b).f13570t.size(); i5++) {
                dmt p = bxvd.mo74095p(i5);
                bxvd bxvd5 = (bxvd) p.mo74142c(5);
                bxvd5.mo73625a((GeneratedMessageLite) p);
                String a7 = m8834a(str, m8840b(str2, ((dmt) bxvd5.f164949b).f13608c));
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                dmt dmt = (dmt) bxvd5.f164949b;
                dmt dmt2 = dmt.f13604f;
                a7.getClass();
                dmt.f13606a |= 2;
                dmt.f13608c = a7;
                String a8 = m8834a(str, m8840b(str2, dmt.f13607b));
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                dmt dmt3 = (dmt) bxvd5.f164949b;
                a8.getClass();
                dmt3.f13606a |= 1;
                dmt3.f13607b = a8;
                dmt dmt4 = (dmt) bxvd5.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmn dmn7 = (dmn) bxvd.f164949b;
                dmn dmn8 = dmn.f13549v;
                dmt4.getClass();
                dmn7.mo9287i();
                dmn7.f13570t.set(i5, dmt4);
            }
            for (int i6 = 0; i6 < ((dmn) bxvd.f164949b).f13563m.size(); i6++) {
                dmb l = bxvd.mo74078l(i6);
                bxvd bxvd6 = (bxvd) l.mo74142c(5);
                bxvd6.mo73625a((GeneratedMessageLite) l);
                String a9 = m8834a(str, m8840b(str2, ((dmb) bxvd6.f164949b).f13487c));
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                dmb dmb = (dmb) bxvd6.f164949b;
                dmb dmb2 = dmb.f13483f;
                a9.getClass();
                dmb.f13485a |= 2;
                dmb.f13487c = a9;
                String a10 = m8834a(str, m8840b(str2, dmb.f13486b));
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                dmb dmb3 = (dmb) bxvd6.f164949b;
                a10.getClass();
                dmb3.f13485a |= 1;
                dmb3.f13486b = a10;
                dmb dmb4 = (dmb) bxvd6.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmn dmn9 = (dmn) bxvd.f164949b;
                dmn dmn10 = dmn.f13549v;
                dmb4.getClass();
                dmn9.mo9282d();
                dmn9.f13563m.set(i6, dmb4);
            }
            for (int i7 = 0; i7 < ((dmn) bxvd.f164949b).f13562l.size(); i7++) {
                dmf dmf = (dmf) ((dmn) bxvd.f164949b).f13562l.get(i7);
                bxvd bxvd7 = (bxvd) dmf.mo74142c(5);
                bxvd7.mo73625a((GeneratedMessageLite) dmf);
                String a11 = m8834a(str, ((dmf) bxvd7.f164949b).f13511b);
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                dmf dmf2 = (dmf) bxvd7.f164949b;
                dmf dmf3 = dmf.f13508h;
                a11.getClass();
                dmf2.f13510a |= 1;
                dmf2.f13511b = a11;
                String a12 = m8834a(str, dmf2.f13512c);
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                dmf dmf4 = (dmf) bxvd7.f164949b;
                a12.getClass();
                dmf4.f13510a |= 2;
                dmf4.f13512c = a12;
                String a13 = m8834a(str, dmf4.f13513d);
                if (bxvd7.f164950c) {
                    bxvd7.mo74035c();
                    bxvd7.f164950c = false;
                }
                dmf dmf5 = (dmf) bxvd7.f164949b;
                a13.getClass();
                dmf5.f13510a |= 4;
                dmf5.f13513d = a13;
                dmf dmf6 = (dmf) bxvd7.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmn dmn11 = (dmn) bxvd.f164949b;
                dmn dmn12 = dmn.f13549v;
                dmf6.getClass();
                if (!dmn11.f13562l.mo73666a()) {
                    dmn11.f13562l = GeneratedMessageLite.m124021a(dmn11.f13562l);
                }
                dmn11.f13562l.set(i7, dmf6);
            }
            for (int i8 = 0; i8 < ((dmn) bxvd.f164949b).f13564n.size(); i8++) {
                dmi m = bxvd.mo74082m(i8);
                bxvd bxvd8 = (bxvd) m.mo74142c(5);
                bxvd8.mo73625a((GeneratedMessageLite) m);
                String a14 = m8834a(str, m8840b(str2, ((dmi) bxvd8.f164949b).f13535b));
                if (bxvd8.f164950c) {
                    bxvd8.mo74035c();
                    bxvd8.f164950c = false;
                }
                dmi dmi = (dmi) bxvd8.f164949b;
                dmi dmi2 = dmi.f13532d;
                a14.getClass();
                dmi.f13534a |= 1;
                dmi.f13535b = a14;
                for (int i9 = 0; i9 < ((dmi) bxvd8.f164949b).f13536c.size(); i9++) {
                    dmh g = bxvd8.mo74054g(i9);
                    bxvd bxvd9 = (bxvd) g.mo74142c(5);
                    bxvd9.mo73625a((GeneratedMessageLite) g);
                    String a15 = m8834a(str, m8840b(str2, ((dmh) bxvd9.f164949b).f13530b));
                    if (bxvd9.f164950c) {
                        bxvd9.mo74035c();
                        bxvd9.f164950c = false;
                    }
                    dmh dmh = (dmh) bxvd9.f164949b;
                    dmh dmh2 = dmh.f13527d;
                    a15.getClass();
                    dmh.f13529a |= 1;
                    dmh.f13530b = a15;
                    for (int i10 = 0; i10 < ((dmh) bxvd9.f164949b).f13531c.size(); i10++) {
                        dmg f = bxvd9.mo74050f(i10);
                        bxvd bxvd10 = (bxvd) f.mo74142c(5);
                        bxvd10.mo73625a((GeneratedMessageLite) f);
                        String a16 = m8834a(str, m8840b(str2, ((dmg) bxvd10.f164949b).f13520b));
                        if (bxvd10.f164950c) {
                            bxvd10.mo74035c();
                            bxvd10.f164950c = false;
                        }
                        dmg dmg = (dmg) bxvd10.f164949b;
                        dmg dmg2 = dmg.f13517i;
                        a16.getClass();
                        dmg.f13519a |= 1;
                        dmg.f13520b = a16;
                        dmg dmg3 = (dmg) bxvd10.mo74062i();
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        dmh dmh3 = (dmh) bxvd9.f164949b;
                        dmg3.getClass();
                        dmh3.mo9277a();
                        dmh3.f13531c.set(i10, dmg3);
                    }
                    dmh dmh4 = (dmh) bxvd9.mo74062i();
                    if (bxvd8.f164950c) {
                        bxvd8.mo74035c();
                        bxvd8.f164950c = false;
                    }
                    dmi dmi3 = (dmi) bxvd8.f164949b;
                    dmh4.getClass();
                    dmi3.mo9278a();
                    dmi3.f13536c.set(i9, dmh4);
                }
                dmi dmi4 = (dmi) bxvd8.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmn dmn13 = (dmn) bxvd.f164949b;
                dmn dmn14 = dmn.f13549v;
                dmi4.getClass();
                dmn13.mo9283e();
                dmn13.f13564n.set(i8, dmi4);
            }
            for (int i11 = 0; i11 < ((dmn) bxvd.f164949b).f13566p.size(); i11++) {
                dmd n = bxvd.mo74087n(i11);
                bxvd bxvd11 = (bxvd) n.mo74142c(5);
                bxvd11.mo73625a((GeneratedMessageLite) n);
                String a17 = m8834a(str, m8840b(str2, ((dmd) bxvd11.f164949b).f13499c));
                if (bxvd11.f164950c) {
                    bxvd11.mo74035c();
                    bxvd11.f164950c = false;
                }
                dmd dmd = (dmd) bxvd11.f164949b;
                dmd dmd2 = dmd.f13495g;
                a17.getClass();
                dmd.f13497a |= 2;
                dmd.f13499c = a17;
                String a18 = m8834a(str, m8840b(str2, dmd.f13498b));
                if (bxvd11.f164950c) {
                    bxvd11.mo74035c();
                    bxvd11.f164950c = false;
                }
                dmd dmd3 = (dmd) bxvd11.f164949b;
                a18.getClass();
                dmd3.f13497a |= 1;
                dmd3.f13498b = a18;
                String a19 = m8834a(str, m8840b(str2, dmd3.f13500d));
                if (bxvd11.f164950c) {
                    bxvd11.mo74035c();
                    bxvd11.f164950c = false;
                }
                dmd dmd4 = (dmd) bxvd11.f164949b;
                a19.getClass();
                dmd4.f13497a |= 4;
                dmd4.f13500d = a19;
                dmd dmd5 = (dmd) bxvd11.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmn dmn15 = (dmn) bxvd.f164949b;
                dmn dmn16 = dmn.f13549v;
                dmd5.getClass();
                dmn15.mo9284f();
                dmn15.f13566p.set(i11, dmd5);
            }
            for (int i12 = 0; i12 < ((dmn) bxvd.f164949b).f13569s.size(); i12++) {
                dme o = bxvd.mo74091o(i12);
                bxvd bxvd12 = (bxvd) o.mo74142c(5);
                bxvd12.mo73625a((GeneratedMessageLite) o);
                String a20 = m8834a(str, m8840b(str2, ((dme) bxvd12.f164949b).f13506b));
                if (bxvd12.f164950c) {
                    bxvd12.mo74035c();
                    bxvd12.f164950c = false;
                }
                dme dme = (dme) bxvd12.f164949b;
                dme dme2 = dme.f13503d;
                a20.getClass();
                dme.f13505a |= 1;
                dme.f13506b = a20;
                dme dme3 = (dme) bxvd12.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmn dmn17 = (dmn) bxvd.f164949b;
                dmn dmn18 = dmn.f13549v;
                dme3.getClass();
                dmn17.mo9286h();
                dmn17.f13569s.set(i12, dme3);
            }
            dmn dmn19 = (dmn) bxvd.f164949b;
            if ((dmn19.f13551a & 16) != 0) {
                dmc dmc = dmn19.f13571u;
                if (dmc == null) {
                    dmc = dmc.f13490d;
                }
                bxvd bxvd13 = (bxvd) dmc.mo74142c(5);
                bxvd13.mo73625a((GeneratedMessageLite) dmc);
                String a21 = m8834a(str, m8840b(str2, ((dmc) bxvd13.f164949b).f13493b));
                if (bxvd13.f164950c) {
                    bxvd13.mo74035c();
                    bxvd13.f164950c = false;
                }
                dmc dmc2 = (dmc) bxvd13.f164949b;
                a21.getClass();
                dmc2.f13492a |= 1;
                dmc2.f13493b = a21;
                dmc dmc3 = (dmc) bxvd13.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                dmn dmn20 = (dmn) bxvd.f164949b;
                dmn dmn21 = dmn.f13549v;
                dmc3.getClass();
                dmn20.f13571u = dmc3;
                dmn20.f13551a |= 16;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            dmn dmn22 = (dmn) bxvd.f164949b;
            dmn dmn23 = dmn.f13549v;
            str.getClass();
            dmn22.f13551a |= 8;
            dmn22.f13565o = str;
        }
    }

    /* renamed from: a */
    public static void m8839a(Collection collection, List list) {
        C1225nr nrVar = new C1225nr();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            nrVar.add(((dmr) it.next()).f13595b);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = ((dmr) it2.next()).f13595b;
            if (nrVar.contains(str)) {
                String valueOf = String.valueOf(str);
                throw new dmu(valueOf.length() == 0 ? new String("Unexpected duplicated required api from <uses-api> and <uses-api optional='true'> tags: ") : "Unexpected duplicated required api from <uses-api> and <uses-api optional='true'> tags: ".concat(valueOf));
            }
        }
    }
}
