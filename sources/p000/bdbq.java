package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bdbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdbq implements bdch {

    /* renamed from: a */
    private static final String f105270a = bdbq.class.getSimpleName();

    /* renamed from: b */
    private final File f105271b;

    /* renamed from: c */
    private final File f105272c;

    public bdbq(File file, String str) {
        this.f105271b = file;
        this.f105272c = new File(file, str);
    }

    /* renamed from: a */
    public final long mo57852a() {
        return this.f105272c.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cd A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0 A[Catch:{ all -> 0x00c5 }] */
    /* renamed from: a */
    public final long mo57853a(InputStream inputStream, long j) {
        boolean z;
        if (!this.f105271b.exists() && !this.f105271b.mkdirs() && !this.f105271b.exists()) {
            throw new bdcd(new IOException("Error creating output directory"), bdbr.FILE_SYSTEM_ERROR);
        } else if (j <= this.f105272c.length()) {
            ciqq b = j <= 0 ? ciqh.m150836b(this.f105272c) : ciqh.m150839c(this.f105272c);
            cipw a = ciqh.m150828a(ciqh.m150833a(inputStream));
            try {
                cipu cipu = new cipu();
                long j2 = 0;
                while (!a.mo86295b()) {
                    try {
                        a.mo74995c(cipu, 65536);
                        long j3 = cipu.f191213b;
                        if (j3 > 0) {
                            b.mo74930a(cipu, j3);
                        }
                        j2 += j3;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        try {
                            throw new bdcd(e, z ? bdbr.DISK_IO_ERROR : bdbr.NETWORK_IO_ERROR);
                        } catch (Throwable th) {
                            try {
                                b.close();
                            } catch (IOException e2) {
                                Log.wtf(f105270a, "Error closing download file", e2);
                            }
                            try {
                                a.close();
                            } catch (IOException e3) {
                                Log.wtf(f105270a, "Error closing buffered source", e3);
                            }
                            throw th;
                        }
                    }
                }
                b.flush();
                long length = this.f105272c.length();
                String absolutePath = this.f105272c.getAbsolutePath();
                StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 92);
                sb.append("Wrote response to file: ");
                sb.append(absolutePath);
                sb.append(", size: ");
                sb.append(length);
                sb.append(" bytes, read: ");
                sb.append(j2);
                sb.append(" bytes");
                sb.toString();
                try {
                    b.close();
                } catch (IOException e4) {
                    Log.wtf(f105270a, "Error closing download file", e4);
                }
                try {
                    a.close();
                } catch (IOException e5) {
                    Log.wtf(f105270a, "Error closing buffered source", e5);
                }
                return length;
            } catch (IOException e6) {
                e = e6;
                z = false;
                throw new bdcd(e, z ? bdbr.DISK_IO_ERROR : bdbr.NETWORK_IO_ERROR);
            }
        } else {
            long length2 = this.f105272c.length();
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append("Given offsetBytes does not correspond with existing data: ");
            sb2.append(j);
            sb2.append(", ");
            sb2.append(length2);
            throw new IOException(sb2.toString());
        }
    }
}
