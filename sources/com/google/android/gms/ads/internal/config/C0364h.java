package com.google.android.gms.ads.internal.config;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.flag.C0388a;
import com.google.android.gms.ads.internal.flag.C0398k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.config.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0364h {

    /* renamed from: a */
    public final Collection f8171a = new ArrayList();

    /* renamed from: b */
    public final Collection f8172b = new ArrayList();

    /* renamed from: c */
    public final Collection f8173c = new ArrayList();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.util.Collection], assign insn: 0x0005: IGET  (r1v0 ? I:java.util.Collection) = (r6v0 'this' com.google.android.gms.ads.internal.config.h A[THIS]) com.google.android.gms.ads.internal.config.h.b java.util.Collection */
    /* renamed from: a */
    public final List mo6605a() {
        ArrayList arrayList = new ArrayList();
        ? r1 = this.f8172b;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            String str = (String) ((C0362f) r1.get(i)).mo6604a();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        C0372p.m5345a(arrayList2, C0388a.m5379a("gad:dynamite_module:experiment_id", ""));
        C0372p.m5345a(arrayList2, C0398k.f8340a);
        C0372p.m5345a(arrayList2, C0398k.f8341b);
        C0372p.m5345a(arrayList2, C0398k.f8342c);
        C0372p.m5345a(arrayList2, C0398k.f8343d);
        C0372p.m5345a(arrayList2, C0398k.f8344e);
        C0372p.m5345a(arrayList2, C0398k.f8350k);
        C0372p.m5345a(arrayList2, C0398k.f8345f);
        C0372p.m5345a(arrayList2, C0398k.f8346g);
        C0372p.m5345a(arrayList2, C0398k.f8347h);
        C0372p.m5345a(arrayList2, C0398k.f8348i);
        C0372p.m5345a(arrayList2, C0398k.f8349j);
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
