package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SnapshotMetadataEntity extends GamesAbstractSafeParcelable implements SnapshotMetadata {
    public static final Parcelable.Creator CREATOR = new aafu();

    /* renamed from: a */
    public final GameEntity f32719a;

    /* renamed from: b */
    public final PlayerEntity f32720b;

    /* renamed from: c */
    public final String f32721c;

    /* renamed from: d */
    public final Uri f32722d;

    /* renamed from: e */
    public final String f32723e;

    /* renamed from: f */
    public final String f32724f;

    /* renamed from: g */
    public final String f32725g;

    /* renamed from: h */
    public final long f32726h;

    /* renamed from: i */
    public final long f32727i;

    /* renamed from: j */
    public final float f32728j;

    /* renamed from: k */
    public final String f32729k;

    /* renamed from: l */
    public final boolean f32730l;

    /* renamed from: m */
    public final long f32731m;

    /* renamed from: n */
    public final String f32732n;

    public SnapshotMetadataEntity(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j, long j2, float f, String str5, boolean z, long j3, String str6) {
        this.f32719a = gameEntity;
        this.f32720b = playerEntity;
        this.f32721c = str;
        this.f32722d = uri;
        this.f32723e = str2;
        this.f32728j = f;
        this.f32724f = str3;
        this.f32725g = str4;
        this.f32726h = j;
        this.f32727i = j2;
        this.f32729k = str5;
        this.f32730l = z;
        this.f32731m = j3;
        this.f32732n = str6;
    }

    /* renamed from: a */
    public final Game mo19510a() {
        return this.f32719a;
    }

    /* renamed from: b */
    public final Player mo19511b() {
        return this.f32720b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo19512c() {
        return this.f32721c;
    }

    /* renamed from: d */
    public final Uri mo19513d() {
        return this.f32722d;
    }

    /* renamed from: f */
    public final float mo19514f() {
        return this.f32728j;
    }

    /* renamed from: g */
    public final String mo19515g() {
        return this.f32729k;
    }

    /* renamed from: h */
    public final String mo19516h() {
        return this.f32724f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32719a, this.f32720b, this.f32721c, this.f32722d, Float.valueOf(this.f32728j), this.f32724f, this.f32725g, Long.valueOf(this.f32726h), Long.valueOf(this.f32727i), this.f32729k, Boolean.valueOf(this.f32730l), Long.valueOf(this.f32731m), this.f32732n});
    }

    /* renamed from: i */
    public final String mo19517i() {
        return this.f32725g;
    }

    /* renamed from: j */
    public final long mo19518j() {
        return this.f32726h;
    }

    /* renamed from: k */
    public final long mo19519k() {
        return this.f32727i;
    }

    /* renamed from: l */
    public final boolean mo19520l() {
        return this.f32730l;
    }

    /* renamed from: m */
    public final long mo19521m() {
        return this.f32731m;
    }

    /* renamed from: n */
    public final String mo19522n() {
        return this.f32732n;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata) {
        SnapshotMetadataEntity snapshotMetadataEntity = (SnapshotMetadataEntity) snapshotMetadata;
        PlayerEntity playerEntity = new PlayerEntity(snapshotMetadataEntity.f32720b);
        this.f32719a = new GameEntity(snapshotMetadataEntity.f32719a);
        this.f32720b = playerEntity;
        this.f32721c = snapshotMetadataEntity.f32721c;
        this.f32722d = snapshotMetadataEntity.f32722d;
        this.f32723e = snapshotMetadataEntity.f32723e;
        this.f32728j = snapshotMetadataEntity.f32728j;
        this.f32724f = snapshotMetadataEntity.f32724f;
        this.f32725g = snapshotMetadataEntity.f32725g;
        this.f32726h = snapshotMetadataEntity.f32726h;
        this.f32727i = snapshotMetadataEntity.f32727i;
        this.f32729k = snapshotMetadataEntity.f32729k;
        this.f32730l = snapshotMetadataEntity.f32730l;
        this.f32731m = snapshotMetadataEntity.f32731m;
        this.f32732n = snapshotMetadataEntity.f32732n;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SnapshotMetadata) {
            if (this == obj) {
                return true;
            }
            SnapshotMetadata snapshotMetadata = (SnapshotMetadata) obj;
            if (!sdg.m34949a(snapshotMetadata.mo19510a(), this.f32719a) || !sdg.m34949a(snapshotMetadata.mo19511b(), this.f32720b) || !sdg.m34949a(snapshotMetadata.mo19512c(), this.f32721c) || !sdg.m34949a(snapshotMetadata.mo19513d(), this.f32722d) || !sdg.m34949a(Float.valueOf(snapshotMetadata.mo19514f()), Float.valueOf(this.f32728j)) || !sdg.m34949a(snapshotMetadata.mo19516h(), this.f32724f) || !sdg.m34949a(snapshotMetadata.mo19517i(), this.f32725g) || !sdg.m34949a(Long.valueOf(snapshotMetadata.mo19518j()), Long.valueOf(this.f32726h)) || !sdg.m34949a(Long.valueOf(snapshotMetadata.mo19519k()), Long.valueOf(this.f32727i)) || !sdg.m34949a(snapshotMetadata.mo19515g(), this.f32729k) || !sdg.m34949a(Boolean.valueOf(snapshotMetadata.mo19520l()), Boolean.valueOf(this.f32730l)) || !sdg.m34949a(Long.valueOf(snapshotMetadata.mo19521m()), Long.valueOf(this.f32731m)) || !sdg.m34949a(snapshotMetadata.mo19522n(), this.f32732n)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Game", this.f32719a);
        a.mo25396a("Owner", this.f32720b);
        a.mo25396a("SnapshotId", this.f32721c);
        a.mo25396a("CoverImageUri", this.f32722d);
        a.mo25396a("CoverImageUrl", this.f32723e);
        a.mo25396a("CoverImageAspectRatio", Float.valueOf(this.f32728j));
        a.mo25396a("Description", this.f32725g);
        a.mo25396a("LastModifiedTimestamp", Long.valueOf(this.f32726h));
        a.mo25396a("PlayedTime", Long.valueOf(this.f32727i));
        a.mo25396a("UniqueName", this.f32729k);
        a.mo25396a("ChangePending", Boolean.valueOf(this.f32730l));
        a.mo25396a("ProgressValue", Long.valueOf(this.f32731m));
        a.mo25396a("DeviceName", this.f32732n);
        return a.toString();
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
        see.m35040a(parcel, 1, this.f32719a, i, false);
        see.m35040a(parcel, 2, this.f32720b, i, false);
        see.m35046a(parcel, 3, this.f32721c, false);
        see.m35040a(parcel, 5, this.f32722d, i, false);
        see.m35046a(parcel, 6, this.f32723e, false);
        see.m35046a(parcel, 7, this.f32724f, false);
        see.m35046a(parcel, 8, this.f32725g, false);
        see.m35036a(parcel, 9, this.f32726h);
        see.m35036a(parcel, 10, this.f32727i);
        see.m35034a(parcel, 11, this.f32728j);
        see.m35046a(parcel, 12, this.f32729k, false);
        see.m35051a(parcel, 13, this.f32730l);
        see.m35036a(parcel, 14, this.f32731m);
        see.m35046a(parcel, 15, this.f32732n, false);
        see.m35062b(parcel, a);
    }
}
