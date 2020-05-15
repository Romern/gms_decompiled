package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: baik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baik implements Callable {

    /* renamed from: a */
    private final bafj f100990a;

    /* renamed from: b */
    private final Account f100991b;

    /* renamed from: c */
    private final int f100992c;

    /* renamed from: d */
    private final int f100993d;

    /* renamed from: e */
    private final cayo f100994e;

    /* renamed from: f */
    private final String f100995f;

    /* renamed from: g */
    private final bxtx f100996g;

    /* renamed from: h */
    private final bxtx f100997h;

    public baik(cayo cayo, bafj bafj, String str, Account account, int i, int i2, byte[] bArr, byte[] bArr2) {
        this.f100990a = bafj;
        this.f100991b = account;
        this.f100992c = i;
        this.f100993d = i2;
        this.f100994e = cayo;
        this.f100995f = str;
        this.f100996g = bArr != null ? bxtx.m123261a(bArr) : null;
        this.f100997h = bxtx.m123261a(bArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* renamed from: a */
    public final void mo55711a() {
        bany b;
        ((achw) this.f100994e.mo16713a()).mo25409a("Writing %d bytes of data to Footprints %s/%s.", Integer.valueOf(this.f100997h.mo73744a()), Integer.valueOf(this.f100992c), Integer.valueOf(this.f100993d));
        bafl bafl = null;
        try {
            bafl = this.f100990a.mo55662a(this.f100991b, this.f100992c, this.f100993d);
            try {
                b = bafl.mo55677c().mo55799b();
                bafl.mo55672a(b, this.f100995f, this.f100996g, this.f100997h);
                b.mo55796b();
                b.close();
                if (bafl != null) {
                    bafl.close();
                    return;
                }
                return;
            } catch (bafk e) {
                e = e;
                throw new azzp(2, String.format(Locale.ENGLISH, "Illegal use of secondary ID while writing %d bytes to Footprints %s/%s.", Integer.valueOf(this.f100997h.mo73744a()), Integer.valueOf(this.f100992c), Integer.valueOf(this.f100993d)), e);
            } catch (IOException e2) {
                e = e2;
                throw new azzp(3, String.format(Locale.ENGLISH, "Failed to write %d bytes to Footprints %s/%s.", Integer.valueOf(this.f100997h.mo73744a()), Integer.valueOf(this.f100992c), Integer.valueOf(this.f100993d)), e);
            } catch (Throwable th) {
                th = th;
                if (bafl != null) {
                    bafl.close();
                }
                throw th;
            }
            throw th;
        } catch (bafk e3) {
            e = e3;
            throw new azzp(2, String.format(Locale.ENGLISH, "Illegal use of secondary ID while writing %d bytes to Footprints %s/%s.", Integer.valueOf(this.f100997h.mo73744a()), Integer.valueOf(this.f100992c), Integer.valueOf(this.f100993d)), e);
        } catch (IOException e4) {
            e = e4;
            throw new azzp(3, String.format(Locale.ENGLISH, "Failed to write %d bytes to Footprints %s/%s.", Integer.valueOf(this.f100997h.mo73744a()), Integer.valueOf(this.f100992c), Integer.valueOf(this.f100993d)), e);
        } catch (Throwable th2) {
            th = th2;
            if (bafl != null) {
            }
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        mo55711a();
        return null;
    }
}
