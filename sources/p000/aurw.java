package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: aurw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurw {

    /* renamed from: a */
    public static final aunx f92381a = new aunx("TrustAgent", "EidCapabilityTracker");

    /* renamed from: b */
    public final Object f92382b = new Object();

    /* renamed from: c */
    public final ConcurrentMap f92383c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Map f92384d = new HashMap();

    /* renamed from: e */
    public final Map f92385e = new HashMap();

    /* renamed from: f */
    public final ausz f92386f;

    /* renamed from: g */
    public final auoq f92387g;

    /* renamed from: h */
    public final auoo f92388h;

    /* renamed from: i */
    private final ausf f92389i = ausf.m77753a();

    /* renamed from: j */
    private final aurv f92390j;

    public aurw(Context context) {
        aurj a = aurj.m77699a();
        a.getClass();
        this.f92387g = new auoq(context, new aurs(a));
        this.f92388h = new aurt(this);
        this.f92386f = new ausz(context, new auru(this));
        this.f92390j = new aurv(this);
    }

    /* renamed from: a */
    public final void mo50855a() {
        synchronized (this.f92382b) {
            for (BluetoothDevice bluetoothDevice : this.f92384d.keySet()) {
                aunx aunx = f92381a;
                String valueOf = String.valueOf(bluetoothDevice.getName());
                aunx.mo50711a(valueOf.length() == 0 ? new String("refresh device ") : "refresh device ".concat(valueOf), new Object[0]);
                if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                    mo50856a(bluetoothDevice);
                } else if (!bluetoothDevice.isConnected()) {
                    this.f92389i.mo50866a((autq) this.f92385e.get(bluetoothDevice));
                    mo50856a(bluetoothDevice);
                } else {
                    ausf ausf = this.f92389i;
                    autq autq = (autq) this.f92385e.get(bluetoothDevice);
                    long d = cgzt.f188132a.mo6606a().mo84819d();
                    aurv aurv = this.f92390j;
                    aunx aunx2 = ausf.f92404a;
                    String valueOf2 = String.valueOf(ausf.f92410f.keySet());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 48);
                    sb.append("try to enable notification. Enabled device set: ");
                    sb.append(valueOf2);
                    aunx2.mo50711a(sb.toString(), new Object[0]);
                    if (ausf.f92410f.containsKey(autq.mo50909a())) {
                        ausf.f92404a.mo50711a("Data notification has already been enabled", new Object[0]).mo50706a();
                    } else {
                        try {
                            ausf.f92412h.mo50879a(new aurz(ausf, new Object[]{autq.mo50909a()}, autq, aurv), d, new ausa(aurv, autq));
                        } catch (ausj e) {
                            ausf.f92404a.mo50711a("Enabling notification for %s is in processing", autq.mo50909a().getName()).mo50706a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50856a(BluetoothDevice bluetoothDevice) {
        for (autp autp : this.f92383c.keySet()) {
            if (autp.f92504a.equals(bluetoothDevice)) {
                autj autj = (autj) this.f92383c.get(autp);
                autj.f92489b = false;
                autj.f92490c = -1;
                mo50858a(bluetoothDevice, autj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo50857a(BluetoothDevice bluetoothDevice, autf autf) {
        aunx aunx = f92381a;
        String valueOf = String.valueOf(bluetoothDevice.getName());
        aunx.mo50711a(valueOf.length() == 0 ? new String("unregister device ") : "unregister device ".concat(valueOf), new Object[0]);
        synchronized (this.f92382b) {
            autq autq = (autq) this.f92385e.get(bluetoothDevice);
            if (autq != null) {
                Set set = (Set) this.f92384d.get(bluetoothDevice);
                set.remove(autf);
                if (set.isEmpty()) {
                    this.f92389i.mo50866a(autq);
                    this.f92385e.remove(bluetoothDevice);
                    this.f92384d.remove(bluetoothDevice);
                }
                if (this.f92384d.isEmpty()) {
                    this.f92386f.mo50896b();
                    this.f92387g.mo50743b(this.f92388h);
                }
            } else {
                aunx aunx2 = f92381a;
                String name = bluetoothDevice.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 22);
                sb.append("Device ");
                sb.append(name);
                sb.append(" is not tracked");
                aunx2.mo50711a(sb.toString(), new Object[0]).mo50709d();
            }
        }
    }

    /* renamed from: a */
    public final void mo50858a(BluetoothDevice bluetoothDevice, autj autj) {
        synchronized (this.f92382b) {
            for (autf autf : (Set) this.f92384d.get(bluetoothDevice)) {
                autf.f92481a.f109175j.mo50903a(autj);
                autf.f92481a.mo59564g();
                HashMap hashMap = new HashMap();
                hashMap.put("trustlet_id", autj.f92488a.f92504a.getAddress());
                hashMap.put("device_capability_key", autj.f92488a.f92505b);
                hashMap.put("device_capability_state_key", String.valueOf(autj.f92489b));
                autf.f92481a.mo59561b("device_capability_state_changed", aumv.m77341a(hashMap));
            }
        }
    }
}
