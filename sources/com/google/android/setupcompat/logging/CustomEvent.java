package com.google.android.setupcompat.logging;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CustomEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new biyf();

    /* renamed from: a */
    public final long f151466a;

    /* renamed from: b */
    public final MetricKey f151467b;

    /* renamed from: c */
    public final PersistableBundle f151468c;

    /* renamed from: d */
    public final PersistableBundle f151469d;

    public CustomEvent(long j, MetricKey metricKey, PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        bixv.m102958a(z, "Timestamp cannot be negative.");
        bixv.m102956a(metricKey, "MetricKey cannot be null.");
        bixv.m102956a(persistableBundle, "Bundle cannot be null.");
        bixv.m102958a(!persistableBundle.isEmpty(), "Bundle cannot be empty.");
        bixv.m102956a(persistableBundle2, "piiValues cannot be null.");
        for (String str : persistableBundle.keySet()) {
            biye.m102970a(str, "bundle key", 3, 50);
            Object obj = persistableBundle.get(str);
            if (obj instanceof String) {
                bixv.m102958a(((String) obj).length() <= 50, String.format("Maximum length of string value for key='%s' cannot exceed %s.", str, 50));
            }
        }
        this.f151466a = j;
        this.f151467b = metricKey;
        this.f151468c = new PersistableBundle(persistableBundle);
        this.f151469d = new PersistableBundle(persistableBundle2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bixv.a(boolean, java.lang.String):void
     arg types: [int, java.lang.String]
     candidates:
      bixv.a(java.lang.Object, java.lang.String):void
      bixv.a(boolean, java.lang.String):void */
    /* renamed from: a */
    public static CustomEvent m117807a(MetricKey metricKey, PersistableBundle persistableBundle) {
        int i = Build.VERSION.SDK_INT;
        bixv.m102958a(true, "The constructor only support on sdk Q or higher.");
        PersistableBundle persistableBundle2 = PersistableBundle.EMPTY;
        int i2 = Build.VERSION.SDK_INT;
        bixv.m102958a(true, "The constructor only support on sdk Q or higher");
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        bixu.m102955b(persistableBundle);
        bixu.m102955b(persistableBundle2);
        return new CustomEvent(millis, metricKey, persistableBundle, persistableBundle2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomEvent) {
            CustomEvent customEvent = (CustomEvent) obj;
            return this.f151466a == customEvent.f151466a && biyu.m103013a(this.f151467b, customEvent.f151467b) && bixu.m102953a(this.f151468c, customEvent.f151468c) && bixu.m102953a(this.f151469d, customEvent.f151469d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f151466a), this.f151467b, this.f151468c, this.f151469d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f151466a);
        parcel.writeParcelable(this.f151467b, i);
        parcel.writePersistableBundle(this.f151468c);
        parcel.writePersistableBundle(this.f151469d);
    }
}
