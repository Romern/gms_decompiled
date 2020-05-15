package p000;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: zxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxm implements zxn {

    /* renamed from: a */
    static final Status f56121a = new Status(23509, zxo.m46639a(23509));

    /* renamed from: b */
    private final ExecutorService f56122b;

    /* renamed from: c */
    private final ScheduledExecutorService f56123c;

    /* renamed from: d */
    private final zxv f56124d;

    /* renamed from: e */
    private final ConcurrentHashMap f56125e = new ConcurrentHashMap();

    /* renamed from: f */
    private final AssetManager f56126f;

    public zxm(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, zxv zxv, Context context) {
        bmxy.m108582a(context, "context");
        Context applicationContext = context.getApplicationContext();
        bmxy.m108582a(executorService, "executor");
        this.f56122b = executorService;
        bmxy.m108582a(scheduledExecutorService, "scheduler");
        this.f56123c = scheduledExecutorService;
        bmxy.m108582a(zxv, "disk");
        this.f56124d = zxv;
        this.f56126f = applicationContext.getResources().getAssets();
    }

    /* renamed from: a */
    public final bqgg mo31558a(String str) {
        bmxy.m108582a(str, "fileName");
        zxk zxk = new zxk(str, this.f56124d, this.f56126f);
        this.f56125e.putIfAbsent(str, zxk);
        zxk zxk2 = (zxk) this.f56125e.get(str);
        if (zxk == zxk2) {
            ScheduledFuture<?> schedule = this.f56123c.schedule(new zxl(zxk2), 60000, TimeUnit.MILLISECONDS);
            if (zxk2.f56114b == null) {
                zxk2.f56114b = schedule;
                this.f56122b.execute(zxk2);
            } else {
                throw new IllegalStateException("Already have a timeoutFuture");
            }
        }
        return zxk2.f56113a;
    }

    /* renamed from: b */
    public final void mo31559b(String str) {
        bmxy.m108582a(str, "fileName");
        zyh.m46683c("FontsBundledExtractor", "forget(%s)", str);
        zxk zxk = (zxk) this.f56125e.remove(str);
        if (zxk != null) {
            zxk.mo31555a(Status.f30110d);
            return;
        }
        zyh.m46680a("FontsBundledExtractor", "Asked to forget %s but we weren't tracking it", str);
    }
}
