package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.wallet.analytics.events.PaySeCallEvent;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfq extends bjyf {

    /* renamed from: a */
    static awfq f94277a;

    /* renamed from: g */
    private final BuyFlowConfig f94278g;

    private awfq(Context context, BuyFlowConfig buyFlowConfig) {
        super(context);
        this.f94278g = buyFlowConfig;
    }

    /* renamed from: a */
    public static synchronized awfq m79857a(Context context, BuyFlowConfig buyFlowConfig) {
        awfq awfq;
        synchronized (awfq.class) {
            sdo.m34959a(context);
            if (f94277a == null) {
                f94277a = new awfq(context, buyFlowConfig);
            }
            awfq = f94277a;
        }
        return awfq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52104a(Context context, int i, long j, rkk rkk, String str) {
        int i2;
        int i3 = i - 1;
        if (i3 != 0) {
            i2 = i3 != 1 ? i3 != 2 ? 5 : 4 : 3;
        } else {
            i2 = 2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvd da = bpiw.f137819e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpiw bpiw = (bpiw) da.f164949b;
        bpiw.f137822b = i2 - 1;
        int i4 = bpiw.f137821a | 1;
        bpiw.f137821a = i4;
        bpiw.f137821a = i4 | 2;
        bpiw.f137823c = (int) (elapsedRealtime - j);
        int i5 = rkk.mo7183bo().f30115i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpiw bpiw2 = (bpiw) da.f164949b;
        bpiw2.f137821a |= 4;
        bpiw2.f137824d = i5;
        awqc.m80662a(context, new PaySeCallEvent(str, (bpiw) da.mo74062i(), this.f94278g));
    }
}
