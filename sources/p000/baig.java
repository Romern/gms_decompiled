package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: baig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baig implements Callable {

    /* renamed from: a */
    private final bafu f100960a;

    /* renamed from: b */
    private final int f100961b;

    /* renamed from: c */
    private final Long f100962c;

    /* renamed from: d */
    private final Long f100963d;

    /* renamed from: e */
    private final Account f100964e;

    /* renamed from: f */
    private final int f100965f;

    /* renamed from: g */
    private final int f100966g;

    /* renamed from: h */
    private final babr f100967h;

    /* renamed from: i */
    private final cayo f100968i;

    /* renamed from: j */
    private final baok f100969j;

    /* renamed from: k */
    private final String f100970k;

    public baig(babr babr, cayo cayo, bafu bafu, baok baok, String str, Account account, int i, int i2, int i3, Long l, Long l2) {
        this.f100960a = bafu;
        this.f100964e = account;
        this.f100965f = i;
        this.f100966g = i2;
        this.f100967h = babr;
        this.f100968i = cayo;
        this.f100969j = baok;
        this.f100970k = str;
        this.f100961b = i3;
        this.f100962c = l;
        this.f100963d = l2;
    }

    /* renamed from: a */
    public final List call() {
        Throwable th;
        banx a;
        Throwable th2;
        long j;
        ((achw) this.f100968i.mo16713a()).logVerbose("Reading time series footprints from %s/%s.", Integer.valueOf(this.f100965f), Integer.valueOf(this.f100966g));
        try {
            bafv a2 = this.f100960a.mo55681a(this.f100964e, this.f100965f, this.f100966g);
            try {
                baog b = this.f100969j.mo55832b(this.f100970k, this.f100964e, bafi.m86741a(this.f100965f, this.f100966g, byhm.SYNC_FULL_SNAPSHOT));
                if (b == null) {
                    ((achw) this.f100968i.mo16713a()).mo25416d("%s is not subscribed to corpus=%d, datatype=%d, returning empty list.", this.f100970k, Integer.valueOf(this.f100965f), Integer.valueOf(this.f100966g));
                    List emptyList = Collections.emptyList();
                    if (a2 != null) {
                        a2.close();
                    }
                    return emptyList;
                }
                if (this.f100967h.mo32678J()) {
                    this.f100969j.mo55828a(b.mo55814a(), b.mo55815b(), b.mo55816c());
                }
                badr b2 = bafi.m86745b(b.mo55818e());
                int a3 = b2.mo55635a();
                if (a3 == 0) {
                    ((achw) this.f100968i.mo16713a()).mo25414c("%s subscription filter for corpus=%d, datatype=%d is empty, returning empty list.", this.f100970k, Integer.valueOf(this.f100965f), Integer.valueOf(this.f100966g));
                    List emptyList2 = Collections.emptyList();
                    if (a2 != null) {
                        a2.close();
                    }
                    return emptyList2;
                }
                a = a2.mo55696c().mo55798a();
                long c = a2.mo55695c(a);
                long j2 = Long.MAX_VALUE;
                long longValue = b2.mo55637c() != null ? b2.mo55637c().longValue() + c : Long.MAX_VALUE;
                long longValue2 = b2.mo55636b() != null ? c + b2.mo55636b().longValue() : Long.MIN_VALUE;
                Long l = this.f100963d;
                if (l != null) {
                    j2 = l.longValue();
                }
                long min = Math.min(longValue, j2);
                Long l2 = this.f100962c;
                if (l2 != null) {
                    j = l2.longValue();
                } else {
                    j = Long.MIN_VALUE;
                }
                List a4 = a2.mo55685a(a, min, Math.max(longValue2, j), this.f100970k);
                bngx a5 = bngx.m109368a((Collection) a4.subList(0, Math.min(a4.size(), Math.min(this.f100961b, a3))));
                a.close();
                if (a2 != null) {
                    a2.close();
                }
                return a5;
            } catch (Throwable th3) {
                th = th3;
                if (a2 != null) {
                    a2.close();
                }
                throw th;
            }
            throw th2;
        } catch (IOException e) {
            throw new azzp(3, String.format(Locale.ENGLISH, "Failed to read footprint from %s/%s.", Integer.valueOf(this.f100965f), Integer.valueOf(this.f100966g)), e);
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
    }
}
