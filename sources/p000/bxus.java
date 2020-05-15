package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bxus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bxus {

    /* renamed from: a */
    static final bxus f164871a = new bxus(null);

    /* renamed from: b */
    private static volatile boolean f164872b = false;

    /* renamed from: c */
    private static volatile bxus f164873c;

    /* renamed from: d */
    private static volatile bxus f164874d;

    /* renamed from: e */
    private final Map f164875e;

    public bxus() {
        this.f164875e = new HashMap();
    }

    /* renamed from: a */
    public static bxus m123742a() {
        return new bxus();
    }

    /* renamed from: b */
    public static bxus m123743b() {
        bxus bxus = f164873c;
        if (bxus == null) {
            synchronized (bxus.class) {
                bxus = f164873c;
                if (bxus == null) {
                    bxus = f164871a;
                    f164873c = bxus;
                }
            }
        }
        return bxus;
    }

    /* renamed from: c */
    public static bxus m123744c() {
        bxus bxus = f164874d;
        if (bxus != null) {
            return bxus;
        }
        synchronized (bxus.class) {
            bxus bxus2 = f164874d;
            if (bxus2 != null) {
                return bxus2;
            }
            bxus a = bxvb.m123780a(bxus.class);
            f164874d = a;
            return a;
        }
    }

    public bxus(byte[] bArr) {
        this.f164875e = Collections.emptyMap();
    }

    /* renamed from: a */
    public bxvj mo73903a(bxxc bxxc, int i) {
        return (bxvj) this.f164875e.get(new bxur(bxxc, i));
    }

    /* renamed from: a */
    public final void mo73904a(bxvj bxvj) {
        this.f164875e.put(new bxur(bxvj.f164955a, bxvj.mo73900a()), bxvj);
    }
}
