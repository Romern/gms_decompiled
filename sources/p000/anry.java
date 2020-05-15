package p000;

import android.util.Pair;
import com.google.android.gms.plus.service.pos.PlusonesEntity;

/* renamed from: anry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anry {

    /* renamed from: d */
    private static anry f77562d;

    /* renamed from: a */
    public final C1231nx f77563a = new C1231nx(20);

    /* renamed from: b */
    public final C1231nx f77564b = new C1231nx(20);

    /* renamed from: c */
    public final C1231nx f77565c = new C1231nx(20);

    /* renamed from: a */
    public static anry m65083a() {
        anry anry;
        synchronized (anry.class) {
            if (f77562d == null) {
                f77562d = new anry();
            }
            anry = f77562d;
        }
        return anry;
    }

    /* renamed from: a */
    public static final String m65084a(String str) {
        return str == null ? "<<null account>>" : str;
    }

    /* renamed from: b */
    public final void mo42174b(String str, String str2) {
        synchronized (this.f77563a) {
            this.f77563a.mo15552b(Pair.create(m65084a(str), str2));
        }
    }

    /* renamed from: a */
    public final ansa mo42172a(String str, String str2) {
        ansa ansa;
        synchronized (this.f77563a) {
            ansa = (ansa) this.f77563a.mo15546a(Pair.create(m65084a(str), str2));
        }
        return ansa;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (p000.anrz.m65092a(r1) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        return r1;
     */
    /* renamed from: a */
    public final aocu mo42173a(String str, String str2, boolean z) {
        int i;
        synchronized (this.f77563a) {
            Pair create = Pair.create(m65084a(str), str2);
            ansa ansa = (ansa) this.f77563a.mo15546a(create);
            if (ansa == null) {
                return null;
            }
            aocu aocu = ansa.f77567a;
            if (!z || anrz.m65092a(aocu)) {
                if (!z) {
                }
            }
            anrz.m65091a((PlusonesEntity) aocu, z);
            if (!z) {
                i = -1;
            } else {
                i = 1;
            }
            anrz.m65090a((PlusonesEntity) aocu, i);
            this.f77563a.mo15547a(create, ansa);
        }
    }
}
