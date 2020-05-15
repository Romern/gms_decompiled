package p000;

import android.accounts.Account;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* renamed from: lih */
final /* synthetic */ class lih implements Callable {

    /* renamed from: a */
    private final lij f26150a;

    /* renamed from: b */
    private final String f26151b;

    /* renamed from: c */
    private final Account f26152c;

    /* renamed from: d */
    private final Object f26153d;

    public lih(lij lij, String str, Account account, Object obj) {
        this.f26150a = lij;
        this.f26151b = str;
        this.f26152c = account;
        this.f26153d = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, bxxc], assign insn: 0x0006: IGET  (r3v0 ? I:java.lang.Object) = (r7v0 'this' lih A[THIS]) lih.d java.lang.Object */
    public final Object call() {
        lij lij = this.f26150a;
        String str = this.f26151b;
        Account account = this.f26152c;
        ? r3 = this.f26153d;
        OutputStream a = lij.f26155a.mo15158a(lij.f26156b, new lie(str, "package_name", account));
        try {
            r3.mo73638a(a);
            if (a == null) {
                return null;
            }
            a.close();
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
