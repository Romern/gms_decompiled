package p000;

import android.accounts.Account;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: bdxt */
public final /* synthetic */ class bdxt implements Callable {

    /* renamed from: a */
    private final bdxv f106606a;

    /* renamed from: b */
    private final Account f106607b;

    /* renamed from: c */
    private final File f106608c;

    public bdxt(bdxv bdxv, Account account, File file) {
        this.f106606a = bdxv;
        this.f106607b = account;
        this.f106608c = file;
    }

    public final Object call() {
        return this.f106606a.mo58430a(this.f106607b, this.f106608c);
    }
}
