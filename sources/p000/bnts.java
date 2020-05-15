package p000;

import dalvik.system.VMStack;

/* renamed from: bnts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnts extends bntc {
    /* renamed from: a */
    public bnsc mo68472a(Class cls, int i) {
        return bnsc.f132067a;
    }

    /* renamed from: a */
    public String mo68473a(Class cls) {
        StackTraceElement a;
        if (bntu.f132141a) {
            try {
                Class l = bntu.m110413l();
                if (cls.equals(l)) {
                    return VMStack.getStackClass2().getName();
                }
                String valueOf = String.valueOf(cls);
                String valueOf2 = String.valueOf(l);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
                sb.append("Unexpected stack depth, expected: ");
                sb.append(valueOf);
                sb.append(" but was ");
                sb.append(valueOf2);
                throw new IllegalStateException(sb.toString());
            } catch (Throwable th) {
            }
        }
        if (!bntu.f132142b || (a = bnux.m110472a(cls, new Throwable(), 1)) == null) {
            return null;
        }
        return a.getClassName();
    }
}
