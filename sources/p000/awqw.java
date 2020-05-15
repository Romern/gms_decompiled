package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.SimpleAnalyticsEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;

/* renamed from: awqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqw extends awqu {

    /* renamed from: a */
    String f94878a;

    /* renamed from: b */
    private bpik f94879b;

    public awqw() {
        this.f94879b = null;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof SimpleAnalyticsEvent) {
            SimpleAnalyticsEvent simpleAnalyticsEvent = (SimpleAnalyticsEvent) walletAnalyticsEvent;
            mo52467a(simpleAnalyticsEvent.f110009c, context);
            this.f94879b = simpleAnalyticsEvent.f110010d;
            this.f94878a = simpleAnalyticsEvent.f109918a;
            return;
        }
        String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
        Log.e("SimpleEventSessState", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        return this.f94879b != null;
    }

    /* renamed from: b */
    public final String mo52463b() {
        return this.f94878a;
    }

    public awqw(bjvz bjvz) {
        super(bjvz);
        this.f94879b = (bpik) bjvz.mo65576a((bxxk) bpik.f137757s.mo74142c(7), (bxxc) null);
        this.f94878a = bjvz.mo65579b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94879b);
        bjwa.mo65582a(this.f94878a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        try {
            bxvd.mo73635b(this.f94879b.serializeToBytes(), bxus.m123744c());
        } catch (bxwf e) {
            throw new RuntimeException("Error parsing log event!");
        }
    }
}
