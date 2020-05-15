package p000;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahma */
final /* synthetic */ class ahma implements Runnable {

    /* renamed from: a */
    private final ahmn f67504a;

    /* renamed from: b */
    private final String f67505b;

    /* renamed from: c */
    private final byse f67506c;

    /* renamed from: d */
    private final String f67507d;

    /* renamed from: e */
    private final byte[] f67508e;

    public ahma(ahmn ahmn, String str, byse byse, String str2, byte[] bArr) {
        this.f67504a = ahmn;
        this.f67505b = str;
        this.f67506c = byse;
        this.f67507d = str2;
        this.f67508e = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0146 A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0149 A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016e A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016f A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018a A[Catch:{ all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0201 A[Catch:{ all -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021a A[Catch:{ all -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0239  */
    public final void run() {
        int i;
        ahmj ahmj;
        bqgy bqgy;
        boolean z;
        String str;
        Set nrVar;
        boolean z2;
        ahni ahni;
        ahmj ahmj2;
        bqgy bqgy2;
        ahfi b;
        ahmn ahmn = this.f67504a;
        String str2 = this.f67505b;
        byse byse = this.f67506c;
        String str3 = this.f67507d;
        byte[] bArr = this.f67508e;
        ahmj ahmj3 = (ahmj) ahmn.f67551h.get(str2);
        if (ahmj3 != null) {
            try {
                ahmj3.f67539l = byse;
                ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("Completed UKEY2 with endpoint %s and obtained authentication token %s", str2, str3);
                if (cfnv.m140801y()) {
                    ahkv ahkv = ahmj3.f67528a;
                    ahna ahna = ahmj3.f67530c;
                    if (ahkv.mo36712c(str2) != null) {
                        try {
                            byte[] a = ahkv.f67392h.mo36752a(ahkv.mo36711c(), bArr);
                            buuw buuw = buuw.PAIRED_KEY_ENCRYPTION;
                            bxvd da = buuk.f154951c.mo74144da();
                            ByteString a2 = ByteString.m123261a(a);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            buuk buuk = (buuk) da.f164949b;
                            a2.getClass();
                            buuk.f154953a |= 1;
                            buuk.f154954b = a2;
                            ahna.mo36799a(ahoy.m56304a(buuw, da.mo74062i()).serializeToBytes());
                            if (ahna != null) {
                                try {
                                    new Object[1][0] = ahmn.mo36958g().mo44188a();
                                    b = ahfi.m55635b(new ahls(ahna), cfnv.m140750L(), ahmn.f67549f);
                                    buuj a3 = ahoy.m56305a(ahna.mo36803e());
                                    b.mo36396b();
                                    if (ahoy.m56306a(a3) == buuw.PAIRED_KEY_ENCRYPTION) {
                                        buux buux = a3.f154950c;
                                        if (buux == null) {
                                            buux = buux.f155003j;
                                        }
                                        buuk buuk2 = buux.f155013i;
                                        if (buuk2 == null) {
                                            buuk2 = buuk.f154951c;
                                        }
                                        byte[] k = buuk2.f154954b.getKey();
                                        byte[] bArr2 = (byte[]) ahkv.f67391g.get(str2);
                                        z = bArr2 != null && ahkv.f67392h.mo36750a(bArr2, bArr, k);
                                        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
                                        if (z) {
                                            str = "Unable to verify";
                                        } else {
                                            str = "Successfully verified";
                                        }
                                        bnsl.mo68424a("%s the authentication token with endpoint %s using a preshared public key", str, str2);
                                        ahmn.f67545b.mo36894a(buuw.CONNECTION_RESPONSE, ahmn);
                                        ahnp ahnp = ahmn.f67545b;
                                        ahkv ahkv2 = ahmj3.f67528a;
                                        byte[] bArr3 = ahmj3.f67529b;
                                        byte[] bArr4 = ahmj3.f67536i;
                                        boolean z3 = ahmj3.f67532e;
                                        ahna ahna2 = ahmj3.f67530c;
                                        nrVar = new C1225nr(ahmj3.f67537j);
                                        if (!nrVar.isEmpty()) {
                                            nrVar = bnic.m109489a(ahmn.mo36859e());
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        for (bvif bvif : ahmn.mo36861f()) {
                                            if (nrVar.contains(bvif)) {
                                                arrayList.add(bvif);
                                            }
                                        }
                                        aify aify = ahmj3.f67534g;
                                        if (ahmj3.f67535h || !ahmn.f67546c.mo36929e()) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        ahni ahni2 = ahni;
                                        ahnp ahnp2 = ahnp;
                                        i = 0;
                                        ahmj2 = ahmj3;
                                        String str4 = str2;
                                        ahni = new ahni(ahnp, ahkv2, str2, ahna2, arrayList, bArr3, bArr4, str3, bArr, z3, z, aify, z2, countDownLatch);
                                        ahnp2.mo36895a(ahni2);
                                        String str5 = str4;
                                        ahhf.m55774a(String.format("registerEndpoint(%s)", str5), countDownLatch);
                                        ahmj = ahmj2;
                                        try {
                                            if (!ahmj.f67532e) {
                                                ahmj.f67528a.f67390f.mo36652a(2, ahmj.f67530c.mo36865l(), 2, SystemClock.elapsedRealtime() - ahmj.f67533f);
                                            } else {
                                                ahmj.f67528a.f67390f.mo36655a(str5, 2, ahmj.f67530c.mo36865l(), 2, SystemClock.elapsedRealtime() - ahmj.f67533f);
                                            }
                                            bqgy2 = ahmj.f67538k;
                                            if (bqgy2 == null) {
                                                bqgy2.mo69138b((Object) 0);
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th) {
                                            th = th;
                                            bqgy = ahmj.f67538k;
                                            if (bqgy != null) {
                                                bqgy.mo69138b(Integer.valueOf(i));
                                            }
                                            throw th;
                                        }
                                    } else {
                                        throw new IOException(String.format("In readPairedKeyEncryptionFrame, expected a PAIRED_KEY_ENCRYPTION v1 OfflineFrame but got a %s frame instead", ahoy.m56306a(a3).name()));
                                    }
                                } catch (IOException e) {
                                    throw new IOException(String.format("In readConnectionRequestFrame, attempted to read a PairedKeyEncryptionFrame from EndpointChannel %s but was unable to obtain any OfflineFrame.", ahna.mo36795a()), e);
                                } catch (IOException e2) {
                                    bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68388c();
                                    bnsl2.mo68437a(e2);
                                    bnsl2.mo68405a("Failed to read paired key encryption frame.");
                                    z = false;
                                } catch (Throwable th2) {
                                    b.mo36396b();
                                    throw th2;
                                }
                            } else {
                                throw new IOException("Unable to read from a null EndpointChannel");
                            }
                        } catch (IOException e3) {
                            throw new IOException("Failed to write PairedKeyEncryptionFrame", e3);
                        } catch (IOException e4) {
                            bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68388c();
                            bnsl3.mo68437a(e4);
                            bnsl3.mo68405a("Failed to write paired key encryption frame.");
                            z = false;
                        }
                    }
                }
                z = false;
                bnsl bnsl4 = (bnsl) ahkm.f67363a.mo68390d();
                if (z) {
                }
                bnsl4.mo68424a("%s the authentication token with endpoint %s using a preshared public key", str, str2);
                ahmn.f67545b.mo36894a(buuw.CONNECTION_RESPONSE, ahmn);
                ahnp ahnp3 = ahmn.f67545b;
                ahkv ahkv22 = ahmj3.f67528a;
                byte[] bArr32 = ahmj3.f67529b;
                byte[] bArr42 = ahmj3.f67536i;
                boolean z32 = ahmj3.f67532e;
                ahna ahna22 = ahmj3.f67530c;
                nrVar = new C1225nr(ahmj3.f67537j);
                if (!nrVar.isEmpty()) {
                }
                ArrayList arrayList2 = new ArrayList();
                while (r17.hasNext()) {
                }
                aify aify2 = ahmj3.f67534g;
                if (ahmj3.f67535h) {
                }
                z2 = false;
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                ahni ahni22 = ahni;
                ahnp ahnp22 = ahnp3;
                i = 0;
                ahmj2 = ahmj3;
                String str42 = str2;
                try {
                    ahni = new ahni(ahnp3, ahkv22, str2, ahna22, arrayList2, bArr32, bArr42, str3, bArr, z32, z, aify2, z2, countDownLatch2);
                    ahnp22.mo36895a(ahni22);
                    String str52 = str42;
                    ahhf.m55774a(String.format("registerEndpoint(%s)", str52), countDownLatch2);
                    ahmj = ahmj2;
                    if (!ahmj.f67532e) {
                    }
                    bqgy2 = ahmj.f67538k;
                    if (bqgy2 == null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ahmj = ahmj2;
                    bqgy = ahmj.f67538k;
                    if (bqgy != null) {
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                ahmj = ahmj3;
                i = 0;
                bqgy = ahmj.f67538k;
                if (bqgy != null) {
                }
                throw th;
            }
        } else {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("onEncryptionSuccess() for endpoint %s, but the connection was already removed.", str2);
        }
    }
}
