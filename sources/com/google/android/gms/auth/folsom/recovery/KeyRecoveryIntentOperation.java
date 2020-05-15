package com.google.android.gms.auth.folsom.recovery;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyRecoveryIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final sek f10913a = jdh.m16547a("KeyRecoveryIntentOperation");

    /* renamed from: b */
    private final bqgj f10914b = snp.m35704b(10);

    public KeyRecoveryIntentOperation() {
    }

    /* renamed from: a */
    public final void mo7709a(PendingIntent pendingIntent, int i) {
        mo7710a(pendingIntent, i, (bxun) null);
    }

    public final void onHandleIntent(Intent intent) {
        if (!jde.f22215a) {
            f10913a.mo25414c("Build is lower than P. No need to handle [%s]", intent.getAction());
        } else if (!ccfv.m129485b()) {
            f10913a.mo25416d("auth_folsom_is_folsom_enabled is not enabled.", new Object[0]);
        } else {
            String action = intent.getAction();
            f10913a.mo25409a("onHandleIntent. action: %s", action);
            if ("com.google.android.gms.auth.folsom.START_RECOVERY".equals(action)) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    f10913a.mo25418e("Intent has null extras.", new Object[0]);
                    return;
                }
                PendingIntent pendingIntent = (PendingIntent) extras.getParcelable("com.google.android.gms.auth.folsom.EXTRA_PENDING_INTENT");
                if (pendingIntent == null) {
                    f10913a.mo25418e("Stop recovery since the received intent does not contain a PendingIntent.", new Object[0]);
                } else {
                    this.f10914b.execute(new jbj(this, extras, pendingIntent));
                }
            }
        }
    }

    protected KeyRecoveryIntentOperation(Context context) {
        attachBaseContext(context);
    }

    /* renamed from: a */
    public final void mo7710a(PendingIntent pendingIntent, int i, bxun bxun) {
        jdg.m16542a(this, i);
        Intent intent = new Intent();
        if (bxun != null && (i == 3 || i == 7)) {
            intent.putExtra("android.security.action.EXTRA_COOL_OFF_PERIOD_SECONDS", bxun.f164863a);
        }
        int i2 = i - 1;
        if (i != 0) {
            intent.putExtra("com.google.android.gms.auth.folsom.EXTRA_RECOVERY_RESULT", i2);
            try {
                pendingIntent.send(this, -1, intent);
            } catch (PendingIntent.CanceledException e) {
                f10913a.mo25417e("Canceled sending PendingIntent.", e, new Object[0]);
                jdg.m16542a(this, 18);
            }
        } else {
            throw null;
        }
    }
}
