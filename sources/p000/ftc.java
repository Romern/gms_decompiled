package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;

/* renamed from: ftc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ftc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UsageInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        DocumentId documentId = null;
        String str = null;
        DocumentContents documentContents = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = -1;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    documentId = (DocumentId) sed.m34998a(parcel2, readInt, DocumentId.CREATOR);
                    break;
                case 2:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    documentContents = (DocumentContents) sed.m34998a(parcel2, readInt, DocumentContents.CREATOR);
                    break;
                case 6:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new UsageInfo(documentId, j, i, str, documentContents, z, i2, i3, str2);
    }
}
