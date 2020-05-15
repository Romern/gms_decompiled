package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.fido.client.transport.BleBroadcastReceiver;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.view.BleEnableViewOptions;
import com.google.android.gms.fido.fido2.api.view.BleViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* renamed from: xgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xgi extends xhb {

    /* renamed from: a */
    public final Context f52189a;

    /* renamed from: b */
    public final xwj f52190b;

    /* renamed from: c */
    public final RequestOptions f52191c;

    /* renamed from: d */
    public final String f52192d;

    /* renamed from: e */
    public final String f52193e;

    /* renamed from: f */
    public final xoo f52194f;

    /* renamed from: g */
    public final xhi f52195g;

    /* renamed from: h */
    public final bqgy f52196h;

    /* renamed from: i */
    public xgj f52197i;

    /* renamed from: j */
    public boolean f52198j;

    /* renamed from: k */
    public boolean f52199k;

    /* renamed from: m */
    private final BluetoothAdapter f52200m;

    /* renamed from: n */
    private final BleBroadcastReceiver f52201n = new BleBroadcastReceiver(this);

    /* renamed from: o */
    private final xgn f52202o;

    /* renamed from: p */
    private final xih f52203p;

    /* renamed from: q */
    private boolean f52204q;

    public xgi(Context context, xwj xwj, RequestOptions requestOptions, String str, String str2, xoo xoo, xhi xhi, BluetoothAdapter bluetoothAdapter, xgn xgn, xih xih) {
        this.f52189a = context;
        this.f52190b = xwj;
        this.f52191c = requestOptions;
        this.f52192d = str;
        this.f52193e = str2;
        this.f52194f = xoo;
        this.f52195g = xhi;
        this.f52200m = bluetoothAdapter;
        this.f52202o = xgn;
        this.f52203p = xih;
        this.f52196h = bqgy.m112818c();
        this.f52197i = xgk.m42883a();
        this.f52204q = false;
        this.f52198j = false;
        this.f52199k = false;
    }

    /* renamed from: a */
    public final bqgg mo29726a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.f52189a.registerReceiver(this.f52201n, intentFilter);
        if (this.f52203p.mo29801a() && this.f52200m.isEnabled()) {
            this.f52200m.startDiscovery();
        }
        return this.f52196h;
    }

    /* renamed from: b */
    public final void mo29730b() {
        this.f52204q = true;
        mo29729a(this.f52197i);
    }

    /* renamed from: c */
    public final void mo29731c() {
        this.f52204q = false;
    }

    /* renamed from: d */
    public final void mo29732d() {
        if (this.f52200m.isDiscovering()) {
            this.f52200m.cancelDiscovery();
        }
        if (!this.f52196h.isDone()) {
            this.f52196h.mo69136a((Throwable) adbe.m50106a(34004));
        }
        this.f52189a.unregisterReceiver(this.f52201n);
        if (this.f52198j) {
            this.f52200m.disable();
        }
        if (this.f52199k) {
            this.f52203p.mo29803c();
        }
    }

    /* renamed from: e */
    public final Transport mo29733e() {
        return Transport.BLUETOOTH_LOW_ENERGY;
    }

    /* renamed from: f */
    public final void mo29734f() {
        this.f52197i.mo29719d();
    }

    /* renamed from: a */
    public final void mo29727a(int i) {
        ViewOptions viewOptions;
        boolean isEnabled = this.f52200m.isEnabled();
        boolean a = this.f52203p.mo29801a();
        if (isEnabled && a) {
            viewOptions = new BleViewOptions(this.f52202o.mo29737a());
        } else {
            viewOptions = new BleEnableViewOptions(isEnabled, a);
        }
        bmxv a2 = this.f52195g.mo29745a(i, viewOptions);
        if (a2.mo66813a()) {
            this.f52194f.mo14261a(((ViewOptions) a2.mo66814b()).toString());
        }
    }

    /* renamed from: a */
    public final void mo29728a(ViewOptions viewOptions) {
        this.f52197i.mo29716a(viewOptions);
    }

    /* renamed from: a */
    public final void mo29729a(xgj xgj) {
        this.f52197i = xgj;
        if (this.f52204q) {
            bqgg a = xgj.mo29715a();
            bqga.m112781a(a, new xgh(this, a), bqfb.INSTANCE);
        }
    }
}
