package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: catm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catm {

    /* renamed from: a */
    public final boolean f175840a;

    /* renamed from: b */
    public final boolean f175841b;

    /* renamed from: c */
    public final int f175842c;

    /* renamed from: d */
    public final boolean f175843d;

    /* renamed from: e */
    public final boolean f175844e;

    /* renamed from: f */
    public final boolean f175845f;

    /* renamed from: g */
    public final int f175846g;

    /* renamed from: h */
    public final int f175847h;

    /* renamed from: i */
    public final boolean f175848i;

    /* renamed from: j */
    String f175849j;

    /* renamed from: k */
    private final int f175850k;

    /* renamed from: l */
    private final boolean f175851l;

    static {
        int i;
        catl catl = new catl();
        catl.f175837a = true;
        catl.mo74849a();
        catl catl2 = new catl();
        catl2.f175839c = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        if (seconds <= 2147483647L) {
            i = (int) seconds;
        } else {
            i = Integer.MAX_VALUE;
        }
        catl2.f175838b = i;
        catl2.mo74849a();
    }

    public catm(catl catl) {
        this.f175840a = catl.f175837a;
        this.f175841b = false;
        this.f175842c = -1;
        this.f175850k = -1;
        this.f175843d = false;
        this.f175844e = false;
        this.f175845f = false;
        this.f175846g = catl.f175838b;
        this.f175847h = -1;
        this.f175848i = catl.f175839c;
        this.f175851l = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* renamed from: a */
    public static catm m127180a(cauc cauc) {
        String str;
        int i;
        String str2;
        cauc cauc2 = cauc;
        int a = cauc.mo74871a();
        boolean z = true;
        String str3 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = -1;
        int i3 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = -1;
        int i5 = -1;
        boolean z7 = false;
        boolean z8 = false;
        for (int i6 = 0; i6 < a; i6++) {
            String a2 = cauc2.mo74872a(i6);
            String b = cauc2.mo74875b(i6);
            if (!a2.equalsIgnoreCase("Cache-Control")) {
                if (!a2.equalsIgnoreCase("Pragma")) {
                } else {
                    z = false;
                }
            } else if (str3 != null) {
                z = false;
            } else {
                str3 = b;
            }
            for (int i7 = 0; i7 < b.length(); i7 = i) {
                int a3 = caxg.m127460a(b, i7, "=,;");
                String trim = b.substring(i7, a3).trim();
                if (a3 != b.length()) {
                    if (b.charAt(a3) != ',' && b.charAt(a3) != ';') {
                        int a4 = caxg.m127459a(b, a3 + 1);
                        if (a4 < b.length()) {
                            if (b.charAt(a4) == '\"') {
                                int i8 = a4 + 1;
                                int a5 = caxg.m127460a(b, i8, "\"");
                                str2 = b.substring(i8, a5);
                                i = a5 + 1;
                                if ("no-cache".equalsIgnoreCase(trim)) {
                                    z2 = true;
                                } else if ("no-store".equalsIgnoreCase(trim)) {
                                    z3 = true;
                                } else if ("max-age".equalsIgnoreCase(trim)) {
                                    i2 = caxg.m127461b(str2, -1);
                                } else if ("s-maxage".equalsIgnoreCase(trim)) {
                                    i3 = caxg.m127461b(str2, -1);
                                } else if ("private".equalsIgnoreCase(trim)) {
                                    z4 = true;
                                } else if ("public".equalsIgnoreCase(trim)) {
                                    z5 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                                    z6 = true;
                                } else if ("max-stale".equalsIgnoreCase(trim)) {
                                    i4 = caxg.m127461b(str2, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(trim)) {
                                    i5 = caxg.m127461b(str2, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                                    z7 = true;
                                } else if ("no-transform".equalsIgnoreCase(trim)) {
                                    z8 = true;
                                }
                            }
                        }
                        i = caxg.m127460a(b, a4, ",;");
                        str2 = b.substring(a4, i).trim();
                        if ("no-cache".equalsIgnoreCase(trim)) {
                        }
                    }
                }
                i = a3 + 1;
                str2 = null;
                if ("no-cache".equalsIgnoreCase(trim)) {
                }
            }
        }
        if (!z) {
            str = null;
        } else {
            str = str3;
        }
        return new catm(z2, z3, i2, i3, z4, z5, z6, i4, i5, z7, z8, str);
    }

    public final String toString() {
        String str = this.f175849j;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f175840a) {
                sb.append("no-cache, ");
            }
            if (this.f175841b) {
                sb.append("no-store, ");
            }
            if (this.f175842c != -1) {
                sb.append("max-age=");
                sb.append(this.f175842c);
                sb.append(", ");
            }
            if (this.f175850k != -1) {
                sb.append("s-maxage=");
                sb.append(this.f175850k);
                sb.append(", ");
            }
            if (this.f175843d) {
                sb.append("private, ");
            }
            if (this.f175844e) {
                sb.append("public, ");
            }
            if (this.f175845f) {
                sb.append("must-revalidate, ");
            }
            if (this.f175846g != -1) {
                sb.append("max-stale=");
                sb.append(this.f175846g);
                sb.append(", ");
            }
            if (this.f175847h != -1) {
                sb.append("min-fresh=");
                sb.append(this.f175847h);
                sb.append(", ");
            }
            if (this.f175848i) {
                sb.append("only-if-cached, ");
            }
            if (this.f175851l) {
                sb.append("no-transform, ");
            }
            if (sb.length() != 0) {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            } else {
                str = "";
            }
            this.f175849j = str;
        }
        return str;
    }

    private catm(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.f175840a = z;
        this.f175841b = z2;
        this.f175842c = i;
        this.f175850k = i2;
        this.f175843d = z3;
        this.f175844e = z4;
        this.f175845f = z5;
        this.f175846g = i3;
        this.f175847h = i4;
        this.f175848i = z6;
        this.f175851l = z7;
        this.f175849j = str;
    }
}
