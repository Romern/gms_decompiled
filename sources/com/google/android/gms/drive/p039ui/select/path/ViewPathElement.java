package com.google.android.gms.drive.p039ui.select.path;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.Filter;

/* renamed from: com.google.android.gms.drive.ui.select.path.ViewPathElement */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ViewPathElement implements PathElement {
    public static final Parcelable.Creator CREATOR = new vns();

    /* renamed from: a */
    public final int f31217a;

    /* renamed from: b */
    private final int f31218b;

    /* renamed from: c */
    private final Filter f31219c;

    /* renamed from: d */
    private final voc f31220d;

    public ViewPathElement(int i, int i2, Filter filter, voc voc) {
        this.f31218b = i;
        this.f31217a = i2;
        this.f31219c = filter;
        this.f31220d = voc;
    }

    /* renamed from: a */
    public final String mo18341a(Context context) {
        return context.getResources().getString(this.f31218b);
    }

    /* renamed from: b */
    public final Filter mo18342b() {
        return this.f31219c;
    }

    /* renamed from: c */
    public final voc mo18343c() {
        return this.f31220d;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        while (true) {
            int length = vnr.f49589d.length;
            if (i2 >= 4) {
                return;
            }
            if (vnr.f49589d[i2] != this) {
                i2++;
            } else {
                parcel.writeInt(i2);
                return;
            }
        }
    }
}
