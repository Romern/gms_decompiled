package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.PaySeCallEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: awqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqt extends awqu {

    /* renamed from: a */
    public bpiw f94874a;

    public awqt() {
        this.f94874a = bpiw.f137819e;
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof PaySeCallEvent) {
            PaySeCallEvent paySeCallEvent = (PaySeCallEvent) walletAnalyticsEvent;
            bpiw bpiw = this.f94874a;
            bxvd bxvd = (bxvd) bpiw.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bpiw);
            int a = bpiv.m111970a(paySeCallEvent.f110002c.f137822b);
            if (a == 0) {
                a = 1;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpiw bpiw2 = (bpiw) bxvd.f164949b;
            bpiw bpiw3 = bpiw.f137819e;
            bpiw2.f137822b = a - 1;
            int i = bpiw2.f137821a | 1;
            bpiw2.f137821a = i;
            bpiw bpiw4 = paySeCallEvent.f110002c;
            int i2 = bpiw4.f137824d;
            int i3 = i | 4;
            bpiw2.f137821a = i3;
            bpiw2.f137824d = i2;
            int i4 = bpiw4.f137823c;
            bpiw2.f137821a = i3 | 2;
            bpiw2.f137823c = i4;
            this.f94874a = (bpiw) bxvd.mo74062i();
            return;
        }
        String valueOf = String.valueOf(walletAnalyticsEvent.getClass().getName());
        Log.e("PaySeCallSessionSt", valueOf.length() == 0 ? new String("Unable to fill data for event ") : "Unable to fill data for event ".concat(valueOf));
    }

    public awqt(bjvz bjvz) {
        super(bjvz);
        this.f94874a = (bpiw) bjvz.mo65576a((bxxk) bpiw.f137819e.mo74142c(7), bpiw.f137819e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94874a);
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bpiw bpiw = this.f94874a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bpik bpik2 = bpik.f137757s;
        bpiw.getClass();
        bpik.f137775q = bpiw;
        bpik.f137759a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bpiv.m111970a(this.f94874a.f137822b);
        return (a == 0 || a == 1) ? false : true;
    }
}
