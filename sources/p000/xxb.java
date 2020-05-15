package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import java.util.Set;

/* renamed from: xxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxb {

    /* renamed from: c */
    public static final Logger f53322c = new Logger(new String[]{"HeadlessU2fApiHelper"}, (short[]) null);

    /* renamed from: d */
    private static xxb f53323d;

    /* renamed from: a */
    public final xxs f53324a;

    /* renamed from: b */
    public boolean f53325b = false;

    private xxb(xws xws) {
        xxs xxs = new xxs(xws);
        this.f53324a = xxs;
    }

    /* renamed from: a */
    public static xxb m43593a(xws xws) {
        if (f53323d == null) {
            bmxy.m108581a(xws);
            f53323d = new xxb(xws);
        }
        return f53323d;
    }

    /* renamed from: a */
    public final xyy mo30210a(Context context, Set set) {
        return new xyy(BluetoothAdapter.getDefaultAdapter(), xhy.m42973a(context), context.getPackageManager().hasSystemFeature("android.hardware.usb.host"), set);
    }
}
