package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: bhdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdd {
    /* renamed from: a */
    public static Collection m100666a(axos axos, Context context) {
        ClientIdentity clientIdentity;
        float f;
        if (!axos.mo53332a("REQUEST_LIST")) {
            if (Log.isLoggable("FlpConverters", 6)) {
                Log.e("FlpConverters", "malformed DataMap: missing key REQUEST_LIST");
            }
            return Collections.emptyList();
        }
        ArrayList e = axos.mo53341e("REQUEST_LIST");
        ArrayList arrayList = new ArrayList(e.size());
        int size = e.size();
        for (int i = 0; i < size; i++) {
            axos axos2 = (axos) e.get(i);
            LocationRequest a = LocationRequest.m66854a();
            if (axos2.mo53332a("PRIORITY")) {
                a.mo43553c(axos2.mo53345h("PRIORITY"));
            }
            if (axos2.mo53332a("INTERVAL_MS")) {
                a.mo43554c(axos2.mo53347i("INTERVAL_MS"));
            }
            if (axos2.mo53332a("FASTEST_INTERVAL_MS")) {
                a.mo43552b(axos2.mo53347i("FASTEST_INTERVAL_MS"));
            }
            if (axos2.mo53332a("MAX_WAIT_TIME_MS")) {
                a.mo43556d(axos2.mo53347i("MAX_WAIT_TIME_MS"));
            }
            if (axos2.mo53332a("SMALLEST_DISPLACEMENT_METERS")) {
                Object obj = axos2.f96223a.get("SMALLEST_DISPLACEMENT_METERS");
                if (obj != null) {
                    try {
                        f = ((Float) obj).floatValue();
                    } catch (ClassCastException e2) {
                        axos.m82824a("SMALLEST_DISPLACEMENT_METERS", obj, "Float", Float.valueOf(0.0f), e2);
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                if (f >= 0.0f) {
                    a.f79355g = f;
                } else {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("invalid displacement: ");
                    sb.append(f);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (axos2.mo53332a("NUM_UPDATES")) {
                a.mo43551b(axos2.mo53345h("NUM_UPDATES"));
            }
            if (axos2.mo53332a("EXPIRATION_DURATION_MS")) {
                long i2 = axos2.mo53347i("EXPIRATION_DURATION_MS");
                if (i2 < Long.MAX_VALUE) {
                    i2 += SystemClock.elapsedRealtime();
                }
                a.mo43549a(i2);
            }
            String[] strArr = null;
            LocationRequestInternal a2 = LocationRequestInternal.m66889a(null, a);
            if (axos2.mo53332a("CLIENTS_PACKAGE_ARRAY") && context != null) {
                Object obj2 = axos2.f96223a.get("CLIENTS_PACKAGE_ARRAY");
                if (obj2 != null) {
                    try {
                        strArr = (String[]) obj2;
                    } catch (ClassCastException e3) {
                        axos.m82823a("CLIENTS_PACKAGE_ARRAY", obj2, "String[]", e3);
                    }
                }
                int length = strArr.length;
                ArrayList arrayList2 = new ArrayList(length);
                for (String str : strArr) {
                    try {
                        clientIdentity = new ClientIdentity(svr.m36484b(context).mo26172a(str, 0).uid, str);
                    } catch (PackageManager.NameNotFoundException e4) {
                        if (Log.isLoggable("FlpConverters", 5)) {
                            String valueOf = String.valueOf(str);
                            Log.w("FlpConverters", valueOf.length() == 0 ? new String("received client identity unknown on device: ") : "received client identity unknown on device: ".concat(valueOf));
                        }
                        clientIdentity = new ClientIdentity(context.getApplicationInfo().uid, context.getPackageName());
                    }
                    arrayList2.add(clientIdentity);
                }
                a2.mo43613a(arrayList2);
            }
            if (axos2.mo53332a("TAG")) {
                a2.f79422d = axos2.mo53337c("TAG");
            }
            arrayList.add(a2);
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axos.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      axos.a(java.lang.String, double):void
      axos.a(java.lang.String, float):void
      axos.a(java.lang.String, int):void
      axos.a(java.lang.String, long):void
      axos.a(java.lang.String, axos):void
      axos.a(java.lang.String, java.lang.String):void
      axos.a(java.lang.String, java.util.ArrayList):void
      axos.a(java.lang.String, byte[]):void
      axos.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public static void m100667a(axos axos, Location location) {
        axos.mo53328a("PROVIDER", location.getProvider());
        axos.mo53323a("LATITUDE", location.getLatitude());
        axos.mo53323a("LONGITUDE", location.getLongitude());
        axos.mo53326a("TIME_NS", location.getTime());
        int i = Build.VERSION.SDK_INT;
        axos.mo53326a("ELAPSED_REALTIME_NS", location.getElapsedRealtimeNanos());
        if (location.hasAccuracy()) {
            axos.mo53324a("ACCURACY", location.getAccuracy());
        }
        if (location.hasBearing()) {
            axos.mo53324a("BEARING", location.getBearing());
        }
        if (location.hasSpeed()) {
            axos.mo53324a("SPEED", location.getSpeed());
        }
        if (location.hasAltitude()) {
            axos.mo53323a("ALTITUDE", location.getAltitude());
        }
        if (aeim.m51907k(location)) {
            axos.mo53330a("MOCK", true);
        }
        int j = aeim.m51906j(location);
        if (j != 0) {
            axos.mo53325a("TYPE", j);
        }
        Location a = aeim.m51884a(location, "noGPSLocation");
        if (a != null) {
            axos axos2 = new axos();
            m100667a(axos2, a);
            axos.mo53327a("NO_GPS_LOCATION", axos2);
        }
    }
}
