package com.google.android.gms.car;

import android.app.ApplicationErrorReport;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.StringBuilderPrinter;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CrashInfoParcel implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new npr();

    /* renamed from: a */
    public final ApplicationErrorReport.CrashInfo f29401a;

    public CrashInfoParcel(Parcel parcel) {
        this.f29401a = new ApplicationErrorReport.CrashInfo(parcel);
    }

    /* renamed from: a */
    public static String m22073a(ApplicationErrorReport.CrashInfo crashInfo) {
        if (crashInfo == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        crashInfo.dump(new StringBuilderPrinter(sb), "");
        return sb.toString();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return m22073a(this.f29401a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f29401a != null) {
            parcel.writeByte((byte) 1);
            this.f29401a.writeToParcel(parcel, i);
            return;
        }
        parcel.writeByte((byte) 0);
    }

    public CrashInfoParcel(Throwable th) {
        if (th != null) {
            this.f29401a = new ApplicationErrorReport.CrashInfo(th);
        } else {
            this.f29401a = null;
        }
    }
}
