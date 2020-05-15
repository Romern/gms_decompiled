package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.OwWalletFragmentButtonClickedEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import com.google.android.gms.wallet.shared.ApplicationParameters;

/* renamed from: awqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqp extends awqu {

    /* renamed from: a */
    public bpjo f94868a;

    public awqp() {
        this.f94868a = bpjo.f137894d;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        Bundle bundle;
        if (!(walletAnalyticsEvent instanceof OwWalletFragmentButtonClickedEvent)) {
            String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
            Log.e("OwButtonClickedSessionState", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
            return;
        }
        bpjo bpjo = this.f94868a;
        bxvd bxvd = (bxvd) bpjo.mo74142c(5);
        bxvd.mo73625a((bxvk) bpjo);
        OwWalletFragmentButtonClickedEvent owWalletFragmentButtonClickedEvent = (OwWalletFragmentButtonClickedEvent) walletAnalyticsEvent;
        mo52467a(owWalletFragmentButtonClickedEvent.f110000c, context);
        ApplicationParameters applicationParameters = owWalletFragmentButtonClickedEvent.f110000c.f110418b;
        if (!(applicationParameters == null || (bundle = applicationParameters.f110408c) == null)) {
            int a = bpkb.m112002a(bundle.getInt("com.google.android.gms.wallet.fragment.WALLET_FRAGMENT_MODE"));
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpjo bpjo2 = (bpjo) bxvd.f164949b;
            int i = a - 1;
            bpjo bpjo3 = bpjo.f137894d;
            if (a != 0) {
                bpjo2.f137898c = i;
                int i2 = bpjo2.f137896a | 2;
                bpjo2.f137896a = i2;
                if ((this.f94868a.f137896a & 2) == 0) {
                    bpjo2.f137898c = 0;
                    bpjo2.f137896a = i2 | 2;
                }
            } else {
                throw null;
            }
        }
        int a2 = bpjn.m111988a(owWalletFragmentButtonClickedEvent.f110001d);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpjo bpjo4 = (bpjo) bxvd.f164949b;
        int i3 = a2 - 1;
        bpjo bpjo5 = bpjo.f137894d;
        if (a2 != 0) {
            bpjo4.f137897b = i3;
            bpjo4.f137896a |= 1;
            this.f94868a = (bpjo) bxvd.mo74062i();
            return;
        }
        throw null;
    }

    public awqp(bjvz bjvz) {
        super(bjvz);
        this.f94868a = (bpjo) bjvz.mo65576a((bxxk) bpjo.f137894d.mo74142c(7), bpjo.f137894d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94868a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bpjo bpjo = this.f94868a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bpjo.getClass();
        bpik.f137763e = bpjo;
        bpik.f137759a |= 8;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bpjn.m111988a(this.f94868a.f137897b);
        return (a == 0 || a == 1) ? false : true;
    }
}
