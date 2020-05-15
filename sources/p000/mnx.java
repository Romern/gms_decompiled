package p000;

import android.content.Context;
import com.google.android.gms.backup.RestoreData;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: mnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mnx extends aaab {

    /* renamed from: a */
    private static final lvn f34067a = new lvn("GetRestoreDataOperation");

    /* renamed from: b */
    private final String f34068b;

    /* renamed from: c */
    private final lvt f34069c = lvt.f33072a;

    /* renamed from: d */
    private final mot f34070d;

    public mnx(mot mot, String str) {
        super(181, "GetRestoreData");
        this.f34070d = mot;
        this.f34068b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        lyg lyg;
        long j;
        if (this.f34068b != null) {
            if (ccly.m130639b()) {
                lyg = new lxu(context);
            } else {
                lyg = new lye(context);
            }
            if (!ccls.m130526e() || bmxx.m108577a(this.f34069c.mo19679f(context))) {
                j = new lvp(context).mo19639a("--");
            } else {
                try {
                    j = Long.parseLong(this.f34069c.mo19679f(context));
                } catch (NullPointerException | NumberFormatException e) {
                    f34067a.mo25418e("AncestorId read from G1Settings is not parseable, falling back to reading from BackupManager", new Object[0]);
                    j = new lvp(context).mo19639a("--");
                }
            }
            if (j == 0 || j == 1) {
                if (ccls.m130539r()) {
                    j = spn.m35843a(context);
                } else {
                    f34067a.mo25416d("No ancestor Id", new Object[0]);
                    throw new aaaj(13, "Device was not restored");
                }
            }
            try {
                bxvd da = bzol.f170830c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bzol) da.f164949b).f170833b = j;
                bxvd a = lyf.m24647a(context);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzoa bzoa = (bzoa) a.mo74062i();
                bzoa.getClass();
                ((bzol) da.f164949b).f170832a = bzoa;
                bzob a2 = lyg.mo19735a((bzol) da.mo74062i());
                mot mot = this.f34070d;
                Status status = Status.f30107a;
                bxyk bxyk = a2.f170791b;
                if (bxyk == null) {
                    bxyk = bxyk.f165095c;
                }
                mot.mo20220a(status, new RestoreData(bxzt.m124578a(bxyk), a2.f170792c));
            } catch (chuw | IOException | mbf e2) {
                throw new aaaj(7, "Error getting restore data", null, e2);
            } catch (gid | mbb | mbh e3) {
                throw new aaaj(5, "Error getting auth token for account", null, e3);
            }
        } else {
            throw new aaaj(5, "accountName cannot be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f34070d.mo20220a(status, (RestoreData) null);
    }
}
