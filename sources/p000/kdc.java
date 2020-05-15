package p000;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.data.PaymentCard;
import java.time.YearMonth;

/* renamed from: kdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PaymentCard[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        YearMonth yearMonth;
        kdg kdg;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        kdj kdj = null;
        if (parcel.readInt() == 1) {
            yearMonth = YearMonth.of(parcel.readInt(), parcel.readInt());
        } else {
            yearMonth = null;
        }
        if (parcel.readInt() == 1) {
            try {
                kdg = (kdg) bxvk.m124016a(kdg.f23871j, parcel.createByteArray(), bxus.m123744c());
            } catch (bxwf e) {
                throw new BadParcelableException(e);
            }
        } else {
            kdg = null;
        }
        int readInt = parcel.readInt();
        kdj kdj2 = new kdj(readString);
        if (readString2 != null) {
            kdj = new kdj(readString2);
        }
        return new PaymentCard(kdj2, kdj, readString3, yearMonth, kdg, readInt);
    }
}
