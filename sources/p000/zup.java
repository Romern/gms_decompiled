package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: zup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zup implements yhs {

    /* renamed from: a */
    private final Context f55948a;

    /* renamed from: b */
    private final String f55949b;

    /* renamed from: c */
    private final long f55950c = TimeUnit.MINUTES.toNanos(cdzd.f182003a.mo6606a().mo78553T());

    public zup(Context context, String str) {
        this.f55948a = context;
        this.f55949b = str;
    }

    /* renamed from: a */
    public final long mo30502a(long j) {
        long b = zuw.m46536b(this.f55948a, this.f55949b);
        return b > 0 ? Math.max(j - this.f55950c, Math.min(j, TimeUnit.MILLISECONDS.toNanos(b))) : j;
    }
}
