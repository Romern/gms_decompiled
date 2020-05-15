package p000;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.orchestration.WriteDocumentServerRequest;

/* renamed from: awws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awws implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WriteDocumentServerRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new WriteDocumentServerRequest((Account) Account.CREATOR.createFromParcel(parcel), parcel.createByteArray(), (Uri) Uri.CREATOR.createFromParcel(parcel), parcel.readString());
    }
}
