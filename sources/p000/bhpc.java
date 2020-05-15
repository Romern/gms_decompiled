package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhpc implements bhpm {

    /* renamed from: a */
    final /* synthetic */ bhpf f119254a;

    public bhpc(bhpf bhpf) {
        this.f119254a = bhpf;
    }

    /* renamed from: a */
    public final void mo64076a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.f151297a;
        textInputLayout.mo71285e(true);
        bhpf bhpf = this.f119254a;
        bhpf.f119222m.setChecked(!bhpf.mo64128c());
        editText.removeTextChangedListener(this.f119254a.f119256a);
        editText.addTextChangedListener(this.f119254a.f119256a);
    }
}
