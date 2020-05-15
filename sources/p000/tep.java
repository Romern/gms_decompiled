package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.SmsMessage;
import com.google.android.gms.constellation.verifier.NoisySmsReceiver$NoisyBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tep implements tes {

    /* renamed from: a */
    public static final Logger f45783a = tea.m36798a("noisy_sms_receiver");

    /* renamed from: b */
    public final List f45784b = new ArrayList();

    /* renamed from: c */
    public final int f45785c;

    /* renamed from: d */
    public tem f45786d;

    /* renamed from: e */
    private Context f45787e;

    /* renamed from: f */
    private final NoisySmsReceiver$NoisyBroadcastReceiver f45788f;

    public tep(Context context) {
        int i = Build.VERSION.SDK_INT;
        this.f45785c = -1;
        this.f45787e = context;
        this.f45788f = new NoisySmsReceiver$NoisyBroadcastReceiver(this);
        f45783a.logVerbose("start", new Object[0]);
        this.f45787e.registerReceiver(this.f45788f, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
    }

    /* renamed from: a */
    public final String mo26445a() {
        return "";
    }

    /* renamed from: b */
    public final void mo26448b() {
        f45783a.logVerbose("stop", new Object[0]);
        NoisySmsReceiver$NoisyBroadcastReceiver noisySmsReceiver$NoisyBroadcastReceiver = this.f45788f;
        if (noisySmsReceiver$NoisyBroadcastReceiver != null) {
            this.f45787e.unregisterReceiver(noisySmsReceiver$NoisyBroadcastReceiver);
        }
        this.f45787e = null;
        this.f45784b.clear();
        this.f45786d = null;
    }

    /* renamed from: b */
    public final void mo26449b(tem tem) {
        if (this.f45786d == tem) {
            this.f45786d = null;
        }
    }

    /* renamed from: a */
    public final void mo26446a(SmsMessage smsMessage, tem tem) {
        String messageBody = smsMessage.getMessageBody();
        String a = tem.mo26442a();
        if (messageBody.contains(a)) {
            f45783a.mo25414c("Found matching signature", new Object[0]);
            tem.mo26443a(smsMessage);
            return;
        }
        f45783a.mo25414c("signature did not match. [msg:%s], [signature:%s]", messageBody, a);
    }

    public tep(Context context, int i) {
        this.f45785c = i;
        this.f45787e = context;
        this.f45788f = new NoisySmsReceiver$NoisyBroadcastReceiver(this);
        f45783a.logVerbose("start", new Object[0]);
        this.f45787e.registerReceiver(this.f45788f, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
    }

    /* renamed from: a */
    public final void mo26447a(tem tem) {
        List list = this.f45784b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo26446a((SmsMessage) list.get(i), tem);
        }
        this.f45786d = tem;
    }
}
