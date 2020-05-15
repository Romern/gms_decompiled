package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ciix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciix {

    /* renamed from: a */
    public static final /* synthetic */ int f190424a = 0;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.ClassNotFoundException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    static {
        Level level;
        Class<?> cls;
        ClassNotFoundException classNotFoundException;
        Level level2 = Level.WARNING;
        ciiw ciiw = null;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            level = level2;
            e = null;
        } catch (ClassNotFoundException e) {
            e = e;
            level = Level.FINE;
            cls = null;
            if (cls != null) {
            }
            if (ciiw == null) {
            }
            if (classNotFoundException != null) {
            }
        } catch (Throwable th) {
            level = level2;
            e = th;
            cls = null;
            if (cls != null) {
            }
            if (ciiw == null) {
            }
            if (classNotFoundException != null) {
            }
        }
        if (cls != null) {
            try {
                classNotFoundException = e;
                ciiw = (ciiw) cls.asSubclass(ciiw.class).getConstructor(ciiy.class).newInstance(ciiw.f190423a);
            } catch (Throwable th2) {
                classNotFoundException = th2;
            }
        } else {
            classNotFoundException = e;
        }
        if (ciiw == null) {
            new ciiw(ciiw.f190423a);
        }
        if (classNotFoundException != null) {
            Logger.getLogger(ciix.class.getName()).logp(level, "io.perfmark.PerfMark", "<clinit>", "Error during PerfMark.<clinit>", (Throwable) classNotFoundException);
        }
    }

    private ciix() {
    }
}
