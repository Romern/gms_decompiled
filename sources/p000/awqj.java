package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.GetClientTokenEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;

/* renamed from: awqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqj extends awqu {

    /* renamed from: a */
    private bpic f94852a;

    public awqj() {
        this.f94852a = bpic.f137715f;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof GetClientTokenEvent) {
            GetClientTokenEvent getClientTokenEvent = (GetClientTokenEvent) walletAnalyticsEvent;
            mo52467a(getClientTokenEvent.f109940c, context);
            this.f94852a = getClientTokenEvent.f109941d;
            return;
        }
        String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
        Log.e("GetClientTknSessionStat", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
    }

    public awqj(bjvz bjvz) {
        super(bjvz);
        this.f94852a = (bpic) bjvz.mo65576a((bxxk) bpic.f137715f.mo74142c(7), bpic.f137715f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94852a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bpic bpic = this.f94852a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bpic.getClass();
        bpik.f137770l = bpic;
        bpik.f137759a |= 1024;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bpib.m111948a(this.f94852a.f137718b);
        return (a == 0 || a == 1) ? false : true;
    }
}
