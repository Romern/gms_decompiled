package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bqok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqok {

    /* renamed from: a */
    private static final Logger f141335a = Logger.getLogger(bqok.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap f141336b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap f141337c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap f141338d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap f141339e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap f141340f = new ConcurrentHashMap();

    @Deprecated
    /* renamed from: a */
    public static bqnh m113099a(String str) {
        if (str != null) {
            bqnh bqnh = (bqnh) f141339e.get(str.toLowerCase());
            if (bqnh != null) {
                return bqnh;
            }
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: b */
    public static bqnm m113114b(String str) {
        return m113117c(str).mo69317a();
    }

    /* renamed from: c */
    private static synchronized bqoj m113117c(String str) {
        bqoj bqoj;
        synchronized (bqok.class) {
            if (!f141336b.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() == 0 ? new String("No key manager found for key type ") : "No key manager found for key type ".concat(valueOf));
            }
            bqoj = (bqoj) f141336b.get(str);
        }
        return bqoj;
    }

    /* renamed from: b */
    private static bqoj m113115b(bqnr bqnr) {
        return new bqog(bqnr);
    }

    /* renamed from: b */
    public static synchronized bxxc m113116b(bqsf bqsf) {
        bxxc b;
        synchronized (bqok.class) {
            bqnm b2 = m113114b(bqsf.f141516a);
            if (((Boolean) f141338d.get(bqsf.f141516a)).booleanValue()) {
                b = b2.mo69289b(bqsf.f141517b);
            } else {
                String valueOf = String.valueOf(bqsf.f141516a);
                throw new GeneralSecurityException(valueOf.length() == 0 ? new String("newKey-operation not permitted for key type ") : "newKey-operation not permitted for key type ".concat(valueOf));
            }
        }
        return b;
    }

    /* renamed from: a */
    public static bqnm m113100a(String str, Class cls) {
        bqoj c = m113117c(str);
        if (cls == null) {
            return c.mo69317a();
        }
        if (c.mo69320c().contains(cls)) {
            return c.mo69318a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(c.mo69319b());
        Set<Class> c2 = c.mo69320c();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : c2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        int length = String.valueOf(name).length();
        StringBuilder sb3 = new StringBuilder(length + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    /* renamed from: a */
    public static bqnz m113101a(bqns bqns, Class cls) {
        byte[] bArr;
        bqol.m113120b(bqns.f141318a);
        bqnz bqnz = new bqnz(cls);
        bxwc bxwc = bqns.f141318a.f141534b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bqsi bqsi = (bqsi) bxwc.get(i);
            int b = bqse.m113312b(bqsi.f141528b);
            if (b != 0 && b == 3) {
                bqsd bqsd = bqsi.f141527a;
                if (bqsd == null) {
                    bqsd = bqsd.f141509d;
                }
                String str = bqsd.f141511a;
                bqsd bqsd2 = bqsi.f141527a;
                if (bqsd2 == null) {
                    bqsd2 = bqsd.f141509d;
                }
                Object a = m113105a(str, bqsd2.f141512b, cls);
                int b2 = bqse.m113312b(bqsi.f141528b);
                if (b2 == 0 || b2 != 3) {
                    throw new GeneralSecurityException("only ENABLED key is allowed");
                }
                int b3 = bqsq.m113326b(bqsi.f141530d);
                int i2 = 1;
                if (b3 == 0) {
                    b3 = 1;
                }
                int i3 = b3 - 2;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            bArr = bqni.f141307a;
                        } else if (i3 != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    }
                    bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(bqsi.f141529c).array();
                } else {
                    bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(bqsi.f141529c).array();
                }
                int b4 = bqse.m113312b(bqsi.f141528b);
                if (b4 == 0) {
                    b4 = 1;
                }
                int b5 = bqsq.m113326b(bqsi.f141530d);
                if (b5 != 0) {
                    i2 = b5;
                }
                bqny bqny = new bqny(a, bArr, b4, i2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(bqny);
                String str2 = new String(bqny.mo69312a(), bqnz.f141325a);
                List list = (List) bqnz.f141326b.put(str2, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(bqny);
                    bqnz.f141326b.put(str2, Collections.unmodifiableList(arrayList2));
                }
                if (bqsi.f141529c != bqns.f141318a.f141533a) {
                    continue;
                } else if (bqny.f141322b == 3) {
                    List list2 = (List) bqnz.f141326b.get(new String(bqny.mo69312a(), bqnz.f141325a));
                    if (list2 == null) {
                        list2 = Collections.emptyList();
                    }
                    if (!list2.isEmpty()) {
                        bqnz.f141327c = bqny;
                    } else {
                        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                    }
                } else {
                    throw new IllegalArgumentException("the primary entry has to be ENABLED");
                }
            }
        }
        return bqnz;
    }

    /* renamed from: a */
    private static bqoi m113102a() {
        return new bqoi();
    }

    /* renamed from: a */
    public static synchronized bqsd m113103a(bqsf bqsf) {
        bqsd c;
        synchronized (bqok.class) {
            bqnm b = m113114b(bqsf.f141516a);
            if (((Boolean) f141338d.get(bqsf.f141516a)).booleanValue()) {
                c = b.mo69291c(bqsf.f141517b);
            } else {
                String valueOf = String.valueOf(bqsf.f141516a);
                throw new GeneralSecurityException(valueOf.length() == 0 ? new String("newKey-operation not permitted for key type ") : "newKey-operation not permitted for key type ".concat(valueOf));
            }
        }
        return c;
    }

    /* renamed from: a */
    public static Object m113104a(bqnz bqnz) {
        bqoa bqoa = (bqoa) f141340f.get(bqnz.f141328d);
        if (bqoa != null) {
            return bqoa.mo69314a(bqnz);
        }
        String valueOf = String.valueOf(bqnz.f141328d.getName());
        throw new GeneralSecurityException(valueOf.length() == 0 ? new String("No wrapper found for ") : "No wrapper found for ".concat(valueOf));
    }

    /* renamed from: a */
    private static Object m113105a(String str, bxtx bxtx, Class cls) {
        return m113100a(str, cls).mo69286a(bxtx);
    }

    /* renamed from: a */
    public static Object m113106a(String str, bxxc bxxc, Class cls) {
        return m113100a(str, cls).mo69287a(bxxc);
    }

    /* renamed from: a */
    public static Object m113107a(String str, byte[] bArr, Class cls) {
        return m113105a(str, bxtx.m123261a(bArr), cls);
    }

    /* renamed from: a */
    public static synchronized void m113108a(bqnm bqnm, boolean z) {
        synchronized (bqok.class) {
            if (bqnm != null) {
                String a = bqnm.mo69288a();
                m113113a(a, bqnm.getClass(), z);
                if (!f141336b.containsKey(a)) {
                    f141336b.put(a, new bqof(bqnm));
                }
                f141338d.put(a, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqok.a(java.lang.String, java.lang.Class, boolean):void
     arg types: [java.lang.String, java.lang.Class<?>, int]
     candidates:
      bqok.a(java.lang.String, bxtx, java.lang.Class):java.lang.Object
      bqok.a(java.lang.String, bxxc, java.lang.Class):java.lang.Object
      bqok.a(java.lang.String, byte[], java.lang.Class):java.lang.Object
      bqok.a(java.lang.String, java.lang.Class, boolean):void */
    /* renamed from: a */
    public static synchronized void m113109a(bqnr bqnr) {
        synchronized (bqok.class) {
            String a = bqnr.mo69299a();
            m113113a(a, (Class) bqnr.getClass(), true);
            if (!f141336b.containsKey(a)) {
                f141336b.put(a, m113115b(bqnr));
                f141337c.put(a, m113102a());
            }
            f141338d.put(a, true);
        }
    }

    /* renamed from: a */
    public static synchronized void m113110a(bqoa bqoa) {
        synchronized (bqok.class) {
            if (bqoa != null) {
                Class a = bqoa.mo69313a();
                if (f141340f.containsKey(a)) {
                    bqoa bqoa2 = (bqoa) f141340f.get(a);
                    if (!bqoa.getClass().equals(bqoa2.getClass())) {
                        Logger logger = f141335a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(a.toString());
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() == 0 ? new String("Attempted overwrite of a registered SetWrapper for type ") : "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf));
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", a.getName(), bqoa2.getClass().getName(), bqoa.getClass().getName()));
                    }
                }
                f141340f.put(a, bqoa);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqok.a(java.lang.String, java.lang.Class, boolean):void
     arg types: [java.lang.String, java.lang.Class<?>, int]
     candidates:
      bqok.a(java.lang.String, bxtx, java.lang.Class):java.lang.Object
      bqok.a(java.lang.String, bxxc, java.lang.Class):java.lang.Object
      bqok.a(java.lang.String, byte[], java.lang.Class):java.lang.Object
      bqok.a(java.lang.String, java.lang.Class, boolean):void */
    /* renamed from: a */
    public static synchronized void m113111a(bqoc bqoc, bqnr bqnr) {
        Class d;
        synchronized (bqok.class) {
            String a = bqoc.mo69299a();
            String a2 = bqnr.mo69299a();
            m113113a(a, (Class) bqoc.getClass(), true);
            m113113a(a2, (Class) bqnr.getClass(), false);
            if (!a.equals(a2)) {
                if (f141336b.containsKey(a) && (d = ((bqoj) f141336b.get(a)).mo69321d()) != null) {
                    if (!d.equals(bqnr.getClass())) {
                        Logger logger = f141335a;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 96 + String.valueOf(a2).length());
                        sb.append("Attempted overwrite of a registered key manager for key type ");
                        sb.append(a);
                        sb.append(" with inconsistent public key type ");
                        sb.append(a2);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", bqoc.getClass().getName(), d.getName(), bqnr.getClass().getName()));
                    }
                }
                if (!f141336b.containsKey(a) || ((bqoj) f141336b.get(a)).mo69321d() == null) {
                    f141336b.put(a, new bqoh(bqoc, bqnr));
                    f141337c.put(a, m113102a());
                }
                f141338d.put(a, true);
                if (!f141336b.containsKey(a2)) {
                    f141336b.put(a2, m113115b(bqnr));
                }
                f141338d.put(a2, false);
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m113112a(bqsd bqsd) {
        m113105a(bqsd.f141511a, bqsd.f141512b, (Class) null);
    }

    /* renamed from: a */
    private static synchronized void m113113a(String str, Class cls, boolean z) {
        synchronized (bqok.class) {
            if (f141336b.containsKey(str)) {
                bqoj bqoj = (bqoj) f141336b.get(str);
                if (!bqoj.mo69319b().equals(cls)) {
                    Logger logger = f141335a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(str);
                    logger.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", valueOf.length() == 0 ? new String("Attempted overwrite of a registered key manager for key type ") : "Attempted overwrite of a registered key manager for key type ".concat(valueOf));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, bqoj.mo69319b().getName(), cls.getName()));
                } else if (z && !((Boolean) f141338d.get(str)).booleanValue()) {
                    String valueOf2 = String.valueOf(str);
                    throw new GeneralSecurityException(valueOf2.length() == 0 ? new String("New keys are already disallowed for key type ") : "New keys are already disallowed for key type ".concat(valueOf2));
                }
            }
        }
    }
}
