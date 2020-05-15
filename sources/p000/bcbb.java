package p000;

import java.util.concurrent.Callable;

/* renamed from: bcbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcbb {
    /* renamed from: a */
    public static Object m88741a(bdae bdae, Callable callable) {
        bbov.m88299a();
        bdae.mo54678a();
        try {
            Object call = callable.call();
            bdae.mo54681d();
            bdae.mo54679b();
            return call;
        } catch (Exception e) {
            throw new bcay("Error when executing transaction!!", e);
        } catch (Throwable th) {
            bdae.mo54679b();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m88742a(bdae bdae, Runnable runnable) {
        m88741a(bdae, new bcba(runnable));
    }
}
