package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mkj {

    /* renamed from: a */
    public static final lvn f33889a = new lvn("UsbSender");

    /* renamed from: b */
    public final BlockingQueue f33890b;

    /* renamed from: c */
    public final AtomicBoolean f33891c = new AtomicBoolean(true);

    /* renamed from: d */
    public final AtomicReference f33892d = new AtomicReference();

    /* renamed from: e */
    public final bqgj f33893e;

    /* renamed from: f */
    private final mki f33894f = new mki(null, 0, null);

    /* renamed from: g */
    private final mkn f33895g;

    /* renamed from: h */
    private final BlockingQueue f33896h;

    /* renamed from: i */
    private final bqgj f33897i;

    public mkj(mkn mkn, bqgj bqgj) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue((int) ccmq.f179467a.mo6606a().mo76391b());
        bmxy.m108581a(mkn);
        this.f33895g = mkn;
        bmxy.m108581a(arrayBlockingQueue);
        this.f33890b = arrayBlockingQueue;
        this.f33896h = new ArrayBlockingQueue(5);
        bmxy.m108581a(bqgj);
        this.f33897i = bqgj;
        this.f33893e = snp.m35704b(9);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20123a() {
        if (!this.f33891c.getAndSet(false)) {
            f33889a.mo25412b("shutdown() has already been called. Ignoring.", new Object[0]);
            return;
        }
        f33889a.mo25412b("The send thread run loop will terminate.", new Object[0]);
        mo20126b();
        if (!this.f33890b.offer(new mkh(-1, null, mkf.f33879a))) {
            f33889a.mo25418e("Send queue was unexpectedly full during shutdown.", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo20126b() {
        while (true) {
            mkh mkh = (mkh) this.f33890b.poll();
            if (mkh != null) {
                mo20128c(mkh);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo20128c(mkh mkh) {
        this.f33897i.execute(new mke(mkh));
    }

    /* renamed from: d */
    public final boolean mo20129d(mkh mkh) {
        try {
            mki mki = (mki) this.f33896h.take();
            if (mki != this.f33894f) {
                int i = mkh.f33882a;
                ByteBuffer byteBuffer = mki.f33886a;
                int i2 = mki.f33887b;
                IOException iOException = mki.f33888c;
                if (iOException != null) {
                    if (i == 2) {
                        i2 = 0;
                    } else {
                        throw new RuntimeException(iOException);
                    }
                }
                if (i2 == -1) {
                    i2 = 0;
                }
                byteBuffer.limit(i2 + 1028);
                boolean z = i2 >= 1048576;
                if (i != 2) {
                    if (z) {
                        f33889a.mo25418e("Packet payload is too big: %d, expected max %d", Integer.valueOf(i2), 1048576);
                        throw new RuntimeException("Packet payload is too big.");
                    }
                }
                bxvd da = mps.f34215e.mo74144da();
                if (iOException != null) {
                    i2 = 0;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mps mps = (mps) da.f164949b;
                int i3 = 2 | mps.f34217a;
                mps.f34217a = i3;
                mps.f34219c = i2;
                boolean z2 = !z;
                int i4 = 4;
                mps.f34217a = i3 | 4;
                mps.f34220d = z2;
                if (iOException == null) {
                    i4 = mpu.m25496a(mkh.f33882a);
                }
                if (i4 != 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mps mps2 = (mps) da.f164949b;
                    mps2.f34218b = i4 - 1;
                    mps2.f34217a |= 1;
                }
                mps mps3 = (mps) da.mo74062i();
                int i5 = mps3.f164961ai;
                if (i5 == -1) {
                    i5 = bxxm.f165037a.mo74228a(mps3).mo74223b(mps3);
                    mps3.f164961ai = i5;
                }
                int i6 = (1028 - i5) - 4;
                byteBuffer.position(i6);
                byteBuffer.putInt(i5);
                ((mps) da.mo74062i()).mo73644a(bxuk.m123644c(byteBuffer.array(), byteBuffer.position(), i5));
                byteBuffer.position(i6);
                mkn mkn = this.f33895g;
                int position = byteBuffer.position();
                for (int limit = byteBuffer.limit() - byteBuffer.position(); limit > 0; limit = 0) {
                    mkn.mo20113c(byteBuffer.array(), position, limit);
                    position += limit;
                }
                this.f33897i.execute(new mkg(mkh, da));
                mps mps4 = (mps) da.f164949b;
                if (mps4.f34220d) {
                    return false;
                }
                int a = mpu.m25496a(mps4.f34218b);
                if (a == 0) {
                    a = 1;
                }
                sdo.m34970a(a == 3);
                return true;
            }
            throw new RuntimeException("Unexpected exception happened on the reading thread");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (mjp e2) {
            f33889a.mo25418e("Write failed because of ConnectionShutdownException; shutting down.", new Object[0]);
            mo20128c(mkh);
            mo20123a();
            return false;
        } catch (InterruptedException e3) {
            f33889a.mo25417e("Thread interrupted; shutting down.", e3, new Object[0]);
            Thread.currentThread().interrupt();
            mo20128c(mkh);
            mo20123a();
            return false;
        }
    }

    /* renamed from: b */
    public final void mo20127b(mkh mkh) {
        ByteBuffer allocate;
        int i;
        do {
            try {
                allocate = ByteBuffer.allocate(1049604);
                i = 0;
                int read = mkh.f33883b.read(allocate.array(), 1028, 1048576);
                f33889a.mo25412b("Read number of bytes: %d", Integer.valueOf(read));
                e = null;
                i = read;
            } catch (IOException e) {
                e = e;
                f33889a.mo25417e("IOException on stream.", e, new Object[0]);
            } catch (Throwable th) {
                this.f33896h.put(this.f33894f);
                throw th;
            }
            this.f33896h.put(new mki(allocate, i, e));
        } while (i == 1048576);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20124a(int i, InputStream inputStream, mjm mjm, long j) {
        boolean z;
        mkh mkh = new mkh(i, inputStream, mjm);
        if (this.f33891c.get()) {
            if (j > 0) {
                try {
                    z = this.f33890b.offer(mkh, j, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    f33889a.mo25417e("Interrupted while waiting for queue; shutting down to avoid undefined behavior.", e, new Object[0]);
                    mo20123a();
                    mo20128c(mkh);
                    return;
                }
            } else {
                z = this.f33890b.offer(mkh);
            }
            if (!z) {
                f33889a.mo25418e("Queue full; shutting down to avoid undefined behavior.", new Object[0]);
                mo20123a();
                mo20128c(mkh);
            } else if (!this.f33891c.get()) {
                mo20123a();
            }
        } else {
            mo20128c(mkh);
        }
    }

    /* renamed from: a */
    public final void mo20125a(mkh mkh) {
        InputStream inputStream = mkh.f33883b;
        if (inputStream == null) {
            return;
        }
        if (!(inputStream instanceof ByteArrayInputStream) || ((ByteArrayInputStream) inputStream).available() >= 1048576 || this.f33896h.size() >= 5) {
            f33889a.logVerbose("Scheduling asynchronous reading of stream", new Object[0]);
            this.f33893e.execute(new mkd(this, mkh));
            return;
        }
        f33889a.logVerbose("Reading stream synchronously", new Object[0]);
        try {
            mo20127b(mkh);
        } catch (InterruptedException e) {
            f33889a.mo25417e("Reading interrupted: ", e, new Object[0]);
            Thread.currentThread().interrupt();
        }
    }
}
