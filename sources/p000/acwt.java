package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: acwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acwt extends LinkedHashMap {

    /* renamed from: a */
    private final int f60988a = 3;

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f60988a;
    }
}
