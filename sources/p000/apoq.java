package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;

/* renamed from: apoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apoq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusInfoCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        RegisterCorpusInfo registerCorpusInfo = null;
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
                registerCorpusInfo = (RegisterCorpusInfo) sed.m34998a(parcel, readInt, RegisterCorpusInfo.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new RegisterCorpusInfoCall$Request(str, str2, registerCorpusInfo);
    }
}
