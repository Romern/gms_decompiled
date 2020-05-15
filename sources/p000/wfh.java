package p000;

import android.content.Context;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;

/* renamed from: wfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wfh extends rjx {

    /* renamed from: a */
    private static final rjo f50610a = new rjo("FacsInternalSync.API", f50612c, f50611b);

    /* renamed from: b */
    private static final rje f50611b = new rje();

    /* renamed from: c */
    private static final rjl f50612c = new wfe();

    public wfh(Context context, C1598wfa wfa) {
        super(context, f50610a, wfa, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo29076a(FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        roz b = rpa.m34196b();
        b.f43472a = new wfd(facsInternalSyncCallOptions);
        return mo24701a(b.mo24977a());
    }
}
