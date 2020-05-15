package com.google.android.gms.autofill.fill;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FillField implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kqf();

    /* renamed from: a */
    public final AutofillId f11631a;

    /* renamed from: b */
    public final int f11632b;

    /* renamed from: c */
    public final bngx f11633c;

    /* renamed from: d */
    public final bnic f11634d;

    /* renamed from: e */
    public final int f11635e;

    /* renamed from: f */
    public final lbc f11636f;

    /* renamed from: g */
    public final int f11637g;

    /* renamed from: h */
    public final int f11638h;

    /* renamed from: i */
    public final String f11639i;

    /* renamed from: j */
    private final bngx f11640j;

    public FillField(AutofillId autofillId, int i, bngx bngx, bnic bnic, int i2, lbc lbc, bngx bngx2, int i3, int i4, String str) {
        this.f11631a = autofillId;
        this.f11632b = i;
        this.f11633c = bngx;
        this.f11634d = bnic;
        this.f11635e = i2;
        this.f11636f = lbc;
        this.f11640j = bngx2;
        this.f11637g = i3;
        this.f11638h = i4;
        this.f11639i = str;
    }

    /* renamed from: a */
    public static kqg m7129a() {
        return new kqg();
    }

    /* renamed from: b */
    public final bmxv mo7944b() {
        bnre i = this.f11640j.listIterator();
        int i2 = -1;
        kka kka = null;
        while (i.hasNext()) {
            kka kka2 = (kka) i.next();
            int b = kka2.mo14555b();
            if (i2 < b) {
                kka = kka2;
            }
            if (i2 < b) {
                i2 = b;
            }
        }
        return bmxv.m108567c(kka);
    }

    /* renamed from: c */
    public final kqg mo7945c() {
        kqg a = m7129a();
        a.mo14801a(this.f11631a);
        a.f24794a = this.f11632b;
        a.mo14803a((Collection) this.f11633c);
        a.mo14808b((Collection) this.f11634d);
        a.f24795b = this.f11635e;
        a.mo14805a(this.f11636f);
        a.mo14807b((Iterable) this.f11640j);
        a.f24796c = this.f11637g;
        a.f24797d = this.f11638h;
        a.f24798e = this.f11639i;
        return a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedObject(this.f11631a, i);
        parcel.writeInt(this.f11632b);
        parcel.writeStringArray((String[]) this.f11633c.toArray(new String[0]));
        parcel.writeIntArray(this.f11634d.stream().mapToInt(kqd.f24792a).toArray());
        parcel.writeInt(this.f11635e);
        parcel.writeInt(this.f11636f.mo3214a());
        bngx bngx = this.f11640j;
        parcel.writeInt(bngx.size());
        int size = bngx.size();
        for (int i2 = 0; i2 < size; i2++) {
            kka kka = (kka) bngx.get(i2);
            parcel.writeInt(kka.mo14555b());
            byte[] b = kka.mo14554a().mo68740b();
            parcel.writeInt(b.length);
            parcel.writeByteArray(b);
        }
        parcel.writeInt(this.f11637g);
        parcel.writeInt(this.f11638h);
        parcel.writeString(this.f11639i);
    }

    /* renamed from: a */
    public final boolean mo7943a(kpb kpb) {
        return this.f11634d.contains(kpb);
    }
}
