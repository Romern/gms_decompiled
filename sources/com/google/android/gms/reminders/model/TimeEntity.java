package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimeEntity extends AbstractSafeParcelable implements Time {
    public static final Parcelable.Creator CREATOR = new aouf();

    /* renamed from: a */
    public final Integer f107195a;

    /* renamed from: b */
    public final Integer f107196b;

    /* renamed from: c */
    public final Integer f107197c;

    public TimeEntity(Time time) {
        this(time.mo58724c(), time.mo58725d(), time.mo58727f());
    }

    /* renamed from: a */
    public static int m92213a(Time time) {
        return Arrays.hashCode(new Object[]{time.mo58724c(), time.mo58725d(), time.mo58727f()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Integer mo58724c() {
        return this.f107195a;
    }

    /* renamed from: d */
    public final Integer mo58725d() {
        return this.f107196b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        if (this != obj) {
            return m92214a(this, (Time) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Integer mo58727f() {
        return this.f107197c;
    }

    public final int hashCode() {
        return m92213a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aouf.m69523a(this, parcel);
    }

    public TimeEntity(Integer num, Integer num2, Integer num3) {
        this.f107195a = num;
        this.f107196b = num2;
        this.f107197c = num3;
    }

    /* renamed from: a */
    public static boolean m92214a(Time time, Time time2) {
        return sdg.m34949a(time.mo58724c(), time2.mo58724c()) && sdg.m34949a(time.mo58725d(), time2.mo58725d()) && sdg.m34949a(time.mo58727f(), time2.mo58727f());
    }
}
