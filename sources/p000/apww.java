package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;
import java.util.List;

/* renamed from: apww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apww extends svk {

    /* renamed from: a */
    public final Context f85031a;

    /* renamed from: b */
    public final apwr f85032b;

    /* renamed from: c */
    public CharSequence f85033c;

    /* renamed from: l */
    public List f85034l;

    /* renamed from: m */
    public boolean f85035m;

    public apww(Context context, apwr apwr) {
        super(context);
        this.f85031a = context;
        this.f85032b = apwr;
    }

    /* renamed from: a */
    public final int mo23821a() {
        return C0126R.C0128layout.scanned_apps_settings_item;
    }

    /* renamed from: b */
    public final svb mo23822b() {
        return apws.f85023a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apww) {
            apww apww = (apww) obj;
            return this.f45210e == apww.f45210e && sdg.m34949a(this.f45211f, apww.f45211f) && sdg.m34949a(this.f85033c, apww.f85033c);
        }
    }

    /* renamed from: g */
    public final CharSequence mo26161g() {
        return this.f85033c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f85033c, Integer.valueOf(this.f45210e), this.f45211f});
    }

    /* renamed from: a */
    public final void mo26084a(int i) {
        super.mo26084a(i);
        mo26164i();
    }

    /* renamed from: b */
    public final void mo26086b(int i) {
        super.mo26086b(i);
        mo26164i();
    }

    /* renamed from: a */
    public final void mo26085a(CharSequence charSequence) {
        super.mo26085a(charSequence);
        mo26164i();
    }

    /* renamed from: b */
    public final void mo26105b(CharSequence charSequence) {
        this.f85033c = charSequence;
        mo26164i();
    }
}
