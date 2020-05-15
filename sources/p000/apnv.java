package p000;

import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;

/* renamed from: apnv */
public final /* synthetic */ class apnv implements roo {

    /* renamed from: a */
    private final String f84751a;

    public apnv(String str) {
        this.f84751a = str;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f84751a;
        apno apno = new apno((aucf) obj2);
        ((apns) ((apoa) obj).mo25289B()).mo47447a(new GetAppIndexingPackageDetailsCall$Request(str), apno);
    }
}
