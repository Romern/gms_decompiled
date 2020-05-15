package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* renamed from: aqjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjl extends aqjp {

    /* renamed from: a */
    public final aqkf f86216a;

    /* renamed from: b */
    public final boolean f86217b;

    public aqjl(Context context, aqkf aqkf, boolean z) {
        super(context, true);
        this.f86216a = aqkf;
        this.f86217b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47913a(boolean z) {
        Settings.Global.putInt(this.f86226g.getContentResolver(), "wifi_scan_always_enabled", z ? 1 : 0);
        int i = Build.VERSION.SDK_INT;
        Settings.Global.putInt(this.f86226g.getContentResolver(), "ble_scan_always_enabled", z);
    }
}
