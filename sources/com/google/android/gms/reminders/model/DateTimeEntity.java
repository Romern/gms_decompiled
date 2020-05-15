package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DateTimeEntity extends AbstractSafeParcelable implements DateTime {
    public static final Parcelable.Creator CREATOR = new aotn();

    /* renamed from: a */
    public final Integer f107125a;

    /* renamed from: b */
    public final Integer f107126b;

    /* renamed from: c */
    public final Integer f107127c;

    /* renamed from: d */
    public final TimeEntity f107128d;

    /* renamed from: e */
    public final Integer f107129e;

    /* renamed from: f */
    public final Integer f107130f;

    /* renamed from: g */
    public final Long f107131g;

    /* renamed from: h */
    public final Boolean f107132h;

    /* renamed from: i */
    public final Boolean f107133i;

    public DateTimeEntity(DateTime dateTime) {
        this(dateTime.mo58630c(), dateTime.mo58631d(), dateTime.mo58633f(), dateTime.mo58634g(), dateTime.mo58635h(), dateTime.mo58636i(), dateTime.mo58637j(), dateTime.mo58638k(), dateTime.mo58639l(), false);
    }

    /* renamed from: a */
    public static int m92043a(DateTime dateTime) {
        return Arrays.hashCode(new Object[]{dateTime.mo58630c(), dateTime.mo58631d(), dateTime.mo58633f(), dateTime.mo58634g(), dateTime.mo58635h(), dateTime.mo58636i(), dateTime.mo58637j(), dateTime.mo58638k(), dateTime.mo58639l()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Integer mo58630c() {
        return this.f107125a;
    }

    /* renamed from: d */
    public final Integer mo58631d() {
        return this.f107126b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DateTime)) {
            return false;
        }
        if (this != obj) {
            return m92044a(this, (DateTime) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final Integer mo58633f() {
        return this.f107127c;
    }

    /* renamed from: g */
    public final Time mo58634g() {
        return this.f107128d;
    }

    /* renamed from: h */
    public final Integer mo58635h() {
        return this.f107129e;
    }

    public final int hashCode() {
        return m92043a(this);
    }

    /* renamed from: i */
    public final Integer mo58636i() {
        return this.f107130f;
    }

    /* renamed from: j */
    public final Long mo58637j() {
        return this.f107131g;
    }

    /* renamed from: k */
    public final Boolean mo58638k() {
        return this.f107132h;
    }

    /* renamed from: l */
    public final Boolean mo58639l() {
        return this.f107133i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotn.m69505a(this, parcel, i);
    }

    public DateTimeEntity(Integer num, Integer num2, Integer num3, Time time, Integer num4, Integer num5, Long l, Boolean bool, Boolean bool2, boolean z) {
        this.f107125a = num;
        this.f107126b = num2;
        this.f107127c = num3;
        this.f107129e = num4;
        this.f107130f = num5;
        this.f107131g = l;
        this.f107132h = bool;
        this.f107133i = bool2;
        if (z) {
            this.f107128d = (TimeEntity) time;
        } else {
            this.f107128d = time != null ? new TimeEntity(time) : null;
        }
    }

    /* renamed from: a */
    public static boolean m92044a(DateTime dateTime, DateTime dateTime2) {
        return sdg.m34949a(dateTime.mo58630c(), dateTime2.mo58630c()) && sdg.m34949a(dateTime.mo58631d(), dateTime2.mo58631d()) && sdg.m34949a(dateTime.mo58633f(), dateTime2.mo58633f()) && sdg.m34949a(dateTime.mo58634g(), dateTime2.mo58634g()) && sdg.m34949a(dateTime.mo58635h(), dateTime2.mo58635h()) && sdg.m34949a(dateTime.mo58636i(), dateTime2.mo58636i()) && sdg.m34949a(dateTime.mo58637j(), dateTime2.mo58637j()) && sdg.m34949a(dateTime.mo58638k(), dateTime2.mo58638k()) && sdg.m34949a(dateTime.mo58639l(), dateTime2.mo58639l());
    }

    public DateTimeEntity(Integer num, Integer num2, Integer num3, TimeEntity timeEntity, Integer num4, Integer num5, Long l, Boolean bool, Boolean bool2) {
        this.f107125a = num;
        this.f107126b = num2;
        this.f107127c = num3;
        this.f107128d = timeEntity;
        this.f107129e = num4;
        this.f107130f = num5;
        this.f107131g = l;
        this.f107132h = bool;
        this.f107133i = bool2;
    }
}
