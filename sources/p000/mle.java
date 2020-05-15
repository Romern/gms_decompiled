package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: mle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mle {

    /* renamed from: a */
    public static final lvn f33932a = new lvn("PostSmartSetupAuthenticator");

    /* renamed from: b */
    public final arsy f33933b;

    /* renamed from: c */
    private final bmzi f33934c = bmzn.m108681a(mkv.f33922a);

    /* renamed from: d */
    private final bmzi f33935d = bmzn.m108681a(mkw.f33923a);

    public mle(arsy arsy) {
        this.f33933b = arsy;
    }

    /* renamed from: a */
    public final Object mo20138a(bmzi bmzi) {
        int i = 0;
        while (((long) i) <= ((Long) this.f33935d.mo6606a()).longValue()) {
            bqgy c = bqgy.m112818c();
            aucb aucb = (aucb) bmzi.mo6606a();
            aucb.mo50370a(new mla(c));
            c.getClass();
            aucb.mo50372a(new mlb(c));
            c.getClass();
            aucb.mo50373a(new mlc(c));
            try {
                return c.get(((Long) this.f33934c.mo6606a()).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                f33932a.mo25415d("Post-SmartSetup call failed: retry=%d", e, Integer.valueOf(i));
                i++;
            }
        }
        throw new mld("Post-SmartSetup call failed.");
    }
}
