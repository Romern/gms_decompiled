package p000;

import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;

/* renamed from: ajtd */
final /* synthetic */ class ajtd implements roo {

    /* renamed from: a */
    private final ContactFilter f71264a;

    public ajtd(ContactFilter contactFilter) {
        this.f71264a = contactFilter;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        ContactFilter contactFilter = this.f71264a;
        akbf akbf = (akbf) obj;
        ajxr ajxr = new ajxr();
        ajtq ajtq = new ajtq((aucf) obj2);
        GetContactsCountParams getContactsCountParams = ajxr.f71513a;
        getContactsCountParams.f81076a = ajtq;
        if (contactFilter != null) {
            getContactsCountParams.f81077b = contactFilter;
        }
        ((ajyq) akbf.mo25289B()).mo38638a(ajxr.f71513a);
    }
}
