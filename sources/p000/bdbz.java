package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: bdbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdbz extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bdce f105308a;

    public bdbz(bdce bdce) {
        this.f105308a = bdce;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            bdce bdce = this.f105308a;
            String str = bdce.f105314a;
            bdce.mo57867a();
        }
    }
}
