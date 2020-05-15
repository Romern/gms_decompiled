package p000;

import android.view.View;
import com.google.android.gms.family.p042v2.model.ContactPerson;

/* renamed from: wmz */
final /* synthetic */ class wmz implements View.OnClickListener {

    /* renamed from: a */
    private final wnb f50933a;

    /* renamed from: b */
    private final ContactPerson f50934b;

    public wmz(wnb wnb, ContactPerson contactPerson) {
        this.f50933a = wnb;
        this.f50934b = contactPerson;
    }

    public void onClick(View view) {
        wnb wnb = this.f50933a;
        ContactPerson contactPerson = this.f50934b;
        wnj wnj = (wnj) wnb.f50942v.f50943a;
        wni wni = (wni) wnj.f50955b.get(contactPerson);
        wni.f50953b = !wni.f50953b;
        wnj.f50964k.mo158M(wnj.mo29220a(contactPerson));
    }
}
