package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NotificationSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asof();

    /* renamed from: a */
    public boolean f108411a;

    /* renamed from: b */
    public boolean f108412b;

    /* renamed from: c */
    public boolean f108413c;

    public NotificationSettings(boolean z, boolean z2, boolean z3) {
        this.f108411a = z;
        this.f108412b = z2;
        this.f108413c = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NotificationSettings) {
            NotificationSettings notificationSettings = (NotificationSettings) obj;
            return this.f108411a == notificationSettings.f108411a && this.f108412b == notificationSettings.f108412b && this.f108413c == notificationSettings.f108413c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f108411a), Boolean.valueOf(this.f108412b), Boolean.valueOf(this.f108413c)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("receivesTransactionNotifications", Boolean.valueOf(this.f108411a));
        a.mo25396a("receivesPlasticTransactionNotifications", Boolean.valueOf(this.f108412b));
        a.mo25396a("receivesPromotionNotifications", Boolean.valueOf(this.f108413c));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f108411a);
        see.m35051a(parcel, 2, this.f108412b);
        see.m35051a(parcel, 3, this.f108413c);
        see.m35062b(parcel, a);
    }
}
