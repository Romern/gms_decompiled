package com.google.android.location.reporting.state.update;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AccountConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgyl();

    /* renamed from: a */
    public final Account f150890a;

    /* renamed from: b */
    public final boolean f150891b;

    /* renamed from: c */
    public final long f150892c;

    /* renamed from: d */
    public final boolean f150893d;

    /* renamed from: e */
    public final boolean f150894e;

    /* renamed from: f */
    public final String f150895f;

    /* renamed from: g */
    public final boolean f150896g;

    /* renamed from: h */
    public final String f150897h;

    /* renamed from: i */
    public final long f150898i;

    /* renamed from: j */
    public final int f150899j;

    /* renamed from: k */
    public final boolean f150900k;

    /* renamed from: l */
    public final boolean f150901l;

    /* renamed from: m */
    public final Conditions f150902m;

    /* renamed from: n */
    public final int f150903n;

    /* renamed from: o */
    public final String f150904o;

    /* renamed from: p */
    public final Long f150905p;

    /* renamed from: q */
    public final Long f150906q;

    /* renamed from: r */
    public final boolean f150907r;

    /* renamed from: s */
    public final int f150908s;

    public AccountConfig(Account account, boolean z, long j, boolean z2, boolean z3, String str, boolean z4, String str2, long j2, int i, boolean z5, boolean z6, Conditions conditions, int i2, String str3, Long l, Long l2, boolean z7, int i3) {
        this.f150890a = account;
        this.f150891b = z;
        this.f150892c = j;
        this.f150893d = z2;
        this.f150894e = z3;
        this.f150895f = str;
        this.f150896g = z4;
        this.f150897h = str2;
        this.f150898i = j2;
        this.f150899j = i;
        this.f150900k = z5;
        this.f150901l = z6;
        this.f150902m = conditions;
        this.f150903n = i2;
        this.f150905p = l;
        this.f150904o = str3;
        this.f150906q = l2;
        this.f150907r = z7;
        this.f150908s = i3;
    }

    /* renamed from: a */
    private final int m117313a(boolean z) {
        if (this.f150891b) {
            return !z ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo70906b() {
        return m117313a(this.f150896g);
    }

    /* renamed from: c */
    public final boolean mo70907c() {
        return this.f150899j != 0;
    }

    /* renamed from: d */
    public final List mo70908d() {
        return this.f150902m.mo70920b();
    }

    /* renamed from: e */
    public final List mo70909e() {
        InactiveReason inactiveReason;
        List d = mo70908d();
        if (!d.isEmpty()) {
            return d;
        }
        if (!this.f150902m.f150912d) {
            d.add(new InactiveReason(4, "GoogleLocationDisabled"));
        }
        if (!this.f150893d) {
            d.add(new InactiveReason(5, "NotGoogleAccountOnDevice"));
        }
        if (!this.f150900k) {
            d.add(new InactiveReason(10, "AuthError"));
        }
        if (!this.f150894e) {
            d.add(new InactiveReason(6, "ReportingNotEnabled"));
        }
        if (!this.f150896g) {
            d.add(new InactiveReason(14, "HistoryNotEnabled"));
        }
        switch (this.f150899j) {
            case 0:
                inactiveReason = null;
                break;
            case 1:
                inactiveReason = new InactiveReason(7, "AgeUnder13");
                break;
            case 2:
                inactiveReason = new InactiveReason(7, "AgeUnknown");
                break;
            case 3:
                inactiveReason = new InactiveReason(7, "DasherPolicy");
                break;
            case 4:
                inactiveReason = new InactiveReason(7, "LegalCountry");
                break;
            case 5:
                inactiveReason = new InactiveReason(7, "AccountDeleted");
                break;
            case 6:
                inactiveReason = new InactiveReason(7, "AccountPurged");
                break;
            default:
                inactiveReason = new InactiveReason(7, "UnknownRestriction");
                break;
        }
        if (inactiveReason != null) {
            d.add(inactiveReason);
        }
        return Collections.unmodifiableList(d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountConfig) {
            AccountConfig accountConfig = (AccountConfig) obj;
            return this.f150890a.equals(accountConfig.f150890a) && this.f150891b == accountConfig.f150891b && this.f150892c == accountConfig.f150892c && this.f150893d == accountConfig.f150893d && this.f150894e == accountConfig.f150894e && bxbl.m122538a(this.f150895f, accountConfig.f150895f) && this.f150896g == accountConfig.f150896g && bxbl.m122538a(this.f150897h, accountConfig.f150897h) && this.f150898i == accountConfig.f150898i && this.f150899j == accountConfig.f150899j && this.f150900k == accountConfig.f150900k && this.f150901l == accountConfig.f150901l && this.f150902m.equals(accountConfig.f150902m) && this.f150903n == accountConfig.f150903n && this.f150907r == accountConfig.f150907r && this.f150908s == accountConfig.f150908s && bxbl.m122538a(this.f150905p, accountConfig.f150905p) && bxbl.m122538a(this.f150906q, accountConfig.f150906q) && bxbl.m122538a(this.f150904o, accountConfig.f150904o);
        }
    }

    /* renamed from: f */
    public final boolean mo70911f() {
        return this.f150902m.mo70921c();
    }

    /* renamed from: g */
    public final boolean mo70912g() {
        return mo70911f() && this.f150893d && !mo70907c();
    }

    /* renamed from: h */
    public final boolean mo70913h() {
        boolean z = false;
        if (mo70915i() && this.f150902m.f150912d) {
            z = true;
        }
        if (!z || this.f150902m.f150913e) {
            return z;
        }
        bguv.m100042a("OptInWithLocationOff");
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f150890a, Boolean.valueOf(this.f150891b), Long.valueOf(this.f150892c), Boolean.valueOf(this.f150893d), Boolean.valueOf(this.f150894e), this.f150895f, Boolean.valueOf(this.f150896g), this.f150897h, Long.valueOf(this.f150898i), Integer.valueOf(this.f150899j), Boolean.valueOf(this.f150900k), Boolean.valueOf(this.f150901l), this.f150902m, Integer.valueOf(this.f150903n), this.f150904o, this.f150905p, this.f150906q, Boolean.valueOf(this.f150907r), Integer.valueOf(this.f150908s)});
    }

    /* renamed from: i */
    public final boolean mo70915i() {
        return mo70912g() && this.f150900k;
    }

    /* renamed from: j */
    public final boolean mo70916j() {
        if (chcs.f188354a.mo6606a().mo85014C()) {
            return mo70909e().isEmpty() && this.f150902m.f150913e;
        }
        return mo70909e().isEmpty();
    }

    public final String toString() {
        String str;
        String str2 = this.f150904o;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder(str2.length() + 2);
            sb.append('\"');
            sb.append(str2);
            sb.append('\"');
            str = sb.toString();
        } else {
            str = "null";
        }
        bxbk a = bxbl.m122537a(this);
        a.mo73559a("mAccount", aeqm.m52397a(this.f150890a));
        a.mo73559a("isActive", Boolean.valueOf(mo70916j()));
        a.mo73559a("mDefined", Boolean.valueOf(this.f150891b));
        a.mo73559a("mUpdateNumber", Long.valueOf(this.f150892c));
        a.mo73559a("mValidAccount", Boolean.valueOf(this.f150893d));
        a.mo73559a("mReportingEnabled", Boolean.valueOf(this.f150894e));
        a.mo73559a("mReportingPackage", this.f150895f);
        a.mo73559a("mHistoryEnabled", Boolean.valueOf(this.f150896g));
        a.mo73559a("mHistoryPackage", this.f150897h);
        a.mo73559a("mServerMillis", Long.valueOf(this.f150898i));
        a.mo73559a("mRestriction", Integer.valueOf(this.f150899j));
        a.mo73559a("mAuthorized", Boolean.valueOf(this.f150900k));
        a.mo73559a("mDirty", Boolean.valueOf(this.f150901l));
        a.mo73559a("mConditions", this.f150902m);
        a.mo73559a("mDeviceTag", aeqm.m52398a(Integer.valueOf(this.f150903n)));
        a.mo73559a("mDevicePrettyName", str);
        a.mo73559a("mGcmIdUploadTime", this.f150905p);
        a.mo73559a("mLastUploadTimeMs", this.f150906q);
        a.mo73559a("mPrimaryDevice", Boolean.valueOf(this.f150907r));
        a.mo73559a("mAccountType", Integer.valueOf(this.f150908s));
        return a.toString();
    }

    public AccountConfig(bgyk bgyk) {
        Account account = bgyk.f118062a;
        sdo.m34959a(account);
        this.f150890a = account;
        this.f150891b = bgyk.f118064c.booleanValue();
        this.f150892c = bgyk.f118063b.longValue();
        this.f150893d = bgyk.f118065d.booleanValue();
        this.f150894e = bgyk.f118070i.booleanValue();
        this.f150895f = bgyk.f118071j;
        this.f150896g = bgyk.f118072k.booleanValue();
        this.f150897h = bgyk.f118073l;
        this.f150898i = bgyk.f118068g.longValue();
        this.f150899j = bgyk.f118069h.intValue();
        this.f150900k = bgyk.f118067f.booleanValue();
        this.f150901l = bgyk.f118066e.booleanValue();
        Conditions conditions = bgyk.f118074m;
        sdo.m34959a(conditions);
        this.f150902m = conditions;
        this.f150903n = bgyk.f118075n.intValue();
        this.f150905p = bgyk.f118077p;
        this.f150904o = bgyk.f118076o;
        this.f150906q = bgyk.f118078q;
        this.f150907r = bgyk.f118079r.booleanValue();
        this.f150908s = bgyk.f118080s.intValue();
    }

    /* renamed from: a */
    public static bgyk m117314a(Account account) {
        return new bgyk(account);
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
        see.m35040a(parcel, 2, this.f150890a, i, false);
        see.m35051a(parcel, 3, this.f150891b);
        see.m35036a(parcel, 4, this.f150892c);
        see.m35051a(parcel, 5, this.f150893d);
        see.m35051a(parcel, 6, this.f150894e);
        see.m35046a(parcel, 7, this.f150895f, false);
        see.m35051a(parcel, 8, this.f150896g);
        see.m35046a(parcel, 9, this.f150897h, false);
        see.m35036a(parcel, 10, this.f150898i);
        see.m35063b(parcel, 11, this.f150899j);
        see.m35051a(parcel, 12, this.f150900k);
        see.m35051a(parcel, 13, this.f150901l);
        see.m35040a(parcel, 14, this.f150902m, i, false);
        see.m35063b(parcel, 15, this.f150903n);
        see.m35046a(parcel, 16, this.f150904o, false);
        see.m35045a(parcel, 17, this.f150905p);
        see.m35045a(parcel, 18, this.f150906q);
        see.m35051a(parcel, 19, this.f150907r);
        see.m35063b(parcel, 20, this.f150908s);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final int mo70904a() {
        return m117313a(this.f150894e);
    }

    /* renamed from: a */
    public final ReportingState mo70905a(int i, int i2, boolean z, boolean z2) {
        return new ReportingState(mo70904a(), mo70906b(), mo70912g(), mo70916j(), i, i2, z ? Integer.valueOf(this.f150903n) : null, z2);
    }
}
