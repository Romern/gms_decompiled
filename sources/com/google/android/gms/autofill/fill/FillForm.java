package com.google.android.gms.autofill.fill;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FillForm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kqi();

    /* renamed from: a */
    public final bngx f11641a;

    /* renamed from: b */
    public final bmxv f11642b;

    /* renamed from: c */
    public final kcv f11643c;

    /* renamed from: d */
    public final bmxv f11644d;

    /* renamed from: e */
    public final int f11645e;

    /* renamed from: f */
    private final bnig f11646f;

    public FillForm(int i, bngx bngx, bmxv bmxv, kcv kcv, bmxv bmxv2) {
        this.f11641a = bngx;
        this.f11642b = bmxv;
        this.f11643c = kcv;
        this.f11644d = bmxv2;
        this.f11645e = i;
        bnid a = bnig.m109513a();
        bnre i2 = bngx.listIterator();
        while (i2.hasNext()) {
            FillField fillField = (FillField) i2.next();
            bnrd a2 = fillField.f11634d.iterator();
            while (a2.hasNext()) {
                a.mo67758a((kpb) a2.next(), fillField);
            }
        }
        this.f11646f = a.mo67757a();
    }

    /* renamed from: a */
    public final bngx mo7948a(kpb... kpbArr) {
        if (kpbArr.length == 0) {
            return bngx.m109376e();
        }
        Set e = this.f11646f.mo67692g(kpbArr[0]);
        for (int i = 1; i < kpbArr.length; i++) {
            e = bnpf.m110055b(e, this.f11646f.mo67692g(kpbArr[i]));
        }
        return bngx.m109368a((Collection) e);
    }

    /* renamed from: b */
    public final bngx mo7950b(kpb kpb) {
        return this.f11646f.mo67692g(kpb).mo67639g();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11645e);
        parcel.writeTypedList(this.f11641a);
        parcel.writeInt(this.f11642b.mo66813a() ? 1 : 0);
        if (this.f11642b.mo66813a()) {
            parcel.writeTypedObject((FillField) this.f11642b.mo66814b(), i);
        }
        kcx.m17655a(this.f11643c, parcel);
        parcel.writeInt(this.f11644d.mo66813a() ? 1 : 0);
        if (this.f11644d.mo66813a()) {
            kcx.m17655a((kcv) this.f11644d.mo66814b(), parcel);
        }
    }

    /* renamed from: a */
    public final boolean mo7949a(kpb kpb) {
        return this.f11646f.mo67271d(kpb);
    }

    public FillForm(bngx bngx, kcv kcv) {
        this(0, bngx, bmvz.f131120a, kcv, bmvz.f131120a);
    }
}
