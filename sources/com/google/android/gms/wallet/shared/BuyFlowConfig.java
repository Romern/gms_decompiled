package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BuyFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new awyc();

    /* renamed from: a */
    public String f110417a;

    /* renamed from: b */
    public ApplicationParameters f110418b;

    /* renamed from: c */
    public String f110419c;

    /* renamed from: d */
    public String f110420d;

    /* renamed from: e */
    public String f110421e;

    public BuyFlowConfig() {
    }

    /* renamed from: a */
    public static awyb m94175a() {
        return new awyb(new BuyFlowConfig());
    }

    /* renamed from: b */
    public final String mo60046b() {
        return !TextUtils.isEmpty(this.f110421e) ? this.f110421e : this.f110419c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        awyc.m81487a(this, parcel, i);
    }

    public BuyFlowConfig(String str, ApplicationParameters applicationParameters, String str2, String str3, String str4) {
        this.f110417a = str;
        this.f110418b = applicationParameters;
        this.f110419c = str2;
        this.f110420d = str3;
        this.f110421e = str4;
    }

    /* renamed from: a */
    public static awyb m94176a(BuyFlowConfig buyFlowConfig) {
        awyb a = m94175a();
        a.mo52749a(buyFlowConfig.f110418b);
        a.mo52750a(buyFlowConfig.mo60046b());
        a.mo52751b(buyFlowConfig.f110419c);
        a.mo52752c(buyFlowConfig.f110420d);
        a.mo52753d(buyFlowConfig.f110417a);
        return a;
    }
}
