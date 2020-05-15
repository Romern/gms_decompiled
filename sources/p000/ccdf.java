package p000;

/* renamed from: ccdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccdf implements ccde {

    /* renamed from: a */
    public static final bdyx f178780a;

    /* renamed from: b */
    public static final bdyx f178781b;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth.api.credentials"));
        f178780a = bdyx.m91610a(bdyw, "SaveConfirmationDialogStrategy__use_proactive_disabling_from_autofill", true);
        f178781b = bdyx.m91607a(bdyw, "SaveConfirmationDialogStrategy__yolo_save_confirmation_dialog_disable_timeout_millis", 3600000L);
    }

    /* renamed from: a */
    public final boolean mo75788a() {
        return ((Boolean) f178780a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo75789b() {
        return ((Long) f178781b.mo58455c()).longValue();
    }
}
