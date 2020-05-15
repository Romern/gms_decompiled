package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import com.google.android.cast.JGCastService;
import com.google.android.gms.constellation.verifier.SilentSmsReceiver$SilentSmsPendingIntentReceiver;

/* renamed from: ter */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ter implements tes {

    /* renamed from: a */
    public static final Logger f45794a = tea.m36798a("silent_sms_receiver");

    /* renamed from: b */
    public SmsMessage f45795b = null;

    /* renamed from: c */
    public tem f45796c = null;

    /* renamed from: d */
    private final SilentSmsReceiver$SilentSmsPendingIntentReceiver f45797d = new SilentSmsReceiver$SilentSmsPendingIntentReceiver(this);

    /* renamed from: e */
    private final Context f45798e;

    /* renamed from: f */
    private String f45799f = "";

    public ter(int i) {
        f45794a.logVerbose("start", new Object[0]);
        this.f45798e = rpr.m34216b();
        m36861a(i);
    }

    /* renamed from: a */
    private final void m36861a(int i) {
        this.f45798e.registerReceiver(this.f45797d, new IntentFilter("com.google.android.gms.constellation.SILENT_SMS_RECEIVED"));
        try {
            this.f45799f = (String) bmxu.m108565a(SmsManager.getSmsManagerForSubscriptionId(i).createAppSpecificSmsToken(PendingIntent.getBroadcast(this.f45798e, 0, new Intent("com.google.android.gms.constellation.SILENT_SMS_RECEIVED"), JGCastService.FLAG_PRIVATE_DISPLAY)), "");
        } catch (UnsupportedOperationException e) {
            f45794a.mo25416d("SMS is not supported. Using blank token, verification will fail.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final String mo26445a() {
        return this.f45799f;
    }

    /* renamed from: b */
    public final void mo26448b() {
        f45794a.logVerbose("stop", new Object[0]);
        Context context = this.f45798e;
        if (context != null) {
            context.unregisterReceiver(this.f45797d);
        }
        this.f45799f = "";
        this.f45796c = null;
        this.f45795b = null;
    }

    /* renamed from: b */
    public final void mo26449b(tem tem) {
        if (this.f45796c == tem) {
            this.f45796c = null;
        }
    }

    /* renamed from: c */
    public final void mo26450c(tem tem) {
        String messageBody = this.f45795b.getMessageBody();
        String a = tem.mo26442a();
        if (tem == null || !messageBody.contains(a)) {
            f45794a.mo25414c("signature did not match. [msg:%s], [signature:%s]", messageBody, a);
            return;
        }
        f45794a.mo25414c("Found matching signature", new Object[0]);
        tem.mo26443a(this.f45795b);
    }

    /* renamed from: a */
    public final void mo26447a(tem tem) {
        if (this.f45795b != null) {
            mo26450c(tem);
        }
        this.f45796c = tem;
    }
}
