package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.statementservice.ChimeraOperationService;
import java.util.concurrent.TimeUnit;

/* renamed from: asef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asef implements qkb {

    /* renamed from: a */
    final /* synthetic */ aseg f88752a;

    /* renamed from: b */
    private final bqyi f88753b;

    /* renamed from: c */
    private int f88754c;

    /* renamed from: d */
    private final asee f88755d;

    public asef(aseg aseg, bqyi bqyi, asee asee, int i) {
        this.f88752a = aseg;
        this.f88753b = bqyi;
        this.f88755d = asee;
        this.f88754c = i;
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        String valueOf = String.valueOf(status.f30116j);
        Log.w("SingleHostAsyncVerifier", valueOf.length() == 0 ? new String("Failure in rpc: ") : "Failure in rpc: ".concat(valueOf));
        this.f88755d.mo49086a(false);
    }

    /* renamed from: a */
    public final void mo11594a(ChimeraOperationService chimeraOperationService) {
        try {
            asek asek = this.f88752a.f88758c;
            bqyi bqyi = this.f88753b;
            if (asek.f88776c == null) {
                asek.f88776c = chtv.m149566a(chtu.UNARY, "google.digitalassetlinks.v1.AssetLinks/Check", ciie.m150370a(bqyi.f141949e), ciie.m150370a(bqyj.f141955b));
            }
            bqyj bqyj = (bqyj) asek.f88777a.mo25554a(asek.f88776c, bqyi, (long) asek.f88775b, TimeUnit.MILLISECONDS);
            Object[] objArr = new Object[3];
            bqyh bqyh = this.f88753b.f141952b;
            if (bqyh == null) {
                bqyh = bqyh.f141944d;
            }
            objArr[0] = bqyh;
            bqyh bqyh2 = this.f88753b.f141954d;
            if (bqyh2 == null) {
                bqyh2 = bqyh.f141944d;
            }
            objArr[1] = bqyh2;
            objArr[2] = Boolean.valueOf(bqyj.f141957a);
            Log.i("SingleHostAsyncVerifier", String.format("Verification result: checking for a statement with source %s, relation delegate_permission/common.handle_all_urls, and target %s --> %b.", objArr));
            this.f88755d.mo49086a(bqyj.f141957a);
        } catch (chuw e) {
            Log.w("SingleHostAsyncVerifier", "Error performing check: ", e);
            int i = this.f88754c - 1;
            this.f88754c = i;
            if (i > 0) {
                try {
                    Thread.sleep((long) ((Integer) aseh.f88768g.mo58455c()).intValue());
                    mo11594a(chimeraOperationService);
                } catch (InterruptedException e2) {
                    bqyh bqyh3 = this.f88753b.f141954d;
                    if (bqyh3 == null) {
                        bqyh3 = bqyh.f141944d;
                    }
                    String valueOf = String.valueOf(bqyh3);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                    sb.append("Interrupted on: ");
                    sb.append(valueOf);
                    Log.w("SingleHostAsyncVerifier", sb.toString());
                    this.f88755d.mo49086a(false);
                }
            } else {
                bqyh bqyh4 = this.f88753b.f141954d;
                if (bqyh4 == null) {
                    bqyh4 = bqyh.f141944d;
                }
                String valueOf2 = String.valueOf(bqyh4);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                sb2.append("Out of retries on: ");
                sb2.append(valueOf2);
                Log.w("SingleHostAsyncVerifier", sb2.toString());
                this.f88755d.mo49086a(false);
            }
        }
    }
}
