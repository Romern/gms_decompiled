package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ocr.credit.base.CreditCardResult;
import com.google.android.gms.ocr.credit.base.ExpDateResult;
import com.google.android.gms.ocr.credit.base.NameResult;
import com.google.android.gms.ocr.credit.base.PanResult;
import java.util.ArrayList;

/* renamed from: aksp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aksp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int length;
        CreditCardResult creditCardResult = new CreditCardResult((PanResult) parcel.readParcelable(PanResult.class.getClassLoader()), (ExpDateResult) parcel.readParcelable(ExpDateResult.class.getClassLoader()), (NameResult) parcel.readParcelable(NameResult.class.getClassLoader()), parcel.readInt());
        int[] createIntArray = parcel.createIntArray();
        if (createIntArray.length == 1) {
            creditCardResult.f81292h = Integer.valueOf(createIntArray[0]);
        }
        int[] createIntArray2 = parcel.createIntArray();
        int[] createIntArray3 = parcel.createIntArray();
        if (createIntArray2 != null && createIntArray3 != null && (length = createIntArray2.length) == createIntArray3.length && length != 0) {
            creditCardResult.f81288d = new ArrayList(length);
            int i = 0;
            while (true) {
                int length2 = createIntArray2.length;
                if (i >= length2) {
                    break;
                }
                creditCardResult.f81288d.add(new ExpDateResult(new akst(createIntArray2[i], createIntArray3[i] % 100, 1).toString(), 1, (double) (length2 - i), null, null));
                i++;
            }
        } else {
            ArrayList arrayList = creditCardResult.f81288d;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        String[] createStringArray = parcel.createStringArray();
        if (createStringArray != null) {
            creditCardResult.f81290f = new ArrayList(createStringArray.length);
            int i2 = 0;
            while (true) {
                int length3 = createStringArray.length;
                if (i2 >= length3) {
                    break;
                }
                ArrayList arrayList2 = creditCardResult.f81290f;
                String str = createStringArray[i2];
                arrayList2.add(new NameResult(str, str, false, 1, (double) (length3 - i2)));
                i2++;
            }
        } else {
            ArrayList arrayList3 = creditCardResult.f81290f;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
        }
        String[] createStringArray2 = parcel.createStringArray();
        if (createStringArray2 != null) {
            creditCardResult.f81286b = new ArrayList(createStringArray2.length);
            int i3 = 0;
            while (true) {
                int length4 = createStringArray2.length;
                if (i3 >= length4) {
                    break;
                }
                creditCardResult.f81286b.add(new PanResult(createStringArray2[i3], 1.0d, (double) (length4 - i3)));
                i3++;
            }
        } else {
            ArrayList arrayList4 = creditCardResult.f81286b;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
        }
        return creditCardResult;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CreditCardResult[i];
    }
}
