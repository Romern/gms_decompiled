package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Deletion extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aeps();

    /* renamed from: a */
    public final Account f79593a;

    /* renamed from: b */
    public final long f79594b;

    /* renamed from: c */
    public final long f79595c;

    /* renamed from: d */
    public final long f79596d;

    public Deletion(Account account, long j, long j2, long j3) {
        this.f79593a = account;
        this.f79594b = j;
        this.f79595c = j2;
        this.f79596d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Deletion) {
            Deletion deletion = (Deletion) obj;
            return this.f79594b == deletion.f79594b && this.f79595c == deletion.f79595c && this.f79596d == deletion.f79596d && sdg.m34949a(this.f79593a, deletion.f79593a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f79593a, Long.valueOf(this.f79594b), Long.valueOf(this.f79595c), Long.valueOf(this.f79596d)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f79593a);
        long j = this.f79594b;
        long j2 = this.f79595c;
        long j3 = this.f79596d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 122);
        sb.append("Deletion{mAccount=");
        sb.append(valueOf);
        sb.append(", mStartTimeMs=");
        sb.append(j);
        sb.append(", mEndTimeMs=");
        sb.append(j2);
        sb.append(", mTimestampMs=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f79593a, i, false);
        see.m35036a(parcel, 3, this.f79594b);
        see.m35036a(parcel, 4, this.f79595c);
        see.m35036a(parcel, 5, this.f79596d);
        see.m35062b(parcel, a);
    }
}
