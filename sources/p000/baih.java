package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: baih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baih implements Callable {

    /* renamed from: a */
    private final bafu f100971a;

    /* renamed from: b */
    private final int f100972b;

    /* renamed from: c */
    private final Long f100973c;

    /* renamed from: d */
    private final Long f100974d;

    /* renamed from: e */
    private final Account f100975e;

    /* renamed from: f */
    private final int f100976f;

    /* renamed from: g */
    private final int f100977g;

    /* renamed from: h */
    private final babr f100978h;

    /* renamed from: i */
    private final cayo f100979i;

    /* renamed from: j */
    private final baok f100980j;

    /* renamed from: k */
    private final String f100981k;

    public baih(babr babr, cayo cayo, bafu bafu, baok baok, String str, Account account, int i, int i2, int i3, Long l, Long l2) {
        this.f100971a = bafu;
        this.f100975e = account;
        this.f100976f = i;
        this.f100977g = i2;
        this.f100978h = babr;
        this.f100979i = cayo;
        this.f100980j = baok;
        this.f100981k = str;
        this.f100972b = i3;
        this.f100973c = l;
        this.f100974d = l2;
    }

    /* renamed from: a */
    public final badl call() {
        Throwable th;
        bany b;
        Throwable th2;
        long j;
        ((achw) this.f100979i.mo16713a()).mo25409a("Reading time series footprints from %s/%s.", Integer.valueOf(this.f100976f), Integer.valueOf(this.f100977g));
        try {
            bafv a = this.f100971a.mo55681a(this.f100975e, this.f100976f, this.f100977g);
            try {
                baog b2 = this.f100980j.mo55832b(this.f100981k, this.f100975e, bafi.m86741a(this.f100976f, this.f100977g, byhm.SYNC_FULL_SNAPSHOT));
                if (b2 == null) {
                    ((achw) this.f100979i.mo16713a()).mo25416d("%s is not subscribed to corpus=%d, datatype=%d, returning empty list.", this.f100981k, Integer.valueOf(this.f100976f), Integer.valueOf(this.f100977g));
                    badl badl = badl.f100530a;
                    if (a != null) {
                        a.close();
                    }
                    return badl;
                }
                if (this.f100978h.mo32678J()) {
                    this.f100980j.mo55828a(b2.mo55814a(), b2.mo55815b(), b2.mo55816c());
                }
                badr b3 = bafi.m86745b(b2.mo55818e());
                int a2 = b3.mo55635a();
                if (a2 == 0) {
                    ((achw) this.f100979i.mo16713a()).mo25414c("%s subscription filter for corpus=%d, datatype=%d is empty, returning empty result.", this.f100981k, Integer.valueOf(this.f100976f), Integer.valueOf(this.f100977g));
                    badl badl2 = badl.f100530a;
                    if (a != null) {
                        a.close();
                    }
                    return badl2;
                }
                b = a.mo55696c().mo55799b();
                long c = a.mo55695c(b);
                long j2 = Long.MAX_VALUE;
                long longValue = b3.mo55637c() != null ? b3.mo55637c().longValue() + c : Long.MAX_VALUE;
                long longValue2 = b3.mo55636b() != null ? c + b3.mo55636b().longValue() : Long.MIN_VALUE;
                Long l = this.f100974d;
                if (l != null) {
                    j2 = l.longValue();
                }
                long min = Math.min(longValue, j2);
                Long l2 = this.f100973c;
                if (l2 != null) {
                    j = l2.longValue();
                } else {
                    j = Long.MIN_VALUE;
                }
                List a3 = a.mo55685a(b, min, Math.max(longValue2, j), this.f100981k);
                b.mo55796b();
                badl a4 = badl.m86647a(bngx.m109368a((Collection) a3.subList(0, Math.min(a3.size(), Math.min(this.f100972b, a2)))), a.mo55698d(b));
                b.close();
                if (a != null) {
                    a.close();
                }
                return a4;
            } catch (Throwable th3) {
                th = th3;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
            throw th2;
        } catch (IOException e) {
            throw new azzp(3, String.format(Locale.ENGLISH, "Failed to read footprint from %s/%s.", Integer.valueOf(this.f100976f), Integer.valueOf(this.f100977g)), e);
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
    }
}
