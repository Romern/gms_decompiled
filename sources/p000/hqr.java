package p000;

import android.accounts.Account;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Callable;

/* renamed from: hqr */
final /* synthetic */ class hqr implements Callable {

    /* renamed from: a */
    private final hqu f20242a;

    /* renamed from: b */
    private final bngx f20243b;

    public hqr(hqu hqu, bngx bngx) {
        this.f20242a = hqu;
        this.f20243b = bngx;
    }

    public final Object call() {
        Status status;
        hqu hqu = this.f20242a;
        bngx bngx = this.f20243b;
        Account account = hqu.f20249d;
        int i = spn.m35897i(hqu.f20250e, hqu.f20247b);
        adag a = adag.m50068a(account, bngx);
        a.mo33283a(5);
        a.mo33287a(hqu.f20247b, i);
        TokenRequest a2 = a.mo33282a();
        TokenResponse a3 = hqu.f20251f.mo13425a(a2);
        if (a3 != null) {
            izj izj = izj.CLIENT_LOGIN_DISABLED;
            int ordinal = a3.mo7647b().ordinal();
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal == 5) {
                        status = new Status(7, "Network error");
                    } else if (ordinal == 6) {
                        status = new Status(8, "Service unavailable");
                    } else if (ordinal == 7) {
                        status = new Status(8, "Internal error");
                    } else if (ordinal != 8) {
                        if (!(ordinal == 20 || ordinal == 21)) {
                            switch (ordinal) {
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 35:
                                    break;
                                case 34:
                                    return bmxv.m108566b(4);
                                default:
                                    status = new Status(8, "Unknown error");
                                    break;
                            }
                        }
                    } else {
                        hqu.f20253h = a2.f10706b;
                        return bmxv.m108566b(2);
                    }
                    throw adbe.m50108a(status.f30116j, status.f30115i);
                }
                return bmvz.f131120a;
            }
            return bmxv.m108566b(3);
        }
        throw adbe.m50106a(8);
    }
}
