package p000;

import android.media.MediaCodec;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: odt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class odt {

    /* renamed from: f */
    public static final bnsn f37301f = odk.m28481a("CAR.MEDIA");

    /* renamed from: a */
    private Thread f37302a;

    /* renamed from: g */
    public volatile boolean f37303g = false;

    /* renamed from: h */
    public odr f37304h;

    /* renamed from: i */
    protected volatile boolean f37305i = false;

    /* renamed from: j */
    public volatile boolean f37306j = false;

    /* renamed from: k */
    public nto f37307k;

    /* renamed from: l */
    protected ods f37308l;

    protected odt(ods ods) {
        this.f37308l = ods;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract nto mo21783a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21784a(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer);

    /* renamed from: a */
    public final synchronized boolean mo22033a(odr odr) {
        boolean z;
        this.f37303g = false;
        this.f37304h = odr;
        this.f37305i = true;
        this.f37306j = false;
        Semaphore semaphore = new Semaphore(0);
        Thread thread = new Thread(new odq(this, semaphore), mo21787d());
        this.f37302a = thread;
        thread.start();
        int i = 0;
        z = false;
        while (true) {
            i++;
            if (i > 20 || z) {
                break;
            }
            try {
                if (semaphore.tryAcquire(500, TimeUnit.MILLISECONDS)) {
                    z = true;
                } else if (!this.f37302a.isAlive()) {
                    break;
                }
            } catch (InterruptedException e) {
                bnsi c = f37301f.mo68388c();
                c.mo68437a(e);
                c.mo68432a("odt", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("InterruptedException while starting encoding");
                return false;
            }
        }
        if (!z) {
            bnsi c2 = f37301f.mo68388c();
            c2.mo68432a("odt", "a", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68414a("failed to start encoding %d %b", i, this.f37302a.isAlive());
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo21785b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo21786c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo21787d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo21788e();

    /* renamed from: h */
    public synchronized void mo22034h() {
        this.f37306j = true;
        Thread thread = this.f37302a;
        if (thread != null) {
            try {
                thread.join(3000);
            } catch (InterruptedException e) {
            }
            if (this.f37302a.isAlive()) {
                bnsi c = f37301f.mo68388c();
                c.mo68432a("odt", "h", 239, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Encoding thread did not quit!");
                this.f37303g = true;
            }
            this.f37302a = null;
        }
        nto nto = this.f37307k;
        if (nto != null) {
            try {
                nto.f36450a.stop();
            } catch (IllegalStateException e2) {
            }
            this.f37307k.f36450a.release();
            this.f37307k = null;
        }
        ods ods = this.f37308l;
        if (ods != null) {
            ods.mo21909a();
            this.f37308l = null;
        }
    }
}
