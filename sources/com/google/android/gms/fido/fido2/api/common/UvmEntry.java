package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xqu();

    /* renamed from: a */
    public int f31813a;

    /* renamed from: b */
    public short f31814b;

    /* renamed from: c */
    public short f31815c;

    public UvmEntry(int i, short s, short s2) {
        this.f31813a = i;
        this.f31814b = s;
        this.f31815c = s2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UvmEntry) {
            UvmEntry uvmEntry = (UvmEntry) obj;
            if (this.f31813a == uvmEntry.f31813a && this.f31814b == uvmEntry.f31814b && this.f31815c == uvmEntry.f31815c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31813a), Short.valueOf(this.f31814b), Short.valueOf(this.f31815c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f31813a);
        see.m35050a(parcel, 2, this.f31814b);
        see.m35050a(parcel, 3, this.f31815c);
        see.m35062b(parcel, a);
    }
}
