package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DriveSpace extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new twu();

    /* renamed from: a */
    public static final DriveSpace f30734a = new DriveSpace("DRIVE");

    /* renamed from: b */
    public static final DriveSpace f30735b = new DriveSpace("APP_DATA_FOLDER");

    /* renamed from: c */
    public static final DriveSpace f30736c;

    /* renamed from: d */
    public static final Set f30737d;

    /* renamed from: e */
    public static final String f30738e;

    /* renamed from: g */
    private static final Pattern f30739g = Pattern.compile("[A-Z0-9_]*");

    /* renamed from: f */
    public final String f30740f;

    static {
        DriveSpace driveSpace = new DriveSpace("PHOTOS");
        f30736c = driveSpace;
        Set a = sqw.m36039a(f30734a, f30735b, driveSpace);
        f30737d = a;
        f30738e = TextUtils.join(",", a.toArray());
    }

    public DriveSpace(String str) {
        sdo.m34959a((Object) str);
        this.f30740f = str;
    }

    /* renamed from: a */
    public static DriveSpace m22929a(String str) {
        if (!f30739g.matcher(str).matches()) {
            str = str.replaceAll("([A-Z])", "_$1").toUpperCase(Locale.US);
        }
        for (DriveSpace driveSpace : f30737d) {
            if (driveSpace.f30740f.equals(str)) {
                return driveSpace;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != DriveSpace.class) {
            return false;
        }
        return this.f30740f.equals(((DriveSpace) obj).f30740f);
    }

    public final int hashCode() {
        return this.f30740f.hashCode() ^ 1247068382;
    }

    public final String toString() {
        return this.f30740f;
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
        see.m35046a(parcel, 2, this.f30740f, false);
        see.m35062b(parcel, a);
    }
}
