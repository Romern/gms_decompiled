package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReportingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeqd();

    /* renamed from: a */
    public final boolean f79600a;

    /* renamed from: b */
    public final boolean f79601b;

    /* renamed from: c */
    public final Integer f79602c;

    /* renamed from: d */
    public final boolean f79603d;

    /* renamed from: e */
    private final int f79604e;

    /* renamed from: f */
    private final int f79605f;

    /* renamed from: g */
    private final int f79606g;

    /* renamed from: h */
    private final int f79607h;

    public ReportingState(int i, int i2, boolean z, boolean z2, int i3, int i4, Integer num, boolean z3) {
        this.f79604e = i;
        this.f79605f = i2;
        this.f79600a = z;
        this.f79601b = z2;
        this.f79606g = i3;
        this.f79607h = i4;
        this.f79602c = num;
        this.f79603d = z3;
    }

    /* renamed from: a */
    public final int mo43730a() {
        return aepw.m52376b(this.f79604e);
    }

    /* renamed from: b */
    public final int mo43731b() {
        return aepw.m52376b(this.f79605f);
    }

    /* renamed from: c */
    public final boolean mo43732c() {
        return aepw.m52375a(this.f79604e) && aepw.m52375a(this.f79605f);
    }

    /* renamed from: d */
    public final int mo43733d() {
        return aepv.m52374a(this.f79606g);
    }

    /* renamed from: e */
    public final boolean mo43734e() {
        return !mo43732c() && mo43733d() == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReportingState) {
            ReportingState reportingState = (ReportingState) obj;
            if (this.f79604e == reportingState.f79604e && this.f79605f == reportingState.f79605f && this.f79600a == reportingState.f79600a && this.f79601b == reportingState.f79601b && this.f79606g == reportingState.f79606g && this.f79607h == reportingState.f79607h && sdg.m34949a(this.f79602c, reportingState.f79602c) && this.f79603d == reportingState.f79603d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79604e), Integer.valueOf(this.f79605f), Boolean.valueOf(this.f79600a), Boolean.valueOf(this.f79601b), Integer.valueOf(this.f79606g), Integer.valueOf(this.f79607h), this.f79602c, Boolean.valueOf(this.f79603d)});
    }

    public final String toString() {
        String str;
        Integer num = this.f79602c;
        if (num != null) {
            str = aeqm.m52398a(num);
        } else {
            str = "(hidden-from-unauthorized-caller)";
        }
        int i = this.f79604e;
        int i2 = this.f79605f;
        boolean z = this.f79600a;
        boolean z2 = this.f79601b;
        int i3 = this.f79606g;
        int i4 = this.f79607h;
        boolean z3 = this.f79603d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 235);
        sb.append("ReportingState{mReportingEnabled=");
        sb.append(i);
        sb.append(", mHistoryEnabled=");
        sb.append(i2);
        sb.append(", mAllowed=");
        sb.append(z);
        sb.append(", mActive=");
        sb.append(z2);
        sb.append(", mExpectedOptInResult=");
        sb.append(i3);
        sb.append(", mExpectedOptInResultAssumingLocationEnabled=");
        sb.append(i4);
        sb.append(", mDeviceTag=");
        sb.append(str);
        sb.append(", mCanAccessSettings=");
        sb.append(z3);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, mo43730a());
        see.m35063b(parcel, 3, mo43731b());
        see.m35051a(parcel, 4, this.f79600a);
        see.m35051a(parcel, 5, this.f79601b);
        see.m35063b(parcel, 7, mo43733d());
        see.m35044a(parcel, 8, this.f79602c);
        see.m35063b(parcel, 9, aepv.m52374a(this.f79607h));
        see.m35051a(parcel, 10, this.f79603d);
        see.m35062b(parcel, a);
    }
}
