package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: arhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arhc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountBootstrapPayload[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = null;
        ArrayList arrayList3 = null;
        ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, UserBootstrapInfo.CREATOR);
                hashSet.add(2);
            } else if (a == 3) {
                arrayList2 = sed.m35005c(parcel, readInt, Challenge.CREATOR);
                hashSet.add(3);
            } else if (a == 4) {
                exchangeAssertionsForUserCredentialsRequest = (ExchangeAssertionsForUserCredentialsRequest) sed.m34998a(parcel, readInt, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                hashSet.add(4);
            } else if (a == 5) {
                arrayList3 = sed.m35005c(parcel, readInt, UserCredential.CREATOR);
                hashSet.add(5);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                exchangeSessionCheckpointsForUserCredentialsRequest = (ExchangeSessionCheckpointsForUserCredentialsRequest) sed.m34998a(parcel, readInt, ExchangeSessionCheckpointsForUserCredentialsRequest.CREATOR);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountBootstrapPayload(hashSet, arrayList, arrayList2, exchangeAssertionsForUserCredentialsRequest, arrayList3, exchangeSessionCheckpointsForUserCredentialsRequest);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
