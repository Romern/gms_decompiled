package p000;

import android.os.Build;
import android.os.UserHandle;
import java.util.Iterator;

/* renamed from: iuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iuz implements bqfp {

    /* renamed from: a */
    final /* synthetic */ ivb f21842a;

    public iuz(ivb ivb) {
        this.f21842a = ivb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        int i;
        int i2;
        int i3;
        ivn ivn = (ivn) obj;
        for (iva iva : this.f21842a.f21852g) {
            ivb ivb = this.f21842a;
            boolean z = ivn.f21873b;
            boolean z2 = ivn.f21874c;
            int i4 = 1;
            if (ccfm.f178870a.mo6606a().mo75862d()) {
                int i5 = Build.VERSION.SDK_INT;
                int i6 = Build.VERSION.SDK_INT;
                Iterator<UserHandle> it = ivb.f21850e.getUserProfiles().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ivb.f21845h.mo25416d("Current user is neither primary user nor their managed profile; unlock  is not allowed.", new Object[0]);
                        ivb.f21851f.mo13371b(2);
                        i4 = 3;
                        break;
                    } else if (it.next().isSystem()) {
                        ivb.f21849d.mo26041b();
                        boolean a = ivb.f21849d.mo26040a(0);
                        ivb.f21849d.mo26043c();
                        if (a) {
                            ivb.f21851f.mo13371b(0);
                        } else {
                            ivb.f21845h.mo25416d("Current user is primary user or their managed profile, but it is in background; unlock is not allowed.", new Object[0]);
                            ivb.f21851f.mo13371b(1);
                            i4 = 4;
                        }
                    }
                }
                int i7 = Build.VERSION.SDK_INT;
                if (ivb.f21846a.isKeyguardSecure()) {
                    i = 11;
                } else {
                    i = 10;
                }
                if (!ivn.f21872a) {
                    i2 = z ? 20 : 21;
                } else {
                    i2 = 22;
                }
                iva.mo13345a(new ivf(i4, i, i2));
            }
            ivu ivu = ivb.f21847b;
            synchronized (ivu.f21892d) {
                i3 = ivu.f21895g;
                if (i3 == 0) {
                    if (!ivu.f21890b.inKeyguardRestrictedInputMode()) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                }
            }
            if (i3 == 2) {
                i4 = 0;
            } else if (z2) {
                i4 = 0;
            }
            int i72 = Build.VERSION.SDK_INT;
            if (ivb.f21846a.isKeyguardSecure()) {
            }
            if (!ivn.f21872a) {
            }
            iva.mo13345a(new ivf(i4, i, i2));
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
    }
}
