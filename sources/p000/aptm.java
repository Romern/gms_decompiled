package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: aptm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aptm {

    /* renamed from: a */
    public static final rfj f84855a = rfj.f42872d;

    /* renamed from: b */
    private static final Object f84856b = new Object();

    /* renamed from: c */
    private static Method f84857c = null;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m70976a(Context context) {
        Context context2;
        sdo.m34966a(context, "Context must not be null");
        rfy.m33555l(context);
        try {
            context2 = waq.m41676a(context, waq.f50355c, "providerinstaller").f50364e;
        } catch (wam e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("ProviderInstaller", valueOf.length() == 0 ? new String("Failed to load providerinstaller module: ") : "Failed to load providerinstaller module: ".concat(valueOf));
            context2 = null;
        }
        if (context2 == null) {
            context2 = m70978b(context);
        }
        if (context2 != null) {
            synchronized (f84856b) {
                try {
                    if (f84857c == null) {
                        f84857c = context2.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", Context.class);
                    }
                    f84857c.invoke(null, context2);
                } catch (Exception e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (Log.isLoggable("ProviderInstaller", 6)) {
                        String valueOf2 = String.valueOf(cause != 0 ? cause.getMessage() : e.getMessage());
                        Log.e("ProviderInstaller", valueOf2.length() == 0 ? new String("Failed to install provider: ") : "Failed to install provider: ".concat(valueOf2));
                    }
                    if ("com.google.android.gms".equals(context.getPackageName())) {
                        try {
                            if (apts.m70990a()) {
                                if (cause != 0) {
                                    e = cause;
                                }
                                sqx.m36053a(context, e);
                            }
                        } catch (aptr e3) {
                        }
                    }
                    throw new rfv(8);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        Log.e("ProviderInstaller", "Failed to get remote context");
        throw new rfv(8);
    }

    /* renamed from: b */
    private static Context m70978b(Context context) {
        try {
            return rfy.m33552i(context);
        } catch (Resources.NotFoundException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("ProviderInstaller", valueOf.length() == 0 ? new String("Failed to load GMS Core context for providerinstaller: ") : "Failed to load GMS Core context for providerinstaller: ".concat(valueOf));
            sqx.m36053a(context, e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m70977a(Context context, aptl aptl) {
        sdo.m34966a(context, "Context must not be null");
        sdo.m34966a(aptl, "Listener must not be null");
        sdo.m34967a("Must be called on the UI thread");
        new aptk(context, aptl).execute(new Void[0]);
    }
}
