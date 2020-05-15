package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.service.autofill.InlinePresentation;
import android.util.Size;
import android.widget.inline.InlinePresentationSpec;
import com.felicanetworks.mfc.C0126R;

/* renamed from: lgl */
final /* synthetic */ class lgl implements bmxj {

    /* renamed from: a */
    private final lgm f26043a;

    public lgl(lgm lgm) {
        this.f26043a = lgm;
    }

    public final Object apply(Object obj) {
        Context context = this.f26043a.f26044a;
        int height = ((InlinePresentationSpec) obj).getMinSize().getHeight();
        kcz a = kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.quantum_ic_credit_card_grey600_24, "");
        agx agx = new agx();
        agx.mo694b(lbi.m18880a(a, context));
        PendingIntent a2 = lio.m19188a(context);
        if (a2 != null) {
            agx.mo691a(a2);
        }
        Size size = new Size(height, height);
        return new InlinePresentation(agx.mo690a(), new InlinePresentationSpec.Builder(size, size).build(), true);
    }
}
