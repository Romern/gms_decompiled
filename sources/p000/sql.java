package p000;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.ScheduledFuture;

/* renamed from: sql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sql implements Runnable {

    /* renamed from: a */
    final /* synthetic */ sqm f44977a;

    /* renamed from: b */
    private final byte[] f44978b;

    public sql(sqm sqm, byte[] bArr) {
        this.f44977a = sqm;
        this.f44978b = bArr;
    }

    public final void run() {
        FileLock a;
        synchronized (this.f44977a.f44983e) {
            byte[] bArr = this.f44978b;
            int length = bArr.length;
            sqm sqm = this.f44977a;
            if (((long) length) + sqm.f44986h >= sqm.f44980b) {
                try {
                    a = sqm.mo25976a();
                    FileChannel channel = this.f44977a.f44984f.getChannel();
                    if (channel.size() < channel.position()) {
                        channel.position(channel.size());
                    }
                    PrintStream printStream = this.f44977a.f44985g;
                    byte[] bArr2 = this.f44978b;
                    printStream.write(bArr2, 0, bArr2.length);
                    this.f44977a.f44985g.flush();
                    sqm sqm2 = this.f44977a;
                    sqm2.f44986h = 0;
                    sqm2.f44987i++;
                    ScheduledFuture scheduledFuture = sqm2.f44988j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    a.release();
                } catch (IOException e) {
                    Log.w("CachingFileWriter", "Failed to write cache to disk.", e);
                } catch (Throwable th) {
                    a.release();
                    throw th;
                }
            } else {
                sqm.f44985g.write(bArr, 0, length);
                sqm sqm3 = this.f44977a;
                sqm3.f44986h += (long) this.f44978b.length;
                ScheduledFuture scheduledFuture2 = sqm3.f44988j;
                if (scheduledFuture2 != null) {
                    if (!scheduledFuture2.isDone()) {
                    }
                }
                sqm3.f44988j = ((sny) sqm3.f44979a).schedule(sqm3.f44989k, sqm3.f44981c, sqm3.f44982d);
            }
        }
    }
}
