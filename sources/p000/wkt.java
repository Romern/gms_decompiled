package p000;

import android.view.View;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.p042v2.model.PageData;

/* renamed from: wkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wkt implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ wkx f50809a;

    public wkt(wkx wkx) {
        this.f50809a = wkx;
    }

    public void onClick(View view) {
        PageData pageData = !this.f50809a.f50812a.mo18464u() ? this.f50809a.f50815d : this.f50809a.f50816e;
        if (pageData != null) {
            wgm.m41917a((FamilyCreationChimeraActivity) this.f50809a.getActivity(), pageData, this.f50809a.f50813b, new wkr(this), new wks(), true).show();
        } else {
            this.f50809a.f50812a.mo18463t();
        }
    }
}
