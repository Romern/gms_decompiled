package p000;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aboe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aboe {
    /* renamed from: a */
    public static boolean m47991a(Context context) {
        abne a = abne.m47947a("REPORTING_OPT_IN_CHECK");
        try {
            if (cekz.f182874a.mo6606a().mo79252c()) {
                int i = Build.VERSION.SDK_INT;
                boolean b = m47992b(context);
                a.close();
                return b;
            }
            a.close();
            return true;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private static boolean m47992b(Context context) {
        aucb E = avtz.m79338b(context).mo24673E();
        try {
            rkj rkj = (rkj) aucu.m76783a(E, 5, TimeUnit.SECONDS);
            if (E.mo50384b()) {
                boolean r = rkj.mo24824r();
                StringBuilder sb = new StringBuilder(39);
                sb.append("User opted in to usage reporting: ");
                sb.append(r);
                sb.toString();
                int i = eoa.f15378a;
                return rkj.mo24824r();
            }
            eoa.m10828c("Herrevad", "Usage Reporting check did not succeed.", new Object[0]);
            return false;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            eoa.m10828c("Herrevad", "Usage Reporting check failed to execute.", new Object[0]);
            return false;
        }
    }
}
