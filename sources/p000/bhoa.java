package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* renamed from: bhoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhoa implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ bhob f119182a;

    public bhoa(bhob bhob) {
        this.f119182a = bhob;
    }

    public final void onFocusChange(View view, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(((EditText) view).getText());
        bhoh bhoh = this.f119182a.f119183a;
        boolean z2 = true;
        if (!(!isEmpty)) {
            z2 = false;
        } else if (!z) {
            z2 = false;
        }
        bhoh.mo64084b(z2);
    }
}
