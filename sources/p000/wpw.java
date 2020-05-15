package p000;

import android.view.View;

/* renamed from: wpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wpw implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ wqb f51118a;

    public wpw(wqb wqb) {
        this.f51118a = wqb;
    }

    public void onClick(View view) {
        if (this.f51118a.getArguments().containsKey("memberId")) {
            wgn.m41923c("RemoveMemberConfirmationFragment", "remove member canceled", new Object[0]);
            this.f51118a.f51122a.mo18499g();
            return;
        }
        wgn.m41923c("RemoveMemberConfirmationFragment", "leave family canceled", new Object[0]);
        this.f51118a.f51122a.mo18500h();
    }
}
