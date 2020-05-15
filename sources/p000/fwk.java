package p000;

import android.view.View;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fwk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ fwo f17439a;

    public fwk(fwo fwo) {
        this.f17439a = fwo;
    }

    public void onClick(View view) {
        fwo fwo = this.f17439a;
        ContactPerson contactPerson = fwo.f17446D.f17390a;
        if (contactPerson != null) {
            fwo.mo11431a(contactPerson, 4, fwo.mo11441d(contactPerson));
        }
        this.f17439a.f17445C.mo105d();
    }
}
