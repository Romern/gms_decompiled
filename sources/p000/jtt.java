package p000;

import android.accounts.Account;
import java.io.Closeable;
import java.util.List;
import java.util.Map;

/* renamed from: jtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface jtt extends Closeable {
    /* renamed from: a */
    Map mo14081a();

    /* renamed from: a */
    jrn mo14082a(Account account);

    /* renamed from: a */
    boolean mo14083a(Account account, List list);

    /* renamed from: a */
    boolean mo14084a(Account account, jrn jrn);

    /* renamed from: b */
    boolean mo14085b();

    /* renamed from: b */
    boolean mo14086b(Account account);

    void close();
}
