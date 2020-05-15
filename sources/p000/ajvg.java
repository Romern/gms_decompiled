package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.util.Random;

/* renamed from: ajvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajvg {

    /* renamed from: a */
    public int f71350a = m59094a();

    /* renamed from: b */
    public int f71351b = m59094a();

    /* renamed from: c */
    private ahfx f71352c;

    /* renamed from: d */
    private final int f71353d = m59094a();

    /* renamed from: a */
    public static int m59094a() {
        return new Random().nextInt(2147483646) + 1;
    }

    /* renamed from: a */
    private final void m59095a(ajvc ajvc, int i) {
        ahfx ahfx = this.f71352c;
        if (ahfx != null) {
            bvgd bvgd = ajvc.f71346a;
            int a = bvjj.m121175a(bvgd.f155965b);
            if (a == 0) {
                a = 1;
            }
            ahfx.mo36412a(bvgd, a - 1, i);
        }
    }

    /* renamed from: a */
    public final void mo38956a(ajuz ajuz) {
        m59095a(ajuz, this.f71351b);
    }

    /* renamed from: a */
    public final void mo38957a(ajva ajva) {
        m59095a(ajva, this.f71350a);
    }

    /* renamed from: a */
    public final void mo38958a(ajvb ajvb) {
        m59095a(ajvb, this.f71353d);
    }

    /* renamed from: a */
    public final void mo38959a(Context context, Account account) {
        if (account == null || TextUtils.isEmpty(account.name)) {
            this.f71352c = null;
            return;
        }
        String str = account.name;
        Boolean bool = (Boolean) ahhf.m55773a("isAppActivityEnabled", ahhf.m55772a(ajvy.m59121a(context).mo58362b(account).mo58355a(4), cfov.m142058k()), cfov.m142058k());
        if (bool == null || !bool.booleanValue()) {
            srn srn = ajvp.f71371a;
            this.f71352c = null;
            return;
        }
        ahfx ahfx = this.f71352c;
        if (ahfx == null || !str.equals(ahfx.f67129a.f42342i)) {
            this.f71352c = new ahfx(5, ajvf.f71349a, str);
        }
    }
}
