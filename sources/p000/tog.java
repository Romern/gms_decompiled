package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.credential.manager.util.FadeInImageView;
import java.util.Locale;

/* renamed from: tog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tog {
    /* renamed from: a */
    public static void m37286a(LinearLayout linearLayout, boolean z, bskf bskf, String str, Context context, String str2) {
        TextUtils.TruncateAt truncateAt;
        linearLayout.removeAllViews();
        if (z && bskf.mo70644c().size() == 1) {
            bytw bytw = (bytw) bskf.mo70644c().mo67639g().get(0);
            if ((bytw.f167727a & 2) != 0) {
                bytv bytv = bytw.f167729c;
                if (bytv == null) {
                    bytv = bytv.f167717g;
                }
                if (bytv.f167720b.equals(str)) {
                    return;
                }
            }
        }
        bnrd a = bskf.mo70644c().iterator();
        while (a.hasNext()) {
            bytw bytw2 = (bytw) a.next();
            TextView textView = new TextView(context, null, 0, C0126R.style.pwmSignonRealm);
            if ((bytw2.f167727a & 2) == 0) {
                Log.w(str2, "Unexpectedly missing branding info. Using full URI.");
                textView.setText(bytw2.f167728b);
                textView.setEllipsize(TextUtils.TruncateAt.START);
            } else {
                bytv bytv2 = bytw2.f167729c;
                if (bytv2 == null) {
                    bytv2 = bytv.f167717g;
                }
                textView.setText(bytv2.f167720b);
                bytv bytv3 = bytw2.f167729c;
                if (bytv3 == null) {
                    bytv3 = bytv.f167717g;
                }
                int a2 = bytu.m125339a(bytv3.f167721c);
                if (a2 != 0 && a2 == 2) {
                    truncateAt = TextUtils.TruncateAt.START;
                } else {
                    truncateAt = TextUtils.TruncateAt.END;
                }
                textView.setEllipsize(truncateAt);
            }
            linearLayout.addView(textView);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [com.google.android.gms.credential.manager.util.FadeInImageView, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* renamed from: a */
    public static void m37287a(FadeInImageView fadeInImageView, TextView textView, bskf bskf, bytz bytz, Context context) {
        TextUtils.TruncateAt truncateAt;
        textView.setText(bytz.f167739b);
        int a = bytu.m125339a(bytz.f167740c);
        if (a != 0 && a == 2) {
            truncateAt = TextUtils.TruncateAt.START;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        textView.setEllipsize(truncateAt);
        C1280ps.m19906b((View) fadeInImageView, 2);
        if ((bytz.f167738a & 4) != 0) {
            fadeInImageView.mo18105a(bytz.f167741d, context);
        } else if (((tqk) bskf.mo70642a().get(0)).mo26728c().toLowerCase(Locale.US).startsWith("android://")) {
            fadeInImageView.setImageResource(17301651);
        } else {
            fadeInImageView.setImageResource(C0126R.C0127drawable.quantum_ic_chrome_product_vd_theme_24);
        }
    }
}
