package p000;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class wzd extends dck implements wze {
    public wzd() {
        super("com.google.android.gms.feedback.internal.IFeedbackService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                boolean a = mo29477a((ErrorReport) dcl.m8163a(parcel, ErrorReport.CREATOR));
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 2:
            default:
                return false;
            case 3:
                boolean b = mo29478b((ErrorReport) dcl.m8163a(parcel, ErrorReport.CREATOR));
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b);
                return true;
            case 4:
                mo29473a((Bundle) dcl.m8163a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                mo29476a((FeedbackOptions) dcl.m8163a(parcel, FeedbackOptions.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 6:
                mo29474a((ErrorReport) dcl.m8163a(parcel, ErrorReport.CREATOR), parcel.readLong());
                return true;
            case 7:
                boolean b2 = mo29479b((FeedbackOptions) dcl.m8163a(parcel, FeedbackOptions.CREATOR));
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b2);
                return true;
            case 8:
                mo29475a((FeedbackOptions) dcl.m8163a(parcel, FeedbackOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
