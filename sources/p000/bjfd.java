package p000;

import android.content.Intent;

/* renamed from: bjfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfd {

    /* renamed from: a */
    public final Intent f122613a;

    public bjfd(Intent intent) {
        this.f122613a = intent;
        intent.setExtrasClassLoader(bjfd.class.getClassLoader());
    }

    /* renamed from: a */
    public static Intent m103295a(int i) {
        Intent intent = new Intent();
        intent.putExtra("status", i);
        return intent;
    }

    /* renamed from: b */
    public static Intent m103296b(int i) {
        Intent a = m103295a(2);
        a.putExtra("extraErrorCode", i);
        return a;
    }

    /* renamed from: a */
    public final int mo65080a() {
        return this.f122613a.getIntExtra("status", 0);
    }

    /* renamed from: b */
    public final int mo65081b() {
        return this.f122613a.getIntExtra("extraErrorCode", -1);
    }
}
