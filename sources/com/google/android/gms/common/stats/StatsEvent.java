package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: a */
    public abstract long mo17890a();

    /* renamed from: b */
    public abstract int mo17891b();

    /* renamed from: c */
    public abstract long mo17892c();

    /* renamed from: d */
    public abstract String mo17893d();

    public final String toString() {
        long a = mo17890a();
        int b = mo17891b();
        long c = mo17892c();
        String d = mo17893d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 53);
        sb.append(a);
        sb.append("\t");
        sb.append(b);
        sb.append("\t");
        sb.append(c);
        sb.append(d);
        return sb.toString();
    }
}
