package p000;

import com.google.android.cast.JGCastService;

/* renamed from: bngg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bngg {
    /* renamed from: a */
    static int m109304a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    static int m109306b(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        return (max <= ((int) ((double) highestOneBit)) || (highestOneBit = highestOneBit + highestOneBit) > 0) ? highestOneBit : JGCastService.FLAG_PRIVATE_DISPLAY;
    }

    /* renamed from: a */
    static int m109305a(Object obj) {
        return m109304a(obj != null ? obj.hashCode() : 0);
    }
}
