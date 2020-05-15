package p000;

import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: aloq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aloq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ anco f73971a;

    /* renamed from: b */
    final /* synthetic */ byte[] f73972b;

    public aloq(anco anco, byte[] bArr) {
        this.f73971a = anco;
        this.f73972b = bArr;
    }

    public final void run() {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(this.f73971a.f76637a.getFileDescriptor());
            try {
                byte[] bArr = this.f73972b;
                fileOutputStream.write(bArr, 0, bArr.length);
            } catch (IOException e2) {
                e = e2;
                try {
                    Log.w("BasePeopleOperation", "Failed to write to pipe", e);
                    srz.m36171a(fileOutputStream);
                    srz.m36171a(this.f73971a);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                }
            }
        } catch (IOException e3) {
            fileOutputStream = null;
            e = e3;
            Log.w("BasePeopleOperation", "Failed to write to pipe", e);
            srz.m36171a(fileOutputStream);
            srz.m36171a(this.f73971a);
        } catch (Throwable th3) {
            th = th3;
            srz.m36171a(fileOutputStream2);
            srz.m36171a(this.f73971a);
            throw th;
        }
        srz.m36171a(fileOutputStream);
        srz.m36171a(this.f73971a);
    }
}
