package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xqt();

    /* renamed from: a */
    public final List f31812a;

    public UvmEntries(List list) {
        this.f31812a = list;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.f31812a;
        if (list2 == null && uvmEntries.f31812a == null) {
            return true;
        }
        if (list2 == null || (list = uvmEntries.f31812a) == null || !list2.containsAll(list) || !uvmEntries.f31812a.containsAll(this.f31812a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f31812a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f31812a, false);
        see.m35062b(parcel, a);
    }
}
