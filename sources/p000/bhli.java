package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: bhli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhli implements bhlk {

    /* renamed from: a */
    private final float f118962a;

    public bhli(float f) {
        this.f118962a = f;
    }

    /* renamed from: a */
    public final float mo63930a(RectF rectF) {
        return this.f118962a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bhli) && this.f118962a == ((bhli) obj).f118962a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f118962a)});
    }
}
