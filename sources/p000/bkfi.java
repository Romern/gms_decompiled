package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* renamed from: bkfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkfi extends C1251oq {
    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        if ((view instanceof EditText) && !TextUtils.isEmpty(((EditText) view).getText())) {
            qmVar.mo15755a((CharSequence) "");
            qmVar.mo15777f(false);
            qmVar.mo15786j();
            qmVar.mo15762b(C1298qj.f26862c);
            qmVar.mo15762b(C1298qj.f26863d);
        }
    }
}
