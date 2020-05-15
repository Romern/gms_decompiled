package p000;

import android.content.Context;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Query;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: uef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uef extends uch {

    /* renamed from: f */
    private final QueryRequest f47341f;

    /* renamed from: g */
    private final utr f47342g;

    public uef(ubk ubk, QueryRequest queryRequest, utr utr, uto uto) {
        super("StartLiveQueryOperation", ubk, uto, 52);
        this.f47341f = queryRequest;
        this.f47342g = utr;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: d */
    public final void mo27234d(Context context) {
        aaal.m21020a(this.f47341f, "Invalid query request: no request");
        aaal.m21020a(this.f47341f.f30910a, "Invalid query request: no query");
        Query a = this.f47237a.mo27072a(this.f47341f.f30910a);
        this.f47237a.mo27083a(a, Collections.singleton(((uvt) uzm.f48742a).f48653a), this.f47342g, (udv) null);
        this.f47238b.mo27971a();
    }
}
