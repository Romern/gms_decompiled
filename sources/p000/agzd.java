package p000;

import java.text.SimpleDateFormat;

/* renamed from: agzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agzd extends ThreadLocal {

    /* renamed from: a */
    final /* synthetic */ String f66900a;

    public agzd(String str) {
        this.f66900a = str;
    }

    public final /* bridge */ /* synthetic */ Object initialValue() {
        return new SimpleDateFormat(this.f66900a);
    }
}
