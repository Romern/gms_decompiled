package p000;

import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* renamed from: rdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rdx implements HttpEntity {

    /* renamed from: a */
    public long f42768a = -1;

    /* renamed from: b */
    private final rea f42769b;

    public rdx(rea rea) {
        this.f42769b = rea;
    }

    public final void consumeContent() {
    }

    public final InputStream getContent() {
        return null;
    }

    public final Header getContentEncoding() {
        return new BasicHeader("Content-Encoding", "gzip");
    }

    public final long getContentLength() {
        return -1;
    }

    public final Header getContentType() {
        return new BasicHeader("Content-Type", "application/x-gzip");
    }

    public final boolean isChunked() {
        return true;
    }

    public final boolean isRepeatable() {
        return true;
    }

    public final boolean isStreaming() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    public final void writeTo(OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream;
        this.f42769b.mo24539a(SystemClock.elapsedRealtime(), System.currentTimeMillis());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(100);
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f42769b.mo24544e());
                gZIPOutputStream.finish();
                this.f42768a = (long) byteArrayOutputStream.size();
                byteArrayOutputStream.writeTo(outputStream);
                gZIPOutputStream.close();
            } catch (Throwable th) {
                th = th;
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream = null;
            if (gZIPOutputStream != null) {
            }
            throw th;
        }
    }
}
