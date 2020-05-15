package p000;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhom extends bhpl {

    /* renamed from: b */
    final /* synthetic */ bhou f119199b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhom(bhou bhou, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f119199b = bhou;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        qmVar.mo15755a((CharSequence) Spinner.class.getName());
        int i = Build.VERSION.SDK_INT;
        if (qmVar.f26877a.isShowingHintText()) {
            qmVar.mo15770d((CharSequence) null);
        }
    }

    /* renamed from: c */
    public final void mo349c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo349c(view, accessibilityEvent);
        bhou bhou = this.f119199b;
        EditText editText = bhou.f119220k.f151297a;
        int i = bhou.f119208j;
        AutoCompleteTextView a = bhou.mo64096a(editText);
        if (accessibilityEvent.getEventType() == 1 && this.f119199b.f119216h.isTouchExplorationEnabled()) {
            this.f119199b.mo64097a(a);
        }
    }
}
