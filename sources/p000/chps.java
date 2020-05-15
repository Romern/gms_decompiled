package p000;

/* renamed from: chps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chps implements chpq {

    /* renamed from: a */
    public static final bdyx f188952a;

    /* renamed from: b */
    public static final bdyx f188953b;

    /* renamed from: c */
    public static final bdyx f188954c;

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
        bdyw a = new bdyw("com.google.android.westworld").mo58445a("gms:westworld:");
        f188952a = bdyx.m91609a(a, "default_pull_packages", "");
        try {
            f188953b = bdyx.m91608a(a, "pull_atom_packages_list", (bku) GeneratedMessageLite.m124014a(bku.f5035b, new byte[0]), chpr.f188951a);
            f188954c = bdyx.m91610a(a, "is_phenotype_flags", false);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"pull_atom_packages_list\"");
        }
    }

    /* renamed from: a */
    public final String mo85492a() {
        return (String) f188952a.mo58455c();
    }

    /* renamed from: b */
    public final bku mo85493b() {
        return (bku) f188953b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo85494c() {
        return ((Boolean) f188954c.mo58455c()).booleanValue();
    }
}
