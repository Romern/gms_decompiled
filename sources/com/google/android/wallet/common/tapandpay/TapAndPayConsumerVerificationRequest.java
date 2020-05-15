package com.google.android.wallet.common.tapandpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.common.moduleapicalltasks.ModuleApiCallTaskLoaderRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayConsumerVerificationRequest extends ModuleApiCallTaskLoaderRequest {
    public static final Parcelable.Creator CREATOR = new bjuy();

    /* renamed from: a */
    public final String f151825a;

    /* renamed from: b */
    public final boolean f151826b;

    /* renamed from: c */
    public final boolean f151827c;

    /* renamed from: d */
    public final int f151828d;

    /* renamed from: e */
    public final int f151829e;

    /* renamed from: f */
    public final long f151830f;

    /* renamed from: g */
    public final int f151831g;

    /* renamed from: h */
    public final String f151832h;

    /* renamed from: i */
    public final byte[] f151833i;

    /* renamed from: j */
    public final boolean f151834j;

    public TapAndPayConsumerVerificationRequest(bmkl bmkl, boolean z) {
        String str;
        this.f151825a = bmkl.f129851c;
        this.f151826b = bmkl.f129852d;
        this.f151827c = z;
        int a = bmkp.m108124a(bmkl.f129853e);
        this.f151828d = bjuz.m104678a(a == 0 ? 1 : a);
        bmkk bmkk = bmkl.f129854f;
        this.f151829e = (bmkk == null ? bmkk.f129840e : bmkk).f129843b;
        bmkk bmkk2 = bmkl.f129854f;
        this.f151830f = (bmkk2 == null ? bmkk.f129840e : bmkk2).f129842a;
        bmkk bmkk3 = bmkl.f129854f;
        this.f151831g = (bmkk3 == null ? bmkk.f129840e : bmkk3).f129844c;
        if ((bmkl.f129849a & 16) != 0) {
            bmkk bmkk4 = bmkl.f129854f;
            str = (bmkk4 == null ? bmkk.f129840e : bmkk4).f129845d;
        } else {
            str = null;
        }
        this.f151832h = str;
        this.f151833i = bmkl.f129856h.mo73780k();
        this.f151834j = bmkl.f129857i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f151825a);
        parcel.writeByte(this.f151826b ? (byte) 1 : 0);
        parcel.writeByte(this.f151827c ? (byte) 1 : 0);
        parcel.writeInt(this.f151828d);
        parcel.writeInt(this.f151829e);
        parcel.writeLong(this.f151830f);
        parcel.writeInt(this.f151831g);
        parcel.writeString(this.f151832h);
        parcel.writeByteArray(this.f151833i);
        parcel.writeByte(this.f151834j ? (byte) 1 : 0);
    }

    public TapAndPayConsumerVerificationRequest(String str, int i) {
        this.f151825a = str;
        this.f151826b = true;
        this.f151827c = false;
        this.f151828d = i;
        this.f151829e = 0;
        this.f151830f = 0;
        this.f151831g = 0;
        this.f151832h = null;
        this.f151833i = new byte[0];
        this.f151834j = false;
    }

    public TapAndPayConsumerVerificationRequest(String str, boolean z, boolean z2, int i, int i2, long j, int i3, String str2, byte[] bArr, boolean z3) {
        this.f151825a = str;
        this.f151826b = z;
        this.f151827c = z2;
        this.f151828d = i;
        this.f151829e = i2;
        this.f151830f = j;
        this.f151831g = i3;
        this.f151832h = str2;
        this.f151833i = bArr;
        this.f151834j = z3;
    }
}
