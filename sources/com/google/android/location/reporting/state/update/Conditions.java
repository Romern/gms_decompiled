package com.google.android.location.reporting.state.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Conditions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgyq();

    /* renamed from: a */
    public final boolean f150909a;

    /* renamed from: b */
    public final boolean f150910b;

    /* renamed from: c */
    public final boolean f150911c;

    /* renamed from: d */
    public final boolean f150912d;

    /* renamed from: e */
    public final boolean f150913e;

    public Conditions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f150909a = z;
        this.f150911c = z3;
        this.f150910b = z2;
        this.f150912d = z4;
        this.f150913e = z5;
    }

    /* renamed from: a */
    public static Conditions m117326a(bgvk bgvk) {
        return new Conditions(bgvk.f117676h, bgvk.f117671c, bgvk.f117672d, bgvk.f117674f, bgvk.f117675g);
    }

    /* renamed from: b */
    public final List mo70920b() {
        ArrayList arrayList = new ArrayList();
        if (!this.f150909a) {
            arrayList.add(new InactiveReason(13, "UnsupportedFormFactor"));
        }
        if (this.f150910b) {
            arrayList.add(new InactiveReason(11, "RestrictedProfile"));
        }
        if (!this.f150911c) {
            arrayList.add(new InactiveReason(3, "UnsupportedGeo"));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo70921c() {
        return mo70920b().isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Conditions) {
            Conditions conditions = (Conditions) obj;
            return this.f150909a == conditions.f150909a && this.f150910b == conditions.f150910b && this.f150911c == conditions.f150911c && this.f150912d == conditions.f150912d && this.f150913e == conditions.f150913e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f150909a), Boolean.valueOf(this.f150910b), Boolean.valueOf(this.f150911c), Boolean.valueOf(this.f150912d), Boolean.valueOf(this.f150913e)});
    }

    public final String toString() {
        boolean z = this.f150909a;
        boolean z2 = this.f150910b;
        boolean z3 = this.f150911c;
        boolean z4 = this.f150912d;
        boolean z5 = this.f150913e;
        StringBuilder sb = new StringBuilder(134);
        sb.append("Conditions{supportedFormFactor=");
        sb.append(z);
        sb.append(", restrictedProfile=");
        sb.append(z2);
        sb.append(", supportedGeo=");
        sb.append(z3);
        sb.append(", googleLocationEnabled=");
        sb.append(z4);
        sb.append(", locationEnabled=");
        sb.append(z5);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final bgvk mo70919a() {
        bxvd da = bgvk.f117667i.mo74144da();
        boolean z = this.f150909a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bgvk bgvk = (bgvk) da.f164949b;
        int i = bgvk.f117669a | 64;
        bgvk.f117669a = i;
        bgvk.f117676h = z;
        boolean z2 = this.f150911c;
        int i2 = i | 4;
        bgvk.f117669a = i2;
        bgvk.f117672d = z2;
        boolean z3 = this.f150910b;
        int i3 = i2 | 2;
        bgvk.f117669a = i3;
        bgvk.f117671c = z3;
        boolean z4 = this.f150912d;
        int i4 = i3 | 16;
        bgvk.f117669a = i4;
        bgvk.f117674f = z4;
        boolean z5 = this.f150913e;
        int i5 = i4 | 32;
        bgvk.f117669a = i5;
        bgvk.f117675g = z5;
        int i6 = i5 | 1;
        bgvk.f117669a = i6;
        bgvk.f117670b = true;
        bgvk.f117669a = i6 | 8;
        bgvk.f117673e = false;
        return (bgvk) da.mo74062i();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 2, this.f150909a);
        see.m35051a(parcel, 3, this.f150910b);
        see.m35051a(parcel, 4, this.f150911c);
        see.m35051a(parcel, 5, this.f150912d);
        see.m35051a(parcel, 6, this.f150913e);
        see.m35062b(parcel, a);
    }
}
