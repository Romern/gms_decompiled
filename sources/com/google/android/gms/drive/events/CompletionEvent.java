package com.google.android.gms.drive.events;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CompletionEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new upw();

    /* renamed from: a */
    final DriveId f30776a;

    /* renamed from: b */
    final String f30777b;

    /* renamed from: c */
    final ParcelFileDescriptor f30778c;

    /* renamed from: d */
    final ParcelFileDescriptor f30779d;

    /* renamed from: e */
    final MetadataBundle f30780e;

    /* renamed from: f */
    final List f30781f;

    /* renamed from: g */
    final int f30782g;

    /* renamed from: h */
    final IBinder f30783h;

    static {
        new sbw("CompletionEvent", "");
    }

    public CompletionEvent(DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, Context context, List list, int i, IBinder iBinder) {
        this(driveId, str, parcelFileDescriptor, parcelFileDescriptor2, metadataBundle, list, i, iBinder);
        if (metadataBundle != null) {
            metadataBundle.mo18270a(context);
        }
    }

    /* renamed from: a */
    public final int mo18144a() {
        return 2;
    }

    public final String toString() {
        String str;
        List list = this.f30781f;
        if (list != null) {
            String join = TextUtils.join("','", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("'");
            sb.append(join);
            sb.append("'");
            str = sb.toString();
        } else {
            str = "<null>";
        }
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", this.f30776a, Integer.valueOf(this.f30782g), str);
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
        int i2 = i | 1;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30776a, i2, false);
        see.m35046a(parcel, 3, this.f30777b, false);
        see.m35040a(parcel, 4, this.f30778c, i2, false);
        see.m35040a(parcel, 5, this.f30779d, i2, false);
        see.m35040a(parcel, 6, this.f30780e, i2, false);
        see.m35065b(parcel, 7, this.f30781f, false);
        see.m35063b(parcel, 8, this.f30782g);
        see.m35038a(parcel, 9, this.f30783h);
        see.m35062b(parcel, a);
    }

    public CompletionEvent(DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, List list, int i, IBinder iBinder) {
        this.f30776a = driveId;
        this.f30777b = str;
        this.f30778c = parcelFileDescriptor;
        this.f30779d = parcelFileDescriptor2;
        this.f30780e = metadataBundle;
        this.f30781f = list;
        this.f30782g = i;
        this.f30783h = iBinder;
    }
}
