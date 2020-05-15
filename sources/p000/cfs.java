package p000;

import java.io.File;

/* renamed from: cfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cfs {

    /* renamed from: a */
    private volatile chj f6723a;

    /* renamed from: b */
    private final cho f6724b;

    public cfs(cho cho) {
        this.f6724b = cho;
    }

    /* renamed from: a */
    public final chj mo3821a() {
        File file;
        if (this.f6723a == null) {
            synchronized (this) {
                if (this.f6723a == null) {
                    chq chq = this.f6724b.f6870a;
                    File cacheDir = chq.f6875a.getCacheDir();
                    chp chp = null;
                    if (cacheDir != null) {
                        file = new File(cacheDir, chq.f6876b);
                    } else {
                        file = null;
                    }
                    if (file != null) {
                        if (!file.mkdirs()) {
                            if (file.exists()) {
                                if (!file.isDirectory()) {
                                }
                            }
                        }
                        chp = new chp(file);
                    }
                    this.f6723a = chp;
                }
                if (this.f6723a == null) {
                    this.f6723a = new chk();
                }
            }
        }
        return this.f6723a;
    }
}
