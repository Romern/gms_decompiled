package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.autofill.datasource.chromesync.wallet.PurchaseManagerResultTransformer;
import java.time.YearMonth;

/* renamed from: khm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class khm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PurchaseManagerResultTransformer[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        kdg kdg;
        String readString = parcel.readString();
        YearMonth yearMonth = (YearMonth) parcel.readSerializable();
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            try {
                kdg = (kdg) GeneratedMessageLite.m124014a(kdg.f23871j, createByteArray);
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) PurchaseManagerResultTransformer.f11619a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68448m();
                kdg = null;
            }
        } else {
            kdg = null;
        }
        int readInt = parcel.readInt();
        if (TextUtils.isEmpty(readString)) {
            readString = null;
        }
        if (kdg == null) {
            kdg = kdg.f23871j;
        }
        return new PurchaseManagerResultTransformer(readString, yearMonth, kdg, readInt);
    }
}
