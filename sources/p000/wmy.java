package p000;

import android.view.View;
import com.google.android.gms.family.p042v2.model.ContactPerson;

/* renamed from: wmy */
final /* synthetic */ class wmy implements View.OnClickListener {

    /* renamed from: a */
    private final wnb f50930a;

    /* renamed from: b */
    private final ContactPerson f50931b;

    /* renamed from: c */
    private final ContactPerson.ContactMethod f50932c;

    public wmy(wnb wnb, ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        this.f50930a = wnb;
        this.f50931b = contactPerson;
        this.f50932c = contactMethod;
    }

    public void onClick(View view) {
        wnb wnb = this.f50930a;
        wnb.f50942v.f50943a.mo29224b(this.f50931b, this.f50932c);
    }
}
