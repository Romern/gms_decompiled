package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: rnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rnp extends BroadcastReceiver {

    /* renamed from: a */
    public Context f43410a;

    /* renamed from: b */
    private final rno f43411b;

    public rnp(rno rno) {
        this.f43411b = rno;
    }

    /* renamed from: a */
    public final synchronized void mo24952a() {
        Context context = this.f43410a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f43410a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f43411b.mo24857a();
            mo24952a();
        }
    }
}
