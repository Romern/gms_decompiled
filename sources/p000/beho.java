package p000;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* renamed from: beho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beho implements beez {

    /* renamed from: a */
    public boolean f111568a;

    /* renamed from: b */
    private final boolean f111569b;

    public beho(boolean z) {
        this.f111569b = z;
    }

    /* renamed from: a */
    public static beho m95054a() {
        return new beho(false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        begq begq;
        Closeable closeable;
        begp begp;
        begv a;
        Uri build = beey.f111471e.buildUpon().path(String.valueOf(beey.f111472f.getPath()).concat(".lock")).fragment("").build();
        if (this.f111568a) {
            begs b = beey.f111468b.mo36263b();
            if (b.mo60705a()) {
                Semaphore a2 = b.mo60704a(build.toString());
                if (!a2.tryAcquire()) {
                    a2 = null;
                }
                begr begr = new begr(a2);
                try {
                    if (begr.f111548a != null) {
                        begq = new begq(begr.mo60702a());
                        begr.close();
                    } else {
                        begr.close();
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
            begq = null;
        } else {
            begs b2 = beey.f111468b.mo36263b();
            if (b2.mo60705a()) {
                Semaphore a3 = b2.mo60704a(build.toString());
                try {
                    a3.acquire();
                    begr begr2 = new begr(a3);
                    try {
                        begq = new begq(begr2.mo60702a());
                        begr2.close();
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                } catch (InterruptedException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb.append("semaphore not acquired: ");
                    sb.append(valueOf);
                    throw new InterruptedIOException(sb.toString());
                }
            } else {
                throw new begy("Couldn't acquire lock");
            }
        }
        begv a4 = begv.m95030a(begq);
        try {
            if (a4.f111550a != null) {
                if (this.f111569b) {
                    closeable = beey.f111468b.mo36264b(build);
                } else {
                    closeable = beey.f111468b.mo36265c(build);
                }
                begv a5 = begv.m95030a(closeable);
                try {
                    Closeable closeable2 = a5.f111550a;
                    if (closeable2 instanceof begd) {
                        FileChannel b3 = ((begd) closeable2).mo36255b();
                        if (!this.f111568a) {
                            beey.f111468b.mo36263b();
                            begp = new begp(b3.lock(0, Long.MAX_VALUE, this.f111569b));
                        } else {
                            beey.f111468b.mo36263b();
                            try {
                                FileLock tryLock = b3.tryLock(0, Long.MAX_VALUE, this.f111569b);
                                begp = tryLock != null ? new begp(tryLock) : null;
                            } catch (IOException e2) {
                                begp = null;
                            }
                        }
                        a = begv.m95030a(begp);
                        if (a.f111550a != null) {
                            behn behn = new behn(a4.mo60707a(), a5.mo60707a(), a.mo60707a());
                            a.close();
                            a5.close();
                            a4.close();
                            return behn;
                        }
                        a.close();
                        a5.close();
                    } else {
                        throw new IOException("Lock stream not convertible to FileChannel");
                    }
                } catch (Throwable th3) {
                    a5.close();
                    throw th3;
                }
            }
            a4.close();
            return null;
        } catch (Throwable th4) {
            try {
                a4.close();
            } catch (Throwable th5) {
                bqye.m113761a(th4, th5);
            }
            throw th4;
        }
        throw th;
        throw th;
        throw th;
    }
}
