package p000;

import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: acrc */
final /* synthetic */ class acrc implements aubq {

    /* renamed from: a */
    private final acrd f60572a;

    /* renamed from: b */
    private final ftl f60573b;

    /* renamed from: c */
    private final ActionImpl[] f60574c;

    /* renamed from: d */
    private final abwt f60575d;

    public acrc(acrd acrd, ftl ftl, ActionImpl[] actionImplArr, abwt abwt) {
        this.f60572a = acrd;
        this.f60573b = ftl;
        this.f60574c = actionImplArr;
        this.f60575d = abwt;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        String str;
        acrd acrd = this.f60572a;
        ftl ftl = this.f60573b;
        ActionImpl[] actionImplArr = this.f60574c;
        abwt abwt = this.f60575d;
        bpzq bpzq = bpzq.NO_ERROR;
        Exception e = aucb.mo50387e();
        if (e == null) {
            str = null;
        } else {
            if (e instanceof abws) {
                bpzq = ((abws) e).f58647a;
            } else {
                bpzq = bpzq.INTERNAL_ERROR;
            }
            str = e.getMessage();
        }
        acrd.mo33012a(ftl, actionImplArr, bpzq, abwt.f58650a, str);
    }
}
