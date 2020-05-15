package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: lxo */
final /* synthetic */ class lxo implements lyn {

    /* renamed from: a */
    private final lyo f33163a;

    public lxo(lyo lyo) {
        this.f33163a = lyo;
    }

    /* renamed from: a */
    public final Object mo19733a(ClientContext clientContext, Object obj) {
        lyo lyo = this.f33163a;
        bzog bzog = (bzog) obj;
        if (lyo.f33201f == null) {
            lyo.f33201f = chtv.m149566a(chtu.UNARY, "google.subscriptions.backup.v1.GoogleOneBackupService/CreateBackup", ciie.m150370a(bzog.f170806c), ciie.m150370a(bzob.f170788d));
        }
        return (bzob) lyo.f33206a.mo25553a(lyo.f33201f, clientContext, bzog, 10000, TimeUnit.MILLISECONDS);
    }
}
