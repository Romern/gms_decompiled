package p000;

import android.content.Context;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;

/* renamed from: abvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abvj extends apos {

    /* renamed from: a */
    final /* synthetic */ String f58542a;

    /* renamed from: b */
    final /* synthetic */ abww f58543b;

    /* renamed from: c */
    final /* synthetic */ CorpusStatus f58544c;

    /* renamed from: d */
    final /* synthetic */ abrv f58545d;

    /* renamed from: e */
    final /* synthetic */ abvo f58546e;

    /* renamed from: f */
    final /* synthetic */ int f58547f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abvj(abvo abvo, Context context, abqv abqv, RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, abyy abyy, String str, abww abww, CorpusStatus corpusStatus, abrv abrv, int i) {
        super(context, abqv, registerCorpusInfoCall$Request, abyy);
        this.f58546e = abvo;
        this.f58542a = str;
        this.f58543b = abww;
        this.f58544c = corpusStatus;
        this.f58545d = abrv;
        this.f58547f = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32358a(Object obj) {
        RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response = (RegisterCorpusInfoCall$Response) obj;
        if (!registerCorpusInfoCall$Response.f107403a.mo17710c()) {
            absg.m48193b("Failed to register corpus '%s':'%s'.", this.f58542a, registerCorpusInfoCall$Response.f107403a);
        } else {
            abvo.m48342a(this.f58546e.getWritableDatabase(), this.f58543b, this.f84709o, this.f58544c, this.f58545d, this.f58547f);
        }
    }
}
