package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.sharedpreferences.Change;

/* renamed from: lhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lhq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Change.Put[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String readString = parcel.readString();
        if (readString != null) {
            byte readByte = parcel.readByte();
            boolean z = true;
            if (readByte == 1) {
                obj = null;
            } else if (readByte == 2) {
                if (parcel.readByte() == 0) {
                    z = false;
                }
                obj = Boolean.valueOf(z);
            } else if (readByte == 3) {
                obj = Float.valueOf(parcel.readFloat());
            } else if (readByte == 4) {
                obj = Integer.valueOf(parcel.readInt());
            } else if (readByte == 5) {
                obj = Long.valueOf(parcel.readLong());
            } else if (readByte == 6) {
                obj = parcel.readString();
            } else if (readByte == 7) {
                obj = bnic.m109496a((Object[]) parcel.createStringArray());
            } else {
                throw new IllegalStateException();
            }
            return new Change.Put(readString, obj);
        }
        throw new IllegalStateException();
    }
}
