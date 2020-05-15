package p000;

import android.content.Context;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Query;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udw extends ucg {

    /* renamed from: f */
    public static final sbw f47329f = new sbw("QueryOperation", "");

    /* renamed from: g */
    private final QueryRequest f47330g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ucg.<init>(java.lang.String, ubk, uto, int, boolean):void
     arg types: [java.lang.String, ubk, uto, int, int]
     candidates:
      ucg.<init>(java.lang.String, ubk, uto, vcy, boolean):void
      ucg.<init>(java.lang.String, ubk, uto, int, boolean):void */
    public udw(ubk ubk, QueryRequest queryRequest, uto uto) {
        super("QueryOperation", ubk, uto, 16, false);
        this.f47330g = queryRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        Set set;
        aaal.m21020a(this.f47330g, "Invalid query request: no request");
        Query query = this.f47330g.f30910a;
        aaal.m21020a(query, "Invalid query request: no query");
        if (!this.f47237a.mo27097f()) {
            query.mo18285a();
            if (!query.mo18285a().isEmpty() || query.f31091e || query.f31093g || vgo.m40399a((Filter) query.f31087a)) {
                throw new aaaj(10, "Invalid query parameters.");
            }
        }
        Query a = this.f47237a.mo27072a(query);
        udv udv = new udv(this, a);
        ubk ubk = this.f47237a;
        if (!a.f31091e) {
            set = bnon.f131923a;
        } else {
            set = Collections.singleton(((uvt) uzm.f48742a).f48653a);
        }
        ubk.mo27083a(a, set, (utr) null, udv);
    }
}
