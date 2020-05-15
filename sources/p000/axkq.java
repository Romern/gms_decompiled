package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeRequest;
import com.google.android.gms.walletp2p.internal.zeroparty.DeclineChallengeResponse;

/* renamed from: axkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axkq extends axeq {

    /* renamed from: e */
    private final DeclineChallengeRequest f96083e;

    public axkq(DeclineChallengeRequest declineChallengeRequest, Account account, Bundle bundle, axnw axnw) {
        super("DeclineChallengeOperation", declineChallengeRequest, account, bundle, axnw);
        this.f96083e = declineChallengeRequest;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((axnw) this.f95864c).mo53070a((DeclineChallengeResponse) null, status);
    }

    /* renamed from: b */
    public final void mo53072b(Context context) {
        bxvd da = btsx.f150300c.mo74144da();
        bxtx a = bxtx.m123261a(this.f96083e.f110801a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btsx btsx = (btsx) da.f164949b;
        a.getClass();
        btsx.f150302a |= 1;
        btsx.f150303b = a;
        btsy btsy = (btsy) axmo.m82727a("b/fundstransferv2/declineChallenge", this.f95862a, (btsx) da.mo74062i(), btsy.f150304c, mo53071a()).get();
        if ((btsy.f150306a & 1) != 0) {
            axnw axnw = (axnw) this.f95864c;
            bzvu bzvu = btsy.f150307b;
            if (bzvu == null) {
                bzvu = bzvu.f171552g;
            }
            DeclineChallengeResponse declineChallengeResponse = new DeclineChallengeResponse(axep.m82424a(context, bzvu));
            bzvu bzvu2 = btsy.f150307b;
            if (bzvu2 == null) {
                bzvu2 = bzvu.f171552g;
            }
            axnw.mo53070a(declineChallengeResponse, new Status(axks.m82680a(bttb.m117113a(bzvu2.f171556c))));
            return;
        }
        ((axnw) this.f95864c).mo53070a(new DeclineChallengeResponse(null), Status.f30107a);
    }
}
