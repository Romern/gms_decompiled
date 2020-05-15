package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InStoreCvmConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asob();

    /* renamed from: a */
    public boolean f108384a;

    /* renamed from: b */
    public int f108385b;

    /* renamed from: c */
    public int f108386c;

    /* renamed from: d */
    public int f108387d;

    public InStoreCvmConfig(boolean z, int i, int i2, int i3) {
        this.f108384a = z;
        this.f108385b = i;
        this.f108386c = i2;
        this.f108387d = i3;
    }

    /* renamed from: a */
    public final asoa mo59242a() {
        asoa asoa = new asoa();
        asoa.f89282a = this.f108384a;
        asoa.f89283b = this.f108385b;
        asoa.f89284c = this.f108386c;
        asoa.f89285d = this.f108387d;
        return asoa;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InStoreCvmConfig) {
            InStoreCvmConfig inStoreCvmConfig = (InStoreCvmConfig) obj;
            return this.f108384a == inStoreCvmConfig.f108384a && this.f108385b == inStoreCvmConfig.f108385b && this.f108387d == inStoreCvmConfig.f108387d && this.f108386c == inStoreCvmConfig.f108386c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f108384a), Integer.valueOf(this.f108385b), Integer.valueOf(this.f108387d), Integer.valueOf(this.f108386c)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("requireCdcvmPassing", Boolean.valueOf(this.f108384a));
        a.mo25396a("cdcvmExpirtaionInSecs", Integer.valueOf(this.f108385b));
        a.mo25396a("unlockedTapLimit", Integer.valueOf(this.f108386c));
        a.mo25396a("cdcvmTapLimit", Integer.valueOf(this.f108387d));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f108384a);
        see.m35063b(parcel, 3, this.f108385b);
        see.m35063b(parcel, 4, this.f108386c);
        see.m35063b(parcel, 5, this.f108387d);
        see.m35062b(parcel, a);
    }
}
