package p000;

import android.content.Context;
import android.os.Looper;
import java.util.Collections;
import java.util.List;

/* renamed from: rjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rjl {
    /* renamed from: a */
    public int mo16731a() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public List mo12172a(Object obj) {
        return Collections.emptyList();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rlz, rof):rjm
     arg types: [android.content.Context, android.os.Looper, sat, java.lang.Object, rjz, rka]
     candidates:
      rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rjz, rka):rjm
      rjl.a(android.content.Context, android.os.Looper, sat, java.lang.Object, rlz, rof):rjm */
    @Deprecated
    /* renamed from: a */
    public rjm mo11610a(Context context, Looper looper, sat sat, Object obj, rjz rjz, rka rka) {
        return mo6477a(context, looper, sat, obj, (rlz) rjz, (rof) rka);
    }

    /* renamed from: a */
    public rjm mo6477a(Context context, Looper looper, sat sat, Object obj, rlz rlz, rof rof) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
