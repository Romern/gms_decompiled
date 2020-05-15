package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: lxs */
final /* synthetic */ class lxs implements lyn {

    /* renamed from: a */
    private final lyo f33167a;

    public lxs(lyo lyo) {
        this.f33167a = lyo;
    }

    /* renamed from: a */
    public final Object mo19733a(ClientContext clientContext, Object obj) {
        lyo lyo = this.f33167a;
        bzoh bzoh = (bzoh) obj;
        if (lyo.f33200e == null) {
            lyo.f33200e = chtv.m149566a(chtu.UNARY, "google.subscriptions.backup.v1.GoogleOneBackupService/DeleteBackup", ciie.m150370a(bzoh.f170810c), ciie.m150370a(bxuo.f164865a));
        }
        return (bxuo) lyo.f33206a.mo25553a(lyo.f33200e, clientContext, bzoh, 10000, TimeUnit.MILLISECONDS);
    }
}
