package p000;

import android.content.Context;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgp extends abgl {

    /* renamed from: f */
    private final GoogleHelp f57421f;

    public abgp(GoogleHelpChimeraService googleHelpChimeraService, String str, abcf abcf, GoogleHelp googleHelp) {
        super("ProcessGoogleHelpAndPipOperation", googleHelpChimeraService, str, abcf);
        this.f57421f = googleHelp;
    }

    /* renamed from: a */
    public static void m47693a(GoogleHelp googleHelp, String str, Context context) {
        aare aare = new aare(googleHelp);
        aare.f56363a.f78752C = (int) ceeg.f182447a.mo6606a().mo78948P();
        if (googleHelp.f78779v != null) {
            ErrorReport i = aare.mo31643i();
            rfz.m33557a(context).mo24605a(str);
            ErrorReport errorReport = new ErrorReport();
            aayh.m47250a(errorReport, i, context);
            errorReport.f31536a.packageName = str;
            errorReport.f31527R = str;
            errorReport.f31536a.type = 11;
            errorReport.f31536a.installerPackageName = context.getPackageManager().getInstallerPackageName(str);
            errorReport.f31533X = i.f31533X;
            aare.f56363a.f78779v = errorReport;
        }
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        m47693a(this.f57421f, this.f57413d, this.f57412a);
        this.f57414e.mo31999a(this.f57421f);
    }
}
