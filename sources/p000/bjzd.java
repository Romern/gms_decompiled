package p000;

import android.text.method.NumberKeyListener;

/* renamed from: bjzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjzd extends NumberKeyListener {

    /* renamed from: a */
    private final char[] f123664a;

    /* renamed from: b */
    private final int f123665b;

    public bjzd(String str, int i) {
        this.f123664a = new char[str.length()];
        str.getChars(0, str.length(), this.f123664a, 0);
        this.f123665b = i;
    }

    public final char[] getAcceptedChars() {
        return this.f123664a;
    }

    public final int getInputType() {
        return this.f123665b;
    }
}
