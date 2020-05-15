package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxq();

    /* renamed from: a */
    public final Session f32174a;

    /* renamed from: b */
    public final DataSet f32175b;

    public SessionDataSet(Session session, DataSet dataSet) {
        this.f32174a = session;
        this.f32175b = dataSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SessionDataSet) {
            SessionDataSet sessionDataSet = (SessionDataSet) obj;
            return sdg.m34949a(this.f32174a, sessionDataSet.f32174a) && sdg.m34949a(this.f32175b, sessionDataSet.f32175b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32174a, this.f32175b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("session", this.f32174a);
        a.mo25396a("dataSet", this.f32175b);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32174a, i, false);
        see.m35040a(parcel, 2, this.f32175b, i, false);
        see.m35062b(parcel, a);
    }
}
