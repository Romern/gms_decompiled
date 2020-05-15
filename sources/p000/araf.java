package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: araf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class araf implements Runnable {

    /* renamed from: a */
    private static final asco f87192a = ascp.m73787a("D2D", araf.class.getSimpleName());

    /* renamed from: b */
    private final InputStream f87193b;

    /* renamed from: c */
    private final aqzo f87194c;

    /* renamed from: d */
    private final byte[] f87195d = new byte[8192];

    public araf(InputStream inputStream, aqzo aqzo) {
        this.f87193b = inputStream;
        this.f87194c = aqzo;
    }

    public final void run() {
        while (true) {
            try {
                InputStream inputStream = this.f87193b;
                byte[] bArr = this.f87195d;
                int read = inputStream.read(bArr, 0, bArr.length);
                if (read != -1) {
                    this.f87194c.mo48305a(Arrays.copyOf(this.f87195d, read));
                } else {
                    return;
                }
            } catch (IOException e) {
                f87192a.mo25416d("IOException in SendDataFromInputStreamRunnable", new Object[0]);
                return;
            }
        }
    }
}
