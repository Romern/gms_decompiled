package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.DeviceStatus;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.ProgressEvent;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: arhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arhk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MessagePayload[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        BootstrapOptions bootstrapOptions = null;
        BootstrapConfigurations bootstrapConfigurations = null;
        DisplayText displayText = null;
        AccountBootstrapPayload accountBootstrapPayload = null;
        ProgressEvent progressEvent = null;
        ArrayList arrayList = null;
        AccountTransferPayload accountTransferPayload = null;
        DeviceStatus deviceStatus = null;
        WorkProfilePayload workProfilePayload = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    i3 = sed.m35010g(parcel2, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    bootstrapOptions = (BootstrapOptions) sed.m34998a(parcel2, readInt, BootstrapOptions.CREATOR);
                    hashSet.add(3);
                    break;
                case 4:
                    bootstrapConfigurations = (BootstrapConfigurations) sed.m34998a(parcel2, readInt, BootstrapConfigurations.CREATOR);
                    hashSet.add(4);
                    break;
                case 5:
                    displayText = (DisplayText) sed.m34998a(parcel2, readInt, DisplayText.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    accountBootstrapPayload = (AccountBootstrapPayload) sed.m34998a(parcel2, readInt, AccountBootstrapPayload.CREATOR);
                    hashSet.add(6);
                    break;
                case 7:
                    i2 = sed.m35010g(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    progressEvent = (ProgressEvent) sed.m34998a(parcel2, readInt, ProgressEvent.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    z = sed.m35006c(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    arrayList = sed.m35005c(parcel2, readInt, AccountTransferResult.CREATOR);
                    hashSet.add(10);
                    break;
                case 11:
                    accountTransferPayload = (AccountTransferPayload) sed.m34998a(parcel2, readInt, AccountTransferPayload.CREATOR);
                    hashSet.add(11);
                    break;
                case 12:
                    deviceStatus = (DeviceStatus) sed.m34998a(parcel2, readInt, DeviceStatus.CREATOR);
                    hashSet.add(12);
                    break;
                case 13:
                    workProfilePayload = (WorkProfilePayload) sed.m34998a(parcel2, readInt, WorkProfilePayload.CREATOR);
                    hashSet.add(13);
                    deviceStatus = deviceStatus;
                    break;
                case 14:
                    arrayList2 = sed.m35005c(parcel2, readInt, EsimActivationPayload.CREATOR);
                    hashSet.add(14);
                    deviceStatus = deviceStatus;
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        DeviceStatus deviceStatus2 = deviceStatus;
        if (parcel.dataPosition() == b) {
            return new MessagePayload(hashSet, i, i2, i3, bootstrapOptions, bootstrapConfigurations, displayText, accountBootstrapPayload, progressEvent, z, arrayList, accountTransferPayload, deviceStatus2, workProfilePayload, arrayList2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
