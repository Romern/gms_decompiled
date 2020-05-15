package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: chrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrb implements chrd {
    /* renamed from: a */
    public final InputStream mo85557a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }

    /* renamed from: a */
    public final String mo85559a() {
        return "gzip";
    }

    /* renamed from: a */
    public final OutputStream mo85558a(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }
}
