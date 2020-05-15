package p000;

import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhpi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f119263a;

    public bhpi(TextInputLayout textInputLayout) {
        this.f119263a = textInputLayout;
    }

    public final void run() {
        this.f119263a.f151339m.performClick();
        this.f119263a.f151339m.jumpDrawablesToCurrentState();
    }
}
