package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.node.bluetooth.BluetoothClient$1;
import com.google.android.gms.wearable.node.bluetooth.BluetoothClient$2;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aycm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aycm implements Closeable, ayjm {

    /* renamed from: a */
    public final Map f97143a = new HashMap();

    /* renamed from: b */
    public final Map f97144b = new HashMap();

    /* renamed from: c */
    public final Context f97145c;

    /* renamed from: d */
    private final BluetoothAdapter f97146d = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: e */
    private final long f97147e;

    /* renamed from: f */
    private final BroadcastReceiver f97148f = new BluetoothClient$1(this, "wearable");

    /* renamed from: g */
    private final BroadcastReceiver f97149g = new BluetoothClient$2(this, "wearable");

    public aycm(Context context) {
        sdo.m34967a("BluetoothClient.constructor");
        this.f97145c = context;
        this.f97147e = System.currentTimeMillis();
        this.f97145c.registerReceiver(this.f97149g, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.node.bluetooth.RETRY_CONNECTION");
        intentFilter.addDataScheme("content");
        this.f97145c.registerReceiver(this.f97148f, intentFilter);
    }

    /* renamed from: a */
    public static final void m83822a(String str) {
        if (Log.isLoggable("WearableBluetooth", 3)) {
            Log.d("WearableBluetooth", str);
        }
    }

    /* renamed from: c */
    private static final void m83823c(ConnectionConfiguration connectionConfiguration) {
        if (!connectionConfiguration.mo60246b() || connectionConfiguration.f110866c != 1 || connectionConfiguration.f110867d != 1 || connectionConfiguration.f110865b == null) {
            String valueOf = String.valueOf(connectionConfiguration);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Invalid config: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo53901b(ConnectionConfiguration connectionConfiguration) {
        m83823c(connectionConfiguration);
        String str = connectionConfiguration.f110865b;
        aycn aycn = (aycn) this.f97144b.get(str);
        if (aycn != null) {
            aycn.close();
            this.f97144b.remove(str);
            if (this.f97144b.isEmpty()) {
                ayha.m83996b().mo53964b();
            }
        }
        this.f97143a.remove(str);
    }

    public final void close() {
        sdo.m34967a("close");
        this.f97145c.unregisterReceiver(this.f97149g);
        this.f97145c.unregisterReceiver(this.f97148f);
        for (aycn aycn : this.f97144b.values()) {
            aycn.close();
        }
        this.f97144b.clear();
        this.f97143a.clear();
        ayha.m83996b().mo53964b();
    }

    /* renamed from: a */
    public final void mo53900a(ConnectionConfiguration connectionConfiguration) {
        m83823c(connectionConfiguration);
        String str = connectionConfiguration.f110865b;
        if (this.f97143a.containsKey(str)) {
            aycn aycn = (aycn) this.f97144b.get(str);
            if (aycn != null && this.f97146d.isEnabled()) {
                sdo.m34967a("resetBackoffAndRetryConnection");
                ayco ayco = aycn.f97150a;
                ayco.f97154a.mo53966a();
                ayco.mo53904a();
                return;
            }
            return;
        }
        this.f97143a.put(str, connectionConfiguration);
        if (this.f97146d.isEnabled()) {
            this.f97144b.put(str, new aycn(this.f97145c, connectionConfiguration));
            ayha.m83996b().mo53962a();
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        sdo.m34967a("dump");
        ssb.println("BluetoothClientChimeraService");
        ssb.mo26034a();
        String valueOf = String.valueOf(ayjl.m84112a(this.f97147e));
        ssb.println(valueOf.length() == 0 ? new String("First started: ") : "First started: ".concat(valueOf));
        ssb.println();
        for (aycn aycn : this.f97144b.values()) {
            aycn.mo53558a(ssb, z, z2);
        }
        ssb.mo26035b();
    }
}
