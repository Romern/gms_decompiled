package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: ajjt */
final /* synthetic */ class ajjt implements Runnable {

    /* renamed from: a */
    private final ajju f70764a;

    /* renamed from: b */
    private final ShareTarget f70765b;

    /* renamed from: c */
    private final TransferMetadata f70766c;

    public ajjt(ajju ajju, ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.f70764a = ajju;
        this.f70765b = shareTarget;
        this.f70766c = transferMetadata;
    }

    public final void run() {
        ajju ajju = this.f70764a;
        ajju.f70767a.mo44423a(this.f70765b, this.f70766c);
    }
}
