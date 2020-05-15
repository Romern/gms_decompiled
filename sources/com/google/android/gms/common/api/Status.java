package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, rkk {
    public static final Parcelable.Creator CREATOR = new rko();

    /* renamed from: a */
    public static final Status f30107a = new Status(0);

    /* renamed from: b */
    public static final Status f30108b = new Status(14);

    /* renamed from: c */
    public static final Status f30109c = new Status(8);

    /* renamed from: d */
    public static final Status f30110d = new Status(15);

    /* renamed from: e */
    public static final Status f30111e = new Status(16);

    /* renamed from: f */
    public static final Status f30112f = new Status(17);

    /* renamed from: g */
    public static final Status f30113g = new Status(18);

    /* renamed from: h */
    public final int f30114h;

    /* renamed from: i */
    public final int f30115i;

    /* renamed from: j */
    public final String f30116j;

    /* renamed from: k */
    public final PendingIntent f30117k;

    public Status(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public final void mo17708a(Activity activity, int i) {
        if (mo17709b()) {
            activity.startIntentSenderForResult(this.f30117k.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo17709b() {
        return this.f30117k != null;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this;
    }

    /* renamed from: c */
    public final boolean mo17710c() {
        return this.f30115i <= 0;
    }

    /* renamed from: d */
    public final String mo17711d() {
        String str = this.f30116j;
        return str == null ? rjs.m33677c(this.f30115i) : str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.f30114h != status.f30114h || this.f30115i != status.f30115i || !sdg.m34949a(this.f30116j, status.f30116j) || !sdg.m34949a(this.f30117k, status.f30117k)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30114h), Integer.valueOf(this.f30115i), this.f30116j, this.f30117k});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("statusCode", mo17711d());
        a.mo25396a("resolution", this.f30117k);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        rko.m33876a(this, parcel, i);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f30114h = i;
        this.f30115i = i2;
        this.f30116j = str;
        this.f30117k = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }
}
