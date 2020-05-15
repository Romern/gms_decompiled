package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajkc */
final /* synthetic */ class ajkc implements Runnable {

    /* renamed from: a */
    private final ajkd f70780a;

    /* renamed from: b */
    private final ShareTarget f70781b;

    /* renamed from: c */
    private final int f70782c;

    public ajkc(ajkd ajkd, ShareTarget shareTarget, int i) {
        this.f70780a = ajkd;
        this.f70781b = shareTarget;
        this.f70782c = i;
    }

    public final void run() {
        ajkd ajkd = this.f70780a;
        ShareTarget shareTarget = this.f70781b;
        int i = this.f70782c;
        for (ajmx ajmx : ajkd.f70783a.f80901m.values()) {
            ajmx.f70944a.mo38708a(shareTarget, i);
        }
    }
}
