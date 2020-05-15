package p000;

import android.content.Context;

/* renamed from: aszt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aszt {

    /* renamed from: a */
    private static final long f89924a = asjj.f89070b;

    /* renamed from: b */
    private final Context f89925b;

    public aszt(Context context) {
        this.f89925b = context;
    }

    /* renamed from: a */
    public final boolean mo49721a(long j) {
        if (!asjk.m74228b(this.f89925b)) {
            if (mo49722b(j)) {
                asjj.m74222b(this.f89925b);
            } else {
                asjj.m74224d(this.f89925b);
            }
            return false;
        }
        try {
            atak.m75290b("google_pay_keyguard_fuse_key");
        } catch (ataf e) {
            aszy.m75267a();
            return true;
        } catch (atag e2) {
            if (mo49722b(j)) {
                aszy.m75269b();
                aszy.m75267a();
            } else {
                asjj.m74224d(this.f89925b);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo49722b(long j) {
        long f = new atkm(this.f89925b).mo50020f();
        return f >= 0 && f + f89924a > j;
    }
}
