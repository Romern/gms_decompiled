package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aegg();

    /* renamed from: a */
    public static final Comparator f79310a = new aegf();

    /* renamed from: b */
    public final List f79311b;

    /* renamed from: c */
    public final String f79312c;

    /* renamed from: d */
    public final List f79313d;

    public ActivityTransitionRequest(List list) {
        this(list, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return sdg.m34949a(this.f79311b, activityTransitionRequest.f79311b) && sdg.m34949a(this.f79312c, activityTransitionRequest.f79312c) && sdg.m34949a(this.f79313d, activityTransitionRequest.f79313d);
        }
    }

    public final int hashCode() {
        int hashCode = this.f79311b.hashCode() * 31;
        String str = this.f79312c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f79313d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f79311b);
        String str = this.f79312c;
        String valueOf2 = String.valueOf(this.f79313d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public ActivityTransitionRequest(List list, String str, List list2) {
        boolean z;
        sdo.m34966a(list, "transitions can't be null");
        if (list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f79310a);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ActivityTransition activityTransition = (ActivityTransition) list.get(i);
            sdo.m34975b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.f79311b = Collections.unmodifiableList(list);
        this.f79312c = str;
        this.f79313d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
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
        see.m35066c(parcel, 1, this.f79311b, false);
        see.m35046a(parcel, 2, this.f79312c, false);
        see.m35066c(parcel, 3, this.f79313d, false);
        see.m35062b(parcel, a);
    }
}
