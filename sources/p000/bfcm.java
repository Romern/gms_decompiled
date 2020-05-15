package p000;

import java.nio.ByteBuffer;

/* renamed from: bfcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfcm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f113400a;

    /* renamed from: b */
    final /* synthetic */ bfcn f113401b;

    public bfcm(bfcn bfcn, ByteBuffer byteBuffer) {
        this.f113401b = bfcn;
        this.f113400a = byteBuffer;
    }

    public final void run() {
        this.f113401b.f113406e = this.f113400a.getLong();
        int i = 0;
        while (true) {
            int[] iArr = this.f113401b.f113407f;
            if (i < iArr.length) {
                iArr[i] = this.f113400a.getInt();
                i++;
            } else {
                return;
            }
        }
    }
}
