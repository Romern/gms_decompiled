package p000;

import android.os.Bundle;
import com.google.android.gms.nearby.sharing.TextAttachment;

/* renamed from: ajtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajtz {

    /* renamed from: a */
    public int f71281a = 0;

    /* renamed from: b */
    private final String f71282b;

    /* renamed from: c */
    private final int f71283c;

    public ajtz(String str) {
        this.f71282b = str;
        this.f71283c = str.getBytes().length;
    }

    /* renamed from: a */
    public final TextAttachment mo38913a() {
        return new TextAttachment(this.f71282b, this.f71281a, (long) this.f71283c, new Bundle());
    }
}
