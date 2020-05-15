package p000;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Process;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: odw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class odw extends odt {
    static {
        odk.m28481a("CAR.VIDEO");
    }

    protected odw(ods ods) {
        super(ods);
    }

    /* renamed from: b */
    public static void m28521b(ByteBuffer byteBuffer) {
        if (ccwd.f180086a.mo6606a().mo76937n()) {
            int limit = byteBuffer.limit();
            while (limit > 3) {
                int i = limit - 1;
                if (byteBuffer.get(i) != 0) {
                    break;
                }
                limit = i;
            }
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: a */
    public abstract void mo22028a(int i, int i2, int i3, int i4);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21784a(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        ods ods;
        if (bufferInfo.size != 0 && (ods = this.f37308l) != null) {
            ods.mo21911a(byteBuffer, bufferInfo);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo21786c() {
        Process.setThreadPriority(-8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo21787d() {
        return "Video EncodingThread.";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo21788e() {
        if (this.f37308l != null) {
            this.f37308l.mo21910a(this.f37307k.f36450a.getOutputFormat());
        }
    }

    /* renamed from: g */
    public abstract Surface mo22031g();

    /* renamed from: h */
    public final synchronized void mo22034h() {
        Surface g = mo22031g();
        if (g != null) {
            g.release();
        }
        super.mo22034h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo21785b() {
        nto nto = this.f37307k;
        int i = Build.VERSION.SDK_INT;
        nto.f36450a.signalEndOfInputStream();
    }
}
