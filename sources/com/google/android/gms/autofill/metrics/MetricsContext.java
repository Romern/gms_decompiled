package com.google.android.gms.autofill.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface MetricsContext extends Parcelable {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class FillContext implements Parcelable {
        public static final Parcelable.Creator CREATOR = new kww();

        /* renamed from: a */
        public final bmxv f11647a;

        /* renamed from: b */
        public final bngx f11648b;

        /* renamed from: c */
        public final bmxv f11649c;

        /* renamed from: d */
        public final boolean f11650d;

        public FillContext(lbf lbf, List list, laz laz, boolean z) {
            this.f11647a = bmxv.m108567c(lbf);
            this.f11648b = bngx.m109368a((Collection) list);
            this.f11649c = bmxv.m108567c(laz);
            this.f11650d = z;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11647a.mo66813a() ? 1 : 0);
            if (this.f11647a.mo66813a()) {
                parcel.writeByteArray(((lbf) this.f11647a.mo66814b()).mo73642k());
            }
            parcel.writeInt(this.f11648b.size());
            bnre i2 = this.f11648b.listIterator();
            while (i2.hasNext()) {
                parcel.writeByteArray(((lba) i2.next()).mo73642k());
            }
            parcel.writeInt(this.f11649c.mo66813a() ? 1 : 0);
            if (this.f11649c.mo66813a()) {
                parcel.writeInt(((laz) this.f11649c.mo66814b()).mo3214a());
            }
            parcel.writeInt(this.f11650d ? 1 : 0);
        }
    }

    /* renamed from: a */
    int mo7953a();

    /* renamed from: a */
    int mo7954a(AutofillId autofillId);

    /* renamed from: a */
    void mo7955a(FillContext fillContext);

    /* renamed from: b */
    kzx mo7956b();

    /* renamed from: c */
    lbh mo7957c();

    /* renamed from: d */
    int mo7958d();

    /* renamed from: e */
    bngx mo7959e();
}
