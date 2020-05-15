package p000;

import android.os.Build;

/* renamed from: doi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class doi {

    /* renamed from: a */
    public static final int[] f13691a = {36, 57, 10007, 18, 15, 14, 43, 1, 2, 3, 48, 31, 55, 17, 52, 60, 91};

    /* renamed from: b */
    public static final int[] f13692b = {6, 15};

    /* renamed from: c */
    public static final int[] f13693c = {24, 39, 27, 37, 8, 38, 7};

    /* renamed from: d */
    public static final int[] f13694d = {46, 10007, 15, 3, 31, 55};

    /* renamed from: e */
    public static final int[] f13695e = dwh.f14269a;

    /* renamed from: f */
    public static final int[] f13696f = {19};

    /* renamed from: g */
    public static final int[] f13697g = {20};

    /* renamed from: h */
    public static final int[] f13698h = {26};

    /* renamed from: i */
    public static final String[] f13699i = ((String[]) sqc.m35962a((Object[][]) new String[][]{f13701k, f13703m}));

    /* renamed from: j */
    private static final String[] f13700j = new String[0];

    /* renamed from: k */
    private static final String[] f13701k = {"android:monitor_location"};

    /* renamed from: l */
    private static final String[] f13702l = {"android:fine_location"};

    /* renamed from: m */
    private static final String[] f13703m = {"android:activity_recognition"};

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static boolean m8936a(int i) {
        return sqc.m35957a(f13691a, i);
    }

    /* renamed from: b */
    public static boolean m8938b(int i) {
        return sqc.m35957a(f13692b, i);
    }

    /* renamed from: c */
    public static boolean m8939c(int i) {
        return sqc.m35957a(f13693c, i);
    }

    /* renamed from: d */
    public static boolean m8940d(int i) {
        return sqc.m35957a(f13694d, i);
    }

    /* renamed from: e */
    public static boolean m8941e(int i) {
        return sqc.m35957a(f13698h, i);
    }

    /* renamed from: a */
    public static String[] m8937a(int i, boolean z) {
        if (i == 1 || (cdij.m133502b() && m8936a(i))) {
            return (!z || !cdgp.f180782a.mo6606a().mo77531W()) ? f13701k : f13702l;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (m8938b(i)) {
            return f13703m;
        }
        new Object[1][0] = Integer.valueOf(i);
        return f13700j;
    }
}
