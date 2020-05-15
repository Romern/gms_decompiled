package p000;

/* renamed from: cdqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdqc implements cdqb {

    /* renamed from: a */
    public static final bdyx f181546a;

    /* renamed from: b */
    public static final bdyx f181547b;

    /* renamed from: c */
    public static final bdyx f181548c;

    /* renamed from: d */
    public static final bdyx f181549d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.credential_manager")).mo58443a();
        f181546a = bdyx.m91610a(a, "SearchIndexing__account_picker_enabled", false);
        f181547b = bdyx.m91610a(a, "SearchIndexing__adding_to_search_index_enabled", false);
        f181548c = bdyx.m91610a(a, "SearchIndexing__allow_affiliation_request_fail_enabled", false);
        f181549d = bdyx.m91610a(a, "SearchIndexing__remove_save_confirmation_dialog_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo78167a() {
        return ((Boolean) f181546a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78168b() {
        return ((Boolean) f181547b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78169c() {
        return ((Boolean) f181548c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78170d() {
        return ((Boolean) f181549d.mo58455c()).booleanValue();
    }
}
