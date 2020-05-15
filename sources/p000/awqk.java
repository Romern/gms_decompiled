package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.analytics.events.IsReadyToPayCallEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;

/* renamed from: awqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqk extends awqu {

    /* renamed from: a */
    String f94853a;

    /* renamed from: b */
    private bpif f94854b;

    public awqk() {
        this.f94854b = bpif.f137729h;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof IsReadyToPayCallEvent) {
            IsReadyToPayCallEvent isReadyToPayCallEvent = (IsReadyToPayCallEvent) walletAnalyticsEvent;
            mo52467a(isReadyToPayCallEvent.f109942c, context);
            this.f94854b = isReadyToPayCallEvent.f109943d;
            this.f94853a = isReadyToPayCallEvent.f109918a;
            return;
        }
        String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
        Log.e("IsRdyToPayCallSessState", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
    }

    /* renamed from: b */
    public final String mo52463b() {
        return this.f94853a;
    }

    public awqk(bjvz bjvz) {
        super(bjvz);
        this.f94854b = (bpif) bjvz.mo65576a((bxxk) bpif.f137729h.mo74142c(7), bpif.f137729h);
        this.f94853a = bjvz.mo65579b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94854b);
        bjwa.mo65582a(this.f94853a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bpif bpif = this.f94854b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bpif.getClass();
        bpik.f137768j = bpif;
        bpik.f137759a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bphz.m111946a(this.f94854b.f137732b);
        return (a == 0 || a == 1) ? false : true;
    }
}
