package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SnapshotMetadataChangeEntity extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaft();

    /* renamed from: a */
    public final String f32714a;

    /* renamed from: b */
    public final Long f32715b;

    /* renamed from: c */
    public final Uri f32716c;

    /* renamed from: d */
    public BitmapTeleporter f32717d;

    /* renamed from: e */
    public final Long f32718e;

    SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
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
    public SnapshotMetadataChangeEntity(String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        this.f32714a = str;
        this.f32715b = l;
        this.f32717d = bitmapTeleporter;
        this.f32716c = uri;
        this.f32718e = l2;
        boolean z = true;
        if (!(bitmapTeleporter == null || uri == null)) {
            z = false;
        }
        sdo.m34971a(z, (Object) "Cannot set both a URI and an image");
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
        see.m35046a(parcel, 1, this.f32714a, false);
        see.m35045a(parcel, 2, this.f32715b);
        see.m35040a(parcel, 4, this.f32716c, i, false);
        see.m35040a(parcel, 5, this.f32717d, i, false);
        see.m35045a(parcel, 6, this.f32718e);
        see.m35062b(parcel, a);
    }
}
