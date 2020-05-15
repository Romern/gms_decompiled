package p000;

import android.content.Context;
import android.widget.inline.InlinePresentationSpec;
import com.felicanetworks.mfc.C0126R;

/* renamed from: lre */
final /* synthetic */ class lre implements bmxj {

    /* renamed from: a */
    private final Context f26629a;

    public lre(Context context) {
        this.f26629a = context;
    }

    public final Object apply(Object obj) {
        Context context = this.f26629a;
        lrc a = lbi.m18883a(context);
        CharSequence b = a.mo15386b(C0126R.string.autofill_sms_prompt);
        return lbi.m18882a(context, b, a.mo15386b(C0126R.string.autofill_sms_subtext), kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.product_logo_messages_color_24, b), (InlinePresentationSpec) obj);
    }
}
