package p000;

/* renamed from: cdwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdwt implements cdws {

    /* renamed from: a */
    public static final bdyx f181852a;

    /* renamed from: b */
    public static final bdyx f181853b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.fido"));
        f181852a = bdyx.m91607a(bdyw, "NfcConnectionParameters__nfc_flags", 1L);
        f181853b = bdyx.m91607a(bdyw, "NfcConnectionParameters__success_tag_read_vibrate_duration_millis", 250L);
    }

    /* renamed from: a */
    public final long mo78403a() {
        return ((Long) f181852a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo78404b() {
        return ((Long) f181853b.mo58455c()).longValue();
    }
}
