package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ejp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ejp {

    /* renamed from: a */
    private final Context f15147a;

    /* renamed from: b */
    private Map f15148b = null;

    public ejp(Context context) {
        this.f15147a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final eji mo10211a(String str) {
        Bundle bundle;
        Map map;
        if (this.f15148b == null) {
            Context context = this.f15147a;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        bundle = null;
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                } else {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    bundle = null;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("BackendRegistry", "Application info not found.");
                bundle = null;
            }
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.emptyMap();
            } else {
                HashMap hashMap = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String trim = str3.trim();
                            if (!trim.isEmpty()) {
                                hashMap.put(trim, str2.substring(8));
                            }
                        }
                    }
                }
                map = hashMap;
            }
            this.f15148b = map;
        }
        String str4 = (String) this.f15148b.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (eji) Class.forName(str4).asSubclass(eji.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e2) {
            Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e3);
            return null;
        } catch (InstantiationException e4) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e6);
            return null;
        }
    }
}
