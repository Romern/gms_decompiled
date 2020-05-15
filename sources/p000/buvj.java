package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* renamed from: buvj */
final /* synthetic */ class buvj implements blvj {

    /* renamed from: a */
    static final blvj f155043a = new buvj();

    private buvj() {
    }

    /* renamed from: a */
    public final aysm mo13778a(Context context, String str, ayso ayso) {
        return aysm.m84710a(((BluetoothDevice) ((buvc) ahgz.m55754a(context, buvc.class)).f155028a.get(str)).connectGatt(context, false, ayso.f98422b));
    }
}
