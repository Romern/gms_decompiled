package p000;

import android.database.MatrixCursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.internal.MatrixCursorParcelable;

/* renamed from: alzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alzq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MatrixCursorParcelable[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        int readInt2 = parcel.readInt();
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        if (readInt == 0 && readInt2 == 0) {
            matrixCursor = null;
        } else {
            for (int i = 0; i < readInt2; i++) {
                matrixCursor.addRow(parcel.readArray(Object.class.getClassLoader()));
            }
        }
        return new MatrixCursorParcelable(matrixCursor);
    }
}
