package p000;

/* renamed from: axk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axk {
    /* renamed from: a */
    public static axj m2373a(String str, String str2) {
        axl axl;
        axj axj = new axj();
        axi axi = new axi();
        axi.f2492a = str2;
        while (axi.f2496e < axi.f2492a.length() && "/[*".indexOf(axi.f2492a.charAt(axi.f2496e)) < 0) {
            axi.f2496e++;
        }
        int i = axi.f2496e;
        int i2 = axi.f2495d;
        if (i != i2) {
            String b = m2375b(str, axi.f2492a.substring(i2, i));
            axg c = awp.f2450a.mo2817c(b);
            if (c == null) {
                axj.mo2820a(new axl(str, Integer.MIN_VALUE));
                axj.mo2820a(new axl(b, 1));
            } else {
                axj.mo2820a(new axl(c.f2484a, Integer.MIN_VALUE));
                axl axl2 = new axl(m2375b(c.f2484a, c.f2486c), 1);
                axl2.mo2822a();
                axl2.f2501d = c.f2487d.f2502a;
                axj.mo2820a(axl2);
                if (c.f2487d.mo2825b()) {
                    axl axl3 = new axl("[?xml:lang='x-default']", 5);
                    axl3.mo2822a();
                    axl3.f2501d = c.f2487d.f2502a;
                    axj.mo2820a(axl3);
                } else if (c.f2487d.mo2829a(512)) {
                    axl axl4 = new axl("[1]", 3);
                    axl4.mo2822a();
                    axl4.f2501d = c.f2487d.f2502a;
                    axj.mo2820a(axl4);
                }
            }
            while (axi.f2496e < str2.length()) {
                int i3 = axi.f2496e;
                axi.f2495d = i3;
                if (str2.charAt(i3) == '/') {
                    int i4 = axi.f2495d + 1;
                    axi.f2495d = i4;
                    if (i4 >= str2.length()) {
                        throw new awn("Empty XMPPath segment", 102);
                    }
                }
                if (str2.charAt(axi.f2495d) == '*') {
                    int i5 = axi.f2495d + 1;
                    axi.f2495d = i5;
                    if (i5 >= str2.length() || str2.charAt(axi.f2495d) != '[') {
                        throw new awn("Missing '[' after '*'", 102);
                    }
                }
                int i6 = axi.f2495d;
                axi.f2496e = i6;
                if (str2.charAt(i6) == '[') {
                    int i7 = axi.f2496e + 1;
                    axi.f2496e = i7;
                    if (axi.f2492a.charAt(i7) >= '0' && axi.f2492a.charAt(axi.f2496e) <= '9') {
                        while (axi.f2496e < axi.f2492a.length() && axi.f2492a.charAt(axi.f2496e) >= '0' && axi.f2492a.charAt(axi.f2496e) <= '9') {
                            axi.f2496e++;
                        }
                        axl = new axl(null, 3);
                    } else {
                        while (axi.f2496e < axi.f2492a.length() && axi.f2492a.charAt(axi.f2496e) != ']' && axi.f2492a.charAt(axi.f2496e) != '=') {
                            axi.f2496e++;
                        }
                        if (axi.f2496e >= axi.f2492a.length()) {
                            throw new awn("Missing ']' or '=' for array index", 102);
                        } else if (axi.f2492a.charAt(axi.f2496e) != ']') {
                            axi.f2493b = axi.f2495d + 1;
                            int i8 = axi.f2496e;
                            axi.f2494c = i8;
                            int i9 = i8 + 1;
                            axi.f2496e = i9;
                            char charAt = axi.f2492a.charAt(i9);
                            if (charAt == '\'' || charAt == '\"') {
                                axi.f2496e++;
                                while (axi.f2496e < axi.f2492a.length()) {
                                    if (axi.f2492a.charAt(axi.f2496e) == charAt) {
                                        if (axi.f2496e + 1 >= axi.f2492a.length() || axi.f2492a.charAt(axi.f2496e + 1) != charAt) {
                                            break;
                                        }
                                        axi.f2496e++;
                                    }
                                    axi.f2496e++;
                                }
                                if (axi.f2496e < axi.f2492a.length()) {
                                    axi.f2496e++;
                                    axl = new axl(null, 6);
                                } else {
                                    throw new awn("No terminating quote for array selector", 102);
                                }
                            } else {
                                throw new awn("Invalid quote in array selector", 102);
                            }
                        } else if ("[last()".equals(axi.f2492a.substring(axi.f2495d, axi.f2496e))) {
                            axl = new axl(null, 4);
                        } else {
                            throw new awn("Invalid non-numeric array index", 102);
                        }
                    }
                    if (axi.f2496e >= axi.f2492a.length() || axi.f2492a.charAt(axi.f2496e) != ']') {
                        throw new awn("Missing ']' for array index", 102);
                    }
                    int i10 = axi.f2496e + 1;
                    axi.f2496e = i10;
                    axl.f2498a = axi.f2492a.substring(axi.f2495d, i10);
                } else {
                    axi.f2493b = axi.f2495d;
                    while (axi.f2496e < axi.f2492a.length() && "/[*".indexOf(axi.f2492a.charAt(axi.f2496e)) < 0) {
                        axi.f2496e++;
                    }
                    int i11 = axi.f2496e;
                    axi.f2494c = i11;
                    int i12 = axi.f2495d;
                    if (i11 != i12) {
                        axl = new axl(axi.f2492a.substring(i12, i11), 1);
                    } else {
                        throw new awn("Empty XMPPath segment", 102);
                    }
                }
                int i13 = axl.f2499b;
                if (i13 == 1) {
                    if (axl.f2498a.charAt(0) == '@') {
                        String valueOf = String.valueOf(axl.f2498a.substring(1));
                        axl.f2498a = valueOf.length() == 0 ? new String("?") : "?".concat(valueOf);
                        if (!"?xml:lang".equals(axl.f2498a)) {
                            throw new awn("Only xml:lang allowed with '@'", 102);
                        }
                    }
                    if (axl.f2498a.charAt(0) == '?') {
                        axi.f2493b++;
                        axl.f2499b = 2;
                    }
                    m2374a(axi.f2492a.substring(axi.f2493b, axi.f2494c));
                } else if (i13 != 6) {
                    continue;
                } else {
                    if (axl.f2498a.charAt(1) == '@') {
                        String valueOf2 = String.valueOf(axl.f2498a.substring(2));
                        axl.f2498a = valueOf2.length() == 0 ? new String("[?") : "[?".concat(valueOf2);
                        if (!axl.f2498a.startsWith("[?xml:lang=")) {
                            throw new awn("Only xml:lang allowed with '@'", 102);
                        }
                    }
                    if (axl.f2498a.charAt(1) == '?') {
                        int i14 = axi.f2493b + 1;
                        axi.f2493b = i14;
                        axl.f2499b = 5;
                        m2374a(axi.f2492a.substring(i14, axi.f2494c));
                    }
                }
                axj.mo2820a(axl);
            }
            return axj;
        }
        throw new awn("Empty initial XMPPath step", 102);
    }

    /* renamed from: b */
    private static String m2375b(String str, String str2) {
        if (str.length() == 0) {
            throw new awn("Schema namespace URI is required", 101);
        } else if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new awn("Top level name must not be a qualifier", 102);
        } else if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new awn("Top level name must be simple", 102);
        } else {
            String a = awp.f2450a.mo2813a(str);
            if (a != null) {
                int indexOf = str2.indexOf(58);
                if (indexOf < 0) {
                    m2376b(str2);
                    String valueOf = String.valueOf(str2);
                    return valueOf.length() == 0 ? new String(a) : a.concat(valueOf);
                }
                m2376b(str2.substring(0, indexOf));
                m2376b(str2.substring(indexOf));
                String substring = str2.substring(0, indexOf + 1);
                String a2 = awp.f2450a.mo2813a(str);
                if (a2 == null) {
                    throw new awn("Unknown schema namespace prefix", 101);
                } else if (substring.equals(a2)) {
                    return str2;
                } else {
                    throw new awn("Schema namespace URI and prefix mismatch", 101);
                }
            } else {
                throw new awn("Unregistered schema namespace URI", 101);
            }
        }
    }

    /* renamed from: b */
    private static void m2376b(String str) {
        if (!awy.m2312d(str)) {
            throw new awn("Bad XML name", 102);
        }
    }

    /* renamed from: a */
    private static void m2374a(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            if (awy.m2313e(substring)) {
                if (awp.f2450a.mo2816b(substring) == null) {
                    throw new awn("Unknown namespace prefix for qualified name", 102);
                }
                return;
            }
        }
        throw new awn("Ill-formed qualified name", 102);
    }
}
