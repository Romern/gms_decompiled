package p000;

import android.accounts.Account;
import android.database.SQLException;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: bdxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdxv {

    /* renamed from: a */
    public final Executor f106609a;

    public bdxv(Executor executor) {
        this.f106609a = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bdxs mo58430a(Account account, File file) {
        try {
            bdxs bdxs = new bdxs(bdwd.m91505a(file, new bdxu()), this.f106609a);
            bdwa.m91503a(bdxs.f106604a, account, new bdxp(bdxs));
            return bdxs;
        } catch (SQLException e) {
            throw new bdvx(e);
        }
    }
}
