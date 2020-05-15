package p000;

import android.app.assist.AssistStructure;
import android.view.autofill.AutofillId;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: kvy */
public final /* synthetic */ class kvy implements Consumer {

    /* renamed from: a */
    private final kwe f25240a;

    public kvy(kwe kwe) {
        this.f25240a = kwe;
    }

    public final void accept(Object obj) {
        kwe kwe = this.f25240a;
        Map.Entry entry = (Map.Entry) obj;
        AutofillId autofillId = ((AssistStructure.ViewNode) entry.getKey()).getAutofillId();
        if (autofillId != null) {
            kwe.f25249b.put(autofillId, (Integer) entry.getValue());
        }
    }
}
