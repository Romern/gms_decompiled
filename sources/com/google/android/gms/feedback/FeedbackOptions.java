package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FeedbackOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new www();

    /* renamed from: a */
    public String f31590a;

    /* renamed from: b */
    public Bundle f31591b;

    /* renamed from: c */
    public String f31592c;

    /* renamed from: d */
    public ApplicationErrorReport f31593d;

    /* renamed from: e */
    public String f31594e;

    /* renamed from: f */
    public BitmapTeleporter f31595f;

    /* renamed from: g */
    public String f31596g;

    /* renamed from: h */
    public List f31597h;

    /* renamed from: i */
    public boolean f31598i;

    /* renamed from: j */
    public ThemeSettings f31599j;

    /* renamed from: k */
    public LogOptions f31600k;

    /* renamed from: l */
    public boolean f31601l;

    /* renamed from: m */
    public Bitmap f31602m;

    /* renamed from: n */
    public String f31603n;

    /* renamed from: o */
    public boolean f31604o;

    /* renamed from: p */
    public long f31605p;

    /* renamed from: q */
    public wvd f31606q;

    public FeedbackOptions(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null, null, false, 0);
    }

    /* renamed from: a */
    public static FeedbackOptions m23394a(List list) {
        FeedbackOptions feedbackOptions = new FeedbackOptions(null);
        feedbackOptions.f31597h = list;
        return feedbackOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        www.m42419a(this, parcel, i);
    }

    public FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, ThemeSettings themeSettings, LogOptions logOptions, boolean z2, Bitmap bitmap, String str5, boolean z3, long j) {
        this.f31606q = null;
        this.f31590a = str;
        this.f31591b = bundle;
        this.f31592c = str2;
        this.f31593d = applicationErrorReport;
        this.f31594e = str3;
        this.f31595f = bitmapTeleporter;
        this.f31596g = str4;
        this.f31597h = list;
        this.f31598i = z;
        this.f31599j = themeSettings;
        this.f31600k = logOptions;
        this.f31601l = z2;
        this.f31602m = bitmap;
        this.f31603n = str5;
        this.f31604o = z3;
        this.f31605p = j;
    }
}
