package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: akgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akgi implements ajud {

    /* renamed from: a */
    final /* synthetic */ ajud f71871a;

    /* renamed from: b */
    final /* synthetic */ akgy f71872b;

    /* renamed from: c */
    private boolean f71873c = false;

    public akgi(akgy akgy, ajud ajud) {
        this.f71872b = akgy;
        this.f71871a = ajud;
    }

    /* renamed from: a */
    public final void mo38711a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (!this.f71873c) {
            this.f71873c = transferMetadata.f81056e;
            this.f71872b.f71957x = transferMetadata.f81052a;
            this.f71871a.mo38711a(shareTarget, transferMetadata);
        }
    }
}
