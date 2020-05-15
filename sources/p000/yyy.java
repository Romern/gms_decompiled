package p000;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;

/* renamed from: yyy */
final /* synthetic */ class yyy implements bmzi {

    /* renamed from: a */
    private final yzp f54836a;

    public yyy(yzp yzp) {
        this.f54836a = yzp;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        yzp yzp = this.f54836a;
        int i = Build.VERSION.SDK_INT;
        if (BluetoothAdapter.getDefaultAdapter() != null) {
            return zhy.m45482a(yzp.f54857c);
        }
        return null;
    }
}
