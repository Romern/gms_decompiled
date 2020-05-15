package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Set;

/* renamed from: dzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dzr extends dyg {

    /* renamed from: b */
    public static final dxr f14488b = new dxr(new dzq(), "PhoneLockProducer", new int[]{25}, null);

    /* renamed from: k */
    private static final Set f14489k = sqw.m36038a("android.intent.action.USER_PRESENT", "android.intent.action.SCREEN_OFF");

    /* renamed from: l */
    private bxmh f14490l;

    public dzr(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14488b, str, dqb);
    }

    /* renamed from: a */
    private final void m9910a(boolean z) {
        int a;
        if (!mo9861g()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dzr", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[PhoneLockProducer] No ongoing data (isLocked=%s)", Boolean.valueOf(z));
            m9911a(z, dwq.m9665i().mo20505a());
            return;
        }
        int a2 = bxmg.m122864a(this.f14490l.f163936b);
        if ((a2 != 0 && a2 == 3 && z) || ((a = bxmg.m122864a(this.f14490l.f163936b)) != 0 && a == 2 && !z)) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
            bnsl2.mo68432a("dzr", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("[PhoneLockProducer] Got same value as before for phonelock (isLocked=%s)", Boolean.valueOf(z));
            return;
        }
        long a3 = dwq.m9665i().mo20505a();
        mo9846a(a3);
        m9911a(z, a3 + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        return intentFilter;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo9890j() {
        boolean z;
        PowerManager powerManager = (PowerManager) this.f14388d.getSystemService("power");
        try {
            int i = Build.VERSION.SDK_INT;
            z = powerManager.isInteractive();
        } catch (RuntimeException e) {
            if ("java.lang.RuntimeException".equals(e.getClass().getName())) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("dzr", "j", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[PhoneLockProducer] Cannot get interactive status.");
                z = false;
            } else {
                throw e;
            }
        }
        new Object[1][0] = Boolean.valueOf(z);
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        mo9846a(dwq.m9665i().mo20505a());
    }

    /* renamed from: a */
    private final void m9911a(boolean z, long j) {
        int i;
        bxvd da = bxmh.f163932c.mo74144da();
        if (!z) {
            i = 2;
        } else {
            i = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxmh bxmh = (bxmh) da.f164949b;
        bxmh.f163936b = i - 1;
        bxmh.f163935a |= 1;
        this.f14490l = (bxmh) da.mo74062i();
        tip tip = new tip(7, 25, 1);
        tip.mo26574a(tka.m37119b(j));
        tip.mo26572a(bxmh.f163933d, this.f14490l);
        mo9857d(tip.mo26570a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        m9911a(!mo9890j(), dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9846a(long j) {
        super.mo9846a(j);
        this.f14490l = null;
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        if (f14489k.contains(intent.getAction())) {
            boolean z = !mo9890j();
            if ((intent.getAction().equals("android.intent.action.USER_PRESENT") && z) || (intent.getAction().equals("android.intent.action.SCREEN_OFF") && !z)) {
                m9910a(!z);
            }
            m9910a(z);
        }
    }
}
