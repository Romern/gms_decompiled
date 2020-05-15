package p000;

import java.util.Calendar;
import java.util.Iterator;

/* renamed from: axa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axa implements awo {

    /* renamed from: a */
    public final axd f2469a;

    public axa() {
        this.f2469a = new axd(null, null, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axe.a(axd, axj, boolean, axp):axd
     arg types: [axd, axj, int, ?[OBJECT, ARRAY]]
     candidates:
      axe.a(axd, java.lang.String, java.lang.String, boolean):axd
      axe.a(axd, axj, boolean, axp):axd */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo2786a(String str, String str2, int i) {
        int i2;
        long j;
        awv.m2290b(str);
        awv.m2289a(str2);
        boolean z = false;
        axd a = axe.m2355a(this.f2469a, axk.m2373a(str, str2), false, (axp) null);
        if (a == null) {
            return null;
        }
        if (i != 0 && a.mo2810i().mo2848h()) {
            throw new awn("Property must be simple when a value type is requested", 102);
        }
        String str3 = a.f2474b;
        switch (i) {
            case 1:
                if (str3 == null || str3.length() == 0) {
                    throw new awn("Empty convert-string", 5);
                }
                String lowerCase = str3.toLowerCase();
                try {
                    if (Integer.parseInt(lowerCase) != 0) {
                        z = true;
                    }
                } catch (NumberFormatException e) {
                    if ("true".equals(lowerCase) || "t".equals(lowerCase) || "on".equals(lowerCase) || "yes".equals(lowerCase)) {
                        z = true;
                    }
                }
                return new Boolean(z);
            case 2:
                if (str3 != null) {
                    try {
                        if (str3.length() != 0) {
                            if (str3.startsWith("0x")) {
                                i2 = Integer.parseInt(str3.substring(2), 16);
                            } else {
                                i2 = Integer.parseInt(str3);
                            }
                            return new Integer(i2);
                        }
                    } catch (NumberFormatException e2) {
                        throw new awn("Invalid integer string", 5);
                    }
                }
                throw new awn("Empty convert-string", 5);
            case 3:
                if (str3 != null) {
                    try {
                        if (str3.length() != 0) {
                            if (str3.startsWith("0x")) {
                                j = Long.parseLong(str3.substring(2), 16);
                            } else {
                                j = Long.parseLong(str3);
                            }
                            return new Long(j);
                        }
                    } catch (NumberFormatException e3) {
                        throw new awn("Invalid long string", 5);
                    }
                }
                throw new awn("Empty convert-string", 5);
            case 4:
                if (str3 != null) {
                    try {
                        if (str3.length() != 0) {
                            return new Double(Double.parseDouble(str3));
                        }
                    } catch (NumberFormatException e4) {
                        throw new awn("Invalid double string", 5);
                    }
                }
                throw new awn("Empty convert-string", 5);
            case 5:
                return awq.m2280a(str3);
            case 6:
                return awq.m2280a(str3).mo2781a();
            default:
                if (str3 != null || a.mo2810i().mo2848h()) {
                    return str3;
                }
                return "";
        }
    }

    /* renamed from: b */
    public final Boolean mo2764b(String str, String str2) {
        return (Boolean) mo2786a(str, str2, 1);
    }

    /* renamed from: c */
    public final Integer mo2765c(String str, String str2) {
        return (Integer) mo2786a(str, str2, 2);
    }

    public final Object clone() {
        return new axa((axd) this.f2469a.clone());
    }

    /* renamed from: d */
    public final Double mo2766d(String str, String str2) {
        return (Double) mo2786a(str, str2, 4);
    }

    /* renamed from: e */
    public final void mo2767e(String str, String str2) {
        String str3 = (String) mo2786a(str, str2, 0);
    }

    /* renamed from: f */
    public final void mo2768f(String str, String str2) {
        Calendar calendar = (Calendar) mo2786a(str, str2, 6);
    }

    public axa(axd axd) {
        this.f2469a = axd;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axe.a(axd, axj, boolean, axp):axd
     arg types: [axd, axj, int, axp]
     candidates:
      axe.a(axd, java.lang.String, java.lang.String, boolean):axd
      axe.a(axd, axj, boolean, axp):axd */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        throw new p000.awn("Language qualifier must be first", 102);
     */
    /* renamed from: a */
    public final void mo2762a(String str, String str2, String str3, String str4, String str5) {
        axd axd;
        boolean z;
        Object[] objArr;
        String str6;
        String str7 = str5;
        awv.m2290b(str);
        if (str2.length() == 0) {
            throw new awn("Empty array name", 4);
        } else if (str4.length() != 0) {
            String a = awy.m2306a(str3);
            String a2 = awy.m2306a(str4);
            axd a3 = axe.m2355a(this.f2469a, axk.m2373a(str, str2), true, new axp(7680));
            if (a3 != null) {
                if (!a3.mo2810i().mo2846f()) {
                    if (a3.mo2806e() || !a3.mo2810i().mo2845e()) {
                        throw new awn("Specified property is no alt-text array", 102);
                    }
                    a3.mo2810i().mo2850j();
                }
                Iterator f = a3.mo2807f();
                while (true) {
                    if (!f.hasNext()) {
                        axd = null;
                        z = false;
                        break;
                    }
                    axd = (axd) f.next();
                    if (axd.mo2808g() && "xml:lang".equals(axd.mo2795b(1).f2473a)) {
                        if ("x-default".equals(axd.mo2795b(1).f2474b)) {
                            z = true;
                            break;
                        }
                    }
                }
                if (axd != null && a3.mo2799c() > 1) {
                    a3.mo2798b(axd);
                    a3.mo2805e(axd);
                }
                if (a3.mo2810i().mo2846f()) {
                    if (!a3.mo2806e()) {
                        objArr = new Object[]{new Integer(0), null};
                    } else {
                        Iterator f2 = a3.mo2807f();
                        axd axd2 = null;
                        axd axd3 = null;
                        int i = 0;
                        while (true) {
                            if (f2.hasNext()) {
                                axd axd4 = (axd) f2.next();
                                if (axd4.mo2810i().mo2848h()) {
                                    throw new awn("Alt-text array item is not simple", 102);
                                } else if (axd4.mo2808g() && "xml:lang".equals(axd4.mo2795b(1).f2473a)) {
                                    String str8 = axd4.mo2795b(1).f2474b;
                                    if (a2.equals(str8)) {
                                        objArr = new Object[]{new Integer(1), axd4};
                                        break;
                                    } else if (a != null && str8.startsWith(a)) {
                                        if (axd2 == null) {
                                            axd2 = axd4;
                                        }
                                        i++;
                                    } else if ("x-default".equals(str8)) {
                                        axd3 = axd4;
                                    }
                                }
                            } else {
                                objArr = i == 1 ? new Object[]{new Integer(2), axd2} : i > 1 ? new Object[]{new Integer(3), axd2} : axd3 == null ? new Object[]{new Integer(5), a3.mo2791a(1)} : new Object[]{new Integer(4), axd3};
                            }
                        }
                        throw new awn("Alt-text array item has no language qualifier", 102);
                    }
                    int intValue = ((Integer) objArr[0]).intValue();
                    axd axd5 = (axd) objArr[1];
                    boolean equals = "x-default".equals(a2);
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue == 2) {
                                if (z && axd != axd5 && axd != null && axd.f2474b.equals(axd5.f2474b)) {
                                    axd.f2474b = str7;
                                }
                                axd5.f2474b = str7;
                            } else if (intValue == 3) {
                                axe.m2359a(a3, a2, str7);
                                if (equals) {
                                    return;
                                }
                            } else if (intValue == 4) {
                                if (axd != null && a3.mo2799c() == 1) {
                                    axd.f2474b = str7;
                                }
                                axe.m2359a(a3, a2, str7);
                            } else if (intValue == 5) {
                                axe.m2359a(a3, a2, str7);
                                if (equals) {
                                    return;
                                }
                            } else {
                                throw new awn("Unexpected result from ChooseLocalizedText", 9);
                            }
                        } else if (equals) {
                            Iterator f3 = a3.mo2807f();
                            while (f3.hasNext()) {
                                axd axd6 = (axd) f3.next();
                                if (axd6 != axd) {
                                    String str9 = axd6.f2474b;
                                    if (axd != null) {
                                        str6 = axd.f2474b;
                                    } else {
                                        str6 = null;
                                    }
                                    if (str9.equals(str6)) {
                                        axd6.f2474b = str7;
                                    }
                                }
                            }
                            if (axd != null) {
                                axd.f2474b = str7;
                            }
                        } else {
                            if (z && axd != axd5 && axd != null && axd.f2474b.equals(axd5.f2474b)) {
                                axd.f2474b = str7;
                            }
                            axd5.f2474b = str7;
                        }
                        if (!z && a3.mo2799c() == 1) {
                            axe.m2359a(a3, "x-default", str7);
                            return;
                        }
                        return;
                    }
                    axe.m2359a(a3, "x-default", str7);
                    if (!equals) {
                        axe.m2359a(a3, a2, str7);
                        return;
                    }
                    return;
                }
                throw new awn("Localized text array is not alt-text", 102);
            }
            throw new awn("Failed to find or create array node", 102);
        } else {
            throw new awn("Empty specific language", 4);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axe.a(axd, axj, boolean, axp):axd
     arg types: [axd, axj, int, ?[OBJECT, ARRAY]]
     candidates:
      axe.a(axd, java.lang.String, java.lang.String, boolean):axd
      axe.a(axd, axj, boolean, axp):axd */
    /* renamed from: a */
    public final boolean mo2763a(String str, String str2) {
        try {
            awv.m2290b(str);
            awv.m2289a(str2);
            if (axe.m2355a(this.f2469a, axk.m2373a(str, str2), false, (axp) null) != null) {
                return true;
            }
            return false;
        } catch (awn e) {
            return false;
        }
    }
}
