package com.google.android.setupcompat.logging;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MetricKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new biyg();

    /* renamed from: c */
    private static final Pattern f151470c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");

    /* renamed from: a */
    private final String f151471a;

    /* renamed from: b */
    private final String f151472b;

    public MetricKey(String str, String str2) {
        this.f151471a = str;
        this.f151472b = str2;
    }

    /* renamed from: a */
    public static Bundle m117808a(MetricKey metricKey) {
        bixv.m102956a(metricKey, "MetricKey cannot be null.");
        Bundle bundle = new Bundle();
        bundle.putInt("MetricKey_version", 1);
        bundle.putString("MetricKey_name", metricKey.f151471a);
        bundle.putString("MetricKey_screenName", metricKey.f151472b);
        return bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MetricKey) {
            MetricKey metricKey = (MetricKey) obj;
            return biyu.m103013a(this.f151471a, metricKey.f151471a) && biyu.m103013a(this.f151472b, metricKey.f151472b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f151471a, this.f151472b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f151471a);
        parcel.writeString(this.f151472b);
    }

    /* renamed from: a */
    public static MetricKey m117809a(String str, Activity activity) {
        String className = activity.getComponentName().getClassName();
        biye.m102970a(str, "MetricKey.name", 5, 30);
        bixv.m102958a(f151470c.matcher(str).matches(), "Invalid MetricKey, only alpha numeric characters are allowed.");
        return new MetricKey(str, className);
    }
}
