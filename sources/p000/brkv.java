package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.api.aidlrequests.VerifyBeforeUpdateEmailAidlRequest;

/* renamed from: brkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brkv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VerifyBeforeUpdateEmailAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        ActionCodeSettings actionCodeSettings = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                actionCodeSettings = (ActionCodeSettings) sed.m34998a(parcel, readInt, ActionCodeSettings.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new VerifyBeforeUpdateEmailAidlRequest(str, str2, actionCodeSettings);
    }
}
