package p000;

/* renamed from: ceov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceov implements ceou {

    /* renamed from: a */
    public static final bdyx f183162a;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.instantapps")).mo58443a();
        f183162a = bdyx.m91610a(a, "Api__aiaEnabledReadWriteApiKillSwitch", false);
        bdyx.m91610a(a, "Api__instantAppInstallUninstallChromeOsKillSwitch", false);
        bdyx.m91610a(a, "Api__instantAppRemovedApiKillSwitch", false);
    }

    /* renamed from: a */
    public final boolean mo79498a() {
        return ((Boolean) f183162a.mo58455c()).booleanValue();
    }
}
