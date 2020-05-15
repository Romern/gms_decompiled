package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.LoadPaymentDataCallEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import java.util.Locale;

/* renamed from: awql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awql extends awqu {

    /* renamed from: a */
    String f94855a;

    /* renamed from: b */
    private bpig f94856b;

    public awql() {
        this.f94856b = bpig.f137738g;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof LoadPaymentDataCallEvent) {
            LoadPaymentDataCallEvent loadPaymentDataCallEvent = (LoadPaymentDataCallEvent) walletAnalyticsEvent;
            mo52467a(loadPaymentDataCallEvent.f109944c, context);
            this.f94856b = loadPaymentDataCallEvent.f109945d;
            this.f94855a = loadPaymentDataCallEvent.f109918a;
            return;
        }
        Log.e("PayDataCallSessState", String.format(Locale.US, "Unable to fill data for event %s", walletAnalyticsEvent.getClass().getName()));
    }

    /* renamed from: b */
    public final String mo52463b() {
        return this.f94855a;
    }

    public awql(bjvz bjvz) {
        super(bjvz);
        this.f94856b = (bpig) bjvz.mo65576a((bxxk) bpig.f137738g.mo74142c(7), bpig.f137738g);
        this.f94855a = bjvz.mo65579b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94856b);
        bjwa.mo65582a(this.f94855a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bpig bpig = this.f94856b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bpig.getClass();
        bpik.f137772n = bpig;
        bpik.f137759a |= 4096;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bphz.m111946a(this.f94856b.f137741b);
        return (a == 0 || a == 1) ? false : true;
    }
}
