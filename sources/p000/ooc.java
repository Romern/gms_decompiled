package p000;

import java.util.Comparator;

/* renamed from: ooc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ooc implements Comparator {
    INSTANCE;

    /* renamed from: a */
    private static final long m29299a(long j) {
        return ((j / 1000000) * 1000000) + (((j % 100000) / 10) * 10);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return (m29299a(((Long) obj).longValue()) > m29299a(((Long) obj2).longValue()) ? 1 : (m29299a(((Long) obj).longValue()) == m29299a(((Long) obj2).longValue()) ? 0 : -1));
    }
}
