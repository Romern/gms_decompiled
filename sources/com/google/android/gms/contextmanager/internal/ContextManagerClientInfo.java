package com.google.android.gms.contextmanager.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContextManagerClientInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tme();

    /* renamed from: a */
    public final String f30677a;

    /* renamed from: b */
    public final String f30678b;

    /* renamed from: c */
    public final int f30679c;

    /* renamed from: d */
    public final String f30680d;

    /* renamed from: e */
    public final int f30681e;

    /* renamed from: f */
    public final int f30682f;

    /* renamed from: g */
    public final String f30683g;

    /* renamed from: h */
    public final String f30684h;

    /* renamed from: i */
    public final int f30685i;

    /* renamed from: j */
    public final int f30686j;

    /* renamed from: k */
    private doh f30687k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContextManagerClientInfo(String str, String str2, int i, String str3, int i2, int i3, int i4) {
        this(str, str2, i, str3, i2, i3, null, null, -1, i4);
        sdo.m34977c(str);
        sdo.m34977c(str2);
        sdo.m34977c(str3);
    }

    /* renamed from: a */
    public static ContextManagerClientInfo m22890a(Context context, String str, lri lri) {
        Account account = lri.f26639f;
        return new ContextManagerClientInfo(account == null ? str : account.name, context.getPackageName(), Process.myUid(), lri.f26634a, sqr.m35996a(context, context.getPackageName()), lri.f26635b, lri.f26636c, lri.f26637d, lri.f26638e, Process.myPid());
    }

    /* renamed from: b */
    public final boolean mo18067b() {
        return mo18066a() != null;
    }

    /* renamed from: c */
    public final boolean mo18068c() {
        return this.f30682f == 0;
    }

    /* renamed from: d */
    public final boolean mo18069d() {
        return this.f30682f == 1;
    }

    /* renamed from: e */
    public final boolean mo18070e() {
        return this.f30682f == 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContextManagerClientInfo) {
            ContextManagerClientInfo contextManagerClientInfo = (ContextManagerClientInfo) obj;
            return this.f30679c == contextManagerClientInfo.f30679c && this.f30681e == contextManagerClientInfo.f30681e && this.f30682f == contextManagerClientInfo.f30682f && this.f30685i == contextManagerClientInfo.f30685i && TextUtils.equals(this.f30677a, contextManagerClientInfo.f30677a) && TextUtils.equals(this.f30678b, contextManagerClientInfo.f30678b) && TextUtils.equals(this.f30680d, contextManagerClientInfo.f30680d) && TextUtils.equals(this.f30683g, contextManagerClientInfo.f30683g) && TextUtils.equals(this.f30684h, contextManagerClientInfo.f30684h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30677a, this.f30678b, Integer.valueOf(this.f30679c), this.f30680d, Integer.valueOf(this.f30681e), Integer.valueOf(this.f30682f), this.f30683g, this.f30684h, Integer.valueOf(this.f30685i)});
    }

    public final String toString() {
        String valueOf = String.valueOf(mo18066a());
        String str = this.f30678b;
        int i = this.f30679c;
        String str2 = this.f30680d;
        int i2 = this.f30681e;
        String num = Integer.toString(this.f30682f);
        String str3 = this.f30683g;
        String str4 = this.f30684h;
        int i3 = this.f30686j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(num).length();
        StringBuilder sb = new StringBuilder(length + 89 + length2 + length3 + length4 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("(accnt=");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(str);
        sb.append("(");
        sb.append(i);
        sb.append("):");
        sb.append(str2);
        sb.append(", vrsn=");
        sb.append(i2);
        sb.append(", ");
        sb.append(num);
        sb.append(", 3pPkg = ");
        sb.append(str3);
        sb.append(" ,  3pMdlId = ");
        sb.append(str4);
        sb.append(" ,  pid = ");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
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
        see.m35046a(parcel, 2, this.f30677a, false);
        see.m35046a(parcel, 3, this.f30678b, false);
        see.m35063b(parcel, 4, this.f30679c);
        see.m35046a(parcel, 5, this.f30680d, false);
        see.m35063b(parcel, 6, this.f30681e);
        see.m35063b(parcel, 7, this.f30682f);
        see.m35046a(parcel, 8, this.f30683g, false);
        see.m35046a(parcel, 9, this.f30684h, false);
        see.m35063b(parcel, 10, this.f30685i);
        see.m35063b(parcel, 11, this.f30686j);
        see.m35062b(parcel, a);
    }

    public ContextManagerClientInfo(String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, int i4, int i5) {
        this.f30677a = str;
        this.f30678b = str2;
        this.f30679c = i;
        this.f30680d = str3;
        this.f30681e = i2;
        this.f30682f = i3;
        this.f30683g = str4;
        this.f30684h = str5;
        this.f30685i = i4;
        this.f30686j = i5;
    }

    /* renamed from: a */
    public final doh mo18066a() {
        String str = this.f30677a;
        if (str == null) {
            return null;
        }
        if (this.f30687k == null) {
            this.f30687k = new doh(str);
        }
        return this.f30687k;
    }
}
