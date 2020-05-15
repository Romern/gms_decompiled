package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: bjnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjnt extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bjnu f123032a;

    public bjnt(bjnu bjnu) {
        this.f123032a = bjnu;
    }

    public final void onReceive(Context context, Intent intent) {
        context.unregisterReceiver(this);
        int resultCode = getResultCode();
        bjnu bjnu = this.f123032a;
        bjnu.f123033m = false;
        if (resultCode != -1) {
            bjnu.mo65256s();
        } else {
            bjnu.mo65255r();
        }
    }
}
