package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: bhja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhja extends C1251oq {

    /* renamed from: b */
    final /* synthetic */ CheckableImageButton f118780b;

    public bhja(CheckableImageButton checkableImageButton) {
        this.f118780b = checkableImageButton;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        qmVar.mo15758a(this.f118780b.f151201b);
        qmVar.mo15763b(this.f118780b.f151200a);
    }

    /* renamed from: d */
    public final void mo350d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo350d(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f118780b.f151200a);
    }
}
