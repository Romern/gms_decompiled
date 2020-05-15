package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aegh();

    /* renamed from: a */
    public final List f79314a;

    /* renamed from: b */
    public Bundle f79315b = null;

    /* renamed from: a */
    public static boolean m66829a(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
        }
        return false;
    }

    /* renamed from: b */
    public static ActivityTransitionResult m66830b(Intent intent) {
        if (m66829a(intent)) {
            return (ActivityTransitionResult) sef.m35067a(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f79314a.equals(((ActivityTransitionResult) obj).f79314a);
    }

    public final int hashCode() {
        return this.f79314a.hashCode();
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        boolean z;
        sdo.m34966a(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                if (((ActivityTransitionEvent) list.get(i)).f79309c >= ((ActivityTransitionEvent) list.get(i - 1)).f79309c) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34974b(z);
            }
        }
        this.f79314a = Collections.unmodifiableList(list);
        this.f79315b = bundle;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f79314a, false);
        see.m35037a(parcel, 2, this.f79315b, false);
        see.m35062b(parcel, a);
    }
}
