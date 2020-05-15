package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SaveTicketCentricIntentArgs;

/* renamed from: algb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class algb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SaveTicketCentricIntentArgs[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ProtoSafeParcelable protoSafeParcelable = null;
        ProtoSafeParcelable protoSafeParcelable2 = null;
        String str = null;
        byte[] bArr = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    protoSafeParcelable = (ProtoSafeParcelable) sed.m34998a(parcel, readInt, ProtoSafeParcelable.CREATOR);
                    break;
                case 2:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 5:
                    protoSafeParcelable2 = (ProtoSafeParcelable) sed.m34998a(parcel, readInt, ProtoSafeParcelable.CREATOR);
                    break;
                case 6:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new SaveTicketCentricIntentArgs(protoSafeParcelable, j, z, i, protoSafeParcelable2, str, bArr);
    }
}
