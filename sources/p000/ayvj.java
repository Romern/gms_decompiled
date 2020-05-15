package p000;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ayvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayvj {

    /* renamed from: a */
    private static final AtomicInteger f98560a = new AtomicInteger();

    /* renamed from: b */
    private static final long f98561b = (System.currentTimeMillis() * 1000);

    /* renamed from: c */
    private static final long f98562c = (SystemClock.elapsedRealtime() * 1000);

    /* renamed from: d */
    private static final bptw f98563d;

    static {
        bxvd da = bptw.f139192c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bptw.m112278a((bptw) da.f164949b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bptw.m112279b((bptw) da.f164949b);
        long j = f98561b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bptw bptw = (bptw) da.f164949b;
        bptw.f139194a |= 1;
        bptw.f139195b = j;
        f98563d = (bptw) da.mo74062i();
    }

    /* renamed from: a */
    public static long m84935a(long j) {
        return (f98561b + j) - f98562c;
    }

    /* renamed from: a */
    public static bptv m84936a() {
        bxvd da = bptv.f139186d.mo74144da();
        long andIncrement = (long) f98560a.getAndIncrement();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bptv bptv = (bptv) da.f164949b;
        bptv.f139188a |= 2;
        bptv.f139190c = andIncrement;
        bptw bptw = f98563d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bptv bptv2 = (bptv) da.f164949b;
        bptw.getClass();
        bptv2.f139189b = bptw;
        bptv2.f139188a |= 1;
        return (bptv) da.mo74062i();
    }
}
