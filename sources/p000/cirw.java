package p000;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: cirw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cirw extends UploadDataSink {

    /* renamed from: a */
    public final AtomicReference f191297a = new AtomicReference(3);

    /* renamed from: b */
    public final UploadDataProvider f191298b;

    /* renamed from: c */
    public ByteBuffer f191299c;

    /* renamed from: d */
    public long f191300d;

    /* renamed from: e */
    public long f191301e;

    /* renamed from: f */
    public final HttpURLConnection f191302f;

    /* renamed from: g */
    public WritableByteChannel f191303g;

    /* renamed from: h */
    public OutputStream f191304h;

    /* renamed from: i */
    final /* synthetic */ cisx f191305i;

    /* renamed from: j */
    private final Executor f191306j;

    /* renamed from: k */
    private final Executor f191307k;

    /* renamed from: l */
    private final AtomicBoolean f191308l;

    public cirw(cisx cisx, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, citg citg) {
        this.f191305i = cisx;
        this.f191306j = new cirq(this, executor);
        this.f191307k = executor2;
        this.f191298b = citg;
        this.f191308l = new AtomicBoolean(false);
        this.f191302f = httpURLConnection;
    }

    /* renamed from: a */
    public final void mo86443a() {
        this.f191307k.execute(mo86446b(new ciru(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Runnable mo86446b(cisy cisy) {
        cisx cisx = this.f191305i;
        String str = cisx.f191359a;
        return cisx.mo86473a(cisy);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo86448c() {
        mo86447b();
        cisx cisx = this.f191305i;
        String str = cisx.f191359a;
        cisx.mo86474a();
    }

    public final void onReadError(Exception exc) {
        mo86445a(exc);
    }

    public final void onReadSucceeded(boolean z) {
        if (this.f191297a.compareAndSet(0, 2)) {
            this.f191307k.execute(mo86446b(new cirs(this, z)));
            return;
        }
        throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + this.f191297a.get());
    }

    public final void onRewindError(Exception exc) {
        mo86445a(exc);
    }

    public final void onRewindSucceeded() {
        if (this.f191297a.compareAndSet(1, 2)) {
            mo86443a();
            return;
        }
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + this.f191297a.get());
    }

    /* renamed from: a */
    public final void mo86444a(cisy cisy) {
        try {
            Executor executor = this.f191306j;
            cisx cisx = this.f191305i;
            String str = cisx.f191359a;
            executor.execute(cisx.mo86481b(cisy));
        } catch (RejectedExecutionException e) {
            mo86445a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo86447b() {
        if (this.f191303g != null && this.f191308l.compareAndSet(false, true)) {
            this.f191303g.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo86445a(Throwable th) {
        cisx cisx = this.f191305i;
        String str = cisx.f191359a;
        cisx.mo86478a(th);
    }
}
