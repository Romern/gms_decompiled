package p000;

import android.content.Context;
import android.view.View;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aazq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aazq {
    /* renamed from: a */
    public static String m47333a(aasm aasm) {
        bzpz x = aasm.mo31742x();
        sdo.m34959a(x);
        return String.format("%s?%s=%s&%s=%s", aasm.f56497g, "promotionVersion", Integer.toString(aasm.f56514x), "placement", Integer.toString(x.f170973d));
    }

    /* renamed from: a */
    public static void m47334a(Context context, HelpConfig helpConfig) {
        aasa a = new aasc(context, helpConfig).mo31695a();
        a.mo31686a("promoted_content_title");
        a.mo31686a("promoted_content_snippet");
        a.mo31686a("promoted_content_url");
        a.mo31686a("promoted_content_image_base64");
        a.mo31686a("promoted_content_external_link_text");
        a.mo31686a("promoted_content_version");
        a.mo31686a("promoted_content_placement");
        a.mo31685a();
    }

    /* renamed from: a */
    public static void m47335a(View view, HelpChimeraActivity helpChimeraActivity, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }
}
