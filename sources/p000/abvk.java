package p000;

import android.content.Context;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;

/* renamed from: abvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abvk extends apow {

    /* renamed from: a */
    final /* synthetic */ String f58548a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abvk(Context context, acpl acpl, abzo abzo, acaf acaf, abvx abvx, RequestIndexingCall$Request requestIndexingCall$Request, abyy abyy, String str) {
        super(context, acpl, abzo, acaf, abvx, requestIndexingCall$Request, abyy);
        this.f58548a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32358a(Object obj) {
        RequestIndexingCall$Response requestIndexingCall$Response = (RequestIndexingCall$Response) obj;
        if (!requestIndexingCall$Response.f107408a.mo17710c()) {
            absg.m48193b("Request indexing failed for corpus '%s':'%s'.", this.f58548a, requestIndexingCall$Response.f107408a);
        }
    }
}
