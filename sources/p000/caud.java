package p000;

import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: caud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caud {

    /* renamed from: a */
    String f175981a;

    /* renamed from: b */
    String f175982b = "";

    /* renamed from: c */
    String f175983c = "";

    /* renamed from: d */
    String f175984d;

    /* renamed from: e */
    int f175985e = -1;

    /* renamed from: f */
    final List f175986f;

    /* renamed from: g */
    List f175987g;

    /* renamed from: h */
    String f175988h;

    public caud() {
        ArrayList arrayList = new ArrayList();
        this.f175986f = arrayList;
        arrayList.add("");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: caue.a(java.lang.String, int, int, boolean):java.lang.String
     arg types: [java.lang.String, int, int, int]
     candidates:
      caue.a(java.lang.String, int, int, java.lang.String):int
      caue.a(java.lang.String, java.lang.String, boolean, boolean):java.lang.String
      caue.a(java.lang.String, int, int, boolean):java.lang.String */
    /* renamed from: a */
    private static String m127207a(String str, int i, int i2) {
        int i3 = 0;
        String a = caue.m127220a(str, i, i2, false);
        int i4 = -1;
        if (!a.startsWith("[") || !a.endsWith("]")) {
            try {
                String lowerCase = IDN.toASCII(a).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i3 < lowerCase.length()) {
                    char charAt = lowerCase.charAt(i3);
                    if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                        return null;
                    }
                    i3++;
                }
                return lowerCase;
            } catch (IllegalArgumentException e) {
                return null;
            }
        } else {
            InetAddress a2 = m127208a(a, a.length() - 1);
            if (a2 == null) {
                return null;
            }
            byte[] address = a2.getAddress();
            if (address.length == 16) {
                int i5 = 0;
                int i6 = 0;
                while (i5 < address.length) {
                    int i7 = i5;
                    while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                        i7 += 2;
                    }
                    int i8 = i7 - i5;
                    int i9 = i8 > i6 ? i8 : i6;
                    if (i8 > i6) {
                        i4 = i5;
                    }
                    i5 = i7 + 2;
                    i6 = i9;
                }
                cipu cipu = new cipu();
                while (i3 < address.length) {
                    if (i3 == i4) {
                        cipu.mo86316h(58);
                        i3 += i6;
                        if (i3 == 16) {
                            cipu.mo86316h(58);
                        }
                    } else {
                        if (i3 > 0) {
                            cipu.mo86316h(58);
                        }
                        cipu.mo86323j((long) (((address[i3] & 255) << 8) | (address[i3 + 1] & 255)));
                        i3 += 2;
                    }
                }
                return cipu.mo86324k();
            }
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public final caue mo74881b() {
        if (this.f175981a == null) {
            throw new IllegalStateException("scheme == null");
        } else if (this.f175984d != null) {
            return new caue(this);
        } else {
            throw new IllegalStateException("host == null");
        }
    }

    /* renamed from: c */
    public final void mo74883c(String str) {
        String str2 = "http";
        if (!str.equalsIgnoreCase(str2)) {
            str2 = "https";
            if (!str.equalsIgnoreCase(str2)) {
                throw new IllegalArgumentException(str.length() == 0 ? new String("unexpected scheme: ") : "unexpected scheme: ".concat(str));
            }
        }
        this.f175981a = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f175981a);
        sb.append("://");
        if (!this.f175982b.isEmpty() || !this.f175983c.isEmpty()) {
            sb.append(this.f175982b);
            if (!this.f175983c.isEmpty()) {
                sb.append(':');
                sb.append(this.f175983c);
            }
            sb.append('@');
        }
        if (this.f175984d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.f175984d);
            sb.append(']');
        } else {
            sb.append(this.f175984d);
        }
        int a = mo74877a();
        if (a != caue.m127217a(this.f175981a)) {
            sb.append(':');
            sb.append(a);
        }
        List list = this.f175986f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) list.get(i));
        }
        if (this.f175987g != null) {
            sb.append('?');
            List list2 = this.f175987g;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2 += 2) {
                String str = (String) list2.get(i2);
                String str2 = (String) list2.get(i2 + 1);
                if (i2 > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
            }
        }
        if (this.f175988h != null) {
            sb.append('#');
            sb.append(this.f175988h);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo74882b(String str) {
        if (str != null) {
            String a = m127207a(str, 0, str.length());
            if (a == null) {
                throw new IllegalArgumentException(str.length() == 0 ? new String("unexpected host: ") : "unexpected host: ".concat(str));
            }
            this.f175984d = a;
            return;
        }
        throw new IllegalArgumentException("host == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d8, code lost:
        if ((r12 - r10) == 0) goto L_0x00e4;
     */
    /* renamed from: a */
    private static InetAddress m127208a(String str, int i) {
        int i2;
        int i3;
        String str2 = str;
        int i4 = i;
        int i5 = 16;
        byte[] bArr = new byte[16];
        int i6 = -1;
        byte b = 0;
        int i7 = 1;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 >= i4) {
                break;
            } else if (i8 == i5) {
                return null;
            } else {
                int i11 = i7 + 2;
                if (i11 > i4 || !str2.regionMatches(i7, "::", 0, 2)) {
                    if (i8 == 0) {
                        i10 = i7;
                    } else if (str2.regionMatches(i7, ":", 0, 1)) {
                        i10 = i7 + 1;
                    } else if (!str2.regionMatches(i7, ".", 0, 1)) {
                        return null;
                    } else {
                        int i12 = i8 - 2;
                        int i13 = i12;
                        loop2:
                        while (true) {
                            if (i10 < i4) {
                                if (i13 != 16) {
                                    if (i13 != i12) {
                                        if (str2.charAt(i10) != '.') {
                                            break;
                                        }
                                        i10++;
                                    }
                                    i2 = i10;
                                    i3 = 0;
                                    while (true) {
                                        if (i2 < i4) {
                                            char charAt = str2.charAt(i2);
                                            if (charAt >= '0' && charAt <= '9') {
                                                if ((i3 == 0 && i10 != i2) || ((i3 * 10) + charAt) - 48 > 255) {
                                                    break loop2;
                                                }
                                                i2++;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else if (i13 == i12 + 4) {
                                i8 += 2;
                            }
                            bArr[i13] = (byte) i3;
                            i13++;
                            i10 = i2;
                            i6 = -1;
                            b = 0;
                        }
                        return null;
                    }
                } else if (i9 == -1) {
                    i8 += 2;
                    if (i11 == i4) {
                        i9 = i8;
                        break;
                    }
                    i9 = i8;
                    i10 = i11;
                } else {
                    return null;
                }
                i7 = i10;
                int i14 = 0;
                while (i7 < i4) {
                    int a = caue.m127216a(str2.charAt(i7));
                    if (a == -1) {
                        break;
                    }
                    i14 = (i14 << 4) + a;
                    i7++;
                }
                int i15 = i7 - i10;
                if (i15 == 0 || i15 > 4) {
                    return null;
                }
                int i16 = i8 + 1;
                bArr[i8] = (byte) ((i14 >>> 8) & 255);
                i8 = i16 + 1;
                bArr[i16] = (byte) (i14 & 255);
                i5 = 16;
            }
        }
        if (i8 != 16) {
            if (i9 == i6) {
                return null;
            }
            int i17 = i8 - i9;
            System.arraycopy(bArr, i9, bArr, 16 - i17, i17);
            Arrays.fill(bArr, i9, (16 - i8) + i9, b);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo74877a() {
        int i = this.f175985e;
        return i == -1 ? caue.m127217a(this.f175981a) : i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x038d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0226 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:229:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0149  */
    /* renamed from: a */
    public final int mo74878a(caue caue, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        char c2;
        char c3;
        char c4;
        int a;
        int i6;
        int i7;
        char c5;
        int i8;
        int i9;
        int i10;
        char charAt;
        caue caue2 = caue;
        String str2 = str;
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i = length;
                break;
            }
            char charAt2 = str2.charAt(i11);
            if (charAt2 != 9 && charAt2 != 10 && charAt2 != 12 && charAt2 != 13 && charAt2 != ' ') {
                i = i11;
                break;
            }
            i11++;
        }
        char c6 = 65535;
        int length2 = str.length() - 1;
        while (true) {
            if (length2 < i) {
                i2 = i;
                break;
            }
            char charAt3 = str2.charAt(length2);
            if (charAt3 != 9 && charAt3 != 10 && charAt3 != 12 && charAt3 != 13 && charAt3 != ' ') {
                i2 = length2 + 1;
                break;
            }
            length2--;
        }
        if (i2 - i >= 2) {
            char charAt4 = str2.charAt(i);
            char c7 = 'Z';
            if (charAt4 < 'a' || charAt4 > 'z') {
                if (charAt4 < 'A') {
                    i3 = 2;
                } else if (charAt4 > 'Z') {
                    i3 = 2;
                }
            }
            int i12 = i + 1;
            while (true) {
                if (i12 >= i2) {
                    i3 = 2;
                    break;
                }
                char charAt5 = str2.charAt(i12);
                if ((charAt5 >= 'a' && charAt5 <= 'z') || ((charAt5 >= 'A' && charAt5 <= c7) || ((charAt5 >= '0' && charAt5 <= '9') || charAt5 == '+' || charAt5 == '-' || charAt5 == '.'))) {
                    i12++;
                    c7 = 'Z';
                } else if (charAt5 != ':' || i12 == -1) {
                    i3 = 2;
                } else {
                    i3 = 2;
                    if (str.regionMatches(true, i, "https:", 0, 6)) {
                        this.f175981a = "https";
                        i += 6;
                    } else if (!str.regionMatches(true, i, "http:", 0, 5)) {
                        return 3;
                    } else {
                        this.f175981a = "http";
                        i += 5;
                    }
                }
            }
            i4 = i;
            i5 = 0;
            while (true) {
                c = '/';
                c2 = '\\';
                if (i4 >= i2 || !((charAt = str2.charAt(i4)) == '\\' || charAt == '/')) {
                    c3 = '?';
                    c4 = '#';
                } else {
                    i5++;
                    i4++;
                }
            }
            c3 = '?';
            c4 = '#';
            if (i5 < i3 && caue2 != null && caue2.f175990a.equals(this.f175981a)) {
                this.f175982b = caue.mo74887c();
                this.f175983c = caue.mo74888d();
                this.f175984d = caue2.f175991b;
                this.f175985e = caue2.f175992c;
                this.f175986f.clear();
                this.f175986f.addAll(caue.mo74889e());
                if (i == i2 || str2.charAt(i) == '#') {
                    mo74880a(caue.mo74891f());
                }
            } else {
                i7 = i + i5;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    i = caue.m127218a(str2, i7, i2, "@/\\?#");
                    if (i == i2) {
                        c5 = str2.charAt(i);
                    } else {
                        c5 = 65535;
                    }
                    if (c5 == c6 || c5 == c4 || c5 == c || c5 == c2 || c5 == c3) {
                        i8 = i7;
                    } else {
                        if (c5 == '@') {
                            if (z2) {
                                String str3 = this.f175983c;
                                String a2 = caue.m127219a(str, i7, i, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 3 + String.valueOf(a2).length());
                                sb.append(str3);
                                sb.append("%40");
                                sb.append(a2);
                                this.f175983c = sb.toString();
                            } else {
                                String str4 = "%40";
                                int a3 = caue.m127218a(str2, i7, i, ":");
                                int i13 = a3;
                                String a4 = caue.m127219a(str, i7, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                if (z) {
                                    String str5 = this.f175982b;
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 3 + String.valueOf(a4).length());
                                    sb2.append(str5);
                                    sb2.append(str4);
                                    sb2.append(a4);
                                    a4 = sb2.toString();
                                }
                                this.f175982b = a4;
                                if (i13 != i) {
                                    this.f175983c = caue.m127219a(str, i13 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                    z2 = true;
                                }
                                z = true;
                            }
                            i7 = i + 1;
                        }
                        c4 = '#';
                        c3 = '?';
                        c2 = '\\';
                        c = '/';
                        c6 = 65535;
                    }
                }
                i8 = i7;
                while (true) {
                    if (i8 < i) {
                        char charAt6 = str2.charAt(i8);
                        if (charAt6 == ':') {
                            break;
                        }
                        if (charAt6 == '[') {
                            do {
                                i8++;
                                if (i8 >= i) {
                                    break;
                                }
                            } while (str2.charAt(i8) != ']');
                        }
                        i8++;
                    } else {
                        i8 = i;
                        break;
                    }
                }
                i9 = i8 + 1;
                if (i9 < i) {
                    this.f175984d = m127207a(str2, i7, i8);
                    this.f175985e = caue.m127217a(this.f175981a);
                } else {
                    this.f175984d = m127207a(str2, i7, i8);
                    try {
                        i10 = Integer.parseInt(caue.m127219a(str, i9, i, "", false, false, true));
                        if (i10 <= 0 || i10 > 65535) {
                            i10 = -1;
                        }
                    } catch (NumberFormatException e) {
                        i10 = -1;
                    }
                    this.f175985e = i10;
                    if (i10 == -1) {
                        return 4;
                    }
                }
                if (this.f175984d == null) {
                    return 5;
                }
            }
            a = caue.m127218a(str2, i, i2, "?#");
            if (i != a) {
                char charAt7 = str2.charAt(i);
                if (charAt7 == '/' || charAt7 == '\\') {
                    this.f175986f.clear();
                    this.f175986f.add("");
                    i6 = i + 1;
                } else {
                    List list = this.f175986f;
                    list.set(list.size() - 1, "");
                    i6 = i;
                }
                while (i6 < a) {
                    int a5 = caue.m127218a(str2, i6, a, "/\\");
                    String a6 = caue.m127219a(str, i6, a5, " \"<>^`{}|/\\?#", true, false, true);
                    if (!a6.equals(".") && !a6.equalsIgnoreCase("%2e")) {
                        if (a6.equals("..") || a6.equalsIgnoreCase("%2e.") || a6.equalsIgnoreCase(".%2e") || a6.equalsIgnoreCase("%2e%2e")) {
                            List list2 = this.f175986f;
                            if (((String) list2.remove(list2.size() - 1)).isEmpty()) {
                                if (!this.f175986f.isEmpty()) {
                                    List list3 = this.f175986f;
                                    list3.set(list3.size() - 1, "");
                                }
                            }
                            this.f175986f.add("");
                        } else {
                            List list4 = this.f175986f;
                            if (((String) list4.get(list4.size() - 1)).isEmpty()) {
                                List list5 = this.f175986f;
                                list5.set(list5.size() - 1, a6);
                            } else {
                                this.f175986f.add(a6);
                            }
                            if (a5 < a) {
                                this.f175986f.add("");
                            }
                        }
                    }
                    i6 = a5 < a ? a5 + 1 : a5;
                }
            }
            if (a < i2 && str2.charAt(a) == '?') {
                int a7 = caue.m127218a(str2, a, i2, "#");
                this.f175987g = caue.m127224b(caue.m127219a(str, a + 1, a7, " \"'<>#", true, true, true));
                a = a7;
            }
            if (a < i2 && str2.charAt(a) == '#') {
                this.f175988h = caue.m127219a(str, a + 1, i2, "", true, false, false);
                return 1;
            }
        }
        i3 = 2;
        if (caue2 == null) {
            return i3;
        }
        this.f175981a = caue2.f175990a;
        i4 = i;
        i5 = 0;
        while (true) {
            c = '/';
            c2 = '\\';
            if (i4 >= i2) {
                break;
            }
            break;
            i5++;
            i4++;
        }
        c3 = '?';
        c4 = '#';
        if (i5 < i3) {
            this.f175982b = caue.mo74887c();
            this.f175983c = caue.mo74888d();
            this.f175984d = caue2.f175991b;
            this.f175985e = caue2.f175992c;
            this.f175986f.clear();
            this.f175986f.addAll(caue.mo74889e());
            mo74880a(caue.mo74891f());
            a = caue.m127218a(str2, i, i2, "?#");
            if (i != a) {
            }
            int a72 = caue.m127218a(str2, a, i2, "#");
            this.f175987g = caue.m127224b(caue.m127219a(str, a + 1, a72, " \"'<>#", true, true, true));
            a = a72;
            return a < i2 ? 1 : 1;
        }
        i7 = i + i5;
        boolean z3 = false;
        boolean z22 = false;
        while (true) {
            i = caue.m127218a(str2, i7, i2, "@/\\?#");
            if (i == i2) {
            }
            if (c5 == c6) {
                break;
            }
            break;
            c4 = '#';
            c3 = '?';
            c2 = '\\';
            c = '/';
            c6 = 65535;
        }
        i8 = i7;
        while (true) {
            if (i8 < i) {
            }
            i8++;
        }
        i9 = i8 + 1;
        if (i9 < i) {
        }
        if (this.f175984d == null) {
        }
        a = caue.m127218a(str2, i, i2, "?#");
        if (i != a) {
        }
        int a722 = caue.m127218a(str2, a, i2, "#");
        this.f175987g = caue.m127224b(caue.m127219a(str, a + 1, a722, " \"'<>#", true, true, true));
        a = a722;
        if (a < i2) {
        }
    }

    /* renamed from: a */
    public final void mo74879a(int i) {
        if (i <= 0 || i > 65535) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("unexpected port: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f175985e = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: caue.a(java.lang.String, java.lang.String, boolean, boolean):java.lang.String
     arg types: [java.lang.String, java.lang.String, int, int]
     candidates:
      caue.a(java.lang.String, int, int, java.lang.String):int
      caue.a(java.lang.String, int, int, boolean):java.lang.String
      caue.a(java.lang.String, java.lang.String, boolean, boolean):java.lang.String */
    /* renamed from: a */
    public final void mo74880a(String str) {
        this.f175987g = str != null ? caue.m127224b(caue.m127221a(str, " \"'<>#", true, true)) : null;
    }
}
