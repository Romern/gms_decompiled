package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: azoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azoq extends Thread {

    /* renamed from: a */
    final InputStream f99798a;

    /* renamed from: b */
    final OutputStream f99799b;

    /* renamed from: c */
    final byte[] f99800c = new byte[1024];

    public azoq(InputStream inputStream, OutputStream outputStream) {
        super("ParcelFileDescriptor Transfer Thread");
        this.f99798a = inputStream;
        this.f99799b = outputStream;
    }

    public final void run() {
        while (true) {
            try {
                int read = this.f99798a.read(this.f99800c);
                if (read <= 0) {
                    break;
                }
                this.f99799b.write(this.f99800c, 0, read);
            } catch (IOException e) {
                long id = getId();
                StringBuilder sb = new StringBuilder(27);
                sb.append("PFDUtil");
                sb.append(id);
                azoj.m85933c(sb.toString(), "writing failed", e);
                try {
                    this.f99798a.close();
                } catch (IOException e2) {
                    long id2 = getId();
                    StringBuilder sb2 = new StringBuilder(27);
                    sb2.append("PFDUtil");
                    sb2.append(id2);
                    azoj.m85933c(sb2.toString(), "input stream could not be closed", e2);
                }
                try {
                    this.f99799b.close();
                    return;
                } catch (IOException e3) {
                    long id3 = getId();
                    StringBuilder sb3 = new StringBuilder(27);
                    sb3.append("PFDUtil");
                    sb3.append(id3);
                    azoj.m85933c(sb3.toString(), "output stream could not be closed", e3);
                    return;
                }
            } catch (Throwable th) {
                try {
                    this.f99798a.close();
                } catch (IOException e4) {
                    long id4 = getId();
                    StringBuilder sb4 = new StringBuilder(27);
                    sb4.append("PFDUtil");
                    sb4.append(id4);
                    azoj.m85933c(sb4.toString(), "input stream could not be closed", e4);
                }
                try {
                    this.f99799b.close();
                } catch (IOException e5) {
                    long id5 = getId();
                    StringBuilder sb5 = new StringBuilder(27);
                    sb5.append("PFDUtil");
                    sb5.append(id5);
                    azoj.m85933c(sb5.toString(), "output stream could not be closed", e5);
                }
                throw th;
            }
        }
        this.f99799b.flush();
        try {
            this.f99798a.close();
        } catch (IOException e6) {
            long id6 = getId();
            StringBuilder sb6 = new StringBuilder(27);
            sb6.append("PFDUtil");
            sb6.append(id6);
            azoj.m85933c(sb6.toString(), "input stream could not be closed", e6);
        }
        try {
            this.f99799b.close();
        } catch (IOException e7) {
            long id7 = getId();
            StringBuilder sb7 = new StringBuilder(27);
            sb7.append("PFDUtil");
            sb7.append(id7);
            azoj.m85933c(sb7.toString(), "output stream could not be closed", e7);
        }
    }
}
