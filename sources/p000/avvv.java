package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.Position;

/* renamed from: avvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckInReport[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Position position = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                position = (Position) sed.m34998a(parcel, readInt, Position.CREATOR);
            } else if (a == 5) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 6) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a != 7) {
                sed.m35002b(parcel, readInt);
            } else {
                bArr2 = sed.m35024u(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CheckInReport(j, str, position, i, bArr, bArr2);
    }
}
