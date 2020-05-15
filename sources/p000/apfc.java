package p000;

import android.content.Context;
import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;

/* renamed from: apfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apfc {

    /* renamed from: a */
    public final Context f84288a;

    /* renamed from: b */
    private final C1102je f84289b;

    /* renamed from: c */
    private final sey f84290c;

    /* renamed from: d */
    private final int f84291d;

    /* renamed from: e */
    private final int f84292e;

    /* renamed from: f */
    private final int f84293f;

    public apfc(Context context, int i) {
        this.f84288a = context;
        this.f84291d = i;
        this.f84290c = sey.m35126a(context.getApplicationContext());
        this.f84289b = new C1102je(context);
        this.f84292e = m70134a(context, (int) C0126R.C0127drawable.quantum_ic_cloud_download_white_24);
        this.f84293f = m70134a(context, (int) C0126R.C0127drawable.quantum_ic_cloud_done_white_24);
    }

    /* renamed from: a */
    static int m70134a(Context context, int i) {
        try {
            return qkj.m32287a(context, i);
        } catch (Resources.NotFoundException e) {
            aoyj.m69819a().mo46996a("Cannot find resource id for notification icon");
            return 17301628;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47151b() {
        m70135a(false);
    }

    /* renamed from: a */
    private final void m70135a(boolean z) {
        mo47149a(!z ? this.f84292e : this.f84293f, 0, 0, !z ? this.f84288a.getString(C0126R.string.common_something_went_wrong) : this.f84288a.getString(C0126R.string.romanesco_contacts_restore_success), true, false);
    }

    /* renamed from: a */
    public final void mo47148a() {
        m70135a(true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: je.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      je.a(int, java.lang.CharSequence, android.app.PendingIntent):void
      je.a(int, int, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47149a(int i, int i2, int i3, String str, boolean z, boolean z2) {
        C1102je jeVar = this.f84289b;
        jeVar.mo13617a(i2, i3, false);
        jeVar.mo13640e(this.f84288a.getString(C0126R.string.romanesco_contacts_restore_title));
        jeVar.mo13632b(str);
        jeVar.mo13630b(i);
        jeVar.mo13627a(z);
        jeVar.mo13633b(z2);
        jeVar.f22269u = "progress";
        this.f84290c.mo25459a("romanesco:contacts_restore", this.f84291d, this.f84289b.mo13629b());
    }

    /* renamed from: a */
    public final void mo47150a(int i, String str) {
        mo47149a(this.f84292e, 500, i, str, false, true);
    }
}
