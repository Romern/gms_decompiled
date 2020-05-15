package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: ikf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikf {

    /* renamed from: d */
    public static final sek f21178d = new sek("TransactionBackend");

    /* renamed from: a */
    public final ijk f21179a;

    /* renamed from: b */
    public final Context f21180b;

    /* renamed from: c */
    public final iju f21181c;

    /* renamed from: e */
    private final byte[] f21182e;

    /* renamed from: f */
    private final int f21183f;

    public ikf(Context context, ijk ijk, iju iju, byte[] bArr, int i) {
        this.f21180b = context;
        this.f21179a = ijk;
        this.f21181c = iju;
        this.f21182e = bArr;
        this.f21183f = i;
    }

    /* renamed from: a */
    public static void m15580a() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: b */
    public final void mo13085b(int i) {
        iir iir = new iir(this.f21180b);
        iir.mo13047a(this.f21182e);
        iir.f21070e = i;
        iir.f21071f = this.f21183f;
        iir.mo13046a();
    }

    /* renamed from: a */
    public static boolean m15581a(int i) {
        return (i & ((Integer) igt.f20954d.mo58455c()).intValue()) != 0;
    }

    /* renamed from: a */
    public final String mo13083a(byrz byrz, String str) {
        mo13085b(21);
        try {
            String d = sqd.m35972d(ifj.m15369a(this.f21180b, byrz.f167530a, byrz.f167531b, new Account(str, "com.google")));
            mo13085b(22);
            return d;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f21178d.mo25417e("Error while signcrypting payload", e, new Object[0]);
            mo13085b(23);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo13084a(Context context, int i, Exception exc) {
        iir iir = new iir(context);
        iir.mo13047a(this.f21182e);
        iir.f21069d = 4;
        iir.f21068c = (long) i;
        iir.mo13046a();
        sek sek = f21178d;
        StringBuilder sb = new StringBuilder(48);
        sb.append("Error sending message to server. Try ");
        sb.append(i + 1);
        sek.mo25417e(sb.toString(), exc, new Object[0]);
    }
}
