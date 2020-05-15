package p000;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.BluetoothLeAdvertiser;

/* renamed from: xtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xtm {

    /* renamed from: g */
    public static final Logger f53067g = new Logger(new String[]{"CableBleAdvertiser"}, (short[]) null);

    /* renamed from: a */
    public final xwj f53068a;

    /* renamed from: b */
    public final BluetoothLeAdvertiser f53069b;

    /* renamed from: c */
    public final AdvertiseCallback f53070c;

    /* renamed from: d */
    public final xwn f53071d;

    /* renamed from: e */
    public boolean f53072e = false;

    /* renamed from: f */
    public final xtc f53073f;

    public xtm(xwj xwj, xtc xtc, BluetoothLeAdvertiser bluetoothLeAdvertiser, xwn xwn) {
        this.f53068a = xwj;
        this.f53073f = xtc;
        this.f53069b = bluetoothLeAdvertiser;
        this.f53071d = xwn;
        this.f53070c = new xtl(xtc, xwn, xwj);
    }
}
