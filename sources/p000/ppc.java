package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: ppc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ppc {

    /* renamed from: a */
    static volatile Set f40005a;

    /* renamed from: b */
    public final String f40006b;

    /* renamed from: c */
    public String f40007c = "";

    /* renamed from: d */
    public String f40008d = "";

    /* renamed from: e */
    public String f40009e = "";

    /* renamed from: f */
    public EnumSet f40010f = EnumSet.noneOf(ppb.class);

    /* renamed from: g */
    public String f40011g = "";

    /* renamed from: h */
    public long f40012h;

    /* renamed from: i */
    public int f40013i;

    /* renamed from: j */
    public boolean f40014j;

    public ppc(String str) {
        this.f40006b = str;
        this.f40010f = EnumSet.noneOf(ppb.class);
    }

    /* renamed from: a */
    public static boolean m30978a(String str) {
        if (f40005a == null) {
            synchronized (ppc.class) {
                if (f40005a == null) {
                    f40005a = Collections.unmodifiableSet(new HashSet(new ArrayList(cczq.f180312a.mo6606a().mo77108c().f165797a)));
                }
            }
        }
        return f40005a.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ppc) {
            ppc ppc = (ppc) obj;
            return TextUtils.equals(this.f40006b, ppc.f40006b) && TextUtils.equals(this.f40007c, ppc.f40007c) && TextUtils.equals(this.f40008d, ppc.f40008d) && TextUtils.equals(this.f40009e, ppc.f40009e) && sdg.m34949a(this.f40010f, ppc.f40010f) && TextUtils.equals(this.f40011g, ppc.f40011g) && this.f40012h == ppc.f40012h && this.f40013i == ppc.f40013i && this.f40014j == ppc.f40014j;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40006b, this.f40007c, this.f40008d, this.f40009e, this.f40010f, this.f40011g, Long.valueOf(this.f40012h), Integer.valueOf(this.f40013i), Boolean.valueOf(this.f40014j)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "CloudDeviceInfo { cloudDeviceId=%s, deviceType=%s, friendlyName=%s, deviceSsidsuffix=%s, capabilities=%s, truncatedlnid=%s, lastUpdatedTimestampMs=%d ipv4Fragment=%d, isLastSeenOnline=%b}", this.f40006b, this.f40007c, this.f40008d, this.f40009e, this.f40010f.toString(), this.f40011g, Long.valueOf(this.f40012h), Integer.valueOf(this.f40013i), Boolean.valueOf(this.f40014j));
    }

    public ppc(ppc ppc) {
        this.f40006b = ppc.f40006b;
        this.f40007c = ppc.f40007c;
        this.f40008d = ppc.f40008d;
        this.f40009e = ppc.f40009e;
        this.f40010f = EnumSet.copyOf(ppc.f40010f);
        this.f40011g = ppc.f40011g;
        this.f40012h = ppc.f40012h;
        this.f40013i = ppc.f40013i;
        this.f40014j = ppc.f40014j;
    }
}
