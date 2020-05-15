package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnDownloadProgressResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uua();

    /* renamed from: a */
    public static final List f30875a = Collections.emptyList();

    /* renamed from: b */
    final long f30876b;

    /* renamed from: c */
    final long f30877c;

    /* renamed from: d */
    final int f30878d;

    /* renamed from: e */
    final List f30879e;

    public OnDownloadProgressResponse(long j, long j2, int i, List list) {
        this.f30876b = j;
        this.f30877c = j2;
        this.f30878d = i;
        this.f30879e = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f30876b);
        see.m35036a(parcel, 3, this.f30877c);
        see.m35063b(parcel, 4, this.f30878d);
        see.m35066c(parcel, 5, this.f30879e, false);
        see.m35062b(parcel, a);
    }
}
