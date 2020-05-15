package p000;

import java.util.concurrent.Callable;

/* renamed from: butl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butl {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public static Object m120433a(Callable callable, String str, butk butk) {
        int i = 1;
        while (true) {
            if (i <= butk.f154854c) {
                if (butk.f154853b.get()) {
                    srn srn = ahfp.f67119a;
                    break;
                }
                try {
                    srn srn2 = ahfp.f67119a;
                    return callable.call();
                } catch (Exception e) {
                    if (i != butk.f154854c) {
                        srn srn3 = ahfp.f67119a;
                        if (butk.f154853b.get()) {
                            return null;
                        }
                        try {
                            butk.f154852a.run();
                            i++;
                        } catch (Exception e2) {
                            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
                            bnsl.mo68437a(e2);
                            bnsl.mo68413a("Exception while recovering after attempt #%d for %s, bailing!", i, (Object) str);
                            return null;
                        }
                    } else {
                        bnsl bnsl2 = (bnsl) ahfp.f67119a.mo68388c();
                        bnsl2.mo68437a(e);
                        bnsl2.mo68425a("Failed attempt #%d out of %d for %s", Integer.valueOf(i), Integer.valueOf(butk.f154854c), str);
                        return null;
                    }
                }
            } else {
                break;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m120434a(Runnable runnable, String str, butk butk) {
        return m120433a(new butg(runnable), str, butk) != null;
    }
}
