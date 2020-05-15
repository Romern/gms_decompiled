package com.google.android.gms.ads.internal.flag;

import com.google.android.gms.ads.internal.config.C0368l;

/* renamed from: com.google.android.gms.ads.internal.flag.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0388a {

    /* renamed from: a */
    private final String f8320a;

    /* renamed from: b */
    private final Object f8321b;

    /* renamed from: c */
    private final int f8322c;

    protected C0388a(String str, Object obj, int i) {
        this.f8320a = str;
        this.f8321b = obj;
        this.f8322c = i;
    }

    /* renamed from: a */
    public static C0388a m5377a(String str, double d) {
        return new C0388a(str, Double.valueOf(d), 3);
    }

    /* renamed from: a */
    public static C0388a m5378a(String str, long j) {
        return new C0388a(str, Long.valueOf(j), 2);
    }

    /* renamed from: a */
    public static C0388a m5379a(String str, String str2) {
        return new C0388a(str, str2, 4);
    }

    /* renamed from: a */
    public static C0388a m5380a(String str, boolean z) {
        return new C0388a(str, Boolean.valueOf(z), 1);
    }

    /* renamed from: a */
    public static void m5381a(String str) {
        new C0388a(str, true, 1);
    }

    /* renamed from: a */
    public final Object mo6621a() {
        C0368l lVar = (C0368l) C0411x.f8371a.get();
        if (lVar != null) {
            int i = this.f8322c - 1;
            if (i == 0) {
                return Boolean.valueOf(lVar.f8177a.f8182e.getBoolean(this.f8320a, ((Boolean) this.f8321b).booleanValue()));
            } else if (i == 1) {
                String str = this.f8320a;
                long longValue = ((Long) this.f8321b).longValue();
                try {
                    return Long.valueOf(lVar.f8177a.f8182e.getLong(str, longValue));
                } catch (ClassCastException e) {
                    return Long.valueOf((long) lVar.f8177a.f8182e.getInt(str, (int) longValue));
                }
            } else if (i != 2) {
                return lVar.f8177a.f8182e.getString(this.f8320a, (String) this.f8321b);
            } else {
                return Double.valueOf((double) lVar.f8177a.f8182e.getFloat(this.f8320a, (float) ((Double) this.f8321b).doubleValue()));
            }
        } else {
            throw new IllegalStateException("Flag is not initialized.");
        }
    }
}
