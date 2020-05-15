package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ApplicationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new awya();

    /* renamed from: a */
    public int f110406a;

    /* renamed from: b */
    public Account f110407b;

    /* renamed from: c */
    public Bundle f110408c;

    /* renamed from: d */
    public boolean f110409d;

    /* renamed from: e */
    public int f110410e;

    /* renamed from: f */
    public WalletCustomTheme f110411f;

    /* renamed from: g */
    public int f110412g;

    /* renamed from: h */
    public double f110413h;

    /* renamed from: i */
    public double f110414i;

    /* renamed from: j */
    public int f110415j;

    /* renamed from: k */
    public int f110416k;

    public ApplicationParameters() {
        this.f110409d = false;
        this.f110406a = 1;
        this.f110410e = 1;
        this.f110412g = 0;
        this.f110415j = 0;
        this.f110416k = -1;
    }

    /* renamed from: a */
    public static awxz m94173a() {
        return new awxz(new ApplicationParameters());
    }

    public ApplicationParameters(int i, Account account, Bundle bundle, boolean z, int i2, WalletCustomTheme walletCustomTheme, int i3, double d, double d2, int i4, int i5) {
        this.f110406a = i;
        this.f110407b = account;
        this.f110408c = bundle;
        this.f110409d = z;
        this.f110410e = i2;
        this.f110411f = walletCustomTheme;
        this.f110412g = i3;
        this.f110413h = d;
        this.f110414i = d2;
        this.f110415j = i4;
        this.f110416k = i5;
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110406a);
        see.m35040a(parcel, 3, this.f110407b, i, false);
        see.m35037a(parcel, 4, this.f110408c, false);
        see.m35051a(parcel, 5, this.f110409d);
        see.m35063b(parcel, 6, this.f110410e);
        see.m35040a(parcel, 7, this.f110411f, i, false);
        see.m35063b(parcel, 8, this.f110412g);
        see.m35033a(parcel, 9, this.f110413h);
        see.m35033a(parcel, 10, this.f110414i);
        see.m35063b(parcel, 11, this.f110415j);
        see.m35063b(parcel, 12, this.f110416k);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static awxz m94174a(ApplicationParameters applicationParameters) {
        awxz a = m94173a();
        a.mo52744b(applicationParameters.f110406a);
        a.mo52739a(applicationParameters.f110407b);
        a.mo52740a(applicationParameters.f110408c);
        a.mo52742a(applicationParameters.f110409d);
        a.mo52745c(applicationParameters.f110410e);
        a.mo52741a(applicationParameters.f110411f);
        a.mo52738a(applicationParameters.f110412g);
        a.mo52743b(applicationParameters.f110413h);
        a.mo52737a(applicationParameters.f110414i);
        int i = applicationParameters.f110415j;
        ApplicationParameters applicationParameters2 = a.f95270a;
        applicationParameters2.f110415j = i;
        applicationParameters2.f110416k = applicationParameters.f110416k;
        return a;
    }
}
