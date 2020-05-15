package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import java.util.Iterator;
import java.util.Set;

/* renamed from: aico */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aico extends buqn {

    /* renamed from: a */
    final /* synthetic */ Intent f68696a;

    /* renamed from: b */
    final /* synthetic */ aics f68697b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aico(aics aics, String str, Intent intent) {
        super(str);
        this.f68697b = aics;
        this.f68696a = intent;
    }

    public final void run() {
        ahyz ahyz;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            srn srn = ahsd.f67925a;
            return;
        }
        bxtx a = bxtx.m123261a(this.f68696a.getByteArrayExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY"));
        Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
        Iterator it = this.f68697b.f68705b.mo37050d().iterator();
        while (true) {
            ahyz = null;
            if (!it.hasNext()) {
                break;
            }
            ahyz ahyz2 = (ahyz) it.next();
            if (ahyz2.f68429c.equals(a)) {
                srn srn2 = ahsd.f67925a;
                BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(ahyz2.f68428b);
                if (!bondedDevices.contains(remoteDevice) || remoteDevice.removeBond()) {
                    ahyz = ahyz2;
                }
            }
        }
        if (!cfoj.f184966a.mo6606a().mo82054E()) {
            if (ahyz != null) {
                srn srn3 = ahsd.f67925a;
                this.f68697b.f68705b.mo37049c(ahyz.f68428b);
                if (cfoj.m141560j() && this.f68697b.f68705b.mo37044b(ahyz.f68437k) == 0) {
                    ahzt.m56926a(this.f68697b.f68708e, ahyz.f68437k);
                }
            }
            if (cfoj.m141526G()) {
                this.f68697b.f68714k.mo37232a(a);
            }
        }
    }
}
