package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.config.InvalidConfigException;

/* renamed from: dfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dfu extends BroadcastReceiver {

    /* renamed from: a */
    private final dfy f13021a;

    public dfu(dfy dfy) {
        this.f13021a = dfy;
    }

    public final void onReceive(Context context, Intent intent) {
        try {
            this.f13021a.mo8898f();
        } catch (InvalidConfigException e) {
        }
    }
}
