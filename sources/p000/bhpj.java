package p000;

import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhpj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f119264a;

    public bhpj(TextInputLayout textInputLayout) {
        this.f119264a = textInputLayout;
    }

    public final void run() {
        this.f119264a.f151297a.requestLayout();
    }
}
