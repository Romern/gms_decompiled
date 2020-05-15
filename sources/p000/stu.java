package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.util.regex.Matcher;

/* renamed from: stu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stu {

    /* renamed from: a */
    private static String f45138a;

    /* renamed from: b */
    private static int f45139b = -1;

    /* renamed from: c */
    private static aymg f45140c = null;

    /* renamed from: a */
    public static String m36315a() {
        if (f45138a == null) {
            f45138a = spn.m35885f(rpr.m34216b());
        }
        return f45138a;
    }

    /* renamed from: b */
    public static int m36316b() {
        if (f45139b == -1) {
            f45139b = spn.m35881e(rpr.m34216b());
        }
        return f45139b;
    }

    /* renamed from: c */
    public static String m36317c() {
        int b = m36316b();
        long lastModified = new File(rpr.m34216b().getApplicationInfo().sourceDir).lastModified();
        StringBuilder sb = new StringBuilder(32);
        sb.append(b);
        sb.append("_");
        sb.append(lastModified);
        return sb.toString();
    }

    /* renamed from: d */
    public static int m36318d() {
        return m36320f().getInt("version_code", -1);
    }

    /* renamed from: e */
    public static String m36319e() {
        return m36320f().getString("version_code_and_timestamp", "");
    }

    /* renamed from: g */
    public static long m36321g() {
        String a = m36315a();
        if (a == null) {
            return -1;
        }
        Matcher matcher = srr.m36145a().matcher(a);
        if (!matcher.find()) {
            return -1;
        }
        try {
            return Long.parseLong(matcher.group(2));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    @Deprecated
    /* renamed from: h */
    public static int m36322h() {
        int b = srr.m36146b(m36315a());
        if (b != -1) {
            return b + 5;
        }
        return -1;
    }

    /* renamed from: i */
    public static String m36323i() {
        int h = m36322h();
        switch (h) {
            case 5:
                return "prod";
            case 6:
                return "internal";
            case 7:
                return "prodlmp";
            case 8:
                return "things";
            case 9:
                return "prodmnc";
            case 10:
                return "wearable";
            case 11:
                return "auto";
            case 12:
            case 14:
            case 18:
            default:
                return String.valueOf(h);
            case 13:
                return "atv";
            case 15:
                return "prodpi";
            case 16:
                return "prodgo";
            case 17:
                return "prodqt";
            case 19:
                return "prodnext";
            case 20:
                return "prodrvc";
        }
    }

    @Deprecated
    /* renamed from: j */
    public static int m36324j() {
        return srr.m36147c(m36315a());
    }

    @Deprecated
    /* renamed from: k */
    public static int m36325k() {
        return srr.m36148d(m36315a());
    }

    /* renamed from: l */
    public static aymg m36326l() {
        if (f45140c == null) {
            int h = m36322h();
            int j = m36324j();
            int k = m36325k();
            if (h == -1 || j == -1 || k == -1) {
                return null;
            }
            bxvd da = aymg.f97968e.mo74144da();
            aymd m = m36327m();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aymg aymg = (aymg) da.f164949b;
            aymg.f97971b = m.f97966p;
            int i = 1;
            aymg.f97970a |= 1;
            int o = m36329o();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aymg aymg2 = (aymg) da.f164949b;
            int i2 = o - 1;
            if (o != 0) {
                aymg2.f97972c = i2;
                aymg2.f97970a |= 2;
                int k2 = m36325k();
                if (k2 != -1) {
                    i = aymf.m84250a(k2 + 1);
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aymg aymg3 = (aymg) da.f164949b;
                int i3 = i - 1;
                if (i != 0) {
                    aymg3.f97973d = i3;
                    aymg3.f97970a |= 4;
                    f45140c = (aymg) da.mo74062i();
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return f45140c;
    }

    /* renamed from: m */
    public static aymd m36327m() {
        int h = m36322h();
        if (h == -1) {
            return aymd.BUILD_TYPE_UNKNOWN;
        }
        return aymd.m84246a(h - 4);
    }

    /* renamed from: n */
    public static boolean m36328n() {
        return m36315a().contains("(eng-");
    }

    /* renamed from: o */
    public static int m36329o() {
        int j = m36324j();
        if (j != -1) {
            return aymb.m84244a(j + 1);
        }
        return 1;
    }

    /* renamed from: f */
    public static SharedPreferences m36320f() {
        int i = Build.VERSION.SDK_INT;
        rpr b = rpr.m34216b();
        Context d = aytw.m84817d(b);
        boolean z = false;
        SharedPreferences sharedPreferences = d.getSharedPreferences("init.initialized_version", 0);
        if (!sharedPreferences.getBoolean("migrated", false)) {
            if (!sharedPreferences.contains("migrated")) {
                if (aytw.m84815b(d)) {
                    d.moveSharedPreferencesFrom(b, "init.initialized_version");
                    b.deleteSharedPreferences("init.initialized_version");
                    sharedPreferences = d.getSharedPreferences("init.initialized_version", 0);
                    z = true;
                }
                sharedPreferences.edit().putBoolean("migrated", z).apply();
            } else if (aytw.m84815b(d)) {
                b.deleteSharedPreferences("init.initialized_version");
                sharedPreferences.edit().putBoolean("migrated", true).apply();
                return sharedPreferences;
            }
        }
        return sharedPreferences;
    }
}
