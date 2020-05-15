package p000;

import android.accounts.Account;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: lig */
final /* synthetic */ class lig implements Callable {

    /* renamed from: a */
    private final lij f26147a;

    /* renamed from: b */
    private final String f26148b;

    /* renamed from: c */
    private final Account f26149c;

    public lig(lij lij, String str, Account account) {
        this.f26147a = lij;
        this.f26148b = str;
        this.f26149c = account;
    }

    public final Object call() {
        InputStream b;
        lij lij = this.f26147a;
        try {
            b = lij.f26155a.mo15159b(lij.f26156b, new lie(this.f26148b, "package_name", this.f26149c));
            bxxb aR = lij.f26157c.f26154a.mo73646aR();
            aR.mo73634b(b);
            bmxv b2 = bmxv.m108566b(aR.mo74062i());
            if (b == null) {
                return b2;
            }
            b.close();
            return b2;
        } catch (FileNotFoundException e) {
            return bmvz.f131120a;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
