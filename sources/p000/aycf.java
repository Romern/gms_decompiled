package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.wearable.node.ble.IosSystemServicesHandler$1;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aycf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aycf {

    /* renamed from: a */
    public final Context f97108a;

    /* renamed from: b */
    public boolean f97109b = false;

    /* renamed from: c */
    public final AtomicBoolean f97110c = new AtomicBoolean(false);

    /* renamed from: d */
    public final BroadcastReceiver f97111d = new IosSystemServicesHandler$1(this, "wearable");

    /* renamed from: e */
    public boolean f97112e;

    /* renamed from: f */
    aybk f97113f;

    /* renamed from: g */
    aybi f97114g;

    /* renamed from: h */
    public Handler f97115h;

    /* renamed from: i */
    public ContentObserver f97116i;

    /* renamed from: j */
    public aybm f97117j;

    public aycf(Context context) {
        new IntentFilter("com.google.android.clockwork.settings.ACTION_SET_HOME_READY");
        this.f97112e = false;
        this.f97108a = context;
        axty axty = axty.f96348a;
        axty.mo53544a("bleconnectionmanager-ams-connection-attempt");
        axty.mo53544a("bleconnectionmanager-ancs-connection-attempt");
        axty.mo53544a("bleconnectionmanager-ams-connected");
        axty.mo53544a("bleconnectionmanager-ancs-connected");
    }
}
