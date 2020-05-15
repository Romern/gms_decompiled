package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: qsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qsz extends LinkedHashMap {
    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return ((long) size()) > 32;
    }
}
