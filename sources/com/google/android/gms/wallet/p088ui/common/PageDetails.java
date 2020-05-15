package com.google.android.gms.wallet.p088ui.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.wallet.ui.common.PageDetails */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PageDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = new awze();

    /* renamed from: a */
    public boolean f110452a;

    /* renamed from: b */
    public byte[] f110453b;

    /* renamed from: c */
    public bwgz f110454c;

    /* renamed from: d */
    public List f110455d;

    /* renamed from: e */
    public bmag f110456e;

    /* renamed from: f */
    public List f110457f;

    /* renamed from: g */
    public bwiu f110458g;

    /* renamed from: h */
    public long f110459h;

    /* renamed from: i */
    public Object f110460i;

    /* renamed from: j */
    public Object f110461j;

    /* renamed from: k */
    public bwit f110462k;

    /* renamed from: l */
    public bmkw f110463l;

    /* renamed from: m */
    public Parcelable f110464m;

    /* renamed from: n */
    public bmaq f110465n;

    /* renamed from: o */
    public Parcelable f110466o;

    /* renamed from: p */
    public bmar f110467p;

    /* renamed from: q */
    public bmav f110468q;

    /* renamed from: r */
    public int f110469r;

    public PageDetails() {
        this.f110454c = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        this.f110455d = new ArrayList();
        this.f110469r = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bxxk mo59778a() {
        throw new UnsupportedOperationException("Must be implemented by subclasses to properly parse their Page protos.");
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, bxxc], assign insn: 0x0035: IGET  (r0v11 ? I:java.lang.Object) = (r2v0 'this' com.google.android.gms.wallet.ui.common.PageDetails A[THIS]) com.google.android.gms.wallet.ui.common.PageDetails.j java.lang.Object */
    public final void writeToParcel(Parcel parcel, int i) {
        bjvp.m104740a(this.f110457f, parcel);
        parcel.writeLong(this.f110459h);
        parcel.writeByteArray(this.f110453b);
        parcel.writeParcelable(this.f110464m, i);
        parcel.writeInt(this.f110454c.f159484u);
        int i2 = this.f110469r;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            bjvp.m104738a(this.f110456e, parcel);
            bjvp.m104738a(this.f110458g, parcel);
            bjvp.m104738a((bxxc) this.f110460i, parcel);
            bjvp.m104738a((bxxc) this.f110461j, parcel);
            bjvp.m104738a(this.f110462k, parcel);
            bjvp.m104738a(this.f110463l, parcel);
            parcel.writeList(this.f110455d);
            bjvp.m104738a(this.f110465n, parcel);
            parcel.writeParcelable(this.f110466o, i);
            bjvp.m104738a(this.f110467p, parcel);
            parcel.writeInt(this.f110452a ? 1 : 0);
            bjvp.m104738a(this.f110468q, parcel);
            return;
        }
        throw null;
    }

    public PageDetails(Parcel parcel) {
        this.f110454c = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        this.f110455d = new ArrayList();
        boolean z = true;
        this.f110469r = 1;
        ClassLoader classLoader = PageDetails.class.getClassLoader();
        this.f110457f = bjvp.m104741b(parcel, mo59778a());
        this.f110459h = parcel.readLong();
        this.f110453b = parcel.createByteArray();
        this.f110464m = parcel.readParcelable(classLoader);
        bwgz a = bwgz.m121952a(parcel.readInt());
        this.f110454c = a;
        if (a == null) {
            this.f110454c = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        }
        this.f110469r = bmqm.m108288a(parcel.readInt());
        this.f110456e = (bmag) bjvp.m104731a(parcel, (bxxk) bmag.f128442c.mo74142c(7));
        this.f110458g = (bwiu) bjvp.m104731a(parcel, (bxxk) bwiu.f159689b.mo74142c(7));
        this.f110460i = bjvp.m104731a(parcel, mo59778a());
        this.f110461j = bjvp.m104731a(parcel, mo59778a());
        this.f110462k = (bwit) bjvp.m104731a(parcel, (bxxk) bwit.f159683d.mo74142c(7));
        this.f110463l = (bmkw) bjvp.m104731a(parcel, (bxxk) bmkw.f129898c.mo74142c(7));
        parcel.readList(this.f110455d, Integer.class.getClassLoader());
        this.f110465n = (bmaq) bjvp.m104731a(parcel, (bxxk) bmaq.f128479l.mo74142c(7));
        this.f110466o = parcel.readParcelable(classLoader);
        this.f110467p = (bmar) bjvp.m104731a(parcel, (bxxk) bmar.f128490c.mo74142c(7));
        this.f110452a = parcel.readInt() != 1 ? false : z;
        this.f110468q = (bmav) bjvp.m104731a(parcel, (bxxk) bmav.f128500h.mo74142c(7));
    }

    public PageDetails(PageDetails pageDetails) {
        this.f110454c = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        this.f110455d = new ArrayList();
        this.f110469r = 1;
        this.f110457f = pageDetails.f110457f;
        this.f110459h = pageDetails.f110459h;
        this.f110453b = pageDetails.f110453b;
        this.f110464m = pageDetails.f110464m;
        bwgz bwgz = pageDetails.f110454c;
        sdo.m34959a(bwgz);
        this.f110454c = bwgz;
        this.f110469r = pageDetails.f110469r;
        this.f110456e = pageDetails.f110456e;
        this.f110458g = pageDetails.f110458g;
        this.f110460i = pageDetails.f110460i;
        this.f110461j = pageDetails.f110461j;
        this.f110462k = pageDetails.f110462k;
        this.f110463l = pageDetails.f110463l;
        this.f110455d = pageDetails.f110455d;
        this.f110465n = pageDetails.f110465n;
        this.f110466o = pageDetails.f110466o;
        this.f110467p = pageDetails.f110467p;
        this.f110452a = pageDetails.f110452a;
        this.f110468q = pageDetails.f110468q;
    }
}
