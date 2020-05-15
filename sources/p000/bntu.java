package p000;

import android.os.Build;
import android.util.Log;
import dalvik.system.VMStack;

/* renamed from: bntu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bntu extends bntd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final boolean f132141a = bntt.m110410a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final boolean f132142b;

    /* renamed from: c */
    private static final bntc f132143c = new bnts();

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        f132142b = z;
        Log.class.getName();
    }

    /* renamed from: j */
    static boolean m110411j() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return bntt.class.getName().equals(m110412k());
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: k */
    static String m110412k() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: l */
    static Class m110413l() {
        return VMStack.getStackClass2();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public bnsx mo68474b(String str) {
        if (bnty.f132147a.get() != null) {
            return ((bntp) bnty.f132147a.get()).mo25075a(str);
        }
        bnty bnty = new bnty(str.replace('$', '.'));
        bntw.f132144a.offer(bnty);
        if (bnty.f132147a.get() == null) {
            return bnty;
        }
        bnty.m110420b();
        return bnty;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public bntc mo68475b() {
        return f132143c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo68479h() {
        return "platform: Android";
    }
}
