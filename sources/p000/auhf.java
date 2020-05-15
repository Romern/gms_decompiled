package p000;

import android.content.Context;
import com.google.android.gms.thunderbird.settings.provider.ThunderbirdSettingsChimeraContentProvider;
import java.io.IOException;

/* renamed from: auhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhf {
    /* renamed from: a */
    public static boolean m77066a(Context context) {
        try {
            return ((Boolean) ThunderbirdSettingsChimeraContentProvider.m93359a(context, "enabled")).booleanValue();
        } catch (IOException e) {
            auho.m77069a(context, e);
            return false;
        }
    }
}
