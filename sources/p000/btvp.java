package p000;

import android.content.Context;
import android.os.SystemClock;
import java.util.Random;

/* renamed from: btvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvp {

    /* renamed from: a */
    public final qws f152629a;

    /* renamed from: b */
    public final bpll f152630b;

    /* renamed from: c */
    public final Random f152631c;

    /* renamed from: d */
    public long f152632d = SystemClock.elapsedRealtime();

    /* renamed from: e */
    public final rjx f152633e;

    public btvp(Context context, int i) {
        qws qws = new qws(context, "LE", null);
        qws.mo24337a(cagz.UNMETERED_OR_DAILY);
        rjx b = avtz.m79338b(context);
        Random random = new Random();
        this.f152629a = qws;
        this.f152633e = b;
        this.f152631c = random;
        bxvd da = bpll.f138105c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpll bpll = (bpll) da.f164949b;
        bpll.f138108b = i - 1;
        bpll.f138107a |= 1;
        this.f152630b = (bpll) da.mo74062i();
    }

    /* renamed from: a */
    public final boolean mo72444a() {
        return SystemClock.elapsedRealtime() - this.f152632d > cexz.f183503a.mo6606a().clearcutLogPeriodMs();
    }
}
