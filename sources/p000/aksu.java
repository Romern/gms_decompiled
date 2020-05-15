package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ocr.credit.base.DeviceAccountName;
import com.google.android.gms.ocr.credit.base.NameResult;

/* renamed from: aksu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aksu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NameResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        double readDouble = parcel.readDouble();
        DeviceAccountName deviceAccountName = (DeviceAccountName) parcel.readParcelable(DeviceAccountName.class.getClassLoader());
        boolean z = true;
        if (readInt != 1) {
            z = false;
        }
        NameResult nameResult = new NameResult(readString, readString2, z, readInt2, readDouble);
        nameResult.f81307g = deviceAccountName;
        return nameResult;
    }
}
