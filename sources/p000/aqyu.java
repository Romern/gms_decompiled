package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.AdvertisementOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.CompanionApp;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aqyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqyu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BootstrapOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        boolean z = false;
        ArrayList arrayList = null;
        String str = null;
        CompanionApp companionApp = null;
        PostTransferAction postTransferAction = null;
        byte[] bArr = null;
        EsimActivationInfo esimActivationInfo = null;
        AdvertisementOptions advertisementOptions = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        byte b2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z7 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel2, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    z = sed.m35006c(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    arrayList = sed.m34992D(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    b2 = sed.m35008e(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    companionApp = (CompanionApp) sed.m34998a(parcel2, readInt, CompanionApp.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    z2 = sed.m35006c(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    i3 = sed.m35010g(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    i4 = sed.m35010g(parcel2, readInt);
                    hashSet.add(11);
                    break;
                case 12:
                    j = sed.m35012i(parcel2, readInt);
                    hashSet.add(12);
                    break;
                case 13:
                    z3 = sed.m35006c(parcel2, readInt);
                    hashSet.add(13);
                    break;
                case 14:
                    z4 = sed.m35006c(parcel2, readInt);
                    hashSet.add(14);
                    break;
                case 15:
                    z5 = sed.m35006c(parcel2, readInt);
                    hashSet.add(15);
                    break;
                case 16:
                    z6 = sed.m35006c(parcel2, readInt);
                    hashSet.add(16);
                    break;
                case 17:
                    i5 = sed.m35010g(parcel2, readInt);
                    hashSet.add(17);
                    break;
                case 18:
                    j2 = sed.m35012i(parcel2, readInt);
                    hashSet.add(18);
                    break;
                case 19:
                    i6 = sed.m35010g(parcel2, readInt);
                    hashSet.add(19);
                    break;
                case 20:
                    j3 = sed.m35012i(parcel2, readInt);
                    hashSet.add(20);
                    break;
                case 21:
                    postTransferAction = (PostTransferAction) sed.m34998a(parcel2, readInt, PostTransferAction.CREATOR);
                    hashSet.add(21);
                    j = j;
                    break;
                case 22:
                    bArr = sed.m35023t(parcel2, readInt);
                    hashSet.add(22);
                    break;
                case 23:
                    esimActivationInfo = (EsimActivationInfo) sed.m34998a(parcel2, readInt, EsimActivationInfo.CREATOR);
                    hashSet.add(23);
                    j = j;
                    break;
                case 24:
                    advertisementOptions = (AdvertisementOptions) sed.m34998a(parcel2, readInt, AdvertisementOptions.CREATOR);
                    hashSet.add(24);
                    j = j;
                    break;
                case 25:
                    i7 = sed.m35010g(parcel2, readInt);
                    hashSet.add(25);
                    break;
                case 26:
                    z7 = sed.m35006c(parcel2, readInt);
                    hashSet.add(26);
                    break;
                case 27:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(27);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        long j4 = j;
        if (parcel.dataPosition() == b) {
            return new BootstrapOptions(hashSet, i, i2, z, arrayList, b2, str, companionApp, z2, i3, i4, j4, z3, z4, z5, z6, i5, j2, i6, j3, postTransferAction, bArr, esimActivationInfo, advertisementOptions, i7, z7, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
