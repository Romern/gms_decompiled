package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abeu extends aaru {

    /* renamed from: e */
    public abey f57310e;

    /* renamed from: f */
    private final Context f57311f;

    /* renamed from: g */
    private final HelpConfig f57312g;

    /* renamed from: h */
    private final aaxx f57313h;

    /* renamed from: i */
    private final String f57314i;

    public abeu(aasf aasf, aate aate, String str) {
        super(aate);
        this.f57311f = (Context) aasf;
        this.f57312g = aasf.mo18626g();
        this.f57313h = aasf.mo18628i();
        this.f57314i = str;
    }

    /* renamed from: b */
    public final boolean mo31663b() {
        return !TextUtils.isEmpty(this.f57314i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.f57311f;
        abey a = abez.m47601a(helpChimeraActivity.getApplicationContext(), this.f57312g, helpChimeraActivity.f78958e, ((HelpChimeraActivity) this.f57311f).f56987z, this.f57314i);
        if (!a.mo32061e()) {
            a.mo32057a(this.f57313h.mo31884a(a.mo32059c(), this.f57312g.f78827b));
        }
        this.f57310e = a;
        return a;
    }
}
