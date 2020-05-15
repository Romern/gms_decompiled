package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ScreenshotEntity extends GamesAbstractSafeParcelable implements Parcelable, rty {
    public static final Parcelable.Creator CREATOR = new aaes();

    /* renamed from: a */
    public final Uri f32632a;

    /* renamed from: b */
    public final int f32633b;

    /* renamed from: c */
    public final int f32634c;

    public ScreenshotEntity(Uri uri, int i, int i2) {
        this.f32632a = uri;
        this.f32633b = i;
        this.f32634c = i2;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32632a, Integer.valueOf(this.f32633b), Integer.valueOf(this.f32634c)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScreenshotEntity) {
            if (this == obj) {
                return true;
            }
            ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
            if (!sdg.m34949a(screenshotEntity.f32632a, this.f32632a) || !sdg.m34949a(Integer.valueOf(screenshotEntity.f32633b), Integer.valueOf(this.f32633b)) || !sdg.m34949a(Integer.valueOf(screenshotEntity.f32634c), Integer.valueOf(this.f32634c))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Uri", this.f32632a);
        a.mo25396a("Width", Integer.valueOf(this.f32633b));
        a.mo25396a("Height", Integer.valueOf(this.f32634c));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32632a, i, false);
        see.m35063b(parcel, 2, this.f32633b);
        see.m35063b(parcel, 3, this.f32634c);
        see.m35062b(parcel, a);
    }
}
