package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: bhlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhlu implements bhlk {

    /* renamed from: a */
    private final float f119015a;

    public bhlu(float f) {
        this.f119015a = f;
    }

    /* renamed from: a */
    public final float mo63930a(RectF rectF) {
        return this.f119015a * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bhlu) && this.f119015a == ((bhlu) obj).f119015a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f119015a)});
    }
}
