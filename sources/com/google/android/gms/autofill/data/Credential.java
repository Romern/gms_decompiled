package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Credential implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kcr();

    /* renamed from: a */
    public final String f11608a;

    /* renamed from: b */
    public final kdj f11609b;

    /* renamed from: c */
    public final kcv f11610c;

    /* renamed from: d */
    public final bnic f11611d;

    public Credential(String str, kdj kdj, kcv kcv) {
        this(str, kdj, kcv, bnic.m109489a(kcv));
    }

    /* renamed from: a */
    public final boolean mo7926a() {
        return !this.f11608a.isEmpty();
    }

    /* renamed from: b */
    public final boolean mo7927b() {
        return !this.f11609b.f23889a.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo7928c() {
        return !mo7926a() && mo7927b();
    }

    /* renamed from: d */
    public final boolean mo7929d() {
        return mo7926a() && mo7927b();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Credential) {
            Credential credential = (Credential) obj;
            return this.f11608a.equals(credential.f11608a) && this.f11609b.equals(credential.f11609b) && this.f11610c.equals(credential.f11610c) && this.f11611d.equals(credential.f11611d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11608a, this.f11609b, this.f11610c, this.f11611d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11608a);
        parcel.writeString(this.f11609b.f23889a);
        int size = this.f11611d.size();
        kcv[] kcvArr = new kcv[size];
        this.f11611d.toArray(kcvArr);
        kcx.m17655a(this.f11610c, parcel);
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            kcx.m17655a(kcvArr[i2], parcel);
        }
    }

    public Credential(String str, kdj kdj, kcv kcv, bnic bnic) {
        if (!bnic.contains(kcv)) {
            throw new IllegalStateException();
        } else if (str.isEmpty() && kdj.f23889a.isEmpty()) {
            throw new IllegalStateException();
        } else {
            this.f11608a = str;
            this.f11609b = kdj;
            this.f11610c = kcv;
            this.f11611d = bnic;
        }
    }
}
