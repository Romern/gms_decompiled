package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;

/* renamed from: anzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anzf extends ClickableSpan {

    /* renamed from: a */
    private final Context f77919a;

    /* renamed from: b */
    private final String f77920b;

    /* renamed from: c */
    private final String f77921c;

    /* renamed from: d */
    private final String f77922d;

    public anzf(Context context, String str, String str2, String str3) {
        this.f77919a = context;
        this.f77920b = str;
        this.f77921c = str2;
        this.f77922d = str3;
    }

    public void onClick(View view) {
        if (view.getResources().getBoolean(C0126R.bool.show_dpad_navigable_web_view)) {
            Context context = view.getContext();
            String str = this.f77922d;
            Intent intent = new Intent("com.google.android.gms.plus.action.DPAD_WEBVIEW");
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
            return;
        }
        String str2 = this.f77922d;
        String str3 = this.f77921c;
        Bundle bundle = new Bundle();
        bundle.putString("secureUrl", str2);
        bundle.putString("prettyUrl", str2);
        bundle.putString("title", str3);
        anzo anzo = new anzo();
        anzo.setArguments(bundle);
        anzo.show(((FragmentActivity) view.getContext()).getSupportFragmentManager(), this.f77920b);
    }

    public final void updateDrawState(TextPaint textPaint) {
        Resources resources = this.f77919a.getResources();
        textPaint.setUnderlineText(resources.getBoolean(C0126R.bool.plus_links_underlined));
        textPaint.setColor(resources.getColor(C0126R.color.plus_oob_link_color));
    }
}
