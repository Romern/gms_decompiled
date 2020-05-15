package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetAccountInfoUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brqm();

    /* renamed from: a */
    public String f152512a;

    /* renamed from: b */
    public String f152513b;

    /* renamed from: c */
    public boolean f152514c;

    /* renamed from: d */
    public String f152515d;

    /* renamed from: e */
    public String f152516e;

    /* renamed from: f */
    public ProviderUserInfoList f152517f;

    /* renamed from: g */
    public String f152518g;

    /* renamed from: h */
    public String f152519h;

    /* renamed from: i */
    public long f152520i;

    /* renamed from: j */
    public long f152521j;

    /* renamed from: k */
    public boolean f152522k;

    /* renamed from: l */
    public DefaultOAuthCredential f152523l;

    /* renamed from: m */
    public List f152524m;

    public GetAccountInfoUser() {
        this.f152517f = new ProviderUserInfoList();
    }

    public GetAccountInfoUser(String str, String str2, boolean z, String str3, String str4, ProviderUserInfoList providerUserInfoList, String str5, String str6, long j, long j2, boolean z2, DefaultOAuthCredential defaultOAuthCredential, List list) {
        ProviderUserInfoList providerUserInfoList2;
        this.f152512a = str;
        this.f152513b = str2;
        this.f152514c = z;
        this.f152515d = str3;
        this.f152516e = str4;
        if (providerUserInfoList != null) {
            List list2 = providerUserInfoList.f152543a;
            providerUserInfoList2 = new ProviderUserInfoList();
            if (list2 != null) {
                providerUserInfoList2.f152543a.addAll(list2);
            }
        } else {
            providerUserInfoList2 = new ProviderUserInfoList();
        }
        this.f152517f = providerUserInfoList2;
        this.f152518g = str5;
        this.f152519h = str6;
        this.f152520i = j;
        this.f152521j = j2;
        this.f152522k = z2;
        this.f152523l = defaultOAuthCredential;
        this.f152524m = list == null ? bngx.m109376e() : list;
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
        see.m35046a(parcel, 2, this.f152512a, false);
        see.m35046a(parcel, 3, this.f152513b, false);
        see.m35051a(parcel, 4, this.f152514c);
        see.m35046a(parcel, 5, this.f152515d, false);
        see.m35046a(parcel, 6, this.f152516e, false);
        see.m35040a(parcel, 7, this.f152517f, i, false);
        see.m35046a(parcel, 8, this.f152518g, false);
        see.m35046a(parcel, 9, this.f152519h, false);
        see.m35036a(parcel, 10, this.f152520i);
        see.m35036a(parcel, 11, this.f152521j);
        see.m35051a(parcel, 12, this.f152522k);
        see.m35040a(parcel, 13, this.f152523l, i, false);
        see.m35066c(parcel, 14, this.f152524m, false);
        see.m35062b(parcel, a);
    }
}
