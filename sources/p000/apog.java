package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;

/* renamed from: apog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apog extends aplq {

    /* renamed from: a */
    private final abrv f84759a;

    protected apog(abrv abrv, ClearCorpusCall$Request clearCorpusCall$Request, abyy abyy) {
        super(bqbd.CLEAR_CORPUS, 2, 1, abrv.f58066b, clearCorpusCall$Request, abyy);
        this.f84759a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        String str;
        ClearCorpusCall$Response clearCorpusCall$Response = new ClearCorpusCall$Response();
        clearCorpusCall$Response.f107387a = Status.f30107a;
        ClearCorpusCall$Request clearCorpusCall$Request = (ClearCorpusCall$Request) this.f84708n;
        String str2 = clearCorpusCall$Request.f107385a;
        String str3 = clearCorpusCall$Request.f107386b;
        if (str3 == null) {
            str = "Null corpus name specified";
        } else {
            try {
                absd.m48174a("Corpus name", str3, 2048);
                str = null;
            } catch (IllegalArgumentException e) {
                str = e.getMessage();
            }
        }
        if (str == null) {
            try {
                abrv abrv = this.f84759a;
                abyy abyy = this.f84709o;
                String str4 = ((ClearCorpusCall$Request) this.f84708n).f107386b;
                abrv.f58067c.mo32992b(2);
                abyv a = abrv.f58077m.mo32495a(abyy);
                if (!a.mo32474c()) {
                    abrv.mo32305a(a, str4);
                } else {
                    String str5 = a.f58761b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 20);
                    sb.append("Package ");
                    sb.append(str5);
                    sb.append(" is blocked.");
                    throw new acat(sb.toString());
                }
            } catch (acaq | acat | SecurityException e2) {
                clearCorpusCall$Response.f107387a = new Status(8, e2.getMessage(), null);
            }
        } else {
            clearCorpusCall$Response.f107387a = new Status(8, str, null);
        }
        return clearCorpusCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        return String.format("%s, corpus[%s]", super.mo33000f(), ((ClearCorpusCall$Request) this.f84708n).f107386b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        ClearCorpusCall$Response clearCorpusCall$Response = new ClearCorpusCall$Response();
        clearCorpusCall$Response.f107387a = status;
        return clearCorpusCall$Response;
    }
}
