package p000;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: axf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axf {

    /* renamed from: a */
    private static final Map f2483a = new HashMap();

    static {
        axp axp = new axp();
        axp.mo2849i();
        f2483a.put("dc:contributor", axp);
        f2483a.put("dc:language", axp);
        f2483a.put("dc:publisher", axp);
        f2483a.put("dc:relation", axp);
        f2483a.put("dc:subject", axp);
        f2483a.put("dc:type", axp);
        axp axp2 = new axp();
        axp2.mo2849i();
        axp2.mo2852l();
        f2483a.put("dc:creator", axp2);
        f2483a.put("dc:date", axp2);
        axp axp3 = new axp();
        axp3.mo2849i();
        axp3.mo2852l();
        axp3.mo2851k();
        axp3.mo2850j();
        f2483a.put("dc:description", axp3);
        f2483a.put("dc:rights", axp3);
        f2483a.put("dc:title", axp3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axe.a(axd, java.lang.String, boolean):axd
     arg types: [axd, java.lang.String, int]
     candidates:
      axe.a(axd, java.lang.String, java.lang.String):void
      axe.a(axd, java.lang.String, boolean):axd */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axe.a(axd, java.lang.String, java.lang.String, boolean):axd
     arg types: [axd, java.lang.String, ?[OBJECT, ARRAY], int]
     candidates:
      axe.a(axd, axj, boolean, axp):axd
      axe.a(axd, java.lang.String, java.lang.String, boolean):axd */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axf.a(axd, axd, boolean):void
     arg types: [axd, axd, int]
     candidates:
      axf.a(java.util.Iterator, axd, axd):void
      axf.a(axd, axd, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axe.a(axd, axj, boolean, axp):axd
     arg types: [axd, axj, int, ?[OBJECT, ARRAY]]
     candidates:
      axe.a(axd, java.lang.String, java.lang.String, boolean):axd
      axe.a(axd, axj, boolean, axp):axd */
    /* renamed from: a */
    static void m2361a(axa axa, axo axo) {
        axd axd;
        String str;
        String str2;
        axd axd2;
        axa axa2 = axa;
        axd axd3 = axa2.f2469a;
        boolean z = true;
        axe.m2357a(axd3, "http://purl.org/dc/elements/1.1/", true);
        Iterator f = axa2.f2469a.mo2807f();
        while (f.hasNext()) {
            axd axd4 = (axd) f.next();
            if ("http://purl.org/dc/elements/1.1/".equals(axd4.f2473a)) {
                for (int i = 1; i <= axd4.mo2799c(); i++) {
                    axd a = axd4.mo2791a(i);
                    axp axp = (axp) f2483a.get(a.f2473a);
                    if (axp != null) {
                        if ((a.mo2810i().f2502a & 768) == 0) {
                            axd axd5 = new axd(a.f2473a, axp);
                            a.f2473a = "[]";
                            axd5.mo2794a(a);
                            axd5.f2475c = axd4;
                            axd4.mo2811j().set(i - 1, axd5);
                            if (axp.mo2846f() && !a.mo2810i().mo2839a()) {
                                a.mo2800c(new axd("xml:lang", "x-default", null));
                            }
                        } else {
                            a.mo2810i().mo2828a(7680, false);
                            a.mo2810i().mo2837a(axp);
                            if (axp.mo2846f()) {
                                m2362a(a);
                            }
                        }
                    }
                }
                z = true;
            } else if ("http://ns.adobe.com/exif/1.0/".equals(axd4.f2473a)) {
                axd b = axe.m2360b(axd4, "exif:GPSTimeStamp", false);
                if (b != null) {
                    try {
                        awz a2 = awq.m2280a(b.f2474b);
                        if (a2.f2461a == 0 && a2.f2462b == 0 && a2.f2463c == 0) {
                            axd b2 = axe.m2360b(axd4, "exif:DateTimeOriginal", false);
                            if (b2 == null) {
                                b2 = axe.m2360b(axd4, "exif:DateTimeDigitized", false);
                            }
                            awz a3 = awq.m2280a(b2.f2474b);
                            Calendar a4 = a2.mo2781a();
                            a4.set(1, a3.f2461a);
                            a4.set(2, a3.f2462b);
                            a4.set(5, a3.f2463c);
                            b.f2474b = awt.m2286a(new awz(a4));
                        }
                    } catch (awn e) {
                    }
                }
                axd b3 = axe.m2360b(axd4, "exif:UserComment", false);
                if (b3 != null) {
                    m2362a(b3);
                    z = true;
                } else {
                    z = true;
                }
            } else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(axd4.f2473a)) {
                axd b4 = axe.m2360b(axd4, "xmpDM:copyright", false);
                if (b4 != null) {
                    try {
                        axd a5 = axe.m2357a(axa2.f2469a, "http://purl.org/dc/elements/1.1/", z);
                        String str3 = b4.f2474b;
                        axd b5 = axe.m2360b(a5, "dc:rights", false);
                        if (b5 == null) {
                            str = "\n\n";
                        } else if (b5.mo2806e()) {
                            int a6 = axe.m2354a(b5, "x-default");
                            if (a6 < 0) {
                                axd2 = b5;
                                str2 = "\n\n";
                                axa.mo2762a("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", b5.mo2791a(z ? 1 : 0).f2474b);
                                a6 = axe.m2354a(axd2, "x-default");
                            } else {
                                axd2 = b5;
                                str2 = "\n\n";
                            }
                            axd a7 = axd2.mo2791a(a6);
                            String str4 = a7.f2474b;
                            int indexOf = str4.indexOf(str2);
                            if (indexOf >= 0) {
                                int i2 = indexOf + 2;
                                if (!str4.substring(i2).equals(str3)) {
                                    String valueOf = String.valueOf(str4.substring(0, i2));
                                    String valueOf2 = String.valueOf(str3);
                                    a7.f2474b = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                                }
                            } else if (!str3.equals(str4)) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 2 + String.valueOf(str3).length());
                                sb.append(str4);
                                sb.append(str2);
                                sb.append(str3);
                                a7.f2474b = sb.toString();
                            }
                            b4.f2475c.mo2798b(b4);
                            z = true;
                        } else {
                            str = "\n\n";
                        }
                        String valueOf3 = String.valueOf(str3);
                        axa.mo2762a("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", valueOf3.length() == 0 ? new String(str) : str.concat(valueOf3));
                        b4.f2475c.mo2798b(b4);
                        z = true;
                    } catch (awn e2) {
                        z = true;
                    }
                } else {
                    z = true;
                }
            } else if ("http://ns.adobe.com/xap/1.0/rights/".equals(axd4.f2473a)) {
                axd b6 = axe.m2360b(axd4, "xmpRights:UsageTerms", false);
                if (b6 != null) {
                    m2362a(b6);
                    z = true;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        if (axd3.f2479g) {
            axd3.f2479g = false;
            boolean a8 = axo.mo2829a(4);
            for (axd axd6 : Collections.unmodifiableList(new ArrayList(axd3.mo2811j()))) {
                if (axd6.f2479g) {
                    Iterator f2 = axd6.mo2807f();
                    while (f2.hasNext()) {
                        axd axd7 = (axd) f2.next();
                        if (axd7.f2480h) {
                            axd7.f2480h = false;
                            axg c = awp.f2450a.mo2817c(axd7.f2473a);
                            if (c != null) {
                                axd a9 = axe.m2356a(axd3, c.f2484a, (String) null, true);
                                a9.f2478f = false;
                                String str5 = c.f2485b;
                                String str6 = c.f2486c;
                                axd b7 = axe.m2360b(a9, str6.length() == 0 ? new String(str5) : str5.concat(str6), false);
                                if (b7 == null) {
                                    if (c.f2487d.mo2824a()) {
                                        String str7 = c.f2485b;
                                        String str8 = c.f2486c;
                                        axd7.f2473a = str8.length() == 0 ? new String(str7) : str7.concat(str8);
                                        a9.mo2794a(axd7);
                                        f2.remove();
                                    } else {
                                        String str9 = c.f2485b;
                                        String str10 = c.f2486c;
                                        axd axd8 = new axd(str10.length() == 0 ? new String(str9) : str9.concat(str10), c.f2487d.mo2826c());
                                        a9.mo2794a(axd8);
                                        m2364a(f2, axd7, axd8);
                                    }
                                } else if (!c.f2487d.mo2824a()) {
                                    if (c.f2487d.mo2825b()) {
                                        int a10 = axe.m2354a(b7, "x-default");
                                        axd = a10 != -1 ? b7.mo2791a(a10) : null;
                                    } else {
                                        axd = b7.mo2806e() ? b7.mo2791a(1) : null;
                                    }
                                    if (axd == null) {
                                        m2364a(f2, axd7, b7);
                                    } else {
                                        if (a8) {
                                            m2363a(axd7, axd, true);
                                        }
                                        f2.remove();
                                    }
                                } else {
                                    if (a8) {
                                        m2363a(axd7, b7, true);
                                    }
                                    f2.remove();
                                }
                            }
                        }
                    }
                    axd6.f2479g = false;
                }
            }
        }
        String str11 = axd3.f2473a;
        if (str11 != null && str11.length() >= 36) {
            String lowerCase = axd3.f2473a.toLowerCase();
            if (lowerCase.startsWith("uuid:")) {
                lowerCase = lowerCase.substring(5);
            }
            if (awy.m2311c(lowerCase)) {
                axd a11 = axe.m2355a(axd3, axk.m2373a("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, (axp) null);
                if (a11 != null) {
                    a11.f2477e = null;
                    String valueOf4 = String.valueOf(lowerCase);
                    a11.f2474b = valueOf4.length() == 0 ? new String("uuid:") : "uuid:".concat(valueOf4);
                    a11.mo2797b();
                    axp i3 = a11.mo2810i();
                    i3.mo2840b(false);
                    i3.mo2838a(false);
                    i3.mo2842c(false);
                    a11.f2476d = null;
                    axd3.f2473a = null;
                } else {
                    throw new awn("Failure creating xmpMM:InstanceID", 9);
                }
            }
        }
        Iterator f3 = axd3.mo2807f();
        while (f3.hasNext()) {
            if (!((axd) f3.next()).mo2806e()) {
                f3.remove();
            }
        }
    }

    /* renamed from: a */
    private static void m2362a(axd axd) {
        if (axd != null && axd.mo2810i().mo2843c()) {
            axp i = axd.mo2810i();
            i.mo2852l();
            i.mo2851k();
            i.mo2850j();
            Iterator f = axd.mo2807f();
            while (f.hasNext()) {
                axd axd2 = (axd) f.next();
                if (axd2.mo2810i().mo2848h()) {
                    f.remove();
                } else if (!axd2.mo2810i().mo2839a()) {
                    String str = axd2.f2474b;
                    if (str == null || str.length() == 0) {
                        f.remove();
                    } else {
                        axd2.mo2800c(new axd("xml:lang", "x-repair", null));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axf.a(axd, axd, boolean):void
     arg types: [axd, axd, int]
     candidates:
      axf.a(java.util.Iterator, axd, axd):void
      axf.a(axd, axd, boolean):void */
    /* renamed from: a */
    private static void m2363a(axd axd, axd axd2, boolean z) {
        if (!axd.f2474b.equals(axd2.f2474b) || axd.mo2799c() != axd2.mo2799c()) {
            throw new awn("Mismatch between alias and base nodes", 203);
        } else if (!z && (!axd.f2473a.equals(axd2.f2473a) || !axd.mo2810i().equals(axd2.mo2810i()) || axd.mo2803d() != axd2.mo2803d())) {
            throw new awn("Mismatch between alias and base nodes", 203);
        } else {
            Iterator f = axd.mo2807f();
            Iterator f2 = axd2.mo2807f();
            while (f.hasNext() && f2.hasNext()) {
                m2363a((axd) f.next(), (axd) f2.next(), false);
            }
            Iterator h = axd.mo2809h();
            Iterator h2 = axd2.mo2809h();
            while (h.hasNext() && h2.hasNext()) {
                m2363a((axd) h.next(), (axd) h2.next(), false);
            }
        }
    }

    /* renamed from: a */
    private static void m2364a(Iterator it, axd axd, axd axd2) {
        if (axd2.mo2810i().mo2846f()) {
            if (!axd.mo2810i().mo2839a()) {
                axd.mo2800c(new axd("xml:lang", "x-default", null));
            } else {
                throw new awn("Alias to x-default already has a language qualifier", 203);
            }
        }
        it.remove();
        axd.f2473a = "[]";
        axd2.mo2794a(axd);
    }
}
