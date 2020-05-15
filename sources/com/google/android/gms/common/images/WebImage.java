package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rzk();

    /* renamed from: a */
    final int f30200a;

    /* renamed from: b */
    public final Uri f30201b;

    /* renamed from: c */
    public final int f30202c;

    /* renamed from: d */
    public final int f30203d;

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.f30200a = i;
        this.f30201b = uri;
        this.f30202c = i2;
        this.f30203d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return sdg.m34949a(this.f30201b, webImage.f30201b) && this.f30202c == webImage.f30202c && this.f30203d == webImage.f30203d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30201b, Integer.valueOf(this.f30202c), Integer.valueOf(this.f30203d)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f30202c), Integer.valueOf(this.f30203d), this.f30201b.toString());
    }

    public WebImage(Uri uri) {
        this(uri, 0, 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30200a);
        see.m35040a(parcel, 2, this.f30201b, i, false);
        see.m35063b(parcel, 3, this.f30202c);
        see.m35063b(parcel, 4, this.f30203d);
        see.m35062b(parcel, a);
    }

    public WebImage(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }
}
