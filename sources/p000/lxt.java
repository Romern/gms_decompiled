package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: lxt */
final /* synthetic */ class lxt implements lyn {

    /* renamed from: a */
    private final lyo f33168a;

    public lxt(lyo lyo) {
        this.f33168a = lyo;
    }

    /* renamed from: a */
    public final Object mo19733a(ClientContext clientContext, Object obj) {
        lyo lyo = this.f33168a;
        bzot bzot = (bzot) obj;
        if (lyo.f33205j == null) {
            lyo.f33205j = chtv.m149566a(chtu.UNARY, "google.subscriptions.backup.v1.GoogleOneBackupService/UpdateBackupConfig", ciie.m150370a(bzot.f170863d), ciie.m150370a(bzoc.f170793a));
        }
        return (bzoc) lyo.f33206a.mo25553a(lyo.f33205j, clientContext, bzot, 10000, TimeUnit.MILLISECONDS);
    }
}
