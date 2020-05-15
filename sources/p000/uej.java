package p000;

import android.content.Context;
import android.content.SyncResult;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Query;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: uej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uej extends uch {

    /* renamed from: f */
    public static final sbw f47355f = new sbw("SyncMoreOperation", "");

    /* renamed from: g */
    private final QueryRequest f47356g;

    public uej(ubk ubk, QueryRequest queryRequest, uto uto) {
        super("SyncMoreOperation", ubk, uto, 67, null);
        this.f47356g = queryRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: d */
    public final void mo27234d(Context context) {
        aaal.m21020a(this.f47356g, "Invalid query request: no request");
        aaal.m21020a(this.f47356g.f30910a, "Invalid query request: no query");
        Query a = this.f47237a.mo27072a(this.f47356g.f30910a);
        this.f47239c.mo28283a(a, false, null, null, null);
        ubk ubk = this.f47237a;
        uei uei = new uei(this.f47238b, this.f47239c);
        sdo.m34966a(a, "Query can't be null");
        sdo.m34966a(a.mo18285a(), "Query can't have null spaces (have you validated them?)");
        boolean z = true;
        sdo.m34975b(!a.mo18285a().isEmpty(), "Query can't have empty spaces (have you validated them?)");
        val val = ubk.f47155p;
        Date a2 = val.mo28167a(a);
        if (a2 != null) {
            val.f48849a.f49778y.mo28191a(val.f48851c);
            uzt a3 = val.mo28168a(a, a2);
            uli a4 = val.f48850b.mo27405a(val.f48851c, vab.m39867a(a3), a2.getTime());
            if (!a4.mo27691c()) {
                SyncResult syncResult = new SyncResult();
                vai vai = new vai(val.f48849a, val.f48851c, a4, new vch(syncResult), syncResult);
                vak vak = new vak(val, a3, a2, uei);
                int intValue = ((Integer) twy.f46827aK.mo58455c()).intValue();
                if (vai.f48832b.compareAndSet(false, true)) {
                    if (intValue < 0) {
                        z = false;
                    }
                    sdo.m34974b(z);
                    sdo.m34959a(vak);
                    String valueOf = String.valueOf(vai);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                    sb.append("Running ");
                    sb.append(valueOf);
                    new vah(vai, sb.toString(), intValue, vak).start();
                    return;
                }
                throw new IllegalStateException("Already started.");
            }
            uei.mo27256a(false, 0);
            return;
        }
        uei.mo27256a(false, 0);
    }
}
