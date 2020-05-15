package p000;

import android.graphics.Bitmap;

/* renamed from: azcg */
final /* synthetic */ class azcg implements Runnable {

    /* renamed from: a */
    private final azch f98970a;

    /* renamed from: b */
    private final Bitmap f98971b;

    public azcg(azch azch, Bitmap bitmap) {
        this.f98970a = azch;
        this.f98971b = bitmap;
    }

    public final void run() {
        azch azch = this.f98970a;
        Bitmap bitmap = this.f98971b;
        azcj azcj = (azcj) azch.f98972a.get();
        if (azcj == null) {
            return;
        }
        if (bitmap != null) {
            azcf azcf = (azcf) azcj.f98976a.remove(azch.f98973b);
            if (azcf == null) {
                azcf = new azcf(azcj, azch.f98973b, new adzt(azcj.f98977b.getMainLooper()));
            }
            azcf.f98968a = bitmap;
            azcj.f98976a.put(azch.f98973b, azcf);
            azcj.mo54627a();
            return;
        }
        azoj.m85933c("AvatarManager", "Bitmap reference is released.", new Object[0]);
    }
}
