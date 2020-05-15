package p000;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: bhop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhop implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ AutoCompleteTextView f119202a;

    /* renamed from: b */
    final /* synthetic */ bhou f119203b;

    public bhop(bhou bhou, AutoCompleteTextView autoCompleteTextView) {
        this.f119203b = bhou;
        this.f119202a = autoCompleteTextView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f119203b.mo64101c()) {
                this.f119203b.f119211c = false;
            }
            this.f119203b.mo64097a(this.f119202a);
        }
        return false;
    }
}
