package p000;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: bejk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bejk implements beli {

    /* renamed from: a */
    public final String f111649a;

    /* renamed from: b */
    public final bqgg f111650b;

    /* renamed from: c */
    public final Executor f111651c;

    /* renamed from: d */
    public final befa f111652d;

    /* renamed from: e */
    private final bxxc f111653e;

    /* renamed from: f */
    private final bxus f111654f;

    /* renamed from: g */
    private final bqfj f111655g = bqfj.m112745a();

    public bejk(String str, bqgg bqgg, bxxc bxxc, Executor executor, befa befa, bxus bxus) {
        this.f111649a = str;
        this.f111650b = bqga.m112772a(bqgg);
        this.f111653e = bxxc;
        this.f111651c = executor;
        this.f111652d = befa;
        this.f111654f = bxus;
    }

    /* renamed from: a */
    public final bqeg mo60755a() {
        return new bejc(this);
    }

    /* renamed from: b */
    public final bqgg mo60758b(Uri uri) {
        try {
            return bqga.m112775a(mo60757a(uri));
        } catch (IOException e) {
            if ((e instanceof begf) || (e.getCause() instanceof begf)) {
                return bqga.m112777a((Throwable) e);
            }
            return bqdx.m112674a(bqga.m112777a((Throwable) e), bljx.m107266a(new bejh(this)), this.f111651c);
        }
    }

    /* renamed from: b */
    public final String mo60759b() {
        return this.f111649a;
    }

    /* renamed from: c */
    public final bqgg mo60760c() {
        return bqga.m112772a(bqga.m112771a(bljx.m107265a(new beje(this)), this.f111651c));
    }

    /* renamed from: a */
    public final bqgg mo60756a(bqeh bqeh, Executor executor) {
        return this.f111655g.mo69205a(bljx.m107265a(new bejd(this, bqeh, executor)), this.f111651c);
    }

    /* renamed from: a */
    public final bxxc mo60757a(Uri uri) {
        bljb a;
        try {
            String valueOf = String.valueOf(this.f111649a);
            a = blkh.m107282a(valueOf.length() == 0 ? new String("Read ") : "Read ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            befa befa = this.f111652d;
            behr behr = new behr(this.f111653e.mo74143cZ());
            behr.f111571a = this.f111654f;
            bxxc bxxc = (bxxc) befa.mo60643a(uri, behr, new beer[0]);
            if (a != null) {
                a.close();
            }
            return bxxc;
        } catch (FileNotFoundException e) {
            if (!this.f111652d.mo60647c(uri)) {
                return this.f111653e;
            }
            throw e;
        } catch (IOException e2) {
            throw belk.m95257a(this.f111652d, uri, e2);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
