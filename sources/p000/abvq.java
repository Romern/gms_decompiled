package p000;

import android.content.Context;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;

/* renamed from: abvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abvq extends apos {

    /* renamed from: a */
    final /* synthetic */ String f58560a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abvq(Context context, abqv abqv, RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, abyy abyy, String str) {
        super(context, abqv, registerCorpusInfoCall$Request, abyy);
        this.f58560a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32358a(Object obj) {
        RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response = (RegisterCorpusInfoCall$Response) obj;
        if (!registerCorpusInfoCall$Response.f107403a.mo17710c()) {
            absg.m48193b("Failed to register corpus '%s':'%s'.", this.f58560a, registerCorpusInfoCall$Response.f107403a);
        }
    }
}
