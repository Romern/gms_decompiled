package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;

/* renamed from: apop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apop extends aplq {

    /* renamed from: a */
    private final abrv f84762a;

    public apop(abrv abrv, GetCorpusStatusCall$Request getCorpusStatusCall$Request, abyy abyy) {
        super(bqbd.GET_CORPUS_STATUS, 1, 1, abrv.f58066b, getCorpusStatusCall$Request, abyy);
        this.f84762a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        String str;
        GetCorpusStatusCall$Response getCorpusStatusCall$Response = new GetCorpusStatusCall$Response();
        GetCorpusStatusCall$Request getCorpusStatusCall$Request = (GetCorpusStatusCall$Request) this.f84708n;
        String str2 = getCorpusStatusCall$Request.f107396a;
        try {
            absd.m48174a("Corpus name", getCorpusStatusCall$Request.f107397b, 2048);
            str = null;
        } catch (IllegalArgumentException e) {
            str = e.getMessage();
        }
        if (str == null) {
            abrv abrv = this.f84762a;
            abyy abyy = this.f84709o;
            GetCorpusStatusCall$Request getCorpusStatusCall$Request2 = (GetCorpusStatusCall$Request) this.f84708n;
            getCorpusStatusCall$Response.f107399b = abrv.mo32315b(abyy, getCorpusStatusCall$Request2.f107397b, getCorpusStatusCall$Request2.f107396a);
            getCorpusStatusCall$Response.f107398a = Status.f30107a;
        } else {
            absg.m48192b("Bad get corpus status args: %s", str);
            getCorpusStatusCall$Response.f107398a = new Status(8, str, null);
        }
        return getCorpusStatusCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        GetCorpusStatusCall$Request getCorpusStatusCall$Request = (GetCorpusStatusCall$Request) this.f84708n;
        return String.format("%s, package[%s], corpus[%s]", super.mo33000f(), getCorpusStatusCall$Request.f107396a, getCorpusStatusCall$Request.f107397b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        GetCorpusStatusCall$Response getCorpusStatusCall$Response = new GetCorpusStatusCall$Response();
        getCorpusStatusCall$Response.f107398a = status;
        return getCorpusStatusCall$Response;
    }
}
