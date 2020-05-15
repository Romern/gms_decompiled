package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;
import java.util.Iterator;
import java.util.List;

/* renamed from: aavd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavd implements TextWatcher {

    /* renamed from: a */
    private final List f56641a;

    /* renamed from: b */
    private final MenuItem f56642b;

    public aavd(List list, MenuItem menuItem) {
        this.f56641a = list;
        this.f56642b = menuItem;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((EditText) it.next()).addTextChangedListener(this);
        }
    }

    /* renamed from: a */
    public final void mo31820a() {
        onTextChanged(null, 0, 0, 0);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        Iterator it = this.f56641a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((EditText) it.next()).getText().toString().trim().isEmpty()) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        this.f56642b.setEnabled(z);
    }
}
