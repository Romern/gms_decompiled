package p000;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.io.Closeable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: vvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvl implements Closeable {

    /* renamed from: a */
    public static final long f50036a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: b */
    public static final long f50037b = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: c */
    public final vvp f50038c;

    /* renamed from: d */
    public final String f50039d;

    /* renamed from: e */
    public final DroidGuardResultsRequest f50040e;

    /* renamed from: f */
    public final long f50041f;

    /* renamed from: g */
    public final long f50042g;

    /* renamed from: h */
    public final BlockingQueue f50043h;

    /* renamed from: i */
    public final Thread f50044i = new Thread(new vvk(this));

    public vvl(BlockingQueue blockingQueue, vvp vvp, String str, DroidGuardResultsRequest droidGuardResultsRequest, long j, long j2) {
        this.f50043h = blockingQueue;
        this.f50038c = vvp;
        this.f50039d = str;
        this.f50040e = droidGuardResultsRequest;
        this.f50041f = j;
        this.f50042g = j2;
        droidGuardResultsRequest.f31252a.remove("timeoutMs");
    }

    public final void close() {
        if (this.f50044i.isAlive()) {
            while (!this.f50043h.offer(bmvz.f131120a)) {
                this.f50043h.clear();
            }
            try {
                this.f50044i.join();
            } catch (InterruptedException e) {
            }
        }
    }
}
