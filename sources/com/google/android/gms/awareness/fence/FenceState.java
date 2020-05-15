package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class FenceState extends AbstractSafeParcelable {
    /* renamed from: a */
    public static int m7187a(boolean z) {
        return z ? 2 : 1;
    }

    /* renamed from: a */
    public abstract int mo8005a();

    /* renamed from: b */
    public abstract String mo8006b();

    /* renamed from: a */
    public static String m7188a(int i) {
        if (i == 0) {
            return "UNKNOWN";
        }
        if (i == 1) {
            return "FALSE";
        }
        if (i == 2) {
            return "TRUE";
        }
        StringBuilder sb = new StringBuilder(27);
        sb.append("unknown state = ");
        sb.append(i);
        return sb.toString();
    }
}
