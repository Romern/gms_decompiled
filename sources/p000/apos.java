package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;

/* renamed from: apos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apos extends aplq {

    /* renamed from: a */
    private final abqv f84763a;

    public apos(Context context, abqv abqv, RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, abyy abyy) {
        super(bqbd.REGISTER_CORPUS_INFO, 2, 1, context, registerCorpusInfoCall$Request, abyy);
        this.f84763a = abqv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response = new RegisterCorpusInfoCall$Response();
        registerCorpusInfoCall$Response.f107403a = Status.f30107a;
        RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request = (RegisterCorpusInfoCall$Request) this.f84708n;
        String str = registerCorpusInfoCall$Request.f107400a;
        String a = absd.m48169a(registerCorpusInfoCall$Request.f107402c);
        if (a != null) {
            registerCorpusInfoCall$Response.f107403a = new Status(8, a, null);
        } else {
            abzr a2 = abzr.m48712a(((RegisterCorpusInfoCall$Request) this.f84708n).f107402c, System.currentTimeMillis());
            try {
                absg.m48184a("IndexManager starting to doRegisterCorpusInfo");
                registerCorpusInfoCall$Response.f107404b = this.f84763a.mo32288a(this.f84709o, a2);
            } catch (acaq | acat | SecurityException e) {
                registerCorpusInfoCall$Response.f107403a = new Status(8, e.getMessage(), null);
            }
        }
        return registerCorpusInfoCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request = (RegisterCorpusInfoCall$Request) this.f84708n;
        return String.format("%s, package[%s], corpus[%s]", super.mo33000f(), registerCorpusInfoCall$Request.f107400a, registerCorpusInfoCall$Request.f107401b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response = new RegisterCorpusInfoCall$Response();
        registerCorpusInfoCall$Response.f107403a = status;
        return registerCorpusInfoCall$Response;
    }
}
