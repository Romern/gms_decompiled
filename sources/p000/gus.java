package p000;

import android.content.Context;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.common.api.Status;

/* renamed from: gus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class gus extends aaab {

    /* renamed from: a */
    public final guk f19043a;

    /* renamed from: b */
    public final int f19044b;

    /* renamed from: c */
    public final String f19045c;

    public gus(int i, guk guk, String str) {
        super(128, "AccountTransfer");
        sdo.m34959a(guk);
        this.f19043a = guk;
        this.f19044b = i;
        this.f19045c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AuthenticatorTransferInfo mo12250a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        AuthenticatorTransferInfo a = mo12250a();
        if (a == null) {
            this.f19043a.mo12196a(Status.f30109c);
            return;
        }
        gub a2 = gub.m13906a();
        if (a2.mo12229b(context, 2)) {
            new gva(this.f19044b, this.f19043a, a, false).mo6502a(context);
        } else if (!a2.mo12229b(context, 1) && a.f10063d != 2) {
            this.f19043a.mo12196a(new Status(20504));
        } else {
            new gvd(this.f19044b, this.f19043a, a, false).mo6502a(context);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f19043a.mo12196a(status);
    }
}
