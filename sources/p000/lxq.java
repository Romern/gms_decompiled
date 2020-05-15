package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: lxq */
final /* synthetic */ class lxq implements lyn {

    /* renamed from: a */
    private final lyo f33165a;

    public lxq(lyo lyo) {
        this.f33165a = lyo;
    }

    /* renamed from: a */
    public final Object mo19733a(ClientContext clientContext, Object obj) {
        lyo lyo = this.f33165a;
        bzoi bzoi = (bzoi) obj;
        if (lyo.f33202g == null) {
            lyo.f33202g = chtv.m149566a(chtu.UNARY, "google.subscriptions.backup.v1.GoogleOneBackupService/DeleteFile", ciie.m150370a(bzoi.f170814d), ciie.m150370a(bxuo.f164865a));
        }
        return (bxuo) lyo.f33206a.mo25553a(lyo.f33202g, clientContext, bzoi, 10000, TimeUnit.MILLISECONDS);
    }
}
