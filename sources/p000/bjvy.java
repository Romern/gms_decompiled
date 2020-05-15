package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.telephony.SmsManager;
import android.text.TextUtils;

/* renamed from: bjvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvy {

    /* renamed from: a */
    public final bjvx f123450a;

    /* renamed from: b */
    private final Context f123451b;

    public bjvy(Context context, bjvx bjvx) {
        this.f123451b = context;
        this.f123450a = bjvx;
    }

    /* renamed from: a */
    public final void mo65573a(int i) {
        if (this.f123450a != null) {
            new adzt(Looper.getMainLooper()).post(new bjvw(this, i));
        }
    }

    /* renamed from: a */
    public final void mo65574a(String str, String str2) {
        PendingIntent pendingIntent;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("SMS destination address must be provided");
        } else if (bjzc.m104960a(this.f123451b, "android.permission.SEND_SMS")) {
            if (this.f123450a != null) {
                PendingIntent broadcast = PendingIntent.getBroadcast(this.f123451b, 0, new Intent("com.google.android.wallet.SMS_SENT_ACTION"), 0);
                this.f123451b.registerReceiver(new bjvv(this), new IntentFilter("com.google.android.wallet.SMS_SENT_ACTION"));
                pendingIntent = broadcast;
            } else {
                pendingIntent = null;
            }
            SmsManager.getDefault().sendTextMessage(str, null, str2, pendingIntent, null);
        } else {
            mo65573a(5);
        }
    }
}
