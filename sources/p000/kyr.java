package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: kyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kyr {

    /* renamed from: a */
    private static final srn f25432a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    public static void m18804a(kre kre) {
        if (ccip.m129868h()) {
            try {
                ((aeeh) kre.mo14849x().mo6445a()).mo34078a().get();
            } catch (ExecutionException e) {
                bnsl bnsl = (bnsl) f25432a.mo68387b();
                bnsl.mo68437a(e.getCause());
                bnsl.mo68432a("kyr", "a", 30, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to schedule periodic tasks");
            } catch (InterruptedException e2) {
                bnsl bnsl2 = (bnsl) f25432a.mo68387b();
                bnsl2.mo68432a("kyr", "a", 32, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Scheduling was interrupted");
                Thread.currentThread().interrupt();
            }
        } else {
            aebl aebl = new aebl();
            aebl.f63097i = "com.google.android.gms.autofill.events.AutofillGcmTaskService";
            aebl.f63099k = "PredictionDataSync";
            aebl.mo34024a(1, 1);
            aebl.mo34026a(true);
            aebl.f63070a = TimeUnit.HOURS.toSeconds(ccjs.f179198a.mo6606a().mo76149a());
            aebl.mo34027b(1);
            if (cdny.f181385a.mo6606a().mo78039j()) {
                aebl.mo34028b(0, 1);
            }
            kre.mo14842q().mo33984a(aebl.mo33974b());
        }
    }
}
