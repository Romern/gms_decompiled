package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: lxp */
final /* synthetic */ class lxp implements lyn {

    /* renamed from: a */
    private final lyo f33164a;

    public lxp(lyo lyo) {
        this.f33164a = lyo;
    }

    /* renamed from: a */
    public final Object mo19733a(ClientContext clientContext, Object obj) {
        lyo lyo = this.f33164a;
        bzon bzon = (bzon) obj;
        if (lyo.f33204i == null) {
            lyo.f33204i = chtv.m149566a(chtu.UNARY, "google.subscriptions.backup.v1.GoogleOneBackupService/ListFiles", ciie.m150370a(bzon.f170839f), ciie.m150370a(bzoo.f170846c));
        }
        return (bzoo) lyo.f33206a.mo25553a(lyo.f33204i, clientContext, bzon, 10000, TimeUnit.MILLISECONDS);
    }
}
