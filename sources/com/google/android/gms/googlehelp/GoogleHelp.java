package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aarg();

    /* renamed from: A */
    public boolean f78750A;

    /* renamed from: B */
    public boolean f78751B;

    /* renamed from: C */
    public int f78752C;

    /* renamed from: D */
    public String f78753D;

    /* renamed from: E */
    public boolean f78754E;

    /* renamed from: F */
    public String f78755F;

    /* renamed from: G */
    public aard f78756G;

    /* renamed from: H */
    public wvd f78757H;

    /* renamed from: a */
    final int f78758a;

    /* renamed from: b */
    public String f78759b;

    /* renamed from: c */
    public Account f78760c;

    /* renamed from: d */
    public Bundle f78761d;

    /* renamed from: e */
    public String f78762e;

    /* renamed from: f */
    String f78763f;

    /* renamed from: g */
    Bitmap f78764g;

    /* renamed from: h */
    public boolean f78765h;

    /* renamed from: i */
    public boolean f78766i;

    /* renamed from: j */
    public List f78767j;
    @Deprecated

    /* renamed from: k */
    public Bundle f78768k;
    @Deprecated

    /* renamed from: l */
    public Bitmap f78769l;
    @Deprecated

    /* renamed from: m */
    public byte[] f78770m;
    @Deprecated

    /* renamed from: n */
    public int f78771n;
    @Deprecated

    /* renamed from: o */
    public int f78772o;

    /* renamed from: p */
    public String f78773p;

    /* renamed from: q */
    public Uri f78774q;

    /* renamed from: r */
    public List f78775r;

    /* renamed from: s */
    public ThemeSettings f78776s;

    /* renamed from: t */
    public List f78777t;

    /* renamed from: u */
    public boolean f78778u;

    /* renamed from: v */
    public ErrorReport f78779v;

    /* renamed from: w */
    public TogglingData f78780w;

    /* renamed from: x */
    int f78781x;

    /* renamed from: y */
    public PendingIntent f78782y;

    /* renamed from: z */
    public int f78783z;

    @Deprecated
    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6) {
        int i8 = i;
        ErrorReport errorReport2 = errorReport;
        this.f78779v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            Log.e("gH_GoogleHelp", "Help requires a non-empty appContext. Please fix ASAP.");
        }
        this.f78758a = i8;
        this.f78783z = i6;
        this.f78750A = z4;
        this.f78751B = z5;
        this.f78752C = i7;
        this.f78753D = str5;
        this.f78759b = str;
        this.f78760c = account;
        this.f78761d = bundle;
        this.f78762e = str2;
        this.f78763f = str3;
        this.f78764g = bitmap;
        this.f78765h = z;
        this.f78766i = z2;
        this.f78754E = z6;
        this.f78767j = list;
        this.f78782y = pendingIntent;
        this.f78768k = bundle2;
        this.f78769l = bitmap2;
        this.f78770m = bArr;
        this.f78771n = i2;
        this.f78772o = i3;
        this.f78773p = str4;
        this.f78774q = uri;
        this.f78775r = list2;
        if (i8 < 4) {
            ThemeSettings themeSettings2 = new ThemeSettings();
            themeSettings2.f31623a = i4;
            this.f78776s = themeSettings2;
        } else {
            this.f78776s = themeSettings == null ? new ThemeSettings() : themeSettings;
        }
        this.f78777t = list3;
        this.f78778u = z3;
        this.f78779v = errorReport2;
        if (errorReport2 != null) {
            errorReport2.f31533X = "GoogleHelp";
        }
        this.f78780w = togglingData;
        this.f78781x = i5;
    }

    /* renamed from: a */
    public static GoogleHelp m66336a(String str) {
        return new GoogleHelp(str);
    }

    /* renamed from: a */
    public final Intent mo43194a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
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
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f78758a);
        see.m35046a(parcel, 2, this.f78759b, false);
        see.m35040a(parcel, 3, this.f78760c, i, false);
        see.m35037a(parcel, 4, this.f78761d, false);
        see.m35051a(parcel, 5, this.f78765h);
        see.m35051a(parcel, 6, this.f78766i);
        see.m35065b(parcel, 7, this.f78767j, false);
        see.m35037a(parcel, 10, this.f78768k, false);
        see.m35040a(parcel, 11, this.f78769l, i, false);
        see.m35046a(parcel, 14, this.f78773p, false);
        see.m35040a(parcel, 15, this.f78774q, i, false);
        see.m35066c(parcel, 16, this.f78775r, false);
        see.m35063b(parcel, 17, 0);
        see.m35066c(parcel, 18, this.f78777t, false);
        see.m35052a(parcel, 19, this.f78770m, false);
        see.m35063b(parcel, 20, this.f78771n);
        see.m35063b(parcel, 21, this.f78772o);
        see.m35051a(parcel, 22, this.f78778u);
        see.m35040a(parcel, 23, this.f78779v, i, false);
        see.m35040a(parcel, 25, this.f78776s, i, false);
        see.m35046a(parcel, 28, this.f78762e, false);
        see.m35040a(parcel, 31, this.f78780w, i, false);
        see.m35063b(parcel, 32, this.f78781x);
        see.m35040a(parcel, 33, this.f78782y, i, false);
        see.m35046a(parcel, 34, this.f78763f, false);
        see.m35040a(parcel, 35, this.f78764g, i, false);
        see.m35063b(parcel, 36, this.f78783z);
        see.m35051a(parcel, 37, this.f78750A);
        see.m35051a(parcel, 38, this.f78751B);
        see.m35063b(parcel, 39, this.f78752C);
        see.m35046a(parcel, 40, this.f78753D, false);
        see.m35051a(parcel, 41, this.f78754E);
        see.m35046a(parcel, 42, this.f78755F, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo43195a(Context context) {
        this.f78763f = context.getString(C0126R.string.common_google_settings);
        this.f78764g = BitmapFactory.decodeResource(context.getResources(), C0126R.C0127drawable.common_settings_icon);
    }

    /* renamed from: a */
    public final void mo43196a(FeedbackOptions feedbackOptions, File file) {
        if (feedbackOptions != null) {
            this.f78757H = feedbackOptions.f31606q;
        }
        ErrorReport errorReport = new ErrorReport(feedbackOptions, file);
        this.f78779v = errorReport;
        errorReport.f31533X = "GoogleHelp";
    }

    @Deprecated
    /* renamed from: a */
    public final void mo43197a(Map map) {
        this.f78761d = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            this.f78761d.putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6) {
        this(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, themeSettings, list3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6);
        this.f78755F = str6;
    }

    @Deprecated
    public GoogleHelp(String str) {
        this(14, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, null, false);
    }
}
