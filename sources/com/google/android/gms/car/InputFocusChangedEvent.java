package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InputFocusChangedEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ntk();

    /* renamed from: a */
    public final boolean f29409a;

    /* renamed from: b */
    public final boolean f29410b;

    /* renamed from: c */
    public final int f29411c;

    /* renamed from: d */
    public final Rect f29412d;

    public InputFocusChangedEvent(boolean z, boolean z2, int i, Rect rect) {
        this.f29409a = z;
        this.f29410b = z2;
        this.f29411c = i;
        this.f29412d = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InputFocusChangedEvent inputFocusChangedEvent = (InputFocusChangedEvent) obj;
            if (this.f29409a == inputFocusChangedEvent.f29409a && this.f29410b == inputFocusChangedEvent.f29410b && this.f29411c == inputFocusChangedEvent.f29411c) {
                return Objects.equals(this.f29412d, inputFocusChangedEvent.f29412d);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((this.f29409a ? 1 : 0) * true) + (this.f29410b ? 1 : 0)) * 31) + this.f29411c) * 31;
        Rect rect = this.f29412d;
        return i + (rect != null ? rect.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.f29409a;
        boolean z2 = this.f29410b;
        int i = this.f29411c;
        String valueOf = String.valueOf(this.f29412d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93);
        sb.append("InputFocusChangedEvent{focused=");
        sb.append(z);
        sb.append(", inTouchMode=");
        sb.append(z2);
        sb.append(", direction=");
        sb.append(i);
        sb.append(", focusedRect=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f29409a);
        see.m35051a(parcel, 2, this.f29410b);
        see.m35063b(parcel, 3, this.f29411c);
        see.m35040a(parcel, 4, this.f29412d, i, false);
        see.m35062b(parcel, a);
    }
}
