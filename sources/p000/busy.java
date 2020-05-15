package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.util.SparseArray;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: busy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class busy {

    /* renamed from: e */
    static final bngj f154827e = new bnod(new Object[]{2, "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", 1, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"}, 2);

    /* renamed from: h */
    public static final /* synthetic */ int f154828h = 0;

    /* renamed from: a */
    public final Context f154829a;

    /* renamed from: b */
    public final BluetoothAdapter f154830b = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: c */
    public final bngx f154831c;

    /* renamed from: d */
    public final SparseArray f154832d;

    /* renamed from: f */
    final BroadcastReceiver f154833f;

    /* renamed from: g */
    BluetoothProfile.ServiceListener f154834g = new busu(this);

    /* renamed from: i */
    private boolean f154835i;

    /* renamed from: j */
    private final List f154836j = new ArrayList();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bndz.a(java.lang.Object, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bndz.a(int, java.lang.String):void
      bndz.a(java.lang.Object, java.lang.Object):void */
    static {
        bndz.m109114a((Object) 2, (Object) "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        bndz.m109114a((Object) 1, (Object) "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
    }

    public busy(Context context, List list) {
        this.f154829a = context;
        this.f154832d = new SparseArray(list.size());
        this.f154831c = bngx.m109368a((Collection) list);
        if (this.f154830b == null) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68432a("busy", "<init>", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BTConnStateMgr:BluetoothAdapter.getDefaultAdapter() return null!");
            this.f154833f = null;
            this.f154835i = true;
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            this.f154830b.getProfileProxy(context, this.f154834g, intValue);
            bngj bngj = f154827e;
            Integer valueOf = Integer.valueOf(intValue);
            if (bngj.containsKey(valueOf)) {
                intentFilter.addAction((String) f154827e.get(valueOf));
            } else {
                bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
                bnsl2.mo68432a("busy", "<init>", 80, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("BTConnStateMgr:untrackable profile:%d, the connection status change will not be able to dispatch to stateChangeListener!", intValue);
            }
        }
        if (intentFilter.countActions() > 0) {
            if (cfoj.m141536Q()) {
                mo73092a(new bust(this, context));
            }
            busw busw = new busw(new buss(this));
            this.f154833f = busw;
            context.registerReceiver(busw, intentFilter);
            return;
        }
        this.f154833f = null;
    }

    /* renamed from: a */
    public final BluetoothDevice mo73089a(String str, int i) {
        BluetoothProfile bluetoothProfile;
        bmxy.m108596a(this.f154831c.contains(Integer.valueOf(i)), "Unregistered profile:%s", Integer.toString(i));
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            bluetoothProfile = (BluetoothProfile) this.f154832d.get(i);
            if (bluetoothProfile != null) {
                arrayList.addAll(bluetoothProfile.getConnectedDevices());
            }
        }
        if (bluetoothProfile == null) {
            if (!cfoj.m141536Q()) {
                bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                bnsl.mo68432a("busy", "a", 291, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("BTConnStateMgr: getConnectedDevice called but proxy is not connected!");
                return null;
            }
            BluetoothAdapter bluetoothAdapter = this.f154830b;
            if (bluetoothAdapter == null) {
                return null;
            }
            if (!bluetoothAdapter.isEnabled()) {
                bnsl bnsl2 = (bnsl) busr.f154819a.mo68390d();
                bnsl2.mo68432a("busy", "a", (int) ErrorInfo.TYPE_FSC_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("BTConnStateMgr: getConnectedDevice called without proxy because bluetoothAdapter is not enabled.");
                return null;
            } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                bnsl bnsl3 = (bnsl) busr.f154819a.mo68390d();
                bnsl3.mo68432a("busy", "a", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("BTConnStateMgr: getConnectedDevice called but proxy is not connected, try reconnect but can't wait on main thread!");
                this.f154830b.getProfileProxy(this.f154829a, this.f154834g, i);
                return null;
            } else {
                bnsl bnsl4 = (bnsl) busr.f154819a.mo68390d();
                bnsl4.mo68432a("busy", "a", 315, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("BTConnStateMgr: getConnectedDevice called but proxy is not connected, try reconnect and wait.");
                bqgy c = bqgy.m112818c();
                busv busv = new busv(i, c);
                mo73092a(busv);
                this.f154830b.getProfileProxy(this.f154829a, this.f154834g, i);
                try {
                    arrayList.addAll((Collection) c.get(cfog.f184854a.mo6606a().mo81971aF(), TimeUnit.MILLISECONDS));
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    bnsl bnsl5 = (bnsl) busr.f154819a.mo68388c();
                    bnsl5.mo68437a(e);
                    bnsl5.mo68432a("busy", "a", 342, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("BTConnStateMgr: proxy reconnect failed.");
                }
                synchronized (this.f154836j) {
                    this.f154836j.remove(busv);
                }
            }
        }
        if (arrayList.isEmpty()) {
            bnsl bnsl6 = (bnsl) busr.f154819a.mo68388c();
            bnsl6.mo68432a("busy", "a", 348, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68409a("BTConnStateMgr: Doesn't get any device from profile proxy %d.", i);
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) arrayList.get(i2);
            if (bluetoothDevice != null && bluetoothDevice.getAddress().equals(str)) {
                return bluetoothDevice;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo73093b() {
        if (this.f154835i) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68432a("busy", "b", 363, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BTConnStateMgr: Already destroyed!");
            return;
        }
        this.f154835i = true;
        for (int i = 0; i < this.f154832d.size(); i++) {
            int keyAt = this.f154832d.keyAt(i);
            this.f154830b.closeProfileProxy(keyAt, (BluetoothProfile) this.f154832d.get(keyAt));
        }
        this.f154832d.clear();
        BroadcastReceiver broadcastReceiver = this.f154833f;
        if (broadcastReceiver != null) {
            try {
                this.f154829a.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("busy", "b", 377, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("BTConnStateMgr: unregisterReceiver meet exception!");
            }
        }
    }

    /* renamed from: a */
    public final BluetoothDevice mo73090a(String str, List list) {
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            int intValue = ((Integer) list.get(i)).intValue();
            if (this.f154831c.contains(Integer.valueOf(intValue))) {
                BluetoothDevice a = mo73089a(str, intValue);
                if (a != null) {
                    return a;
                }
                z = true;
            }
        }
        bmxy.m108596a(z, "Unregistered profiles:%s", list.toString());
        return null;
    }

    /* renamed from: a */
    public final List mo73091a() {
        bngx a;
        synchronized (this.f154836j) {
            a = bngx.m109368a((Collection) this.f154836j);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo73092a(busx busx) {
        synchronized (this.f154836j) {
            this.f154836j.add(busx);
        }
        synchronized (this) {
            for (int i = 0; i < this.f154832d.size(); i++) {
                int keyAt = this.f154832d.keyAt(i);
                busx.mo37230a(keyAt, (BluetoothProfile) this.f154832d.get(keyAt));
            }
        }
    }
}
