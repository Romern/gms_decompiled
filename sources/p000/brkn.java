package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailLinkAidlRequest;

/* renamed from: brkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brkn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignInWithEmailLinkAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        EmailAuthCredential emailAuthCredential = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                emailAuthCredential = (EmailAuthCredential) sed.m34998a(parcel, readInt, EmailAuthCredential.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SignInWithEmailLinkAidlRequest(emailAuthCredential);
    }
}
