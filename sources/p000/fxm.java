package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fxm implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ fxn f17520a;

    public fxm(fxn fxn) {
        this.f17520a = fxn;
    }

    public void onClick(View view) {
        fwo fwo = (fwo) this.f17520a.f17521e;
        if (fwo.f17469h) {
            if (fwo.f17445C == null) {
                fwo.mo11442d();
            }
            while (view.getId() != C0126R.C0129id.container && view.getParent() != null) {
                view = (View) view.getParent();
            }
            if (view.getId() != C0126R.C0129id.container) {
                view = null;
            }
            fwo.f17446D.mo11407a((ContactPerson) view.getTag(C0126R.C0129id.appinvite_chip_view_holder_tag_person), 1);
            aap aap = fwo.f17445C;
            aap.f67l = view;
            aap.mo101aI();
        }
    }
}
