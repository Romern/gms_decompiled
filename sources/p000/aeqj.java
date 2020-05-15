package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;

/* renamed from: aeqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeqj extends dcj implements aeql {
    public aeqj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.reporting.internal.IReportingService");
    }

    /* renamed from: a */
    public final int mo34459a(OptInRequest optInRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, optInRequest);
        Parcel a = mo8526a(6, bj);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final ReportingState mo34460a(Account account) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, account);
        Parcel a = mo8526a(1, bj);
        ReportingState reportingState = (ReportingState) dcl.m8163a(a, ReportingState.CREATOR);
        a.recycle();
        return reportingState;
    }

    /* renamed from: a */
    public final UploadRequestResult mo34461a(UploadRequest uploadRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, uploadRequest);
        Parcel a = mo8526a(3, bj);
        UploadRequestResult uploadRequestResult = (UploadRequestResult) dcl.m8163a(a, UploadRequestResult.CREATOR);
        a.recycle();
        return uploadRequestResult;
    }
}
