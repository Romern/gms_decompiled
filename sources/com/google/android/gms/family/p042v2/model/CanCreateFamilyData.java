package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* renamed from: com.google.android.gms.family.v2.model.CanCreateFamilyData */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CanCreateFamilyData implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wqn();

    /* renamed from: a */
    public boolean f31430a;

    /* renamed from: b */
    public brej[] f31431b;

    /* renamed from: c */
    public PageData f31432c;

    public CanCreateFamilyData(Parcel parcel) {
        brej[] brejArr;
        this.f31430a = parcel.createBooleanArray()[0];
        int[] createIntArray = parcel.createIntArray();
        if (createIntArray != null) {
            brejArr = new brej[createIntArray.length];
        } else {
            brejArr = new brej[0];
        }
        for (int i = 0; i < brejArr.length; i++) {
            brejArr[i] = brej.m113930a(createIntArray[i]);
        }
        this.f31431b = brejArr;
        this.f31432c = (PageData) parcel.readParcelable(PageData.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr;
        parcel.writeBooleanArray(new boolean[]{this.f31430a});
        brej[] brejArr = this.f31431b;
        if (brejArr == null) {
            iArr = new int[0];
        } else {
            int[] iArr2 = new int[brejArr.length];
            for (int i2 = 0; i2 < brejArr.length; i2++) {
                iArr2[i2] = brejArr[i2].f142664U;
            }
            iArr = iArr2;
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelable(this.f31432c, i);
    }

    public CanCreateFamilyData(braw braw) {
        this.f31430a = braw.f142197c;
        this.f31431b = (brej[]) new bxvv(braw.f142198d, braw.f142192e).toArray(new brej[0]);
        if ((braw.f142195a & 8) != 0) {
            bree bree = braw.f142199f;
            this.f31432c = new PageData(bree == null ? bree.f142590e : bree);
        }
    }
}
