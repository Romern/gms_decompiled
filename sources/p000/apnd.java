package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;

/* renamed from: apnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apnd extends aplq {

    /* renamed from: a */
    private final abrv f84738a;

    public apnd(abrv abrv, RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, abyy abyy) {
        super(bqbd.REQUEST_APP_INDEXING_UPDATE_INDEX, 1, 4, abrv.f58066b, requestAppIndexingUpdateIndexCall$Request, abyy);
        this.f84738a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        String str = ((RequestAppIndexingUpdateIndexCall$Request) this.f84708n).f107382a;
        abrv abrv = this.f84738a;
        Context context = abrv.f58066b;
        if (new abvs(context, abrv.f58071g, abrv.f58083s, new abyp(context)).mo32366a(str, System.currentTimeMillis(), bpzu.DEBUG_UI_REASON_REBUILD, true)) {
            return new RequestAppIndexingUpdateIndexCall$Response(Status.f30107a, this.f84738a.f58071g.mo33045p(str));
        }
        absg.m48185a("Failed to send index request to package %s.", str);
        return new RequestAppIndexingUpdateIndexCall$Response(Status.f30109c, -1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        return new RequestAppIndexingUpdateIndexCall$Response(status, -1);
    }
}
