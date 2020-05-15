package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkgh implements TextWatcher, Runnable {

    /* renamed from: a */
    public final List f124199a = new ArrayList();

    /* renamed from: b */
    public bker f124200b;

    /* renamed from: c */
    private final EditText f124201c;

    /* renamed from: d */
    private final bkce f124202d;

    /* renamed from: e */
    private final bkdf f124203e;

    /* renamed from: f */
    private boolean f124204f;

    public bkgh(EditText editText, bkce bkce, bkdf bkdf) {
        this.f124201c = editText;
        this.f124202d = bkce;
        this.f124203e = bkdf;
    }

    /* renamed from: a */
    public final void mo65986a(bker bker, boolean z) {
        this.f124199a.add(bker);
        if (!z) {
            return;
        }
        if (this.f124200b == null) {
            this.f124200b = bker;
            return;
        }
        throw new IllegalStateException("Only one OnAutoAdvanceListener may override the default behaviour.");
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f124201c.isFocused() && !this.f124204f && this.f124202d.mo65775cO() && this.f124203e.mo65799cM()) {
            int size = this.f124199a.size();
            for (int i = 0; i < size; i++) {
                ((bker) this.f124199a.get(i)).mo65764a(this.f124201c);
            }
            if (this.f124200b == null) {
                this.f124201c.post(this);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f124204f = i3 == 0;
    }

    public final void run() {
        bkfr.m105611e(this.f124201c);
    }
}
