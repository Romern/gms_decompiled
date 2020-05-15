package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: lxm */
final /* synthetic */ class lxm implements lyn {

    /* renamed from: a */
    private final lyo f33161a;

    public lxm(lyo lyo) {
        this.f33161a = lyo;
    }

    /* renamed from: a */
    public final Object mo19733a(ClientContext clientContext, Object obj) {
        lyo lyo = this.f33161a;
        bzoe bzoe = (bzoe) obj;
        if (lyo.f33198c == null) {
            lyo.f33198c = chtv.m149566a(chtu.UNARY, "google.subscriptions.backup.v1.GoogleOneBackupService/CommitTransaction", ciie.m150370a(bzoe.f170799d), ciie.m150370a(bzof.f170804a));
        }
        return (bzof) lyo.f33206a.mo25553a(lyo.f33198c, clientContext, bzoe, 10000, TimeUnit.MILLISECONDS);
    }
}
