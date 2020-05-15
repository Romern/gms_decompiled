package p000;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: bulv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bulv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f154193a;

    /* renamed from: b */
    final /* synthetic */ bulw f154194b;

    public bulv(bulw bulw, ByteBuffer byteBuffer) {
        this.f154194b = bulw;
        this.f154193a = byteBuffer;
    }

    public final void run() {
        try {
            this.f154194b.mo61836b(this.f154193a.array());
        } catch (IOException e) {
        }
    }
}
