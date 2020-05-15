package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: baib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baib implements Callable {

    /* renamed from: a */
    private final bafj f100930a;

    /* renamed from: b */
    private final Account f100931b;

    /* renamed from: c */
    private final int f100932c;

    /* renamed from: d */
    private final int f100933d;

    /* renamed from: e */
    private final babr f100934e;

    /* renamed from: f */
    private final cayo f100935f;

    /* renamed from: g */
    private final badj f100936g;

    /* renamed from: h */
    private final baok f100937h;

    /* renamed from: i */
    private final String f100938i;

    public baib(babr babr, cayo cayo, bafj bafj, baok baok, String str, Account account, int i, int i2, badj badj) {
        this.f100930a = bafj;
        this.f100931b = account;
        this.f100932c = i;
        this.f100933d = i2;
        this.f100934e = babr;
        this.f100935f = cayo;
        this.f100937h = baok;
        this.f100938i = str;
        this.f100936g = badj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0142  */
    /* renamed from: a */
    public final List call() {
        banx a;
        ((achw) this.f100935f.mo16713a()).mo25409a("Reading latest footprint from %s/%s.", Integer.valueOf(this.f100932c), Integer.valueOf(this.f100933d));
        bafl bafl = null;
        try {
            bafl = this.f100930a.mo55662a(this.f100931b, this.f100932c, this.f100933d);
            try {
                baog b = this.f100937h.mo55832b(this.f100938i, this.f100931b, bafi.m86741a(this.f100932c, this.f100933d, byhm.SYNC_LATEST_PER_SECONDARY_ID));
                if (b == null) {
                    ((achw) this.f100935f.mo16713a()).mo25416d("%s is not subscribed to corpus=%d, datatype=%d, returning empty list.", this.f100938i, Integer.valueOf(this.f100932c), Integer.valueOf(this.f100933d));
                    List emptyList = Collections.emptyList();
                    if (bafl != null) {
                        bafl.close();
                    }
                    return emptyList;
                }
                if (this.f100934e.mo32678J()) {
                    this.f100937h.mo55828a(b.mo55814a(), b.mo55815b(), b.mo55816c());
                }
                badj a2 = bafi.m86736a(b.mo55818e());
                if (badj.f100527a.equals(a2)) {
                    ((achw) this.f100935f.mo16713a()).mo25414c("%s subscription filter for corpus=%d, datatype=%d is NONE, returning empty list.", this.f100938i, Integer.valueOf(this.f100932c), Integer.valueOf(this.f100933d));
                    List emptyList2 = Collections.emptyList();
                    if (bafl != null) {
                        bafl.close();
                    }
                    return emptyList2;
                }
                a = bafl.mo55677c().mo55798a();
                bngs j = bngx.m109377j();
                for (badk badk : bafl.mo55667a(a, this.f100936g, this.f100938i)) {
                    if (badk.mo55613b() == null || a2.mo55647a(badk.mo55613b())) {
                        j.mo67668c(badk);
                    }
                }
                bngx a3 = j.mo67664a();
                a.close();
                if (bafl != null) {
                    bafl.close();
                }
                return a3;
            } catch (IOException e) {
                e = e;
                try {
                    throw new azzp(3, String.format(Locale.ENGLISH, "Failed to read footprint from %s/%s.", Integer.valueOf(this.f100932c), Integer.valueOf(this.f100933d)), e);
                } catch (Throwable th) {
                    th = th;
                    if (bafl != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (bafl != null) {
                    bafl.close();
                }
                throw th;
            }
            throw th;
        } catch (IOException e2) {
            e = e2;
            throw new azzp(3, String.format(Locale.ENGLISH, "Failed to read footprint from %s/%s.", Integer.valueOf(this.f100932c), Integer.valueOf(this.f100933d)), e);
        } catch (Throwable th3) {
            th = th3;
            if (bafl != null) {
            }
            throw th;
        }
    }
}
