package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;

/* renamed from: ajgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajgk {

    /* renamed from: a */
    private final Context f70584a;

    /* renamed from: b */
    private final buqb f70585b;

    public ajgk(Context context) {
        this.f70584a = context;
        this.f70585b = new buqb(context, null);
    }

    /* renamed from: c */
    private static final boolean m58666c(String str) {
        return "com.google.android.gms".equals(str) || "com.google.android.play.games".equals(str);
    }

    /* renamed from: d */
    private final SharedPreferences m58667d() {
        return this.f70584a.getSharedPreferences("nearby_message_packages", 4);
    }

    /* renamed from: e */
    private final SharedPreferences.Editor m58668e() {
        return m58667d().edit();
    }

    /* renamed from: f */
    private final SharedPreferences m58669f() {
        return this.f70584a.getSharedPreferences("nearby_message_packages_popup", 4);
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo38608a() {
        return m58669f().edit();
    }

    /* renamed from: b */
    public final SharedPreferences mo38611b() {
        return this.f70584a.getSharedPreferences("nearby_message_packages_denied", 4);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buqb.a(byvm, boolean):void
     arg types: [byvm, int]
     candidates:
      buqb.a(int, ahcv):void
      buqb.a(int, ahcy):void
      buqb.a(byvm, boolean):void */
    /* renamed from: a */
    public final void mo38609a(String str, boolean z) {
        int i;
        if (!m58666c(str)) {
            m58668e().putBoolean(str, z).commit();
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            buqb buqb = this.f70585b;
            bxvd da = bywn.f168628c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bywn bywn = (bywn) da.f164949b;
            bywn.f168631b = i - 1;
            bywn.f168630a |= 1;
            bywn bywn2 = (bywn) da.mo74062i();
            byvm a = buqb.m120220a(str, (String) null, 5);
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            byvm byvm = (byvm) bxvd.f164949b;
            byvm byvm2 = byvm.f168451k;
            bywn2.getClass();
            byvm.f168458f = bywn2;
            byvm.f168453a |= 32;
            buqb.mo72974a((byvm) bxvd.mo74062i(), true);
        }
    }

    /* renamed from: b */
    public final boolean mo38612b(String str) {
        mo38613c();
        if (!m58666c(str)) {
            return m58667d().getBoolean(str, false);
        }
        return true;
    }

    /* renamed from: c */
    public final void mo38613c() {
        boolean z;
        C1225nr nrVar = new C1225nr();
        for (PackageInfo packageInfo : this.f70584a.getPackageManager().getInstalledPackages(0)) {
            nrVar.add(packageInfo.packageName);
        }
        for (String str : m58667d().getAll().keySet()) {
            if (str != null) {
                z = str.startsWith("0p:");
            } else {
                z = false;
            }
            if (!z && !nrVar.contains(str)) {
                m58668e().remove(str).commit();
                mo38608a().remove(str).commit();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo38610a(String str) {
        mo38613c();
        return m58669f().getBoolean(str, true);
    }
}
