package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* renamed from: dzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dzp extends dyg {

    /* renamed from: b */
    public static final dxr f14486b = new dxr(new dzo(), "PhoneCallProducer", new int[]{37}, null);

    /* renamed from: k */
    private bxme f14487k;

    public dzp(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14486b, str, dqb);
        int callState = ((TelephonyManager) context.getSystemService("phone")).getCallState();
        bxvd da = bxme.f163926c.mo74144da();
        if (callState == 2 || callState == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxme bxme = (bxme) da.f164949b;
            bxme.f163930b = 1;
            bxme.f163929a |= 1;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxme bxme2 = (bxme) da.f164949b;
            bxme2.f163930b = 2;
            bxme2.f163929a |= 1;
        }
        this.f14487k = (bxme) da.mo74062i();
    }

    /* renamed from: b */
    private final void m9904b(long j) {
        tip tip = new tip(7, 37, 1);
        tip.mo26574a(tka.m37119b(j));
        tip.mo26572a(bxme.f163927d, this.f14487k);
        mo9857d(tip.mo26570a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        mo9846a(dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        return new IntentFilter("android.intent.action.PHONE_STATE");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        m9904b(dwq.m9665i().mo20505a());
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE")) {
            int i = 2;
            if (!TextUtils.equals(TelephonyManager.EXTRA_STATE_OFFHOOK, intent.getStringExtra("state")) && !TextUtils.equals(TelephonyManager.EXTRA_STATE_RINGING, intent.getStringExtra("state"))) {
                i = 3;
            }
            int a = bxmd.m122861a(this.f14487k.f163930b);
            if (a == 0) {
                a = 1;
            }
            if (a != i) {
                bxvd da = bxme.f163926c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxme bxme = (bxme) da.f164949b;
                bxme.f163930b = i - 1;
                bxme.f163929a = 1 | bxme.f163929a;
                this.f14487k = (bxme) da.mo74062i();
                long a2 = dwq.m9665i().mo20505a();
                mo9846a(a2);
                m9904b(a2 + 1);
            }
        }
    }
}
