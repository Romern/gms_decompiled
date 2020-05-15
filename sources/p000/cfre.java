package p000;

/* renamed from: cfre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfre implements cfrd {

    /* renamed from: a */
    public static final bdyx f185486a;

    /* renamed from: b */
    public static final bdyx f185487b;

    /* renamed from: c */
    public static final bdyx f185488c;

    /* renamed from: d */
    public static final bdyx f185489d;

    /* renamed from: e */
    public static final bdyx f185490e;

    /* renamed from: f */
    public static final bdyx f185491f;

    /* renamed from: g */
    public static final bdyx f185492g;

    /* renamed from: h */
    public static final bdyx f185493h;

    /* renamed from: i */
    public static final bdyx f185494i;

    /* renamed from: j */
    public static final bdyx f185495j;

    /* renamed from: k */
    public static final bdyx f185496k;

    /* renamed from: l */
    public static final bdyx f185497l;

    /* renamed from: m */
    public static final bdyx f185498m;

    /* renamed from: n */
    public static final bdyx f185499n;

    /* renamed from: o */
    public static final bdyx f185500o;

    /* renamed from: p */
    public static final bdyx f185501p;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.octarine")).mo58445a("gms:octarine:");
        f185486a = bdyx.m91609a(a, "Config__accountChooserUrl", "https://accounts.google.com/AccountChooser");
        f185487b = bdyx.m91609a(a, "Config__browser_auth_blacklist_regex", "https://(www\\.google\\.com/inputtools(/.*)?|www\\.google\\.com/url|support\\.google\\.com(/.*)?|accounts\\.google\\.com/Logout|myaccount\\.google\\.com/accountdeleted|myaccount\\.google\\.com/agedisabled|userresearch\\.google\\.com)");
        f185488c = bdyx.m91609a(a, "Config__browser_auth_whitelist_regex", "https://[a-zA-Z0-9.-]+\\.google\\.com(/.*)?");
        f185489d = bdyx.m91610a(a, "Config__enable_play_protect_js_bridge", true);
        f185490e = bdyx.m91610a(a, "Config__enable_security_key_support", true);
        f185491f = bdyx.m91610a(a, "Config__enable_telephony_js_bridge", true);
        f185492g = bdyx.m91610a(a, "Config__enable_trust_agent_support", true);
        f185493h = bdyx.m91610a(a, "Config__enforce_auth_cookie_refresh", false);
        f185494i = bdyx.m91609a(a, "Config__js_bridge_blacklist_regex", "");
        f185495j = bdyx.m91609a(a, "Config__js_bridge_whitelist_regex", "https://(myaccount\\.google\\.com/embedded/.*|myactivity\\.google\\.com/embedded/.*|adssettings\\.google\\.com/embedded/.*|passwords\\.google\\.com/embedded/.*|takeout\\.google\\.com/embedded/.*|accounts\\.google\\.com/.*)");
        bdyx.m91610a(a, "Config__login_cookie_hashing_improvement_enabled", true);
        f185496k = bdyx.m91609a(a, "Config__security_key_js_bridge_blacklist_regex", "");
        f185497l = bdyx.m91609a(a, "Config__security_key_js_bridge_whitelist_regex", "https://accounts\\.google\\.com/ServiceLogin.*");
        f185498m = bdyx.m91609a(a, "Config__telephony_js_bridge_blacklist_regex", "");
        f185499n = bdyx.m91609a(a, "Config__telephony_js_bridge_whitelist_regex", "https://myaccount\\.google\\.com/embedded/signinoptions/recovery-options-collection");
        f185500o = bdyx.m91609a(a, "Config__url_blacklist_regex", "");
        f185501p = bdyx.m91609a(a, "Config__url_whitelist_regex", "https://(myaccount\\.google\\.com/embedded/.*|myaccount\\.google\\.com/accounts/SetOSID|myactivity\\.google\\.com/embedded/.*|adssettings\\.google\\.com/embedded/.*|fit\\.google\\.com/privacy/embedded/.*|takeout\\.google\\.com/embedded/.*|passwords\\.google\\.com/embedded/.*|passwords\\.google\\.com/accounts/SetOSID|accounts\\.g\\.(cn)(/.*)?|accounts\\.googel\\.(cn)(/.*)?|accounts\\.google\\.(ac|ad|ae|af|ag|al|am|as|at|aw|az|ba|be|bf|bg|bi|biz|bj|bm|bn|bo|bs|bt|by|bz|ca|cat|cc|cd|cf|cg|ch|ci|cl|cm|cn|co\\.ao|co\\.at|co\\.ba|co\\.bi|co\\.bw|co\\.ci|co\\.ck|co\\.cr|co\\.gg|co\\.gl|co\\.gy|co\\.hu|co\\.id|co\\.il|co\\.im|co\\.in|co\\.it|co\\.je|co\\.jp|co\\.ke|co\\.kr|co\\.ls|co\\.ma|co\\.mu|co\\.mw|co\\.mz|co\\.nz|co\\.pn|co\\.rs|co\\.th|co\\.tt|co\\.tz|co\\.ua|co\\.ug|co\\.uk|co\\.uz|co\\.ve|co\\.vi|co\\.za|co\\.zm|co\\.zw|com|com\\.af|com\\.ag|com\\.ai|com\\.ar|com\\.au|com\\.az|com\\.bd|com\\.bh|com\\.bi|com\\.bn|com\\.bo|com\\.br|com\\.bs|com\\.by|com\\.bz|com\\.cn|com\\.co|com\\.cu|com\\.cy|com\\.do|com\\.dz|com\\.ec|com\\.eg|com\\.er|com\\.et|com\\.fj|com\\.ge|com\\.gh|com\\.gi|com\\.gl|com\\.gp|com\\.gr|com\\.gt|com\\.gy|com\\.hk|com\\.hn|com\\.hr|com\\.ht|com\\.iq|com\\.jm|com\\.jo|com\\.kg|com\\.kh|com\\.ki|com\\.kw|com\\.kz|com\\.lb|com\\.lc|com\\.lk|com\\.lv|com\\.ly|com\\.mk|com\\.mm|com\\.mt|com\\.mu|com\\.mw|com\\.mx|com\\.my|com\\.na|com\\.nc|com\\.nf|com\\.ng|com\\.ni|com\\.np|com\\.nr|com\\.om|com\\.pa|com\\.pe|com\\.pg|com\\.ph|com\\.pk|com\\.pl|com\\.pr|com\\.ps|com\\.pt|com\\.py|com\\.qa|com\\.ru|com\\.sa|com\\.sb|com\\.sc|com\\.sg|com\\.sl|com\\.sv|com\\.tj|com\\.tm|com\\.tn|com\\.tr|com\\.tt|com\\.tw|com\\.ua|com\\.uy|com\\.uz|com\\.vc|com\\.ve|com\\.vi|com\\.vn|com\\.ws|cv|cx|cz|de|dj|dk|dm|do|dz|ec|ee|es|eu|fi|fm|fr|ga|gd|ge|gf|gg|gl|gm|gp|gr|gw|gy|hk|hn|hr|ht|hu|ie|im|in|in\\.rs|info|io|iq|is|it|it\\.ao|je|jo|jobs|jp|kg|ki|km|kn|kr|kz|la|li|lk|lt|lu|lv|ma|md|me|mg|mh|mk|ml|mn|mobi|mr|ms|mu|mv|mw|mx|name|ne|ne\\.jp|net|net\\.in|net\\.nz|nf|ng|nl|no|nom\\.es|nr|nu|off\\.ai|org|org\\.af|org\\.es|org\\.in|org\\.nz|org\\.uk|pf|ph|pk|pl|pn|pr|pro|ps|pt|qa|re|ro|rs|ru|rw|sc|se|sg|sh|si|sk|sl|sm|sn|so|sr|st|sz|td|tel|tg|tk|tl|tm|tn|to|tp|tt|tv|tw|ua|ug|us|uz|vc|vg|vn|vu|ws|yt)(/.*)?|accounts\\.guge\\.(cn|com|com\\.cn)(/.*)?|accounts\\.xn--2e0b0k\\.(kr)(/.*)?|accounts\\.xn--c1aay4a\\.(xn--p1ai)(/.*)?|accounts\\.xn--flW351E\\.(cn)(/.*)?|accounts\\.youtube\\.(com)(/.*)?)");
    }

    /* renamed from: a */
    public final String mo82543a() {
        return (String) f185486a.mo58455c();
    }

    /* renamed from: b */
    public final String mo82544b() {
        return (String) f185487b.mo58455c();
    }

    /* renamed from: c */
    public final String mo82545c() {
        return (String) f185488c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo82546d() {
        return ((Boolean) f185489d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo82547e() {
        return ((Boolean) f185490e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo82548f() {
        return ((Boolean) f185491f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo82549g() {
        return ((Boolean) f185492g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo82550h() {
        return ((Boolean) f185493h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final String mo82551i() {
        return (String) f185494i.mo58455c();
    }

    /* renamed from: j */
    public final String mo82552j() {
        return (String) f185495j.mo58455c();
    }

    /* renamed from: k */
    public final String mo82553k() {
        return (String) f185496k.mo58455c();
    }

    /* renamed from: l */
    public final String mo82554l() {
        return (String) f185497l.mo58455c();
    }

    /* renamed from: m */
    public final String mo82555m() {
        return (String) f185498m.mo58455c();
    }

    /* renamed from: n */
    public final String mo82556n() {
        return (String) f185499n.mo58455c();
    }

    /* renamed from: o */
    public final String mo82557o() {
        return (String) f185500o.mo58455c();
    }

    /* renamed from: p */
    public final String mo82558p() {
        return (String) f185501p.mo58455c();
    }
}
