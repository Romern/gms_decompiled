package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.CreateWalletObjectsEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;

/* renamed from: awqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqf extends awqu {

    /* renamed from: a */
    private bphk f94847a;

    /* renamed from: b */
    private String f94848b;

    public awqf() {
        this.f94847a = bphk.f137655g;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof CreateWalletObjectsEvent) {
            CreateWalletObjectsEvent createWalletObjectsEvent = (CreateWalletObjectsEvent) walletAnalyticsEvent;
            mo52467a(createWalletObjectsEvent.f109922c, context);
            this.f94847a = createWalletObjectsEvent.f109923d;
            this.f94848b = createWalletObjectsEvent.f109918a;
            return;
        }
        String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
        Log.e("SaveWalletObjectsSssnSt", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
    }

    /* renamed from: b */
    public final String mo52463b() {
        return this.f94848b;
    }

    public awqf(bjvz bjvz) {
        super(bjvz);
        this.f94847a = (bphk) bjvz.mo65576a((bxxk) bphk.f137655g.mo74142c(7), bphk.f137655g);
        this.f94848b = bjvz.mo65579b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94847a);
        bjwa.mo65582a(this.f94848b);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bphk bphk = this.f94847a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bphk.getClass();
        bpik.f137773o = bphk;
        bpik.f137759a |= 8192;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bphz.m111946a(this.f94847a.f137658b);
        return (a == 0 || a == 1) ? false : true;
    }
}
