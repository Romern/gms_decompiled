package p000;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.data.Credential;

/* renamed from: kcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (kcv.class.getClassLoader() != null) {
            kcv a = kcx.m17654a(parcel);
            int readInt = parcel.readInt();
            kcv[] kcvArr = new kcv[readInt];
            for (int i = 0; i < readInt; i++) {
                kcvArr[i] = kcx.m17654a(parcel);
            }
            if (readString == null || readString2 == null) {
                throw new BadParcelableException("Parcel does not contain correct values");
            }
            bnia c = bnic.m109499c(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                c.mo67629b(kcvArr[i2]);
            }
            return new Credential(readString, new kdj(readString2), a, c.mo67751a());
        }
        throw new NullPointerException("Could not obtain ClassLoader");
    }
}
