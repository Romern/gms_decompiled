package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnapshotRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lsa();

    /* renamed from: a */
    public final int f11730a;

    /* renamed from: b */
    public final ArrayList f11731b;

    /* renamed from: c */
    public final int f11732c;

    /* renamed from: d */
    public long f11733d;

    public SnapshotRequest() {
        this.f11730a = 10005;
        this.f11731b = null;
        this.f11732c = 0;
        this.f11733d = 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SnapshotRequest) {
            SnapshotRequest snapshotRequest = (SnapshotRequest) obj;
            if (this.f11732c == snapshotRequest.f11732c && this.f11730a == snapshotRequest.f11730a) {
                ArrayList arrayList = this.f11731b;
                if (arrayList == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (snapshotRequest.f11731b == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(z ^ z2)) {
                    if (arrayList != null) {
                        if (arrayList.size() == snapshotRequest.f11731b.size()) {
                            ArrayList arrayList2 = this.f11731b;
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                i++;
                                if (!snapshotRequest.f11731b.contains((BeaconStateImpl.TypeFilterImpl) arrayList2.get(i))) {
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        ArrayList arrayList = this.f11731b;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((BeaconStateImpl.TypeFilterImpl) arrayList.get(i2)).hashCode() * 13;
            }
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11730a), Integer.valueOf(i), Integer.valueOf(this.f11732c)});
    }

    public SnapshotRequest(int i, ArrayList arrayList, int i2) {
        this.f11730a = i;
        this.f11731b = arrayList;
        this.f11732c = i2;
        this.f11733d = 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f11730a);
        see.m35066c(parcel, 3, this.f11731b, false);
        see.m35063b(parcel, 4, this.f11732c);
        see.m35062b(parcel, a);
    }
}
