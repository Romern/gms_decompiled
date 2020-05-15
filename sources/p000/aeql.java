package p000;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;

/* renamed from: aeql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aeql extends IInterface {
    /* renamed from: a */
    int mo34459a(OptInRequest optInRequest);

    /* renamed from: a */
    ReportingState mo34460a(Account account);

    /* renamed from: a */
    UploadRequestResult mo34461a(UploadRequest uploadRequest);
}
