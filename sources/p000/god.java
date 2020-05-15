package p000;

import android.accounts.Account;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* renamed from: god */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class god extends gom implements aaai {

    /* renamed from: a */
    private final aaag f18763a;

    /* renamed from: b */
    private final gqm f18764b = new gqm();

    public god(aaag aaag, ilw ilw) {
        sdo.m34959a(aaag);
        this.f18763a = aaag;
    }

    /* renamed from: a */
    public final void mo12096a(gop gop, ClearTokenRequest clearTokenRequest) {
        this.f18763a.mo16658a(new gqo(gop, this.f18764b, clearTokenRequest));
    }

    /* renamed from: a */
    public final void mo12097a(gos gos, AccountChangeEventsRequest accountChangeEventsRequest) {
        this.f18763a.mo16658a(new gqq(gos, this.f18764b, accountChangeEventsRequest));
    }

    /* renamed from: a */
    public final void mo12098a(got got, String str) {
        this.f18763a.mo16658a(new gqr(got, this.f18764b, str));
    }

    /* renamed from: a */
    public final void mo12099a(gou gou, Account account) {
        this.f18763a.mo16658a(new gqs(gou, this.f18764b, account));
    }

    /* renamed from: a */
    public final void mo12100a(gpa gpa, Account account) {
        this.f18763a.mo16658a(new gqu(gpa, this.f18764b, account));
    }

    /* renamed from: a */
    public final void mo12101a(gpb gpb, Account account) {
        this.f18763a.mo16658a(new gqv(gpb, this.f18764b, account));
    }

    /* renamed from: a */
    public final void mo12102a(gpc gpc, TokenRequest tokenRequest) {
        this.f18763a.mo16658a(new gqx(gpc, this.f18764b, tokenRequest));
    }

    /* renamed from: a */
    public final void mo12103a(gpd gpd, String str) {
        this.f18763a.mo16658a(new gqw(gpd, this.f18764b, str));
    }

    /* renamed from: a */
    public final void mo12104a(rnt rnt, Account account, boolean z) {
        this.f18763a.mo16658a(new grb(rnt, account, z));
    }
}
