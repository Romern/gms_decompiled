package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Set;

/* renamed from: dzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dzn extends dyg {

    /* renamed from: b */
    public static final dxr f14483b = new dxr(new dzm(), "NetworkStateProducer", new int[]{27}, null);

    /* renamed from: k */
    private static final Set f14484k = bnic.m109489a("android.net.conn.CONNECTIVITY_CHANGE");

    /* renamed from: l */
    private bxmb f14485l;

    public dzn(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14483b, str, dqb);
        mo9851a(27);
    }

    /* renamed from: a */
    private final void m9896a(bxmb bxmb, long j) {
        this.f14485l = bxmb;
        tip tip = new tip(7, 27, 1);
        tip.mo26574a(tka.m37119b(j));
        tip.mo26572a(bxmb.f163920e, this.f14485l);
        mo9857d(tip.mo26570a());
    }

    /* renamed from: j */
    private final bxmb m9897j() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f14388d.getSystemService("connectivity");
        bxvd da = bxmb.f163919d.mo74144da();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) {
            bxly bxly = bxly.DISCONNECTED;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxmb bxmb = (bxmb) da.f164949b;
            bxmb.f163923b = bxly.f163912e;
            bxmb.f163922a |= 1;
        } else if (activeNetworkInfo.getType() == 0) {
            bxly bxly2 = bxly.ON_CELLULAR;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxmb bxmb2 = (bxmb) da.f164949b;
            bxmb2.f163923b = bxly2.f163912e;
            bxmb2.f163922a |= 1;
            bxma bxma = !connectivityManager.isActiveNetworkMetered() ? bxma.UNMETERED : bxma.METERED;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxmb bxmb3 = (bxmb) da.f164949b;
            bxmb3.f163924c = bxma.f163918d;
            bxmb3.f163922a |= 2;
        } else if (activeNetworkInfo.getType() == 1) {
            bxly bxly3 = bxly.ON_WIFI;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxmb bxmb4 = (bxmb) da.f164949b;
            bxmb4.f163923b = bxly3.f163912e;
            bxmb4.f163922a |= 1;
            bxma bxma2 = !connectivityManager.isActiveNetworkMetered() ? bxma.UNMETERED : bxma.METERED;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxmb bxmb5 = (bxmb) da.f164949b;
            bxmb5.f163924c = bxma2.f163918d;
            bxmb5.f163922a |= 2;
        } else {
            bxly bxly4 = bxly.DISCONNECTED;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxmb bxmb6 = (bxmb) da.f164949b;
            bxmb6.f163923b = bxly4.f163912e;
            bxmb6.f163922a |= 1;
        }
        return (bxmb) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
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
        m9896a(m9897j(), dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9846a(long j) {
        super.mo9846a(j);
        this.f14485l = null;
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        if (f14484k.contains(intent.getAction())) {
            bxmb j = m9897j();
            if (!mo9861g()) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dzn", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[NetworkStateProducer] No ongoing data. Inserting new context.");
                m9896a(j, dwq.m9665i().mo20505a());
                return;
            }
            bxmb bxmb = this.f14485l;
            bxly a = bxly.m122852a(j.f163923b);
            if (a == null) {
                a = bxly.UNKNOWN_STATE;
            }
            bxly a2 = bxly.m122852a(bxmb.f163923b);
            if (a2 == null) {
                a2 = bxly.UNKNOWN_STATE;
            }
            if (a == a2) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("dzn", "a", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("[NetworkStateProducer] No state change for network connection context");
                return;
            }
            long a3 = dwq.m9665i().mo20505a();
            mo9846a(a3);
            m9896a(j, a3 + 1);
        }
    }
}
