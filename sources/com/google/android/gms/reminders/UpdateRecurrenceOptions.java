package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateRecurrenceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aose();

    /* renamed from: a */
    public final int f107053a;

    /* renamed from: b */
    public final boolean f107054b;

    /* renamed from: c */
    public final Long f107055c;

    static {
        new UpdateRecurrenceOptions(null, null, null);
    }

    public UpdateRecurrenceOptions(Integer num, Boolean bool, Long l) {
        boolean z = false;
        boolean z2 = true;
        if (!(num == null || num.intValue() == 0 || num.intValue() == 1)) {
            z2 = false;
        }
        sdo.m34975b(z2, "Invalid update mode");
        this.f107053a = num != null ? num.intValue() : 0;
        this.f107054b = bool != null ? bool.booleanValue() : z;
        this.f107055c = l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f107053a);
        see.m35051a(parcel, 3, this.f107054b);
        see.m35045a(parcel, 4, this.f107055c);
        see.m35062b(parcel, a);
    }
}
