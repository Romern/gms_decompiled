package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProviderUserInfoList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brqv();

    /* renamed from: a */
    public List f152543a;

    public ProviderUserInfoList() {
        this.f152543a = new ArrayList();
    }

    /* renamed from: a */
    public static ProviderUserInfoList m118903a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            bklm bklm = (bklm) list.get(i);
            arrayList.add(new ProviderUserInfo(stm.m36300b(bklm.f124805d), stm.m36300b(bklm.f124803b), stm.m36300b(bklm.f124804c), stm.m36300b(bklm.f124802a), null, stm.m36300b(bklm.f124807f), stm.m36300b(bklm.f124806e)));
        }
        return new ProviderUserInfoList(arrayList);
    }

    public ProviderUserInfoList(List list) {
        if (list == null || list.isEmpty()) {
            this.f152543a = Collections.emptyList();
        } else {
            this.f152543a = Collections.unmodifiableList(list);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f152543a, false);
        see.m35062b(parcel, a);
    }
}
