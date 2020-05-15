package p000;

import com.google.android.gms.people.model.AvatarReference;

/* renamed from: ameu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ameu {
    /* renamed from: a */
    public static String m62827a(int i, String str) {
        boolean z;
        sdo.m34977c(str);
        boolean z2 = true;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int indexOf = str.indexOf(9);
        if (indexOf <= 0) {
            z2 = false;
        }
        sdo.m34970a(z2);
        return str.substring(0, indexOf);
    }

    /* renamed from: b */
    public static String m62829b(int i, String str) {
        boolean z;
        boolean z2;
        sdo.m34977c(str);
        boolean z3 = false;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int indexOf = str.indexOf(9);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34970a(z2);
        int i2 = indexOf + 1;
        int indexOf2 = str.indexOf(9, i2);
        if (indexOf2 > 0) {
            z3 = true;
        }
        sdo.m34970a(z3);
        return str.substring(i2, indexOf2);
    }

    /* renamed from: c */
    public static AvatarReference m62831c(AvatarReference avatarReference) {
        Long l;
        Long l2;
        String str;
        String str2;
        String str3;
        String str4;
        sdo.m34959a(avatarReference);
        int i = avatarReference.f81939a;
        String str5 = avatarReference.f81940b;
        sdo.m34970a(i != 0);
        sdo.m34977c(str5);
        switch (i) {
            case 1:
            case 5:
                str3 = null;
                str2 = null;
                str = null;
                l2 = null;
                l = null;
                str4 = str5;
                break;
            case 2:
                String g = m62836g(i, str5);
                l2 = null;
                l = null;
                str2 = m62834e(i, str5);
                str = m62835f(i, str5);
                str4 = null;
                str3 = g;
                break;
            case 3:
                str2 = null;
                str = null;
                l = null;
                str3 = m62839j(i, str5);
                l2 = Long.valueOf(m62837h(i, str5));
                str4 = null;
                break;
            case 4:
                String c = m62832c(i, str5);
                str4 = m62833d(i, str5);
                String a = m62827a(i, str5);
                l2 = null;
                l = null;
                str = m62829b(i, str5);
                str2 = a;
                str3 = c;
                break;
            case 6:
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
                l2 = null;
                l = Long.valueOf(m62838i(i, str5));
                break;
            default:
                throw new IllegalArgumentException("Invalid source.");
        }
        return new AvatarReference(i, str5, str4, str3, str2, str, l2, l);
    }

    /* renamed from: d */
    public static String m62833d(int i, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        sdo.m34977c(str);
        boolean z4 = false;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int indexOf = str.indexOf(9);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34970a(z2);
        int indexOf2 = str.indexOf(9, indexOf + 1);
        if (indexOf2 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34970a(z3);
        int indexOf3 = str.indexOf(9, indexOf2 + 1);
        if (indexOf3 > 0) {
            z4 = true;
        }
        sdo.m34970a(z4);
        return str.substring(indexOf3 + 1);
    }

    /* renamed from: e */
    public static String m62834e(int i, String str) {
        boolean z;
        boolean z2;
        sdo.m34977c(str);
        boolean z3 = true;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int indexOf = str.indexOf(9);
        int indexOf2 = str.indexOf(9, indexOf + 1);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34970a(z2);
        if (indexOf2 <= 0) {
            z3 = false;
        }
        sdo.m34970a(z3);
        return str.substring(0, indexOf);
    }

    /* renamed from: f */
    public static String m62835f(int i, String str) {
        boolean z;
        boolean z2;
        sdo.m34977c(str);
        boolean z3 = false;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int indexOf = str.indexOf(9);
        int i2 = indexOf + 1;
        int indexOf2 = str.indexOf(9, i2);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34970a(z2);
        if (indexOf2 > 0) {
            z3 = true;
        }
        sdo.m34970a(z3);
        return str.substring(i2, indexOf2);
    }

    /* renamed from: g */
    public static String m62836g(int i, String str) {
        boolean z;
        boolean z2;
        sdo.m34977c(str);
        boolean z3 = false;
        if (i == 2 || i == 4) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int indexOf = str.indexOf(9);
        int indexOf2 = str.indexOf(9, indexOf + 1);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34970a(z2);
        if (indexOf2 > 0) {
            z3 = true;
        }
        sdo.m34970a(z3);
        return str.substring(indexOf2 + 1);
    }

    /* renamed from: h */
    public static long m62837h(int i, String str) {
        boolean z;
        sdo.m34977c(str);
        boolean z2 = true;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int indexOf = str.indexOf(9);
        if (indexOf <= 0) {
            z2 = false;
        }
        sdo.m34970a(z2);
        return Long.parseLong(str.substring(0, indexOf));
    }

    /* renamed from: i */
    public static long m62838i(int i, String str) {
        boolean z;
        sdo.m34977c(str);
        if (i == 6) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        return Long.parseLong(str);
    }

    /* renamed from: j */
    public static String m62839j(int i, String str) {
        boolean z;
        sdo.m34977c(str);
        boolean z2 = false;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int indexOf = str.indexOf(9);
        if (indexOf > 0) {
            z2 = true;
        }
        sdo.m34970a(z2);
        return str.substring(indexOf + 1);
    }

    /* renamed from: a */
    public static String m62828a(AvatarReference avatarReference) {
        sdo.m34959a(avatarReference);
        return m62827a(avatarReference.f81939a, avatarReference.f81940b);
    }

    /* renamed from: b */
    public static String m62830b(AvatarReference avatarReference) {
        sdo.m34959a(avatarReference);
        return m62829b(avatarReference.f81939a, avatarReference.f81940b);
    }

    /* renamed from: c */
    public static String m62832c(int i, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        sdo.m34977c(str);
        boolean z4 = false;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int indexOf = str.indexOf(9);
        if (indexOf > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34970a(z2);
        int indexOf2 = str.indexOf(9, indexOf + 1);
        if (indexOf2 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34970a(z3);
        int i2 = indexOf2 + 1;
        int indexOf3 = str.indexOf(9, i2);
        if (indexOf3 > 0) {
            z4 = true;
        }
        sdo.m34970a(z4);
        return str.substring(i2, indexOf3);
    }
}
