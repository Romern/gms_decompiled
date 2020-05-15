package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RecognitionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awaa();

    /* renamed from: a */
    public final Rect f109748a;

    public RecognitionOptions() {
        this.f109748a = new Rect();
    }

    public RecognitionOptions(Rect rect) {
        this.f109748a = rect;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f109748a, i, false);
        see.m35062b(parcel, a);
    }
}
