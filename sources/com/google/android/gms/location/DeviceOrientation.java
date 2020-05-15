package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aegk();

    /* renamed from: a */
    public static final float[] f79321a = {Float.NaN, Float.NaN, Float.NaN, Float.NaN};

    /* renamed from: b */
    final float[] f79322b = new float[4];

    /* renamed from: c */
    public int f79323c = -1;

    /* renamed from: d */
    public int f79324d = -1;

    /* renamed from: e */
    float f79325e = Float.NaN;

    /* renamed from: f */
    float f79326f = Float.NaN;

    /* renamed from: g */
    public long f79327g = 0;

    /* renamed from: h */
    public byte f79328h = 0;

    public DeviceOrientation() {
    }

    /* renamed from: b */
    private static void m66835b(float[] fArr) {
        if (fArr.length != 4) {
            throw new IllegalArgumentException("Input attitude array should be of length 4.");
        }
    }

    /* renamed from: a */
    public final int mo43518a() {
        if (mo43522b()) {
            return this.f79323c;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo43519a(float f) {
        this.f79325e = f;
        this.f79328h = (byte) (this.f79328h | 4);
    }

    /* renamed from: b */
    public final void mo43521b(float f) {
        this.f79326f = f;
        this.f79328h = (byte) (this.f79328h | 8);
    }

    /* renamed from: b */
    public final boolean mo43522b() {
        return (this.f79328h & 1) != 0;
    }

    /* renamed from: c */
    public final int mo43523c() {
        if (mo43524d()) {
            return this.f79324d;
        }
        return -1;
    }

    /* renamed from: d */
    public final boolean mo43524d() {
        return (this.f79328h & 2) != 0;
    }

    /* renamed from: e */
    public final float mo43525e() {
        if (mo43527f()) {
            return this.f79325e;
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
        if (this.f79328h != deviceOrientation.f79328h || ((mo43522b() && this.f79323c != deviceOrientation.f79323c) || ((mo43524d() && this.f79324d != deviceOrientation.f79324d) || ((mo43527f() && this.f79325e != deviceOrientation.f79325e) || ((mo43529h() && this.f79326f != deviceOrientation.f79326f) || this.f79327g != deviceOrientation.f79327g || (mo43531i() && !Arrays.equals(this.f79322b, deviceOrientation.f79322b))))))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo43527f() {
        return (this.f79328h & 4) != 0;
    }

    /* renamed from: g */
    public final float mo43528g() {
        if (mo43529h()) {
            return this.f79326f;
        }
        return Float.NaN;
    }

    /* renamed from: h */
    public final boolean mo43529h() {
        return (this.f79328h & 8) != 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79323c), Integer.valueOf(this.f79324d), Float.valueOf(this.f79325e), Float.valueOf(this.f79326f), Long.valueOf(this.f79327g), this.f79322b, Byte.valueOf(this.f79328h)});
    }

    /* renamed from: i */
    public final boolean mo43531i() {
        return (this.f79328h & 16) != 0;
    }

    /* renamed from: j */
    public final void mo43532j() {
        this.f79323c = -1;
        this.f79324d = -1;
        this.f79325e = Float.NaN;
        this.f79326f = Float.NaN;
        this.f79327g = 0;
        float[] fArr = f79321a;
        float[] fArr2 = this.f79322b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        this.f79328h = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation{");
        if (mo43531i()) {
            String valueOf = String.valueOf(Arrays.toString(this.f79322b));
            sb.append(valueOf.length() == 0 ? new String("mAttitude=") : "mAttitude=".concat(valueOf));
        }
        if (mo43522b()) {
            int i = this.f79323c;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append(", mAttitudeConfidence=");
            sb2.append(i);
            sb.append(sb2.toString());
        }
        if (mo43524d()) {
            int i2 = this.f79324d;
            StringBuilder sb3 = new StringBuilder(28);
            sb3.append(", mMagConfidence=");
            sb3.append(i2);
            sb.append(sb3.toString());
        }
        if (mo43527f()) {
            float f = this.f79325e;
            StringBuilder sb4 = new StringBuilder(33);
            sb4.append(", mHeadingDegrees=");
            sb4.append(f);
            sb.append(sb4.toString());
        }
        if (mo43529h()) {
            float f2 = this.f79326f;
            StringBuilder sb5 = new StringBuilder(38);
            sb5.append(", mHeadingErrorDegrees=");
            sb5.append(f2);
            sb.append(sb5.toString());
        }
        long j = this.f79327g;
        StringBuilder sb6 = new StringBuilder(42);
        sb6.append(", mElapsedRealtimeNs=");
        sb6.append(j);
        sb6.append('}');
        sb.append(sb6.toString());
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, float[], boolean):void
     arg types: [android.os.Parcel, int, float[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35054a(parcel, 1, !mo43531i() ? f79321a : this.f79322b, false);
        see.m35063b(parcel, 2, mo43518a());
        see.m35063b(parcel, 3, mo43523c());
        see.m35034a(parcel, 4, mo43525e());
        see.m35034a(parcel, 5, mo43528g());
        see.m35036a(parcel, 6, this.f79327g);
        see.m35032a(parcel, 7, this.f79328h);
        see.m35062b(parcel, a);
    }

    public DeviceOrientation(float[] fArr, int i, int i2, float f, float f2, long j, byte b) {
        m66835b(fArr);
        System.arraycopy(fArr, 0, this.f79322b, 0, fArr.length);
        this.f79323c = i;
        this.f79324d = i2;
        this.f79325e = f;
        this.f79326f = f2;
        this.f79327g = j;
        this.f79328h = b;
    }

    /* renamed from: a */
    public final void mo43520a(float[] fArr) {
        m66835b(fArr);
        System.arraycopy(fArr, 0, this.f79322b, 0, fArr.length);
        this.f79328h = (byte) (this.f79328h | 16);
    }
}
