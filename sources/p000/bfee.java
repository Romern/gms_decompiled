package p000;

import android.content.Context;
import android.content.IntentFilter;

/* renamed from: bfee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfee extends bfgs {

    /* renamed from: a */
    protected final bfed f113560a = new bfed(this);

    /* renamed from: b */
    protected final Context f113561b;

    public bfee(Context context, bfev bfev, bfew bfew, bhdb bhdb) {
        super(bfev, bfew, bhdb);
        this.f113561b = context;
    }

    /* renamed from: a */
    public static int m96492a(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 3;
            case 12:
                return 4;
            case 13:
                return 2;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61529b() {
        bfed bfed = this.f113560a;
        bfed.f113559a.f113561b.unregisterReceiver(bfed);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61527a() {
        bfed bfed = this.f113560a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        bfee bfee = bfed.f113559a;
        bfee.f113561b.registerReceiver(bfed, intentFilter, null, bfee.f113805h);
    }

    /* renamed from: a */
    public final void mo61528a(bgma bgma, int i, long j) {
        String valueOf = String.valueOf(bgma.mo61923a());
        if (valueOf.length() == 0) {
            new String("adding new BluetoothDevice: ");
        } else {
            "adding new BluetoothDevice: ".concat(valueOf);
        }
        this.f113805h.f113606a.mo61595a(bgma, i, j);
    }
}
