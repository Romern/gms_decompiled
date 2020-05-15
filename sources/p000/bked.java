package p000;

import android.view.View;
import com.google.android.wallet.p097ui.common.InlineSelectView;

/* renamed from: bked */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bked extends C1251oq {

    /* renamed from: b */
    final /* synthetic */ InlineSelectView f124077b;

    public bked(InlineSelectView inlineSelectView) {
        this.f124077b = inlineSelectView;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        Integer num = (Integer) view.getTag();
        boolean z = true;
        qmVar.mo15758a(true);
        if (!InlineSelectView.m118617a(this.f124077b.f152108h)) {
            if (num.intValue() != this.f124077b.f152105e) {
                z = false;
            }
            qmVar.mo15763b(z);
            return;
        }
        qmVar.mo15763b(this.f124077b.f152106f[num.intValue()]);
    }
}
