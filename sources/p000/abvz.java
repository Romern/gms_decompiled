package p000;

import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.GetIndexableRequest;
import com.google.firebase.appindexing.internal.GetIndexableResponse;
import com.google.firebase.appindexing.internal.Thing;
import java.util.List;

/* renamed from: abvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvz extends abxm {

    /* renamed from: a */
    final /* synthetic */ GetIndexableRequest f58595a;

    /* renamed from: b */
    final /* synthetic */ abvo f58596b;

    /* renamed from: c */
    final /* synthetic */ briu f58597c;

    /* renamed from: d */
    final /* synthetic */ briw f58598d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abvz(briw briw, abyp abyp, abwu abwu, abym abym, abxp abxp, GetIndexableRequest getIndexableRequest, abvo abvo, briu briu) {
        super(abyp, abwu, abym, abxp);
        this.f58598d = briw;
        this.f58595a = getIndexableRequest;
        this.f58596b = abvo;
        this.f58597c = briu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo32376a() {
        List a = this.f58598d.mo69577a(this.f58595a.f152359b);
        briw briw = this.f58598d;
        abvo abvo = this.f58596b;
        GetIndexableRequest getIndexableRequest = this.f58595a;
        Thing a2 = briw.mo69576a(abvo, a, getIndexableRequest.f152359b, getIndexableRequest.f152358a);
        if (a2 != null) {
            return a2;
        }
        List a3 = this.f58598d.mo69578a(a, new String[]{this.f58595a.f152358a});
        if (a3.isEmpty()) {
            return null;
        }
        return (Thing) a3.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32377a(Status status, Object obj) {
        this.f58597c.mo69567a(new GetIndexableResponse(status, (Thing) obj));
    }
}
