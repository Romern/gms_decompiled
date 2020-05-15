package p000;

import android.view.View;
import com.google.android.gms.family.p042v2.model.ContactPerson;

/* renamed from: wne */
final /* synthetic */ class wne implements View.OnClickListener {

    /* renamed from: a */
    private final wnj f50947a;

    /* renamed from: b */
    private final ContactPerson f50948b;

    /* renamed from: c */
    private final ContactPerson.ContactMethod f50949c;

    public wne(wnj wnj, ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        this.f50947a = wnj;
        this.f50948b = contactPerson;
        this.f50949c = contactMethod;
    }

    public void onClick(View view) {
        this.f50947a.mo29227c(this.f50948b, this.f50949c);
    }
}
