package com.google.android.gms.ads.internal.config;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.flag.C0388a;
import com.google.android.gms.ads.internal.flag.C0407t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.config.p */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0372p {
    /* renamed from: a */
    static List m5344a() {
        ArrayList arrayList = new ArrayList();
        m5345a(arrayList, C0407t.f8365a);
        return arrayList;
    }

    /* renamed from: a */
    public static void m5345a(List list, C0388a aVar) {
        String str = (String) aVar.mo6621a();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
