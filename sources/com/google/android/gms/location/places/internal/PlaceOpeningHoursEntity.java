package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceOpeningHoursEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeog();

    /* renamed from: a */
    public final List f79560a;

    /* renamed from: b */
    public final List f79561b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class BusinessHoursInterval extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new aems();

        /* renamed from: a */
        public final int f79562a;

        /* renamed from: b */
        public final int f79563b;

        public BusinessHoursInterval(int i, int i2) {
            this.f79562a = i;
            this.f79563b = i2;
        }

        /* renamed from: a */
        public static BusinessHoursInterval m66966a(int i, int i2) {
            return new BusinessHoursInterval(i, i2);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f79562a);
            see.m35063b(parcel, 2, this.f79563b);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ExceptionalHours extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new aemt();

        /* renamed from: a */
        public final int f79564a;

        /* renamed from: b */
        public final int f79565b;

        /* renamed from: c */
        public final int f79566c;

        /* renamed from: d */
        public final int f79567d;

        /* renamed from: e */
        public final int f79568e;

        /* renamed from: f */
        public final int f79569f;

        /* renamed from: g */
        public final List f79570g;

        public ExceptionalHours(int i, int i2, int i3, int i4, int i5, int i6, List list) {
            this.f79564a = i;
            this.f79565b = i2;
            this.f79566c = i3;
            this.f79567d = i4;
            this.f79568e = i5;
            this.f79569f = i6;
            this.f79570g = Collections.unmodifiableList(list);
        }

        /* renamed from: a */
        public static ExceptionalHours m66967a(int i, int i2, int i3, int i4, int i5, int i6, List list) {
            return new ExceptionalHours(i, i2, i3, i4, i5, i6, list);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f79564a);
            see.m35063b(parcel, 2, this.f79565b);
            see.m35063b(parcel, 3, this.f79566c);
            see.m35063b(parcel, 4, this.f79567d);
            see.m35063b(parcel, 5, this.f79568e);
            see.m35063b(parcel, 6, this.f79569f);
            see.m35066c(parcel, 7, this.f79570g, false);
            see.m35062b(parcel, a);
        }
    }

    public PlaceOpeningHoursEntity(List list, List list2) {
        this.f79560a = Collections.unmodifiableList(list);
        this.f79561b = Collections.unmodifiableList(list2);
    }

    /* renamed from: a */
    public static PlaceOpeningHoursEntity m66965a(List list, List list2) {
        return new PlaceOpeningHoursEntity(list, list2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f79560a, false);
        see.m35066c(parcel, 2, this.f79561b, false);
        see.m35062b(parcel, a);
    }
}
