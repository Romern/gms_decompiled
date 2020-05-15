package p000;

import java.text.DateFormat;
import java.util.Date;

/* renamed from: aukf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukf extends Thread {

    /* renamed from: a */
    private final auji f91965a;

    /* renamed from: b */
    private final aabl f91966b = new aabl(getClass(), 16, "MetricsReaderCollector", "tron");

    /* renamed from: c */
    private aukg f91967c;

    /* renamed from: d */
    private long f91968d;

    /* renamed from: e */
    private long f91969e;

    public aukf(auji auji, aukg aukg, long j) {
        super("tron.oc.mrc.rt");
        this.f91968d = j;
        this.f91965a = auji;
        this.f91967c = aukg;
    }

    public final void run() {
        while (cgzf.m147725d()) {
            if (cgzf.m147724c()) {
                String valueOf = String.valueOf(DateFormat.getDateTimeInstance().format(new Date(this.f91968d)));
                if (valueOf.length() == 0) {
                    new String("MetricsReader ReaderThread blocking at ");
                } else {
                    "MetricsReader ReaderThread blocking at ".concat(valueOf);
                }
            }
            aukg aukg = new aukg();
            this.f91967c = aukg;
            long j = this.f91968d;
            aukg.f91972b.checkpoint();
            aukg.f91972b.read(j);
            aukg.f91973c = System.currentTimeMillis();
            aukg.mo50605b();
            long j2 = aukg.f91974d;
            if (j2 == 0) {
                j2 = aukg.f91973c;
            }
            this.f91968d = j2;
            blji b = this.f91966b.mo16696b("readLogs");
            try {
                cgzf.m147724c();
                aukg aukg2 = this.f91967c;
                aukg2.f91972b.reset();
                if (aukg2.f91972b.hasNext()) {
                    this.f91969e = 0;
                    aujg a = this.f91965a.mo50585a(this.f91967c);
                    a.f91944h = 2;
                    this.f91965a.mo50587a(a);
                } else {
                    cgzf.m147724c();
                    long j3 = this.f91969e + 1;
                    this.f91969e = j3;
                    if (j3 <= cgzf.f188102a.mo6606a().mo84793b()) {
                        try {
                            Thread.sleep(cgzf.f188102a.mo6606a().mo84794c());
                        } catch (Exception e) {
                        }
                    } else {
                        cgzf.m147724c();
                        if (b != null) {
                            b.close();
                            return;
                        }
                        return;
                    }
                }
                aukg.m77215c(this.f91965a);
                if (b != null) {
                    b.close();
                }
                if (isInterrupted()) {
                    cgzf.m147724c();
                    return;
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        cgzf.m147724c();
        return;
        throw th;
    }
}
