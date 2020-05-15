package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: bntd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bntd {

    /* renamed from: a */
    private static String f132119a = "bntu";

    /* renamed from: b */
    private static String f132120b = "com.google.common.flogger.backend.google.GooglePlatform";

    /* renamed from: c */
    private static String f132121c = "bnug";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String[] f132122d = {"bntu", "com.google.common.flogger.backend.google.GooglePlatform", "bnug"};

    /* renamed from: a */
    public static bnsx m110367a(String str) {
        return bntb.f132118a.mo68474b(str);
    }

    /* renamed from: c */
    public static bntj m110370c() {
        return bntb.f132118a.mo68477d();
    }

    /* renamed from: e */
    public static long m110371e() {
        return bntb.f132118a.mo68478f();
    }

    /* renamed from: g */
    public static String m110372g() {
        return bntb.f132118a.mo68479h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bnsx mo68474b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bntc mo68475b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo68476b(String str, Level level, boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public bntj mo68477d() {
        return bntj.f132128a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo68478f() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo68479h();

    /* renamed from: a */
    public static bntc m110368a() {
        return bntb.f132118a.mo68475b();
    }

    /* renamed from: a */
    public static boolean m110369a(String str, Level level, boolean z) {
        return bntb.f132118a.mo68476b(str, level, z);
    }
}
