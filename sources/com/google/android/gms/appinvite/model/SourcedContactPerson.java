package com.google.android.gms.appinvite.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SourcedContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fvl();

    /* renamed from: a */
    public ContactPerson f9758a;

    /* renamed from: b */
    public int f9759b;

    public SourcedContactPerson(ContactPerson contactPerson, int i) {
        this.f9758a = contactPerson;
        this.f9759b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SourcedContactPerson sourcedContactPerson = (SourcedContactPerson) obj;
            return sdg.m34949a(this.f9758a, sourcedContactPerson.f9758a) && sdg.m34949a(Integer.valueOf(this.f9759b), Integer.valueOf(sourcedContactPerson.f9759b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9758a, Integer.valueOf(this.f9759b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourcedContactPerson{");
        if (this.f9758a != null) {
            sb.append(" person=");
            sb.append(this.f9758a.toString());
        }
        sb.append(" personSource=");
        sb.append(this.f9759b);
        sb.append(" }");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f9758a, i, false);
        see.m35063b(parcel, 3, this.f9759b);
        see.m35062b(parcel, a);
    }
}
