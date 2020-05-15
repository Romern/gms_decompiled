package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

/* renamed from: bhls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhls {
    /* renamed from: a */
    static bhll m101139a() {
        return new bhlv();
    }

    /* renamed from: b */
    static bhln m101144b() {
        return new bhln();
    }

    /* renamed from: a */
    static bhll m101140a(int i) {
        if (i == 0) {
            return new bhlv();
        }
        if (i != 1) {
            return m101139a();
        }
        return new bhlm();
    }

    /* renamed from: a */
    public static void m101141a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof bhlr) {
            m101143a(view, (bhlr) background);
        }
    }

    /* renamed from: a */
    public static void m101142a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof bhlr) {
            ((bhlr) background).mo63949d(f);
        }
    }

    /* renamed from: a */
    public static void m101143a(View view, bhlr bhlr) {
        bhid bhid = bhlr.f119007s.f118969b;
        if (bhid != null && bhid.f118699a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += C1280ps.m19933o((View) parent);
            }
            bhlq bhlq = bhlr.f119007s;
            if (bhlq.f118981n != f) {
                bhlq.f118981n = f;
                bhlr.mo63960m();
            }
        }
    }
}
