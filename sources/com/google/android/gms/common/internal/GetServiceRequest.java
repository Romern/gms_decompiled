package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sbh();

    /* renamed from: a */
    public final int f30227a;

    /* renamed from: b */
    public final int f30228b;

    /* renamed from: c */
    public int f30229c;

    /* renamed from: d */
    public String f30230d;

    /* renamed from: e */
    public IBinder f30231e;

    /* renamed from: f */
    public Scope[] f30232f;

    /* renamed from: g */
    public Bundle f30233g;

    /* renamed from: h */
    public Account f30234h;

    /* renamed from: i */
    public Feature[] f30235i;

    /* renamed from: j */
    public Feature[] f30236j;

    /* renamed from: k */
    public boolean f30237k;

    /* renamed from: l */
    public int f30238l;

    public GetServiceRequest(int i) {
        this.f30227a = 4;
        this.f30229c = rfj.f42871c;
        this.f30228b = i;
        this.f30237k = true;
    }

    /* renamed from: a */
    private static final Account m22607a(IBinder iBinder) {
        scb scb;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof scb) {
            scb = (scb) queryLocalInterface;
        } else {
            scb = new sbz(iBinder);
        }
        return rzw.m34723a(scb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        sbh.m34831a(this, parcel, i);
    }

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4) {
        this.f30227a = i;
        this.f30228b = i2;
        this.f30229c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f30230d = "com.google.android.gms";
        } else {
            this.f30230d = str;
        }
        if (i >= 2) {
            this.f30231e = iBinder;
            this.f30234h = account;
        } else {
            this.f30234h = m22607a(iBinder);
        }
        this.f30232f = scopeArr;
        this.f30233g = bundle;
        this.f30235i = featureArr;
        this.f30236j = featureArr2;
        this.f30237k = z;
        this.f30238l = i4;
    }

    /* renamed from: a */
    public final Account mo17822a() {
        return m22607a(this.f30231e);
    }

    /* renamed from: a */
    public final void mo17823a(Collection collection) {
        this.f30232f = (Scope[]) collection.toArray(new Scope[collection.size()]);
    }
}
