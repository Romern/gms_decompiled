package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: beio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beio extends BroadcastReceiver {

    /* renamed from: a */
    private final Runnable f111593a;

    public beio(Runnable runnable) {
        this.f111593a = runnable;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f111593a.run();
    }
}
