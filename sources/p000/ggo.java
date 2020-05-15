package p000;

import android.content.Context;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* renamed from: ggo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ggo extends rjx implements ggk {

    /* renamed from: a */
    private static final rjo f18139a = new rjo("Audit.API", f18141c, f18140b);

    /* renamed from: b */
    private static final rje f18140b = new rje();

    /* renamed from: c */
    private static final rjl f18141c = new ggl();

    public ggo(Context context) {
        super(context, f18139a, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo11796a(LogAuditRecordsRequest logAuditRecordsRequest) {
        return mo24732b(new ggn(logAuditRecordsRequest));
    }
}
