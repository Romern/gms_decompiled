package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.google.android.gms.ads.identifier.settings.w */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0305w {

    /* renamed from: a */
    private static C0305w f8048a = null;

    /* renamed from: b */
    private final Context f8049b;

    /* renamed from: c */
    private bqqe f8050c = null;

    /* renamed from: d */
    private byte[] f8051d = null;

    public C0305w(Context context) {
        this.f8049b = context;
    }

    /* renamed from: a */
    public static synchronized C0305w m5233a(Context context) {
        C0305w wVar;
        synchronized (C0305w.class) {
            if (f8048a == null) {
                f8048a = new C0305w(context);
            }
            wVar = f8048a;
        }
        return wVar;
    }

    /* renamed from: b */
    public static UUID m5234b(byte[] bArr) {
        ByteBuffer byteBuffer;
        if (!cbvp.f178349a.mo6606a().mo75449u()) {
            byteBuffer = ByteBuffer.wrap(C0288f.m5216a(bArr), 16, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(C0288f.m5216a(bArr), 16, 32);
            byte b = copyOfRange[6] & 15;
            copyOfRange[6] = (byte) b;
            copyOfRange[6] = (byte) (b | 64);
            byte b2 = copyOfRange[8] & 63;
            copyOfRange[8] = (byte) b2;
            copyOfRange[8] = (byte) (b2 | 128);
            byteBuffer = ByteBuffer.wrap(copyOfRange);
        }
        return new UUID(byteBuffer.getLong(), byteBuffer.getLong());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        return r0;
     */
    /* renamed from: d */
    private final synchronized bqqe m5235d() {
        bqqe bqqe = this.f8050c;
        if (bqqe == null) {
            bqpu.m113219a();
            bqub.m113412a();
            this.f8051d = null;
            if (cbvp.f178349a.mo6606a().mo75448t()) {
                try {
                    bqqd bqqd = new bqqd();
                    bqqd.mo69323a(this.f8049b, "event_attestation_signature_keyset", "event_attestation_settings");
                    bqqd.f141361d = bquc.f141622a;
                    bqqd.mo69324a("android-keystore://event_attestation_master_key");
                    bqqe a = bqqd.mo69322a();
                    this.f8050c = a;
                    return a;
                } catch (IOException | GeneralSecurityException e) {
                    C0288f.m5215a(this.f8049b, "getOrCreateKeyManagerError", e);
                    throw e;
                } catch (IOException | GeneralSecurityException e2) {
                    C0288f.m5215a(this.f8049b, "getOrCreateKeyManagerError", e2);
                }
            }
            bqqd bqqd2 = new bqqd();
            bqqd2.mo69323a(this.f8049b, "event_attestation_signature_keyset", "event_attestation_settings");
            bqqd2.f141361d = bquc.f141622a;
            bqqd2.mo69324a("android-keystore://event_attestation_master_key");
            boolean z = false;
            bqqd2.f141360c = false;
            bqqe a2 = bqqd2.mo69322a();
            this.f8050c = a2;
            Context context = this.f8049b;
            if (a2 != null) {
                z = true;
            }
            C0288f.m5217b(context, "disableKeyStore", Boolean.toString(z));
            bqqe = this.f8050c;
        }
    }

    /* renamed from: e */
    private final SharedPreferences m5236e() {
        return this.f8049b.getSharedPreferences("event_attestation_settings", 0);
    }

    /* renamed from: c */
    public final synchronized byte[] mo6531c() {
        byte[] bArr = this.f8051d;
        if (bArr != null) {
            return bArr;
        }
        bqns a = m5235d().mo69325a().mo69304a();
        bmxz bmxz = C0304v.f8047a;
        bqsj bqsj = a.f141318a;
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = bqsj.f141534b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bqsi bqsi = (bqsi) bxwc.get(i);
            if (bqsi.f141529c == bqsj.f141533a) {
                int b = bqse.m113312b(bqsi.f141528b);
                if (b != 0 && b == 3) {
                    int b2 = bqsq.m113326b(bqsi.f141530d);
                    if (b2 != 0 && b2 == 5) {
                        bqsd bqsd = bqsi.f141527a;
                        if (bqsd == null) {
                            bqsd = bqsd.f141509d;
                        }
                        if (!bqsd.f141511a.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                            continue;
                        } else {
                            bqsd bqsd2 = bqsi.f141527a;
                            if (bqsd2 == null) {
                                bqsd2 = bqsd.f141509d;
                            }
                            int b3 = bqsc.m113309b(bqsd2.f141513c);
                            if (b3 != 0 && b3 == 5) {
                                bqsd bqsd3 = bqsi.f141527a;
                                if (bqsd3 == null) {
                                    bqsd3 = bqsd.f141509d;
                                }
                                if (bqsd3.f141512b.mo73779j()) {
                                    continue;
                                } else {
                                    bqsd bqsd4 = bqsi.f141527a;
                                    if (bqsd4 == null) {
                                        bqsd4 = bqsd.f141509d;
                                    }
                                    bxtx bxtx = bqsd4.f141512b;
                                    bxus c = bxus.m123744c();
                                    bqrl bqrl = bqrl.f141448e;
                                    try {
                                        bxuc h = bxtx.mo73764h();
                                        GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqrl.mo74142c(4);
                                        bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                                        a2.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                                        a2.mo74225d(GeneratedMessageLite);
                                        h.mo73787a(0);
                                        GeneratedMessageLite.m124027b(GeneratedMessageLite);
                                        bqrl bqrl2 = (bqrl) GeneratedMessageLite;
                                        bqrj bqrj = bqrl2.f141451b;
                                        if (bqrj == null) {
                                            bqrj = bqrj.f141438d;
                                        }
                                        if (bmxz.mo6527a(bqrj)) {
                                            arrayList.add(bqvm.m113484a(bqvm.m113479a(1).getCurve(), 2, new ECPoint(new BigInteger(bqrl2.f141452c.mo73780k()), new BigInteger(bqrl2.f141453d.mo73780k()))));
                                        }
                                    } catch (IOException e) {
                                        if (!(e.getCause() instanceof bxwf)) {
                                            throw new bxwf(e.getMessage());
                                        }
                                        throw ((bxwf) e.getCause());
                                    } catch (RuntimeException e2) {
                                        if (e2.getCause() instanceof bxwf) {
                                            throw ((bxwf) e2.getCause());
                                        }
                                        throw e2;
                                    } catch (bxwf e3) {
                                        throw e3;
                                    } catch (bxwf e4) {
                                        throw e4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            this.f8051d = (byte[]) arrayList.get(0);
        }
        if (arrayList.size() > 1) {
            C0288f.m5213a(this.f8049b, "publicKeyError", "Multiple public key.");
        } else if (arrayList.isEmpty()) {
            C0288f.m5213a(this.f8049b, "publicKeyError", "Not found.");
        }
        return this.f8051d;
    }

    /* renamed from: a */
    public final synchronized bqkw mo6528a() {
        String string = m5236e().getString("event_attestation_integrity_token", null);
        if (string == null) {
            return null;
        }
        try {
            return (bqkw) GeneratedMessageLite.m124016a(bqkw.f141054d, string.getBytes(bmwy.f131157b), bxus.m123744c());
        } catch (bxwf e) {
            C0288f.m5215a(this.f8049b, "deviceIntegrityTokenError", e);
            return null;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0070=Splitter:B:27:0x0070, B:60:0x00c0=Splitter:B:60:0x00c0} */
    /* renamed from: a */
    public final synchronized boolean mo6529a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 0) {
                try {
                    bxtx bxtx = ((bqkw) GeneratedMessageLite.m124016a(bqkw.f141054d, bArr, bxus.m123744c())).f141057b;
                    bxus c = bxus.m123744c();
                    bqks bqks = bqks.f141034b;
                    try {
                        bxuc h = bxtx.mo73764h();
                        GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqks.mo74142c(4);
                        bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                        a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                        a.mo74225d(GeneratedMessageLite);
                        h.mo73787a(0);
                        GeneratedMessageLite.m124027b(GeneratedMessageLite);
                        bqks bqks2 = (bqks) GeneratedMessageLite;
                        try {
                            byte[] c2 = mo6531c();
                            if (!(bqks2 == null || c2 == null)) {
                                if (Arrays.equals(bqks2.f141036a.mo73780k(), c2)) {
                                    m5236e().edit().putString("event_attestation_integrity_token", new String(bArr, bmwy.f131157b)).apply();
                                    return true;
                                }
                            }
                            C0288f.m5213a(this.f8049b, "deviceIntegrityTokenError", "public key mismatch");
                            return false;
                        } catch (IOException | GeneralSecurityException e) {
                            C0288f.m5215a(this.f8049b, "publicKeyError", e);
                            return false;
                        }
                    } catch (IOException e2) {
                        if (!(e2.getCause() instanceof bxwf)) {
                            throw new bxwf(e2.getMessage());
                        }
                        throw ((bxwf) e2.getCause());
                    } catch (RuntimeException e3) {
                        if (e3.getCause() instanceof bxwf) {
                            throw ((bxwf) e3.getCause());
                        }
                        throw e3;
                    } catch (bxwf e4) {
                        throw e4;
                    } catch (bxwf e5) {
                        throw e5;
                    }
                } catch (bxwf e6) {
                    C0288f.m5215a(this.f8049b, "deviceIntegriyTokenDecodeError", e6);
                    return false;
                }
            }
        }
        C0288f.m5213a(this.f8049b, "deviceIntegrityTokenError", "empty token");
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo6530b() {
        m5236e().edit().clear().commit();
        this.f8050c = null;
        this.f8051d = null;
    }

    /* renamed from: c */
    public final synchronized byte[] mo6532c(byte[] bArr) {
        return ((bqod) m5235d().mo69325a().mo69305a(bqod.class)).mo69316a(bArr);
    }
}
