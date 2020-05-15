package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContextFenceRegistrationStub extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tkk();

    /* renamed from: a */
    public final String f30625a;

    /* renamed from: b */
    public ContextFenceStub f30626b;

    /* renamed from: c */
    public final long f30627c;

    public ContextFenceRegistrationStub(String str, ContextFenceStub contextFenceStub, long j) {
        this.f30625a = str;
        this.f30626b = contextFenceStub;
        this.f30627c = j;
    }

    /* renamed from: a */
    public static ContextFenceRegistrationStub m22861a(String str, long j, ContextFenceStub contextFenceStub) {
        sdo.m34977c(str);
        sdo.m34959a(contextFenceStub);
        return new ContextFenceRegistrationStub(str, contextFenceStub, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContextFenceRegistrationStub) {
            ContextFenceRegistrationStub contextFenceRegistrationStub = (ContextFenceRegistrationStub) obj;
            return TextUtils.equals(this.f30625a, contextFenceRegistrationStub.f30625a) && this.f30627c == contextFenceRegistrationStub.f30627c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30625a, Long.valueOf(this.f30627c)});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f30625a, false);
        see.m35040a(parcel, 3, this.f30626b, i, false);
        see.m35036a(parcel, 4, this.f30627c);
        see.m35062b(parcel, a);
    }
}
