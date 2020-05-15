package p000;

import android.view.View;

/* renamed from: bjkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjkz extends bjkx implements View.OnClickListener {
    public bjkz(bjky bjky) {
        super(bjky);
        this.f122908b = this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65345a(View view, Object obj) {
        View.OnClickListener onClickListener = (View.OnClickListener) obj;
        view.setOnClickListener(onClickListener);
        view.setClickable(onClickListener != null);
    }

    public void onClick(View view) {
        for (View.OnClickListener onClickListener : mo65347a()) {
            onClickListener.onClick(view);
        }
    }
}
