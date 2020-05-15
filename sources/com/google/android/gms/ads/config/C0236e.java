package com.google.android.gms.ads.config;

import android.content.Context;
import com.google.android.gms.ads.internal.config.C0371o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.ads.config.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0236e {

    /* renamed from: a */
    private final Context f7947a;

    public C0236e(Context context) {
        this.f7947a = context;
    }

    /* renamed from: a */
    public final List mo6443a(List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        List b = C0371o.m5342b(this.f7947a);
        ArrayList arrayList = new ArrayList(b.size() + list.size());
        arrayList.addAll(b);
        arrayList.addAll(list);
        return Collections.unmodifiableList(arrayList);
    }
}
