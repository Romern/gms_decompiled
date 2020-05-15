package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ohp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ohp implements ohi {

    /* renamed from: a */
    public static final bnsn f37670a = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: b */
    final okj f37671b;

    /* renamed from: c */
    public final AtomicBoolean f37672c = new AtomicBoolean();

    /* renamed from: d */
    public final Semaphore f37673d = new Semaphore(0);

    /* renamed from: e */
    public oka f37674e;

    /* renamed from: f */
    public ofo f37675f;

    /* renamed from: g */
    public final ogu f37676g;

    /* renamed from: h */
    final boolean f37677h;

    /* renamed from: i */
    final int f37678i;

    /* renamed from: j */
    public final ogo f37679j;

    /* renamed from: k */
    private final ohn f37680k;

    /* renamed from: l */
    private final oho f37681l;

    /* renamed from: m */
    private final oie f37682m;

    /* renamed from: n */
    private final int f37683n;

    public ohp(ohh ohh) {
        int i;
        ogu ogu;
        this.f37679j = ohh.f37640h;
        this.f37674e = ohh.f37637e;
        this.f37675f = ohh.f37634b;
        Bundle bundle = ohh.f37633a;
        this.f37677h = bundle == null ? ((ofg) ohh.f37638f).f37499c : bundle.getBoolean("qos_enabled");
        Bundle bundle2 = ohh.f37633a;
        if (bundle2 == null) {
            i = ((ofg) ohh.f37638f).f37497a;
        } else {
            i = bundle2.getInt("max_fragment_size");
        }
        this.f37678i = i;
        oie oie = null;
        if (this.f37677h) {
            ogu = new ogu(i);
        } else {
            ogu = null;
        }
        this.f37676g = ogu;
        Bundle bundle3 = ohh.f37633a;
        if (bundle3 == null) {
            ohm ohm = new ohm(ohh.f37635c, true);
            ohm.start();
            this.f37682m = new oid(ohm);
            this.f37683n = 1;
            int i2 = ((ofg) ohh.f37638f).f37498b;
            if (i2 > 0) {
                this.f37681l = new oho(this, ohh.f37636d, i2);
            } else {
                this.f37681l = new oho(this, ohh.f37636d);
            }
            this.f37671b = m28758a(this.f37681l, this.f37679j, new Bundle());
            this.f37680k = new ohn(this, ohh.f37639g);
            this.f37672c.set(false);
            return;
        }
        this.f37680k = new ohn(this, bundle3, ohh.f37639g);
        oho oho = new oho(this, ohh.f37633a);
        this.f37681l = oho;
        this.f37671b = m28758a(oho, this.f37679j, ohh.f37633a);
        this.f37672c.set(false);
        IBinder binder = ohh.f37633a.getBinder("reader");
        if (binder != null) {
            IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.car.senderprotocol.IReader");
            if (queryLocalInterface instanceof oie) {
                oie = (oie) queryLocalInterface;
            } else {
                oie = new oic(binder);
            }
        }
        this.f37682m = oie;
        this.f37683n = ohh.f37633a.getInt("reader_version", 0);
        mo22158a(this.f37675f);
    }

    /* renamed from: a */
    private final okj m28758a(oho oho, ogo ogo, Bundle bundle) {
        bnsi d = f37670a.mo68390d();
        d.mo68432a("ohp", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Creating thread writer. QosEnabled=%b", Boolean.valueOf(this.f37677h));
        if (this.f37677h) {
            return new ojg(oho, ogo, bundle);
        }
        return new ohf(oho, ogo, bundle);
    }

    /* renamed from: e */
    public static ohl m28759e() {
        return new ohl();
    }

    /* renamed from: g */
    private final void m28760g() {
        if (this.f37672c.compareAndSet(false, true)) {
            try {
                if (!this.f37682m.mo22178a(ojq.m28926a(this.f37680k))) {
                    this.f37679j.mo22122a(bpdo.READER_INIT_FAIL);
                }
            } catch (RemoteException e) {
                bnsi b = f37670a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("ohp", "g", (int) ErrorInfo.TYPE_FSC_OTHER_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Impossible");
            }
        }
    }

    /* renamed from: b */
    public final void mo22161b() {
        okj okj = this.f37671b;
        synchronized (okj.f37857e) {
            if (!okj.f37856d) {
                okj.f37856d = true;
                okj.start();
            }
        }
        if (this.f37672c.compareAndSet(false, true)) {
            try {
                if (!this.f37682m.mo22178a(ojq.m28926a(this.f37680k))) {
                    this.f37679j.mo22122a(bpdo.READER_INIT_FAIL);
                }
            } catch (RemoteException e) {
                bnsi b = f37670a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("ohp", "g", (int) ErrorInfo.TYPE_FSC_OTHER_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Impossible");
            }
        }
    }

    /* renamed from: c */
    public final void mo22162c() {
        Thread thread = null;
        if (this.f37672c.compareAndSet(true, false)) {
            try {
                thread = (Thread) oja.m28891a(this.f37682m.mo22179c());
            } catch (RemoteException e) {
                bnsi b = f37670a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("ohp", "f", 426, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Impossible");
            }
        }
        if (thread != null) {
            try {
                thread.join(400);
            } catch (InterruptedException e2) {
            }
            if (thread.isAlive()) {
                bnsi c = f37670a.mo68388c();
                c.mo68432a("ohp", "f", 436, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("reader thread stuck? Trying SIGQUIT.");
                Process.sendSignal(Process.myPid(), 3);
                Process.sendSignal(Process.myPid(), 3);
                try {
                    thread.join(400);
                } catch (InterruptedException e3) {
                }
                if (thread.isAlive()) {
                    ogs ogs = this.f37679j.f37575a;
                    bnsn bnsn = ogs.f37577a;
                    ogs.f37592p.mo21296aa();
                }
            }
        }
        this.f37671b.mo22247a();
    }

    /* renamed from: d */
    public final void mo22163d() {
        this.f37671b.quitSafely();
        bqhi.m112840a(this.f37671b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo22173f() {
        Thread thread = null;
        if (this.f37672c.compareAndSet(true, false)) {
            try {
                thread = (Thread) oja.m28891a(this.f37682m.mo22179c());
            } catch (RemoteException e) {
                bnsi b = f37670a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("ohp", "f", 426, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Impossible");
            }
        }
        if (thread != null) {
            try {
                thread.join(400);
            } catch (InterruptedException e2) {
            }
            if (thread.isAlive()) {
                bnsi c = f37670a.mo68388c();
                c.mo68432a("ohp", "f", 436, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("reader thread stuck? Trying SIGQUIT.");
                Process.sendSignal(Process.myPid(), 3);
                Process.sendSignal(Process.myPid(), 3);
                try {
                    thread.join(400);
                } catch (InterruptedException e3) {
                }
                if (thread.isAlive()) {
                    ogs ogs = this.f37679j.f37575a;
                    bnsn bnsn = ogs.f37577a;
                    ogs.f37592p.mo21296aa();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo22155a() {
        boolean z;
        if (this.f37672c.get()) {
            try {
                this.f37682m.mo22176a();
            } catch (RemoteException e) {
                bnsi b = f37670a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("ohp", "a", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Impossible");
            }
        } else {
            bnsi c = f37670a.mo68388c();
            c.mo68432a("ohp", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Reader already stopped, so not stopping it again.");
        }
        okj okj = this.f37671b;
        synchronized (okj.f37857e) {
            z = okj.f37856d;
        }
        if (!z) {
            bnsi c2 = f37670a.mo68388c();
            c2.mo68432a("ohp", "a", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Writer already stopped, so it probably won't be stopped again.");
        }
        this.f37671b.mo22247a();
        bqhi.m112840a(this.f37671b);
    }

    /* renamed from: a */
    public final void mo22156a(int i, ByteBuffer byteBuffer, boolean z, ogv ogv) {
        bngx bngx;
        int i2;
        ogv ogv2 = ogv;
        boolean z2 = !z;
        oho oho = this.f37681l;
        if (!z2 && byteBuffer.position() > oho.f37667c.f37678i - 4) {
            throw new IllegalArgumentException("Message is too long to send as one fragment");
        }
        ChannelMessage channelMessage = new ChannelMessage(i, byteBuffer, byteBuffer.position(), z2, z, ogv2.f37605b, ogv2.f37604a, ogv2.f37606c, 0);
        ogu ogu = oho.f37667c.f37676g;
        if (ogu == null || !ogu.mo22137a(channelMessage)) {
            oho.f37667c.f37671b.mo22153a(channelMessage);
        } else {
            ohp ohp = oho.f37667c;
            okj okj = ohp.f37671b;
            ogu ogu2 = ohp.f37676g;
            if (!ogu2.mo22137a(channelMessage)) {
                bngx = bngx.m109356a(channelMessage);
            } else {
                bngs j = bngx.m109377j();
                int i3 = 0;
                while (true) {
                    int i4 = channelMessage.f29511d;
                    if (i3 >= i4) {
                        break;
                    }
                    if (i3 == 0) {
                        i2 = 8;
                    } else {
                        i2 = 4;
                    }
                    int min = Math.min(i4 - i3, ogu2.f37603a - i2);
                    j.mo67668c(new ChannelMessage(channelMessage.f29509b, channelMessage.f29510c, channelMessage.f29511d, channelMessage.f29512e, channelMessage.f29513f, channelMessage.f29514g, channelMessage.f29515h, channelMessage.f29516i, i3));
                    i3 += min;
                }
                bngx = j.mo67664a();
            }
            okj.mo22203a(bngx);
        }
        Thread.yield();
    }

    /* renamed from: a */
    public final void mo22157a(Bundle bundle) {
        if (this.f37674e != null) {
            bundle.putBinder("reader", (IBinder) this.f37682m);
            bundle.putBoolean("qos_enabled", this.f37677h);
            bundle.putInt("reader_version", this.f37683n);
            bundle.putInt("max_fragment_size", this.f37678i);
            ohn ohn = this.f37680k;
            bundle.putBinder("receiver_buffers", (IBinder) ojq.m28926a(new ByteBuffer[][]{ohn.f37652a, new ByteBuffer[]{ohn.f37653b}, new ByteBuffer[]{ohn.f37654c}}));
            bundle.putIntArray("receiver_state", new int[]{ohn.f37655d, ohn.f37656e, ohn.f37657f, ohn.f37658g, ohn.f37659h, ohn.f37660i});
            oho oho = this.f37681l;
            bundle.putBinder("output_stream", (IBinder) ojq.m28926a(oho.f37666b));
            bundle.putBoolean("use_buffered_output_stream", oho.f37665a);
            this.f37671b.mo22152a(bundle);
            return;
        }
        throw new IllegalStateException("Can't bundle framer");
    }

    /* renamed from: a */
    public final void mo22158a(ofo ofo) {
        ohx ohx;
        this.f37675f = ofo;
        try {
            if (this.f37683n > 0) {
                oie oie = this.f37682m;
                if (ofo != null) {
                    ohx = new ohx(ofo);
                } else {
                    ohx = null;
                }
                oie.mo22177a(ohx);
            }
        } catch (RemoteException e) {
            bnsi b = f37670a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("ohp", "a", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Impossible");
        }
    }

    /* renamed from: a */
    public final void mo22159a(oga oga) {
        this.f37671b.mo22204a(oga);
    }

    /* renamed from: a */
    public final void mo22160a(oka oka) {
        this.f37674e = oka;
        oka.f37837i[0] = ByteBuffer.allocateDirect(oka.f37840l + 8);
        this.f37673d.release();
    }
}
