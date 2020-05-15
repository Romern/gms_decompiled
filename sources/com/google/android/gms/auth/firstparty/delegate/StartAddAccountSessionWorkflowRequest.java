package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StartAddAccountSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new iyq();

    /* renamed from: a */
    public final int f10801a;

    /* renamed from: b */
    public List f10802b;

    /* renamed from: c */
    public Bundle f10803c;

    /* renamed from: d */
    public final AppDescription f10804d;

    /* renamed from: e */
    public final String f10805e;

    /* renamed from: f */
    public AccountAuthenticatorResponse f10806f;

    /* renamed from: g */
    public boolean f10807g;

    /* renamed from: h */
    public boolean f10808h;

    /* renamed from: i */
    public String f10809i;

    /* renamed from: j */
    public String f10810j;

    public StartAddAccountSessionWorkflowRequest(int i, List list, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z, boolean z2, String str2, String str3) {
        this.f10801a = i;
        this.f10802b = list;
        this.f10803c = bundle;
        sdo.m34959a(appDescription);
        this.f10804d = appDescription;
        this.f10805e = str;
        this.f10806f = accountAuthenticatorResponse;
        this.f10807g = z;
        this.f10808h = z2;
        this.f10809i = str2;
        this.f10810j = str3;
    }

    /* renamed from: a */
    public final List mo7662a() {
        List list = this.f10802b;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    /* renamed from: b */
    public final Bundle mo7663b() {
        return new Bundle(this.f10803c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10801a);
        see.m35065b(parcel, 2, mo7662a(), false);
        see.m35037a(parcel, 3, mo7663b(), false);
        see.m35040a(parcel, 4, this.f10804d, i, false);
        see.m35046a(parcel, 5, this.f10805e, false);
        see.m35040a(parcel, 6, this.f10806f, i, false);
        see.m35051a(parcel, 7, this.f10807g);
        see.m35051a(parcel, 8, this.f10808h);
        see.m35046a(parcel, 9, this.f10809i, false);
        see.m35046a(parcel, 10, this.f10810j, false);
        see.m35062b(parcel, a);
    }
}
