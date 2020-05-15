package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MapValue extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new yxi();

    /* renamed from: a */
    public final int f32148a;

    /* renamed from: b */
    public final float f32149b;

    public MapValue(int i, float f) {
        this.f32148a = i;
        this.f32149b = f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final float mo18955a() {
        sdo.m34971a(this.f32148a == 2, (Object) "Value is not in float format");
        return this.f32149b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MapValue) {
            MapValue mapValue = (MapValue) obj;
            int i = this.f32148a;
            if (i == mapValue.f32148a) {
                if (i != 2) {
                    return this.f32149b == mapValue.f32149b;
                }
                if (mo18955a() == mapValue.mo18955a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f32149b;
    }

    public final String toString() {
        return this.f32148a != 2 ? "unknown" : Float.toString(mo18955a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f32148a);
        see.m35034a(parcel, 2, this.f32149b);
        see.m35062b(parcel, a);
    }
}
