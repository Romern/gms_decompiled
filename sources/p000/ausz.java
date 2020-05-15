package p000;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothConnectionTracker$3;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ausz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ausz {

    /* renamed from: a */
    public static final aunx f92459a = new aunx("TrustAgent.Tracker", "BluetoothConnectionTracker");

    /* renamed from: b */
    public final ausw f92460b;

    /* renamed from: c */
    public Method f92461c = null;

    /* renamed from: d */
    public final ausy f92462d;

    /* renamed from: e */
    public final ausy f92463e;

    /* renamed from: f */
    private final Context f92464f;

    /* renamed from: g */
    private final BroadcastReceiver f92465g;

    /* renamed from: h */
    private boolean f92466h;

    /* renamed from: i */
    private final ausx f92467i;

    /* renamed from: j */
    private final ausx f92468j;

    public ausz(Context context, ausw ausw) {
        ArrayList arrayList;
        this.f92464f = context;
        this.f92460b = ausw;
        try {
            this.f92461c = BluetoothDevice.class.getMethod("isEncrypted", null);
        } catch (NoSuchMethodException e) {
            f92459a.mo50711a("Failed to find BluetoothDevice.isEncrypted private API.", new Object[0]).mo50708c();
            f92459a.mo50711a("Are you running a recent enough version of L-MR1 master?", new Object[0]).mo50708c();
        }
        Context context2 = this.f92464f;
        String g = cgzt.f188132a.mo6606a().mo84822g();
        if (TextUtils.isEmpty(g)) {
            arrayList = new ArrayList();
        } else {
            String[] split = g.split(",");
            int length = split.length;
            ArrayList arrayList2 = new ArrayList(length);
            for (String str : split) {
                arrayList2.add(Long.valueOf(Long.parseLong(str)));
            }
            arrayList = arrayList2;
        }
        this.f92462d = new ausy(context2, 3, arrayList, "com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.CONNECTION_ALARM");
        this.f92463e = new ausy(this.f92464f, 2, Collections.singletonList(Long.valueOf(cgzt.f188132a.mo6606a().mo84816a())), "com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.DISCONNECTION_ALARM");
        this.f92467i = new ausu(this);
        this.f92468j = new ausv(this);
        this.f92465g = new BluetoothConnectionTracker$3(this, "trustagent");
    }

    /* renamed from: a */
    public final void mo50895a() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        this.f92464f.registerReceiver(this.f92465g, intentFilter);
        this.f92462d.mo50888a(this.f92467i);
        this.f92463e.mo50888a(this.f92468j);
        this.f92466h = true;
    }

    /* renamed from: b */
    public final void mo50896b() {
        if (this.f92466h) {
            this.f92464f.unregisterReceiver(this.f92465g);
            this.f92462d.mo50891b(this.f92467i);
            this.f92463e.mo50891b(this.f92468j);
            this.f92466h = false;
        }
    }
}
