package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: baie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baie implements Callable {

    /* renamed from: a */
    private final bafj f100947a;

    /* renamed from: b */
    private final Account f100948b;

    /* renamed from: c */
    private final int f100949c;

    /* renamed from: d */
    private final int f100950d;

    /* renamed from: e */
    private final babr f100951e;

    /* renamed from: f */
    private final cayo f100952f;

    /* renamed from: g */
    private final badj f100953g;

    /* renamed from: h */
    private final baok f100954h;

    /* renamed from: i */
    private final String f100955i;

    public baie(babr babr, cayo cayo, bafj bafj, baok baok, String str, Account account, int i, int i2, badj badj) {
        this.f100947a = bafj;
        this.f100948b = account;
        this.f100949c = i;
        this.f100950d = i2;
        this.f100951e = babr;
        this.f100952f = cayo;
        this.f100954h = baok;
        this.f100955i = str;
        this.f100953g = badj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0130  */
    /* renamed from: a */
    public final badl call() {
        bany b;
        ((achw) this.f100952f.mo16713a()).mo25409a("Reading latest footprint from %s/%s.", Integer.valueOf(this.f100949c), Integer.valueOf(this.f100950d));
        bafl bafl = null;
        try {
            bafl = this.f100947a.mo55662a(this.f100948b, this.f100949c, this.f100950d);
            try {
                baog b2 = this.f100954h.mo55832b(this.f100955i, this.f100948b, bafi.m86741a(this.f100949c, this.f100950d, byhm.SYNC_LATEST_PER_SECONDARY_ID));
                if (b2 == null) {
                    ((achw) this.f100952f.mo16713a()).mo25416d("%s is not subscribed to corpus=%d, datatype=%d, returning empty result.", this.f100955i, Integer.valueOf(this.f100949c), Integer.valueOf(this.f100950d));
                    badl badl = badl.f100530a;
                    if (bafl != null) {
                        bafl.close();
                    }
                    return badl;
                }
                badj a = bafi.m86736a(b2.mo55818e());
                if (badj.f100527a.equals(a)) {
                    ((achw) this.f100952f.mo16713a()).mo25414c("%s subscription filter for corpus=%d, datatype=%d is NONE, returning empty result.", this.f100955i, Integer.valueOf(this.f100949c), Integer.valueOf(this.f100950d));
                    badl badl2 = badl.f100530a;
                    if (bafl != null) {
                        bafl.close();
                    }
                    return badl2;
                }
                b = bafl.mo55677c().mo55799b();
                bngs j = bngx.m109377j();
                for (badk badk : bafl.mo55667a(b, this.f100953g, this.f100955i)) {
                    if (badk.mo55613b() == null || a.mo55647a(badk.mo55613b())) {
                        j.mo67668c(badk);
                    }
                }
                b.mo55796b();
                badl a2 = badl.m86647a(j.mo67664a(), bafl.mo55676c(b));
                b.close();
                if (bafl != null) {
                    bafl.close();
                }
                return a2;
            } catch (IOException e) {
                e = e;
                try {
                    throw new azzp(3, String.format(Locale.ENGLISH, "Failed to read footprint from %s/%s.", Integer.valueOf(this.f100949c), Integer.valueOf(this.f100950d)), e);
                } catch (Throwable th) {
                    th = th;
                    if (bafl != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (bafl != null) {
                }
                throw th;
            }
            throw th;
        } catch (IOException e2) {
            e = e2;
            throw new azzp(3, String.format(Locale.ENGLISH, "Failed to read footprint from %s/%s.", Integer.valueOf(this.f100949c), Integer.valueOf(this.f100950d)), e);
        } catch (Throwable th3) {
            th = th3;
            if (bafl != null) {
                bafl.close();
            }
            throw th;
        }
    }
}
