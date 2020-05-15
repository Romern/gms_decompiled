package p000;

import android.app.PendingIntent;
import android.os.Build;
import android.telephony.SmsManager;

/* renamed from: augn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class augn extends augl {

    /* renamed from: d */
    public static final /* synthetic */ int f91778d = 0;

    public augn(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    public final String mo50499a() {
        return "AmlV1TextSmsReporter";
    }

    /* renamed from: b */
    public final aufk mo50500b() {
        bxvd da = aufk.f91684h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aufk aufk = (aufk) da.f164949b;
        aufk.f91687b = 4;
        int i = aufk.f91686a | 1;
        aufk.f91686a = i;
        String str = this.f91772b;
        str.getClass();
        int i2 = 4 | i;
        aufk.f91686a = i2;
        aufk.f91689d = str;
        String str2 = this.f91773c;
        if (str2 != null) {
            str2.getClass();
            aufk.f91686a = i2 | 16;
            aufk.f91691f = str2;
        }
        return (aufk) da.mo74062i();
    }

    /* renamed from: c */
    public final int mo50501c() {
        return 4;
    }

    /* renamed from: a */
    public final void mo50512a(int i, String str, String str2, String str3, PendingIntent pendingIntent) {
        SmsManager smsManager;
        int i2 = Build.VERSION.SDK_INT;
        if (i == Integer.MAX_VALUE) {
            smsManager = SmsManager.getDefault();
        } else {
            smsManager = SmsManager.getSmsManagerForSubscriptionId(i);
        }
        smsManager.sendTextMessage(str, str2, str3, pendingIntent, null);
    }
}
