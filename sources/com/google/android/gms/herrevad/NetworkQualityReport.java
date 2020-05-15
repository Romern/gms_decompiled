package com.google.android.gms.herrevad;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkQualityReport extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abmd();

    /* renamed from: a */
    public int f79049a;

    /* renamed from: b */
    public long f79050b;

    /* renamed from: c */
    public long f79051c;

    /* renamed from: d */
    public long f79052d;

    /* renamed from: e */
    public int f79053e;

    /* renamed from: f */
    public Bundle f79054f;

    /* renamed from: g */
    public boolean f79055g;

    /* renamed from: h */
    public int f79056h;

    /* renamed from: i */
    public boolean f79057i;

    /* renamed from: j */
    public boolean f79058j;

    public NetworkQualityReport() {
        this.f79049a = -1;
        this.f79050b = -1;
        this.f79051c = -1;
        this.f79052d = -1;
        this.f79053e = -1;
        this.f79054f = new Bundle();
        this.f79055g = false;
        this.f79056h = -1;
        this.f79057i = false;
        this.f79058j = false;
    }

    /* renamed from: a */
    public final void mo43385a(String str, long j) {
        this.f79054f.putLong(str, j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[\nmLatencyMicros: ");
        sb.append(this.f79049a);
        sb.append("\nmDurationMicros: ");
        sb.append(this.f79050b);
        sb.append("\nmBytesDownloaded: ");
        sb.append(this.f79051c);
        sb.append("\nmBytesUploaded: ");
        sb.append(this.f79052d);
        sb.append("\nmMeasurementType: ");
        sb.append(this.f79053e);
        sb.append("\nmIsNoConnectivity: ");
        sb.append(this.f79055g);
        sb.append("\nmConnectivityType: ");
        sb.append(this.f79056h);
        sb.append("\nmIsCaptivePortal: ");
        sb.append(this.f79057i);
        sb.append("\nmHighPriority: ");
        sb.append(this.f79058j);
        sb.append("\n");
        for (String str : this.f79054f.keySet()) {
            sb.append("custom param: ");
            sb.append(str);
            sb.append("=");
            sb.append(this.f79054f.get(str));
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo43386a(String str, String str2) {
        this.f79054f.putString(str, str2);
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
        see.m35063b(parcel, 2, this.f79049a);
        see.m35036a(parcel, 3, this.f79050b);
        see.m35036a(parcel, 4, this.f79051c);
        see.m35036a(parcel, 5, this.f79052d);
        see.m35063b(parcel, 6, this.f79053e);
        see.m35037a(parcel, 7, this.f79054f, false);
        see.m35051a(parcel, 8, this.f79055g);
        see.m35063b(parcel, 9, this.f79056h);
        see.m35051a(parcel, 10, this.f79057i);
        see.m35051a(parcel, 11, this.f79058j);
        see.m35062b(parcel, a);
    }

    public NetworkQualityReport(int i, long j, long j2, long j3, int i2, Bundle bundle, boolean z, int i3, boolean z2, boolean z3) {
        this.f79049a = -1;
        this.f79050b = -1;
        this.f79051c = -1;
        this.f79052d = -1;
        this.f79053e = -1;
        new Bundle();
        this.f79049a = i;
        this.f79050b = j;
        this.f79051c = j2;
        this.f79052d = j3;
        this.f79053e = i2;
        this.f79054f = bundle;
        this.f79055g = z;
        this.f79056h = i3;
        this.f79057i = z2;
        this.f79058j = z3;
    }
}
