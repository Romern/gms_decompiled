package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: afgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afgu {

    /* renamed from: a */
    private static final String f64234a = afgu.class.getSimpleName();

    /* renamed from: b */
    private static Context f64235b = null;

    /* renamed from: c */
    private static afef f64236c;

    /* renamed from: a */
    public static afef m53063a(Context context) {
        sdo.m34959a(context);
        afef afef = f64236c;
        if (afef != null) {
            return afef;
        }
        int i = rfx.f42891a;
        Log.i(f64234a, "Making Creator dynamically");
        ClassLoader classLoader = m53065b(context).getClassLoader();
        try {
            sdo.m34959a(classLoader);
            afef asInterface = afee.asInterface((IBinder) m53064a(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl")));
            f64236c = asInterface;
            try {
                asInterface.initV2(vzs.m41642a(m53065b(context).getResources()), rfx.f42891a);
                return f64236c;
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
        }
    }

    /* renamed from: b */
    private static Context m53065b(Context context) {
        Context context2;
        Context context3 = f64235b;
        if (context3 != null) {
            return context3;
        }
        try {
            context2 = waq.m41676a(context, waq.f50353a, "com.google.android.gms.maps_dynamite").f50364e;
        } catch (Exception e) {
            Log.e(f64234a, "Failed to load maps module, use legacy", e);
            context2 = rfx.m33539c(context);
        }
        f64235b = context2;
        return context2;
    }

    /* renamed from: a */
    private static Object m53064a(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Unable to instantiate the dynamic class ") : "Unable to instantiate the dynamic class ".concat(valueOf));
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() == 0 ? new String("Unable to call the default constructor of ") : "Unable to call the default constructor of ".concat(valueOf2));
        }
    }
}
