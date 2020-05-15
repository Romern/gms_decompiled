package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionReadResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zgb();

    /* renamed from: a */
    public final List f32359a;

    /* renamed from: b */
    public final List f32360b;

    /* renamed from: c */
    public final Status f32361c;

    public SessionReadResult(List list, List list2, Status status) {
        this.f32359a = list;
        this.f32360b = Collections.unmodifiableList(list2);
        this.f32361c = status;
    }

    /* renamed from: a */
    public static SessionReadResult m23728a(Status status) {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32361c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SessionReadResult)) {
                return false;
            }
            SessionReadResult sessionReadResult = (SessionReadResult) obj;
            if (!this.f32361c.equals(sessionReadResult.f32361c) || !sdg.m34949a(this.f32359a, sessionReadResult.f32359a) || !sdg.m34949a(this.f32360b, sessionReadResult.f32360b)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32361c, this.f32359a, this.f32360b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f32361c);
        a.mo25396a("sessions", this.f32359a);
        a.mo25396a("sessionDataSets", this.f32360b);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f32359a, false);
        see.m35066c(parcel, 2, this.f32360b, false);
        see.m35040a(parcel, 3, this.f32361c, i, false);
        see.m35062b(parcel, a);
    }
}
