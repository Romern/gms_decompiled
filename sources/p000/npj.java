package p000;

import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.projection.common.BufferPool;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: npj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class npj extends nst implements okc {

    /* renamed from: h */
    public static final /* synthetic */ int f36308h = 0;

    /* renamed from: i */
    private static final bnsn f36309i = odk.m28481a("CAR.VENDOR");

    /* renamed from: a */
    public final String f36310a;

    /* renamed from: b */
    public final String[] f36311b;

    /* renamed from: c */
    public final int f36312c;

    /* renamed from: d */
    public volatile boolean f36313d = false;

    /* renamed from: e */
    public final CountDownLatch f36314e = new CountDownLatch(1);

    /* renamed from: f */
    public final Object f36315f = new Object();

    /* renamed from: g */
    public final Queue f36316g = new LinkedList();

    /* renamed from: j */
    private final byte[] f36317j;

    /* renamed from: k */
    private final oln f36318k;

    /* renamed from: l */
    private final AtomicBoolean f36319l = new AtomicBoolean(true);

    /* renamed from: m */
    private okd f36320m;

    /* renamed from: n */
    private final Object f36321n = new Object();

    /* renamed from: o */
    private npi f36322o;

    /* renamed from: p */
    private final Object f36323p = new Object();

    /* renamed from: q */
    private ParcelFileDescriptor[] f36324q;

    /* renamed from: r */
    private InputStream f36325r;

    /* renamed from: s */
    private byte[] f36326s;

    /* renamed from: t */
    private int f36327t;

    /* renamed from: u */
    private ParcelFileDescriptor[] f36328u;

    /* renamed from: v */
    private OutputStream f36329v;

    /* renamed from: w */
    private int f36330w = 0;

    public npj(String str, byte[] bArr, String[] strArr, oln oln, int i) {
        this.f36318k = oln;
        this.f36310a = str;
        this.f36317j = bArr;
        this.f36311b = strArr;
        this.f36312c = i;
    }

    /* renamed from: a */
    public final String mo21405a(nsv nsv) {
        mo21419g(nsv);
        return this.f36310a;
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        throw null;
    }

    /* renamed from: b */
    public final void mo21410b() {
        synchronized (this.f36321n) {
            npi npi = this.f36322o;
            if (npi == null) {
                bnsi c = f36309i.mo68388c();
                c.mo68432a("npj", "b", 387, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("removeClient: No registered client");
                return;
            }
            npi.f36307b.f12819a.unlinkToDeath(npi, 0);
            this.f36322o = null;
        }
    }

    /* renamed from: c */
    public final void mo20658c() {
        throw null;
    }

    /* renamed from: d */
    public final void mo21415d() {
        synchronized (this.f36323p) {
            InputStream inputStream = this.f36325r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    bnsi c = f36309i.mo68388c();
                    c.mo68432a("npj", "d", 405, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Failed to close input stream");
                }
                this.f36325r = null;
            }
            this.f36324q = null;
        }
        synchronized (this.f36315f) {
            OutputStream outputStream = this.f36329v;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e2) {
                    bnsi c2 = f36309i.mo68388c();
                    c2.mo68432a("npj", "d", 418, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("Failed to close output stream");
                }
                this.f36329v = null;
            }
            this.f36328u = null;
        }
    }

    /* renamed from: e */
    public final ParcelFileDescriptor mo21417e(nsv nsv) {
        ParcelFileDescriptor parcelFileDescriptor;
        mo21419g(nsv);
        synchronized (this.f36323p) {
            if (this.f36324q == null) {
                try {
                    this.f36324q = ParcelFileDescriptor.createPipe();
                    this.f36325r = new ParcelFileDescriptor.AutoCloseInputStream(this.f36324q[0]);
                } catch (IOException e) {
                    throw new IllegalStateException("cannot create pipe for input from client", e);
                }
            }
            parcelFileDescriptor = this.f36324q[1];
        }
        return parcelFileDescriptor;
    }

    /* renamed from: f */
    public final ParcelFileDescriptor mo21418f(nsv nsv) {
        ParcelFileDescriptor parcelFileDescriptor;
        mo21419g(nsv);
        synchronized (this.f36315f) {
            if (this.f36328u == null) {
                try {
                    this.f36328u = ParcelFileDescriptor.createPipe();
                    this.f36329v = new ParcelFileDescriptor.AutoCloseOutputStream(this.f36328u[1]);
                } catch (IOException e) {
                    throw new IllegalStateException("cannot create pipe for output to client", e);
                }
            }
            parcelFileDescriptor = this.f36328u[0];
        }
        return parcelFileDescriptor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo21419g(nsv nsv) {
        this.f36318k.mo22279c();
        if (!this.f36313d) {
            throw new IllegalStateException("CarNotConnected");
        } else if (this.f36320m != null) {
            synchronized (this.f36321n) {
                npi npi = this.f36322o;
                if (npi == null) {
                    throw new IllegalStateException("No client has been registered");
                } else if (npi.f36307b.f12819a != nsv.f12819a) {
                    throw new IllegalStateException("This vendor extension service is already in use.");
                }
            }
        } else {
            throw new RuntimeException("VendorExtensionEndpoint not set.");
        }
    }

    /* renamed from: c */
    public final void mo21413c(nsv nsv) {
        mo21419g(nsv);
        mo21410b();
        mo21415d();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ojh mo20646a(ojm ojm) {
        return new okd(this, ojm);
    }

    /* renamed from: c */
    public final void mo21414c(nsv nsv, int i) {
        mo21419g(nsv);
        synchronized (this.f36315f) {
            if (this.f36329v == null) {
                throw new IllegalStateException("No output stream has been created");
            } else if (this.f36328u == null) {
                throw new IllegalStateException("No fds for output have been created");
            }
        }
        synchronized (this.f36315f) {
            byte[] bArr = (byte[]) this.f36316g.peek();
            if (bArr != null) {
                int i2 = this.f36330w;
                int i3 = i2 + i;
                int length = bArr.length;
                if (i3 <= length) {
                    try {
                        this.f36329v.write(bArr, i2, i);
                        int i4 = this.f36330w + i;
                        this.f36330w = i4;
                        if (i4 == length) {
                            this.f36316g.poll();
                            this.f36330w = 0;
                            byte[] bArr2 = (byte[]) this.f36316g.peek();
                            if (bArr2 != null && !mo21409a(bArr2.length)) {
                                this.f36316g.clear();
                            }
                        }
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                throw new IllegalStateException("No data");
            }
        }
    }

    /* renamed from: a */
    public final void mo21406a() {
        try {
            this.f36314e.await();
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: b */
    public final void mo21411b(nsv nsv, int i) {
        mo21419g(nsv);
        synchronized (this.f36323p) {
            if (this.f36325r == null) {
                throw new IllegalStateException("No input stream has been created");
            } else if (this.f36324q == null) {
                throw new IllegalStateException("No fds for input have been created");
            }
        }
        synchronized (this.f36323p) {
            if (this.f36327t + i <= this.f36326s.length) {
                while (i > 0) {
                    try {
                        int read = this.f36325r.read(this.f36326s, this.f36327t, i);
                        if (read != -1) {
                            i -= read;
                            this.f36327t += read;
                        } else {
                            throw new IllegalStateException("Unexpected EOF");
                        }
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
                int i2 = this.f36327t;
                byte[] bArr = this.f36326s;
                int length = bArr.length;
                if (i2 == length) {
                    okd okd = this.f36320m;
                    ByteBuffer buffer = BufferPool.getBuffer(length);
                    buffer.put(bArr, 0, length);
                    okd.f37755p.mo22113a(buffer, new ogv(true, false, 0));
                    this.f36326s = null;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    /* renamed from: a */
    public final void mo21407a(nsv nsv, int i) {
        mo21419g(nsv);
        synchronized (this.f36323p) {
            this.f36326s = new byte[i];
            this.f36327t = 0;
        }
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        this.f36313d = true;
        this.f36320m = (okd) ojh;
    }

    /* renamed from: a */
    public final void mo21408a(ojq ojq) {
        bmxy.m108601b(!Looper.getMainLooper().equals(Looper.myLooper()), "startIfNeeded called on main thread");
        if (this.f36319l.getAndSet(false)) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            nuu.m27792a(new npg(this, ojq, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
            }
        }
    }

    /* renamed from: d */
    public final byte[] mo21416d(nsv nsv) {
        mo21419g(nsv);
        return this.f36317j;
    }

    /* renamed from: a */
    public final boolean mo21409a(int i) {
        synchronized (this.f36321n) {
            npi npi = this.f36322o;
            if (npi == null) {
                return false;
            }
            try {
                nsv nsv = npi.f36307b;
                Parcel bj = nsv.mo8529bj();
                bj.writeInt(i);
                nsv.mo8530c(1, bj);
                return true;
            } catch (RemoteException e) {
                bnsi c = f36309i.mo68388c();
                c.mo68432a("npj", "a", 436, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68420a("Error in notifyDataToClient for vendor extension %s", this.f36310a);
                return false;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo21412b(nsv nsv) {
        synchronized (this.f36321n) {
            if (this.f36322o != null) {
                return false;
            }
            try {
                this.f36322o = new npi(this, nsv);
                return true;
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
