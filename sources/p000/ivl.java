package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.easyunlock.userpresence.UserPresenceUpdateIntentOperation;

/* renamed from: ivl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivl extends aseo {

    /* renamed from: b */
    private static final sek f21869b = new sek(new String[]{"DeviceStateChangeReceiver"}, (char[]) null);

    /* renamed from: a */
    public final Context f21870a;

    public ivl(Context context) {
        this.f21870a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        int i = 1;
        f21869b.mo25412b("Received intent: %s.", intent);
        String action = intent.getAction();
        if (!"android.intent.action.SCREEN_ON".equals(action)) {
            if (!"android.intent.action.SCREEN_OFF".equals(action)) {
                i = "android.intent.action.USER_PRESENT".equals(action) ? 3 : 0;
            } else {
                i = 2;
            }
        }
        if (i != 0) {
            aseo.m73885c(context, UserPresenceUpdateIntentOperation.m6562a(context, i));
        }
    }
}
