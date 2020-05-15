package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bacd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bacd implements babt {

    /* renamed from: a */
    public final cayo f100462a;

    /* renamed from: b */
    public final cayo f100463b;

    /* renamed from: c */
    private final Executor f100464c;

    /* renamed from: d */
    private final Context f100465d;

    public bacd(Executor executor, cayo cayo, Context context, cayo cayo2) {
        this.f100464c = executor;
        this.f100462a = cayo;
        this.f100465d = context;
        this.f100463b = cayo2;
    }

    /* renamed from: a */
    public final bqgg mo55566a(Account account, List list) {
        bqgg bqgg;
        bxvd da = bpxw.f139795c.mo74144da();
        String valueOf = String.valueOf(bmxr.m108543a(' ').mo66874a((Iterable) list));
        String str = valueOf.length() == 0 ? new String("oauth2:https://www.googleapis.com/auth/mdh ") : "oauth2:https://www.googleapis.com/auth/mdh ".concat(valueOf);
        try {
            bqgg = bqga.m112775a(gik.m13216d(this.f100465d, account, str));
        } catch (UserRecoverableAuthException e) {
            bqgg = bqga.m112777a((Throwable) new badu(e));
        } catch (gid e2) {
            bqgg = bqga.m112777a((Throwable) new badt(e2));
        } catch (IOException e3) {
            bqgg = bqga.m112777a((Throwable) e3);
        }
        return bqdf.m112620a(bqdx.m112673a(bqgg, new bacb(this, da), this.f100464c), Exception.class, new bacc(this, da, str), this.f100464c);
    }

    /* renamed from: b */
    public final chqm mo55568b(String str) {
        return chvq.m149647a(new bllh(new blld(str)));
    }

    /* renamed from: a */
    public final bqgg mo55567a(String str) {
        try {
            gik.m13217e(this.f100465d, str);
            return bqga.m112775a((Object) null);
        } catch (UserRecoverableAuthException e) {
            return bqga.m112777a((Throwable) new badu(e));
        } catch (gid e2) {
            return bqga.m112777a((Throwable) new badt(e2));
        } catch (IOException e3) {
            return bqga.m112777a((Throwable) e3);
        }
    }
}
