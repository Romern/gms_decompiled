package p000;

import com.google.android.gms.search.corpora.RequestIndexingCall$Request;

/* renamed from: appl */
final /* synthetic */ class appl implements roo {

    /* renamed from: a */
    private final String f84779a;

    /* renamed from: b */
    private final String f84780b;

    /* renamed from: c */
    private final long f84781c;

    public appl(String str, String str2, long j) {
        this.f84779a = str;
        this.f84780b = str2;
        this.f84781c = j;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f84779a;
        String str2 = this.f84780b;
        long j = this.f84781c;
        appg appg = new appg((aucf) obj2);
        RequestIndexingCall$Request requestIndexingCall$Request = new RequestIndexingCall$Request();
        requestIndexingCall$Request.f107405a = str;
        requestIndexingCall$Request.f107406b = str2;
        requestIndexingCall$Request.f107407c = j;
        ((appk) ((appr) obj).mo25289B()).mo47494a(requestIndexingCall$Request, appg);
    }
}
