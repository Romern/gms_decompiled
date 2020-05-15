package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqns {

    /* renamed from: a */
    public final bqsj f141318a;

    public bqns(bqsj bqsj) {
        this.f141318a = bqsj;
    }

    /* renamed from: a */
    public static final bqns m113055a(bqsj bqsj) {
        m113056b(bqsj);
        return new bqns(bqsj);
    }

    /* renamed from: b */
    public static void m113056b(bqsj bqsj) {
        if (bqsj == null || bqsj.f141534b.size() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return bqol.m113118a(this.f141318a).toString();
    }

    /* renamed from: a */
    public final bqns mo69304a() {
        if (this.f141318a != null) {
            bqsh bqsh = (bqsh) bqsj.f141531c.mo74144da();
            bxwc bxwc = this.f141318a.f141534b;
            int size = bxwc.size();
            int i = 0;
            while (i < size) {
                bqsi bqsi = (bqsi) bxwc.get(i);
                bqsd bqsd = bqsi.f141527a;
                if (bqsd == null) {
                    bqsd = bqsd.f141509d;
                }
                int b = bqsc.m113309b(bqsd.f141513c);
                if (b == 0 || b != 4) {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
                String str = bqsd.f141511a;
                bxtx bxtx = bqsd.f141512b;
                bqnm a = bqok.m113100a(str, (Class) null);
                if (a instanceof bqob) {
                    bqob bqob = (bqob) a;
                    try {
                        bxxc a2 = bqob.f141329a.mo69297a(bxtx);
                        bqob.f141329a.mo69300a(a2);
                        bxxc b2 = bqob.f141329a.mo69315b(a2);
                        bqob.f141330b.mo69300a(b2);
                        bxvd da = bqsd.f141509d.mo74144da();
                        String a3 = bqob.f141330b.mo69299a();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a3.getClass();
                        ((bqsd) da.f164949b).f141511a = a3;
                        bxtx aL = b2.mo73639aL();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aL.getClass();
                        ((bqsd) da.f164949b).f141512b = aL;
                        int d = bqob.f141330b.mo69303d();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((bqsd) da.f164949b).f141513c = bqsc.m113308a(d);
                        bqsd bqsd2 = (bqsd) da.mo74062i();
                        bqok.m113112a(bqsd2);
                        bxvd da2 = bqsi.f141525e.mo74144da();
                        da2.mo73625a((bxvk) bqsi);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bqsd2.getClass();
                        ((bqsi) da2.f164949b).f141527a = bqsd2;
                        bqsh.mo69327a((bqsi) da2.mo74062i());
                        i++;
                    } catch (bxwf e) {
                        throw new GeneralSecurityException("expected serialized proto of type ", e);
                    }
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
                    sb.append("manager for key type ");
                    sb.append(str);
                    sb.append(" is not a PrivateKeyManager");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            int i2 = this.f141318a.f141533a;
            if (bqsh.f164950c) {
                bqsh.mo74035c();
                bqsh.f164950c = false;
            }
            ((bqsj) bqsh.f164949b).f141533a = i2;
            return new bqns((bqsj) bqsh.mo74062i());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* renamed from: a */
    public final Object mo69305a(Class cls) {
        return bqok.m113104a(bqok.m113101a(this, cls));
    }

    /* renamed from: a */
    public final void mo69306a(bqqi bqqi, bqng bqng) {
        bqsj bqsj = this.f141318a;
        byte[] a = bqng.mo69281a(bqsj.mo73642k(), new byte[0]);
        try {
            if (((bqsj) bxvk.m124016a(bqsj.f141531c, bqng.mo69282b(a, new byte[0]), bxus.m123743b())).equals(bqsj)) {
                bxvd da = bqrx.f141492c.mo74144da();
                bxtx a2 = bxtx.m123261a(a);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a2.getClass();
                ((bqrx) da.f164949b).f141494a = a2;
                bqsl a3 = bqol.m113118a(bqsj);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a3.getClass();
                ((bqrx) da.f164949b).f141495b = a3;
                if (!bqqi.f141373a.putString(bqqi.f141374b, bqvz.m113507a(((bqrx) da.mo74062i()).mo73642k())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (bxwf e) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }
}
