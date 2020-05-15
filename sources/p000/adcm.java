package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.identity.common.p050ui.util.UiTextUtil$1;
import java.net.URISyntaxException;

/* renamed from: adcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adcm {

    /* renamed from: a */
    public static final /* synthetic */ int f61374a = 0;

    /* renamed from: b */
    private static final sek f61375b = new sek("Identity", "UiTextUtil");

    /* renamed from: a */
    public static void m50165a(Context context, SpannableStringBuilder spannableStringBuilder, String str, String str2, Resources.Theme theme, int i, int i2, View.OnClickListener onClickListener) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new UiTextUtil$1(str2, theme, i, i2, onClickListener, context), length, spannableStringBuilder.length(), 33);
    }

    /* renamed from: a */
    public static void m50166a(Context context, String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (context.getPackageManager().queryIntentActivities(parseUri, 0).isEmpty()) {
                Toast.makeText(context, context.getResources().getString(C0126R.string.common_no_browser_found), 1).show();
                f61375b.mo25418e("No handler found for credentials management url", new Object[0]);
                return;
            }
            context.startActivity(parseUri);
        } catch (URISyntaxException e) {
            f61375b.mo25418e("Failed to parse the url", new Object[0]);
        }
    }
}
