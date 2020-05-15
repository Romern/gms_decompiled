package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bfda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfda extends LinkedHashMap {

    /* renamed from: a */
    private final int f113458a;

    public bfda(int i) {
        super(i, 0.75f, true);
        this.f113458a = i;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f113458a;
    }
}
