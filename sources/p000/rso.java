package p000;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* renamed from: rso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rso extends bntm {

    /* renamed from: a */
    public final Context f43594a;

    /* renamed from: b */
    rsp f43595b = null;

    /* renamed from: c */
    public final rsl f43596c;

    /* renamed from: d */
    private final Executor f43597d;

    public rso(Context context, rsl rsl, Executor executor) {
        super(null);
        this.f43594a = context;
        this.f43596c = rsl;
        this.f43597d = executor;
    }

    /* renamed from: a */
    public final void mo8544a(bnsw bnsw) {
        this.f43597d.execute(new rsn(this, bnsw));
    }

    /* renamed from: a */
    public final void mo25077a(RuntimeException runtimeException, bnsw bnsw) {
        Log.e("ClientLogging", "Internal logging error", runtimeException);
    }

    /* renamed from: a */
    public final boolean mo8545a(Level level) {
        return ((long) level.intValue()) >= cdjt.f181077a.mo77762b().mo77764b();
    }
}
