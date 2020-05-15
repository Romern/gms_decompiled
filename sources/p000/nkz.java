package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.car.CarCall;

/* renamed from: nkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nkz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CarCall.Details[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Uri uri = null;
        String str = null;
        String str2 = null;
        Uri uri2 = null;
        Uri uri3 = null;
        PhoneAccountHandle phoneAccountHandle = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        GatewayInfo gatewayInfo = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    uri2 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    phoneAccountHandle = (PhoneAccountHandle) sed.m34998a(parcel2, readInt, PhoneAccountHandle.CREATOR);
                    break;
                case 9:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 11:
                    bundle2 = sed.m35022s(parcel2, readInt);
                    break;
                case 12:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    gatewayInfo = (GatewayInfo) sed.m34998a(parcel2, readInt, GatewayInfo.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new CarCall.Details(uri, str, str2, j, uri2, uri3, i, phoneAccountHandle, i2, bundle, bundle2, i3, gatewayInfo);
    }
}
