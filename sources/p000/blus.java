package p000;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: blus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blus {

    /* renamed from: a */
    private final Queue f127830a = new LinkedList();

    /* renamed from: b */
    private int f127831b = 0;

    /* renamed from: a */
    public final synchronized void mo66723a() {
        this.f127830a.clear();
        this.f127831b = 0;
    }

    /* renamed from: a */
    public final synchronized byte[] mo66724a(bluq bluq) {
        if (this.f127830a.isEmpty()) {
            if (!bluq.mo66716a()) {
                throw new blut("first packet does not have first packet bit");
            }
        }
        if (!this.f127830a.isEmpty()) {
            if (bluq.mo66716a()) {
                throw new blut("continued packet should not have first packet bit");
            }
        }
        ByteBuffer duplicate = bluq.f127828b.duplicate();
        duplicate.rewind();
        this.f127830a.add(duplicate);
        int capacity = this.f127831b + duplicate.capacity();
        this.f127831b = capacity;
        if ((bluq.f127827a[0] & 4) == 0) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(capacity);
        while (!this.f127830a.isEmpty()) {
            allocate.put((ByteBuffer) this.f127830a.poll());
        }
        this.f127831b = 0;
        return allocate.array();
    }
}
