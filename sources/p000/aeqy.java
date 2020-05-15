package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: aeqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeqy extends aequ {

    /* renamed from: d */
    private final BroadcastReceiver f63651d = new aeqx(this);

    public aeqy(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34467a() {
        this.f63645a.registerReceiver(this.f63651d, new IntentFilter("android.location.MODE_CHANGED"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo34469b() {
        this.f63645a.unregisterReceiver(this.f63651d);
    }
}
