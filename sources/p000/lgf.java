package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.content.Context;
import android.service.autofill.InlinePresentation;
import android.util.Size;
import android.widget.inline.InlinePresentationSpec;
import com.felicanetworks.mfc.C0126R;

/* renamed from: lgf */
final /* synthetic */ class lgf implements bmxj {

    /* renamed from: a */
    private final lgg f26033a;

    public lgf(lgg lgg) {
        this.f26033a = lgg;
    }

    public final Object apply(Object obj) {
        Context context = this.f26033a.f26034a;
        int height = ((InlinePresentationSpec) obj).getMinSize().getHeight();
        kcz a = kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.quantum_ic_vpn_key_grey600_24, "");
        agx agx = new agx();
        agx.mo694b(lbi.m18880a(a, context));
        PendingIntent a2 = lio.m19188a(context);
        if (a2 != null) {
            agx.mo691a(a2);
        }
        Slice a3 = agx.mo690a();
        Size size = new Size(height, height);
        return new InlinePresentation(a3, new InlinePresentationSpec.Builder(size, size).build(), true);
    }
}
