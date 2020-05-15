package p000;

import android.view.View;
import com.google.android.gms.family.p042v2.invites.contactpicker.AutoCompleteTextView;
import com.google.android.gms.family.p042v2.model.ContactPerson;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: wnd */
final /* synthetic */ class wnd implements View.OnClickListener {

    /* renamed from: a */
    private final wnj f50946a;

    public wnd(wnj wnj) {
        this.f50946a = wnj;
    }

    public void onClick(View view) {
        wnj wnj = this.f50946a;
        AutoCompleteTextView autoCompleteTextView = wnj.f50958e;
        ContactPerson.ContactMethod a = AutoCompleteTextView.m23265a(autoCompleteTextView.getText().toString().trim());
        if (a != null) {
            autoCompleteTextView.mo18488a(a);
        }
        wnh wnh = wnj.f50963j;
        bngs j = bngx.m109377j();
        for (Map.Entry entry : wnj.f50955b.entrySet()) {
            List list = ((wni) entry.getValue()).f50952a;
            if (!list.isEmpty()) {
                ContactPerson contactPerson = (ContactPerson) entry.getKey();
                ContactPerson contactPerson2 = new ContactPerson(contactPerson.f31433a, contactPerson.f31434b, contactPerson.f31435c, contactPerson.f31437e);
                contactPerson2.mo18541a(list);
                j.mo67668c(contactPerson2);
            }
        }
        Iterator it = wnj.f50956c.iterator();
        while (it.hasNext()) {
            j.mo67668c(wnj.m42061a((ContactPerson.ContactMethod) it.next()));
        }
        wnh.mo18493a(j.mo67664a());
    }
}
