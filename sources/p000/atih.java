package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: atih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atih extends atkj {

    /* renamed from: a */
    private final String f90394a;

    /* renamed from: b */
    private final int f90395b;

    public atih(String str, int i, String str2, aswm aswm) {
        super("RequestDeleteToken", str2, aswm);
        this.f90394a = str;
        this.f90395b = i;
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
        super.mo50005b(context);
        askf a = askg.m74278a(context, this.f90413c);
        CardInfo a2 = atds.m75666a(a).mo49844a(this.f90394a, this.f90395b);
        if (a2 == null) {
            this.f90414d.mo49621b(new Status(15003), (String) null);
            return;
        }
        this.f90414d.mo49607a(new Status(6, null, spn.m35844a(context, new Intent().setClassName(a.f89126d, "com.google.android.gms.tapandpay.issuer.RequestDeleteTokenActivity").putExtra("extra_account_info", a.mo49209a()).putExtra("extra_card_info", a2).putExtra("extra_calling_package", this.f90413c), (int) JGCastService.FLAG_PRIVATE_DISPLAY)), Bundle.EMPTY);
    }
}
