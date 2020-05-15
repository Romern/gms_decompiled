package p000;

import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fxk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ fxn f17518a;

    public fxk(fxn fxn) {
        this.f17518a = fxn;
    }

    public void onClick(View view) {
        ContactPerson contactPerson = (ContactPerson) view.getTag(C0126R.C0129id.appinvite_chip_view_holder_tag_person);
        fxn fxn = this.f17518a;
        fxo fxo = fxn.f17521e;
        int i = fxn.f17522f;
        int indexOf = fxn.f17528l.indexOf(contactPerson);
        fwo fwo = (fwo) fxo;
        if (fwo.mo11438b(contactPerson)) {
            String a = fzm.m12789a(fwo.f17462a, contactPerson);
            if (!TextUtils.isEmpty(fwo.f17477p)) {
                if (fwo.f17478q != null) {
                    fzq.m12809b(((Fragment) fxo).getActivity(), fwo.f17478q);
                }
                fwo.f17478q = fzq.m12805a(((Fragment) fxo).getActivity(), String.format(fwo.f17477p, a), true, false);
            }
        } else if (fwo.mo11434a(contactPerson)) {
            fwo.mo11431a(contactPerson, i, indexOf);
        } else {
            fwo.mo11436b(contactPerson, i, indexOf);
        }
    }
}
