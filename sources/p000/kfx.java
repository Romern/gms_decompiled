package p000;

import android.os.Bundle;
import com.google.android.gms.autofill.data.Credential;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: kfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kfx extends keo implements kgu {

    /* renamed from: a */
    public final kfe f24010a;

    /* renamed from: b */
    public final kbj f24011b;

    /* renamed from: c */
    public final kpk f24012c;

    /* renamed from: d */
    private final bmxv f24013d;

    public kfx(kfe kfe, kbj kbj, kpk kpk, bmxv bmxv) {
        this.f24010a = kfe;
        this.f24011b = kbj;
        this.f24012c = kpk;
        this.f24013d = bmxv;
    }

    /* renamed from: a */
    public static String m17785a(bnic bnic) {
        StringBuilder sb = new StringBuilder();
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            kcv kcv = (kcv) a.next();
            if (sb.length() > 0) {
                sb.append(" OR ");
            }
            sb.append("idx_signon_realm = '");
            sb.append(m17786a(kcv.f23841b));
            sb.append("/'");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final bqgg mo14456b(Executor executor) {
        kgm b = kgq.m17822b();
        b.mo14464a(executor);
        b.mo14465a(new kft());
        b.mo14463a(this.f24013d);
        b.mo14466a(this);
        return kfg.m17752a(b.mo14462a().mo14453a());
    }

    /* renamed from: a */
    public static String m17786a(String str) {
        return str.replace("'", "''");
    }

    /* renamed from: a */
    static kcs m17787a(qun qun) {
        if (qun.f42170e.isEmpty()) {
            return kcs.m17644a("chromesync_password", qun.f42168c);
        }
        String str = qun.f42168c;
        String str2 = qun.f42170e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        return kcs.m17644a("chromesync_password", sb.toString());
    }

    /* renamed from: a */
    public final bqgg mo14454a(Executor executor, Credential credential) {
        kgh kgh = new kgh();
        cazf.m127594a(executor);
        kgh.f24036a = executor;
        cazf.m127594a(credential);
        kgh.f24038c = credential;
        kfs kfs = new kfs(credential);
        cazf.m127594a(kfs);
        kgh.f24037b = kfs;
        cazf.m127594a(this);
        kgh.f24039d = this;
        cazf.m127595a(kgh.f24036a, Executor.class);
        cazf.m127595a(kgh.f24037b, kfw.class);
        cazf.m127595a(kgh.f24038c, Credential.class);
        cazf.m127595a(kgh.f24039d, kgu.class);
        return kfg.m17752a(new kgl(kgh.f24039d, kgh.f24036a, kgh.f24037b, kgh.f24038c).f24043a.mo75201b());
    }

    /* renamed from: a */
    public final bqgg mo14455a(kcv kcv) {
        bxvd da = qun.f42164n.mo74144da();
        String str = kcv.f23841b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
        sb.append(str);
        sb.append('/');
        String sb2 = sb.toString();
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qun qun = (qun) da.f164949b;
        int i = qun.f42166a | 1024;
        qun.f42166a = i;
        qun.f42174i = micros;
        int i2 = i | 2048;
        qun.f42166a = i2;
        qun.f42175j = true;
        sb2.getClass();
        int i3 = i2 | 4;
        qun.f42166a = i3;
        qun.f42168c = sb2;
        sb2.getClass();
        qun.f42166a = i3 | 2;
        qun.f42167b = sb2;
        return this.f24010a.mo14443a((qun) da.mo74062i(), Bundle.EMPTY);
    }

    /* renamed from: a */
    public final bqgg mo14429a(kej kej) {
        kel kel = kej.f23934a;
        kgm b = kgq.m17822b();
        b.mo14464a(kel.f23937a);
        b.mo14465a(new kfu(kel.f23938b, kel.f23941e));
        b.mo14463a(this.f24013d);
        b.mo14466a(this);
        return kfg.m17752a(bqdx.m112673a(b.mo14462a().mo14453a(), kfp.f24001a, bqfb.INSTANCE));
    }

    /* renamed from: a */
    public final bqgg mo14430a(kem kem) {
        Object obj = kem.f23944b;
        if (!(obj instanceof Credential)) {
            return bqga.m112777a((Throwable) new IllegalArgumentException());
        }
        kel kel = kem.f23943a;
        Credential credential = (Credential) obj;
        return bqdx.m112674a(bqdx.m112674a(mo14456b(kel.f23937a), new kfq(credential.f11610c), bqfb.INSTANCE), new kfr(this, credential, kel), kel.f23937a);
    }
}
