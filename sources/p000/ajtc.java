package p000;

import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;

/* renamed from: ajtc */
final /* synthetic */ class ajtc implements roo {

    /* renamed from: a */
    private final int f71261a;

    /* renamed from: b */
    private final int f71262b;

    /* renamed from: c */
    private final ContactFilter f71263c;

    public ajtc(int i, int i2, ContactFilter contactFilter) {
        this.f71261a = i;
        this.f71262b = i2;
        this.f71263c = contactFilter;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        int i = this.f71261a;
        int i2 = this.f71262b;
        ContactFilter contactFilter = this.f71263c;
        akbf akbf = (akbf) obj;
        ajxt ajxt = new ajxt();
        GetContactsParams getContactsParams = ajxt.f71514a;
        getContactsParams.f81079b = i;
        getContactsParams.f81080c = i2;
        ajyi ajyi = new ajyi((aucf) obj2);
        GetContactsParams getContactsParams2 = ajxt.f71514a;
        getContactsParams2.f81078a = ajyi;
        if (contactFilter != null) {
            getContactsParams2.f81081d = contactFilter;
        }
        ((ajyq) akbf.mo25289B()).mo38639a(ajxt.f71514a);
    }
}
