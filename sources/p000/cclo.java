package p000;

/* renamed from: cclo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cclo implements cclm {

    /* renamed from: a */
    public static final bdyx f179362a;

    /* renamed from: b */
    public static final bdyx f179363b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.backup"));
        try {
            f179362a = bdyx.m91608a(bdyw, "EagerBackupV24__backup_now_allowed_calling_packages", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[]{10, 22, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 10, 41, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 115, 117, 98, 115, 99, 114, 105, 112, 116, 105, 111, 110, 115, 46, 114, 101, 100}), ccln.f179361a);
            f179363b = bdyx.m91610a(bdyw, "EagerBackupV24__backup_now_enable_whitelisted_1p", true);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"EagerBackupV24__backup_now_allowed_calling_packages\"");
        }
    }

    /* renamed from: a */
    public final bydj mo76295a() {
        return (bydj) f179362a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo76296b() {
        return ((Boolean) f179363b.mo58455c()).booleanValue();
    }
}
