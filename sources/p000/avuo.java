package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.List;

/* renamed from: avuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class avuo extends dck implements avup {
    public avuo() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    /* renamed from: a */
    public void mo51620a(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    /* renamed from: b */
    public void mo51624b(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    /* renamed from: c */
    public void mo51625c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    /* renamed from: d */
    public final void mo51626d(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    /* renamed from: a */
    public void mo51621a(Status status, ConsentInformation consentInformation) {
        throw new IllegalStateException("Not implemented");
    }

    /* renamed from: a */
    public void mo51622a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        throw new IllegalStateException("Not implemented.");
    }

    /* renamed from: a */
    public final void mo51623a(Status status, List list) {
        throw new IllegalStateException("Not implemented.");
    }

    /* renamed from: a */
    public void mo51616a(Status status, boolean z, ConsentInformation consentInformation) {
        throw new IllegalStateException("Not implemented.");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                mo51622a((Status) dcl.m8163a(parcel, Status.CREATOR), (UsageReportingOptInOptions) dcl.m8163a(parcel, UsageReportingOptInOptions.CREATOR));
                return true;
            case 3:
                mo51620a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 4:
                mo51624b((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 5:
                mo51625c((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo51623a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createStringArrayList());
                return true;
            case 7:
                mo51626d((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 8:
                mo51616a((Status) dcl.m8163a(parcel, Status.CREATOR), dcl.m8167a(parcel), (ConsentInformation) dcl.m8163a(parcel, ConsentInformation.CREATOR));
                return true;
            case 9:
                mo51621a((Status) dcl.m8163a(parcel, Status.CREATOR), (ConsentInformation) dcl.m8163a(parcel, ConsentInformation.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
