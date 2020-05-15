package p000;

import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.regex.Matcher;

/* renamed from: aznz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aznz {

    /* renamed from: a */
    public final String f99774a;

    /* renamed from: b */
    public final String f99775b;

    /* renamed from: c */
    public final int f99776c;

    /* renamed from: d */
    public final String f99777d;

    /* renamed from: e */
    public final int f99778e;

    /* renamed from: f */
    public final String f99779f;

    /* renamed from: g */
    public final LocalEntityId f99780g;

    /* renamed from: h */
    public final LocalEntityId f99781h;

    /* renamed from: i */
    private final int f99782i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public aznz(String str, int i, int i2, String str2, int i3, String str3, boolean z) {
        this(String.format("%s:%s:%s:%s:%s:%s", str, Integer.valueOf(i), Integer.valueOf(i2), str2, Integer.valueOf(i3), str3), str, i, i2, str2, i3, str3);
        if (!(!z || i == 3 || i == 4)) {
            azoj.m85933c("ConvId", "Inconsistent encryption state", new Object[0]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aznz.<init>(java.lang.String, int, int, java.lang.String, int, java.lang.String, boolean):void
     arg types: [java.lang.String, int, int, java.lang.String, int, java.lang.String, int]
     candidates:
      aznz.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, int, java.lang.String):void
      aznz.<init>(java.lang.String, int, int, java.lang.String, int, java.lang.String, boolean):void */
    /* renamed from: a */
    public static aznz m85890a(cbma cbma, cbma cbma2) {
        int a;
        int a2 = LocalEntityId.m94547a(cbma);
        if (a2 == 0 || (a = LocalEntityId.m94547a(cbma2)) == 0) {
            return null;
        }
        String str = cbma.f177595c;
        int b = cipg.m150691b(cbma.f177593a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        if (b == 4) {
            i = 2;
        }
        return new aznz(str, i, a2, cbma.f177594b, a, cbma2.f177594b, false);
    }

    /* renamed from: b */
    public final boolean mo55104b() {
        int i = this.f99782i;
        return i == 2 || i == 4;
    }

    /* renamed from: c */
    public final boolean mo55105c() {
        int i = this.f99782i;
        return i == 1 || i == 3;
    }

    /* renamed from: d */
    public final boolean mo55106d() {
        int i = this.f99782i;
        return i == 4 || i == 3;
    }

    /* renamed from: e */
    public final boolean mo55107e() {
        return mo55105c() && this.f99776c == 3 && mo55108f();
    }

    /* renamed from: f */
    public final boolean mo55108f() {
        return "FB".equals(this.f99775b);
    }

    /* renamed from: g */
    public final boolean mo55109g() {
        return mo55108f() && mo55104b();
    }

    public final String toString() {
        return this.f99774a;
    }

    private aznz(String str, String str2, int i, int i2, String str3, int i3, String str4) {
        this.f99774a = str;
        this.f99775b = str2;
        this.f99782i = i;
        this.f99777d = str3;
        this.f99776c = i2;
        this.f99779f = str4;
        this.f99778e = i3;
        this.f99781h = new LocalEntityId(str3, i2, str2);
        this.f99780g = new LocalEntityId(str4, i3, "MS");
    }

    /* renamed from: a */
    public static aznz m85891a(String str) {
        Matcher matcher = azoa.f99783a.matcher(str);
        if (matcher.find()) {
            try {
                return new aznz(str, matcher.group(1), Integer.parseInt(matcher.group(2)), LocalEntityId.m94546a(Integer.parseInt(matcher.group(3))), matcher.group(4), LocalEntityId.m94546a(Integer.parseInt(matcher.group(5))), matcher.group(6));
            } catch (NumberFormatException e) {
                azoj.m85931a("ConvId", e, "Failed to parse %s", str);
                return null;
            }
        } else {
            azoj.m85933c("ConvId", "Failed to parse %s", null);
            return null;
        }
    }

    /* renamed from: a */
    public final cbma mo55103a() {
        if (!mo55108f()) {
            return null;
        }
        bxvd da = cbma.f177591f.mo74144da();
        String str = this.f99777d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((cbma) da.f164949b).f177594b = str;
        int b = cipg.m150691b(LocalEntityId.m94546a(this.f99776c));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbma) da.f164949b).f177593a = cipg.m150690a(b);
        String str2 = this.f99775b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str2.getClass();
        ((cbma) da.f164949b).f177595c = str2;
        return (cbma) da.mo74062i();
    }
}
