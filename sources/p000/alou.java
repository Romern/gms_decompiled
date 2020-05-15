package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: alou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alou implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ParcelFileDescriptor f73989a;

    /* renamed from: b */
    final /* synthetic */ anco f73990b;

    /* renamed from: c */
    final /* synthetic */ int f73991c;

    public alou(ParcelFileDescriptor parcelFileDescriptor, anco anco, int i) {
        this.f73989a = parcelFileDescriptor;
        this.f73990b = anco;
        this.f73991c = i;
    }

    public final void run() {
        FileOutputStream fileOutputStream;
        Throwable th;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        IOException e;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream2 = null;
        try {
            autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f73989a);
            try {
                fileOutputStream = new FileOutputStream(this.f73990b.f76637a.getFileDescriptor());
                try {
                    srz.m36169a(new BufferedInputStream(autoCloseInputStream, this.f73991c), fileOutputStream, true, this.f73991c);
                } catch (IOException e2) {
                    e = e2;
                    try {
                        Log.w("BasePeopleOperation", "Failed to write to pipe", e);
                        srz.m36171a((Closeable) autoCloseInputStream);
                        srz.m36171a(fileOutputStream);
                        srz.m36171a(this.f73990b);
                    } catch (Throwable th2) {
                        th = th2;
                        autoCloseInputStream2 = autoCloseInputStream;
                    }
                }
            } catch (IOException e3) {
                fileOutputStream = null;
                e = e3;
                Log.w("BasePeopleOperation", "Failed to write to pipe", e);
                srz.m36171a((Closeable) autoCloseInputStream);
                srz.m36171a(fileOutputStream);
                srz.m36171a(this.f73990b);
            } catch (Throwable th3) {
                fileOutputStream = null;
                autoCloseInputStream2 = autoCloseInputStream;
                th = th3;
                srz.m36171a((Closeable) autoCloseInputStream2);
                srz.m36171a(fileOutputStream);
                srz.m36171a(this.f73990b);
                throw th;
            }
        } catch (IOException e4) {
            fileOutputStream = null;
            e = e4;
            autoCloseInputStream = null;
            Log.w("BasePeopleOperation", "Failed to write to pipe", e);
            srz.m36171a((Closeable) autoCloseInputStream);
            srz.m36171a(fileOutputStream);
            srz.m36171a(this.f73990b);
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            srz.m36171a((Closeable) autoCloseInputStream2);
            srz.m36171a(fileOutputStream);
            srz.m36171a(this.f73990b);
            throw th;
        }
        srz.m36171a((Closeable) autoCloseInputStream);
        srz.m36171a(fileOutputStream);
        srz.m36171a(this.f73990b);
    }
}
