package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: ead */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ead extends dyg {

    /* renamed from: b */
    public static final dxr f14535b = new dxr(new eac(), "ScreenProducer", new int[]{7}, null);

    /* renamed from: k */
    private bxmz f14536k;

    public ead(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14535b, str, dqb);
    }

    /* renamed from: a */
    private final void m9958a(boolean z, long j) {
        int i;
        bxvd da = bxmz.f163999c.mo74144da();
        if (!z) {
            i = 2;
        } else {
            i = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxmz bxmz = (bxmz) da.f164949b;
        bxmz.f164003b = i - 1;
        bxmz.f164002a |= 1;
        this.f14536k = (bxmz) da.mo74062i();
        tip tip = new tip(7, 7, 1);
        tip.mo26574a(tka.m37119b(j));
        tip.mo26572a(bxmz.f164000d, this.f14536k);
        mo9857d(tip.mo26570a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        mo9846a(dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        int i = Build.VERSION.SDK_INT;
        m9958a(((PowerManager) this.f14388d.getSystemService("power")).isInteractive(), dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9846a(long j) {
        super.mo9846a(j);
        this.f14536k = null;
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        boolean z;
        int a;
        String action = intent.getAction();
        if (action.equals("android.intent.action.SCREEN_ON")) {
            z = true;
        } else if (action.equals("android.intent.action.SCREEN_OFF")) {
            z = false;
        } else {
            return;
        }
        if (!mo9861g()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("ead", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[ScreenProducer] No ongoing data (isScreenOn=%s)", Boolean.valueOf(z));
            m9958a(z, dwq.m9665i().mo20505a());
            return;
        }
        int a2 = bxmy.m122885a(this.f14536k.f164003b);
        if ((a2 != 0 && a2 == 3 && z) || ((a = bxmy.m122885a(this.f14536k.f164003b)) != 0 && a == 2 && !z)) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
            bnsl2.mo68432a("ead", "a", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("[ScreenProducer] Got same value as before for screen (isScreenOn=%s)", Boolean.valueOf(z));
            return;
        }
        long a3 = dwq.m9665i().mo20505a();
        mo9846a(a3);
        m9958a(z, a3 + 1);
    }
}
