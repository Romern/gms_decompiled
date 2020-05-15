package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: kqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FillForm[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        bmxv bmxv;
        kck kck;
        int readInt = parcel.readInt();
        bngx a = bngx.m109370a((Object[]) ((FillField[]) parcel.createTypedArray(FillField.CREATOR)));
        bmxv bmxv2 = bmvz.f131120a;
        if (parcel.readInt() == 1) {
            bmxv = bmxv.m108567c((FillField) parcel.readTypedObject(FillField.CREATOR));
        } else {
            bmxv = bmxv2;
        }
        kcv a2 = kcx.m17654a(parcel);
        if (parcel.readInt() == 1) {
            kcv a3 = kcx.m17654a(parcel);
            bmxy.m108588a(a3 instanceof kck);
            kck = (kck) a3;
        } else {
            kck = null;
        }
        return new FillForm(readInt, a, bmxv, a2, bmxv.m108567c(kck));
    }
}
