package p000;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: aaih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaih {

    /* renamed from: c */
    private static final HashMap f28168c = new HashMap();

    /* renamed from: a */
    public aahz f28169a;

    /* renamed from: b */
    public final Object f28170b = new Object();

    /* renamed from: d */
    private final Context f28171d;

    /* renamed from: e */
    private final aagb f28172e;

    /* renamed from: f */
    private final vyu f28173f;

    /* renamed from: g */
    private final dbu f28174g;

    public aaih(Context context, dbu dbu, aagb aagb, vyu vyu) {
        this.f28171d = context;
        this.f28174g = dbu;
        this.f28172e = aagb;
        this.f28173f = vyu;
    }

    /* renamed from: a */
    private static long m21303a(long j) {
        return System.currentTimeMillis() - j;
    }

    /* renamed from: b */
    private final synchronized Class m21304b(aaia aaia) {
        String str = aaia.f28157a.f12814b;
        Class cls = (Class) f28168c.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.f28173f.mo28956a(aaia.f28158b)) {
                File file = aaia.f28159c;
                if (!file.exists()) {
                    file.mkdirs();
                }
                Class loadClass = new DexClassLoader(aaia.f28158b.getAbsolutePath(), file.getAbsolutePath(), null, this.f28171d.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                f28168c.put(str, loadClass);
                return loadClass;
            }
            throw new aaig(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e) {
            throw new aaig(2026, e);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new aaig(2008, e2);
        }
    }

    /* renamed from: a */
    public final void mo16897a(aaia aaia) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class b = m21304b(aaia);
            aahz aahz = new aahz(b.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f28171d, "msa-r", aaia.mo16888a(), null, new Bundle(), 2), aaia, this.f28174g, this.f28172e);
            if (aahz.mo16885a()) {
                int c = aahz.mo16887c();
                if (c == 0) {
                    synchronized (this.f28170b) {
                        aahz aahz2 = this.f28169a;
                        if (aahz2 != null) {
                            try {
                                aahz2.mo16886b();
                            } catch (aaig e) {
                                this.f28172e.mo16843a(e.f28167a, -1, e);
                            }
                        }
                        this.f28169a = aahz;
                    }
                    this.f28172e.mo16842a(3000, m21303a(currentTimeMillis));
                    return;
                }
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(c);
                throw new aaig(4001, sb.toString());
            }
            throw new aaig(4000, "init failed");
        } catch (Exception e2) {
            throw new aaig(2004, e2);
        } catch (aaig e3) {
            this.f28172e.mo16843a(e3.f28167a, m21303a(currentTimeMillis), e3);
        } catch (Exception e4) {
            this.f28172e.mo16843a(4010, m21303a(currentTimeMillis), e4);
        }
    }
}
