package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tapandpay.internal.firstparty.AddOtherPaymentOptionRequest;
import com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity;

/* renamed from: atij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atij extends atki {

    /* renamed from: a */
    private final AddOtherPaymentOptionRequest f90398a;

    public atij(AddOtherPaymentOptionRequest addOtherPaymentOptionRequest, String str, aswm aswm) {
        super("AddOtherPaymentOption", addOtherPaymentOptionRequest, str, aswm);
        this.f90398a = addOtherPaymentOptionRequest;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        Intent intent;
        SafeParcelable safeParcelable;
        String str;
        String str2 = this.f90413c;
        if (!(!"com.google.android.gms".equals(str2) || (safeParcelable = this.f90410b) == null || (str = ((AddOtherPaymentOptionRequest) safeParcelable).f108523b) == null)) {
            str2 = str;
        }
        askf b = askg.m74283b(context, str2);
        if (b == null) {
            this.f90414d.mo49607a(new Status(15002), Bundle.EMPTY);
            return;
        }
        boolean b2 = cgxf.m147444b();
        int i = this.f90398a.f108522a;
        if (i != 2 || !b2) {
            intent = i != 1 ? null : b2 ? new Intent().setClassName(context, "com.google.android.gms.tapandpay.settings.SelectOtherPaymentMethodActivity") : null;
        } else {
            intent = AccountSetupChimeraActivity.m93191a(b, 1, 0, null, str2);
        }
        if (intent != null) {
            intent.putExtra("extra_account_info", b.mo49209a()).putExtra("extra_calling_package", str2);
            this.f90414d.mo49607a(new Status(6, null, spn.m35844a(context, intent, (int) JGCastService.FLAG_PRIVATE_DISPLAY)), Bundle.EMPTY);
            return;
        }
        this.f90414d.mo49607a(new Status(10), Bundle.EMPTY);
    }
}
