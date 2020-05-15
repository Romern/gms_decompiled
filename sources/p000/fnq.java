package p000;

import android.util.Log;

@Deprecated
/* renamed from: fnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fnq {

    /* renamed from: a */
    public static volatile fli f16974a = new fli();

    /* renamed from: a */
    public static void m12016a(String str) {
        fnt fnt = fnt.f16975a;
        if (fnt != null) {
            fnt.mo10933d(str);
        } else if (m12018a(0)) {
            String str2 = (String) fni.f16924b.mo11021a();
        }
        fli fli = f16974a;
    }

    /* renamed from: a */
    public static boolean m12018a(int i) {
        if (f16974a != null) {
            int i2 = f16974a.f16855a;
            if (i >= 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m12019b(String str) {
        fnt fnt = fnt.f16975a;
        if (fnt != null) {
            fnt.mo10940f(str);
        } else if (m12018a(2)) {
            Log.w((String) fni.f16924b.mo11021a(), str);
        }
        fli fli = f16974a;
    }

    /* renamed from: a */
    public static void m12017a(String str, Object obj) {
        fnt fnt = fnt.f16975a;
        if (fnt != null) {
            fnt.mo10938e(str, obj);
        } else if (m12018a(3)) {
            if (obj != null) {
                String str2 = (String) obj;
                StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
            }
            Log.e((String) fni.f16924b.mo11021a(), str);
        }
        fli fli = f16974a;
    }
}
