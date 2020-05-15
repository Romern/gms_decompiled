package p000;

import android.widget.Button;
import java.util.Calendar;

/* renamed from: wim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wim {

    /* renamed from: a */
    final /* synthetic */ Button f50738a;

    /* renamed from: b */
    final /* synthetic */ wir f50739b;

    public wim(wir wir, Button button) {
        this.f50739b = wir;
        this.f50738a = button;
    }

    /* renamed from: a */
    public final void mo29127a(Calendar calendar) {
        Button button = this.f50738a;
        boolean z = false;
        if (calendar != null && wir.m41971a(calendar) >= 0 && wir.m41971a(calendar) <= 130) {
            z = true;
        }
        button.setEnabled(z);
        this.f50739b.f50744b = calendar;
    }
}
