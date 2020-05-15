package p000;

import android.view.View;
import com.google.android.gms.family.p042v2.model.ContactPerson;

/* renamed from: wna */
final /* synthetic */ class wna implements View.OnClickListener {

    /* renamed from: a */
    private final wnb f50935a;

    /* renamed from: b */
    private final ContactPerson f50936b;

    /* renamed from: c */
    private final ContactPerson.ContactMethod f50937c;

    public wna(wnb wnb, ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        this.f50935a = wnb;
        this.f50936b = contactPerson;
        this.f50937c = contactMethod;
    }

    public void onClick(View view) {
        wnb wnb = this.f50935a;
        wnb.f50942v.f50943a.mo29224b(this.f50936b, this.f50937c);
    }
}
