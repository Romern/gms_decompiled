package p000;

import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;

/* renamed from: apqs */
public final /* synthetic */ class apqs implements roo {

    /* renamed from: a */
    private final String f84798a;

    /* renamed from: b */
    private final boolean f84799b;

    public apqs(String str, boolean z) {
        this.f84798a = str;
        this.f84799b = z;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f84798a;
        boolean z = this.f84799b;
        apqm apqm = new apqm((aucf) obj2);
        SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request = new SetIncludeInGlobalSearchCall$Request();
        setIncludeInGlobalSearchCall$Request.f107434a = str;
        setIncludeInGlobalSearchCall$Request.f107435b = null;
        setIncludeInGlobalSearchCall$Request.f107436c = z;
        ((apqq) ((apqk) obj).mo25289B()).mo47519a(setIncludeInGlobalSearchCall$Request, apqm);
    }
}
