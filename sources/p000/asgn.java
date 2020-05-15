package p000;

import android.content.Context;
import android.os.Build;
import java.io.InputStream;

/* renamed from: asgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgn extends asgr {
    public asgn() {
        super("Ipconnectivitystats", "connmetrics", "IPCONNECTIVITY_PLATFORM_STATS_GMSCORE", false);
    }

    /* renamed from: a */
    public final String[] mo49101a(long j, long j2) {
        return new String[]{"flush"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final calx mo49102b(Context context, InputStream inputStream, long j, long j2, qxq qxq) {
        return mo49100a(context, inputStream, j, j2, qxq, true);
    }

    /* renamed from: c */
    public final long mo49094c() {
        return cgta.f187697a.mo6606a().mo84445d();
    }

    /* renamed from: b */
    public final boolean mo49093b() {
        int i = Build.VERSION.SDK_INT;
        return cgsf.f187633a.mo6606a().mo84390f();
    }
}
