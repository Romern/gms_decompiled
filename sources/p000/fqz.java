package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

/* renamed from: fqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fqz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DocumentSection[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        RegisterSectionInfo registerSectionInfo = null;
        byte[] bArr = null;
        int i = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                registerSectionInfo = (RegisterSectionInfo) sed.m34998a(parcel, readInt, RegisterSectionInfo.CREATOR);
            } else if (a == 4) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                bArr = sed.m35023t(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new DocumentSection(str, registerSectionInfo, i, bArr);
    }
}
