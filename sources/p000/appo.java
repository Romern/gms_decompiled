package p000;

import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;

/* renamed from: appo */
public final /* synthetic */ class appo implements roo {

    /* renamed from: a */
    private final String f84786a;

    /* renamed from: b */
    private final String f84787b;

    public appo(String str, String str2) {
        this.f84786a = str;
        this.f84787b = str2;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f84786a;
        String str2 = this.f84787b;
        appg appg = new appg((aucf) obj2);
        GetCorpusInfoCall$Request getCorpusInfoCall$Request = new GetCorpusInfoCall$Request();
        getCorpusInfoCall$Request.f107392a = str;
        getCorpusInfoCall$Request.f107393b = str2;
        ((appk) ((appr) obj).mo25289B()).mo47491a(getCorpusInfoCall$Request, appg);
    }
}
