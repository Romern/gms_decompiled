package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Telephony;

/* renamed from: bjzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjzf extends BroadcastReceiver {

    /* renamed from: a */
    public boolean f123666a = false;

    /* renamed from: b */
    public bjze f123667b;

    /* renamed from: a */
    public final void mo65656a(Context context) {
        if (!this.f123666a) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
            intentFilter.addAction("android.provider.Telephony.SMS_REJECTED");
            context.registerReceiver(this, intentFilter);
            this.f123666a = true;
        }
    }

    /* renamed from: b */
    public final void mo65657b(Context context) {
        if (this.f123666a) {
            context.unregisterReceiver(this);
            this.f123666a = false;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (!"android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() == 0) {
                new String("Received intent with action: ");
            } else {
                "Received intent with action: ".concat(valueOf);
            }
        } else if (this.f123667b != null) {
            int i = Build.VERSION.SDK_INT;
            this.f123667b.mo65405a(Telephony.Sms.Intents.getMessagesFromIntent(intent));
        }
    }
}
