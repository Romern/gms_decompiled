package p000;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: bfcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfcl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f113398a;

    /* renamed from: b */
    final /* synthetic */ bfcn f113399b;

    public bfcl(bfcn bfcn, ByteBuffer byteBuffer) {
        this.f113399b = bfcn;
        this.f113398a = byteBuffer;
    }

    public final void run() {
        try {
            this.f113399b.mo61836b(this.f113398a.array());
        } catch (IOException e) {
        }
    }
}
