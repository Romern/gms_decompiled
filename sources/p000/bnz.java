package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: bnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnz extends FilterInputStream {

    /* renamed from: a */
    private final HttpURLConnection f5222a;

    public final void close() {
        super.close();
        this.f5222a.disconnect();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bnz(HttpURLConnection httpURLConnection) {
        super(r0);
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            inputStream = httpURLConnection.getErrorStream();
        }
        this.f5222a = httpURLConnection;
    }
}
