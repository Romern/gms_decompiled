package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;

/* renamed from: apof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apof implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClearCorpusCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ClearCorpusCall$Response(status);
    }
}
