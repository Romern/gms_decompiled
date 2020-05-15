package p000;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: aevz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aevz {

    /* renamed from: a */
    private final aevy f63928a;

    /* renamed from: d */
    public final Object f63929d;

    public aevz(Object obj, aevy aevy) {
        this.f63929d = obj;
        this.f63928a = aevy;
    }

    /* renamed from: a */
    public final void mo34620a() {
        aevy aevy = this.f63928a;
        if (aevy != null) {
            aevy.mo34619a(this.f63929d);
        }
    }

    /* renamed from: a */
    public abstract void mo34615a(Context context, TextView textView, ImageView imageView);
}
