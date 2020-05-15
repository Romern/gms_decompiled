package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: akgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akgn {

    /* renamed from: a */
    public final String f71885a;

    /* renamed from: b */
    private ahfi f71886b = null;

    /* renamed from: c */
    private final ScheduledExecutorService f71887c;

    public akgn(ScheduledExecutorService scheduledExecutorService, String str) {
        this.f71887c = scheduledExecutorService;
        this.f71885a = str;
    }

    /* renamed from: a */
    public final synchronized void mo39358a() {
        ahfi ahfi = this.f71886b;
        if (ahfi != null) {
            ahfi.mo36396b();
            this.f71886b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo39359a(long j, ajud ajud, ShareTarget shareTarget, akdd akdd) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akgn", "a", 4494, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68423a("%s alarm timed out after %d ms. Closing connection.", this.f71885a, j);
        ajud.mo38711a(shareTarget, new ajub(10).mo38916a());
        akdd.mo39253b();
    }

    /* renamed from: a */
    public final synchronized void mo39360a(ShareTarget shareTarget, akdd akdd, ajud ajud, long j) {
        mo39358a();
        srn srn = ajvp.f71371a;
        this.f71886b = ahfi.m55635b(new akgm(this, j, ajud, shareTarget, akdd), j, this.f71887c);
    }
}
