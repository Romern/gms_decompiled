package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: ajkf */
final /* synthetic */ class ajkf implements Runnable {

    /* renamed from: a */
    private final ajkg f70787a;

    /* renamed from: b */
    private final ShareTarget f70788b;

    /* renamed from: c */
    private final TransferMetadata f70789c;

    public ajkf(ajkg ajkg, ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.f70787a = ajkg;
        this.f70788b = shareTarget;
        this.f70789c = transferMetadata;
    }

    public final void run() {
        ajkg ajkg = this.f70787a;
        ajkg.f70790a.mo44433b(this.f70788b, this.f70789c);
    }
}
