package p000;

/* renamed from: cfeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfeh implements cfeg {

    /* renamed from: a */
    public static final bdyx f183683a;

    /* renamed from: b */
    public static final bdyx f183684b;

    /* renamed from: c */
    public static final bdyx f183685c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.matchstick")).mo58443a();
        bdyx.m91609a(a, "GroupChatRefine__group_size_four_string_id", "3143002989177595422");
        bdyx.m91609a(a, "GroupChatRefine__group_size_three_string_id", "4025174359169049179");
        bdyx.m91609a(a, "GroupChatRefine__group_size_two_string_id", "2981911795816866068");
        f183683a = bdyx.m91610a(a, "GroupChatRefine__show_group_name_at_top_and_remove_subtitle", false);
        f183684b = bdyx.m91610a(a, "GroupChatRefine__show_member_names_when_added", false);
        bdyx.m91607a(a, "GroupChatRefine__show_member_names_when_added_max_lines", 2L);
        f183685c = bdyx.m91607a(a, "GroupChatRefine__show_member_names_when_added_most_contacts_to_lookup", 20L);
        bdyx.m91607a(a, "GroupChatRefine__show_member_names_when_added_most_others_to_show", 20L);
    }

    /* renamed from: a */
    public final boolean mo80877a() {
        return ((Boolean) f183683a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo80878b() {
        return ((Boolean) f183684b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo80879c() {
        return ((Long) f183685c.mo58455c()).longValue();
    }
}
