package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegisterCorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new frz();

    /* renamed from: a */
    public final String f9635a;

    /* renamed from: b */
    public final String f9636b;

    /* renamed from: c */
    public final Uri f9637c;

    /* renamed from: d */
    public final RegisterSectionInfo[] f9638d;

    /* renamed from: e */
    public final GlobalSearchCorpusConfig f9639e;

    /* renamed from: f */
    public final boolean f9640f;

    /* renamed from: g */
    public final Account f9641g;

    /* renamed from: h */
    public final RegisterCorpusIMEInfo f9642h;

    /* renamed from: i */
    public final String f9643i;
    @Deprecated

    /* renamed from: j */
    public final boolean f9644j;

    /* renamed from: k */
    public final int f9645k;

    public RegisterCorpusInfo(String str, String str2, Uri uri, RegisterSectionInfo[] registerSectionInfoArr, GlobalSearchCorpusConfig globalSearchCorpusConfig, boolean z, Account account, RegisterCorpusIMEInfo registerCorpusIMEInfo, String str3, boolean z2, int i) {
        this.f9635a = str;
        this.f9636b = str2;
        this.f9637c = uri;
        this.f9638d = registerSectionInfoArr;
        this.f9639e = globalSearchCorpusConfig;
        this.f9640f = z;
        this.f9641g = account;
        this.f9642h = registerCorpusIMEInfo;
        this.f9643i = str3;
        this.f9644j = z2;
        this.f9645k = i;
    }

    /* renamed from: a */
    public static fry m6149a(String str) {
        return new fry(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterCorpusInfo) {
            RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) obj;
            return this.f9644j == registerCorpusInfo.f9644j && this.f9645k == registerCorpusInfo.f9645k && this.f9640f == registerCorpusInfo.f9640f && sdg.m34949a(this.f9635a, registerCorpusInfo.f9635a) && sdg.m34949a(this.f9636b, registerCorpusInfo.f9636b) && sdg.m34949a(this.f9637c, registerCorpusInfo.f9637c) && sdg.m34949a(this.f9639e, registerCorpusInfo.f9639e) && sdg.m34949a(this.f9642h, registerCorpusInfo.f9642h) && sdg.m34949a(this.f9641g, registerCorpusInfo.f9641g) && sdg.m34949a(this.f9643i, registerCorpusInfo.f9643i) && Arrays.equals(this.f9638d, registerCorpusInfo.f9638d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9635a, this.f9636b, this.f9637c, Integer.valueOf(Arrays.hashCode(this.f9638d)), this.f9639e, Boolean.valueOf(this.f9640f), this.f9641g, this.f9642h, this.f9643i, Boolean.valueOf(this.f9644j), Integer.valueOf(this.f9645k)});
    }

    /* renamed from: a */
    public final RegisterCorpusInfo mo7214a(Account account) {
        String encode = Uri.encode(account.type);
        String encode2 = Uri.encode(account.name);
        StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 1 + String.valueOf(encode2).length());
        sb.append(encode);
        sb.append("/");
        sb.append(encode2);
        String sb2 = sb.toString();
        String str = this.f9635a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(sb2).length());
        sb3.append(str);
        sb3.append("/");
        sb3.append(sb2);
        String sb4 = sb3.toString();
        Uri build = this.f9637c.buildUpon().appendEncodedPath(sb2).build();
        fry fry = new fry(sb4);
        fry.f17166a = this.f9636b;
        fry.f17167b = build;
        Collections.addAll(fry.f17168c, this.f9638d);
        fry.f17169d = this.f9639e;
        fry.f17170e = this.f9640f;
        fry.f17171f = account;
        fry.f17172g = this.f9642h;
        fry.f17173h = this.f9643i;
        fry.f17174i = this.f9644j;
        fry.f17175j = this.f9645k;
        return fry.mo11228a();
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
        see.m35046a(parcel, 1, this.f9635a, false);
        see.m35046a(parcel, 2, this.f9636b, false);
        see.m35040a(parcel, 3, this.f9637c, i, false);
        see.m35057a(parcel, 4, this.f9638d, i);
        see.m35040a(parcel, 7, this.f9639e, i, false);
        see.m35051a(parcel, 8, this.f9640f);
        see.m35040a(parcel, 9, this.f9641g, i, false);
        see.m35040a(parcel, 10, this.f9642h, i, false);
        see.m35046a(parcel, 11, this.f9643i, false);
        see.m35051a(parcel, 12, this.f9644j);
        see.m35063b(parcel, 13, this.f9645k);
        see.m35062b(parcel, a);
    }
}
