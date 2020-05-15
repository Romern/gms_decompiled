package p000;

import android.content.Context;
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ahtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahtp {

    /* renamed from: a */
    public final Context f68016a;

    /* renamed from: b */
    public final Queue f68017b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public ScheduledFuture f68018c;

    /* renamed from: d */
    public boolean f68019d;

    /* renamed from: e */
    private final ahwf f68020e;

    /* renamed from: f */
    private final ScheduledExecutorService f68021f = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: g */
    private final long f68022g;

    public ahtp(Context context, ahwf ahwf, long j) {
        this.f68016a = context;
        this.f68020e = ahwf;
        this.f68022g = j;
    }

    /* renamed from: a */
    public static void m56639a(ahtu ahtu) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68415a("FailedStoreAccessoryRequestsController: Request which failed at %d has finished its allowed number of retries. Forgetting this request permanently.", ahtu.mo37159f());
    }

    /* renamed from: b */
    public final void mo37155b() {
        this.f68019d = true;
        ScheduledFuture scheduledFuture = this.f68018c;
        if (scheduledFuture != null && !scheduledFuture.cancel(true)) {
            this.f68019d = false;
            return;
        }
        HashSet hashSet = new HashSet();
        boolean z = false;
        for (ahtu ahtu : this.f68017b) {
            if (!ahtu.mo37158e()) {
                m56639a(ahtu);
                hashSet.add(ahtu);
            } else {
                if (!z) {
                    ahwe a = this.f68020e.mo37223a(ahtu.mo37131a(), ahtu.mo37133c(), ahtu.mo37132b(), true);
                    if (a.mo37138a() == cakq.SUCCESS) {
                        hashSet.add(ahtu);
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68412a("FailedStoreAccessoryRequestsController: Retry attempt # %d  for a request which failed at %d SUCCEEDED", ahtu.f68032a, ahtu.mo37159f());
                    } else {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68412a("FailedStoreAccessoryRequestsController: Retry attempt # %d  for a request which failed at %d FAILED", ahtu.f68032a, ahtu.mo37159f());
                        if (!a.mo37139b()) {
                            hashSet.add(ahtu);
                            ((bnsl) ahsd.f67925a.mo68390d()).mo68415a("FailedStoreAccessoryRequestsController: request which failed at %d cannot be retried. Forgetting this request permanently.", ahtu.mo37159f());
                        } else {
                            z = true;
                        }
                    }
                }
                ahtu.f68032a++;
            }
        }
        this.f68017b.removeAll(hashSet);
        this.f68018c = !this.f68017b.isEmpty() ? mo37154a() : null;
        this.f68019d = false;
    }

    /* renamed from: a */
    public final ScheduledFuture mo37154a() {
        return this.f68021f.schedule(new ahto(this), this.f68022g, TimeUnit.MILLISECONDS);
    }
}
