package p000;

import android.app.PendingIntent;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;

/* renamed from: bjnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjnu extends bjhu {

    /* renamed from: m */
    boolean f123033m;

    /* renamed from: p */
    private bwsq f123034p;

    public bjnu(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: G */
    private final void m104101G() {
        String str;
        if (this.f123033m) {
            return;
        }
        if (!bjzc.m104960a(this.f122639a.f122692a.f122732i, "android.permission.SEND_SMS")) {
            this.f123033m = true;
            mo65128n().mo65084a(10086, bjfu.m103321a(this.f122639a.f122692a.f122724a, "android.permission.SEND_SMS"));
        } else if (!this.f123033m) {
            bwwb bwwb = this.f123034p.f160907a;
            if (bwwb == null) {
                bwwb = bwwb.f161205e;
            }
            String str2 = this.f123034p.f160908b;
            bmxy.m108589a(!bwwb.f161209c.isEmpty(), "SMS destination address must be provided");
            ContextWrapper contextWrapper = this.f122639a.f122692a.f122732i;
            Intent intent = new Intent("com.google.android.wallet.bender3.SMS_SENDER_ACTION");
            int i = Build.VERSION.SDK_INT;
            PendingIntent broadcast = PendingIntent.getBroadcast(contextWrapper, 0, intent, 67108864);
            contextWrapper.registerReceiver(new bjnt(this), new IntentFilter("com.google.android.wallet.bender3.SMS_SENDER_ACTION"));
            if (!bwwb.f161208b.isEmpty()) {
                String valueOf = String.valueOf(bwwb.f161208b);
                String valueOf2 = String.valueOf(bwwb.f161209c);
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            } else {
                str = bwwb.f161209c;
            }
            SmsManager.getDefault().sendTextMessage(str, null, str2, broadcast, null);
            this.f123033m = true;
        }
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        this.f123033m = false;
        if (i == 10086) {
            int a = bjfu.m103320a(bjfd);
            if (a == -1) {
                Integer num = (Integer) bjfu.m103322b(bjfd).get("android.permission.SEND_SMS");
                if (num == null || num.intValue() != 0) {
                    mo65256s();
                } else if (((bjhu) this).f122751l == 3) {
                    m104101G();
                }
            } else if (a != 0) {
                mo65256s();
            } else {
                mo65254q();
            }
        } else {
            super.mo52014a(i, bjfd);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        m104101G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo65259v() {
        this.f123033m = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo65260w() {
        this.f123033m = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo65261x() {
        this.f123033m = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("isWaitingForResponse", this.f123033m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        this.f123033m = false;
        if (bundle != null) {
            this.f123033m = bundle.getBoolean("isWaitingForResponse");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwsq.f160905d;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123034p = (bwsq) b;
    }
}
