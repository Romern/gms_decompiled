package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.util.Log;
import com.google.android.gms.wearable.node.GcmController$1;
import com.google.android.gms.wearable.node.GcmController$2;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: axye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axye implements ayjm {

    /* renamed from: a */
    public final AtomicBoolean f96756a = new AtomicBoolean(false);

    /* renamed from: b */
    private final Context f96757b;

    /* renamed from: c */
    private final ConnectivityManager f96758c;

    /* renamed from: d */
    private final BroadcastReceiver f96759d = new GcmController$1(this, "wearable");

    /* renamed from: e */
    private final BroadcastReceiver f96760e = new GcmController$2(this, "wearable");

    /* renamed from: f */
    private volatile boolean f96761f;

    public axye(Context context) {
        Log.w("Wear_Gcm", "Starting up Wear GcmController.");
        this.f96757b = context;
        sdo.m34970a(ayha.m84001g());
        this.f96758c = (ConnectivityManager) context.getSystemService("connectivity");
        context.registerReceiver(this.f96759d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        context.registerReceiver(this.f96760e, intentFilter);
        this.f96756a.set(((BatteryManager) context.getSystemService("batterymanager")).isCharging());
        this.f96761f = false;
        mo53761a();
        if (!this.f96761f) {
            m83559a(false);
        }
    }

    /* renamed from: a */
    private final void m83559a(boolean z) {
        Intent intent = new Intent("com.google.gservices.intent.action.GSERVICES_OVERRIDE");
        intent.putExtra("gcm_service_enable", !z ? "-1" : "1");
        this.f96757b.sendBroadcast(intent);
    }

    /* renamed from: a */
    public final void mo53761a() {
        boolean z = this.f96761f;
        boolean z2 = false;
        if (!chmx.m148999b()) {
            if (Log.isLoggable("Wear_Gcm", 2)) {
                Log.v("Wear_Gcm", "Returning true because DisableGcmOverProxy is false.");
                z2 = true;
            } else {
                z2 = true;
            }
        } else if (!chmx.m149000c() || !this.f96756a.get()) {
            Network activeNetwork = this.f96758c.getActiveNetwork();
            if (activeNetwork != null) {
                boolean hasTransport = this.f96758c.getNetworkCapabilities(activeNetwork).hasTransport(2);
                if (Log.isLoggable("Wear_Gcm", 2)) {
                    StringBuilder sb = new StringBuilder(60);
                    sb.append("defaultNetwork isBluetooth: ");
                    sb.append(hasTransport);
                    sb.append("; GCM desired set to: ");
                    sb.append(!hasTransport);
                    Log.v("Wear_Gcm", sb.toString());
                }
                if (!hasTransport) {
                    z2 = true;
                }
            } else if (Log.isLoggable("Wear_Gcm", 2)) {
                Log.v("Wear_Gcm", "Returning false because default network is disconnected.");
            }
        } else {
            if (Log.isLoggable("Wear_Gcm", 2)) {
                Log.v("Wear_Gcm", "Returning true because device is on charger.");
            }
            z2 = true;
        }
        this.f96761f = z2;
        if (this.f96761f != z) {
            if (Log.isLoggable("Wear_Gcm", 2)) {
                boolean z3 = this.f96761f;
                StringBuilder sb2 = new StringBuilder(53);
                sb2.append("maybeUpdateGcmSetting: changing gcm setting to: ");
                sb2.append(z3);
                Log.v("Wear_Gcm", sb2.toString());
            }
            m83559a(this.f96761f);
        } else if (Log.isLoggable("Wear_Gcm", 2)) {
            StringBuilder sb3 = new StringBuilder(49);
            sb3.append("maybeUpdateGcmSetting: no change in setting:");
            sb3.append(z);
            Log.v("Wear_Gcm", sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        boolean b = chmx.m148999b();
        boolean c = chmx.m149000c();
        StringBuilder sb = new StringBuilder(65);
        sb.append("Features [disableGcmOverProxy: ");
        sb.append(b);
        sb.append("] [enableGcmOnCharger: ");
        sb.append(c);
        sb.append("]");
        ssb.println(sb.toString());
        boolean z3 = this.f96761f;
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append("GCM is desired: ");
        sb2.append(z3);
        ssb.println(sb2.toString());
        String valueOf = String.valueOf(this.f96756a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb3.append("Plugged in: ");
        sb3.append(valueOf);
        ssb.println(sb3.toString());
        Network activeNetwork = this.f96758c.getActiveNetwork();
        if (activeNetwork == null) {
            ssb.print("Default network is null.");
        } else {
            boolean hasTransport = this.f96758c.getNetworkCapabilities(activeNetwork).hasTransport(2);
            StringBuilder sb4 = new StringBuilder(28);
            sb4.append("Default network is BT: ");
            sb4.append(hasTransport);
            ssb.print(sb4.toString());
        }
        ssb.println();
        ssb.println("All NetworkInfo");
        ssb.mo26034a();
        NetworkInfo[] allNetworkInfo = this.f96758c.getAllNetworkInfo();
        for (NetworkInfo networkInfo : allNetworkInfo) {
            String typeName = networkInfo.getTypeName();
            boolean isConnected = networkInfo.isConnected();
            StringBuilder sb5 = new StringBuilder(String.valueOf(typeName).length() + 26);
            sb5.append("Network: ");
            sb5.append(typeName);
            sb5.append(", connected=");
            sb5.append(isConnected);
            ssb.println(sb5.toString());
        }
        ssb.mo26035b();
    }
}
