package p000;

import android.graphics.Bitmap;

/* renamed from: bded */
final /* synthetic */ class bded implements Runnable {

    /* renamed from: a */
    private final bdeh f105399a;

    /* renamed from: b */
    private final String f105400b;

    /* renamed from: c */
    private final Bitmap f105401c;

    public bded(bdeh bdeh, String str, Bitmap bitmap) {
        this.f105399a = bdeh;
        this.f105400b = str;
        this.f105401c = bitmap;
    }

    public final void run() {
        bdeh bdeh = this.f105399a;
        String str = this.f105400b;
        Bitmap bitmap = this.f105401c;
        synchronized (bdej.f105415a) {
            bdej.f105415a.put(str, bitmap);
        }
        bdeh.mo57937a(bitmap);
    }
}
