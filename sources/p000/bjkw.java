package p000;

import android.view.View;

/* renamed from: bjkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjkw extends bjkx implements View.OnFocusChangeListener {
    public bjkw(bjky bjky) {
        super(bjky);
        this.f122908b = this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65345a(View view, Object obj) {
        view.setOnFocusChangeListener((View.OnFocusChangeListener) obj);
    }

    public final void onFocusChange(View view, boolean z) {
        for (View.OnFocusChangeListener onFocusChangeListener : mo65347a()) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
