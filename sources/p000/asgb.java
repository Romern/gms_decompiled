package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: asgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class asgb {

    /* renamed from: a */
    protected final String f88889a;

    /* renamed from: b */
    protected Matcher f88890b = null;

    public asgb(String str) {
        this.f88889a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo49143a(String str) {
        this.f88890b = Pattern.compile(this.f88889a).matcher(str);
    }

    /* renamed from: b */
    public String mo49145b(String str) {
        throw null;
    }

    /* renamed from: c */
    public final void mo49146c(String str) {
        Matcher matcher = this.f88890b;
        if (matcher != null) {
            matcher.reset(str);
        } else {
            mo49143a(str);
        }
    }

    /* renamed from: a */
    public final boolean mo49144a() {
        return this.f88890b.matches();
    }
}
