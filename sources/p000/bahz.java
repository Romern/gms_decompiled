package p000;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: bahz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bahz implements Callable {

    /* renamed from: a */
    private static final int f100925a = byip.f166588d.mo73900a();

    /* renamed from: b */
    private final int f100926b;

    /* renamed from: c */
    private final byte[] f100927c;

    /* renamed from: d */
    private final baib f100928d;

    public bahz(baic baic, String str, Account account, int i) {
        this.f100926b = i;
        this.f100927c = String.valueOf(i).getBytes(bmwy.f131158c);
        badi b = badj.m86640b();
        b.mo55646a(this.f100927c, 1);
        this.f100928d = baic.mo55704a(str, account, 553, f100925a, b.mo55645a());
    }

    /* renamed from: a */
    public final badn call() {
        for (badk badk : this.f100928d.call()) {
            if (Arrays.equals(this.f100927c, badk.mo55613b())) {
                try {
                    byip a = bafi.m86742a(badk.mo55612a());
                    badm badm = new badm();
                    badm.f100531a = Integer.valueOf(this.f100926b);
                    badm.f100532b = Boolean.valueOf(a.f166590a);
                    badm.f100533c = Boolean.valueOf(a.f166591b);
                    badm.f100534d = Long.valueOf(badk.mo55614c());
                    String str = badm.f100531a == null ? " corpusGroup" : "";
                    if (badm.f100532b == null) {
                        str = str.concat(" enabled");
                    }
                    if (badm.f100533c == null) {
                        str = String.valueOf(str).concat(" unset");
                    }
                    if (badm.f100534d == null) {
                        str = String.valueOf(str).concat(" lastModifiedTimeMicros");
                    }
                    if (str.isEmpty()) {
                        return new badd(badm.f100531a.intValue(), badm.f100532b.booleanValue(), badm.f100533c.booleanValue(), badm.f100534d.longValue());
                    }
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                } catch (bxwf e) {
                    throw new azzp(3, String.format(Locale.ENGLISH, "Failed to parse RecordingSetting footprint.", new Object[0]), e);
                }
            }
        }
        return null;
    }
}
