package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: lxl */
final /* synthetic */ class lxl implements lyn {

    /* renamed from: a */
    private final lyo f33160a;

    public lxl(lyo lyo) {
        this.f33160a = lyo;
    }

    /* renamed from: a */
    public final Object mo19733a(ClientContext clientContext, Object obj) {
        lyo lyo = this.f33160a;
        bzop bzop = (bzop) obj;
        if (lyo.f33197b == null) {
            lyo.f33197b = chtv.m149566a(chtu.UNARY, "google.subscriptions.backup.v1.GoogleOneBackupService/StartTransaction", ciie.m150370a(bzop.f170851e), ciie.m150370a(bzoq.f170857b));
        }
        return (bzoq) lyo.f33206a.mo25553a(lyo.f33197b, clientContext, bzop, 10000, TimeUnit.MILLISECONDS);
    }
}
