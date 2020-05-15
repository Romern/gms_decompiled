package p000;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhpf extends bhov {

    /* renamed from: a */
    public final TextWatcher f119256a = new bhpb(this);

    /* renamed from: b */
    private final bhpm f119257b = new bhpc(this);

    /* renamed from: c */
    private final bhpd f119258c = new bhpd();

    public bhpf(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    public final void mo64082a() {
        this.f119220k.mo71271c(C1391tv.m20459b(this.f119221l, C0126R.C0127drawable.design_password_eye));
        TextInputLayout textInputLayout = this.f119220k;
        textInputLayout.mo71284e(textInputLayout.getResources().getText(C0126R.string.password_toggle_content_description));
        this.f119220k.mo71255a(new bhpe(this));
        this.f119220k.mo71258a(this.f119257b);
        TextInputLayout textInputLayout2 = this.f119220k;
        textInputLayout2.f151340n.add(this.f119258c);
        EditText editText = this.f119220k.f151297a;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: c */
    public final boolean mo64128c() {
        EditText editText = this.f119220k.f151297a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
