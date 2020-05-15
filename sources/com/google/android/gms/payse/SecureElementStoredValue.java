package com.google.android.gms.payse;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.math.BigDecimal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SecureElementStoredValue extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new alkd();

    /* renamed from: a */
    public String f81676a;

    /* renamed from: b */
    public int f81677b;

    /* renamed from: c */
    public String f81678c;

    /* renamed from: d */
    public BigDecimal f81679d;

    /* renamed from: e */
    public String f81680e;

    /* renamed from: f */
    public int f81681f;

    /* renamed from: g */
    public String f81682g;

    public SecureElementStoredValue(String str, int i, String str2, BigDecimal bigDecimal, String str3, int i2, String str4) {
        this.f81676a = str;
        this.f81677b = i;
        this.f81678c = str2;
        this.f81679d = bigDecimal;
        this.f81680e = str3;
        this.f81681f = i2;
        this.f81682g = str4;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("id", this.f81676a);
        a.mo25396a("serviceProvider", Integer.valueOf(this.f81677b));
        a.mo25396a("cardId", this.f81678c);
        a.mo25396a("balance", this.f81679d);
        int i = this.f81681f;
        a.mo25396a("state", i != 0 ? i != 1 ? i != 2 ? "CARD_STATE_UNKNOWN" : "STORED_VALUE_CARD_STATE_NEEDS_FIX" : "STORED_VALUE_CARD_STATE_ACTIVE" : "STORED_VALUE_CARD_STATE_ABSENT");
        a.mo25396a("nonce", this.f81682g);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        alkd.m61182a(this, parcel);
    }
}
