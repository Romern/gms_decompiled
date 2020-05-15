package p000;

import android.accounts.Account;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: akcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akcl {

    /* renamed from: a */
    public final akbu f71593a;

    /* renamed from: b */
    public final akhl f71594b;

    /* renamed from: c */
    public boolean f71595c;

    /* renamed from: d */
    public final ExecutorService f71596d = ahhr.m55807c();

    /* renamed from: e */
    private final Context f71597e;

    /* renamed from: f */
    private final SecureRandom f71598f;

    /* renamed from: g */
    private final akhf f71599g;

    /* renamed from: h */
    private final bxtx f71600h;

    /* renamed from: i */
    private int f71601i = 0;

    public akcl(Context context, akbu akbu, akhf akhf, akhl akhl, bxtx bxtx) {
        this.f71597e = context;
        this.f71593a = akbu;
        this.f71599g = akhf;
        this.f71594b = akhl;
        this.f71598f = new SecureRandom();
        this.f71600h = bxtx;
    }

    /* renamed from: a */
    private static long m59347a(long j, long j2) {
        long j3 = j + j2;
        if (j2 < 0 && j3 > j) {
            return Long.MIN_VALUE;
        }
        if (j2 <= 0 || j3 >= j) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    private static final boolean m59354b(ajhi ajhi) {
        return ajhi.f70642f <= System.currentTimeMillis();
    }

    /* renamed from: c */
    private static final boolean m59357c(ajhi ajhi) {
        long currentTimeMillis = System.currentTimeMillis();
        return ajhi.f70641e <= currentTimeMillis && currentTimeMillis < ajhi.f70642f;
    }

    /* renamed from: g */
    private final ajhj m59359g(Account account) {
        byte[] bArr;
        String str;
        ajhj ajhj;
        long j;
        String str2;
        int i;
        int i2;
        ajhj ajhj2;
        String str3;
        long j2;
        String str4;
        long j3;
        String str5;
        String str6;
        long j4;
        String str7;
        Account account2 = account;
        String f = this.f71593a.mo39177f();
        if (f != null) {
            bArr = f.getBytes();
        } else {
            bArr = null;
        }
        bxwc bxwc = mo39200b(account).f70655a;
        int size = bxwc.size();
        char c = 0;
        int i3 = 0;
        while (true) {
            str = "g";
            if (i3 >= size) {
                break;
            }
            ajhj ajhj3 = (ajhj) bxwc.get(i3);
            ajhi ajhi = ajhj3.f70651b;
            if (ajhi == null) {
                ajhi = ajhi.f70635l;
            }
            if (m59349a(ajhi, bArr)) {
                ajhi ajhi2 = ajhj3.f70652c;
                if (ajhi2 == null) {
                    ajhi2 = ajhi.f70635l;
                }
                i3++;
                if (!m59349a(ajhi2, bArr)) {
                    break;
                }
            } else {
                break;
            }
        }
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcl", str, 1103, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Current private certificates are not advertisable. Deleting all.");
        mo39211e(account);
        long currentTimeMillis = System.currentTimeMillis();
        bxwc bxwc2 = mo39200b(account).f70655a;
        int size2 = bxwc2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            ajhj ajhj4 = (ajhj) bxwc2.get(i5);
            ajhi ajhi3 = ajhj4.f70651b;
            if (ajhi3 == null) {
                ajhi3 = ajhi.f70635l;
            }
            if (!m59354b(ajhi3)) {
                ajhi ajhi4 = ajhj4.f70651b;
                if (ajhi4 == null) {
                    ajhi4 = ajhi.f70635l;
                }
                currentTimeMillis = Math.max(currentTimeMillis, ajhi4.f70642f);
                i4++;
            }
        }
        int i6 = i4;
        while (i6 < 3) {
            String f2 = this.f71593a.mo39177f();
            String d = this.f71593a.mo39175d();
            String e = this.f71593a.mo39176e();
            if (TextUtils.isEmpty(f2) || TextUtils.isEmpty(d) || TextUtils.isEmpty(e)) {
                i = i6;
                j = currentTimeMillis;
                str2 = str;
                i2 = i4;
                ajhj2 = null;
            } else {
                byte[] a = mo39198a(32);
                byte[][] bArr2 = new byte[1][];
                bArr2[c] = a;
                byte[] a2 = m59353a(bArr2);
                byte[] a3 = mo39198a(32);
                byte[] a4 = m59353a(a3);
                if (a2 == null) {
                    i = i6;
                    j3 = currentTimeMillis;
                    str5 = str;
                    i2 = i4;
                    str4 = "a";
                } else if (a4 != null) {
                    i2 = i4;
                    i = i6;
                    String encodeToString = Base64.encodeToString(a2, 11);
                    String encodeToString2 = Base64.encodeToString(a4, 11);
                    if (encodeToString == null) {
                        j4 = currentTimeMillis;
                        str2 = str;
                        str6 = "a";
                    } else if (encodeToString2 != null) {
                        str2 = str;
                        String str8 = encodeToString.length() == 0 ? new String("nearby_sharing_paired_key_alias_") : "nearby_sharing_paired_key_alias_".concat(encodeToString);
                        String str9 = encodeToString2.length() == 0 ? new String("nearby_sharing_paired_key_alias_") : "nearby_sharing_paired_key_alias_".concat(encodeToString2);
                        X509Certificate a5 = mo39189a(str8, currentTimeMillis);
                        X509Certificate a6 = mo39189a(str9, currentTimeMillis);
                        if (a5 == null) {
                            j = currentTimeMillis;
                            str7 = "a";
                        } else if (a6 != null) {
                            j = currentTimeMillis;
                            bxvd da = ajhi.f70635l.mo74144da();
                            bxtx a7 = bxtx.m123261a(a2);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ajhi ajhi5 = (ajhi) da.f164949b;
                            a7.getClass();
                            String str10 = "a";
                            int i7 = ajhi5.f70637a | 1;
                            ajhi5.f70637a = i7;
                            ajhi5.f70638b = a7;
                            str8.getClass();
                            ajhi5.f70637a = i7 | 2;
                            ajhi5.f70639c = str8;
                            long time = a5.getNotBefore().getTime();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ajhi ajhi6 = (ajhi) da.f164949b;
                            ajhi6.f70637a |= 8;
                            ajhi6.f70641e = time;
                            long time2 = a5.getNotAfter().getTime();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ajhi ajhi7 = (ajhi) da.f164949b;
                            ajhi7.f70637a |= 16;
                            ajhi7.f70642f = time2;
                            bxtx a8 = bxtx.m123261a(a);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ajhi ajhi8 = (ajhi) da.f164949b;
                            a8.getClass();
                            ajhi8.f70637a |= 4;
                            ajhi8.f70640d = a8;
                            bxtx a9 = bxtx.m123261a(mo39198a(14));
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ajhi ajhi9 = (ajhi) da.f164949b;
                            a9.getClass();
                            int i8 = ajhi9.f70637a | 32;
                            ajhi9.f70637a = i8;
                            ajhi9.f70644h = a9;
                            f2.getClass();
                            int i9 = i8 | 64;
                            ajhi9.f70637a = i9;
                            ajhi9.f70645i = f2;
                            d.getClass();
                            int i10 = i9 | 128;
                            ajhi9.f70637a = i10;
                            ajhi9.f70646j = d;
                            e.getClass();
                            ajhi9.f70637a = i10 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            ajhi9.f70647k = e;
                            ajhi ajhi10 = (ajhi) da.mo74062i();
                            bxvd da2 = ajhi.f70635l.mo74144da();
                            bxtx a10 = bxtx.m123261a(a4);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ajhi ajhi11 = (ajhi) da2.f164949b;
                            a10.getClass();
                            int i11 = ajhi11.f70637a | 1;
                            ajhi11.f70637a = i11;
                            ajhi11.f70638b = a10;
                            str9.getClass();
                            ajhi11.f70637a = i11 | 2;
                            ajhi11.f70639c = str9;
                            long time3 = a5.getNotBefore().getTime();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ajhi ajhi12 = (ajhi) da2.f164949b;
                            ajhi12.f70637a |= 8;
                            ajhi12.f70641e = time3;
                            long time4 = a5.getNotAfter().getTime();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ajhi ajhi13 = (ajhi) da2.f164949b;
                            ajhi13.f70637a |= 16;
                            ajhi13.f70642f = time4;
                            bxtx a11 = bxtx.m123261a(a3);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ajhi ajhi14 = (ajhi) da2.f164949b;
                            a11.getClass();
                            ajhi14.f70637a |= 4;
                            ajhi14.f70640d = a11;
                            bxtx a12 = bxtx.m123261a(mo39198a(14));
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ajhi ajhi15 = (ajhi) da2.f164949b;
                            a12.getClass();
                            int i12 = ajhi15.f70637a | 32;
                            ajhi15.f70637a = i12;
                            ajhi15.f70644h = a12;
                            f2.getClass();
                            int i13 = i12 | 64;
                            ajhi15.f70637a = i13;
                            ajhi15.f70645i = f2;
                            d.getClass();
                            int i14 = i13 | 128;
                            ajhi15.f70637a = i14;
                            ajhi15.f70646j = d;
                            e.getClass();
                            ajhi15.f70637a = i14 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            ajhi15.f70647k = e;
                            ajhi ajhi16 = (ajhi) da2.mo74062i();
                            bxvd da3 = ajhj.f70648d.mo74144da();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            ajhj ajhj5 = (ajhj) da3.f164949b;
                            ajhi10.getClass();
                            ajhj5.f70651b = ajhi10;
                            int i15 = ajhj5.f70650a | 1;
                            ajhj5.f70650a = i15;
                            ajhi16.getClass();
                            ajhj5.f70652c = ajhi16;
                            ajhj5.f70650a = i15 | 2;
                            ajhj2 = (ajhj) da3.mo74062i();
                            if (!mo39196a(account2, ajhj2)) {
                                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                                bnsl2.mo68432a("akcl", str10, 416, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("Failed to create private certificate because it failed to save the certificate.");
                                ajhj2 = null;
                            }
                        } else {
                            j = currentTimeMillis;
                            str7 = "a";
                        }
                        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl3.mo68432a("akcl", str7, 371, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68424a("Failed to create private certificate because it failed to create the certificate with alias %s, %s.", str8, str9);
                        ajhj2 = null;
                    } else {
                        j4 = currentTimeMillis;
                        str2 = str;
                        str6 = "a";
                    }
                    bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl4.mo68432a("akcl", str6, 359, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("Failed to create private certificate because it failed to create the paired key alias.");
                    ajhj2 = null;
                } else {
                    i = i6;
                    j3 = currentTimeMillis;
                    str5 = str;
                    i2 = i4;
                    str4 = "a";
                }
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl5.mo68432a("akcl", str4, 351, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Failed to create private certificate because it failed to create a secret id.");
                ajhj2 = null;
            }
            if (ajhj2 == null) {
                bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
                str3 = str2;
                bnsl6.mo68432a("akcl", str3, 1124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68405a("Failed to create new private certificate.");
                j2 = j;
            } else {
                str3 = str2;
                ajhi ajhi17 = ajhj2.f70651b;
                if (ajhi17 == null) {
                    ajhi17 = ajhi.f70635l;
                }
                j2 = ajhi17.f70642f;
            }
            str = str3;
            i4 = i2;
            currentTimeMillis = j2;
            i6 = i + 1;
            c = 0;
        }
        int i16 = i4;
        bxwc bxwc3 = mo39200b(account).f70655a;
        int size3 = bxwc3.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                ajhj = null;
                break;
            }
            ajhj ajhj6 = (ajhj) bxwc3.get(i17);
            ajhi ajhi18 = ajhj6.f70651b;
            if (ajhi18 == null) {
                ajhi18 = ajhi.f70635l;
            }
            if (m59357c(ajhi18)) {
                ajhi ajhi19 = ajhj6.f70652c;
                if (ajhi19 == null) {
                    ajhi19 = ajhi.f70635l;
                }
                if (m59357c(ajhi19)) {
                    ajhj = ajhj6;
                    break;
                }
            }
            i17++;
        }
        if (ajhj == null) {
            mo39211e(account);
            if (this.f71601i != 0 && (TextUtils.isEmpty(this.f71593a.mo39176e()) || TextUtils.isEmpty(this.f71593a.mo39175d()))) {
                mo39194a(new akch(this, account2));
            }
        } else if (i16 < 3) {
            mo39194a(new akci(this, account2));
        }
        return ajhj;
    }

    /* renamed from: h */
    private final File m59360h(Account account) {
        return akhu.m59725a(this.f71597e, account, "nearby_sharing_public_certificate_book");
    }

    /* renamed from: j */
    private final akck m59361j() {
        return new akck(akid.m59789a(14, this.f71598f), akid.m59789a(2, this.f71598f));
    }

    /* renamed from: k */
    private final void m59362k() {
        FileInputStream fileInputStream;
        List a = akhu.m59728a(this.f71597e, "nearby_sharing_private_certificate_book");
        int size = a.size();
        for (int i = 0; i < size; i++) {
            try {
                fileInputStream = new FileInputStream((File) a.get(i));
                for (ajhj ajhj : ((ajhk) bxvk.m124010a(ajhk.f70653b, fileInputStream)).f70655a) {
                    try {
                        akhf akhf = this.f71599g;
                        ajhi ajhi = ajhj.f70651b;
                        if (ajhi == null) {
                            ajhi = ajhi.f70635l;
                        }
                        akhf.mo39444b(ajhi.f70639c);
                    } catch (KeyStoreException e) {
                    }
                    try {
                        akhf akhf2 = this.f71599g;
                        ajhi ajhi2 = ajhj.f70652c;
                        if (ajhi2 == null) {
                            ajhi2 = ajhi.f70635l;
                        }
                        akhf2.mo39444b(ajhi2.f70639c);
                    } catch (KeyStoreException e2) {
                    }
                }
                fileInputStream.close();
            } catch (bxwf e3) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68437a(e3);
                bnsl.mo68432a("akcl", "k", 1585, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to read proto objects. Delete all certificate files.");
                mo39214g();
            } catch (IOException e4) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e4);
                bnsl2.mo68432a("akcl", "k", 1589, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to read PRIVATE_CERTIFICATES_BOOK");
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        return;
        throw th;
    }

    /* renamed from: b */
    public final synchronized void mo39202b(int i) {
        this.f71601i = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0028, code lost:
        return null;
     */
    /* renamed from: d */
    public final synchronized ajhi mo39207d() {
        ajhj g;
        int i;
        Account b = this.f71593a.mo39171b();
        if (b != null && (g = m59359g(b)) != null && (i = this.f71601i) != 0) {
            if (i != 2) {
                ajhi ajhi = g.f70651b;
                if (ajhi == null) {
                    ajhi = ajhi.f70635l;
                }
            } else {
                ajhi ajhi2 = g.f70652c;
                if (ajhi2 == null) {
                    ajhi2 = ajhi.f70635l;
                }
            }
        }
    }

    /* renamed from: e */
    public final synchronized List mo39210e() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Account b = this.f71593a.mo39171b();
        if (!(b == null || this.f71593a.mo39173c() == null)) {
            bxwc bxwc = mo39200b(b).f70655a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                ajhj ajhj = (ajhj) bxwc.get(i);
                ajhi ajhi = ajhj.f70651b;
                if (ajhi == null) {
                    ajhi = ajhi.f70635l;
                }
                ajhl a = m59348a(ajhi);
                if (a != null) {
                    arrayList.add(a);
                }
                if (this.f71601i == 2) {
                    ajhi ajhi2 = ajhj.f70652c;
                    if (ajhi2 == null) {
                        ajhi2 = ajhi.f70635l;
                    }
                    ajhl a2 = m59348a(ajhi2);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final synchronized void mo39212f() {
        Account b = this.f71593a.mo39171b();
        if (b != null) {
            mo39211e(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo39216i() {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcl", "i", 269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Running certificates syncing task.");
        mo39207d();
        Account b = this.f71593a.mo39171b();
        if (b != null && !this.f71595c) {
            this.f71595c = mo39213f(b);
        }
    }

    /* renamed from: a */
    private final ajhl m59348a(ajhi ajhi) {
        try {
            X509Certificate x509Certificate = (X509Certificate) this.f71599g.mo39443a(ajhi.f70639c);
            if (x509Certificate == null) {
                return null;
            }
            bxvd da = ajhh.f70628f.mo74144da();
            bxtx bxtx = this.f71600h;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajhh ajhh = (ajhh) da.f164949b;
            bxtx.getClass();
            int i = ajhh.f70630a | 8;
            ajhh.f70630a = i;
            ajhh.f70634e = bxtx;
            String str = ajhi.f70645i;
            str.getClass();
            int i2 = i | 1;
            ajhh.f70630a = i2;
            ajhh.f70631b = str;
            String str2 = ajhi.f70646j;
            str2.getClass();
            int i3 = i2 | 2;
            ajhh.f70630a = i3;
            ajhh.f70632c = str2;
            String str3 = ajhi.f70647k;
            str3.getClass();
            ajhh.f70630a = i3 | 4;
            ajhh.f70633d = str3;
            byte[] b = mo39203b(((ajhh) da.mo74062i()).mo73642k(), ajhi.f70644h.mo73780k(), ajhi.f70640d.mo73780k());
            bxvd da2 = ajhl.f70656i.mo74144da();
            bxtx bxtx2 = ajhi.f70638b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ajhl ajhl = (ajhl) da2.f164949b;
            bxtx2.getClass();
            int i4 = ajhl.f70658a | 1;
            ajhl.f70658a = i4;
            ajhl.f70659b = bxtx2;
            bxtx bxtx3 = ajhi.f70640d;
            bxtx3.getClass();
            ajhl.f70658a = i4 | 2;
            ajhl.f70660c = bxtx3;
            bxtx a = bxtx.m123261a(x509Certificate.getPublicKey().getEncoded());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ajhl ajhl2 = (ajhl) da2.f164949b;
            a.getClass();
            ajhl2.f70658a |= 4;
            ajhl2.f70661d = a;
            long millis = ajhi.f70641e - TimeUnit.MINUTES.toMillis((long) this.f71598f.nextInt((int) cfov.m142054g()));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ajhl ajhl3 = (ajhl) da2.f164949b;
            ajhl3.f70658a |= 8;
            ajhl3.f70662e = millis;
            long millis2 = ajhi.f70642f + TimeUnit.MINUTES.toMillis((long) this.f71598f.nextInt((int) cfov.m142054g()));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ajhl ajhl4 = (ajhl) da2.f164949b;
            ajhl4.f70658a |= 16;
            ajhl4.f70663f = millis2;
            bxtx a2 = bxtx.m123261a(b);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ajhl ajhl5 = (ajhl) da2.f164949b;
            a2.getClass();
            ajhl5.f70658a |= 32;
            ajhl5.f70664g = a2;
            bxtx a3 = bxtx.m123261a(m59356b(ajhi.f70644h.mo73780k()));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ajhl ajhl6 = (ajhl) da2.f164949b;
            a3.getClass();
            ajhl6.f70658a |= 64;
            ajhl6.f70665h = a3;
            return (ajhl) da2.mo74062i();
        } catch (KeyStoreException e) {
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m59355b(ajhl ajhl) {
        long j = ajhl.f70663f;
        return j <= m59347a(j, -1800000);
    }

    /* renamed from: c */
    private static boolean m59358c(ajhl ajhl) {
        return (ajhl.f70658a & 1) != 0 && !m59355b(ajhl);
    }

    /* renamed from: h */
    public final synchronized void mo39215h() {
        m59362k();
        mo39214g();
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcl", "h", 1623, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("CertificateManager has been reset");
    }

    /* renamed from: b */
    private static byte[] m59356b(byte[] bArr) {
        byte[] a = akid.m59791a(bArr, new byte[16]);
        return a == null ? akid.m59788a(32) : a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final ajhm mo39204c(Account account) {
        FileInputStream fileInputStream;
        File h = m59360h(account);
        if (!h.exists()) {
            return ajhm.f70666b;
        }
        try {
            fileInputStream = new FileInputStream(h);
            bxvd da = ajhm.f70666b.mo74144da();
            for (ajhl ajhl : ((ajhm) bxvk.m124010a(ajhm.f70666b, fileInputStream)).f70668a) {
                long currentTimeMillis = System.currentTimeMillis();
                if (m59347a(ajhl.f70662e, -1800000) <= currentTimeMillis && currentTimeMillis < m59347a(ajhl.f70663f, 1800000)) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ajhm ajhm = (ajhm) da.f164949b;
                    ajhl.getClass();
                    ajhm.mo38662a();
                    ajhm.f70668a.add(ajhl);
                }
            }
            ajhm ajhm2 = (ajhm) da.mo74062i();
            fileInputStream.close();
            return ajhm2;
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("akcl", "c", 1475, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to read proto objects. Delete all certificate files.");
            mo39214g();
            return ajhm.f70666b;
        } catch (IOException e2) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("akcl", "c", 1479, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to read PUBLIC_CERTIFICATES_BOOK");
            return ajhm.f70666b;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: f */
    public final boolean mo39213f(Account account) {
        if (this.f71601i != 0) {
            List a = mo39190a(account);
            if (!a.isEmpty()) {
                return this.f71594b.mo39452a(account, a);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ajhk mo39200b(Account account) {
        FileInputStream fileInputStream;
        File d = mo39209d(account);
        if (!d.exists()) {
            return ajhk.f70653b;
        }
        try {
            fileInputStream = new FileInputStream(d);
            ajhk ajhk = (ajhk) bxvk.m124010a(ajhk.f70653b, fileInputStream);
            fileInputStream.close();
            return ajhk;
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("akcl", "b", 1443, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to read proto objects. Delete all certificate files.");
            mo39214g();
            return ajhk.f70653b;
        } catch (IOException e2) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("akcl", "b", 1447, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to read PRIVATE_CERTIFICATES_BOOK");
            return ajhk.f70653b;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final akck mo39208d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] a = mo39198a(bArr.length);
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            int length = bArr2.length;
            if (length == 0) {
                bArr2 = new byte[32];
            } else if (length != 32) {
                bArr2 = m59351a(bArr2, 32);
            }
            try {
                instance.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(m59351a(bArr3, 16)));
                try {
                    return new akck(instance.doFinal(bArr), bArr3);
                } catch (BadPaddingException | IllegalBlockSizeException e) {
                    return new akck(a, bArr3);
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                return new akck(a, bArr3);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            return new akck(a, bArr3);
        }
    }

    /* renamed from: e */
    public final synchronized void mo39211e(Account account) {
        File[] listFiles;
        bxwc bxwc = mo39200b(account).f70655a;
        if (!bxwc.isEmpty()) {
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                ajhj ajhj = (ajhj) bxwc.get(i);
                try {
                    akhf akhf = this.f71599g;
                    ajhi ajhi = ajhj.f70651b;
                    if (ajhi == null) {
                        ajhi = ajhi.f70635l;
                    }
                    akhf.mo39444b(ajhi.f70639c);
                } catch (KeyStoreException e) {
                }
                try {
                    akhf akhf2 = this.f71599g;
                    ajhi ajhi2 = ajhj.f70652c;
                    if (ajhi2 == null) {
                        ajhi2 = ajhi.f70635l;
                    }
                    akhf2.mo39444b(ajhi2.f70639c);
                } catch (KeyStoreException e2) {
                }
            }
            String[] strArr = {"nearby_sharing_private_certificate_book"};
            File file = new File(String.format("%s/%s", akhu.m59734b(this.f71597e).getAbsolutePath(), account.name));
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.exists()) {
                        if (strArr[0].equals(file2.getName())) {
                            file2.delete();
                        }
                    }
                }
                File[] listFiles2 = file.listFiles();
                if (listFiles2 != null) {
                    if (listFiles2.length == 0) {
                        file.delete();
                    }
                }
            }
            ahhd.m55769a(this.f71597e, "com.google.android.gms.nearby.sharing.CERTIFICATES_REGENERATION");
        }
    }

    /* renamed from: b */
    public final synchronized void mo39201b() {
        mo39194a(new akcg(this));
    }

    /* renamed from: b */
    public final synchronized byte[] mo39203b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Cipher instance;
        SecretKeySpec secretKeySpec = new SecretKeySpec(m59351a(bArr2, 32), "AES");
        try {
            instance = Cipher.getInstance("AES/GCM/NoPadding");
            try {
                instance.init(1, secretKeySpec, new GCMParameterSpec(32, m59351a(bArr3, 12)));
                try {
                } catch (BadPaddingException | IllegalBlockSizeException e) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("akcl", "b", 870, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to encrypt with secret key. Returning a random value.");
                    return mo39198a(12);
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("akcl", "b", 862, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to encrypt with secret key. Returning a random value.");
                return mo39198a(12);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("akcl", "b", 849, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to encrypt with secret key. Returning a random value.");
            return mo39198a(12);
        }
        return instance.doFinal(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final File mo39209d(Account account) {
        return akhu.m59725a(this.f71597e, account, "nearby_sharing_private_certificate_book");
    }

    /* renamed from: c */
    public final synchronized akck mo39205c() {
        ajhi ajhi;
        Account b = this.f71593a.mo39171b();
        if (b == null) {
            return m59361j();
        }
        ajhj g = m59359g(b);
        if (g != null) {
            int i = this.f71601i;
            if (i != 0) {
                if (i != 2) {
                    ajhi = g.f70651b;
                    if (ajhi == null) {
                        ajhi = ajhi.f70635l;
                    }
                } else {
                    ajhi = g.f70652c;
                    if (ajhi == null) {
                        ajhi = ajhi.f70635l;
                    }
                }
                if (((long) ajhi.f70643g.size()) >= cfov.f185185a.mo6606a().mo82338au()) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl.mo68432a("akcl", "c", 948, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Exhausted all salts: refreshing all certificates");
                    mo39211e(b);
                    ajhi = mo39207d();
                }
                if (ajhi != null) {
                    bxvt bxvt = ajhi.f70643g;
                    for (int i2 = 0; i2 < 128; i2++) {
                        byte[] a = mo39198a(2);
                        short a2 = bqct.m112601a(a);
                        if (!bxvt.contains(Integer.valueOf(a2))) {
                            bxvd bxvd = (bxvd) g.mo74142c(5);
                            bxvd.mo73625a((bxvk) g);
                            int i3 = this.f71601i;
                            if (i3 != 0) {
                                if (i3 != 2) {
                                    bxvd bxvd2 = (bxvd) ajhi.mo74142c(5);
                                    bxvd2.mo73625a((bxvk) ajhi);
                                    bxvd2.mo73942F(a2);
                                    ajhi ajhi2 = (ajhi) bxvd2.mo74062i();
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    ajhj ajhj = (ajhj) bxvd.f164949b;
                                    ajhi2.getClass();
                                    ajhj.f70651b = ajhi2;
                                    ajhj.f70650a |= 1;
                                } else {
                                    bxvd bxvd3 = (bxvd) ajhi.mo74142c(5);
                                    bxvd3.mo73625a((bxvk) ajhi);
                                    bxvd3.mo73942F(a2);
                                    ajhi ajhi3 = (ajhi) bxvd3.mo74062i();
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    ajhj ajhj2 = (ajhj) bxvd.f164949b;
                                    ajhi3.getClass();
                                    ajhj2.f70652c = ajhi3;
                                    ajhj2.f70650a |= 2;
                                }
                                mo39196a(b, (ajhj) bxvd.mo74062i());
                                return mo39208d(ajhi.f70644h.mo73780k(), ajhi.f70640d.mo73780k(), a);
                            }
                            return m59361j();
                        }
                    }
                    bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl2.mo68432a("akcl", "c", 984, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to generate a salt: this should never happen");
                    return m59361j();
                }
                return m59361j();
            }
            return m59361j();
        }
        return m59361j();
    }

    /* renamed from: a */
    private final boolean m59349a(ajhi ajhi, byte[] bArr) {
        try {
            akck d = mo39208d(ajhi.f70644h.mo73780k(), ajhi.f70640d.mo73780k(), new byte[2]);
            akce.m59344a(d.f71592b, d.f71591a, bArr);
            if (!sdg.m34949a(this.f71593a.mo39175d(), ajhi.f70646j) || !sdg.m34949a(this.f71593a.mo39176e(), ajhi.f70647k) || !sdg.m34949a(this.f71593a.mo39177f(), ajhi.f70645i)) {
                return false;
            }
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m59350a(Account account, ajhm ajhm) {
        FileOutputStream fileOutputStream;
        File h = m59360h(account);
        if (!h.exists()) {
            try {
                h.createNewFile();
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("akcl", "a", 471, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to save public certificates to disk. Unable to create the file.");
                return false;
            }
        }
        try {
            fileOutputStream = new FileOutputStream(h);
            ajhm.mo73638a(fileOutputStream);
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akcl", "a", 479, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Saved public certificates to disk.");
            fileOutputStream.close();
            return true;
        } catch (IOException e2) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("akcl", "a", 482, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to save public certificates to disk.");
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final synchronized byte[] mo39206c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Cipher instance;
        SecretKeySpec secretKeySpec = new SecretKeySpec(m59351a(bArr2, 32), "AES");
        try {
            instance = Cipher.getInstance("AES/GCM/NoPadding");
            try {
                instance.init(2, secretKeySpec, new GCMParameterSpec(32, m59351a(bArr3, 12)));
                try {
                } catch (IllegalBlockSizeException e) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("akcl", "c", 914, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to decrypt bytes with secret key.");
                    return null;
                } catch (BadPaddingException e2) {
                    bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl2.mo68432a("akcl", "c", 919, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to decrypt bytes with secret key. BadPaddingException");
                    return null;
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e3) {
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl3.mo68437a(e3);
                bnsl3.mo68432a("akcl", "c", 907, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Failed to decrypt bytes with secret key.");
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e4) {
            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl4.mo68437a(e4);
            bnsl4.mo68432a("akcl", "c", 896, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Failed to decrypt bytes with secret key.");
            return null;
        }
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    private static byte[] m59351a(byte[] bArr, int i) {
        byte[] a = akid.m59792a(bArr, new byte[32], i);
        return a == null ? akid.m59788a(i) : a;
    }

    /* renamed from: a */
    static final byte[] m59352a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            try {
                instance.init(2, secretKeySpec, new IvParameterSpec(m59351a(bArr3, 16)));
                try {
                    byte[] doFinal = instance.doFinal(bArr);
                    if (!Arrays.equals(m59356b(doFinal), bArr4)) {
                        return null;
                    }
                    return doFinal;
                } catch (BadPaddingException | IllegalBlockSizeException e) {
                    return null;
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m59353a(byte[]... bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            for (byte[] bArr2 : bArr) {
                instance.update(bArr2);
            }
            byte[] digest = instance.digest();
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akcl", "a", 586, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Generated ID from certificate.");
            return digest;
        } catch (NoSuchAlgorithmException e) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("akcl", "a", 589, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to generate ID from certificate.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ajhj mo39187a(Account account, long j) {
        String str;
        ajhj ajhj;
        String str2;
        ajhj ajhj2;
        String str3;
        long j2 = j;
        String f = this.f71593a.mo39177f();
        String d = this.f71593a.mo39175d();
        String e = this.f71593a.mo39176e();
        if (TextUtils.isEmpty(f) || TextUtils.isEmpty(d) || TextUtils.isEmpty(e)) {
            return null;
        }
        byte[] a = mo39198a(32);
        byte[] a2 = m59353a(a);
        byte[] a3 = mo39198a(32);
        byte[] a4 = m59353a(a3);
        if (a2 == null) {
            str = "akcl";
            ajhj = null;
        } else if (a4 != null) {
            String encodeToString = Base64.encodeToString(a2, 11);
            String encodeToString2 = Base64.encodeToString(a4, 11);
            if (encodeToString == null) {
                str2 = "akcl";
                ajhj2 = null;
            } else if (encodeToString2 != null) {
                String str4 = encodeToString.length() == 0 ? new String("nearby_sharing_paired_key_alias_") : "nearby_sharing_paired_key_alias_".concat(encodeToString);
                String str5 = encodeToString2.length() == 0 ? new String("nearby_sharing_paired_key_alias_") : "nearby_sharing_paired_key_alias_".concat(encodeToString2);
                X509Certificate a5 = mo39189a(str4, j2);
                X509Certificate a6 = mo39189a(str5, j2);
                if (a5 == null) {
                    str3 = "akcl";
                } else if (a6 != null) {
                    bxvd da = ajhi.f70635l.mo74144da();
                    bxtx a7 = bxtx.m123261a(a2);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ajhi ajhi = (ajhi) da.f164949b;
                    a7.getClass();
                    String str6 = "akcl";
                    int i = ajhi.f70637a | 1;
                    ajhi.f70637a = i;
                    ajhi.f70638b = a7;
                    str4.getClass();
                    ajhi.f70637a = i | 2;
                    ajhi.f70639c = str4;
                    long time = a5.getNotBefore().getTime();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ajhi ajhi2 = (ajhi) da.f164949b;
                    ajhi2.f70637a |= 8;
                    ajhi2.f70641e = time;
                    long time2 = a5.getNotAfter().getTime();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ajhi ajhi3 = (ajhi) da.f164949b;
                    ajhi3.f70637a |= 16;
                    ajhi3.f70642f = time2;
                    bxtx a8 = bxtx.m123261a(a);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ajhi ajhi4 = (ajhi) da.f164949b;
                    a8.getClass();
                    ajhi4.f70637a |= 4;
                    ajhi4.f70640d = a8;
                    bxtx a9 = bxtx.m123261a(mo39198a(14));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ajhi ajhi5 = (ajhi) da.f164949b;
                    a9.getClass();
                    int i2 = ajhi5.f70637a | 32;
                    ajhi5.f70637a = i2;
                    ajhi5.f70644h = a9;
                    f.getClass();
                    int i3 = i2 | 64;
                    ajhi5.f70637a = i3;
                    ajhi5.f70645i = f;
                    d.getClass();
                    int i4 = i3 | 128;
                    ajhi5.f70637a = i4;
                    ajhi5.f70646j = d;
                    e.getClass();
                    ajhi5.f70637a = i4 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    ajhi5.f70647k = e;
                    ajhi ajhi6 = (ajhi) da.mo74062i();
                    bxvd da2 = ajhi.f70635l.mo74144da();
                    bxtx a10 = bxtx.m123261a(a4);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ajhi ajhi7 = (ajhi) da2.f164949b;
                    a10.getClass();
                    int i5 = ajhi7.f70637a | 1;
                    ajhi7.f70637a = i5;
                    ajhi7.f70638b = a10;
                    str5.getClass();
                    ajhi7.f70637a = i5 | 2;
                    ajhi7.f70639c = str5;
                    long time3 = a5.getNotBefore().getTime();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ajhi ajhi8 = (ajhi) da2.f164949b;
                    ajhi8.f70637a |= 8;
                    ajhi8.f70641e = time3;
                    long time4 = a5.getNotAfter().getTime();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ajhi ajhi9 = (ajhi) da2.f164949b;
                    ajhi9.f70637a |= 16;
                    ajhi9.f70642f = time4;
                    bxtx a11 = bxtx.m123261a(a3);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ajhi ajhi10 = (ajhi) da2.f164949b;
                    a11.getClass();
                    ajhi10.f70637a |= 4;
                    ajhi10.f70640d = a11;
                    bxtx a12 = bxtx.m123261a(mo39198a(14));
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ajhi ajhi11 = (ajhi) da2.f164949b;
                    a12.getClass();
                    int i6 = ajhi11.f70637a | 32;
                    ajhi11.f70637a = i6;
                    ajhi11.f70644h = a12;
                    f.getClass();
                    int i7 = i6 | 64;
                    ajhi11.f70637a = i7;
                    ajhi11.f70645i = f;
                    d.getClass();
                    int i8 = i7 | 128;
                    ajhi11.f70637a = i8;
                    ajhi11.f70646j = d;
                    e.getClass();
                    ajhi11.f70637a = i8 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    ajhi11.f70647k = e;
                    ajhi ajhi12 = (ajhi) da2.mo74062i();
                    bxvd da3 = ajhj.f70648d.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    ajhj ajhj3 = (ajhj) da3.f164949b;
                    ajhi6.getClass();
                    ajhj3.f70651b = ajhi6;
                    int i9 = ajhj3.f70650a | 1;
                    ajhj3.f70650a = i9;
                    ajhi12.getClass();
                    ajhj3.f70652c = ajhi12;
                    ajhj3.f70650a = i9 | 2;
                    ajhj ajhj4 = (ajhj) da3.mo74062i();
                    if (mo39196a(account, ajhj4)) {
                        return ajhj4;
                    }
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl.mo68432a(str6, "a", 416, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to create private certificate because it failed to save the certificate.");
                    return null;
                } else {
                    str3 = "akcl";
                }
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                bnsl2.mo68432a(str3, "a", 371, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68424a("Failed to create private certificate because it failed to create the certificate with alias %s, %s.", str4, str5);
                return null;
            } else {
                str2 = "akcl";
                ajhj2 = null;
            }
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a(str2, "a", 359, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to create private certificate because it failed to create the paired key alias.");
            return ajhj2;
        } else {
            str = "akcl";
            ajhj = null;
        }
        bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl4.mo68432a(str, "a", 351, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("Failed to create private certificate because it failed to create a secret id.");
        return ajhj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo39214g() {
        akhu.m59735b(this.f71597e, "nearby_sharing_private_certificate_book", "nearby_sharing_public_certificate_book");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r6 = mo39206c(r0.f70664g.mo73780k(), r12, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r6 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        r16 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6 = (p000.ajhh) p000.bxvk.m124016a(p000.ajhh.f70628f, r6, p000.bxus.m123744c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (android.text.TextUtils.isEmpty(r6.f70631b) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        r0 = (p000.bnsl) p000.ajvp.f71371a.mo68390d();
        r0.mo68432a("akcl", "a", 1276, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68405a("Encrypted metadata does not contain device name. Ignore.");
        r16 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        r2 = new p000.akcj(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        r16 = r2;
     */
    /* renamed from: a */
    public final synchronized akcj mo39188a(byte[] bArr, byte[] bArr2) {
        Account account;
        synchronized (this) {
            Account b = this.f71593a.mo39171b();
            if (b == null) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                bnsl.mo68432a("akcl", "a", 1226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("No active account has been set. Failed to query for public certificate.");
                return null;
            }
            bxwc bxwc = mo39204c(b).f70668a;
            int size = bxwc.size();
            int i = 0;
            while (i < size) {
                ajhl ajhl = (ajhl) bxwc.get(i);
                byte[] k = ajhl.f70660c.mo73780k();
                byte[] a = m59352a(bArr, k, bArr2, ajhl.f70665h.mo73780k());
                if (a != null) {
                    bxwc bxwc2 = mo39200b(b).f70655a;
                    int size2 = bxwc2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            break;
                        }
                        ajhl ajhl2 = ajhl;
                        ajhj ajhj = (ajhj) bxwc2.get(i2);
                        if (ajhj == null) {
                            account = b;
                        } else {
                            account = b;
                            ajhi ajhi = ajhj.f70651b;
                            if (ajhi == null) {
                                ajhi = ajhi.f70635l;
                            }
                            if (Arrays.equals(ajhi.f70644h.mo73780k(), a)) {
                                break;
                            }
                            ajhi ajhi2 = ajhj.f70652c;
                            if (ajhi2 == null) {
                                ajhi2 = ajhi.f70635l;
                            }
                            if (Arrays.equals(ajhi2.f70644h.mo73780k(), a)) {
                                break;
                            }
                        }
                        i2++;
                        b = account;
                        ajhl = ajhl2;
                    }
                } else {
                    account = b;
                }
                i++;
                b = account;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final X509Certificate mo39189a(String str, long j) {
        try {
            Certificate a = this.f71599g.mo39443a(str);
            if (a != null) {
                X509Certificate x509Certificate = (X509Certificate) a;
                long currentTimeMillis = System.currentTimeMillis();
                if (x509Certificate.getNotBefore().getTime() > currentTimeMillis || currentTimeMillis >= x509Certificate.getNotAfter().getTime()) {
                    this.f71599g.mo39444b(str);
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl.mo68432a("akcl", "a", 628, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Deleted expired paired key.");
                } else {
                    bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl2.mo68432a("akcl", "a", 624, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("No need to create paired key. Already exists.");
                    return x509Certificate;
                }
            }
            Date date = new Date(j);
            Date date2 = new Date(j + cfov.f185185a.mo6606a().mo82393q());
            KeyGenParameterSpec.Builder keyValidityForOriginationEnd = new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setCertificateSubject(new X500Principal("O=Google, OU=Android, C=US")).setRandomizedEncryptionRequired(false).setCertificateNotBefore(date).setCertificateNotAfter(date2).setKeyValidityForOriginationEnd(date2);
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                try {
                    instance.initialize(keyValidityForOriginationEnd.build());
                    try {
                        instance.generateKeyPair();
                        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl3.mo68432a("akcl", "a", 674, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("Successfully create paired key.");
                        try {
                            return (X509Certificate) this.f71599g.mo39443a(str);
                        } catch (KeyStoreException e) {
                            bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                            bnsl4.mo68437a(e);
                            bnsl4.mo68432a("akcl", "a", 678, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("Failed to create paired key.");
                            return null;
                        }
                    } catch (ProviderException e2) {
                        bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl5.mo68437a(e2);
                        bnsl5.mo68432a("akcl", "a", 670, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68405a("Failed to create paired key.");
                        return null;
                    }
                } catch (InvalidAlgorithmParameterException e3) {
                    bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl6.mo68437a(e3);
                    bnsl6.mo68432a("akcl", "a", 663, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("Failed to create paired key.");
                    return null;
                }
            } catch (NoSuchAlgorithmException | NoSuchProviderException e4) {
                bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl7.mo68437a(e4);
                bnsl7.mo68432a("akcl", "a", 656, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl7.mo68405a("Failed to create paired key.");
                return null;
            }
        } catch (KeyStoreException e5) {
            bnsl bnsl8 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl8.mo68437a(e5);
            bnsl8.mo68432a("akcl", "a", 632, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl8.mo68405a("Failed to create paired key.");
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized List mo39190a(Account account) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        bxwc bxwc = mo39200b(account).f70655a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            ajhj ajhj = (ajhj) bxwc.get(i);
            ajhi ajhi = ajhj.f70651b;
            if (ajhi == null) {
                ajhi = ajhi.f70635l;
            }
            ajhl a = m59348a(ajhi);
            if (a != null) {
                arrayList.add(new akhk(a, ajhi.f70644h, false));
            }
            ajhi ajhi2 = ajhj.f70652c;
            if (ajhi2 == null) {
                ajhi2 = ajhi.f70635l;
            }
            ajhl a2 = m59348a(ajhi2);
            if (a2 != null) {
                arrayList.add(new akhk(a2, ajhi2.f70644h, true));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo39191a() {
        mo39194a(new akcf(this));
        mo39201b();
    }

    /* renamed from: a */
    public final synchronized void mo39192a(Account account, List list) {
        C1225nr nrVar = new C1225nr();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ajhl ajhl = (ajhl) list.get(i);
            if (m59358c(ajhl)) {
                nrVar.add(ajhl.f70659b);
                arrayList.add(ajhl);
            }
        }
        bxwc bxwc = mo39204c(account).f70668a;
        int size2 = bxwc.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ajhl ajhl2 = (ajhl) bxwc.get(i2);
            if (m59358c(ajhl2)) {
                if (!nrVar.contains(ajhl2.f70659b)) {
                    arrayList.add(ajhl2);
                }
            }
        }
        bxvd da = ajhm.f70666b.mo74144da();
        da.mo74024ad(arrayList);
        m59350a(account, (ajhm) da.mo74062i());
        ahhd.m55769a(this.f71597e, "com.google.android.gms.nearby.sharing.CERTIFICATES_DOWNLOAD");
    }

    /* renamed from: a */
    public final synchronized void mo39193a(PrintWriter printWriter) {
        if (ajvh.m59100a() == 2 || ajvh.m59100a() == 3) {
            printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.provider.connections.CertificateManager"));
            printWriter.write("  Public certificates:\n");
            Account b = this.f71593a.mo39171b();
            if (b == null) {
                printWriter.write("    No public certificate stored on device.\n");
            } else {
                ajhm c = mo39204c(b);
                printWriter.write(String.format("    Public certificates size: %s\n", Integer.valueOf(c.f70668a.size())));
                bxwc bxwc = c.f70668a;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    printWriter.write(String.format("    Public certificate: %s\n", Arrays.toString(((ajhl) bxwc.get(i)).f70659b.mo73780k())));
                }
            }
            printWriter.write("  Private certificates:\n");
            Account b2 = this.f71593a.mo39171b();
            if (b2 == null) {
                printWriter.write("    No private certificate stored on device.\n");
                return;
            }
            ajhk b3 = mo39200b(b2);
            printWriter.write(String.format("    Private certificates size: %s\n", Integer.valueOf(b3.f70655a.size())));
            bxwc bxwc2 = b3.f70655a;
            int size2 = bxwc2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ajhj ajhj = (ajhj) bxwc2.get(i2);
                Object[] objArr = new Object[2];
                ajhi ajhi = ajhj.f70651b;
                if (ajhi == null) {
                    ajhi = ajhi.f70635l;
                }
                objArr[0] = Arrays.toString(ajhi.f70638b.mo73780k());
                ajhi ajhi2 = ajhj.f70652c;
                if (ajhi2 == null) {
                    ajhi2 = ajhi.f70635l;
                }
                objArr[1] = Arrays.toString(ajhi2.f70638b.mo73780k());
                printWriter.write(String.format("    Private certificate: %s, %s\n", objArr));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39194a(Runnable runnable) {
        this.f71596d.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized boolean mo39195a(ajhl ajhl) {
        Account b = this.f71593a.mo39171b();
        if (b == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akcl", "a", 434, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to save public certificate to disk. No account set.");
            return false;
        } else if (m59355b(ajhl)) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akcl", "a", 439, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to save public certificate to disk. Certificate is invalid.");
            return false;
        } else {
            ArrayList arrayList = new ArrayList();
            bxwc bxwc = mo39204c(b).f70668a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                ajhl ajhl2 = (ajhl) bxwc.get(i);
                if (!m59355b(ajhl2)) {
                    if (!ajhl2.f70659b.equals(ajhl.f70659b)) {
                        arrayList.add(ajhl2);
                    }
                }
            }
            arrayList.add(ajhl);
            bxvd da = ajhm.f70666b.mo74144da();
            da.mo74024ad(arrayList);
            return m59350a(b, (ajhm) da.mo74062i());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo39196a(Account account, ajhj ajhj) {
        FileOutputStream fileOutputStream;
        ajhi ajhi = ajhj.f70651b;
        if (ajhi == null) {
            ajhi = ajhi.f70635l;
        }
        if (m59354b(ajhi)) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akcl", "a", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to save private certificate to disk. Certificate is invalid.");
            return false;
        }
        File d = mo39209d(account);
        if (!d.exists()) {
            try {
                d.createNewFile();
            } catch (IOException e) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("akcl", "a", 509, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to save private certificate to disk. Unable to create the file.");
                return false;
            }
        }
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = mo39200b(account).f70655a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            ajhj ajhj2 = (ajhj) bxwc.get(i);
            ajhi ajhi2 = ajhj2.f70651b;
            if (ajhi2 == null) {
                ajhi2 = ajhi.f70635l;
            }
            if (!m59354b(ajhi2)) {
                arrayList.add(ajhj2);
            } else {
                try {
                    akhf akhf = this.f71599g;
                    ajhi ajhi3 = ajhj2.f70651b;
                    if (ajhi3 == null) {
                        ajhi3 = ajhi.f70635l;
                    }
                    akhf.mo39444b(ajhi3.f70639c);
                } catch (KeyStoreException e2) {
                    bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl3.mo68437a(e2);
                    bnsl3.mo68432a("akcl", "a", 527, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    ajhi ajhi4 = ajhj2.f70651b;
                    if (ajhi4 == null) {
                        ajhi4 = ajhi.f70635l;
                    }
                    bnsl3.mo68420a("Failed to delete key store entry for %s", ajhi4.f70639c);
                }
                try {
                    akhf akhf2 = this.f71599g;
                    ajhi ajhi5 = ajhj2.f70652c;
                    if (ajhi5 == null) {
                        ajhi5 = ajhi.f70635l;
                    }
                    akhf2.mo39444b(ajhi5.f70639c);
                } catch (KeyStoreException e3) {
                    bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl4.mo68437a(e3);
                    bnsl4.mo68432a("akcl", "a", 536, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    ajhi ajhi6 = ajhj2.f70652c;
                    if (ajhi6 == null) {
                        ajhi6 = ajhi.f70635l;
                    }
                    bnsl4.mo68420a("Failed to delete key store entry for %s", ajhi6.f70639c);
                }
            }
        }
        bxvd da = ajhk.f70653b.mo74144da();
        da.mo73987a(ajhj);
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ajhj ajhj3 = (ajhj) arrayList.get(i2);
            ajhi ajhi7 = ajhj3.f70651b;
            if (ajhi7 == null) {
                ajhi7 = ajhi.f70635l;
            }
            bxtx bxtx = ajhi7.f70638b;
            ajhi ajhi8 = ajhj.f70651b;
            if (ajhi8 == null) {
                ajhi8 = ajhi.f70635l;
            }
            if (!bxtx.equals(ajhi8.f70638b)) {
                ajhi ajhi9 = ajhj3.f70652c;
                if (ajhi9 == null) {
                    ajhi9 = ajhi.f70635l;
                }
                bxtx bxtx2 = ajhi9.f70638b;
                ajhi ajhi10 = ajhj.f70652c;
                if (ajhi10 == null) {
                    ajhi10 = ajhi.f70635l;
                }
                if (!bxtx2.equals(ajhi10.f70638b)) {
                    da.mo73987a(ajhj3);
                }
            }
        }
        try {
            fileOutputStream = new FileOutputStream(d);
            ((ajhk) da.mo74062i()).mo73638a(fileOutputStream);
            bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl5.mo68432a("akcl", "a", 562, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Saved private certificates to disk.");
            fileOutputStream.close();
            return true;
        } catch (IOException e4) {
            bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl6.mo68437a(e4);
            bnsl6.mo68432a("akcl", "a", 565, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Failed to save private certificate to disk.");
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final synchronized boolean mo39197a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (this.f71593a.mo39171b() == null) {
            return false;
        }
        srn srn = ajvp.f71371a;
        Arrays.toString(bArr);
        try {
            KeyFactory instance = KeyFactory.getInstance("EC");
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
            try {
                PublicKey generatePublic = instance.generatePublic(x509EncodedKeySpec);
                try {
                    Signature instance2 = Signature.getInstance("SHA256withECDSA");
                    try {
                        instance2.initVerify(generatePublic);
                        try {
                            instance2.update(bArr2);
                            return instance2.verify(bArr3);
                        } catch (SignatureException e) {
                            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                            bnsl.mo68437a(e);
                            bnsl.mo68432a("akcl", "a", 799, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Failed to verify bytes with paired key.");
                            return false;
                        }
                    } catch (InvalidKeyException e2) {
                        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("akcl", "a", 791, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Failed to verify bytes with paired key.");
                        return false;
                    }
                } catch (NoSuchAlgorithmException e3) {
                    bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl3.mo68437a(e3);
                    bnsl3.mo68432a("akcl", "a", 783, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Failed to verify bytes with paired key: %s", "SHA256withECDSA");
                    return false;
                }
            } catch (InvalidKeySpecException e4) {
                bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl4.mo68437a(e4);
                bnsl4.mo68432a("akcl", "a", 774, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Failed to verify bytes with paired key: %s", x509EncodedKeySpec.getFormat());
                return false;
            }
        } catch (NoSuchAlgorithmException e5) {
            bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl5.mo68437a(e5);
            bnsl5.mo68432a("akcl", "a", 764, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68420a("Failed to verify bytes with paired key: %s", "EC");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo39198a(int i) {
        return akid.m59789a(i, this.f71598f);
    }

    /* renamed from: a */
    public final synchronized byte[] mo39199a(byte[] bArr) {
        ajhi d = mo39207d();
        if (d != null) {
            try {
                String str = d.f70639c;
                KeyStore keyStore = this.f71599g.f71982a;
                if (keyStore != null) {
                    PrivateKey privateKey = (PrivateKey) keyStore.getKey(str, null);
                    X509Certificate x509Certificate = (X509Certificate) this.f71599g.mo39443a(str);
                    if (privateKey == null) {
                        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl.mo68432a("akcl", "a", 707, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("No private key is available. Failed to sign with paired key.");
                        return mo39198a(72);
                    }
                    if (x509Certificate != null) {
                        if (x509Certificate.getPublicKey() != null) {
                            srn srn = ajvp.f71371a;
                            Arrays.toString(x509Certificate.getPublicKey().getEncoded());
                        }
                    }
                    try {
                        Signature instance = Signature.getInstance("SHA256withECDSA");
                        try {
                            instance.initSign(privateKey);
                            try {
                                instance.update(bArr);
                                return instance.sign();
                            } catch (SignatureException e) {
                                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                                bnsl2.mo68437a(e);
                                bnsl2.mo68432a("akcl", "a", 739, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("Failed to sign with paired key.");
                                return mo39198a(72);
                            }
                        } catch (InvalidKeyException e2) {
                            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                            bnsl3.mo68437a(e2);
                            bnsl3.mo68432a("akcl", "a", 730, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68420a("Failed to sign with paired key: %s", privateKey.getAlgorithm());
                            return mo39198a(72);
                        }
                    } catch (NoSuchAlgorithmException e3) {
                        bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
                        bnsl4.mo68437a(e3);
                        bnsl4.mo68432a("akcl", "a", 723, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("Failed to sign with paired key.");
                        return mo39198a(72);
                    }
                } else {
                    throw new KeyStoreException("No AndroidKeyStore found on device, cannot get key.");
                }
            } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e4) {
                bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl5.mo68437a(e4);
                bnsl5.mo68432a("akcl", "a", 702, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Failed to sign with paired key.");
                return mo39198a(72);
            }
        } else {
            return mo39198a(72);
        }
    }
}
