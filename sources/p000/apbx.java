package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.DeviceVersionEntity;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.ArrayList;

/* renamed from: apbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apbx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BackedUpContactsPerDeviceEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        Long l2 = null;
        Long l3 = null;
        DeviceVersionEntity deviceVersionEntity = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    arrayList = sed.m35005c(parcel, readInt, SourceStatsEntity.CREATOR);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    l2 = sed.m35013j(parcel, readInt);
                    break;
                case 6:
                    l3 = sed.m35013j(parcel, readInt);
                    break;
                case 7:
                    l = sed.m35013j(parcel, readInt);
                    break;
                case 8:
                    deviceVersionEntity = (DeviceVersionEntity) sed.m34998a(parcel, readInt, DeviceVersionEntity.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new BackedUpContactsPerDeviceEntity(str, l, arrayList, str2, l2, l3, deviceVersionEntity);
    }
}
