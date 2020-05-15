package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: avei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avei extends avej {

    /* renamed from: a */
    private final bxrt f93015a;

    public avei(Context context, Account account, bxrt bxrt) {
        super(context, account);
        this.f93015a = bxrt;
    }

    /* renamed from: a */
    public final aucb mo51180a(rjx rjx) {
        boolean z;
        bxrt bxrt = this.f93015a;
        rkb rkb = rjx.f43165D;
        if ((bxrt.f164601a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "UdcApi.getConsentConfig: Empty user-environment not allowed.");
        avdy avdy = new avdy(rkb, bxrt);
        rkb.mo24787a((rle) avdy);
        return sdl.m34956a(avdy, new avag()).mo50364a(aveh.f93014a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ rkk mo51181a(Status status) {
        return new avee(status, null);
    }
}
