package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

/* renamed from: atie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atie extends atkj {

    /* renamed from: a */
    private final String f90390a;

    /* renamed from: b */
    private final int f90391b;

    /* renamed from: e */
    private final String f90392e;

    public atie(String str, int i, String str2, String str3, aswm aswm) {
        super("IssuerTokenize", str3, aswm);
        this.f90390a = str;
        this.f90391b = i;
        this.f90392e = str2;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: a */
    public final boolean mo50004a() {
        return true;
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        PendingIntent pendingIntent;
        CardInfo cardInfo;
        super.mo50005b(context);
        askf b = askg.m74283b(context, this.f90413c);
        if (b == null) {
            pendingIntent = asiw.m74197a(context, RequestTokenizeChimeraActivity.m93051a(context, atrq.m76261b(this.f90413c, null, null), null, null, this.f90392e, this.f90413c, null, false), this.f90413c);
        } else {
            if (!bmxx.m108577a(this.f90390a)) {
                CardInfo a = atds.m75666a(b).mo49844a(this.f90390a, this.f90391b);
                if (a != null) {
                    cardInfo = a;
                } else {
                    this.f90414d.mo49607a(new Status(15003), Bundle.EMPTY);
                    return;
                }
            } else {
                cardInfo = null;
            }
            AccountInfo a2 = b.mo49209a();
            pendingIntent = atrq.m76258a(context, RequestTokenizeChimeraActivity.m93051a(context, atrq.m76261b(this.f90413c, a2, cardInfo), cardInfo, a2, this.f90392e, this.f90413c, null, false));
        }
        this.f90414d.mo49607a(new Status(6, null, pendingIntent), Bundle.EMPTY);
    }
}
