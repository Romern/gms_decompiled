package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: behi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class behi implements bdch {

    /* renamed from: a */
    private final befa f111560a;

    /* renamed from: b */
    private final Uri f111561b;

    public behi(befa befa, Uri uri) {
        this.f111560a = befa;
        this.f111561b = uri;
    }

    /* renamed from: a */
    public final long mo57852a() {
        return this.f111560a.mo60649e(this.f111561b);
    }

    /* renamed from: a */
    public final long mo57853a(InputStream inputStream, long j) {
        beez beez;
        long e = this.f111560a.mo60649e(this.f111561b);
        if (j <= e) {
            if (j > 0) {
                beez = new behm();
            } else {
                beez = behw.m95072a();
            }
            OutputStream outputStream = (OutputStream) this.f111560a.mo60643a(this.f111561b, beez, new beer[0]);
            try {
                long a = boav.m111013a(inputStream, outputStream);
                if (outputStream != null) {
                    outputStream.close();
                }
                return j + a;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", Long.valueOf(j), Long.valueOf(e)));
        }
        throw th;
    }
}
