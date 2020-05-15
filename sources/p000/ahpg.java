package p000;

import android.bluetooth.BluetoothDevice;
import java.util.Arrays;
import java.util.Map;

/* renamed from: ahpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahpg {

    /* renamed from: a */
    final ahkv f67710a;

    /* renamed from: b */
    final String f67711b;

    /* renamed from: c */
    final byte[] f67712c;

    /* renamed from: d */
    final Map f67713d = new C1223np();

    /* renamed from: e */
    public final /* synthetic */ ahpz f67714e;

    public ahpg(ahpz ahpz, ahkv ahkv, String str) {
        this.f67714e = ahpz;
        this.f67710a = ahkv;
        this.f67711b = str;
        this.f67712c = ahpz.m56332a(str);
    }

    /* renamed from: a */
    public final void mo36944a(BluetoothDevice bluetoothDevice) {
        this.f67714e.mo36847a(new ahpe(this, bluetoothDevice));
    }

    /* renamed from: a */
    public final boolean mo36945a(ahmr ahmr) {
        if (ahmr == null) {
            srn srn = ahkm.f67363a;
            return false;
        } else if (ahmr.f67567b != this.f67714e.mo36959h()) {
            srn srn2 = ahkm.f67363a;
            return false;
        } else if (Arrays.equals(ahmr.f67569d, this.f67712c)) {
            return true;
        } else {
            srn srn3 = ahkm.f67363a;
            ahkm.m55981a(this.f67712c);
            ahkm.m55981a(ahmr.f67569d);
            return false;
        }
    }
}
