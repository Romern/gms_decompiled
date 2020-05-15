package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bxqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqw {

    /* renamed from: a */
    public static final bmyx f164432a = bmyx.m108640a('=').mo66917a().mo66921b(2);

    /* renamed from: b */
    public static final bmxr f164433b = bmxr.m108544a("/");

    /* renamed from: c */
    public static final bmxr f164434c = bmxr.m108544a("=");

    /* renamed from: d */
    private static final bmyx f164435d = bmyx.m108640a('/');

    /* renamed from: e */
    private static final bmyx f164436e = bmyx.m108640a('-');

    /* renamed from: f */
    private static final bmxr f164437f = bmxr.m108544a("-");

    /* renamed from: g */
    private static final bngx f164438g = bngx.m109367a(new bxqv("s", false), new bxqv("w", false), new bxqv("c", true), new bxqv("d", true), new bxqv("h", false), new bxqv("s", true), new bxqv("h", true), new bxqv("p", true), new bxqv("pp", true), new bxqv("pf", true), new bxqv("n", true), new bxqv("r", false), new bxqv("r", true), new bxqv("o", true), new bxqv("o", false), new bxqv("j", false), new bxqv("x", false), new bxqv("y", false), new bxqv("z", false), new bxqv("g", true), new bxqv("e", false), new bxqv("f", false), new bxqv("k", true), new bxqv("u", true), new bxqv("ut", true), new bxqv("i", true), new bxqv("a", true), new bxqv("b", true), new bxqv("b", false), new bxqv("c", false), new bxqv("t", false), new bxqv("nt0", false), new bxqv("v", true), new bxqv("q", false), new bxqv("fh", true), new bxqv("fv", true), new bxqv("fg", true), new bxqv("ci", true), new bxqv("rw", true), new bxqv("rwu", true), new bxqv("rwa", true), new bxqv("nw", true), new bxqv("rh", true), new bxqv("no", true), new bxqv("ns", true), new bxqv("k", false), new bxqv("p", false), new bxqv("l", false), new bxqv("v", false), new bxqv("nu", true), new bxqv("ft", true), new bxqv("cc", true), new bxqv("nd", true), new bxqv("ip", true), new bxqv("nc", true), new bxqv("a", false), new bxqv("rj", true), new bxqv("rp", true), new bxqv("rg", true), new bxqv("pd", true), new bxqv("pa", true), new bxqv("m", false), new bxqv("vb", false), new bxqv("vl", false), new bxqv("lf", true), new bxqv("mv", true), new bxqv("id", true), new bxqv("al", true), new bxqv("ic", false), new bxqv("pg", true), new bxqv("mo", true), new bxqv("iv", false), new bxqv("il", false), new bxqv("ba", false));

    static {
        bmyx.m108640a(':');
    }

    /* renamed from: a */
    public static String m123021a(String str, String str2) {
        boolean z = true;
        bmxy.m108589a(str != null, "oldOptions is null");
        bmxy.m108589a(str2 != null, "newOptions is null");
        if (!str.isEmpty()) {
            List a = m123023a(str);
            if (!a.isEmpty()) {
                a.addAll(m123023a(str2));
                if (a == null) {
                    z = false;
                }
                bmxy.m108589a(z, "options is null");
                bndu r = bndu.m109109r();
                ArrayList a2 = bnkn.m109661a();
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    String str3 = (String) a.get(i);
                    bnre i2 = f164438g.listIterator();
                    bxqv bxqv = null;
                    while (true) {
                        if (!i2.hasNext()) {
                            break;
                        }
                        bxqv bxqv2 = (bxqv) i2.next();
                        if (str3.toLowerCase().startsWith(bxqv2.f164430a)) {
                            if (!bxqv2.f164431b) {
                                bxqv = bxqv2;
                            } else if (str3.length() == bxqv2.f164430a.length()) {
                                bxqv = bxqv2;
                                break;
                            }
                        }
                    }
                    if (bxqv == null) {
                        a2.add(str3);
                    } else {
                        r.mo67268a(bxqv, str3);
                    }
                }
                ArrayList a3 = bnkn.m109661a();
                bnre i3 = f164438g.listIterator();
                while (i3.hasNext()) {
                    String str4 = "";
                    for (String str5 : r.mo67124a((bxqv) i3.next())) {
                        if (Character.isUpperCase(str5.charAt(0))) {
                            a3.add(str5);
                        } else {
                            str4 = str5;
                        }
                    }
                    if (!str4.isEmpty()) {
                        a3.add(str4);
                    }
                }
                a3.addAll(a2);
                return f164437f.mo66874a((Iterable) a3);
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static final List m123022a(ayuk ayuk) {
        bmxy.m108581a(ayuk);
        ArrayList a = bnkn.m109663a(f164435d.mo66918a((CharSequence) ayuk.mo54437a()));
        return (a.size() <= 0 || !((String) a.get(0)).isEmpty()) ? a : a.subList(1, a.size());
    }

    /* renamed from: a */
    public static List m123023a(String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "options is null");
        ArrayList a = bnkn.m109661a();
        Iterator it = f164436e.mo66918a((CharSequence) str).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!str2.isEmpty()) {
                Object obj = "";
                if (str2.startsWith("O") || str2.startsWith("J")) {
                    while (str2.length() < 12) {
                        str2 = f164437f.mo66875a(str2, !it.hasNext() ? obj : it.next(), new Object[0]);
                    }
                }
                if (str2.equals("pi") || str2.equals("ya") || str2.equals("ro")) {
                    bmxr bmxr = f164437f;
                    if (it.hasNext()) {
                        obj = it.next();
                    }
                    str2 = bmxr.mo66875a(str2, obj, new Object[0]);
                }
                a.add(str2);
            }
        }
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r5 <= 6) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[Catch:{ bxqu -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* renamed from: a */
    public final Uri mo73609a(bxra bxra, Uri uri) {
        int size;
        int size2;
        boolean z;
        boolean z2;
        try {
            ayuk ayuk = new ayuk(uri);
            boolean z3 = true;
            bmxy.m108589a(true, (Object) "options is null");
            bmxy.m108589a(true, (Object) "url is null");
            if (ayuk.mo54437a() != null) {
                List a = m123022a(ayuk);
                if (!a.isEmpty()) {
                    if ("u".equals(a.get(0))) {
                        a.remove(1);
                        a.remove(0);
                        if (a.size() == 2) {
                            a.remove(0);
                        }
                        size = a.size();
                        String str = "";
                        if (size >= 4) {
                            if (size == 4) {
                                if (!((String) a.get(3)).isEmpty()) {
                                }
                            }
                            bmxy.m108589a(true, (Object) "options is null");
                            bmxy.m108589a(true, (Object) "url is null");
                            if (ayuk.mo54437a() != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            bmxy.m108589a(z2, "url path is null");
                            List a2 = m123022a(ayuk);
                            if (a2.size() <= 0 || !((String) a2.get(0)).equals("image")) {
                                z3 = false;
                            } else {
                                a2.remove(0);
                            }
                            String a3 = bxra.mo73610a(str);
                            if (a2.size() == 4) {
                                a2.add(str);
                            } else if (a2.size() == 5) {
                                a2.add(4, str);
                            }
                            String a4 = m123021a((String) a2.get(4), a3);
                            a2.set(4, a4);
                            if (a4.equals(str) && a2.size() > 5) {
                                a2.remove(4);
                            }
                            if (z3) {
                                a2.add(0, "image");
                            }
                            String valueOf = String.valueOf(f164433b.mo66874a((Iterable) a2));
                            return ayuk.mo54436a(valueOf.length() == 0 ? new String("/") : "/".concat(valueOf)).f98527a;
                        }
                        size2 = a.size();
                        if (size2 > 0 || size2 > 1 || ((String) a.get(0)).isEmpty()) {
                            throw new bxqu(ayuk.toString());
                        }
                        bmxy.m108589a(true, (Object) "options is null");
                        bmxy.m108589a(true, (Object) "url is null");
                        if (ayuk.mo54437a() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bmxy.m108589a(z, "url path is null");
                        ArrayList a5 = bnkn.m109663a(f164432a.mo66918a((CharSequence) ayuk.mo54437a()));
                        String a6 = bxra.mo73610a(str);
                        ArrayList a7 = bnkn.m109663a(f164432a.mo66918a((CharSequence) ayuk.mo54437a()));
                        if (a7.size() == 2) {
                            str = (String) a7.get(1);
                        }
                        String a8 = m123021a(str, a6);
                        String str2 = (String) a5.get(0);
                        if (!a8.isEmpty()) {
                            str2 = f164434c.mo66875a(str2, a8, new Object[0]);
                        }
                        return ayuk.mo54436a(str2).f98527a;
                    }
                }
                if (!a.isEmpty() && "image".equals(a.get(0))) {
                    a.remove(0);
                }
                if (a.size() == 2) {
                }
                size = a.size();
                String str3 = "";
                if (size >= 4) {
                }
                size2 = a.size();
                if (size2 > 0) {
                }
                throw new bxqu(ayuk.toString());
            }
            throw new bxqu("url path is null");
        } catch (bxqu e) {
            throw new ayul(e);
        }
    }
}
