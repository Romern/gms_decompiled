package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bfje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfje {

    /* renamed from: a */
    final String f114152a;

    /* renamed from: b */
    final bngx f114153b;

    public bfje(String str, List list) {
        this.f114152a = str;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, bfla.f114326c);
        this.f114153b = bngx.m109368a((Collection) arrayList);
    }
}
