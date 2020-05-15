package com.google.android.gms.car;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarCall extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nky();

    /* renamed from: a */
    public final int f29283a;

    /* renamed from: b */
    public CarCall f29284b;

    /* renamed from: c */
    public List f29285c;

    /* renamed from: d */
    public String f29286d;

    /* renamed from: e */
    public int f29287e;

    /* renamed from: f */
    public Details f29288f;
    @Deprecated

    /* renamed from: g */
    public boolean f29289g;

    /* renamed from: h */
    public List f29290h;

    /* renamed from: i */
    public List f29291i;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Details extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new nkz();

        /* renamed from: a */
        public Uri f29292a;

        /* renamed from: b */
        public String f29293b;

        /* renamed from: c */
        public String f29294c;

        /* renamed from: d */
        public long f29295d;
        @Deprecated

        /* renamed from: e */
        public Uri f29296e;
        @Deprecated

        /* renamed from: f */
        public Uri f29297f;

        /* renamed from: g */
        public int f29298g;

        /* renamed from: h */
        public PhoneAccountHandle f29299h;

        /* renamed from: i */
        public int f29300i;

        /* renamed from: j */
        public Bundle f29301j;

        /* renamed from: k */
        public Bundle f29302k;

        /* renamed from: l */
        public int f29303l;

        /* renamed from: m */
        public GatewayInfo f29304m;

        public Details() {
        }

        public final String toString() {
            String valueOf = String.valueOf(this.f29292a);
            String str = this.f29293b;
            String str2 = this.f29294c;
            long j = this.f29295d;
            String valueOf2 = String.valueOf(this.f29296e);
            String valueOf3 = String.valueOf(this.f29297f);
            int i = this.f29298g;
            String valueOf4 = String.valueOf(this.f29299h);
            int i2 = this.f29300i;
            String valueOf5 = String.valueOf(this.f29301j);
            String valueOf6 = String.valueOf(this.f29302k);
            int i3 = this.f29303l;
            String valueOf7 = String.valueOf(this.f29304m);
            int length = String.valueOf(valueOf).length();
            int length2 = String.valueOf(str).length();
            int length3 = String.valueOf(str2).length();
            int length4 = String.valueOf(valueOf2).length();
            int length5 = String.valueOf(valueOf3).length();
            int length6 = String.valueOf(valueOf4).length();
            int length7 = String.valueOf(valueOf5).length();
            StringBuilder sb = new StringBuilder(length + 277 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
            sb.append("Details{handle=");
            sb.append(valueOf);
            sb.append(", callerDisplayName='");
            sb.append(str);
            sb.append("', disconnectCause='");
            sb.append(str2);
            sb.append("', connectTimeMillis=");
            sb.append(j);
            sb.append(", gatewayInfoOriginal=");
            sb.append(valueOf2);
            sb.append(", gatewayInfoGateway=");
            sb.append(valueOf3);
            sb.append(", callCapabilities=");
            sb.append(i);
            sb.append(", accountHandle=");
            sb.append(valueOf4);
            sb.append(", callProperties=");
            sb.append(i2);
            sb.append(", extras=");
            sb.append(valueOf5);
            sb.append(", intentExtras=");
            sb.append(valueOf6);
            sb.append(", videoState=");
            sb.append(i3);
            sb.append(", gatewayInfo=");
            sb.append(valueOf7);
            sb.append('}');
            return sb.toString();
        }

        public Details(Uri uri, String str, String str2, long j, Uri uri2, Uri uri3, int i, PhoneAccountHandle phoneAccountHandle, int i2, Bundle bundle, Bundle bundle2, int i3, GatewayInfo gatewayInfo) {
            this.f29292a = uri;
            this.f29293b = str;
            this.f29294c = str2;
            this.f29295d = j;
            this.f29296e = uri2;
            this.f29297f = uri3;
            this.f29298g = i;
            this.f29299h = phoneAccountHandle;
            this.f29300i = i2;
            this.f29301j = bundle;
            this.f29302k = bundle2;
            this.f29303l = i3;
            this.f29304m = gatewayInfo;
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
            see.m35040a(parcel, 1, this.f29292a, i, false);
            see.m35046a(parcel, 2, this.f29293b, false);
            see.m35046a(parcel, 3, this.f29294c, false);
            see.m35036a(parcel, 4, this.f29295d);
            see.m35040a(parcel, 5, this.f29296e, i, false);
            see.m35040a(parcel, 6, this.f29297f, i, false);
            see.m35063b(parcel, 7, this.f29298g);
            see.m35040a(parcel, 8, this.f29299h, i, false);
            see.m35063b(parcel, 9, this.f29300i);
            see.m35037a(parcel, 10, this.f29301j, false);
            see.m35037a(parcel, 11, this.f29302k, false);
            see.m35063b(parcel, 12, this.f29303l);
            see.m35040a(parcel, 13, this.f29304m, i, false);
            see.m35062b(parcel, a);
        }
    }

    public CarCall(int i, CarCall carCall, List list, String str, int i2, Details details, boolean z, List list2, List list3) {
        this.f29283a = i;
        this.f29284b = carCall;
        this.f29285c = list;
        this.f29286d = str;
        this.f29287e = i2;
        this.f29288f = details;
        this.f29289g = z;
        this.f29290h = list2;
        this.f29291i = list3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CarCall) && this.f29283a == ((CarCall) obj).f29283a;
    }

    public final int hashCode() {
        return this.f29283a;
    }

    public final String toString() {
        int i = this.f29283a;
        String valueOf = String.valueOf(this.f29284b);
        String valueOf2 = String.valueOf(this.f29285c);
        String str = this.f29286d;
        int i2 = this.f29287e;
        String valueOf3 = String.valueOf(this.f29288f);
        boolean z = this.f29289g;
        String valueOf4 = String.valueOf(this.f29290h);
        String valueOf5 = String.valueOf(this.f29291i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("CarCall{id=");
        sb.append(i);
        sb.append(", parent=");
        sb.append(valueOf);
        sb.append(", cannedTextResponses=");
        sb.append(valueOf2);
        sb.append(", remainingPostDialSequence='");
        sb.append(str);
        sb.append("', state=");
        sb.append(i2);
        sb.append(", details=");
        sb.append(valueOf3);
        sb.append(", hasChildren=");
        sb.append(z);
        sb.append(", children=");
        sb.append(valueOf4);
        sb.append(", conferenceableCalls=");
        sb.append(valueOf5);
        sb.append('}');
        return sb.toString();
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
        see.m35063b(parcel, 1, this.f29283a);
        see.m35040a(parcel, 2, this.f29284b, i, false);
        see.m35065b(parcel, 3, this.f29285c, false);
        see.m35046a(parcel, 4, this.f29286d, false);
        see.m35063b(parcel, 5, this.f29287e);
        see.m35040a(parcel, 6, this.f29288f, i, false);
        see.m35051a(parcel, 7, this.f29289g);
        see.m35066c(parcel, 8, this.f29290h, false);
        see.m35066c(parcel, 9, this.f29291i, false);
        see.m35062b(parcel, a);
    }
}
