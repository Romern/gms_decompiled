package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.LoadWebPaymentDataCallEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import java.util.Locale;

/* renamed from: awqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqm extends awqu {

    /* renamed from: a */
    String f94857a;

    /* renamed from: b */
    private bpih f94858b;

    public awqm() {
        this.f94858b = bpih.f137746i;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof LoadWebPaymentDataCallEvent) {
            LoadWebPaymentDataCallEvent loadWebPaymentDataCallEvent = (LoadWebPaymentDataCallEvent) walletAnalyticsEvent;
            mo52467a(loadWebPaymentDataCallEvent.f109946c, context);
            this.f94858b = loadWebPaymentDataCallEvent.f109947d;
            this.f94857a = loadWebPaymentDataCallEvent.f109918a;
            return;
        }
        Log.e("webPayDataCallSessState", String.format(Locale.US, "Unable to fill data for event %s", walletAnalyticsEvent.getClass().getName()));
    }

    /* renamed from: b */
    public final String mo52463b() {
        return this.f94857a;
    }

    public awqm(bjvz bjvz) {
        super(bjvz);
        this.f94858b = (bpih) bjvz.mo65576a((bxxk) bpih.f137746i.mo74142c(7), bpih.f137746i);
        this.f94857a = bjvz.mo65579b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94858b);
        bjwa.mo65582a(this.f94857a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bpih bpih = this.f94858b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bpih.getClass();
        bpik.f137771m = bpih;
        bpik.f137759a |= 2048;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bphz.m111946a(this.f94858b.f137749b);
        return (a == 0 || a == 1) ? false : true;
    }
}
