package p000;

import android.support.p002v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: tsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsz {

    /* renamed from: a */
    public final EditText f46619a;

    /* renamed from: b */
    public final Activity f46620b;

    /* renamed from: c */
    public final Toolbar f46621c;

    /* renamed from: d */
    public MenuItem f46622d;

    /* renamed from: e */
    public final C0034at f46623e = new C0034at();

    public tsz(Toolbar toolbar, Activity activity) {
        this.f46621c = toolbar;
        this.f46620b = activity;
        EditText editText = (EditText) toolbar.findViewById(C0126R.C0129id.search_edit_text);
        this.f46619a = editText;
        this.f46623e.mo2450b(editText.getText().toString());
    }

    /* renamed from: a */
    public final void mo26780a() {
        if (this.f46622d == null) {
            return;
        }
        if (this.f46619a.getText().toString().isEmpty()) {
            this.f46622d.setVisible(false);
        } else {
            this.f46622d.setVisible(true);
        }
    }
}
