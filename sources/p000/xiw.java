package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: xiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xiw {

    /* renamed from: a */
    private final Map f52387a = new HashMap();

    /* renamed from: a */
    public final void mo29819a(xiu xiu, byte[] bArr) {
        BlockingQueue blockingQueue;
        synchronized (this.f52387a) {
            if (!this.f52387a.containsKey(xiu)) {
                blockingQueue = new LinkedBlockingQueue();
                this.f52387a.put(xiu, blockingQueue);
            } else {
                blockingQueue = (BlockingQueue) this.f52387a.get(xiu);
            }
            blockingQueue.add(bArr);
        }
    }

    /* renamed from: a */
    public final byte[] mo29820a(xiu xiu, long j) {
        BlockingQueue blockingQueue;
        if (j >= 0) {
            synchronized (this.f52387a) {
                if (this.f52387a.containsKey(xiu)) {
                    blockingQueue = (BlockingQueue) this.f52387a.get(xiu);
                } else {
                    blockingQueue = new LinkedBlockingQueue();
                }
            }
            if (j != 0) {
                return (byte[]) blockingQueue.poll(j, TimeUnit.MILLISECONDS);
            }
            return (byte[]) blockingQueue.poll();
        }
        throw new xij("ReceivedPayload#get is called with negative timeout");
    }
}
