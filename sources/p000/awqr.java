package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.OwInitializedEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import com.google.android.gms.wallet.shared.ApplicationParameters;

/* renamed from: awqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqr extends awqu {

    /* renamed from: a */
    public bpjk f94871a;

    public awqr() {
        this.f94871a = bpjk.f137872f;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        Bundle bundle;
        if (walletAnalyticsEvent instanceof OwInitializedEvent) {
            OwInitializedEvent owInitializedEvent = (OwInitializedEvent) walletAnalyticsEvent;
            mo52467a(owInitializedEvent.f109985c, context);
            ApplicationParameters applicationParameters = owInitializedEvent.f109985c.f110418b;
            bpjk bpjk = this.f94871a;
            bxvd bxvd = (bxvd) bpjk.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bpjk);
            if (!(applicationParameters == null || (bundle = applicationParameters.f110408c) == null)) {
                int a = bpkb.m112002a(bundle.getInt("com.google.android.gms.wallet.fragment.WALLET_FRAGMENT_MODE"));
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpjk bpjk2 = (bpjk) bxvd.f164949b;
                int i = a - 1;
                bpjk bpjk3 = bpjk.f137872f;
                if (a != 0) {
                    bpjk2.f137878e = i;
                    int i2 = bpjk2.f137874a | 8;
                    bpjk2.f137874a = i2;
                    if ((i2 & 8) == 0) {
                        bpjk2.f137878e = 0;
                        bpjk2.f137874a = i2 | 8;
                    }
                } else {
                    throw null;
                }
            }
            int a2 = bpjj.m111984a(owInitializedEvent.f109986d);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpjk bpjk4 = (bpjk) bxvd.f164949b;
            int i3 = a2 - 1;
            bpjk bpjk5 = bpjk.f137872f;
            if (a2 != 0) {
                bpjk4.f137875b = i3;
                bpjk4.f137874a |= 1;
                int a3 = bphz.m111946a(owInitializedEvent.f109987e);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpjk bpjk6 = (bpjk) bxvd.f164949b;
                int i4 = a3 - 1;
                if (a3 != 0) {
                    bpjk6.f137876c = i4;
                    int i5 = bpjk6.f137874a | 2;
                    bpjk6.f137874a = i5;
                    int i6 = owInitializedEvent.f109988f;
                    bpjk6.f137874a = i5 | 4;
                    bpjk6.f137877d = i6;
                    this.f94871a = (bpjk) bxvd.mo74062i();
                    this.f94877l = owInitializedEvent.f109919b;
                    return;
                }
                throw null;
            }
            throw null;
        }
        String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
        Log.e("OwInitializedSessionState", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
    }

    public awqr(bjvz bjvz) {
        super(bjvz);
        this.f94871a = (bpjk) bjvz.mo65576a((bxxk) bpjk.f137872f.mo74142c(7), bpjk.f137872f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94871a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bpjk bpjk = this.f94871a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bpjk.getClass();
        bpik.f137762d = bpjk;
        bpik.f137759a |= 4;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bphz.m111946a(this.f94871a.f137876c);
        return (a == 0 || a == 1) ? false : true;
    }
}
