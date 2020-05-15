package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TouchEventCompleteData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nwq();

    /* renamed from: a */
    public final int f29460a;

    /* renamed from: b */
    public final Rect f29461b;

    /* renamed from: c */
    public final int f29462c;

    public TouchEventCompleteData(int i, Rect rect, int i2) {
        this.f29460a = i;
        this.f29461b = rect;
        this.f29462c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TouchEventCompleteData touchEventCompleteData = (TouchEventCompleteData) obj;
            if (this.f29460a == touchEventCompleteData.f29460a && this.f29462c == touchEventCompleteData.f29462c) {
                return Objects.equals(this.f29461b, touchEventCompleteData.f29461b);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f29460a * 31;
        Rect rect = this.f29461b;
        return ((i + (rect != null ? rect.hashCode() : 0)) * 31) + this.f29462c;
    }

    public final String toString() {
        int i = this.f29460a;
        String valueOf = String.valueOf(this.f29461b);
        int i2 = this.f29462c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78);
        sb.append("TouchEventCompleteData{hint=");
        sb.append(i);
        sb.append(", currentFocus=");
        sb.append(valueOf);
        sb.append(", direction=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f29460a);
        see.m35040a(parcel, 2, this.f29461b, i, false);
        see.m35063b(parcel, 3, this.f29462c);
        see.m35062b(parcel, a);
    }
}
