package p000;

import java.util.regex.Pattern;

/* renamed from: akzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzu extends bebz {

    /* renamed from: a */
    private static final sek f73189a = akzt.m60725a("UrlChecker");

    /* renamed from: b */
    private final Pattern f73190b;

    public akzu(Pattern pattern, Pattern pattern2) {
        super(new becd(bngx.m109356a(pattern)));
        sdo.m34959a(pattern2);
        this.f73190b = pattern2;
    }

    /* renamed from: b */
    public final boolean mo40032b(String str) {
        if (!this.f73190b.matcher(str).matches()) {
            return true;
        }
        f73189a.mo25409a("Blacklist violation. URL %s does match blacklist pattern %s", str, this.f73190b);
        return false;
    }
}
