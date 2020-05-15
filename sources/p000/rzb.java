package p000;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: rzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rzb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ rzd f43874a;

    /* renamed from: b */
    private final Uri f43875b;

    /* renamed from: c */
    private final ParcelFileDescriptor f43876c;

    public rzb(rzd rzd, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f43874a = rzd;
        this.f43875b = uri;
        this.f43876c = parcelFileDescriptor;
    }

    public final void run() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            ParcelFileDescriptor parcelFileDescriptor = this.f43876c;
            if (parcelFileDescriptor != null) {
                try {
                    BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.f43875b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    Log.e("ImageManager", sb.toString(), e);
                }
                try {
                    this.f43876c.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            new CountDownLatch(1);
            rzd rzd = this.f43874a;
            int i = rzd.f43878f;
            Handler handler = rzd.f43880b;
            new rzc(rzd);
            throw null;
        }
        String valueOf2 = String.valueOf(Thread.currentThread());
        String valueOf3 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 56 + String.valueOf(valueOf3).length());
        sb2.append("checkNotMainThread: current thread ");
        sb2.append(valueOf2);
        sb2.append(" IS the main thread ");
        sb2.append(valueOf3);
        sb2.append("!");
        Log.e("Asserts", sb2.toString());
        throw new IllegalStateException("LoadBitmapFromDiskRunnable can't be executed in the main thread");
    }
}
