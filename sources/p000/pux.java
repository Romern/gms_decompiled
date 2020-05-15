package p000;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pux extends alj {

    /* renamed from: e */
    private pes f40321e;

    /* renamed from: f */
    private puw f40322f;

    /* renamed from: a */
    public final akz mo966a() {
        if (this.f40322f == null) {
            this.f40321e = pes.m30267a(getApplicationContext(), "CastMRPService");
            Context applicationContext = getApplicationContext();
            ScheduledExecutorService a = pes.m30266a();
            pes pes = this.f40321e;
            this.f40322f = new puw(applicationContext, a, pes.f38984h, pes.f38985i, pes.f38986j, pes.f38982f);
            this.f40321e.f38984h.mo23459a(this.f40322f);
        }
        return this.f40322f;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onDestroy() {
        pes pes = this.f40321e;
        if (pes != null) {
            pes.f38984h.mo23463b(this.f40322f);
            this.f40321e.mo22984a("CastMRPService");
            this.f40321e = null;
        }
        this.f40322f = null;
        super.onDestroy();
    }
}
