package p000;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

/* renamed from: cisc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cisx f191317a;

    public cisc(cisx cisx) {
        this.f191317a = cisx;
    }

    public final void run() {
        ReadableByteChannel readableByteChannel = this.f191317a.f191372n;
        if (readableByteChannel != null) {
            try {
                readableByteChannel.close();
            } catch (IOException e) {
                bqye.m113758a(e);
            }
            this.f191317a.f191372n = null;
        }
    }
}
