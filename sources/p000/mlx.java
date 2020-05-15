package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.concurrent.Future;

/* renamed from: mlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mlx extends mjk implements mlh {

    /* renamed from: d */
    public static final lvn f33978d = new lvn("WifiTransport");

    /* renamed from: e */
    public final mlq f33979e;

    /* renamed from: f */
    public final bmzi f33980f = bmzn.m108681a(mls.f33972a);

    /* renamed from: g */
    public Future f33981g;

    /* renamed from: h */
    private final bqgj f33982h;

    public mlx(mjn mjn, bqgj bqgj, bqgj bqgj2, met met, mlr mlr) {
        super(mjn, bqgj, met);
        this.f33979e = mlq.m25294a(this, mlr.f33969a, mlr.f33970b, mlr.f33971c);
        this.f33982h = bqgj2;
    }

    /* renamed from: f */
    private final synchronized void m25306f() {
        Future future = this.f33981g;
        if (future != null) {
            if (!future.isDone()) {
                f33978d.mo25412b("Already trying to connect.", new Object[0]);
                return;
            }
        }
        this.f33981g = this.f33982h.mo25812a(new mlu(this));
    }

    /* renamed from: a */
    public final void mo20102a(InputStream inputStream, mjm mjm) {
        f33978d.mo25414c("sendStream", new Object[0]);
        try {
            SequenceInputStream sequenceInputStream = new SequenceInputStream(new ByteArrayInputStream(new byte[]{(byte) inputStream.read()}), inputStream);
            mlq mlq = this.f33979e;
            mlq.f33956a.mo25412b("sendStream", new Object[0]);
            sdo.checkIfNull(sequenceInputStream, "Cannot create Payload.Stream from null InputStream.");
            ahiq a = ahiq.m55838a(new ahip(null, sequenceInputStream), ahiq.m55836a());
            mlq.f33959d.put(a.f67251a, mjm);
            mlq.mo20153a(a);
        } catch (IOException e) {
            f33978d.mo25418e("IOException from sendStream. Sending stream error packet.", new Object[0]);
            bxvd da = mpm.f34178i.mo74144da();
            mpl mpl = mpl.ERROR;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mpm mpm = (mpm) da.f164949b;
            mpm.f34181b = mpl.f34177s;
            mpm.f34180a |= 1;
            bxvd da2 = mpn.f34188e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mpn mpn = (mpn) da2.f164949b;
            mpn.f34190a |= 1;
            mpn.f34191b = 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mpm mpm2 = (mpm) da.f164949b;
            mpn mpn2 = (mpn) da2.mo74062i();
            mpn2.getClass();
            mpm2.f34184e = mpn2;
            mpm2.f34180a |= 8;
            mo20104c(((mpm) da.mo74062i()).serializeToBytes());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo20098b() {
        f33978d.mo25414c("doShutdown", new Object[0]);
        this.f33979e.mo20155b();
        this.f33982h.shutdown();
        Future future = this.f33981g;
        if (future != null) {
            future.cancel(true);
            this.f33981g = null;
        }
    }

    /* renamed from: c */
    public final void mo20104c(byte[] bArr) {
        f33978d.mo25414c("sendPacket", new Object[0]);
        mlq mlq = this.f33979e;
        mlq.f33956a.mo25412b("sendBytes", new Object[0]);
        mlq.mo20153a(ahiq.m55840a(bArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final mtf mo20101d() {
        return mtf.WIFI;
    }

    /* renamed from: e */
    public final void mo20105e() {
        f33978d.mo25414c("connect", new Object[0]);
        m25306f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo20099b(byte[] bArr) {
        f33978d.mo25414c("doShutdownWithLastPacket", new Object[0]);
        mlq mlq = this.f33979e;
        mlt mlt = new mlt(this);
        mlq.f33956a.mo25412b("sendBytesWithListener", new Object[0]);
        ahiq a = ahiq.m55840a(bArr);
        mlq.f33959d.put(a.f67251a, mlt);
        mlq.mo20153a(a);
    }

    /* renamed from: a */
    public final void mo20103a(byte[] bArr, long j) {
        throw new UnsupportedOperationException("Unexpected call to sendPacket(packet, timeout) in WiFi D2D.");
    }
}
