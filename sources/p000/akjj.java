package p000;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: akjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjj {

    /* renamed from: a */
    public static final Object f72089a = new Object();

    /* renamed from: b */
    public static String f72090b = "0";

    /* renamed from: c */
    private static final String f72091c = akjj.class.getSimpleName();

    /* renamed from: d */
    private static final rfj f72092d = rfj.f42872d;

    /* renamed from: e */
    private static waq f72093e = null;

    private akjj() {
    }

    @Deprecated
    /* renamed from: a */
    public static void m59878a(Context context) {
        synchronized (f72089a) {
            if (!m59879a()) {
                sdo.m34966a(context, "Context must not be null");
                try {
                    akjj.class.getClassLoader().loadClass("org.chromium.net.CronetEngine");
                    rfy.m33555l(context);
                    waq a = waq.m41676a(context, waq.f50353a, "com.google.android.gms.cronet_dynamite");
                    Class<?> loadClass = a.f50364e.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() != akjj.class.getClassLoader()) {
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        int intValue = ((Integer) method.invoke(null, new Object[0])).intValue();
                        f72090b = (String) method2.invoke(null, new Object[0]);
                        if (intValue >= 3) {
                            f72093e = a;
                            return;
                        }
                        Intent b = f72092d.mo24591b(context, 2, "cr");
                        String str = f72090b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 174);
                        sb.append("Google Play Services update is required. The API Level of the client is ");
                        sb.append(3);
                        sb.append(". The API Level of the implementation is ");
                        sb.append(intValue);
                        sb.append(". The Cronet implementation version is ");
                        sb.append(str);
                        throw new rfw(2, sb.toString(), b);
                    }
                    Log.e(f72091c, "ImplVersion class is missing from Cronet module.");
                    throw new rfv(8);
                } catch (ClassNotFoundException e) {
                    Log.e(f72091c, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((rfv) new rfv(10).initCause(e));
                } catch (wam e2) {
                    Log.e(f72091c, "Unable to load Cronet module", e2);
                    throw ((rfv) new rfv(8).initCause(e2));
                } catch (Exception e3) {
                    Log.e(f72091c, "Unable to read Cronet version from the Cronet module ", e3);
                    throw ((rfv) new rfv(8).initCause(e3));
                }
            }
        }
    }

    /* renamed from: b */
    public static waq m59880b() {
        waq waq;
        synchronized (f72089a) {
            waq = f72093e;
        }
        return waq;
    }

    /* renamed from: a */
    public static boolean m59879a() {
        return m59880b() != null;
    }
}
