package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* renamed from: fps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fps extends qlf {
    /* renamed from: c */
    private final void m12140c() {
        for (String str : mo7151a()) {
            m12138a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7150a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String[] mo7151a();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    private final void m12138a(String str) {
        try {
            spn.m35856a(getBaseContext(), str, true);
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            Log.e("CoreUiInitIntntOp", valueOf.length() == 0 ? new String("Component invalid: ") : "Component invalid: ".concat(valueOf), e);
        }
    }

    /* renamed from: b */
    private final void m12139b() {
        Context baseContext = getBaseContext();
        if (soz.m35807f(baseContext)) {
            Log.i("CoreUiInitIntntOp", "Disabling Google Settings Activity for this profile.");
            mo7150a(baseContext);
        }
    }

    /* renamed from: b */
    public final void mo6536b(Intent intent, boolean z) {
        m12140c();
        m12139b();
    }

    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        m12139b();
    }

    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        m12140c();
        int i = Build.VERSION.SDK_INT;
        sre.m36087g(getBaseContext());
        m12138a("com.google.android.gms.app.search.GmsSearchIndexablesProvider");
        m12139b();
    }
}
