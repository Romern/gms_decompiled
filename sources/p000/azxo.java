package p000;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: azxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azxo implements TypeEvaluator {

    /* renamed from: a */
    private final Rect f100178a;

    public azxo(Rect rect) {
        this.f100178a = rect;
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        this.f100178a.set(rect.left + ((int) (((float) (rect2.left - rect.left)) * f)), rect.top + ((int) (((float) (rect2.top - rect.top)) * f)), rect.right + ((int) (((float) (rect2.right - rect.right)) * f)), rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f)));
        return this.f100178a;
    }
}
