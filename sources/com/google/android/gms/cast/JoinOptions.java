package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JoinOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pfw();

    /* renamed from: a */
    public int f29736a;

    public JoinOptions() {
        this(0);
    }

    /* renamed from: a */
    public final void mo17516a(int i) {
        if (i == 0 || i == 2) {
            this.f29736a = i;
            return;
        }
        throw new IllegalArgumentException("Invalid value for connectionType");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JoinOptions) && this.f29736a == ((JoinOptions) obj).f29736a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29736a)});
    }

    public final String toString() {
        int i = this.f29736a;
        return String.format("joinOptions(connectionType=%s)", i != 0 ? i != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG");
    }

    public JoinOptions(int i) {
        this.f29736a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f29736a);
        see.m35062b(parcel, a);
    }
}
