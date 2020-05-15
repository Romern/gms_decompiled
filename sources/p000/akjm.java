package p000;

import android.content.Context;
import android.net.NetworkKey;
import android.net.NetworkRecommendationProvider;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.Executor;

/* renamed from: akjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akjm extends NetworkRecommendationProvider implements akjk {

    /* renamed from: d */
    private static final DateFormat f72094d = new SimpleDateFormat();

    /* renamed from: a */
    public final aknd f72095a;

    /* renamed from: b */
    public final Context f72096b;

    /* renamed from: c */
    protected final boolean f72097c = akke.m59908a();

    /* renamed from: e */
    private final akmh f72098e;

    /* renamed from: f */
    private final akmz f72099f;

    /* renamed from: g */
    private final Object f72100g = new Object();

    /* renamed from: h */
    private final akjo f72101h;

    /* renamed from: i */
    private final akjk f72102i;

    /* renamed from: j */
    private NetworkKey[] f72103j;

    /* renamed from: k */
    private long f72104k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akjm(Context context, Executor executor, akjo akjo) {
        super(context, executor);
        akmh akmh = new akmh(context);
        akmz akmz = new akmz(context);
        aknd aknd = new aknd(context);
        this.f72099f = akmz;
        this.f72098e = akmh;
        this.f72095a = aknd;
        this.f72096b = context;
        this.f72101h = akjo;
        this.f72102i = akjl.m59882a(akmh, akmz, context);
    }

    /* renamed from: a */
    public final void mo39503a(PrintWriter printWriter, String[] strArr) {
        Integer num;
        long j;
        qxq qxq;
        akjk akjk = this.f72102i;
        if (akjk != null) {
            akjk.mo39503a(printWriter, strArr);
        }
        synchronized (this.f72100g) {
            if (this.f72103j != null) {
                printWriter.printf("Last onRequestScores call at %s for: %s\n", f72094d.format(new Date(this.f72104k)), Arrays.toString(this.f72103j));
            } else {
                printWriter.printf("onRequestScores never called", new Object[0]);
            }
        }
        Object[] objArr = new Object[1];
        aknd aknd = this.f72095a;
        Object[] objArr2 = new Object[2];
        qxl d = aknd.f72297a.mo24385d("138-RequestScores");
        qxk qxk = qxq.f42377b;
        d.f42358d.f42384e.readLock().lock();
        try {
            synchronized (d.f42356b) {
                if (qxk != qxq.f42377b) {
                    num = d.f42358d.mo24382c(qxk);
                } else {
                    qxq qxq2 = d.f42358d;
                    Integer num2 = qxq2.f42391l;
                    num = num2 == null ? qxq2.mo24382c(qxq2.f42390k) : num2;
                }
                j = 0;
                if (num != null) {
                    C1230nw nwVar = (C1230nw) d.f42357c.mo15646f(num.intValue());
                    if (nwVar != null) {
                        long[] jArr = (long[]) nwVar.mo15534a(0L);
                        if (jArr != null) {
                            j = jArr[0];
                            qxq = d.f42358d;
                        } else {
                            qxq = d.f42358d;
                        }
                    } else {
                        qxq = d.f42358d;
                    }
                } else {
                    qxq = d.f42358d;
                }
            }
            qxq.f42384e.readLock().unlock();
            objArr2[0] = Long.valueOf(j);
            objArr2[1] = aknd.f72297a.mo24385d("138-RequestScores").toString();
            objArr[0] = String.format("SUCCESS count: %d, all: %s", objArr2);
            printWriter.printf("onRequestScores call counts: %s\n", objArr);
        } catch (Throwable th) {
            d.f42358d.f42384e.readLock().unlock();
            throw th;
        }
    }

    public final void onRequestScores(NetworkKey[] networkKeyArr) {
        if (!this.f72101h.mo39505a()) {
            int i = eoa.f15378a;
            return;
        }
        int i2 = eoa.f15378a;
        this.f72098e.mo39559a(networkKeyArr);
        aknd aknd = this.f72095a;
        if (cdiv.m133521b()) {
            aknd.f72297a.mo24385d("138-RequestScores").mo24367a(0);
        }
        if (this.f72097c) {
            synchronized (this.f72100g) {
                this.f72103j = (NetworkKey[]) networkKeyArr.clone();
                this.f72104k = System.currentTimeMillis();
            }
        }
    }
}
