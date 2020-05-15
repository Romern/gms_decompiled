package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CategoryInfoEntity extends AbstractSafeParcelable implements CategoryInfo {
    public static final Parcelable.Creator CREATOR = new aoth();

    /* renamed from: a */
    public final String f107114a;

    /* renamed from: b */
    public final String f107115b;

    /* renamed from: c */
    public final List f107116c;

    public CategoryInfoEntity(CategoryInfo categoryInfo) {
        this(categoryInfo.mo58616c(), categoryInfo.mo58617d(), categoryInfo.mo58619f());
    }

    /* renamed from: a */
    public static int m92005a(CategoryInfo categoryInfo) {
        return Arrays.hashCode(new Object[]{categoryInfo.mo58616c(), categoryInfo.mo58617d(), categoryInfo.mo58619f()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo58616c() {
        return this.f107114a;
    }

    /* renamed from: d */
    public final List mo58617d() {
        return this.f107116c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CategoryInfo)) {
            return false;
        }
        if (this != obj) {
            return m92006a(this, (CategoryInfo) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final String mo58619f() {
        return this.f107115b;
    }

    public final int hashCode() {
        return m92005a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoth.m69495a(this, parcel);
    }

    public CategoryInfoEntity(String str, List list, String str2) {
        ArrayList arrayList = new ArrayList();
        this.f107116c = arrayList;
        this.f107114a = str;
        this.f107115b = str2;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    /* renamed from: a */
    public static boolean m92006a(CategoryInfo categoryInfo, CategoryInfo categoryInfo2) {
        return sdg.m34949a(categoryInfo.mo58616c(), categoryInfo2.mo58616c()) && sdg.m34949a(categoryInfo.mo58617d(), categoryInfo2.mo58617d()) && sdg.m34949a(categoryInfo.mo58619f(), categoryInfo2.mo58619f());
    }
}
