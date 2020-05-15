package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.api.Status;

/* renamed from: itq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itq extends aaab {

    /* renamed from: c */
    private static final Logger f21701c = new Logger(new String[]{"HaveKeyWithKeyHandleOperation"}, (byte[]) null);

    /* renamed from: a */
    private final ire f21702a;

    /* renamed from: b */
    private final byte[] f21703b;

    public itq(ire ire, byte[] bArr) {
        super(129, "HaveKeyWithKeyHandleOperation");
        this.f21702a = ire;
        this.f21703b = bArr;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (p000.egx.m10386a(p000.egx.m10387b(r7.f21703b)) == false) goto L_0x0034;
     */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f21701c.mo25412b("Have key with key handle operation is called.", new Object[0]);
        ipo ipo = new ipo(context);
        isy a = ipo.mo13218a(this.f21703b);
        if (ccfg.f178858a.mo6606a().mo75853e() && a.f21638c == null) {
        }
        this.f21702a.mo13294a(true);
        try {
            byte[] bArr = this.f21703b;
            String d = sqd.m35972d(bArr);
            ipo.f21519c.mo25412b("Deleting key instance for [keyHandle=%s].", d);
            if (ipp.m15839a(ipo.f21520b).getReadableDatabase().delete("keys", "key_handle = ?", new String[]{d}) <= 0) {
                ipo.f21519c.mo25418e("No rows found for for [keyHandle=%s]", d);
            } else {
                ipo.f21519c.mo25412b("Successfully deleted key instance.", new Object[0]);
                try {
                    egx.m10385a(bArr);
                } catch (ehf e) {
                }
            }
            this.f21702a.mo13294a(false);
            this.f21702a.mo13294a(true);
        } catch (SQLiteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            throw new isu(valueOf.length() == 0 ? new String("failed to open db ") : "failed to open db ".concat(valueOf));
        } catch (isu e3) {
            this.f21702a.mo13294a(false);
            return;
        }
        this.f21702a.mo13294a(false);
        this.f21702a.mo13294a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21702a.mo13293a(status);
    }
}
