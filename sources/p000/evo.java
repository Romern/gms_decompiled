package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* renamed from: evo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class evo {
    /* renamed from: a */
    public static Intent m11196a(Context context, Uri uri) {
        Bundle bundle = new Bundle();
        int i = Build.VERSION.SDK_INT;
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", adyg.m51405b(context, 16842801, C0126R.color.google_white));
        bundle.putString("com.android.browser.application_id", context.getPackageName());
        return new Intent("android.intent.action.VIEW", uri).putExtras(bundle);
    }

    /* renamed from: a */
    public static Uri m11197a(String str, boolean z, ffk ffk) {
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        if (parse.getQueryParameter("hl") == null) {
            buildUpon.appendQueryParameter("hl", fgd.m11651b());
        }
        if (z) {
            buildUpon = Uri.parse(cbri.m128132b()).buildUpon().appendQueryParameter("hl", fgd.m11651b()).appendQueryParameter("continue", buildUpon.build().toString());
            if (ffr.m11620a(ffk)) {
                buildUpon.appendQueryParameter("Email", ffk.f16458a);
            }
        }
        return buildUpon.build();
    }
}
