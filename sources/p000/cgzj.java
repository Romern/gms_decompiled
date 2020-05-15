package p000;

/* renamed from: cgzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgzj implements cgzg {

    /* renamed from: a */
    public static final bdyx f188106a;

    /* renamed from: b */
    public static final bdyx f188107b;

    /* renamed from: c */
    public static final bdyx f188108c;

    /* renamed from: d */
    public static final bdyx f188109d;

    /* renamed from: e */
    public static final bdyx f188110e;

    /* renamed from: f */
    public static final bdyx f188111f;

    /* renamed from: g */
    public static final bdyx f188112g;

    /* renamed from: h */
    public static final bdyx f188113h;

    /* renamed from: i */
    public static final bdyx f188114i;

    /* renamed from: j */
    public static final bdyx f188115j;

    /* renamed from: k */
    public static final bdyx f188116k;

    /* renamed from: l */
    public static final bdyx f188117l;

    /* renamed from: m */
    public static final bdyx f188118m;

    /* renamed from: n */
    public static final bdyx f188119n;

    /* renamed from: o */
    public static final bdyx f188120o;

    /* renamed from: p */
    public static final bdyx f188121p;

    /* renamed from: q */
    public static final bdyx f188122q;

    /* JADX WARN: Type inference failed for: r5v3, types: [byte[]], assign insn: 0x0069: NEW_ARRAY  (r5v3 ? I:byte[]) = (1529 int) type: byte[] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyw.a(java.lang.String, boolean):bdyx
     arg types: [java.lang.String, int]
     candidates:
      bdyw.a(java.lang.String, long):bdyx
      bdyw.a(java.lang.String, java.lang.String):bdyx
      bdyw.a(java.lang.String, boolean):bdyx */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tron.metrics"));
        f188106a = bdyw.mo58452c("Tron__alarm_mixture_weight");
        f188107b = bdyw.mo58446a("Tron__blocking_read_retry_limit", 10);
        f188108c = bdyw.mo58446a("Tron__blocking_read_retry_pause_ms", 60000);
        f188109d = bdyw.mo58446a("Tron__clearcut_qos_tier", 0);
        f188110e = bdyw.mo58449a("Tron__debug_enable", false);
        f188111f = bdyw.mo58446a("Tron__eventlog_collection_empty_retry_ms", 900000);
        f188112g = bdyw.mo58449a("Tron__eventlog_collection_enable", true);
        f188113h = bdyw.mo58446a("Tron__eventlog_collection_maximum_period_ms", 21600001);
        f188114i = bdyw.mo58446a("Tron__eventlog_collection_minimum_period_ms", 300000);
        try {
            f188115j = bdyw.mo58447a("Tron__field_config", cixp.m151125a((byte[]) new byte[]{10, 7, 8, -70, 6, 16, -62, -124, 61, 10, 7, 8, -69, 6, 16, -63, -124, 61, 10, 7, 8, -71, 6, 16, -60, -124, 61, 10, 7, 8, -65, 2, 16, -55, -124, 61, 10, 7, 8, -59, 2, 16, -50, -124, 61, 10, 7, 8, -25, 6, 16, -49, -124, 61, 10, 6, 8, -64, 2, 16, -9, 5, 10, 6, 8, -120, 7, 16, -97, 6, 10, 7, 8, -119, 7, 16, -63, -124, 61, 10, 7, 8, -63, 2, 16, -56, -124, 61, 10, 7, 8, -62, 2, 16, -57, -124, 61, 10, 7, 8, -123, 7, 16, -57, -124, 61, 10, 6, 8, -122, 7, 16, -9, 5, 10, 7, 8, -103, 6, 16, -57, -124, 61, 10, 7, 8, -102, 6, 16, -55, -124, 61, 10, 7, 8, -101, 6, 16, -56, -124, 61, 10, 7, 8, -100, 6, 16, -54, -124, 61, 10, 7, 8, -99, 6, 16, -53, -124, 61, 10, 7, 8, -98, 6, 16, -51, -124, 61, 10, 7, 8, -71, 6, 16, -60, -124, 61, 10, 7, 8, -115, 7, 16, -63, -124, 61, 10, 6, 8, -113, 7, 16, -9, 5, 10, 7, 8, -110, 7, 16, -63, -124, 61, 10, 6, 8, -109, 7, 16, -9, 5, 10, 7, 8, -107, 7, 16, -63, -124, 61, 10, 7, 8, -63, 6, 16, -63, -124, 61, 10, 8, 8, -31, 6, 16, -112, -83, -30, 4, 10, 7, 8, -121, 7, 16, -47, -124, 61, 10, 7, 8, -39, 6, 16, -40, -124, 61, 10, 7, 8, -78, 7, 16, -39, -124, 61, 10, 7, 8, -36, 6, 16, -39, -124, 61, 10, 7, 8, -64, 6, 16, -63, -124, 61, 10, 7, 8, -61, 8, 16, -42, -124, 61, 10, 7, 8, -79, 7, 16, -43, -124, 61, 10, 7, 8, -60, 2, 16, -63, -124, 61, 10, 6, 8, -69, 8, 16, -9, 5, 10, 7, 8, -54, 6, 16, -51, -124, 61, 10, 7, 8, -22, 7, 16, -63, -124, 61, 10, 7, 8, -23, 7, 16, -38, -124, 61, 10, 7, 8, -65, 8, 16, -51, -124, 61, 10, 7, 8, -25, 6, 16, -49, -124, 61, 10, 7, 8, -66, 8, 16, -63, -124, 61, 10, 7, 8, -42, 6, 16, -49, -124, 61, 10, 7, 8, -30, 7, 16, -57, -124, 61, 10, 7, 8, -63, 8, 16, -63, -124, 61, 10, 7, 8, -29, 7, 16, -60, -124, 61, 10, 7, 8, -35, 8, 16, -57, -124, 61, 10, 7, 8, -34, 8, 16, -56, -124, 61, 10, 7, 8, -32, 8, 16, -51, -124, 61, 10, 7, 8, -31, 8, 16, -49, -124, 61, 10, 7, 8, -30, 8, 16, -63, -124, 61, 10, 7, 8, -29, 8, 16, -62, -124, 61, 10, 6, 8, -109, 7, 16, -9, 5, 10, 7, 8, -110, 7, 16, -63, -124, 61, 10, 7, 8, -53, 8, 16, -41, -124, 61, 10, 8, 8, -81, 7, 16, -112, -83, -30, 4, 10, 7, 8, -61, 8, 16, -42, -124, 61, 10, 7, 8, -91, 7, 16, -54, -124, 61, 10, 7, 8, -92, 7, 16, -63, -124, 61, 10, 7, 8, -57, 8, 16, -51, -124, 61, 10, 7, 8, -58, 8, 16, -63, -124, 61, 10, 7, 8, -27, 8, 16, -63, -124, 61, 10, 6, 8, -22, 8, 16, -9, 5, 10, 6, 8, -46, 9, 16, -9, 5, 10, 7, 8, -38, 6, 16, -38, -124, 61, 10, 7, 8, -33, 8, 16, -36, -124, 61, 10, 7, 8, -26, 9, 16, -35, -124, 61, 10, 7, 8, -25, 9, 16, -34, -124, 61, 10, 7, 8, -18, 9, 16, -24, -124, 61, 10, 7, 8, -30, 9, 16, -33, -124, 61, 10, 7, 8, -29, 9, 16, -32, -124, 61, 10, 7, 8, -28, 9, 16, -31, -124, 61, 10, 7, 8, -27, 9, 16, -30, -124, 61, 10, 7, 8, -24, 9, 16, -29, -124, 61, 10, 7, 8, -96, 7, 16, -63, -124, 61, 10, 7, 8, -97, 7, 16, -51, -124, 61, 10, 7, 8, -12, 8, 16, -51, -124, 61, 10, 7, 8, -104, 10, 16, -57, -124, 61, 10, 7, 8, -105, 10, 16, -51, -124, 61, 10, 7, 8, -103, 10, 16, -33, -124, 61, 10, 7, 8, -102, 10, 16, -32, -124, 61, 10, 7, 8, -101, 10, 16, -31, -124, 61, 10, 7, 8, -100, 10, 16, -30, -124, 61, 10, 7, 8, -94, 10, 16, -57, -124, 61, 10, 7, 8, -93, 10, 16, -28, -124, 61, 10, 7, 8, -92, 10, 16, -27, -124, 61, 10, 7, 8, -91, 10, 16, -26, -124, 61, 10, 7, 8, -90, 10, 16, -35, -124, 61, 10, 7, 8, -89, 10, 16, -36, -124, 61, 10, 7, 8, -79, 10, 16, -51, -124, 61, 10, 7, 8, -82, 10, 16, -63, -124, 61, 10, 7, 8, -97, 10, 16, -21, -124, 61, 10, 7, 8, -77, 7, 16, -22, -124, 61, 10, 6, 8, -9, 9, 16, -9, 5, 10, 7, 8, -7, 8, 16, -57, -124, 61, 10, 6, 8, -6, 9, 16, -9, 5, 10, 7, 8, -75, 7, 16, -53, -124, 61, 10, 6, 8, -116, 7, 16, -97, 6, 10, 7, 8, -49, 10, 16, -57, -124, 61, 10, 6, 8, -42, 10, 16, -9, 5, 10, 7, 8, -24, 10, 16, -23, -124, 61, 10, 7, 8, -87, 10, 16, -54, -124, 61, 10, 7, 8, -88, 10, 16, -51, -124, 61, 10, 7, 8, -13, 10, 16, -23, -124, 61, 10, 6, 8, -16, 10, 16, -9, 5, 10, 7, 8, -14, 10, 16, -49, -124, 61, 10, 7, 8, -15, 10, 16, -63, -124, 61, 10, 6, 8, -115, 11, 16, -9, 5, 10, 7, 8, -118, 11, 16, -33, -124, 61, 10, 7, 8, -117, 11, 16, -32, -124, 61, 10, 7, 8, -116, 11, 16, -57, -124, 61, 10, 7, 8, -122, 11, 16, -51, -124, 61, 10, 7, 8, -81, 11, 16, -63, -124, 61, 10, 7, 8, -84, 11, 16, -38, -124, 61, 10, 7, 8, -83, 11, 16, -33, -124, 61, 10, 7, 8, -82, 11, 16, -31, -124, 61, 10, 7, 8, -111, 11, 16, -54, -124, 61, 10, 6, 8, -108, 11, 16, -9, 5, 10, 7, 8, -86, 11, 16, -54, -124, 61, 10, 7, 8, -107, 11, 16, -51, -124, 61, 10, 6, 8, -105, 11, 16, -9, 5, 10, 7, 8, -104, 11, 16, -54, -124, 61, 10, 6, 8, -102, 11, 16, -9, 5, 10, 7, 8, -101, 11, 16, -57, -124, 61, 10, 7, 8, -100, 11, 16, -56, -124, 61, 10, 7, 8, -87, 11, 16, -55, -124, 61, 10, 7, 8, -99, 11, 16, -54, -124, 61, 10, 7, 8, -88, 11, 16, -51, -124, 61, 10, 7, 8, -97, 11, 16, -53, -124, 61, 10, 6, 8, -93, 11, 16, -9, 5, 10, 7, 8, -92, 11, 16, -23, -124, 61, 10, 6, 8, -90, 11, 16, -9, 5, 10, 7, 8, -89, 11, 16, -54, -124, 61, 10, 6, 8, -21, 11, 16, -90, 6, 10, 6, 8, -22, 11, 16, -9, 5, 10, 7, 8, -111, 12, 16, -57, -124, 61, 10, 7, 8, -116, 12, 16, -55, -124, 61, 10, 7, 8, -20, 11, 16, -54, -124, 61, 10, 7, 8, -114, 12, 16, -53, -124, 61, 10, 7, 8, -19, 11, 16, -51, -124, 61, 10, 7, 8, -16, 11, 16, -50, -124, 61, 10, 7, 8, -115, 12, 16, -49, -124, 61, 10, 7, 8, -18, 11, 16, -62, -124, 61, 10, 7, 8, -17, 11, 16, -63, -124, 61, 10, 6, 8, -14, 11, 16, -97, 6, 10, 7, 8, -127, 12, 16, -46, -124, 61, 10, 7, 8, -126, 12, 16, -45, -124, 61, 10, 7, 8, -125, 12, 16, -44, -124, 61, 10, 7, 8, -10, 11, 16, -41, -124, 61, 10, 7, 8, -8, 11, 16, -40, -124, 61, 10, 7, 8, -7, 11, 16, -39, -124, 61, 10, 7, 8, -15, 11, 16, -38, -124, 61, 10, 7, 8, -119, 12, 16, -35, -124, 61, 10, 7, 8, -11, 11, 16, -34, -124, 61, 10, 7, 8, -13, 11, 16, -33, -124, 61, 10, 7, 8, -12, 11, 16, -32, -124, 61, 10, 7, 8, -9, 11, 16, -31, -124, 61, 10, 7, 8, -6, 11, 16, -30, -124, 61, 10, 7, 8, -5, 11, 16, -28, -124, 61, 10, 7, 8, -4, 11, 16, -27, -124, 61, 10, 7, 8, -3, 11, 16, -26, -124, 61, 10, 7, 8, -123, 12, 16, -25, -124, 61, 10, 7, 8, -121, 12, 16, -24, -124, 61, 10, 7, 8, -2, 11, 16, -23, -124, 61, 10, 7, 8, -1, 11, 16, -22, -124, 61, 10, 7, 8, Byte.MIN_VALUE, 12, 16, -21, -124, 61, 10, 7, 8, -124, 12, 16, -20, -124, 61, 10, 7, 8, -122, 12, 16, -19, -124, 61, 10, 7, 8, -118, 12, 16, -18, -124, 61, 10, 7, 8, -117, 12, 16, -17, -124, 61, 10, 7, 8, -113, 12, 16, -16, -124, 61, 10, 7, 8, -112, 12, 16, -15, -124, 61, 16, 1}), cgzh.f188104a);
            f188116k = bdyw.mo58449a("Tron__lockscreen_events_enable", true);
            f188117l = bdyw.mo58449a("Tron__metrics_reader_enabled", true);
            f188118m = bdyw.mo58449a("Tron__notification_events_enable", true);
            f188119n = bdyw.mo58449a("Tron__notification_id_enable", true);
            f188120o = bdyw.mo58449a("Tron__notification_tag_hashing", false);
            f188121p = bdyw.mo58449a("Tron__sysui_events_enable", true);
            try {
                f188122q = bdyw.mo58447a("Tron__view_rate", cixq.m151127a(new byte[]{10, 10, 8, 1, 16, -66, 2, 29, 0, 0, Byte.MIN_VALUE, 63, 10, 11, 8, -65, 2, 16, -59, 2, 29, 0, 0, 0, 0, 10, 11, 8, -58, 2, 16, -60, 8, 29, 0, 0, Byte.MIN_VALUE, 63, 10, 11, 8, -59, 8, 16, -57, 8, 29, 0, 0, 0, 0, 10, 13, 8, -56, 8, 16, -127, Byte.MIN_VALUE, Byte.MIN_VALUE, 32, 29, 0, 0, Byte.MIN_VALUE, 63}), cgzi.f188105a);
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"Tron__view_rate\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"Tron__field_config\"");
        }
    }

    /* renamed from: a */
    public final double mo84792a() {
        return ((Double) f188106a.mo58455c()).doubleValue();
    }

    /* renamed from: b */
    public final long mo84793b() {
        return ((Long) f188107b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo84794c() {
        return ((Long) f188108c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo84795d() {
        return ((Long) f188109d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo84796e() {
        return ((Boolean) f188110e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo84797f() {
        return ((Long) f188111f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo84798g() {
        return ((Boolean) f188112g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final long mo84799h() {
        return ((Long) f188113h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo84800i() {
        return ((Long) f188114i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final cixp mo84801j() {
        return (cixp) f188115j.mo58455c();
    }

    /* renamed from: k */
    public final boolean mo84802k() {
        return ((Boolean) f188116k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo84803l() {
        return ((Boolean) f188117l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo84804m() {
        return ((Boolean) f188118m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo84805n() {
        return ((Boolean) f188119n.mo58455c()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo84806o() {
        return ((Boolean) f188120o.mo58455c()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo84807p() {
        return ((Boolean) f188121p.mo58455c()).booleanValue();
    }

    /* renamed from: q */
    public final cixq mo84808q() {
        return (cixq) f188122q.mo58455c();
    }
}
