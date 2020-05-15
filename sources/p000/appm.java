package p000;

import com.google.android.gms.search.corpora.ClearCorpusCall$Request;

/* renamed from: appm */
final /* synthetic */ class appm implements roo {

    /* renamed from: a */
    private final String f84782a;

    /* renamed from: b */
    private final String f84783b;

    public appm(String str, String str2) {
        this.f84782a = str;
        this.f84783b = str2;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f84782a;
        String str2 = this.f84783b;
        appg appg = new appg((aucf) obj2);
        ClearCorpusCall$Request clearCorpusCall$Request = new ClearCorpusCall$Request();
        clearCorpusCall$Request.f107385a = str;
        clearCorpusCall$Request.f107386b = str2;
        ((appk) ((appr) obj).mo25289B()).mo47489a(clearCorpusCall$Request, appg);
    }
}
