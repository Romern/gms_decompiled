package p000;

/* renamed from: asfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfw {

    /* renamed from: a */
    public static final rtc f88867a = rtc.m34378a("gms:stats:netstats:pattern:idents", " *ident=\\[(?<idents>.*)\\](?: uid=(?<uid>-?[0-9]+))?(?: set=(?<set>\\w+))?(?: tag=0x(?<tag>[0-9a-f]+))?.*");

    /* renamed from: b */
    public static final rtc f88868b = rtc.m34378a("gms:stats:netstats:pattern:ident", asgd.f88892a);

    /* renamed from: c */
    public static final rtc f88869c = rtc.m34378a("gms:stats:netstats:pattern:history", ".*bucketDuration=(?<duration>[0-9]+).*");

    /* renamed from: d */
    public static final rtc f88870d = rtc.m34378a("gms:stats:netstats:pattern:bucket", asgd.f88893b);

    /* renamed from: e */
    public static final rtc f88871e = rtc.m34378a("gms:stats:netstats:pattern:uid_start", "UID stats:|Detailed UID stats:");

    /* renamed from: f */
    public static final rtc f88872f = rtc.m34378a("gms:stats:netstats:pattern:uid_tag_start", "UID tag stats:");

    /* renamed from: g */
    public static final rtc f88873g = rtc.m34378a("gms:stats:netstats:pattern:type_both", "ALL");

    /* renamed from: h */
    public static final rtc f88874h = rtc.m34378a("gms:stats:netstats:pattern:type_background", "DEFAULT");

    /* renamed from: i */
    public static final rtc f88875i = rtc.m34378a("gms:stats:netstats:pattern:type_foreground", "FOREGROUND");

    /* renamed from: j */
    public static final rtc f88876j = rtc.m34378a("gms:stats:netstats:pattern:type_debug_vpn_in_pattern", "DBG_VPN_IN");

    /* renamed from: k */
    public static final rtc f88877k = rtc.m34378a("gms:stats:netstats:pattern:type_debug_vpn_out_pattern", "DBG_VPN_OUT");

    /* renamed from: l */
    public static final rtc f88878l = rtc.m34376a("gms:stats:netstats:pattern:tag_radix", (Integer) 16);

    /* renamed from: m */
    public static final rtc f88879m = rtc.m34376a("gms:stats:netstats:pattern:ts_to_millis", Integer.valueOf(asgd.f88894c));
}
