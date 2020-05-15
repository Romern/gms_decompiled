package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: akqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akqm implements cijl {

    /* renamed from: a */
    public final cijl f72453a;

    /* renamed from: b */
    RectF f72454b;

    /* renamed from: c */
    public Rect f72455c;

    public akqm(cijl cijl) {
        this.f72453a = cijl;
    }

    /* renamed from: a */
    public static int[] m60254a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: b */
    public final Rect mo6445a() {
        sdo.m34959a(this.f72455c);
        return new Rect(this.f72455c);
    }
}
