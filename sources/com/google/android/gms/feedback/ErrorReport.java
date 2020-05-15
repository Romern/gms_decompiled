package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.File;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ErrorReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wvh();

    /* renamed from: A */
    public String f31510A;

    /* renamed from: B */
    public String f31511B;

    /* renamed from: C */
    public String f31512C;

    /* renamed from: D */
    public Bundle f31513D;

    /* renamed from: E */
    public boolean f31514E;

    /* renamed from: F */
    public int f31515F;

    /* renamed from: G */
    public int f31516G;

    /* renamed from: H */
    public boolean f31517H;

    /* renamed from: I */
    public String f31518I;

    /* renamed from: J */
    public String f31519J;

    /* renamed from: K */
    public int f31520K;

    /* renamed from: L */
    public String f31521L;

    /* renamed from: M */
    public String f31522M;

    /* renamed from: N */
    public String f31523N;

    /* renamed from: O */
    public String f31524O;

    /* renamed from: P */
    public String f31525P;
    @Deprecated

    /* renamed from: Q */
    public String f31526Q;

    /* renamed from: R */
    public String f31527R;

    /* renamed from: S */
    public BitmapTeleporter f31528S;

    /* renamed from: T */
    public String f31529T;

    /* renamed from: U */
    public FileTeleporter[] f31530U;

    /* renamed from: V */
    public String[] f31531V;

    /* renamed from: W */
    public boolean f31532W;

    /* renamed from: X */
    public String f31533X;

    /* renamed from: Y */
    public ThemeSettings f31534Y;

    /* renamed from: Z */
    public LogOptions f31535Z;

    /* renamed from: a */
    public ApplicationErrorReport f31536a;
    @Deprecated

    /* renamed from: aa */
    public String f31537aa;

    /* renamed from: ab */
    public boolean f31538ab;

    /* renamed from: ac */
    public Bundle f31539ac;

    /* renamed from: ad */
    public List f31540ad;

    /* renamed from: ae */
    public boolean f31541ae;

    /* renamed from: af */
    public Bitmap f31542af;

    /* renamed from: ag */
    public String f31543ag;

    /* renamed from: ah */
    public List f31544ah;

    /* renamed from: ai */
    public int f31545ai;

    /* renamed from: b */
    public String f31546b;

    /* renamed from: c */
    public int f31547c;

    /* renamed from: d */
    public String f31548d;

    /* renamed from: e */
    public String f31549e;

    /* renamed from: f */
    public String f31550f;

    /* renamed from: g */
    public String f31551g;

    /* renamed from: h */
    public String f31552h;

    /* renamed from: i */
    public String f31553i;

    /* renamed from: j */
    public String f31554j;

    /* renamed from: k */
    public int f31555k;

    /* renamed from: l */
    public String f31556l;

    /* renamed from: m */
    public String f31557m;

    /* renamed from: n */
    public String f31558n;

    /* renamed from: o */
    public String f31559o;

    /* renamed from: p */
    public String f31560p;

    /* renamed from: q */
    public String[] f31561q;

    /* renamed from: r */
    public String[] f31562r;

    /* renamed from: s */
    public String[] f31563s;

    /* renamed from: t */
    public String f31564t;

    /* renamed from: u */
    public String f31565u;

    /* renamed from: v */
    public byte[] f31566v;

    /* renamed from: w */
    public int f31567w;

    /* renamed from: x */
    public int f31568x;

    /* renamed from: y */
    public int f31569y;

    /* renamed from: z */
    public int f31570z;

    public ErrorReport() {
        this.f31536a = new ApplicationErrorReport();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        wvh.m42339a(this, parcel, i);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10) {
        new ApplicationErrorReport();
        this.f31536a = applicationErrorReport;
        this.f31546b = str;
        this.f31547c = i;
        this.f31548d = str2;
        this.f31549e = str3;
        this.f31550f = str4;
        this.f31551g = str5;
        this.f31552h = str6;
        this.f31553i = str7;
        this.f31554j = str8;
        this.f31555k = i2;
        this.f31556l = str9;
        this.f31557m = str10;
        this.f31558n = str11;
        this.f31559o = str12;
        this.f31560p = str13;
        this.f31561q = strArr;
        this.f31562r = strArr2;
        this.f31563s = strArr3;
        this.f31564t = str14;
        this.f31565u = str15;
        this.f31566v = bArr;
        this.f31567w = i3;
        this.f31568x = i4;
        this.f31569y = i5;
        this.f31570z = i6;
        this.f31510A = str16;
        this.f31511B = str17;
        this.f31512C = str18;
        this.f31513D = bundle;
        this.f31514E = z;
        this.f31515F = i7;
        this.f31516G = i8;
        this.f31517H = z2;
        this.f31518I = str19;
        this.f31519J = str20;
        this.f31520K = i9;
        this.f31521L = str21;
        this.f31522M = str22;
        this.f31523N = str23;
        this.f31524O = str24;
        this.f31525P = str25;
        this.f31526Q = str26;
        this.f31527R = str27;
        this.f31528S = bitmapTeleporter;
        this.f31529T = str28;
        this.f31530U = fileTeleporterArr;
        this.f31531V = strArr4;
        this.f31532W = z3;
        this.f31533X = str29;
        this.f31534Y = themeSettings;
        this.f31535Z = logOptions;
        this.f31537aa = str30;
        this.f31538ab = z4;
        this.f31539ac = bundle2;
        this.f31540ad = list;
        this.f31541ae = z5;
        this.f31542af = bitmap;
        this.f31543ag = str31;
        this.f31544ah = list2;
        this.f31545ai = i10;
    }

    public ErrorReport(FeedbackOptions feedbackOptions, File file) {
        ApplicationErrorReport.CrashInfo crashInfo;
        this.f31536a = new ApplicationErrorReport();
        if (feedbackOptions != null) {
            Bundle bundle = feedbackOptions.f31591b;
            if (bundle != null && bundle.size() > 0) {
                this.f31513D = feedbackOptions.f31591b;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f31590a)) {
                this.f31511B = feedbackOptions.f31590a;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f31592c)) {
                this.f31546b = feedbackOptions.f31592c;
            }
            ApplicationErrorReport applicationErrorReport = feedbackOptions.f31593d;
            if (applicationErrorReport != null) {
                crashInfo = applicationErrorReport.crashInfo;
            } else {
                crashInfo = null;
            }
            if (crashInfo != null) {
                this.f31522M = crashInfo.throwMethodName;
                this.f31520K = crashInfo.throwLineNumber;
                this.f31521L = crashInfo.throwClassName;
                this.f31523N = crashInfo.stackTrace;
                this.f31518I = crashInfo.exceptionClassName;
                this.f31524O = crashInfo.exceptionMessage;
                this.f31519J = crashInfo.throwFileName;
            }
            ThemeSettings themeSettings = feedbackOptions.f31599j;
            if (themeSettings != null) {
                this.f31534Y = themeSettings;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f31594e)) {
                this.f31525P = feedbackOptions.f31594e;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f31596g)) {
                this.f31536a.packageName = feedbackOptions.f31596g;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f31603n)) {
                this.f31543ag = feedbackOptions.f31603n;
            }
            Bitmap bitmap = feedbackOptions.f31602m;
            if (bitmap != null) {
                this.f31542af = bitmap;
            }
            if (file != null) {
                BitmapTeleporter bitmapTeleporter = feedbackOptions.f31595f;
                if (bitmapTeleporter != null) {
                    this.f31528S = bitmapTeleporter;
                    bitmapTeleporter.mo17760a(file);
                }
                List<FileTeleporter> list = feedbackOptions.f31597h;
                if (list != null && !list.isEmpty()) {
                    for (FileTeleporter fileTeleporter : list) {
                        fileTeleporter.mo18618a(file);
                    }
                    this.f31530U = (FileTeleporter[]) list.toArray(new FileTeleporter[feedbackOptions.f31597h.size()]);
                }
            }
            LogOptions logOptions = feedbackOptions.f31600k;
            if (logOptions != null) {
                this.f31535Z = logOptions;
            }
            this.f31532W = feedbackOptions.f31598i;
            this.f31541ae = feedbackOptions.f31601l;
            this.f31514E = feedbackOptions.f31604o;
        }
    }
}
