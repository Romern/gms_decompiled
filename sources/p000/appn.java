package p000;

import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;

/* renamed from: appn */
final /* synthetic */ class appn implements roo {

    /* renamed from: a */
    private final String f84784a;

    /* renamed from: b */
    private final String f84785b;

    public appn(String str, String str2) {
        this.f84784a = str;
        this.f84785b = str2;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f84784a;
        String str2 = this.f84785b;
        appg appg = new appg((aucf) obj2);
        GetCorpusStatusCall$Request getCorpusStatusCall$Request = new GetCorpusStatusCall$Request();
        getCorpusStatusCall$Request.f107396a = str;
        getCorpusStatusCall$Request.f107397b = str2;
        ((appk) ((appr) obj).mo25289B()).mo47492a(getCorpusStatusCall$Request, appg);
    }
}
