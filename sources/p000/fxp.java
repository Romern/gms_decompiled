package p000;

import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fxp implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ fxu f17541a;

    public fxp(fxu fxu) {
        this.f17541a = fxu;
    }

    public void onClick(View view) {
        ContactPerson contactPerson = (ContactPerson) view.getTag(C0126R.C0129id.appinvite_chip_view_holder_tag_person);
        fwo fwo = (fwo) this.f17541a.f17546e;
        if (fwo.f17445C == null) {
            fwo.mo11442d();
        }
        fwo.f17446D.mo11407a(contactPerson, 0);
        fwo.f17445C.f67l = (ViewGroup) view.getParent();
        fwo.f17445C.mo101aI();
    }
}
