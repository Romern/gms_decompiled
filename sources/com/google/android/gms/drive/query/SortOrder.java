package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SortOrder extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vgf();

    /* renamed from: a */
    public final List f31094a;

    /* renamed from: b */
    public final boolean f31095b;

    public SortOrder(List list, boolean z) {
        this.f31094a = list;
        this.f31095b = z;
    }

    public final String toString() {
        return String.format(Locale.US, "SortOrder[%s, %s]", TextUtils.join(",", this.f31094a), Boolean.valueOf(this.f31095b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f31094a, false);
        see.m35051a(parcel, 2, this.f31095b);
        see.m35062b(parcel, a);
    }
}
