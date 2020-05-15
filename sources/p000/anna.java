package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anna {

    /* renamed from: a */
    private static anna f77178a;

    private anna() {
    }

    /* renamed from: a */
    public static final CharSequence m64796a(Context context, int i) {
        String str;
        CharSequence charSequence;
        if (i == 1) {
            charSequence = context.getText(C0126R.string.plus_list_apps_disabled_error);
            str = (String) ansx.f77655E.mo25081c();
        } else if (i != 2) {
            charSequence = context.getText(C0126R.string.plus_manage_app_disabled_error);
            str = (String) ansx.f77659I.mo25081c();
        } else {
            charSequence = context.getText(C0126R.string.plus_list_moments_disabled_error);
            str = (String) ansx.f77657G.mo25081c();
        }
        return str != null ? annj.m64806a(charSequence, str) : charSequence;
    }

    /* renamed from: b */
    public static final boolean m64798b(Context context, int i) {
        String str;
        if (i == 1) {
            str = (String) ansx.f77654D.mo25081c();
        } else if (i != 2) {
            str = (String) ansx.f77658H.mo25081c();
        } else {
            str = (String) ansx.f77656F.mo25081c();
        }
        if (str != null) {
            String num = Integer.toString(spn.m35881e(context));
            for (String str2 : str.split(";")) {
                if (str2.equals(num)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m64797a() {
        if (f77178a == null) {
            f77178a = new anna();
        }
    }
}
