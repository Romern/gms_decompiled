package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.TapEvent;
import com.google.android.gms.tapandpay.firstparty.TapFailureUiInfo;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;

/* renamed from: asos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asos implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TapEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        TapFailureUiInfo tapFailureUiInfo;
        int readInt = parcel.readInt();
        boolean z = true;
        switch (readInt) {
            case 2:
                return new TapEvent(2, -1);
            case 3:
                return new TapEvent(3, -1, (ValuableInfo[]) parcel.createTypedArray(ValuableInfo.CREATOR), null);
            case 4:
                return new TapEvent(4, -1);
            case 5:
                int readInt2 = parcel.readInt();
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null || createByteArray.length <= 0) {
                    tapFailureUiInfo = null;
                } else {
                    tapFailureUiInfo = (TapFailureUiInfo) sef.m35069a(createByteArray, TapFailureUiInfo.CREATOR);
                }
                if (readInt2 == -1) {
                    z = false;
                }
                sdo.m34974b(z);
                return new TapEvent(5, readInt2, null, tapFailureUiInfo);
            case 6:
                return new TapEvent(6, -1);
            case 7:
                int readInt3 = parcel.readInt();
                if (readInt3 == -1) {
                    z = false;
                }
                sdo.m34974b(z);
                return new TapEvent(7, readInt3);
            case 8:
                return new TapEvent(8, -1, (ValuableInfo[]) parcel.createTypedArray(ValuableInfo.CREATOR), null);
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown eventType: ");
                sb.append(readInt);
                throw new IllegalStateException(sb.toString());
        }
    }
}
