package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: qi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1297qi extends ClickableSpan {

    /* renamed from: a */
    private final int f26857a;

    /* renamed from: b */
    private final C1301qm f26858b;

    /* renamed from: c */
    private final int f26859c;

    public C1297qi(int i, C1301qm qmVar, int i2) {
        this.f26857a = i;
        this.f26858b = qmVar;
        this.f26859c = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f26857a);
        C1301qm qmVar = this.f26858b;
        int i = this.f26859c;
        int i2 = Build.VERSION.SDK_INT;
        qmVar.f26877a.performAction(i, bundle);
    }
}
