package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.internal.firstparty.ShowSecurityPromptRequest;
import com.google.android.gms.tapandpay.service.TapAndPayChimeraService;

/* renamed from: atkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atkc extends atki {
    public atkc(ShowSecurityPromptRequest showSecurityPromptRequest, String str, aswm aswm) {
        super("ShowSecurityPrompt", showSecurityPromptRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49607a(status, Bundle.EMPTY);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: b */
    public final void mo50005b(Context context) {
        int i = Build.VERSION.SDK_INT;
        asjk.m74231e(context);
        if (!TapAndPayChimeraService.m93110a(context) || TapAndPayChimeraService.m93111b(context)) {
            this.f90414d.mo49607a(Status.f30107a, Bundle.EMPTY);
            return;
        }
        asjj.m74223c(context.getApplicationContext());
        sre.m36089i(context);
        AccountInfo b = asix.m74201b(context, askc.m74272b());
        Intent intent = new Intent("com.google.android.gms.tapandpay.ACTION_SHOW_SECURITY_PROMPT");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.ui.ShowSecurityPromptActivity");
        if (!asjk.m74232f(context)) {
            atah.m75277b();
        }
        intent.putExtra("extra_account_info", b).putExtra("com.google.android.gms.tapandpay.ui.EXTRA_IS_ADMIN_PROMPT", false);
        intent.addFlags(603979776);
        this.f90414d.mo49607a(new Status(6, null, spn.m35844a(context, intent, (int) JGCastService.FLAG_PRIVATE_DISPLAY)), Bundle.EMPTY);
    }
}
