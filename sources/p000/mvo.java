package p000;

import android.content.Context;

/* renamed from: mvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mvo extends mvp {

    /* renamed from: g */
    private final int f34812g;

    /* renamed from: h */
    private final Object[] f34813h;

    public mvo(int i, Object... objArr) {
        this.f34812g = i;
        this.f34813h = objArr;
    }

    /* renamed from: a */
    public final String mo20275a(Context context) {
        return context.getResources().getString(this.f34812g, this.f34813h);
    }
}
