package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConsentFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new auzm();

    /* renamed from: a */
    public boolean f109331a;

    /* renamed from: b */
    public boolean f109332b;

    /* renamed from: c */
    public boolean f109333c;

    /* renamed from: d */
    public int f109334d;

    /* renamed from: e */
    public int f109335e;

    /* renamed from: f */
    public boolean f109336f;

    /* renamed from: g */
    public int f109337g;

    public ConsentFlowConfig() {
        this(false, true, false, 0, 0, true, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentFlowConfig) {
            ConsentFlowConfig consentFlowConfig = (ConsentFlowConfig) obj;
            return this.f109331a == consentFlowConfig.f109331a && this.f109332b == consentFlowConfig.f109332b && this.f109333c == consentFlowConfig.f109333c && this.f109334d == consentFlowConfig.f109334d && this.f109335e == consentFlowConfig.f109335e && this.f109336f == consentFlowConfig.f109336f && this.f109337g == consentFlowConfig.f109337g;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f109331a), Boolean.valueOf(this.f109332b), Boolean.valueOf(this.f109333c), Integer.valueOf(this.f109334d), Integer.valueOf(this.f109335e), Boolean.valueOf(this.f109336f), Integer.valueOf(this.f109337g)});
    }

    public ConsentFlowConfig(boolean z, boolean z2, boolean z3, int i, int i2, boolean z4, int i3) {
        this.f109331a = z;
        this.f109332b = z2;
        this.f109333c = z3;
        this.f109334d = i;
        this.f109335e = i2;
        this.f109336f = z4;
        this.f109337g = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f109331a);
        see.m35051a(parcel, 3, this.f109332b);
        see.m35051a(parcel, 4, this.f109333c);
        see.m35063b(parcel, 5, this.f109334d);
        see.m35063b(parcel, 6, this.f109335e);
        see.m35051a(parcel, 7, this.f109336f);
        see.m35063b(parcel, 8, this.f109337g);
        see.m35062b(parcel, a);
    }
}
