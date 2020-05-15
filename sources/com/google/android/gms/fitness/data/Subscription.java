package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Subscription extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxs();

    /* renamed from: a */
    public final DataSource f32176a;

    /* renamed from: b */
    public final DataType f32177b;

    /* renamed from: c */
    public final long f32178c;

    /* renamed from: d */
    public final int f32179d;

    /* renamed from: e */
    public final int f32180e;

    public Subscription(DataSource dataSource, DataType dataType, long j, int i, int i2) {
        this.f32176a = dataSource;
        this.f32177b = dataType;
        this.f32178c = j;
        this.f32179d = i;
        this.f32180e = i2;
    }

    /* renamed from: a */
    public final DataType mo18981a() {
        DataType dataType = this.f32177b;
        return dataType == null ? this.f32176a.f32005a : dataType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            return sdg.m34949a(this.f32176a, subscription.f32176a) && sdg.m34949a(this.f32177b, subscription.f32177b) && this.f32178c == subscription.f32178c && this.f32179d == subscription.f32179d && this.f32180e == subscription.f32180e;
        }
    }

    public final int hashCode() {
        DataSource dataSource = this.f32176a;
        return Arrays.hashCode(new Object[]{dataSource, dataSource, Long.valueOf(this.f32178c), Integer.valueOf(this.f32179d), Integer.valueOf(this.f32180e)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("dataSource", this.f32176a);
        a.mo25396a("dataType", this.f32177b);
        a.mo25396a("samplingIntervalMicros", Long.valueOf(this.f32178c));
        a.mo25396a("accuracyMode", Integer.valueOf(this.f32179d));
        a.mo25396a("subscriptionType", Integer.valueOf(this.f32180e));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32176a, i, false);
        see.m35040a(parcel, 2, this.f32177b, i, false);
        see.m35036a(parcel, 3, this.f32178c);
        see.m35063b(parcel, 4, this.f32179d);
        see.m35063b(parcel, 5, this.f32180e);
        see.m35062b(parcel, a);
    }
}
