package p000;

import com.google.android.gms.drive.query.internal.Operator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: vga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vga implements vgn {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28317a() {
        return Collections.singleton(uzm.f48731G);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28325b() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28318a(Operator operator, List list) {
        sdo.m34959a(list);
        HashSet hashSet = new HashSet();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.addAll((Set) list.get(i));
        }
        return hashSet;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28319a(Operator operator, uvy uvy, Object obj) {
        return Collections.singleton(uvy);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28320a(Object obj) {
        return (Set) obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28321a(String str) {
        return new C1225nr(Arrays.asList(uzm.f48741Q, uzm.f48744c));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28322a(uvu uvu, Object obj) {
        return Collections.singleton(uvu);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28323a(uvy uvy) {
        return Collections.singleton(uvy);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28324a(uvy uvy, Object obj) {
        return Collections.singleton(uvy);
    }
}
