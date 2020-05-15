package p000;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: vbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbq extends Thread {

    /* renamed from: a */
    public static final sbw f48943a = new sbw("ResultsPageProducer", "");

    /* renamed from: b */
    public final vkv f48944b;

    /* renamed from: c */
    public final BlockingQueue f48945c;

    /* renamed from: d */
    public final ClientContext f48946d;

    /* renamed from: e */
    public final Set f48947e;

    /* renamed from: f */
    public final Long f48948f;

    /* renamed from: g */
    public final int f48949g;

    /* renamed from: h */
    public final vks f48950h;

    /* renamed from: i */
    public long f48951i = 0;

    /* renamed from: j */
    public int f48952j = 0;

    /* renamed from: k */
    private final vpo f48953k;

    /* renamed from: l */
    private final uzy f48954l;

    /* renamed from: m */
    private final int f48955m;

    /* renamed from: n */
    private final Executor f48956n = sne.m35694a(2, 9);

    /* renamed from: o */
    private volatile boolean f48957o = false;

    /* renamed from: p */
    private long f48958p = 0;

    /* renamed from: q */
    private long f48959q = 0;

    public vbq(ClientContext clientContext, vpu vpu, BlockingQueue blockingQueue, uzy uzy, Long l, Set set, int i, int i2, vks vks) {
        voq voq = new voq(vpu.f49747F, twy.f46813X, twy.f46814Y, 0, System.currentTimeMillis());
        this.f48946d = clientContext;
        sdo.m34959a(voq);
        this.f48953k = voq;
        this.f48944b = vpu.f49762i;
        sdo.m34959a(blockingQueue);
        this.f48945c = blockingQueue;
        sdo.m34959a(uzy);
        this.f48954l = uzy;
        this.f48948f = l;
        this.f48947e = set;
        this.f48955m = i;
        this.f48949g = i2;
        this.f48950h = vks;
        setName(vbq.class.getName());
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    private final Pair m39943a(uzy uzy, bqgy bqgy, boolean z) {
        String str;
        String a = uzy.mo28146a();
        uzx uzx = uzy.f48788a;
        bqgy c = bqgy.m112818c();
        vbo vbo = new vbo(c);
        bqgy c2 = bqgy.m112818c();
        this.f48956n.execute(new vbp(this, uzx, a, z, vbo, bqgy, c2, c));
        try {
            str = (String) c.get();
        } catch (InterruptedException | ExecutionException e) {
            f48943a.mo25376c("Interrupted while getting next page token");
            Class<?> cls = e.getClass();
            Exception exc = e;
            if (cls != InterruptedException.class) {
                exc = e.getCause();
            }
            c2.mo69136a(exc);
            str = null;
        }
        return Pair.create(str, c2);
    }

    public final void interrupt() {
        this.f48957o = true;
        super.interrupt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017e A[RETURN] */
    public final void run() {
        boolean z;
        Pair pair;
        f48943a.mo25369a("Running: initialFeedState: %s", this.f48954l);
        uzy uzy = this.f48954l;
        SystemClock.elapsedRealtime();
        try {
            bqgy c = bqgy.m112818c();
            c.mo69138b((Object) null);
            int i = 0;
            while (!uzy.mo28148c() && !isInterrupted() && i < this.f48955m) {
                try {
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        this.f48953k.mo28705f();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        this.f48958p += elapsedRealtime2 - elapsedRealtime;
                        uzz uzz = uzy.f48788a.f48787c;
                        uzz uzz2 = uzz.CHANGELOG;
                        int ordinal = uzz.ordinal();
                        if (ordinal == 0) {
                            sdo.m34974b(uzy.f48788a instanceof uzv);
                            pair = m39943a(uzy, c, z);
                        } else if (ordinal == 1) {
                            sdo.m34974b(uzy.f48788a instanceof uzw);
                            pair = m39943a(uzy, c, z);
                        } else if (ordinal == 2) {
                            sdo.m34974b(uzy.f48788a instanceof vab);
                            pair = m39943a(uzy, c, z);
                        } else if (ordinal == 3) {
                            sdo.m34974b(uzy.f48788a instanceof uzu);
                            pair = m39943a(uzy, c, z);
                        } else if (ordinal == 4) {
                            sdo.m34974b(uzy.f48788a instanceof vaa);
                            pair = m39943a(uzy, c, z);
                        } else {
                            String valueOf = String.valueOf(uzz);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                            sb.append("Unsupported feed type: ");
                            sb.append(valueOf);
                            throw new RuntimeException(sb.toString());
                        }
                        c = (bqgy) pair.second;
                        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                        this.f48959q += elapsedRealtime3;
                        uzy = uzy.m39861a(uzy, (String) pair.first);
                        i++;
                        try {
                            f48943a.mo25369a("Done retrieving page %d [%d ms].", Integer.valueOf(i), Long.valueOf(elapsedRealtime3));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (InterruptedException | ExecutionException e) {
                            e = e;
                        }
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    e = e2;
                    if (this.f48957o) {
                        if (e.getClass() != InterruptedException.class) {
                            e = (Exception) e.getCause();
                        }
                        try {
                            long elapsedRealtime4 = SystemClock.elapsedRealtime();
                            BlockingQueue blockingQueue = this.f48945c;
                            int i2 = this.f48949g;
                            sdo.m34959a(e);
                            blockingQueue.offer(new vbr(i2, null, e, null), Long.MAX_VALUE, TimeUnit.SECONDS);
                            this.f48951i += SystemClock.elapsedRealtime() - elapsedRealtime4;
                            return;
                        } catch (InterruptedException e3) {
                            f48943a.mo25377c("ResultsPageProducer", "Producer cannot be terminated gracefully");
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            sdo.m34974b(uzy.mo28147b());
            SystemClock.elapsedRealtime();
            f48943a.mo25371b("Waiting for requests in flight");
            c.get();
            f48943a.mo25371b("All requests in flight completed");
            SystemClock.elapsedRealtime();
            long elapsedRealtime5 = SystemClock.elapsedRealtime();
            this.f48945c.offer(new vbr(this.f48949g, null, null, uzy.mo28146a()), Long.MAX_VALUE, TimeUnit.SECONDS);
            this.f48951i += SystemClock.elapsedRealtime() - elapsedRealtime5;
        } catch (InterruptedException | ExecutionException e4) {
            e = e4;
            if (this.f48957o) {
            }
        }
    }
}
