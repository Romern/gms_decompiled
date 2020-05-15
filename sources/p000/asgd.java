package p000;

import android.os.Build;
import java.util.regex.Pattern;

/* renamed from: asgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgd {

    /* renamed from: a */
    public static final String f88892a = "[\\[{](?:type=(?<type>-1|\\w+))[, ]*(?:subType=(?<subtype>[^,]+))?[, ]*(?:subscriberId=(?<subscriberId>[0-9]+)(?:...)?)?[, ]*(?<roaming>ROAMING)?[^\\]}]*[\\]}]";

    /* renamed from: b */
    public static final String f88893b = " *st=(?<start>[0-9]+)(?: rb=(?<rxBytes>[0-9]+))?(?: rp=(?<rxPackets>[0-9]+))?(?: tb=(?<txBytes>[0-9]+))?(?: tp=(?<txPackets>[0-9]+))?(?: op=(?<operations>[0-9]+))?.*";

    /* renamed from: c */
    public static final int f88894c = 1000;

    /* renamed from: p */
    public static final Pattern f88895p = Pattern.compile("\\?<([a-zA-Z0-9]+)>");

    /* renamed from: d */
    public final asgb f88896d = new asgc((String) asfw.f88867a.mo25081c());

    /* renamed from: e */
    public final asgb f88897e = new asgc((String) asfw.f88868b.mo25081c());

    /* renamed from: f */
    public final asgb f88898f = new asgc((String) asfw.f88869c.mo25081c());

    /* renamed from: g */
    public final asgb f88899g = new asgc((String) asfw.f88870d.mo25081c());

    /* renamed from: h */
    public final asgb f88900h = new asgb((String) asfw.f88871e.mo25081c());

    /* renamed from: i */
    public final asgb f88901i = new asgb((String) asfw.f88872f.mo25081c());

    /* renamed from: j */
    public final asgb f88902j = new asgb((String) asfw.f88873g.mo25081c());

    /* renamed from: k */
    public final asgb f88903k = new asgb((String) asfw.f88874h.mo25081c());

    /* renamed from: l */
    public final asgb f88904l = new asgb((String) asfw.f88875i.mo25081c());

    /* renamed from: m */
    public final asgb f88905m = new asgb((String) asfw.f88876j.mo25081c());

    /* renamed from: n */
    public final asgb f88906n = new asgb((String) asfw.f88877k.mo25081c());

    /* renamed from: o */
    public final int f88907o = ((Integer) asfw.f88878l.mo25081c()).intValue();

    /* renamed from: q */
    private final int f88908q = ((Integer) asfw.f88879m.mo25081c()).intValue();

    /* renamed from: a */
    public final long mo49147a(long j) {
        return j * ((long) this.f88908q);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
    }
}
