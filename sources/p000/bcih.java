package p000;

import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: bcih */
final /* synthetic */ class bcih implements bqeg {

    /* renamed from: a */
    private final bcjm f104209a;

    /* renamed from: b */
    private final bqgy f104210b;

    /* renamed from: c */
    private final bqgg f104211c;

    /* renamed from: d */
    private final bcnl f104212d;

    /* renamed from: e */
    private final UUID f104213e;

    public bcih(bcjm bcjm, bqgy bqgy, bqgg bqgg, bcnl bcnl, UUID uuid) {
        this.f104209a = bcjm;
        this.f104210b = bqgy;
        this.f104211c = bqgg;
        this.f104212d = bcnl;
        this.f104213e = uuid;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        long j;
        bcjm bcjm = this.f104209a;
        bqgy bqgy = this.f104210b;
        bqgg bqgg = this.f104211c;
        bcnl bcnl = this.f104212d;
        UUID uuid = this.f104213e;
        if (bqgy.isDone()) {
            j = TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) bqgy.get()).longValue());
        } else {
            j = 0;
        }
        try {
            bcnl.mo56982a(uuid, bqga.m112780a((Future) bqgg), bcjm.f104334c, j);
        } catch (Exception e) {
            bcnl.mo56981a(uuid, bckc.m89179a().mo56953a(bcjm.f104332a, e.getCause()), chuv.m149608a(e.getCause()), bcjm.f104334c, j);
        }
        return bqgg;
    }
}
