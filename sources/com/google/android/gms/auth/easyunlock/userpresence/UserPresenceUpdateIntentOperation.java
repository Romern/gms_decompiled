package com.google.android.gms.auth.easyunlock.userpresence;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserPresenceUpdateIntentOperation extends IntentOperation {

    /* renamed from: b */
    private static final sek f10572b = new sek(new String[]{"UserPresenceUpdateIntentOperation"}, (char[]) null);

    /* renamed from: a */
    private ivu f10573a;

    public UserPresenceUpdateIntentOperation() {
    }

    /* renamed from: a */
    public static Intent m6562a(Context context, int i) {
        Intent startIntent = IntentOperation.getStartIntent(context, UserPresenceUpdateIntentOperation.class, "com.google.android.gms.auth.easyunlock.userpresence.USER_PRESENCE_UPDATED");
        startIntent.putExtra("detection_type", i);
        return startIntent;
    }

    public final void onCreate() {
        this.f10573a = ivu.m16228a(this);
    }

    public final void onHandleIntent(Intent intent) {
        boolean z = false;
        f10572b.mo25412b("Received onHandleIntent() with intent: %s.", intent);
        try {
            if (ccfm.m129455c()) {
                ivu ivu = this.f10573a;
                int intExtra = intent.getIntExtra("detection_type", 0);
                synchronized (ivu.f21892d) {
                    new Object[1][0] = Integer.valueOf(intExtra);
                    if (intExtra == 3) {
                        z = true;
                    }
                    ivu.mo13377a(z);
                    if (intExtra != 1) {
                        if (intExtra != 2) {
                            if (intExtra == 3) {
                                ivu.f21891c.mo13375a();
                            } else if (intExtra != 4) {
                                String str = ivu.f21888a;
                                StringBuilder sb = new StringBuilder(38);
                                sb.append("Unexpected detection type: ");
                                sb.append(intExtra);
                                Log.e(str, sb.toString());
                            } else if (ivu.f21895g != 2) {
                                ivu.f21891c.mo13376b();
                            }
                        } else if (ivu.f21895g == 2) {
                            ivu.f21891c.mo13375a();
                        }
                    } else if (ivu.f21895g == 2) {
                        ivu.f21891c.mo13375a();
                    }
                }
            } else {
                f10572b.mo25418e("Proximity feature is not available on current device.", new Object[0]);
            }
            aseo.m73884b(this, intent);
        } catch (Throwable th) {
            aseo.m73884b(this, intent);
            throw th;
        }
    }

    UserPresenceUpdateIntentOperation(ivu ivu, iul iul) {
        sdo.m34959a(ivu);
        this.f10573a = ivu;
        sdo.m34959a(iul);
    }
}
