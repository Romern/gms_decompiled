package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: lxr */
final /* synthetic */ class lxr implements lyn {

    /* renamed from: a */
    private final lyo f33166a;

    public lxr(lyo lyo) {
        this.f33166a = lyo;
    }

    /* renamed from: a */
    public final Object mo19733a(ClientContext clientContext, Object obj) {
        lyo lyo = this.f33166a;
        bzoj bzoj = (bzoj) obj;
        if (lyo.f33203h == null) {
            lyo.f33203h = chtv.m149566a(chtu.UNARY, "google.subscriptions.backup.v1.GoogleOneBackupService/DeleteFiles", ciie.m150370a(bzoj.f170819d), ciie.m150370a(bxuo.f164865a));
        }
        return (bxuo) lyo.f33206a.mo25553a(lyo.f33203h, clientContext, bzoj, 10000, TimeUnit.MILLISECONDS);
    }
}
