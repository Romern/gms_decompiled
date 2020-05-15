package com.google.android.gms.plus.model.posts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.Audience;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Settings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anxt();

    /* renamed from: a */
    public final int f82564a;

    /* renamed from: b */
    public final Audience f82565b;

    /* renamed from: c */
    public final Audience f82566c;

    /* renamed from: d */
    public final boolean f82567d;

    /* renamed from: e */
    public final boolean f82568e;

    /* renamed from: f */
    public final int f82569f;

    /* renamed from: g */
    public final int f82570g;

    /* renamed from: h */
    public final int f82571h;

    public Settings(int i, Audience audience, Audience audience2, boolean z, boolean z2, int i2, int i3, int i4) {
        this.f82564a = i;
        this.f82565b = audience;
        this.f82566c = audience2;
        this.f82567d = z;
        this.f82568e = z2;
        this.f82569f = i2;
        this.f82570g = i3;
        this.f82571h = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Settings) {
            Settings settings = (Settings) obj;
            if (this.f82564a == settings.f82564a && sdg.m34949a(this.f82565b, settings.f82565b) && sdg.m34949a(this.f82566c, settings.f82566c) && this.f82567d == settings.f82567d && this.f82568e == settings.f82568e && this.f82569f == settings.f82569f && this.f82570g == settings.f82570g && this.f82571h == settings.f82571h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f82564a), this.f82565b, this.f82566c, Boolean.valueOf(this.f82567d), Boolean.valueOf(this.f82568e), Integer.valueOf(this.f82569f), Integer.valueOf(this.f82570g), Integer.valueOf(this.f82571h)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f82565b, i, false);
        see.m35040a(parcel, 2, this.f82566c, i, false);
        see.m35051a(parcel, 3, this.f82567d);
        see.m35051a(parcel, 4, this.f82568e);
        see.m35063b(parcel, 5, this.f82569f);
        see.m35063b(parcel, 6, this.f82570g);
        see.m35063b(parcel, 7, this.f82571h);
        see.m35063b(parcel, 1000, this.f82564a);
        see.m35062b(parcel, a);
    }
}
