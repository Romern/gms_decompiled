package p000;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: njl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class njl extends nqz implements IBinder.DeathRecipient {

    /* renamed from: f */
    private static final bnsn f35828f = odk.m28481a("CAR.MIC");

    /* renamed from: a */
    public final njk f35829a;

    /* renamed from: b */
    public final AtomicInteger f35830b = new AtomicInteger(0);

    /* renamed from: c */
    final AtomicInteger f35831c = new AtomicInteger(0);

    /* renamed from: d */
    OutputStream f35832d;

    /* renamed from: e */
    nrb f35833e;

    /* renamed from: g */
    private final njp f35834g;

    /* renamed from: h */
    private final ntq f35835h;

    /* renamed from: i */
    private final Context f35836i;

    public njl(njk njk, njp njp, ntq ntq, Context context) {
        this.f35829a = njk;
        this.f35834g = njp;
        this.f35835h = ntq;
        this.f35836i = context;
    }

    /* renamed from: c */
    private final void m26570c() {
        mo20903b();
        mo20899a();
        m26571d();
        this.f35834g.mo20915a(this);
    }

    /* renamed from: d */
    private final void m26571d() {
        nrb nrb = this.f35833e;
        if (nrb != null) {
            try {
                nrb.f12819a.unlinkToDeath(this, 0);
            } catch (NoSuchElementException e) {
            }
            this.f35833e = null;
        }
    }

    /* renamed from: f */
    private final void m26572f(nrb nrb) {
        if (nrb != null) {
            nrb nrb2 = this.f35833e;
            if (nrb2 == null) {
                throw new IllegalStateException("token has not been set");
            } else if (nrb2.f12819a != nrb.f12819a) {
                throw new SecurityException("invalid client token");
            }
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    /* renamed from: a */
    public final void mo20899a() {
        int size;
        if (this.f35830b.getAndSet(0) != 0) {
            try {
                OutputStream outputStream = this.f35832d;
                if (outputStream != null) {
                    outputStream.close();
                }
                this.f35832d = null;
            } catch (IOException e) {
            }
            ntq ntq = this.f35835h;
            ntq.mo21574d();
            synchronized (ntq.f36456d) {
                ntq.f36456d.remove(this);
                size = ntq.f36456d.size();
            }
            if (size == 0) {
                ntq.f36458f = false;
                ntq.mo21573b();
                oix oix = ntq.f36455c;
                if (!oix.f37731c) {
                    bnsi c = oix.f37730b.mo68388c();
                    c.mo68432a("oix", "c", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Microphone already closed");
                } else {
                    bxvd da = bisg.f121549e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bisg bisg = (bisg) da.f164949b;
                    bisg.f121551a |= 1;
                    bisg.f121552b = false;
                    oix.mo22206a(32773, (bisg) da.mo74062i());
                    oix.f37731c = false;
                    bnsi d = oix.f37730b.mo68390d();
                    d.mo68432a("oix", "c", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68409a("Sent microphone close request, frames received %d", oix.f37732d);
                }
                if (ntq.f36460h) {
                    oaq oaq = ntq.f36461i;
                    if (oaq != null) {
                        oaq.mo21907a();
                    }
                    ntq.f36461i = null;
                }
            }
            mo20903b();
        }
    }

    /* renamed from: b */
    public final synchronized void mo20903b() {
        notifyAll();
    }

    public final void binderDied() {
        m26570c();
    }

    /* renamed from: e */
    public final void mo20909e(nrb nrb) {
        this.f35834g.mo20926e();
        if (this.f35833e == null) {
            int c = npe.m27165c(this.f35836i, "android.permission.RECORD_AUDIO");
            if (c != -2) {
                if (c != -1) {
                    try {
                        nrb.f12819a.linkToDeath(this, 0);
                        this.f35833e = nrb;
                    } catch (RemoteException e) {
                        this.f35834g.mo20915a(this);
                    }
                } else {
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    StringBuilder sb = new StringBuilder(95);
                    sb.append("client does not have permission:android.permission.RECORD_AUDIO pid:");
                    sb.append(callingPid);
                    sb.append(" uid:");
                    sb.append(callingUid);
                    throw new SecurityException(sb.toString());
                }
            } else if (!ccsh.f179839a.mo6606a().mo76715e()) {
                bnsi c2 = f35828f.mo68388c();
                c2.mo68432a("njl", "e", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68420a("PERMISSION_DENIED_APP_OP in client for permission:%s", "android.permission.RECORD_AUDIO");
            } else {
                int callingPid2 = Binder.getCallingPid();
                int callingUid2 = Binder.getCallingUid();
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("client does not have app op permission:android.permission.RECORD_AUDIO pid:");
                sb2.append(callingPid2);
                sb2.append(" uid:");
                sb2.append(callingUid2);
                throw new SecurityException(sb2.toString());
            }
        } else {
            throw new IllegalStateException("callback already registered");
        }
    }

    /* renamed from: b */
    public final void mo20904b(nrb nrb) {
        m26572f(nrb);
        mo20899a();
    }

    /* renamed from: d */
    public final void mo20908d(nrb nrb) {
        m26572f(nrb);
        m26570c();
    }

    /* renamed from: b */
    public final boolean mo20905b(nrb nrb, int i) {
        m26572f(nrb);
        synchronized (this) {
            while (this.f35831c.get() < i && this.f35830b.get() == 1) {
                try {
                    wait();
                    this.f35834g.mo20926e();
                } catch (InterruptedException e) {
                    return false;
                }
            }
        }
        return this.f35831c.get() >= i && this.f35830b.get() == 1;
    }

    /* renamed from: c */
    public final synchronized ParcelFileDescriptor mo20907c(nrb nrb) {
        ParcelFileDescriptor parcelFileDescriptor;
        this.f35834g.mo20926e();
        m26572f(nrb);
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            this.f35832d = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            this.f35831c.set(0);
            parcelFileDescriptor = createPipe[0];
        } catch (IOException e) {
            parcelFileDescriptor = null;
        }
        return parcelFileDescriptor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo20900a(ByteBuffer byteBuffer) {
        try {
            if (this.f35830b.get() == 1) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit() - position;
                if (this.f35831c.get() + limit > 16384) {
                    bnsi c = f35828f.mo68388c();
                    c.mo68432a("njl", "a", 276, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("client q limit exceeded. throw away data");
                    return;
                }
                OutputStream outputStream = this.f35832d;
                if (outputStream != null) {
                    outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + position, limit);
                }
                this.f35831c.addAndGet(limit);
                mo20903b();
            }
        } catch (IOException e) {
            bnsi b = f35828f.mo68387b();
            b.mo68432a("njl", "a", 287, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Error writing audio to OutputStream");
        }
    }

    /* renamed from: a */
    public final void mo20901a(nrb nrb) {
        int size;
        this.f35834g.mo20926e();
        m26572f(nrb);
        if (this.f35832d == null) {
            throw new IllegalStateException("getInputFileDescriptor not called");
        } else if (this.f35830b.compareAndSet(0, 1)) {
            ntq ntq = this.f35835h;
            ntq.mo21574d();
            synchronized (ntq.f36456d) {
                ntq.f36456d.add(this);
                size = ntq.f36456d.size();
            }
            if (size == 1) {
                ntq.f36458f = true;
                ntq.f36457e.set(0);
                oix oix = ntq.f36455c;
                if (oix.f37731c) {
                    bnsi c = oix.f37730b.mo68388c();
                    c.mo68432a("oix", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Microphone already open");
                } else {
                    oix.f37732d = 0;
                    bxvd da = bisg.f121549e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bisg bisg = (bisg) da.f164949b;
                    int i = bisg.f121551a | 1;
                    bisg.f121551a = i;
                    bisg.f121552b = true;
                    int i2 = i | 2;
                    bisg.f121551a = i2;
                    bisg.f121553c = false;
                    bisg.f121551a = i2 | 4;
                    bisg.f121554d = false;
                    bisg.m102784a(bisg);
                    oix.mo22206a(32773, (bisg) da.mo74062i());
                    oix.f37731c = true;
                    bnsi d = oix.f37730b.mo68390d();
                    d.mo68432a("oix", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68405a("Sent microphone open request");
                }
                ntq.mo21570a();
                if (ntq.f36460h) {
                    ntq.f36461i = new oaq(ntq.f36459g, 4, 0);
                }
            }
        } else {
            throw new IllegalStateException("already started");
        }
    }

    /* renamed from: a */
    public final void mo20902a(nrb nrb, int i) {
        m26572f(nrb);
        this.f35831c.addAndGet(-i);
    }
}
