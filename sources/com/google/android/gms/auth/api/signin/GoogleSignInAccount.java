package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ice();

    /* renamed from: a */
    final int f10314a;

    /* renamed from: b */
    public String f10315b;

    /* renamed from: c */
    public String f10316c;

    /* renamed from: d */
    public String f10317d;

    /* renamed from: e */
    public String f10318e;

    /* renamed from: f */
    public Uri f10319f;

    /* renamed from: g */
    public String f10320g;

    /* renamed from: h */
    public long f10321h;

    /* renamed from: i */
    public String f10322i;

    /* renamed from: j */
    public List f10323j;

    /* renamed from: k */
    public String f10324k;

    /* renamed from: l */
    public String f10325l;

    /* renamed from: m */
    private Set f10326m = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f10314a = i;
        this.f10315b = str;
        this.f10316c = str2;
        this.f10317d = str3;
        this.f10318e = str4;
        this.f10319f = uri;
        this.f10320g = str5;
        this.f10321h = j;
        this.f10322i = str6;
        this.f10323j = list;
        this.f10324k = str7;
        this.f10325l = str8;
    }

    /* renamed from: a */
    public static GoogleSignInAccount m6412a(Account account, Scope scope, Scope... scopeArr) {
        sdo.m34959a(account);
        sdo.m34959a(scope);
        HashSet hashSet = new HashSet();
        hashSet.add(scope);
        hashSet.addAll(Arrays.asList(scopeArr));
        return m6413a(null, null, account.name, null, null, null, null, 0L, account.name, hashSet);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.f10322i.equals(this.f10322i) && googleSignInAccount.mo7522a().equals(mo7522a());
        }
    }

    public final int hashCode() {
        return ((this.f10322i.hashCode() + 527) * 31) + mo7522a().hashCode();
    }

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
        see.m35063b(parcel, 1, this.f10314a);
        see.m35046a(parcel, 2, this.f10315b, false);
        see.m35046a(parcel, 3, this.f10316c, false);
        see.m35046a(parcel, 4, this.f10317d, false);
        see.m35046a(parcel, 5, this.f10318e, false);
        see.m35040a(parcel, 6, this.f10319f, i, false);
        see.m35046a(parcel, 7, this.f10320g, false);
        see.m35036a(parcel, 8, this.f10321h);
        see.m35046a(parcel, 9, this.f10322i, false);
        see.m35066c(parcel, 10, this.f10323j, false);
        see.m35046a(parcel, 11, this.f10324k, false);
        see.m35046a(parcel, 12, this.f10325l, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static GoogleSignInAccount m6413a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        Long l2;
        if (l != null) {
            l2 = l;
        } else {
            l2 = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        long longValue = l2.longValue();
        sdo.m34977c(str7);
        sdo.m34959a(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    /* renamed from: a */
    public final Set mo7522a() {
        HashSet hashSet = new HashSet(this.f10323j);
        hashSet.addAll(this.f10326m);
        return hashSet;
    }
}
