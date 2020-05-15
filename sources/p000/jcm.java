package p000;

import android.accounts.Account;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.KeyChainSnapshot;
import com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;

/* renamed from: jcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jcm {

    /* renamed from: a */
    public static final imn f22159a = new jcl();

    /* renamed from: b */
    public static final sek f22160b = jdh.m16547a("FolsomSyncManager");

    /* renamed from: c */
    public final jcf f22161c = ((jcf) jcf.f22150a.mo13145b());

    /* renamed from: d */
    private final jcj f22162d = ((jcj) jcj.f22155a.mo13145b());

    /* renamed from: e */
    private final Object f22163e;

    public jcm() {
        sek sek = jcs.f22185a;
        this.f22163e = new Object();
    }

    /* renamed from: b */
    private static PublicKey m16507b(byte[] bArr) {
        try {
            return bslu.m115950a(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new jck(11, e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jck.<init>(int, java.lang.Throwable):void
     arg types: [int, android.security.keystore.recovery.InternalRecoveryServiceException]
     candidates:
      jck.<init>(int, java.lang.String):void
      jck.<init>(int, java.lang.Throwable):void */
    /* renamed from: d */
    private static final jcs m16509d(jcp jcp) {
        try {
            return jcs.m16521a(rpr.m34216b(), jcp.f22180a, jcp);
        } catch (InternalRecoveryServiceException e) {
            throw new jck(9, (Throwable) e);
        }
    }

    /* renamed from: c */
    public final boolean mo13584c(jcp jcp) {
        try {
            if (jde.f22216b) {
                return jcs.m16521a(rpr.m34216b(), jcp.f22180a, jcp).mo13588a();
            }
            return false;
        } catch (InternalRecoveryServiceException | jck e) {
            f22160b.mo25411b("Error when checking if key sync is needed.", e, new Object[0]);
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jcf.a(java.lang.String, java.lang.String, boolean):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      jcf.a(java.lang.String, java.lang.String, java.util.List):void
      jcf.a(java.lang.String, java.lang.String, boolean):void */
    /* renamed from: a */
    private final bqmr m16499a(Account account, String str, jbg jbg) {
        try {
            sdo.m34959a((Object) str);
            bxtx bxtx = m16508b(account).f22086a;
            byte[] a = m16506a(m16507b(bxtx.mo73780k()), jbg.f22093b.mo73780k());
            bxvd da = bqmw.f141272c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxtx.getClass();
            ((bqmw) da.f164949b).f141274a = bxtx;
            bxvd da2 = bqmy.f141280c.mo74144da();
            int i = jbg.f22092a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bqmy) da2.f164949b).f141282a = i;
            bxtx a2 = bxtx.m123261a(a);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a2.getClass();
            ((bqmy) da2.f164949b).f141283b = a2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqmw bqmw = (bqmw) da.f164949b;
            bqmy bqmy = (bqmy) da2.mo74062i();
            bqmy.getClass();
            if (!bqmw.f141275b.mo73666a()) {
                bqmw.f141275b = bxvk.m124021a(bqmw.f141275b);
            }
            bqmw.f141275b.add(bqmy);
            bqmw bqmw2 = (bqmw) da.mo74062i();
            bxvd da3 = bqmx.f141276c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bqmx bqmx = (bqmx) da3.f164949b;
            str.getClass();
            bqmx.f141278a = str;
            bqmw2.getClass();
            if (!bqmx.f141279b.mo73666a()) {
                bqmx.f141279b = bxvk.m124021a(bqmx.f141279b);
            }
            bqmx.f141279b.add(bqmw2);
            bqmx bqmx2 = (bqmx) da3.mo74062i();
            bxvd da4 = bqmp.f141246b.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bqmp bqmp = (bqmp) da4.f164949b;
            bqmx2.getClass();
            if (!bqmp.f141248a.mo73666a()) {
                bqmp.f141248a = bxvk.m124021a(bqmp.f141248a);
            }
            bqmp.f141248a.add(bqmx2);
            return (bqmr) jbu.m16476a(rpr.m34216b(), account).mo13566a(new jbr((bqmp) da4.mo74062i()));
        } catch (eic e) {
            int i2 = e.f15030a;
            if (i2 == 0) {
                throw null;
            } else if (i2 == 8) {
                try {
                    this.f22161c.mo13572a(account.name, str, true);
                } catch (gid | IOException e2) {
                    f22160b.mo25412b("Could not set local keys stale.", new Object[0]);
                }
                throw new jck(12, e);
            } else {
                throw new jck(8, e);
            }
        }
    }

    /* renamed from: b */
    private final jbf m16508b(Account account) {
        try {
            List b = this.f22161c.mo13574b(account.name);
            if (b.size() == 1) {
                return (jbf) b.get(0);
            }
            throw new jck(11, "Missing key pair");
        } catch (gid | IOException e) {
            throw new jck(11, e);
        }
    }

    /* renamed from: b */
    public final void mo13583b(jcp jcp) {
        f22160b.mo25414c("Starting background sync for event: %s", jcp.f22182c.f22178j);
        FolsomGcmTaskChimeraService.m6613a(rpr.m34216b(), jcp.f22180a.name);
    }

    /* renamed from: a */
    private static PrivateKey m16500a(byte[] bArr) {
        try {
            return bslu.m115957b(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new jck(11, e);
        }
    }

    /* renamed from: a */
    private final jbg m16501a(Account account, String str) {
        try {
            List c = this.f22161c.mo13577c(account.name, str);
            if (!c.isEmpty()) {
                return (jbg) bnjd.m109595d(c);
            }
            f22160b.mo25412b("Generating SharedKey with epoch=0", new Object[0]);
            byte[] encoded = jdf.m16539a().getEncoded();
            bxvd da = jbg.f22090c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((jbg) da.f164949b).f22092a = 0;
            bxtx a = bxtx.m123261a(encoded);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((jbg) da.f164949b).f22093b = a;
            return (jbg) da.mo74062i();
        } catch (gid | IOException e) {
            throw new jck(12, e);
        }
    }

    /* renamed from: a */
    private final void m16502a(Account account) {
        try {
            if (this.f22161c.mo13574b(account.name).isEmpty()) {
                f22160b.mo25412b("Generating new KeyPair", new Object[0]);
                try {
                    KeyPair a = bslu.m115949a();
                    try {
                        byte[] a2 = bslu.m115954a(a.getPublic());
                        byte[] b = bslu.m115958b(a.getPrivate(), a.getPublic());
                        bxvd da = jbf.f22084e.mo74144da();
                        bxtx a3 = bxtx.m123261a(a2);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a3.getClass();
                        ((jbf) da.f164949b).f22086a = a3;
                        bxtx a4 = bxtx.m123261a(b);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a4.getClass();
                        ((jbf) da.f164949b).f22087b = a4;
                        jbf jbf = (jbf) da.mo74062i();
                        try {
                            jcf jcf = this.f22161c;
                            String str = account.name;
                            List asList = Arrays.asList(jbf);
                            bqfy.m112768a(jcf.f22152c.mo60777a(new jbz(jcf.f22151b.mo13599a(str), asList), bqfb.INSTANCE), IOException.class);
                        } catch (gid | IOException e) {
                            throw new jck(11, e);
                        }
                    } catch (InvalidKeyException e2) {
                        throw new jck(11, e2);
                    }
                } catch (NoSuchAlgorithmException e3) {
                    throw new IllegalStateException(e3);
                }
            }
        } catch (gid | IOException e4) {
            throw new jck(11, e4);
        }
    }

    /* renamed from: a */
    private static void m16503a(jcp jcp, int i) {
        jdg.m16545b(rpr.m34216b(), i, jcp.f22182c.f22179k);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jck.<init>(int, java.lang.Throwable):void
     arg types: [int, android.security.keystore.recovery.InternalRecoveryServiceException]
     candidates:
      jck.<init>(int, java.lang.String):void
      jck.<init>(int, java.lang.Throwable):void */
    /* renamed from: a */
    private static void m16504a(jcs jcs) {
        try {
            jcs.mo13590b();
            jcs.mo13587a(0);
        } catch (eic e) {
            throw new jck(8, e);
        } catch (InternalRecoveryServiceException e2) {
            throw new jck(9, (Throwable) e2);
        }
    }

    /* renamed from: a */
    private static byte[] m16505a(PrivateKey privateKey, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        try {
            byte[] bArr4 = jdf.f22218a;
            byte[] c = bslu.m115960c(null);
            if (privateKey == null) {
                if (c.length == 0) {
                    throw new IllegalArgumentException("Both the private key and shared secret are empty");
                }
            }
            byte[] c2 = bslu.m115960c(bArr4);
            ByteBuffer wrap = ByteBuffer.wrap(bslu.m115960c(bArr));
            if (Arrays.equals(bslu.m115952a(wrap, bslu.f144955a.length), bslu.f144955a)) {
                if (privateKey != null) {
                    bArr2 = bslu.m115953a(privateKey, bslu.m115950a(bslu.m115952a(wrap, 65)));
                    bArr3 = bslu.f144957c;
                } else {
                    bArr2 = bslu.f144959e;
                    bArr3 = bslu.f144958d;
                }
                return bslu.m115959b(bslu.m115951a(bslu.m115956a(bArr2, c), bslu.f144956b, bArr3), bslu.m115952a(wrap, 12), bslu.m115952a(wrap, wrap.remaining()), c2);
            }
            throw new IllegalArgumentException("The payload was not encrypted by SecureBox v2");
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException e) {
            throw new jck(11, e);
        }
    }

    /* renamed from: a */
    private static byte[] m16506a(PublicKey publicKey, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        try {
            byte[] bArr4 = jdf.f22218a;
            KeyPair keyPair = null;
            byte[] c = bslu.m115960c(null);
            if (publicKey == null) {
                if (c.length == 0) {
                    throw new IllegalArgumentException("Both the public key and shared secret are empty");
                }
            }
            byte[] c2 = bslu.m115960c(bArr4);
            byte[] c3 = bslu.m115960c(bArr);
            if (publicKey != null) {
                keyPair = bslu.m115949a();
                bArr2 = bslu.m115953a(keyPair.getPrivate(), publicKey);
                bArr3 = bslu.f144957c;
            } else {
                bArr2 = bslu.f144959e;
                bArr3 = bslu.f144958d;
            }
            byte[] bArr5 = new byte[12];
            new SecureRandom().nextBytes(bArr5);
            byte[] a = bslu.m115955a(bslu.m115951a(bslu.m115956a(bArr2, c), bslu.f144956b, bArr3), bArr5, c3, c2);
            if (keyPair != null) {
                return bslu.m115956a(bslu.f144955a, bslu.m115954a(keyPair.getPublic()), bArr5, a);
            }
            return bslu.m115956a(bslu.f144955a, bArr5, a);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new jck(11, e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jck.<init>(int, java.lang.Throwable):void
     arg types: [int, android.security.keystore.recovery.InternalRecoveryServiceException]
     candidates:
      jck.<init>(int, java.lang.String):void
      jck.<init>(int, java.lang.Throwable):void */
    /* renamed from: a */
    public final void mo13581a() {
        bngx bngx;
        try {
            ArrayList arrayList = new ArrayList(this.f22162d.mo13578a());
            KeyChainSnapshot keyChainSnapshot = this.f22162d.f22157b.getKeyChainSnapshot();
            if (keyChainSnapshot != null) {
                bngx = bngx.m109355a(bnjd.m109575a((Iterable) keyChainSnapshot.getWrappedApplicationKeys(), jch.f22154a));
            } else {
                bngx = bngx.m109376e();
            }
            arrayList.retainAll(bngx);
            if (arrayList.isEmpty()) {
                f22160b.mo25412b("KeyChainSnapshot doesn't contain necessary key", new Object[0]);
                this.f22162d.mo13580b();
                throw new jck(10, "Wrapping key is being generated.");
            }
        } catch (InternalRecoveryServiceException e) {
            throw new jck(10, (Throwable) e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jcf.a(java.lang.String, java.lang.String, boolean):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      jcf.a(java.lang.String, java.lang.String, java.util.List):void
      jcf.a(java.lang.String, java.lang.String, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01dc, code lost:
        ((p000.jbg) r12.f164949b).f22092a = r15;
        r9 = p000.bxtx.m123261a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e8, code lost:
        if (r12.f164950c != false) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01eb, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f1, code lost:
        r9.getClass();
        ((p000.jbg) r12.f164949b).f22093b = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r1.f22161c.mo13570a(r5.name, r14.f141278a, p000.bngx.m109356a((p000.jbg) r12.mo74062i()));
        r1.f22161c.mo13571a(r5.name, r14.f141278a, r10, r8.f141282a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01bd, code lost:
        r9 = m16505a(r13, r8.f141283b.mo73780k());
        r12 = p000.jbg.f22090c.mo74144da();
        r15 = r8.f141282a;
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d3, code lost:
        if (r12.f164950c != false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d6, code lost:
        r12.mo74035c();
        r12.f164950c = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0311 A[Catch:{ gid | IOException -> 0x031b, gid | IOException -> 0x02ec, eic -> 0x0270, gid | IOException -> 0x025b, gid | IOException -> 0x0219, gid | IOException -> 0x00bb, jck -> 0x009f, jck -> 0x033e }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0312 A[Catch:{ gid | IOException -> 0x031b, gid | IOException -> 0x02ec, eic -> 0x0270, gid | IOException -> 0x025b, gid | IOException -> 0x0219, gid | IOException -> 0x00bb, jck -> 0x009f, jck -> 0x033e }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011f A[Catch:{ gid | IOException -> 0x031b, gid | IOException -> 0x02ec, eic -> 0x0270, gid | IOException -> 0x025b, gid | IOException -> 0x0219, gid | IOException -> 0x00bb, jck -> 0x009f, jck -> 0x033e }] */
    /* renamed from: a */
    public final void mo13582a(jcp jcp) {
        int i;
        jcs jcs;
        bmxv bmxv;
        Iterator it;
        Iterator it2;
        bxtx bxtx;
        PrivateKey privateKey;
        jcp jcp2 = jcp;
        synchronized (this.f22163e) {
            try {
                f22160b.mo25414c("Starting sync for event: %s", jcp2.f22182c.f22178j);
                boolean z = jde.f22216b;
                if (!z) {
                    if (jcp2.f22183d.mo66813a()) {
                        f22160b.mo25412b("Android Framework doesn't support consent update", new Object[0]);
                        throw new jck(9, "Device doesn't support RecoveryController API");
                    }
                }
                m16502a(jcp2.f22180a);
                Account account = jcp2.f22180a;
                int i2 = 12;
                for (Map.Entry entry : this.f22161c.mo13569a(account.name).entrySet()) {
                    String str = (String) entry.getKey();
                    bxwc bxwc = ((jbh) entry.getValue()).f22097b;
                    if (!bxwc.isEmpty()) {
                        int i3 = ((jbg) bnjd.m109595d(bxwc)).f22092a;
                        if (i3 != 0) {
                            try {
                                for (jbf jbf : this.f22161c.mo13574b(account.name)) {
                                    Integer num = (Integer) Collections.unmodifiableMap(jbf.f22088c).get(str);
                                    if (num != null) {
                                        if (i3 >= num.intValue()) {
                                            i = 12;
                                        }
                                    }
                                    m16499a(account, str, (jbg) bnjd.m109595d(bxwc));
                                    this.f22161c.mo13571a(account.name, str, jbf, i3);
                                    i = 12;
                                }
                                i2 = 12;
                            } catch (IOException e) {
                                e = e;
                                throw new jck(11, e);
                            } catch (gid e2) {
                                e = e2;
                                throw new jck(11, e);
                            }
                        } else {
                            i2 = 12;
                        }
                    } else {
                        i2 = 12;
                    }
                }
                if (z) {
                    jcs d = m16509d(jcp);
                    if (d.mo13588a()) {
                        mo13581a();
                        jcs = d;
                        boolean z2 = !z && ((Boolean) jcp2.f22183d.mo66812a(false)).booleanValue();
                        Account account2 = jcp2.f22180a;
                        bmxv = jcp2.f22181b;
                        if (bmxv.mo66813a()) {
                            String str2 = (String) bmxv.mo66814b();
                            try {
                                if (this.f22161c.mo13575b(account2.name, str2)) {
                                    bxvd da = bqms.f141256b.mo74144da();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    ((bqms) da.f164949b).f141258a = 1;
                                    bxwc bxwc2 = ((bqmt) jbu.m16476a(rpr.m34216b(), account2).mo13566a(new jbs((bqms) da.mo74062i()))).f141261a;
                                    jbf b = m16508b(account2);
                                    bxtx bxtx2 = b.f22086a;
                                    PrivateKey a = m16500a(b.f22087b.mo73780k());
                                    Iterator it3 = bxwc2.iterator();
                                    while (it.hasNext()) {
                                        bqmx bqmx = (bqmx) it.next();
                                        Iterator it4 = bqmx.f141279b.iterator();
                                        boolean z3 = false;
                                        while (true) {
                                            if (it4.hasNext()) {
                                                bqmw bqmw = (bqmw) it4.next();
                                                it2 = it;
                                                if (bqmw.f141274a.equals(bxtx2)) {
                                                    bxwc bxwc3 = bqmw.f141275b;
                                                    if (!bxwc3.isEmpty()) {
                                                        bqmy bqmy = (bqmy) bnjd.m109595d(bxwc3);
                                                        bxtx = bxtx2;
                                                        if (bqmy.f141282a > m16501a(account2, bqmx.f141278a).f22092a) {
                                                            break;
                                                        }
                                                        it = it2;
                                                        bxtx2 = bxtx;
                                                    } else {
                                                        it = it2;
                                                    }
                                                    z3 = true;
                                                } else {
                                                    it = it2;
                                                }
                                            } else {
                                                it2 = it;
                                                bxtx = bxtx2;
                                                privateKey = a;
                                                if (!z3) {
                                                    it3 = it2;
                                                    bxtx2 = bxtx;
                                                    a = privateKey;
                                                }
                                            }
                                        }
                                        this.f22161c.mo13572a(account2.name, bqmx.f141278a, false);
                                        it3 = it2;
                                        bxtx2 = bxtx;
                                        a = privateKey;
                                    }
                                }
                                jbg a2 = m16501a(account2, str2);
                                if (a2.f22092a == 0 && z2) {
                                    for (bqmq bqmq : m16499a(account2, (String) bmxv.mo66814b(), a2).f141255a) {
                                        String str3 = bqmq.f141251a;
                                        int i4 = bqmq.f141252b;
                                        bxvd bxvd = (bxvd) a2.mo74142c(5);
                                        bxvd.mo73625a((bxvk) a2);
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        jbg jbg = jbg.f22090c;
                                        ((jbg) bxvd.f164949b).f22092a = i4;
                                        this.f22161c.mo13570a(account2.name, str3, Arrays.asList((jbg) bxvd.mo74062i()));
                                        this.f22161c.mo13572a(account2.name, str3, false);
                                        this.f22161c.mo13571a(account2.name, str3, m16508b(account2), i4);
                                    }
                                }
                            } catch (IOException e3) {
                                e = e3;
                                throw new jck(12, e);
                            } catch (gid e4) {
                                e = e4;
                                throw new jck(12, e);
                            }
                        }
                        if (jcs == null) {
                            m16504a(jcs);
                        }
                        m16503a(jcp2, 3);
                    }
                }
                jcs = null;
                if (!z) {
                }
                Account account22 = jcp2.f22180a;
                bmxv = jcp2.f22181b;
                if (bmxv.mo66813a()) {
                }
                if (jcs == null) {
                }
                m16503a(jcp2, 3);
                try {
                } catch (Throwable th) {
                    throw th;
                }
            } catch (gid | IOException e5) {
                throw new jck(12, e5);
            } catch (gid | IOException e6) {
                Throwable th2 = e6;
                f22160b.mo25417e("Can't store shared key epoch.", th2, new Object[0]);
                throw new jck(12, th2);
            } catch (eic e7) {
                throw new jck(8, e7);
            } catch (gid | IOException e8) {
                throw new jck(12, e8);
            } catch (gid | IOException e9) {
                throw new jck(12, e9);
            } catch (gid | IOException e10) {
                throw new jck(12, e10);
            } catch (jck e11) {
                jck jck = e11;
                int i5 = jck.f22158a;
                if (i5 == 0) {
                    throw null;
                } else if (i5 == i) {
                    f22160b.mo25412b("JoinSecurityDomains failed, key retrieval may be needed.", new Object[0]);
                } else {
                    throw jck;
                }
            } catch (jck e12) {
                jck jck2 = e12;
                m16503a(jcp2, jck2.f22158a);
                throw jck2;
            }
        }
    }
}
