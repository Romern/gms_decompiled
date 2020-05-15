package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;

/* renamed from: awqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqi extends awqu {

    /* renamed from: a */
    public bpht f94851a;

    public awqi() {
        this.f94851a = bpht.f137702h;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof awqh) {
            bpht bpht = this.f94851a;
            bxvd bxvd = (bxvd) bpht.mo74142c(5);
            bxvd.mo73625a((bxvk) bpht);
            ((awqh) walletAnalyticsEvent).mo52464a(context, this, bxvd);
            this.f94851a = (bpht) bxvd.mo74062i();
            return;
        }
        String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
        Log.e("DocumentUploadSessionSt", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
    }

    public awqi(bjvz bjvz) {
        super(bjvz);
        this.f94851a = (bpht) bjvz.mo65576a((bxxk) bpht.f137702h.mo74142c(7), bpht.f137702h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94851a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bpht bpht = this.f94851a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bpht.getClass();
        bpik.f137769k = bpht;
        bpik.f137759a |= 512;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bphz.m111946a(this.f94851a.f137710g);
        if (a == 0 || a == 1) {
            int a2 = bphz.m111946a(this.f94851a.f137708e);
            if (a2 == 0 || a2 == 1) {
                return false;
            }
            int a3 = bphz.m111946a(this.f94851a.f137708e);
            if (a3 == 0 || a3 != 2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
