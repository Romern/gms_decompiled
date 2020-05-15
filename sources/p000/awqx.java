package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.TapAndPayCallEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;

/* renamed from: awqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqx extends awqu {

    /* renamed from: a */
    bpjw f94880a;

    public awqx() {
        this.f94880a = bpjw.f137917j;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof TapAndPayCallEvent) {
            TapAndPayCallEvent tapAndPayCallEvent = (TapAndPayCallEvent) walletAnalyticsEvent;
            mo52467a(tapAndPayCallEvent.f110013c, context);
            this.f94880a = tapAndPayCallEvent.f110014d;
            return;
        }
        String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
        Log.e("TapAndPayCallSessionState", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
    }

    public awqx(bjvz bjvz) {
        super(bjvz);
        this.f94880a = (bpjw) bjvz.mo65576a((bxxk) bpjw.f137917j.mo74142c(7), bpjw.f137917j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94880a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bpjw bpjw = this.f94880a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bpjw.getClass();
        bpik.f137767i = bpjw;
        bpik.f137759a |= 128;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bpjt.m111994a(this.f94880a.f137920b);
        return (a == 0 || a == 1) ? false : true;
    }
}
