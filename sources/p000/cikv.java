package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardIssueEventCallback;

/* renamed from: cikv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikv implements CardIssueEventCallback {

    /* renamed from: a */
    private final brep f190563a;

    public cikv(brep brep) {
        this.f190563a = brep;
    }

    public final void onError(int i, String str) {
        this.f190563a.mo49931a(new bres(brez.m113953a(i, str)));
    }

    public final void onSuccess(Card card) {
        String cid = card.getCardInfo().getCid();
        srn srn = atgf.f90279a;
        this.f190563a.mo49932a(cid);
        String valueOf = String.valueOf(cid);
        if (valueOf.length() == 0) {
            new String(" < IssueCardEventCallback onSuccess end cid = ");
        } else {
            " < IssueCardEventCallback onSuccess end cid = ".concat(valueOf);
        }
    }
}
