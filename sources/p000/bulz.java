package p000;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: bulz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bulz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f154214a;

    /* renamed from: b */
    final /* synthetic */ buma f154215b;

    public bulz(buma buma, ByteBuffer byteBuffer) {
        this.f154215b = buma;
        this.f154214a = byteBuffer;
    }

    public final void run() {
        try {
            this.f154215b.mo61836b(this.f154214a.array());
        } catch (IOException e) {
        }
    }
}
