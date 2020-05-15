package p000;

/* renamed from: ceuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceuv implements ceuu {
    public static final bdyx arDndDecisionEngineEnabled;
    public static final bdyx carDndRuleActionEnabled;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        arDndDecisionEngineEnabled = bdyx.m91610a(a, "ar_dnd_decision_engine_enabled", true);
        carDndRuleActionEnabled = bdyx.m91610a(a, "car_dnd_rule_action_enabled", true);
    }

    public boolean arDndDecisionEngineEnabled() {
        return ((Boolean) arDndDecisionEngineEnabled.mo58455c()).booleanValue();
    }

    public boolean carDndRuleActionEnabled() {
        return ((Boolean) carDndRuleActionEnabled.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
