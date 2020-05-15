package p000;

import android.text.Editable;
import android.view.View;

/* renamed from: bhoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhoc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bhoh f119184a;

    public bhoc(bhoh bhoh) {
        this.f119184a = bhoh;
    }

    public void onClick(View view) {
        Editable text = this.f119184a.f119220k.f151297a.getText();
        if (text != null) {
            text.clear();
        }
    }
}
