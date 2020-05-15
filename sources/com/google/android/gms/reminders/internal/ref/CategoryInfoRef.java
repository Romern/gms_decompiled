package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.CategoryInfo;
import com.google.android.gms.reminders.model.CategoryInfoEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CategoryInfoRef extends aotf implements CategoryInfo {
    public CategoryInfoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91869a(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo17773f(aotf.m69487b(str, "category_id"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "place_types"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "display_name"), i, i2);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new CategoryInfoEntity(this);
    }

    /* renamed from: c */
    public final String mo58616c() {
        return mo25151d(mo46858k("category_id"));
    }

    /* renamed from: d */
    public final List mo58617d() {
        ArrayList arrayList = new ArrayList();
        String d = mo25151d(mo46858k("place_types"));
        if (!TextUtils.isEmpty(d)) {
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
            simpleStringSplitter.setString(d);
            Iterator<String> it = simpleStringSplitter.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CategoryInfo)) {
            return false;
        }
        if (this != obj) {
            return CategoryInfoEntity.m92006a(this, (CategoryInfo) obj);
        }
        return true;
    }

    /* renamed from: f */
    public final String mo58619f() {
        return mo25151d(mo46858k("display_name"));
    }

    public final int hashCode() {
        return CategoryInfoEntity.m92005a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoth.m69495a(new CategoryInfoEntity(this), parcel);
    }
}
