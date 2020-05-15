package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: bail */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bail implements Callable {

    /* renamed from: a */
    private final cayo f100998a;

    /* renamed from: b */
    private final bafu f100999b;

    /* renamed from: c */
    private final String f101000c;

    /* renamed from: d */
    private final Account f101001d;

    /* renamed from: e */
    private final int f101002e;

    /* renamed from: f */
    private final int f101003f;

    /* renamed from: g */
    private final bxtx f101004g;

    public bail(cayo cayo, bafu bafu, String str, Account account, int i, int i2, byte[] bArr) {
        this.f100998a = cayo;
        this.f100999b = bafu;
        this.f101000c = str;
        this.f101001d = account;
        this.f101002e = i;
        this.f101003f = i2;
        this.f101004g = bxtx.m123261a(bArr);
    }

    /* renamed from: a */
    public final Long call() {
        Throwable th;
        bany b;
        Throwable th2;
        ((achw) this.f100998a.mo16713a()).mo25409a("Writing %d bytes of data to Footprints %s/%s.", Integer.valueOf(this.f101004g.mo73744a()), Integer.valueOf(this.f101002e), Integer.valueOf(this.f101003f));
        try {
            bafv a = this.f100999b.mo55681a(this.f101001d, this.f101002e, this.f101003f);
            try {
                b = a.mo55696c().mo55799b();
                bacv d = a.mo55698d(b);
                if (d.mo55581a() != -1) {
                    long c = (d.mo55583c() * 1000) + (baqv.m87417a() / 1000);
                    long a2 = d.mo55581a();
                    Long.signum(a2);
                    long j = c - (a2 * 1000);
                    a.mo55690a(b, this.f101004g, j, this.f101000c);
                    b.mo55796b();
                    Long valueOf = Long.valueOf(j);
                    b.close();
                    if (a != null) {
                        a.close();
                    }
                    return valueOf;
                }
                throw new azzp(4, "There was no sync since device boot, local time is not trustworthy.", null);
            } catch (Throwable th3) {
                th = th3;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
            throw th2;
        } catch (IOException e) {
            throw new azzp(3, String.format(Locale.ENGLISH, "Failed to write %d bytes to Footprints %s/%s.", Integer.valueOf(this.f101004g.mo73744a()), Integer.valueOf(this.f101002e), Integer.valueOf(this.f101003f)), e);
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
    }
}
