package p000;

import android.view.View;
import com.google.android.gms.family.p042v2.create.FamilyCreationChimeraActivity;
import com.google.android.gms.family.p042v2.model.PageData;

/* renamed from: wki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wki implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ wkm f50793a;

    public wki(wkm wkm) {
        this.f50793a = wkm;
    }

    public void onClick(View view) {
        PageData pageData = !this.f50793a.f50796a.mo18464u() ? this.f50793a.f50799d : this.f50793a.f50800e;
        if (pageData != null) {
            wgm.m41917a((FamilyCreationChimeraActivity) this.f50793a.getActivity(), pageData, this.f50793a.f50797b, new wkg(this), new wkh(), true).show();
        } else {
            this.f50793a.f50796a.mo18463t();
        }
    }
}
