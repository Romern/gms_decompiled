package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* renamed from: aicc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aicc extends buqn {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f68663a;

    /* renamed from: b */
    final /* synthetic */ aicp f68664b;

    /* renamed from: c */
    final /* synthetic */ Intent f68665c;

    /* renamed from: d */
    final /* synthetic */ aics f68666d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aicc(aics aics, String str, BluetoothDevice bluetoothDevice, aicp aicp, Intent intent) {
        super(str);
        this.f68666d = aics;
        this.f68663a = bluetoothDevice;
        this.f68664b = aicp;
        this.f68665c = intent;
    }

    public final void run() {
        bvkn a;
        srn srn = ahsd.f67925a;
        ahyz a2 = this.f68666d.f68705b.mo37033a(this.f68663a.getAddress());
        if (!cfoj.m141529J()) {
            boolean contains = BluetoothAdapter.getDefaultAdapter().getBondedDevices().contains(this.f68663a);
            if (cfoj.m141562l() && contains && this.f68664b == aicp.CONNECTED) {
                this.f68666d.mo37402a(this.f68663a, a2);
            } else {
                cfoj.m141562l();
            }
        }
        if (a2 != null) {
            this.f68665c.getAction();
            if (this.f68664b == aicp.CONNECTED) {
                ahhd.m55769a(this.f68666d.f68708e, "com.google.android.gms.nearby.ACTION_FAST_PAIR_CONNECTED");
            }
            if (cfoj.m141549ad()) {
                this.f68666d.mo37400a(a2, this.f68665c.getAction());
            } else {
                ((ahvf) ahgz.m55754a(this.f68666d.f68708e, ahvf.class)).mo37202b(this.f68665c.getAction(), a2);
            }
            aics aics = this.f68666d;
            ahur.m56672a(aics.f68708e, this.f68663a, a2, aics.f68710g);
            aics aics2 = this.f68666d;
            Context context = aics2.f68708e;
            ahst ahst = aics2.f68705b;
            if (cfoj.m141559i() && ((sqv) ahgz.m55754a(context, sqv.class)).mo20505a() - a2.f68435i > cfog.f184854a.mo6606a().mo81947I() && (a = ahty.m56652a(context, a2.f68437k)) != null) {
                ahst.mo37041a(a2.f68428b, a.f156447b);
            }
        }
    }
}
