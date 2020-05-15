package p000;

/* renamed from: cddw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cddw implements cddt {

    /* renamed from: a */
    public static final bdyx f180549a;

    /* renamed from: b */
    public static final bdyx f180550b;

    /* renamed from: c */
    public static final bdyx f180551c;

    /* renamed from: d */
    public static final bdyx f180552d;

    /* renamed from: e */
    public static final bdyx f180553e;

    /* JADX WARN: Type inference failed for: r3v1, types: [byte[]], assign insn: 0x000b: NEW_ARRAY  (r3v1 ? I:byte[]) = (715 int) type: byte[] */
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
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        bdyw bdyw = new bdyw("direct_boot:com.google.android.gms.playlog.uploader");
        try {
            f180549a = bdyx.m91608a(bdyw, "ClearcutLogOperation__caller_restrictions", (cafp) GeneratedMessageLite.m124014a(cafp.f172936d, (byte[]) new byte[]{8, 1, 18, 12, 10, 8, 65, 68, 83, 72, 73, 69, 76, 68, 16, 106, 18, 18, 10, 14, 65, 78, 68, 82, 79, 73, 68, 95, 67, 65, 77, 69, 82, 65, 16, 26, 18, 20, 10, 15, 65, 78, 68, 82, 79, 73, 68, 95, 87, 69, 66, 86, 73, 69, 87, 16, -88, 4, 18, 15, 10, 10, 65, 82, 67, 79, 82, 69, 95, 83, 68, 75, 16, -118, 8, 18, 8, 10, 4, 67, 65, 83, 84, 16, 67, 18, 17, 10, 12, 66, 73, 83, 75, 73, 95, 67, 76, 73, 69, 78, 84, 16, -33, 6, 18, 20, 10, 15, 67, 65, 66, 82, 73, 79, 95, 67, 79, 78, 83, 85, 77, 69, 82, 16, -80, 8, 18, 18, 10, 13, 67, 65, 82, 82, 73, 69, 82, 95, 83, 69, 84, 85, 80, 16, -48, 5, 18, 12, 10, 7, 67, 79, 78, 67, 79, 82, 68, 16, -3, 3, 18, 25, 10, 20, 67, 79, 78, 78, 69, 67, 84, 73, 86, 73, 84, 89, 95, 77, 79, 78, 73, 84, 79, 82, 16, -116, 6, 18, 28, 10, 23, 70, 73, 82, 69, 66, 65, 83, 69, 95, 73, 78, 65, 80, 80, 77, 69, 83, 83, 65, 71, 73, 78, 71, 16, -37, 5, 18, 20, 10, 15, 70, 73, 82, 69, 66, 65, 83, 69, 95, 77, 76, 95, 83, 68, 75, 16, -53, 5, 18, 13, 10, 8, 70, 73, 82, 69, 80, 69, 82, 70, 16, -50, 3, 18, 22, 10, 17, 70, 73, 82, 69, 80, 69, 82, 70, 95, 65, 85, 84, 79, 80, 85, 83, 72, 16, -51, 3, 18, 27, 10, 22, 70, 73, 82, 69, 80, 69, 82, 70, 95, 73, 78, 84, 69, 82, 78, 65, 76, 95, 72, 73, 71, 72, 16, -92, 5, 18, 26, 10, 21, 70, 73, 82, 69, 80, 69, 82, 70, 95, 73, 78, 84, 69, 82, 78, 65, 76, 95, 76, 79, 87, 16, -93, 5, 18, 37, 10, 32, 71, 79, 79, 71, 76, 69, 95, 80, 68, 70, 95, 86, 73, 69, 87, 69, 82, 95, 65, 78, 68, 82, 79, 73, 68, 95, 80, 82, 73, 77, 69, 83, 16, -101, 9, 18, 9, 10, 4, 71, 76, 65, 83, 16, -92, 9, 18, 12, 10, 7, 71, 77, 65, 95, 83, 68, 75, 16, -66, 3, 18, 21, 10, 16, 71, 77, 65, 95, 83, 68, 75, 95, 67, 79, 85, 78, 84, 69, 82, 83, 16, -65, 3, 18, 16, 10, 12, 71, 77, 77, 95, 67, 79, 85, 78, 84, 69, 82, 83, 16, 77, 18, 11, 10, 7, 71, 77, 77, 95, 85, 69, 51, 16, 110, 18, 6, 10, 2, 76, 69, 16, 17, 18, 12, 10, 8, 77, 65, 80, 83, 95, 65, 80, 73, 16, 79, 18, 22, 10, 17, 77, 65, 80, 83, 95, 65, 80, 73, 95, 67, 79, 85, 78, 84, 69, 82, 83, 16, -113, 1, 18, 18, 10, 13, 77, 79, 68, 69, 77, 95, 77, 69, 84, 82, 73, 67, 83, 16, -38, 6, 18, 10, 10, 5, 79, 77, 65, 68, 77, 16, -27, 6, 18, 21, 10, 16, 79, 82, 78, 65, 77, 69, 78, 84, 95, 65, 78, 68, 82, 79, 73, 68, 16, -14, 7, 18, 12, 10, 7, 79, 86, 69, 82, 76, 65, 89, 16, -48, 8, 18, 27, 10, 22, 79, 86, 69, 82, 76, 65, 89, 95, 65, 78, 68, 82, 79, 73, 68, 95, 80, 82, 73, 77, 69, 83, 16, -20, 8, 18, 15, 10, 10, 80, 68, 70, 95, 86, 73, 69, 87, 69, 82, 16, -66, 1, 18, 18, 10, 13, 80, 73, 88, 69, 76, 95, 72, 87, 95, 73, 78, 70, 79, 16, -46, 4, 18, 18, 10, 13, 80, 79, 87, 69, 82, 95, 65, 78, 79, 77, 65, 76, 89, 16, -66, 6, 18, 26, 10, 21, 84, 69, 84, 72, 69, 82, 73, 78, 71, 95, 69, 78, 84, 73, 84, 76, 69, 77, 69, 78, 84, 16, -57, 5, 18, 10, 10, 6, 86, 73, 83, 73, 79, 78, 16, 100, 18, 19, 10, 14, 87, 70, 67, 95, 65, 67, 84, 73, 86, 65, 84, 73, 79, 78, 16, -51, 5}), cddu.f180547a);
            try {
                f180550b = bdyx.m91608a(bdyw, "ClearcutLogOperation__experiment_logging_disabled", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[0]), cddv.f180548a);
                f180551c = bdyx.m91610a(bdyw, "ClearcutLogOperation__log_3p_log_senders", false);
                bdyx.m91610a(bdyw, "ClearcutLogOperation__restrict_romanesco_0p", true);
                f180552d = bdyx.m91610a(bdyw, "ClearcutLogOperation__switch_to_api_call", false);
                bdyx.m91610a(bdyw, "ClearcutLogOperation__throw_from_qos_check", true);
                f180553e = bdyx.m91610a(bdyw, "ClearcutLogOperation__use_providence_client_type", true);
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"ClearcutLogOperation__experiment_logging_disabled\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"ClearcutLogOperation__caller_restrictions\"");
        }
    }

    /* renamed from: a */
    public final cafp mo77302a() {
        return (cafp) f180549a.mo58455c();
    }

    /* renamed from: b */
    public final bydj mo77303b() {
        return (bydj) f180550b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo77304c() {
        return ((Boolean) f180551c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo77305d() {
        return ((Boolean) f180552d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo77306e() {
        return ((Boolean) f180553e.mo58455c()).booleanValue();
    }
}
