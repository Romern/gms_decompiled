package p000;

import android.text.TextUtils;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfz implements adc {

    /* renamed from: a */
    public final HelpChimeraActivity f57382a;

    /* renamed from: b */
    public CharSequence f57383b = "";

    /* renamed from: c */
    private final aatc f57384c;

    public abfz(HelpChimeraActivity helpChimeraActivity) {
        this.f57382a = helpChimeraActivity;
        this.f57384c = helpChimeraActivity.f78966m;
    }

    /* renamed from: a */
    public final abfx mo32076a() {
        return this.f57382a.f78977x;
    }

    /* renamed from: b */
    public final void mo418b(String str) {
    }

    /* renamed from: a */
    public final void mo32077a(CharSequence charSequence, boolean z) {
        this.f57383b = charSequence;
        mo32076a().mo32072a(charSequence, z);
    }

    /* renamed from: a */
    public final boolean mo417a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        this.f57382a.mo43349e(str);
        new abhe(this.f57384c, new abfo(str)).start();
        return true;
    }
}
