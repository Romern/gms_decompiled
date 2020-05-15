package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bkxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxg implements bkxj {

    /* renamed from: a */
    public static final bkxg f125375a = new bkxg();

    private bkxg() {
    }

    /* renamed from: a */
    public final Object mo66215a() {
        return null;
    }

    /* renamed from: a */
    public final Object mo66219a(String str) {
        return str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo66223b() {
        return new HashMap();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo66224b(Object obj) {
        return Collections.unmodifiableList((List) obj);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo66225c() {
        return new ArrayList();
    }

    /* renamed from: a */
    public final Object mo66216a(double d) {
        long j = (long) d;
        if (d != ((double) j)) {
            return Double.valueOf(d);
        }
        if (j < -2147483648L || j > 2147483647L) {
            return Long.valueOf(j);
        }
        return Integer.valueOf((int) j);
    }

    /* renamed from: a */
    public final Object mo66217a(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66218a(Object obj) {
        return Collections.unmodifiableMap((Map) obj);
    }

    /* renamed from: a */
    public final Object mo66220a(boolean z) {
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66221a(Object obj, Object obj2) {
        ((List) obj2).add(obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66222a(String str, Object obj, Object obj2) {
        ((Map) obj2).put(str, obj);
    }
}
