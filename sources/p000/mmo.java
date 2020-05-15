package p000;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: mmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mmo implements mmh {

    /* renamed from: b */
    private static final lvn f34015b = new lvn("MediaFlavorHandler");

    /* renamed from: a */
    public Set f34016a;

    /* renamed from: c */
    private List f34017c;

    /* renamed from: d */
    private final mmk f34018d;

    public mmo(mmk mmk) {
        this.f34018d = mmk;
    }

    /* renamed from: b */
    public static final File m25342b(mph mph) {
        return new File(mph.f34146d);
    }

    /* renamed from: a */
    public final InputStream mo20162a(mph mph) {
        return new mmt(new mmn(this, mph));
    }

    /* renamed from: a */
    public final List mo20163a() {
        ArrayList arrayList = new ArrayList();
        mo20170b();
        for (mhh mhh : this.f34017c) {
            bxvd da = mph.f34141f.mo74144da();
            String str = mhh.f33721a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mph mph = (mph) da.f164949b;
            str.getClass();
            mph.f34143a |= 1;
            mph.f34146d = str;
            File b = m25342b((mph) da.mo74062i());
            long length = b.length();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mph mph2 = (mph) da.f164949b;
            mph2.f34143a |= 2;
            mph2.f34147e = length;
            bxvd da2 = mpf.f34120d.mo74144da();
            String str2 = mhh.f33722b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mpf mpf = (mpf) da2.f164949b;
            str2.getClass();
            mpf.f34122a |= 1;
            mpf.f34123b = str2;
            long lastModified = b.lastModified();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mpf mpf2 = (mpf) da2.f164949b;
            mpf2.f34122a |= 2;
            mpf2.f34124c = lastModified;
            mpf mpf3 = (mpf) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mph mph3 = (mph) da.f164949b;
            mpf3.getClass();
            mph3.f34145c = mpf3;
            mph3.f34144b = 100;
            arrayList.add((mph) da.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized void mo20170b() {
        if (this.f34017c == null) {
            try {
                List a = this.f34018d.mo20166a();
                this.f34017c = a;
                this.f34016a = bnpf.m110048a(a.size());
                for (mhh mhh : this.f34017c) {
                    this.f34016a.add(mhh.f33721a);
                }
            } catch (ExecutionException e) {
                f34015b.mo25417e("ExecutionException in PathFetcher", e, new Object[0]);
            } catch (InterruptedException e2) {
                f34015b.mo25417e("InterruptedException in PathFetcher", e2, new Object[0]);
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: a */
    public final void mo20164a(mph mph, InputStream inputStream) {
        srz.m36171a((Closeable) inputStream);
    }
}
