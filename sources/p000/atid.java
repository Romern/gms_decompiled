package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;

/* renamed from: atid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atid extends atkj {

    /* renamed from: a */
    private final String f90388a;

    /* renamed from: b */
    private final int f90389b;

    public atid(String str, int i, String str2, aswm aswm) {
        super("GetTokenStatus", str2, aswm);
        this.f90388a = str;
        this.f90389b = i;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49617a(status, (TokenStatus) null);
    }

    /* renamed from: a */
    public final boolean mo50004a() {
        return true;
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        super.mo50005b(context);
        askf b = askg.m74283b(context, this.f90413c);
        if (b == null) {
            this.f90414d.mo49617a(new Status(15002), (TokenStatus) null);
            return;
        }
        CardInfo a = atds.m75666a(b).mo49844a(this.f90388a, this.f90389b);
        if (a != null) {
            String str = this.f90388a;
            com.google.android.gms.tapandpay.firstparty.TokenStatus tokenStatus = a.f108345f;
            this.f90414d.mo49617a(Status.f30107a, new TokenStatus(str, tokenStatus.f108459b, tokenStatus.f108460c));
            return;
        }
        this.f90414d.mo49617a(new Status(15003), (TokenStatus) null);
    }
}
