package p000;

import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;

/* renamed from: apom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apom extends aplq {

    /* renamed from: a */
    private final abrv f84761a;

    public apom(abrv abrv, GetCorpusInfoCall$Request getCorpusInfoCall$Request, abyy abyy) {
        super(bqbd.GET_CORPUS_INFO, 1, 1, abrv.f58066b, getCorpusInfoCall$Request, abyy);
        this.f84761a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        RegisterCorpusInfo registerCorpusInfo;
        GetCorpusInfoCall$Response getCorpusInfoCall$Response = new GetCorpusInfoCall$Response();
        abrv abrv = this.f84761a;
        abyy abyy = this.f84709o;
        GetCorpusInfoCall$Request getCorpusInfoCall$Request = (GetCorpusInfoCall$Request) this.f84708n;
        absr a = abrv.mo32297a(abyy, getCorpusInfoCall$Request.f107393b, getCorpusInfoCall$Request.f107392a);
        if (a != null) {
            registerCorpusInfo = abzm.m48660h(a);
        } else {
            registerCorpusInfo = null;
        }
        getCorpusInfoCall$Response.f107395b = registerCorpusInfo;
        getCorpusInfoCall$Response.f107394a = Status.f30107a;
        return getCorpusInfoCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        GetCorpusInfoCall$Request getCorpusInfoCall$Request = (GetCorpusInfoCall$Request) this.f84708n;
        return String.format("%s, package[%s], corpus[%s] ", super.mo33000f(), getCorpusInfoCall$Request.f107392a, getCorpusInfoCall$Request.f107393b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        GetCorpusInfoCall$Response getCorpusInfoCall$Response = new GetCorpusInfoCall$Response();
        getCorpusInfoCall$Response.f107394a = status;
        return getCorpusInfoCall$Response;
    }
}
