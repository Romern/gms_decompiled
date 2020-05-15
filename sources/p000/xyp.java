package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/* renamed from: xyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xyp implements xzr {

    /* renamed from: a */
    private final Context f53372a;

    /* renamed from: b */
    private final BluetoothAdapter f53373b;

    /* renamed from: c */
    private final xgn f53374c;

    public xyp(Context context, BluetoothAdapter bluetoothAdapter, xgn xgn) {
        bmxy.m108581a(context);
        this.f53372a = context;
        bmxy.m108581a(bluetoothAdapter);
        this.f53373b = bluetoothAdapter;
        bmxy.m108581a(xgn);
        this.f53374c = xgn;
    }

    /* renamed from: a */
    public final xhq mo30272a(xwj xwj, xzq xzq, xfo xfo, xzz xzz, xws xws) {
        return new xyr(this.f53372a, xwj, this.f53373b, this.f53374c, xzq, xfo, xzz, xws);
    }
}
