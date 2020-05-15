package p000;

import android.os.Looper;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: mkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mkt extends mjk implements mkm {

    /* renamed from: d */
    public static final lvn f33911d = new lvn("UsbTransport");

    /* renamed from: e */
    private final mkn f33912e;

    /* renamed from: f */
    private final mkj f33913f;

    /* renamed from: g */
    private final mkb f33914g;

    /* renamed from: h */
    private final mjv f33915h;

    /* renamed from: i */
    private final int f33916i = 500;

    /* renamed from: j */
    private soa f33917j;

    /* renamed from: k */
    private soa f33918k;

    public mkt(mjn mjn, mkn mkn, bqgj bqgj, ScheduledExecutorService scheduledExecutorService, mju mju, met met) {
        super(mjn, bqgj, met);
        bmxy.m108581a(mkn);
        this.f33912e = mkn;
        mkn.mo20132a(this);
        this.f33913f = new mkj(mkn, bqgj);
        this.f33914g = new mkb(this, mkn, bqgj, met);
        this.f33915h = new mjv(scheduledExecutorService, cckw.m130271i(), mju);
        mkk mkk = new mkk(this, this.f33913f);
        this.f33917j = mkk;
        mkk.start();
        mkc mkc = new mkc(this, this.f33914g);
        this.f33918k = mkc;
        mkc.start();
    }

    /* renamed from: a */
    public final void mo20102a(InputStream inputStream, mjm mjm) {
        this.f33913f.mo20124a(2, inputStream, mjm, 0);
    }

    /* renamed from: a */
    public final void mo20103a(byte[] bArr, long j) {
        mko mko = new mko(this);
        this.f33913f.mo20124a(1, new ByteArrayInputStream(bArr), mko, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo20098b() {
        f33911d.mo25414c("doShutdown", new Object[0]);
        soa soa = this.f33917j;
        if (soa != null) {
            soa.interrupt();
            try {
                this.f33917j.join();
                this.f33917j = null;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Interrupted while waiting for UsbSenderThread to complete", e);
            }
        }
        soa soa2 = this.f33918k;
        if (soa2 != null) {
            try {
                soa2.join();
                this.f33918k = null;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Interrupted while waiting for UsbReceiverThread to complete", e2);
            }
        }
        this.f33913f.mo20123a();
        this.f33914g.mo20118b();
        this.f33912e.mo20133b();
        this.f33915h.mo20110b();
        mo20100c();
    }

    /* renamed from: c */
    public final void mo20104c(byte[] bArr) {
        mo20103a(bArr, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final mtf mo20101d() {
        return mtf.USB;
    }

    /* renamed from: e */
    public final void mo20105e() {
        this.f33915h.mo20109a();
        mo20096a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo20137f() {
        this.f33842b.execute(new mkr(this));
    }

    public mkt(mjn mjn, mkn mkn, bqgj bqgj, mjv mjv, met met) {
        super(mjn, bqgj, met);
        bmxy.m108581a(mkn);
        this.f33912e = mkn;
        bmxy.m108581a(mjv);
        this.f33915h = mjv;
        mkn.mo20132a(this);
        this.f33913f = new mkj(mkn, bqgj);
        this.f33914g = new mkb(this, mkn, bqgj, met);
        mkk mkk = new mkk(this, this.f33913f);
        this.f33917j = mkk;
        mkk.start();
        mkc mkc = new mkc(this, this.f33914g);
        this.f33918k = mkc;
        mkc.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo20099b(byte[] bArr) {
        f33911d.mo25414c("doShutdownWithLastPacket", new Object[0]);
        mks mks = new mks(this);
        mkp mkp = new mkp(this, mks);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        this.f33914g.mo20118b();
        mkj mkj = this.f33913f;
        mkj.f33889a.mo25412b("The send thread run loop will terminate after sending last packet.", new Object[0]);
        mkj.f33892d.set(new mkh(1, byteArrayInputStream, mkp));
        mkj.mo20123a();
        new adzt(Looper.getMainLooper()).postDelayed(new mkq(this, mks), (long) this.f33916i);
    }
}
