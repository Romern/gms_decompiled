package com.google.android.gms.car.display;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CarDisplay extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nzx();

    /* renamed from: a */
    public final CarDisplayId f29488a;

    /* renamed from: b */
    public final int f29489b;

    /* renamed from: c */
    public final int f29490c;

    /* renamed from: d */
    public final Point f29491d;

    public CarDisplay(CarDisplayId carDisplayId, int i, int i2, Point point) {
        this.f29488a = carDisplayId;
        this.f29489b = i;
        this.f29490c = i2;
        this.f29491d = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarDisplay) {
            CarDisplay carDisplay = (CarDisplay) obj;
            return carDisplay.f29488a.equals(this.f29488a) && carDisplay.f29489b == this.f29489b && carDisplay.f29490c == this.f29490c && Objects.equals(carDisplay.f29491d, this.f29491d);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f29488a, Integer.valueOf(this.f29489b), Integer.valueOf(this.f29490c), this.f29491d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f29488a);
        int i = this.f29489b;
        int i2 = this.f29490c;
        String valueOf2 = String.valueOf(this.f29491d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 97 + String.valueOf(valueOf2).length());
        sb.append("CarDisplay{carDisplayId=");
        sb.append(valueOf);
        sb.append(", carDisplayType=");
        sb.append(i);
        sb.append(", displayDpi=");
        sb.append(i2);
        sb.append(", displayDimensions=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f29488a, i, false);
        see.m35063b(parcel, 2, this.f29489b);
        see.m35063b(parcel, 3, this.f29490c);
        see.m35040a(parcel, 4, this.f29491d, i, false);
        see.m35062b(parcel, a);
    }
}
