package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: alol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alol implements Runnable {

    /* renamed from: a */
    final /* synthetic */ alon f73955a;

    public alol(alon alon) {
        this.f73955a = alon;
    }

    public final void run() {
        File file;
        synchronized (this.f73955a.f73960a) {
            aloy aloy = this.f73955a.f73962c;
            if (aloy == null || aloy.f73994a.mo74947d()) {
                alon alon = this.f73955a;
                if (alon.f73961b > 0 && (file = alon.f73964e) != null) {
                    if (!file.exists()) {
                        this.f73955a.f73964e.mkdirs();
                    }
                    long usableSpace = this.f73955a.f73964e.getUsableSpace();
                    alon alon2 = this.f73955a;
                    long j = (long) alon2.f73961b;
                    if (usableSpace > j) {
                        try {
                            alon2.f73962c = new aloy(cauz.m127267a(cayk.f176410a, alon2.f73964e, j));
                        } catch (IOException e) {
                            this.f73955a.f73964e = null;
                            Log.e("AvatarCacheImpl", "initDiskCache: Error opening disk cache.", e);
                        }
                    }
                }
            }
            alon alon3 = this.f73955a;
            alon3.f73963d = false;
            alon3.f73960a.notifyAll();
        }
    }
}
