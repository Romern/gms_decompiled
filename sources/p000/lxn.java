package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: lxn */
final /* synthetic */ class lxn implements lyn {

    /* renamed from: a */
    private final lyo f33162a;

    public lxn(lyo lyo) {
        this.f33162a = lyo;
    }

    /* renamed from: a */
    public final Object mo19733a(ClientContext clientContext, Object obj) {
        lyo lyo = this.f33162a;
        bzol bzol = (bzol) obj;
        if (lyo.f33199d == null) {
            lyo.f33199d = chtv.m149566a(chtu.UNARY, "google.subscriptions.backup.v1.GoogleOneBackupService/GetBackup", ciie.m150370a(bzol.f170830c), ciie.m150370a(bzob.f170788d));
        }
        return (bzob) lyo.f33206a.mo25553a(lyo.f33199d, clientContext, bzol, 10000, TimeUnit.MILLISECONDS);
    }
}
