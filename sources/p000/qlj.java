package p000;

import android.os.Build;

@Deprecated
/* renamed from: qlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qlj {

    /* renamed from: a */
    public static final bdyx f41642a;

    /* renamed from: b */
    public static final bdyx f41643b;

    /* renamed from: c */
    private static final bdyw f41644c;

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
        bdyw b = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58445a("gms:chimera:").mo58451b("Chimera__");
        f41644c = b;
        int i = Build.VERSION.SDK_INT;
        f41642a = bdyx.m91610a(b, "stage_container_file_apks_at_startup", true);
        bdyw bdyw = f41644c;
        int i2 = Build.VERSION.SDK_INT;
        f41643b = bdyx.m91610a(bdyw, "update_config_at_startup", true);
    }
}
