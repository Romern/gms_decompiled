package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: fhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fhs {

    /* renamed from: a */
    private static fhs f16614a;

    /* renamed from: b */
    private ClassLoader f16615b;

    private fhs(Context context) {
        sdo.m34959a(context);
        try {
            Context a = qls.m32403a(context, ModuleDescriptor.MODULE_ID);
            if (a != null) {
                this.f16615b = a.getClassLoader();
            } else {
                Log.d("DynamitePackage", "Module could not be loaded.");
                throw new RemoteException();
            }
        } catch (RemoteException e) {
            Log.e("DynamitePackage", "Failed to load ads dynamite module.", e);
        }
    }

    /* renamed from: a */
    public static fhs m11712a(Context context) {
        Context applicationContext = context.getApplicationContext();
        sdo.m34959a(applicationContext);
        synchronized (fhs.class) {
            if (f16614a == null) {
                f16614a = new fhs(applicationContext);
                Log.d("DynamitePackage", "Instantiated singleton DynamitePackage.");
            }
        }
        return f16614a;
    }

    /* renamed from: a */
    private static Object m11713a(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            Log.w("DynamitePackage", "Failed to instantiate class.", e);
            return null;
        } catch (InstantiationException e2) {
            Log.w("DynamitePackage", "Failed to instantiate class.", e2);
            return null;
        }
    }

    /* renamed from: a */
    public final Object mo10839a(String str) {
        ClassLoader classLoader = this.f16615b;
        if (classLoader == null) {
            return null;
        }
        Log.d("DynamitePackage", str.length() == 0 ? new String("Instantiating ") : "Instantiating ".concat(str));
        try {
            return m11713a(classLoader.loadClass(str));
        } catch (ClassNotFoundException e) {
            Log.w("DynamitePackage", "Failed to find class.", e);
            return null;
        }
    }
}
