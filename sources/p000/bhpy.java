package p000;

import android.content.Context;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bhpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhpy implements bhup {

    /* renamed from: a */
    public final Context f119283a;

    /* renamed from: b */
    public int f119284b;

    /* renamed from: c */
    public String f119285c;

    /* renamed from: d */
    private final bhuk f119286d;

    /* renamed from: e */
    private final Executor f119287e;

    /* renamed from: f */
    private final String f119288f;

    /* renamed from: g */
    private long f119289g = -1;

    /* renamed from: h */
    private bhun f119290h;

    /* renamed from: i */
    private final bicy f119291i;

    public bhpy(bicy bicy, bhuk bhuk, Executor executor, String str, Context context) {
        this.f119291i = bicy;
        this.f119286d = bhuk;
        this.f119287e = executor;
        this.f119288f = str;
        this.f119283a = context;
        this.f119290h = null;
        this.f119285c = null;
        this.f119284b = -1;
    }

    /* renamed from: f */
    private final void m101293f() {
        try {
            mo64144a(4, mo64141a(srz.m36178b(this.f119283a.getResources().getAssets().open(this.f119288f))));
            mo64148c(4);
        } catch (bxwf | InvalidObjectException e) {
            mo64146b(4);
        } catch (IOException e2) {
            mo64146b(7);
        }
    }

    /* renamed from: a */
    public final bhun mo64141a(byte[] bArr) {
        bvmk bvmk = (bvmk) ((bxvd) bvmk.f156745e.mo74144da().mo73633b(bArr)).mo74062i();
        int a = bvmh.m121257a(bvmk.f156748b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i == 2) {
                bhun a2 = bhuo.m101566a(bvmk);
                bhuj.m101555a();
                return a2;
            } else if (i != 3) {
                throw new InvalidObjectException("Unknown model version.");
            }
        }
        int d = bicy.m101985d();
        Boolean valueOf = Boolean.valueOf(cgfo.m145040b());
        if (bvmk.f156747a.size() == 1) {
            bvpf bvpf = (bvpf) bvmk.f156747a.get(0);
            bhul a3 = bhuy.m101590a(d, valueOf);
            int a4 = bvmh.m121257a(bvmk.f156748b);
            if (a4 == 0) {
                a4 = 1;
            }
            bhun bhun = new bhun(bvpf, a4, (bvmj[]) new bxvv(bvmk.f156749c, bvmk.f156744d).toArray(new bvmj[bvmk.f156749c.size()]), a3);
            bvpf bvpf2 = bhun.f119643b;
            if (bvpf2 == null || (bvpf2.f157280a & 1) == 0 || bhun.f119642a.isEmpty()) {
                bhuj.m101555a().mo64361c("Invalid model weights, returning null model weights container");
                throw new InvalidObjectException("Failed to parse model weights");
            }
            bhuj.m101555a();
            return bhun;
        }
        throw new InvalidObjectException("No model weights found in proto");
    }

    /* renamed from: b */
    public final void mo64145b() {
        this.f119284b = -1;
        this.f119290h = null;
        this.f119285c = null;
    }

    /* renamed from: c */
    public final void mo64147c() {
        if (this.f119284b != 0) {
            bhuj.m101555a();
        } else if (System.currentTimeMillis() > this.f119289g) {
            bhuj.m101555a();
            mo64150e();
        }
    }

    /* renamed from: d */
    public final bhun mo64149d() {
        return this.f119290h;
    }

    /* renamed from: e */
    public final void mo64150e() {
        this.f119284b = 1;
        afkf.m53198a(this.f119283a).mo34919a("userlocation_placeinference_model", "com.google.android.gms").mo50378a(this.f119287e, new bhpx(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo64146b(int i) {
        this.f119286d.mo64318a(4, i, 1, 0);
        bhuj.m101555a().mo64361c("Failed to load model from APK.");
        mo64148c(4);
    }

    /* renamed from: c */
    public final void mo64148c(int i) {
        this.f119284b = 0;
        if (i == 4) {
            this.f119289g = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(cggm.f186849a.mo6606a().mo83726e());
        } else {
            this.f119289g = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(cggm.f186849a.mo6606a().mo83727f());
        }
    }

    /* renamed from: a */
    public final void mo64142a() {
        mo64150e();
    }

    /* renamed from: a */
    public final void mo64143a(int i) {
        this.f119286d.mo64318a(3, i, 1, 0);
        afkf.m53198a(this.f119283a).mo34920b("userlocation_placeinference_model", "com.google.android.gms");
        if (this.f119290h != null) {
            bhuj.m101555a();
            mo64148c(4);
            return;
        }
        m101293f();
    }

    /* renamed from: a */
    public final void mo64144a(int i, bhun bhun) {
        this.f119290h = bhun;
        int i2 = bhun.f119647f;
        int i3 = i2 - 1;
        if (i2 != 0) {
            this.f119286d.mo64318a(i, 2, bpnr.m112100a(i3), bhun.f119646e);
            return;
        }
        throw null;
    }
}
