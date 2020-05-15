package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.ArrayList;

/* renamed from: xyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xyn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignRequestParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Integer num = null;
        Double d = null;
        Uri uri = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        ChannelIdValue channelIdValue = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 3:
                    d = sed.m35018o(parcel, readInt);
                    break;
                case 4:
                    uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 6:
                    arrayList = sed.m35005c(parcel, readInt, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) sed.m34998a(parcel, readInt, ChannelIdValue.CREATOR);
                    break;
                case 8:
                    str = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new SignRequestParams(num, d, uri, bArr, arrayList, channelIdValue, str);
    }
}
