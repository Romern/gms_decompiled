package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.family.v2.model.BulletPoint */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BulletPoint implements Parcelable {
    public static final Parcelable.Creator CREATOR = new wqm();

    /* renamed from: a */
    public HashMap f31429a = new HashMap();

    public BulletPoint(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f31429a.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof BulletPoint) && ((BulletPoint) obj).f31429a.equals(this.f31429a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31429a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31429a.size());
        for (Map.Entry entry : this.f31429a.entrySet()) {
            parcel.writeInt(((Integer) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
    }

    public BulletPoint(brdx brdx) {
        if (brdx.f142576a.size() != 0) {
            bxwc bxwc = brdx.f142576a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                brdy brdy = (brdy) bxwc.get(i);
                HashMap hashMap = this.f31429a;
                int a = brea.m113921a(brdy.f142579a);
                if (a == 0) {
                    a = 1;
                }
                hashMap.put(Integer.valueOf(a - 1), brdy.f142580b);
            }
        }
    }
}
