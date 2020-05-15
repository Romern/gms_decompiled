package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.C0334a;
import com.google.android.gms.ads.internal.gmsg.C0422a;
import com.google.android.gms.ads.internal.gmsg.C0423b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.webview.C0699i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C0527e();

    /* renamed from: a */
    public final AdLauncherIntentInfoParcel f8545a;

    /* renamed from: b */
    public final C0334a f8546b;

    /* renamed from: c */
    public final C0528f f8547c;

    /* renamed from: d */
    public final C0699i f8548d;

    /* renamed from: e */
    public final C0423b f8549e;

    /* renamed from: f */
    public final String f8550f;

    /* renamed from: g */
    public final boolean f8551g;

    /* renamed from: h */
    public final String f8552h;

    /* renamed from: i */
    public final C0529g f8553i;

    /* renamed from: j */
    public final int f8554j;

    /* renamed from: k */
    public final int f8555k;

    /* renamed from: l */
    public final String f8556l;

    /* renamed from: m */
    public final VersionInfoParcel f8557m;

    /* renamed from: n */
    public final String f8558n;

    /* renamed from: o */
    public final InterstitialAdParameterParcel f8559o;

    /* renamed from: p */
    public final C0422a f8560p;

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, VersionInfoParcel versionInfoParcel, String str4, InterstitialAdParameterParcel interstitialAdParameterParcel, IBinder iBinder6) {
        vzr vzr;
        vzr vzr2;
        vzr vzr3;
        vzr vzr4;
        vzr vzr5;
        IBinder iBinder7 = iBinder;
        IBinder iBinder8 = iBinder2;
        IBinder iBinder9 = iBinder3;
        IBinder iBinder10 = iBinder4;
        IBinder iBinder11 = iBinder5;
        IBinder iBinder12 = iBinder6;
        this.f8545a = adLauncherIntentInfoParcel;
        vzr vzr6 = null;
        if (iBinder7 != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr = queryLocalInterface instanceof vzr ? (vzr) queryLocalInterface : new vzp(iBinder);
        } else {
            vzr = null;
        }
        this.f8546b = (C0334a) vzs.m41641a(vzr);
        if (iBinder8 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr2 = queryLocalInterface2 instanceof vzr ? (vzr) queryLocalInterface2 : new vzp(iBinder2);
        } else {
            vzr2 = null;
        }
        this.f8547c = (C0528f) vzs.m41641a(vzr2);
        if (iBinder9 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr3 = queryLocalInterface3 instanceof vzr ? (vzr) queryLocalInterface3 : new vzp(iBinder3);
        } else {
            vzr3 = null;
        }
        this.f8548d = (C0699i) vzs.m41641a(vzr3);
        if (iBinder12 != null) {
            IInterface queryLocalInterface4 = iBinder12.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr4 = queryLocalInterface4 instanceof vzr ? (vzr) queryLocalInterface4 : new vzp(iBinder12);
        } else {
            vzr4 = null;
        }
        this.f8560p = (C0422a) vzs.m41641a(vzr4);
        if (iBinder10 != null) {
            IInterface queryLocalInterface5 = iBinder10.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            vzr5 = queryLocalInterface5 instanceof vzr ? (vzr) queryLocalInterface5 : new vzp(iBinder10);
        } else {
            vzr5 = null;
        }
        this.f8549e = (C0423b) vzs.m41641a(vzr5);
        this.f8550f = str;
        this.f8551g = z;
        this.f8552h = str2;
        if (iBinder11 != null) {
            IInterface queryLocalInterface6 = iBinder11.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface6 instanceof vzr) {
                vzr6 = (vzr) queryLocalInterface6;
            } else {
                vzr6 = new vzp(iBinder11);
            }
        }
        this.f8553i = (C0529g) vzs.m41641a(vzr6);
        this.f8554j = i;
        this.f8555k = i2;
        this.f8556l = str3;
        this.f8557m = versionInfoParcel;
        this.f8558n = str4;
        this.f8559o = interstitialAdParameterParcel;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.IBinder, vzr], assign insn: 0x000d: INVOKE  (r1v2 ? I:vzr) = (r1v1 com.google.android.gms.ads.internal.client.a) type: STATIC call: vzs.a(java.lang.Object):vzr */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.IBinder, vzr], assign insn: 0x0017: INVOKE  (r1v4 ? I:vzr) = (r1v3 com.google.android.gms.ads.internal.overlay.f) type: STATIC call: vzs.a(java.lang.Object):vzr */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.IBinder, vzr], assign insn: 0x0021: INVOKE  (r1v6 ? I:vzr) = (r1v5 com.google.android.gms.ads.internal.webview.i) type: STATIC call: vzs.a(java.lang.Object):vzr */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.os.IBinder, vzr], assign insn: 0x002b: INVOKE  (r1v8 ? I:vzr) = (r1v7 com.google.android.gms.ads.internal.gmsg.b) type: STATIC call: vzs.a(java.lang.Object):vzr */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.os.IBinder, vzr], assign insn: 0x0049: INVOKE  (r1v13 ? I:vzr) = (r1v12 com.google.android.gms.ads.internal.overlay.g) type: STATIC call: vzs.a(java.lang.Object):vzr */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.os.IBinder, vzr], assign insn: 0x007e: INVOKE  (r6v2 ? I:vzr) = (r6v1 com.google.android.gms.ads.internal.gmsg.a) type: STATIC call: vzs.a(java.lang.Object):vzr */
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
        see.m35040a(parcel, 2, this.f8545a, i, false);
        see.m35038a(parcel, 3, (IBinder) vzs.m41642a(this.f8546b));
        see.m35038a(parcel, 4, (IBinder) vzs.m41642a(this.f8547c));
        see.m35038a(parcel, 5, (IBinder) vzs.m41642a(this.f8548d));
        see.m35038a(parcel, 6, (IBinder) vzs.m41642a(this.f8549e));
        see.m35046a(parcel, 7, this.f8550f, false);
        see.m35051a(parcel, 8, this.f8551g);
        see.m35046a(parcel, 9, this.f8552h, false);
        see.m35038a(parcel, 10, (IBinder) vzs.m41642a(this.f8553i));
        see.m35063b(parcel, 11, this.f8554j);
        see.m35063b(parcel, 12, this.f8555k);
        see.m35046a(parcel, 13, this.f8556l, false);
        see.m35040a(parcel, 14, this.f8557m, i, false);
        see.m35046a(parcel, 16, this.f8558n, false);
        see.m35040a(parcel, 17, this.f8559o, i, false);
        see.m35038a(parcel, 18, (IBinder) vzs.m41642a(this.f8560p));
        see.m35062b(parcel, a);
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, VersionInfoParcel versionInfoParcel) {
        this.f8545a = adLauncherIntentInfoParcel;
        this.f8546b = null;
        this.f8547c = null;
        this.f8548d = null;
        this.f8560p = null;
        this.f8549e = null;
        this.f8550f = null;
        this.f8551g = false;
        this.f8552h = null;
        this.f8553i = null;
        this.f8554j = -1;
        this.f8555k = 4;
        this.f8556l = null;
        this.f8557m = versionInfoParcel;
        this.f8558n = null;
        this.f8559o = null;
    }
}
