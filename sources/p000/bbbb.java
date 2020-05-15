package p000;

import android.content.Context;

/* renamed from: bbbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbbb {
    /* renamed from: a */
    public static bbba m87767a(Context context, bawt bawt) {
        int i = context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", bbba.NEW_FILE_KEY.f102265d);
        try {
            return bbba.m87766a(i);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(68);
            sb.append("FileKey version metadata corrupted with unknown version: ");
            sb.append(i);
            bawt.mo55999a(sb.toString(), e);
            m87770b(context);
            return bbba.USE_CHECKSUM_ONLY;
        }
    }

    /* renamed from: b */
    public static void m87770b(Context context) {
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
    }

    /* renamed from: c */
    public static void m87771c(Context context) {
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }

    /* renamed from: a */
    static boolean m87768a(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    /* renamed from: a */
    public static boolean m87769a(Context context, bbba bbba) {
        bbba.name();
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", bbba.f102265d).commit();
    }
}
