package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asos();

    /* renamed from: a */
    public final int f108438a;

    /* renamed from: b */
    public final int f108439b;

    /* renamed from: c */
    public final ValuableInfo[] f108440c;

    /* renamed from: d */
    public final TapFailureUiInfo f108441d;

    public TapEvent(int i, int i2) {
        this(i, i2, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TapEvent) {
            TapEvent tapEvent = (TapEvent) obj;
            if (!sdg.m34949a(Integer.valueOf(this.f108438a), Integer.valueOf(tapEvent.f108438a)) || !sdg.m34949a(Integer.valueOf(this.f108439b), Integer.valueOf(tapEvent.f108439b)) || !Arrays.equals(this.f108440c, tapEvent.f108440c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108438a), Integer.valueOf(this.f108439b), Integer.valueOf(Arrays.deepHashCode(this.f108440c))});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("eventType", Integer.valueOf(this.f108438a));
        a.mo25396a("failedReason", Integer.valueOf(this.f108439b));
        a.mo25396a("valuableInfos", Arrays.toString(this.f108440c));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f108438a);
        int i2 = this.f108438a;
        switch (i2) {
            case 2:
            case 4:
            case 6:
                return;
            case 3:
            case 8:
                parcel.writeTypedArray(this.f108440c, i);
                return;
            case 5:
                parcel.writeInt(this.f108439b);
                TapFailureUiInfo tapFailureUiInfo = this.f108441d;
                if (tapFailureUiInfo != null) {
                    parcel.writeByteArray(sef.m35074a(tapFailureUiInfo));
                    return;
                }
                return;
            case 7:
                parcel.writeInt(this.f108439b);
                return;
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown eventType: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public TapEvent(int i, int i2, ValuableInfo[] valuableInfoArr, TapFailureUiInfo tapFailureUiInfo) {
        this.f108438a = i;
        this.f108439b = i2;
        this.f108440c = valuableInfoArr;
        this.f108441d = tapFailureUiInfo;
    }
}
