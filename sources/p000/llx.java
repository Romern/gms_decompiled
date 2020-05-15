package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.function.Consumer;

/* renamed from: llx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class llx implements TextWatcher {

    /* renamed from: a */
    private final EditText f26334a;

    /* renamed from: b */
    private final Consumer f26335b;

    public llx(EditText editText, Consumer consumer) {
        this.f26334a = editText;
        this.f26335b = consumer;
    }

    public final void afterTextChanged(Editable editable) {
        this.f26334a.removeTextChangedListener(this);
        this.f26335b.accept(editable);
        this.f26334a.addTextChangedListener(this);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
