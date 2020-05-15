package p000;

import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.ValidateDraftTokenResponse;

/* renamed from: axgx */
public final /* synthetic */ class axgx implements aubw {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95928a;

    public axgx(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity) {
        this.f95928a = completeMoneyTransferChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity = this.f95928a;
        axoc axoc = (axoc) obj;
        if (completeMoneyTransferChimeraActivity.isDestroyed()) {
            return;
        }
        if (axoc.f96207a.mo17710c()) {
            ValidateDraftTokenResponse validateDraftTokenResponse = axoc.f96208b;
            if (validateDraftTokenResponse.f110855g != null) {
                completeMoneyTransferChimeraActivity.mo53238P(120);
                completeMoneyTransferChimeraActivity.mo60164a(axoc.f96208b.f110855g);
            } else if (validateDraftTokenResponse.f110853e == null || stm.m36302d(axog.m82805a(completeMoneyTransferChimeraActivity.getIntent())) || validateDraftTokenResponse.f110853e.equals(axog.m82805a(completeMoneyTransferChimeraActivity.getIntent()))) {
                completeMoneyTransferChimeraActivity.f110673r = axfj.m82570a(completeMoneyTransferChimeraActivity.f110672q, completeMoneyTransferChimeraActivity.mo60160a(completeMoneyTransferChimeraActivity.getIntent(), validateDraftTokenResponse));
                completeMoneyTransferChimeraActivity.f110664g = validateDraftTokenResponse;
                completeMoneyTransferChimeraActivity.f110660c.mo70853a(validateDraftTokenResponse.f110849a, validateDraftTokenResponse.f110850b);
                completeMoneyTransferChimeraActivity.f110660c.setVisibility(0);
                completeMoneyTransferChimeraActivity.f110662e.setVisibility(0);
                if (completeMoneyTransferChimeraActivity.f110673r.mo53098m()) {
                    if (stm.m36302d(validateDraftTokenResponse.f110851c)) {
                        completeMoneyTransferChimeraActivity.mo53238P(122);
                        completeMoneyTransferChimeraActivity.mo60174j();
                        return;
                    }
                    completeMoneyTransferChimeraActivity.mo60161a(validateDraftTokenResponse.f110849a, validateDraftTokenResponse.f110850b, validateDraftTokenResponse.f110851c);
                } else if (!stm.m36302d(validateDraftTokenResponse.f110851c)) {
                    completeMoneyTransferChimeraActivity.mo53238P(123);
                    completeMoneyTransferChimeraActivity.mo60174j();
                } else {
                    completeMoneyTransferChimeraActivity.mo60163a(completeMoneyTransferChimeraActivity.f110673r);
                    completeMoneyTransferChimeraActivity.mo53238P(124);
                }
            } else {
                completeMoneyTransferChimeraActivity.mo53238P(121);
                completeMoneyTransferChimeraActivity.mo60174j();
            }
        } else {
            completeMoneyTransferChimeraActivity.mo53238P(120);
            if (axoc.f96207a.f30115i == 7) {
                completeMoneyTransferChimeraActivity.mo60165a(new axgv(completeMoneyTransferChimeraActivity));
            } else {
                completeMoneyTransferChimeraActivity.mo60174j();
            }
        }
    }
}
