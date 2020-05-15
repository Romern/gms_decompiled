package com.google.android.gms.fitness.result;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FileUriResult extends AbstractSafeParcelable implements rkk {
    public static final Parcelable.Creator CREATOR = new zfx();

    /* renamed from: a */
    public final Uri f32352a;

    /* renamed from: b */
    public final Status f32353b;

    public FileUriResult(Uri uri, Status status) {
        this.f32352a = uri;
        this.f32353b = status;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32353b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FileUriResult)) {
                return false;
            }
            FileUriResult fileUriResult = (FileUriResult) obj;
            if (!this.f32353b.equals(fileUriResult.f32353b) || !sdg.m34949a(this.f32352a, fileUriResult.f32352a)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32353b, this.f32352a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f32353b);
        a.mo25396a("uri", this.f32352a);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32352a, i, false);
        see.m35040a(parcel, 2, this.f32353b, i, false);
        see.m35062b(parcel, a);
    }
}
