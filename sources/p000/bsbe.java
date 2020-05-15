package p000;

/* renamed from: bsbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsbe {
    /* renamed from: a */
    public static void m115040a(Object obj) {
        try {
            obj.notify();
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("monitor on [");
            sb.append(valueOf);
            sb.append("] is held by current thread");
            m115041a((String) null, sb.toString());
        } catch (IllegalMonitorStateException e) {
        }
    }

    /* renamed from: b */
    public static void m115044b(boolean z) {
        if (z) {
            m115041a((String) null, "condition was true");
        }
    }

    /* renamed from: a */
    public static void m115041a(String str, String str2) {
        if (str != null) {
            StringBuilder sb = new StringBuilder(str.length() + 4 + String.valueOf(str2).length());
            sb.append(str);
            sb.append(" :: ");
            sb.append(str2);
            str2 = sb.toString();
        }
        throw new bsbf(str2);
    }

    /* renamed from: a */
    public static void m115042a(String str, boolean z) {
        if (!z) {
            m115041a(str, "condition was false");
        }
    }

    /* renamed from: a */
    public static void m115043a(boolean z) {
        m115042a((String) null, z);
    }
}
