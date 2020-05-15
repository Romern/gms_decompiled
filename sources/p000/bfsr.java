package p000;

import android.location.Location;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bfsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfsr extends bfow {

    /* renamed from: a */
    private final bfpk f115160a;

    public bfsr(bfrc bfrc, Looper looper, asfb asfb) {
        super(bfrc);
        this.f115160a = new bfpk(new bfso(this, looper), asfb);
    }

    /* renamed from: a */
    private final Object m97746a(int i, FutureTask futureTask, long j) {
        try {
            if (this.f115160a.mo62099a(i, futureTask)) {
                return futureTask.get(j, TimeUnit.MILLISECONDS);
            }
            Log.e("SynchronizedLE", "error posting asynchronous call to engine looper");
            return null;
        } catch (InterruptedException | TimeoutException e) {
            Log.e("SynchronizedLE", "asynchronous call timed out or was interrupted");
            return null;
        }
    }

    /* renamed from: b */
    public final void mo62061b() {
        this.f115160a.mo62098a(6, 1, 0, 0, null);
    }

    /* renamed from: a */
    public final Location mo62068a(boolean z) {
        Object obj;
        bfsp bfsp = new bfsp(this, z);
        try {
            if (Thread.currentThread() != this.f115160a.mo63548a().getThread()) {
                obj = m97746a(12, new FutureTask(bfsp), 500);
            } else {
                obj = bfsp.call();
            }
            return (Location) obj;
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    public final void mo62058a() {
        this.f115160a.mo62098a(7, 0, 0, 0, null);
    }

    /* renamed from: a */
    public final void mo62069a(Location location, int i) {
        this.f115160a.mo62098a(9, 3, i, 0, location);
    }

    /* renamed from: a */
    public final void mo62070a(bfps bfps) {
        this.f115160a.mo62098a(10, 4, 0, 0, bfps);
    }

    /* renamed from: a */
    public final void mo62071a(bfrb bfrb) {
        this.f115160a.mo62098a(11, 5, 0, 0, bfrb);
    }

    /* renamed from: a */
    public final void mo62072a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        bfsq bfsq = new bfsq(this, fileDescriptor, printWriter, strArr);
        if (Thread.currentThread() == this.f115160a.mo63548a().getThread()) {
            bfsq.run();
            return;
        }
        try {
            m97746a(13, new FutureTask(bfsq, null), 5000);
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    /* renamed from: a */
    public final void mo62059a(Collection collection, boolean z) {
        this.f115160a.mo62098a(8, 2, z ? 1 : 0, 0, collection);
    }
}
