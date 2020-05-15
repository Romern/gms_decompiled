package com.google.android.gms.people.internal;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MatrixCursorParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alzq();

    /* renamed from: a */
    private final Cursor f81926a;

    /* renamed from: b */
    private final int f81927b;

    public MatrixCursorParcelable(Cursor cursor) {
        this.f81926a = cursor;
        this.f81927b = cursor != null ? cursor.getCount() : 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Cursor cursor = this.f81926a;
        if (cursor != null) {
            try {
                int columnCount = cursor.getColumnCount();
                parcel.writeInt(columnCount);
                parcel.writeStringArray(this.f81926a.getColumnNames());
                parcel.writeInt(this.f81927b);
                this.f81926a.moveToPosition(-1);
                while (this.f81926a.moveToNext()) {
                    Object[] objArr = new Object[columnCount];
                    for (int i2 = 0; i2 < columnCount; i2++) {
                        int type = this.f81926a.getType(i2);
                        if (type == 0) {
                            objArr[i2] = null;
                        } else if (type == 1) {
                            objArr[i2] = Integer.valueOf(this.f81926a.getInt(i2));
                        } else if (type == 2) {
                            objArr[i2] = Float.valueOf(this.f81926a.getFloat(i2));
                        } else if (type == 3) {
                            objArr[i2] = this.f81926a.getString(i2);
                        } else if (type == 4) {
                            objArr[i2] = this.f81926a.getBlob(i2);
                        }
                    }
                    parcel.writeArray(objArr);
                }
            } finally {
                this.f81926a.close();
            }
        } else {
            parcel.writeInt(0);
            parcel.writeStringArray(new String[0]);
            parcel.writeInt(0);
        }
    }
}
