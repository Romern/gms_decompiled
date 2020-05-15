package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: cnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cnq {

    /* renamed from: a */
    private final Queue f7107a = crd.m7392a(0);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized ccr mo4001a(ByteBuffer byteBuffer) {
        ccr ccr;
        ccr = (ccr) this.f7107a.poll();
        if (ccr == null) {
            ccr = new ccr();
        }
        ccr.f6533b = null;
        Arrays.fill(ccr.f6532a, (byte) 0);
        ccr.f6534c = new ccq();
        ccr.f6535d = 0;
        ccr.f6533b = byteBuffer.asReadOnlyBuffer();
        ccr.f6533b.position(0);
        ccr.f6533b.order(ByteOrder.LITTLE_ENDIAN);
        return ccr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo4002a(ccr ccr) {
        ccr.f6533b = null;
        ccr.f6534c = null;
        this.f7107a.offer(ccr);
    }
}
