package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* renamed from: anui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anui {

    /* renamed from: a */
    public int f77744a = 2;

    /* renamed from: b */
    public Intent f77745b;

    /* renamed from: c */
    private final Context f77746c;

    /* renamed from: d */
    private final ClientContext f77747d;

    /* renamed from: e */
    private boolean f77748e = false;

    public anui(Context context, ClientContext clientContext) {
        this.f77746c = context;
        this.f77747d = clientContext;
    }

    /* renamed from: a */
    public final Intent mo42290a() {
        PendingIntent pendingIntent;
        String str;
        anug anug = new anug();
        anug.f77735a = this.f77744a;
        Context context = this.f77746c;
        Intent intent = this.f77745b;
        String str2 = null;
        if (intent != null) {
            pendingIntent = spn.m35844a(context, intent, 134217728);
        } else {
            pendingIntent = null;
        }
        anug.f77736b = pendingIntent;
        if (this.f77747d.mo17811f()) {
            str = this.f77747d.mo17812g();
        } else {
            str = null;
        }
        anug.f77737c = str;
        if (!this.f77748e) {
            str2 = this.f77747d.mo17802b();
        }
        anug.f77738d = str2;
        anug.f77739e = this.f77747d.mo17809e();
        ClientContext clientContext = this.f77747d;
        anug.f77740f = clientContext.f30215e;
        anug.f77741g = clientContext.f30216f;
        anug.f77742h = clientContext.mo17813h();
        anug.f77743i = this.f77747d.f30219i;
        Bundle bundle = new Bundle();
        if (anug.f77735a == 2 && !anuh.m65338a(anug.f77739e)) {
            anug.f77735a = 0;
        }
        anuh.m65337a(bundle, anug.f77738d, anug.f77740f, anug.f77741g, anug.f77735a, anug.f77737c, anug.f77742h, anug.f77736b);
        Bundle bundle2 = anug.f77743i;
        if (bundle2 != null) {
            PlusCommonExtras.m68419b(bundle2).mo46574a(bundle);
        }
        Intent intent2 = new Intent("com.google.android.gms.plus.action.SIGN_UP");
        intent2.putExtras(bundle);
        return intent2;
    }

    /* renamed from: b */
    public final void mo42291b() {
        this.f77748e = true;
    }
}
