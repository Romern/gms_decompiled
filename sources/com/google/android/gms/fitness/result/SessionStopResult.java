package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionStopResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zgc();

    /* renamed from: a */
    public final Status f32362a;

    /* renamed from: b */
    public final List f32363b;

    public SessionStopResult(Status status, List list) {
        this.f32362a = status;
        this.f32363b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public static SessionStopResult m23730a(Status status) {
        return new SessionStopResult(status, Collections.emptyList());
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32362a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SessionStopResult)) {
                return false;
            }
            SessionStopResult sessionStopResult = (SessionStopResult) obj;
            if (!this.f32362a.equals(sessionStopResult.f32362a) || !sdg.m34949a(this.f32363b, sessionStopResult.f32363b)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32362a, this.f32363b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f32362a);
        a.mo25396a("sessions", this.f32363b);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f32362a, i, false);
        see.m35066c(parcel, 3, this.f32363b, false);
        see.m35062b(parcel, a);
    }
}
