package p000;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ciex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciex {

    /* renamed from: c */
    private static final ciex f189988c = new ciex();

    /* renamed from: a */
    public final IdentityHashMap f189989a = new IdentityHashMap();

    /* renamed from: b */
    public ScheduledExecutorService f189990b;

    /* renamed from: a */
    public static Object m150140a(ciew ciew) {
        return f189988c.mo86022b(ciew);
    }

    /* renamed from: b */
    public static void m150142b(ciew ciew, Object obj) {
        f189988c.mo86021a(ciew, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized Object mo86022b(ciew ciew) {
        ciev ciev;
        ciev = (ciev) this.f189989a.get(ciew);
        if (ciev == null) {
            ciev = new ciev(ciew.mo85859a());
            this.f189989a.put(ciew, ciev);
        }
        ScheduledFuture scheduledFuture = ciev.f189987c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            ciev.f189987c = null;
        }
        ciev.f189986b++;
        return ciev.f189985a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo86021a(ciew ciew, Object obj) {
        boolean z;
        boolean z2;
        ciev ciev = (ciev) this.f189989a.get(ciew);
        if (ciev != null) {
            boolean z3 = true;
            if (obj == ciev.f189985a) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108589a(z, "Releasing the wrong instance");
            if (ciev.f189986b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            bmxy.m108601b(z2, "Refcount has already reached zero");
            int i = ciev.f189986b - 1;
            ciev.f189986b = i;
            if (i == 0) {
                if (ciev.f189987c != null) {
                    z3 = false;
                }
                bmxy.m108601b(z3, "Destroy task already scheduled");
                if (this.f189990b == null) {
                    this.f189990b = Executors.newSingleThreadScheduledExecutor(ciag.m149918c("grpc-shared-destroyer-%d"));
                }
                ciev.f189987c = this.f189990b.schedule(new cibq(new cieu(this, ciev, ciew, obj)), 1, TimeUnit.SECONDS);
            }
        } else {
            String valueOf = String.valueOf(ciew);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("No cached instance found for ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
