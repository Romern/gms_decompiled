package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DriveId extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new twq();

    /* renamed from: a */
    public final String f30728a;

    /* renamed from: b */
    public final long f30729b;

    /* renamed from: c */
    public final long f30730c;

    /* renamed from: d */
    public final int f30731d;

    /* renamed from: e */
    private volatile String f30732e = null;

    /* renamed from: f */
    private volatile String f30733f = null;

    public DriveId(String str, long j, long j2, int i) {
        this.f30728a = str;
        boolean z = true;
        sdo.m34974b(!"".equals(str));
        if (str == null && j == -1) {
            z = false;
        }
        sdo.m34974b(z);
        this.f30729b = j;
        this.f30730c = j2;
        this.f30731d = i;
    }

    /* renamed from: a */
    public static DriveId m22924a(String str) {
        sdo.m34959a((Object) str);
        return new DriveId(str, -1, -1, -1);
    }

    /* renamed from: b */
    public static DriveId m22925b(String str) {
        String str2;
        boolean startsWith = str.startsWith("DriveId:");
        String valueOf = String.valueOf(str);
        sdo.m34975b(startsWith, valueOf.length() == 0 ? new String("Invalid DriveId: ") : "Invalid DriveId: ".concat(valueOf));
        try {
            utw utw = (utw) bxvk.m124016a(utw.f48643g, Base64.decode(str.substring(8), 10), bxus.m123744c());
            if (!"".equals(utw.f48647c)) {
                str2 = utw.f48647c;
            } else {
                str2 = null;
            }
            return new DriveId(str2, utw.f48648d, utw.f48649e, utw.f48650f);
        } catch (bxwf e) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public final usx mo18114c() {
        int i = this.f30731d;
        if (i == 1) {
            return mo18113b();
        }
        if (i != 0) {
            return new usx(this);
        }
        return new usx(this);
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            if (driveId.f30730c == this.f30730c) {
                long j = driveId.f30729b;
                if (j == -1 && this.f30729b == -1) {
                    return driveId.f30728a.equals(this.f30728a);
                }
                String str2 = this.f30728a;
                if (str2 == null || (str = driveId.f30728a) == null) {
                    if (j == this.f30729b) {
                        return true;
                    }
                    return false;
                } else if (j != this.f30729b || !str.equals(str2)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f30729b == -1) {
            return this.f30728a.hashCode();
        }
        String valueOf = String.valueOf(String.valueOf(this.f30730c));
        String valueOf2 = String.valueOf(String.valueOf(this.f30729b));
        return (valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)).hashCode();
    }

    public final String toString() {
        return mo18112a();
    }

    /* renamed from: a */
    public final String mo18112a() {
        if (this.f30732e == null) {
            bxvd da = utw.f48643g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            utw utw = (utw) da.f164949b;
            int i = utw.f48645a | 1;
            utw.f48645a = i;
            utw.f48646b = 1;
            String str = this.f30728a;
            if (str == null) {
                str = "";
            }
            str.getClass();
            int i2 = i | 2;
            utw.f48645a = i2;
            utw.f48647c = str;
            long j = this.f30729b;
            int i3 = i2 | 4;
            utw.f48645a = i3;
            utw.f48648d = j;
            long j2 = this.f30730c;
            int i4 = i3 | 8;
            utw.f48645a = i4;
            utw.f48649e = j2;
            int i5 = this.f30731d;
            utw.f48645a = i4 | 16;
            utw.f48650f = i5;
            String valueOf = String.valueOf(Base64.encodeToString(((utw) da.mo74062i()).mo73642k(), 10));
            this.f30732e = valueOf.length() == 0 ? new String("DriveId:") : "DriveId:".concat(valueOf);
        }
        return this.f30732e;
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
        see.m35046a(parcel, 2, this.f30728a, false);
        see.m35036a(parcel, 3, this.f30729b);
        see.m35036a(parcel, 4, this.f30730c);
        see.m35063b(parcel, 5, this.f30731d);
        see.m35062b(parcel, a);
    }

    /* renamed from: b */
    public final usx mo18113b() {
        if (this.f30731d != 0) {
            return new usx(this);
        }
        throw new IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
    }
}
