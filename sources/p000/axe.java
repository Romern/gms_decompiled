package p000;

import java.util.Iterator;

/* renamed from: axe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axe {
    /* renamed from: a */
    static int m2354a(axd axd, String str) {
        if (axd.mo2810i().mo2843c()) {
            for (int i = 1; i <= axd.mo2799c(); i++) {
                axd a = axd.mo2791a(i);
                if (a.mo2808g() && "xml:lang".equals(a.mo2795b(1).f2473a) && str.equals(a.mo2795b(1).f2474b)) {
                    return i;
                }
            }
            return -1;
        }
        throw new awn("Language item must be used on array", 102);
    }

    /* renamed from: b */
    static axd m2360b(axd axd, String str, boolean z) {
        if (!axd.mo2810i().mo2847g() && !axd.mo2810i().mo2841b()) {
            if (!axd.f2478f) {
                throw new awn("Named children only allowed for schemas and structs", 102);
            } else if (axd.mo2810i().mo2843c()) {
                throw new awn("Named children not allowed for arrays", 102);
            } else if (z) {
                axd.mo2810i().mo2844d(true);
            }
        }
        axd a = axd.mo2792a(str);
        if (a != null || !z) {
            return a;
        }
        axd axd2 = new axd(str, new axp());
        axd2.f2478f = true;
        axd.mo2794a(axd2);
        return axd2;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:143:0x01de */
    /* JADX WARN: Type inference failed for: r8v0, assign insn: 0x0028: CONST  (r8v0 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int], assign insn: PHI: (r8v1 ?) = (r8v0 ?), (r8v22 ?) binds: [B:8:0x0028, B:119:0x01de] */
    /* JADX WARN: Type inference failed for: r8v22, assign insn: ?: MOVE  (r8v22 ?) = (r8v2 boolean) */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    static axd m2355a(axd axd, axj axj, boolean z, axp axp) {
        axd axd2;
        boolean z2;
        int i;
        axj axj2 = axj;
        boolean z3 = z;
        if (axj.mo2818a() != 0) {
            axd a = m2357a(axd, axj2.mo2819a(0).f2498a, z3);
            axp axp2 = null;
            if (a == null) {
                return null;
            }
            if (a.f2478f) {
                a.f2478f = false;
                axd2 = a;
            } else {
                axd2 = null;
            }
            ? r8 = 1;
            int i2 = 1;
            while (i2 < axj.mo2818a()) {
                try {
                    axl a2 = axj2.mo2819a(i2);
                    int i3 = a2.f2499b;
                    if (i3 == r8) {
                        a = m2360b(a, a2.f2498a, z3);
                    } else if (i3 == 2) {
                        String substring = a2.f2498a.substring(r8);
                        axd b = a.mo2796b(substring);
                        if (b == null) {
                            if (z3) {
                                axd axd3 = new axd(substring, axp2);
                                axd3.f2478f = r8;
                                a.mo2800c(axd3);
                                a = axd3;
                            }
                        }
                        a = b;
                    } else if (a.mo2810i().mo2843c()) {
                        if (i3 == 3) {
                            String str = a2.f2498a;
                            i = Integer.parseInt(str.substring(r8, str.length() - 1));
                            if (i <= 0) {
                                throw new awn("Array index must be larger than zero", 102);
                            } else if (z3) {
                                if (i == a.mo2799c() + r8) {
                                    axd axd4 = new axd("[]", axp2);
                                    axd4.f2478f = r8;
                                    a.mo2794a(axd4);
                                }
                            }
                        } else if (i3 == 4) {
                            i = a.mo2799c();
                        } else if (i3 == 6) {
                            String[] b2 = awy.m2309b(a2.f2498a);
                            String str2 = b2[0];
                            String str3 = b2[r8];
                            int i4 = -1;
                            int i5 = 1;
                            while (i5 <= a.mo2799c() && i4 < 0) {
                                axd a3 = a.mo2791a(i5);
                                if (a3.mo2810i().mo2841b()) {
                                    int i6 = 1;
                                    while (true) {
                                        if (i6 > a3.mo2799c()) {
                                            break;
                                        }
                                        axd a4 = a3.mo2791a(i6);
                                        if (str2.equals(a4.f2473a)) {
                                            if (str3.equals(a4.f2474b)) {
                                                i4 = i5;
                                                break;
                                            }
                                        }
                                        i6++;
                                    }
                                    i5++;
                                } else {
                                    throw new awn("Field selector must be used on array of struct", 102);
                                }
                            }
                            i = i4;
                        } else if (i3 == 5) {
                            String[] b3 = awy.m2309b(a2.f2498a);
                            String str4 = b3[0];
                            String str5 = b3[1];
                            int i7 = a2.f2501d;
                            if (!"xml:lang".equals(str4)) {
                                i = 1;
                                while (true) {
                                    if (i >= a.mo2799c()) {
                                        i = -1;
                                        break;
                                    }
                                    Iterator h = a.mo2791a(i).mo2809h();
                                    while (h.hasNext()) {
                                        axd axd5 = (axd) h.next();
                                        if (str4.equals(axd5.f2473a) && str5.equals(axd5.f2474b)) {
                                            break;
                                        }
                                    }
                                    i++;
                                }
                            } else {
                                int a5 = m2354a(a, awy.m2306a(str5));
                                if (a5 >= 0 || (i7 & 4096) <= 0) {
                                    i = a5;
                                } else {
                                    axd axd6 = new axd("[]", null);
                                    axd6.mo2800c(new axd("xml:lang", "x-default", null));
                                    a.mo2805e(axd6);
                                    i = 1;
                                }
                            }
                        } else {
                            throw new awn("Unknown array indexing step in FollowXPathStep", 9);
                        }
                        a = (i <= 0 || i > a.mo2799c()) ? null : a.mo2791a(i);
                    } else {
                        throw new awn("Indexing applied to non-array", 102);
                    }
                    if (a != null) {
                        if (!a.f2478f) {
                            z2 = true;
                        } else {
                            a.f2478f = false;
                            if (i2 == 1 && axj2.mo2819a(1).f2500c && axj2.mo2819a(1).f2501d != 0) {
                                a.mo2810i().mo2828a(axj2.mo2819a(1).f2501d, true);
                                z2 = true;
                            } else if (i2 < axj.mo2818a() - 1) {
                                z2 = true;
                                if (axj2.mo2819a(i2).f2499b == 1) {
                                    if (!a.mo2810i().mo2848h()) {
                                        z2 = true;
                                        a.mo2810i().mo2844d(true);
                                    } else {
                                        z2 = true;
                                    }
                                }
                            } else {
                                z2 = true;
                            }
                            if (axd2 == null) {
                                axd2 = a;
                            }
                        }
                        i2++;
                        axp2 = null;
                        r8 = z2;
                    } else if (!z3) {
                        return null;
                    } else {
                        m2358a(axd2);
                        return null;
                    }
                } catch (NumberFormatException e) {
                    throw new awn("Array index not digits.", 102);
                } catch (awn e2) {
                    if (axd2 != null) {
                        m2358a(axd2);
                    }
                    throw e2;
                }
            }
            if (axd2 != null) {
                a.mo2810i().mo2837a(axp);
                a.f2477e = a.mo2810i();
            }
            return a;
        }
        throw new awn("Empty XMPPath", 102);
    }

    /* renamed from: a */
    static axd m2356a(axd axd, String str, String str2, boolean z) {
        axd a = axd.mo2792a(str);
        if (a == null && z) {
            axp axp = new axp();
            axp.mo2828a(Integer.MIN_VALUE, true);
            a = new axd(str, axp);
            a.f2478f = true;
            String a2 = awp.f2450a.mo2813a(str);
            if (a2 == null) {
                if (str2 == null || str2.length() == 0) {
                    throw new awn("Unregistered schema namespace URI", 101);
                }
                a2 = awp.f2450a.mo2814a(str, str2);
            }
            a.f2474b = a2;
            axd.mo2794a(a);
        }
        return a;
    }

    /* renamed from: a */
    static axd m2357a(axd axd, String str, boolean z) {
        return m2356a(axd, str, (String) null, z);
    }

    /* renamed from: a */
    static void m2358a(axd axd) {
        axd axd2 = axd.f2475c;
        if (axd.mo2810i().mo2829a(32)) {
            axd2.mo2804d(axd);
        } else {
            axd2.mo2798b(axd);
        }
        if (!axd2.mo2806e() && axd2.mo2810i().mo2847g()) {
            axd2.f2475c.mo2798b(axd2);
        }
    }

    /* renamed from: a */
    static void m2359a(axd axd, String str, String str2) {
        axd axd2 = new axd("[]", str2, null);
        axd axd3 = new axd("xml:lang", str, null);
        axd2.mo2800c(axd3);
        if (!"x-default".equals(axd3.f2474b)) {
            axd.mo2794a(axd2);
        } else {
            axd.mo2805e(axd2);
        }
    }
}
