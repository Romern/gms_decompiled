package com.google.android.gms.chimera;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleSettingsItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qle();

    /* renamed from: a */
    public final int f29955a;

    /* renamed from: b */
    public final Intent f29956b;

    /* renamed from: c */
    public final int f29957c;

    /* renamed from: d */
    public String f29958d;

    /* renamed from: e */
    public int f29959e;

    /* renamed from: f */
    public boolean f29960f;

    /* renamed from: g */
    public boolean f29961g;

    /* renamed from: h */
    public boolean f29962h;

    /* renamed from: i */
    public String f29963i;

    /* renamed from: j */
    public boolean f29964j;

    /* renamed from: k */
    public boolean f29965k;

    /* renamed from: l */
    public List f29966l;

    /* renamed from: m */
    public boolean f29967m;

    /* renamed from: n */
    public String f29968n;

    /* renamed from: o */
    public int f29969o;

    /* renamed from: p */
    public int f29970p;

    /* renamed from: q */
    public int f29971q;

    public GoogleSettingsItem(int i, Intent intent, int i2, String str, int i3, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, List list, boolean z6, String str3, int i4) {
        this.f29955a = i;
        this.f29956b = intent;
        this.f29957c = i2;
        this.f29958d = str;
        this.f29959e = i3;
        this.f29960f = z;
        this.f29961g = z2;
        this.f29962h = z3;
        this.f29963i = str2;
        this.f29964j = z4;
        this.f29965k = z5;
        this.f29966l = list;
        this.f29967m = z6;
        this.f29968n = str3;
        this.f29969o = i4;
        this.f29970p = -1;
        this.f29971q = -1;
    }

    /* renamed from: a */
    public final void mo17614a(String str) {
        if (this.f29966l == null) {
            this.f29966l = new ArrayList();
        }
        this.f29966l.add(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        qle.m32339a(this, parcel, i);
    }

    public GoogleSettingsItem(Intent intent, int i, int i2, int i3) {
        this(3, intent, i, null, -1, false, false, false, null, true, false, null, true, null, i3 - 1);
        this.f29970p = i2;
    }

    public GoogleSettingsItem(Intent intent, int i, String str, int i2) {
        this(3, intent, i, str, -1, false, false, false, null, true, false, null, true, null, i2 - 1);
    }
}
