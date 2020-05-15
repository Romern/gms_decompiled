package p000;

import android.content.Context;
import android.os.WorkSource;

/* renamed from: acpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acpm {

    /* renamed from: a */
    final WorkSource f60433a;

    /* renamed from: b */
    int f60434b = 0;

    public acpm(String str, Context context) {
        WorkSource a = stx.m36335a(context, str);
        this.f60433a = a == null ? new WorkSource() : a;
    }
}
