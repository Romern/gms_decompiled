package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ChangesAvailableOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new upu();

    /* renamed from: a */
    public final int f30773a;

    /* renamed from: b */
    public final boolean f30774b;

    /* renamed from: c */
    final List f30775c;

    public ChangesAvailableOptions(int i, boolean z, List list) {
        this.f30773a = i;
        this.f30774b = z;
        this.f30775c = list;
    }

    /* renamed from: a */
    public final Set mo18151a() {
        return new HashSet(this.f30775c);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ChangesAvailableOptions changesAvailableOptions = (ChangesAvailableOptions) obj;
        return sdg.m34949a(this.f30775c, changesAvailableOptions.f30775c) && this.f30773a == changesAvailableOptions.f30773a && this.f30774b == changesAvailableOptions.f30774b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30775c, Integer.valueOf(this.f30773a), Boolean.valueOf(this.f30774b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f30773a);
        see.m35051a(parcel, 3, this.f30774b);
        see.m35066c(parcel, 4, this.f30775c, false);
        see.m35062b(parcel, a);
    }
}
