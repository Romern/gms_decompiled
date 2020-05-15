package p000;

/* renamed from: ceod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceod implements ceoc {

    /* renamed from: a */
    public static final bdyx f183139a;

    /* renamed from: b */
    public static final bdyx f183140b;

    /* renamed from: c */
    public static final bdyx f183141c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.icing.mdh")).mo58443a();
        f183139a = bdyx.m91610a(a, "gms_icing_enable_mdh_suppress_exceptions_with_causal_chain_check", true);
        f183140b = bdyx.m91610a(a, "ExceptionSuppression__suppress_gcm_task_interrupted_exception", true);
        f183141c = bdyx.m91610a(a, "ExceptionSuppression__suppress_sync_status_runtime_exception", true);
    }

    /* renamed from: a */
    public final boolean mo79481a() {
        return ((Boolean) f183139a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79482b() {
        return ((Boolean) f183140b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79483c() {
        return ((Boolean) f183141c.mo58455c()).booleanValue();
    }
}
