package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* renamed from: ggq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ggq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LogAuditRecordsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        byte[][] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    bArr = sed.m35024u(parcel, readInt);
                    break;
                case 5:
                    bArr2 = sed.m35023t(parcel, readInt);
                    break;
                case 6:
                    bArr3 = sed.m35023t(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new LogAuditRecordsRequest(i, i2, str, bArr, bArr2, bArr3);
    }
}
