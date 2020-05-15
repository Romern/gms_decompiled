package p000;

import android.os.Build;

/* renamed from: aykr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aykr {

    /* renamed from: a */
    public static final bdyx f97872a;

    /* renamed from: b */
    private static final bdyw f97873b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.instantapps")).mo58445a("gms:wh:").mo58451b("Legacy__");
        f97873b = b;
        int i = Build.VERSION.SDK_INT;
        f97872a = bdyx.m91610a(b, "enable_westinghouse_support", true);
    }

    @Deprecated
    /* renamed from: a */
    public static synchronized boolean m84203a() {
        boolean booleanValue;
        synchronized (aykr.class) {
            booleanValue = ((Boolean) f97872a.mo58455c()).booleanValue();
        }
        return booleanValue;
    }
}
