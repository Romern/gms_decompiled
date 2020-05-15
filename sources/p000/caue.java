package p000;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: caue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caue {

    /* renamed from: f */
    private static final char[] f175989f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f175990a;

    /* renamed from: b */
    public final String f175991b;

    /* renamed from: c */
    public final int f175992c;

    /* renamed from: d */
    public final List f175993d;

    /* renamed from: e */
    public final String f175994e;

    /* renamed from: g */
    private final String f175995g;

    /* renamed from: h */
    private final String f175996h;

    /* renamed from: i */
    private final String f175997i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: caue.a(java.lang.String, boolean):java.lang.String
     arg types: [java.lang.String, int]
     candidates:
      caue.a(java.util.List, boolean):java.util.List
      caue.a(java.lang.String, boolean):java.lang.String */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: caue.a(java.util.List, boolean):java.util.List
     arg types: [java.util.List, int]
     candidates:
      caue.a(java.lang.String, boolean):java.lang.String
      caue.a(java.util.List, boolean):java.util.List */
    public caue(caud caud) {
        List list;
        this.f175990a = caud.f175981a;
        this.f175995g = m127222a(caud.f175982b, false);
        this.f175996h = m127222a(caud.f175983c, false);
        this.f175991b = caud.f175984d;
        this.f175992c = caud.mo74877a();
        m127223a(caud.f175986f, false);
        List list2 = caud.f175987g;
        String str = null;
        if (list2 != null) {
            list = m127223a(list2, true);
        } else {
            list = null;
        }
        this.f175993d = list;
        String str2 = caud.f175988h;
        this.f175997i = str2 != null ? m127222a(str2, false) : str;
        this.f175994e = caud.toString();
    }

    /* renamed from: a */
    static int m127216a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* renamed from: b */
    static List m127224b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo74887c() {
        if (this.f175995g.isEmpty()) {
            return "";
        }
        int length = this.f175990a.length() + 3;
        String str = this.f175994e;
        return this.f175994e.substring(length, m127218a(str, length, str.length(), ":@"));
    }

    /* renamed from: d */
    public final String mo74888d() {
        if (this.f175996h.isEmpty()) {
            return "";
        }
        int indexOf = this.f175994e.indexOf(58, this.f175990a.length() + 3);
        return this.f175994e.substring(indexOf + 1, this.f175994e.indexOf(64));
    }

    /* renamed from: e */
    public final List mo74889e() {
        int indexOf = this.f175994e.indexOf(47, this.f175990a.length() + 3);
        String str = this.f175994e;
        int a = m127218a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            int a2 = m127218a(this.f175994e, i, a, "/");
            arrayList.add(this.f175994e.substring(i, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof caue) && ((caue) obj).f175994e.equals(this.f175994e);
    }

    /* renamed from: f */
    public final String mo74891f() {
        if (this.f175993d == null) {
            return null;
        }
        int indexOf = this.f175994e.indexOf(63) + 1;
        String str = this.f175994e;
        return this.f175994e.substring(indexOf, m127218a(str, indexOf + 1, str.length(), "#"));
    }

    public final int hashCode() {
        return this.f175994e.hashCode();
    }

    public final String toString() {
        return this.f175994e;
    }

    /* renamed from: a */
    public static int m127217a(String str) {
        if (!str.equals("http")) {
            return !str.equals("https") ? -1 : 443;
        }
        return 80;
    }

    /* renamed from: a */
    public static int m127218a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    static String m127219a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        String str4 = str;
        int i3 = i2;
        String str5 = str2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str4.codePointAt(i4);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z3) && str5.indexOf(codePointAt) == -1 && ((codePointAt != 37 || z) && (codePointAt != 43 || !z2)))) {
                i4 += Character.charCount(codePointAt);
            } else {
                cipu cipu = new cipu();
                cipu.mo86288a(str4, i, i4);
                cipu cipu2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str4.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z2) {
                            if (!z) {
                                str3 = "%2B";
                            } else {
                                str3 = "+";
                            }
                            cipu.mo86293b(str3);
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z3) || str5.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && !z))) {
                            if (cipu2 == null) {
                                cipu2 = new cipu();
                            }
                            cipu2.mo86313g(codePointAt2);
                            while (!cipu2.mo86295b()) {
                                byte e = cipu2.mo86305e() & 255;
                                cipu.mo86316h(37);
                                cipu.mo86316h((int) f175989f[e >> 4]);
                                cipu.mo86316h((int) f175989f[e & 15]);
                            }
                        } else {
                            cipu.mo86313g(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                }
                return cipu.mo86324k();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: caue.a(java.lang.String, java.lang.String, boolean, boolean):java.lang.String
     arg types: [java.lang.String, java.lang.String, int, int]
     candidates:
      caue.a(java.lang.String, int, int, java.lang.String):int
      caue.a(java.lang.String, int, int, boolean):java.lang.String
      caue.a(java.lang.String, java.lang.String, boolean, boolean):java.lang.String */
    /* renamed from: b */
    public final URI mo74886b() {
        int i;
        String str;
        try {
            caud caud = new caud();
            caud.f175981a = this.f175990a;
            caud.f175982b = mo74887c();
            caud.f175983c = mo74888d();
            caud.f175984d = this.f175991b;
            if (this.f175992c != m127217a(this.f175990a)) {
                i = this.f175992c;
            } else {
                i = -1;
            }
            caud.f175985e = i;
            caud.f175986f.clear();
            caud.f175986f.addAll(mo74889e());
            caud.mo74880a(mo74891f());
            if (this.f175997i != null) {
                str = this.f175994e.substring(this.f175994e.indexOf(35) + 1);
            } else {
                str = null;
            }
            caud.f175988h = str;
            int size = caud.f175986f.size();
            for (int i2 = 0; i2 < size; i2++) {
                caud.f175986f.set(i2, m127221a((String) caud.f175986f.get(i2), "[]", false, true));
            }
            List list = caud.f175987g;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str2 = (String) caud.f175987g.get(i3);
                    if (str2 != null) {
                        caud.f175987g.set(i3, m127221a(str2, "\\^`{|}", true, true));
                    }
                }
            }
            String str3 = caud.f175988h;
            if (str3 != null) {
                caud.f175988h = m127221a(str3, " \"#<>\\^`{|}", false, false);
            }
            return new URI(caud.toString());
        } catch (URISyntaxException e) {
            String valueOf = String.valueOf(this.f175994e);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("not valid as a java.net.URI: ") : "not valid as a java.net.URI: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    static String m127220a(String str, int i, int i2, boolean z) {
        int i3;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt != '%' && (charAt != '+' || !z)) {
                i4++;
            } else {
                cipu cipu = new cipu();
                cipu.mo86288a(str, i, i4);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt == 37 && (i3 = i4 + 2) < i2) {
                        int a = m127216a(str.charAt(i4 + 1));
                        int a2 = m127216a(str.charAt(i3));
                        if (!(a == -1 || a2 == -1)) {
                            cipu.mo86316h((a << 4) + a2);
                            i4 = i3;
                            i4 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z) {
                        cipu.mo86316h(32);
                        i4 += Character.charCount(codePointAt);
                    }
                    cipu.mo86313g(codePointAt);
                    i4 += Character.charCount(codePointAt);
                }
                return cipu.mo86324k();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static String m127221a(String str, String str2, boolean z, boolean z2) {
        return m127219a(str, 0, str.length(), str2, true, z, z2);
    }

    /* renamed from: a */
    static String m127222a(String str, boolean z) {
        return m127220a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private static final List m127223a(List list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? m127222a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final URL mo74885a() {
        try {
            return new URL(this.f175994e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
