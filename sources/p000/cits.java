package p000;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* renamed from: cits */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class cits extends OutputStream {

    /* renamed from: a */
    private boolean f191449a;

    /* renamed from: d */
    public IOException f191450d;

    /* renamed from: e */
    public boolean f191451e;

    /* renamed from: a */
    public abstract void mo86524a();

    /* renamed from: b */
    public abstract void mo86525b();

    /* renamed from: c */
    public abstract UploadDataProvider mo86526c();

    public void close() {
        this.f191449a = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo86555d() {
        if (this.f191451e) {
            mo86556e();
            throw new IOException("Writing after request completed.");
        } else if (this.f191449a) {
            throw new IOException("Stream has been closed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo86556e() {
        IOException iOException = this.f191450d;
        if (iOException != null) {
            throw iOException;
        }
    }
}
