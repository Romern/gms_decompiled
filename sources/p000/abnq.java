package p000;

import android.accounts.Account;
import com.google.android.gms.location.reporting.ReportingState;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: abnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abnq {

    /* renamed from: a */
    private static rjx f57746a;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r10 = p000.eoa.f15378a;
     */
    /* renamed from: a */
    public static boolean m47960a(Account[] accountArr) {
        boolean z;
        abne a = abne.m47947a("LOCATION_REPORTING_ENABLED_FOR_ALL");
        try {
            sdo.m34973b("Must not call canUploadLocation() from main thread");
            int length = accountArr.length;
            ReportingState[] reportingStateArr = new ReportingState[length];
            z = false;
            int i = 0;
            while (i < accountArr.length) {
                if (f57746a == null) {
                    f57746a = abnp.f57745a;
                }
                try {
                    reportingStateArr[i] = (ReportingState) aucu.m76783a(f57746a.mo24736c(accountArr[i]), celh.f182898a.mo6606a().mo79275f(), TimeUnit.MILLISECONDS);
                    i++;
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    eoa.m10824a("Herrevad", "Error calling ReportingServices", e);
                    aylp a2 = abnd.m47941a();
                    ((beon) a2.f97910l.mo6606a()).mo60861b(e.getClass().getSimpleName());
                }
            }
            if (length != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        int i3 = eoa.f15378a;
                        z = true;
                        break;
                    }
                    ReportingState reportingState = reportingStateArr[i2];
                    if (reportingState != null) {
                        if (!reportingState.f79601b) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            } else {
                int i4 = eoa.f15378a;
            }
        } catch (IllegalStateException e2) {
            int i5 = eoa.f15378a;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        a.close();
        return z;
    }
}
