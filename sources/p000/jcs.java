package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.KeyChainProtectionParams;
import android.security.keystore.recovery.KeyChainSnapshot;
import android.security.keystore.recovery.KeyDerivationParams;
import android.security.keystore.recovery.RecoveryController;
import android.security.keystore.recovery.WrappedApplicationKey;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import com.google.android.gms.auth.folsom.service.GcmReceiverChimeraService;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.SecretKey;

/* renamed from: jcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jcs {

    /* renamed from: a */
    public static final Logger f22185a = jdh.m16547a("KeySyncController");

    /* renamed from: b */
    public final Account f22186b;

    /* renamed from: c */
    public final RecoveryController f22187c;

    /* renamed from: d */
    public final KeyChainSnapshot f22188d;

    /* renamed from: e */
    private final Context f22189e;

    /* renamed from: f */
    private final boolean f22190f;

    /* renamed from: g */
    private final jcp f22191g;

    /* renamed from: h */
    private final List f22192h = new ArrayList();

    /* renamed from: i */
    private final List f22193i = new ArrayList();

    public jcs(Context context, Account account, boolean z, RecoveryController recoveryController, KeyChainSnapshot keyChainSnapshot, jcp jcp) {
        this.f22189e = context;
        this.f22186b = account;
        this.f22190f = z;
        this.f22187c = recoveryController;
        this.f22188d = keyChainSnapshot;
        this.f22191g = jcp;
    }

    /* renamed from: a */
    private final bqmn m16518a(String str, byte[] bArr) {
        try {
            List b = ((jcf) jcf.f22150a.mo13145b()).mo13574b(this.f22186b.name);
            if (!b.isEmpty()) {
                jbf jbf = (jbf) b.get(0);
                ByteString bxtx = jbf.f22086a;
                byte[] k = jbf.f22087b.getKey();
                SecretKey b2 = ((jcj) jcj.f22155a.mo13145b()).mo13579b(str);
                if (b2 != null) {
                    try {
                        byte[] a = jdf.m16540a(b2, k);
                        bxvd da = bqmn.f141238d.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bxtx.getClass();
                        ((bqmn) da.f164949b).f141240a = bxtx;
                        ByteString a2 = bxtx.m123261a(a);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a2.getClass();
                        ((bqmn) da.f164949b).f141241b = a2;
                        ByteString a3 = bxtx.m123261a(bArr);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a3.getClass();
                        ((bqmn) da.f164949b).f141242c = a3;
                        bqmn bqmn = (bqmn) da.mo74062i();
                        this.f22193i.add(jbf);
                        return bqmn;
                    } catch (InvalidKeyException e) {
                        throw new jck(10, e);
                    }
                } else {
                    throw new jck(10, "Missing wrapping key");
                }
            } else {
                throw new jck(11, "Missing KeyPair");
            }
        } catch (gid | IOException e2) {
            throw new jck(11, e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* renamed from: b */
    public final void mo13590b() {
        String str;
        String a;
        boolean z;
        String str2 = "";
        f22185a.mo25412b("startSync", new Object[0]);
        KeyChainSnapshot keyChainSnapshot = this.f22188d;
        if (keyChainSnapshot != null) {
            Context context = this.f22189e;
            CertPath trustedHardwareCertPath = keyChainSnapshot.getTrustedHardwareCertPath();
            if (trustedHardwareCertPath != null) {
                byte[] a2 = bslu.m115954a(((Certificate) trustedHardwareCertPath.getCertificates().get(0)).getPublicKey());
                int maxAttempts = keyChainSnapshot.getMaxAttempts();
                if (maxAttempts != 0) {
                    byte[] serverParams = keyChainSnapshot.getServerParams();
                    if (serverParams != null) {
                        try {
                            str = addi.m50206a(context).mo33343a(ccfy.f178890a.mo6606a().mo75886a(), "GCM");
                            try {
                                str2 = addi.m50206a(context).mo33346b();
                            } catch (IOException e) {
                                f22185a.mo25416d("Failed to retrieve instanceIdToken. Moving on without it.", new Object[0]);
                                Long b = jaz.m16450b(context);
                                a = jaz.m16448a(serverParams);
                                long b2 = jaz.m16449b(serverParams);
                                if (a.equals(str2)) {
                                }
                                f22185a.mo25412b("vaultHandle is outdated", new Object[0]);
                                jar.m16429a(context, RecoveryController.getInstance(context));
                                throw new jck(6, "vaultHandle is outdated");
                            }
                        } catch (IOException e2) {
                            str = str2;
                            f22185a.mo25416d("Failed to retrieve instanceIdToken. Moving on without it.", new Object[0]);
                            Long b3 = jaz.m16450b(context);
                            a = jaz.m16448a(serverParams);
                            long b22 = jaz.m16449b(serverParams);
                            if (a.equals(str2)) {
                            }
                            f22185a.mo25412b("vaultHandle is outdated", new Object[0]);
                            jar.m16429a(context, RecoveryController.getInstance(context));
                            throw new jck(6, "vaultHandle is outdated");
                        }
                        Long b32 = jaz.m16450b(context);
                        a = jaz.m16448a(serverParams);
                        long b222 = jaz.m16449b(serverParams);
                        if (a.equals(str2) || b222 != b32.longValue()) {
                            f22185a.mo25412b("vaultHandle is outdated", new Object[0]);
                            jar.m16429a(context, RecoveryController.getInstance(context));
                            throw new jck(6, "vaultHandle is outdated");
                        }
                        byte[] encryptedRecoveryKeyBlob = keyChainSnapshot.getEncryptedRecoveryKeyBlob();
                        if (encryptedRecoveryKeyBlob != null) {
                            byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(keyChainSnapshot.getCounterId()).array();
                            bxvd da = bqnc.f141296e.mo74144da();
                            ByteString a3 = ByteString.m123261a(serverParams);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            a3.getClass();
                            ((bqnc) da.f164949b).f141301d = a3;
                            ByteString a4 = ByteString.m123261a(a2);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            a4.getClass();
                            ((bqnc) da.f164949b).f141298a = a4;
                            ByteString a5 = ByteString.m123261a(array);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bqnc bqnc = (bqnc) da.f164949b;
                            a5.getClass();
                            bqnc.f141299b = a5;
                            bqnc.f141300c = maxAttempts;
                            bqnc bqnc2 = (bqnc) da.mo74062i();
                            ByteString a6 = m16519a(keyChainSnapshot);
                            bqna bqna = (bqna) bqnb.f141289f.mo74144da();
                            ByteString a7 = ByteString.m123261a(encryptedRecoveryKeyBlob);
                            if (bqna.f164950c) {
                                bqna.mo74035c();
                                bqna.f164950c = false;
                            }
                            bqnb bqnb = (bqnb) bqna.f164949b;
                            a7.getClass();
                            bqnb.f141294d = a7;
                            a6.getClass();
                            bqnb.f141293c = a6;
                            bqnc2.getClass();
                            bqnb.f141292b = bqnc2;
                            if (!ccgb.m129585d()) {
                                for (WrappedApplicationKey wrappedApplicationKey : this.f22188d.getWrappedApplicationKeys()) {
                                    String alias = wrappedApplicationKey.getAlias();
                                    byte[] encryptedKeyMaterial = wrappedApplicationKey.getEncryptedKeyMaterial();
                                    if (encryptedKeyMaterial == null) {
                                        f22185a.mo25416d("An empty key is not allowed.", new Object[0]);
                                    } else {
                                        bxvd da2 = bqmm.f141233d.mo74144da();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        alias.getClass();
                                        ((bqmm) da2.f164949b).f141237c = alias;
                                        ByteString a8 = ByteString.m123261a(encryptedKeyMaterial);
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bqmm bqmm = (bqmm) da2.f164949b;
                                        a8.getClass();
                                        bqmm.f141235a = 3;
                                        bqmm.f141236b = a8;
                                        bqna.mo69280a((bqmm) da2.mo74062i());
                                    }
                                }
                            } else {
                                this.f22192h.clear();
                                this.f22193i.clear();
                                jcp jcp = this.f22191g;
                                if (jcp == null || !((Boolean) jcp.f22183d.mo66812a((Object) false)).booleanValue()) {
                                    try {
                                        Iterator it = ((jcf) jcf.f22150a.mo13145b()).mo13569a(this.f22186b.name).entrySet().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z = false;
                                                break;
                                            }
                                            Map.Entry entry = (Map.Entry) it.next();
                                            String str3 = (String) entry.getKey();
                                            boolean z2 = ((jbh) entry.getValue()).f22096a;
                                            jcp jcp2 = this.f22191g;
                                            if (jcp2 != null && jcp2.f22183d.mo66813a() && this.f22191g.f22181b.mo66813a() && str3.equals(this.f22191g.f22181b.mo66814b())) {
                                                z2 = ((Boolean) this.f22191g.f22183d.mo66814b()).booleanValue();
                                                continue;
                                            }
                                            if (z2) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    } catch (gid | IOException e3) {
                                        Logger Logger = f22185a;
                                        String valueOf = String.valueOf(e3);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                                        sb.append("Failed to read consent: ");
                                        sb.append(valueOf);
                                        Logger.mo25412b(sb.toString(), new Object[0]);
                                        z = false;
                                    }
                                } else {
                                    z = true;
                                }
                                for (WrappedApplicationKey wrappedApplicationKey2 : this.f22188d.getWrappedApplicationKeys()) {
                                    String alias2 = wrappedApplicationKey2.getAlias();
                                    byte[] encryptedKeyMaterial2 = wrappedApplicationKey2.getEncryptedKeyMaterial();
                                    if (encryptedKeyMaterial2 == null) {
                                        f22185a.mo25416d("An empty key is not allowed.", new Object[0]);
                                    } else if (!jcj.m16493a(alias2)) {
                                        if (this.f22190f) {
                                            bxvd da3 = bqmm.f141233d.mo74144da();
                                            if (da3.f164950c) {
                                                da3.mo74035c();
                                                da3.f164950c = false;
                                            }
                                            alias2.getClass();
                                            ((bqmm) da3.f164949b).f141237c = alias2;
                                            ByteString a9 = ByteString.m123261a(encryptedKeyMaterial2);
                                            if (da3.f164950c) {
                                                da3.mo74035c();
                                                da3.f164950c = false;
                                            }
                                            bqmm bqmm2 = (bqmm) da3.f164949b;
                                            a9.getClass();
                                            bqmm2.f141235a = 3;
                                            bqmm2.f141236b = a9;
                                            bqna.mo69280a((bqmm) da3.mo74062i());
                                            this.f22192h.add(alias2);
                                        }
                                    } else if (z && this.f22193i.isEmpty()) {
                                        try {
                                            bqmn a10 = m16518a(alias2, encryptedKeyMaterial2);
                                            bxvd da4 = bqmm.f141233d.mo74144da();
                                            if (da4.f164950c) {
                                                da4.mo74035c();
                                                da4.f164950c = false;
                                            }
                                            bqmm bqmm3 = (bqmm) da4.f164949b;
                                            "security_domain_member_key".getClass();
                                            bqmm3.f141237c = "security_domain_member_key";
                                            a10.getClass();
                                            bqmm3.f141236b = a10;
                                            bqmm3.f141235a = 4;
                                            bqna.mo69280a((bqmm) da4.mo74062i());
                                            this.f22192h.add(alias2);
                                        } catch (jck e4) {
                                            Logger logger2 = f22185a;
                                            String valueOf2 = String.valueOf(e4);
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                                            sb2.append("Failed to construct key pair: ");
                                            sb2.append(valueOf2);
                                            logger2.mo25416d(sb2.toString(), new Object[0]);
                                        }
                                    }
                                }
                                if (z && this.f22193i.isEmpty()) {
                                    f22185a.mo25412b("Failed to construct UpdateVaultRequest - missing wrapping key", new Object[0]);
                                    ((jcj) jcj.f22155a.mo13145b()).mo13580b();
                                    throw new jck(10, "Missing wrapping key");
                                }
                            }
                            bqnb bqnb2 = (bqnb) bqna.mo74062i();
                            bxvd da5 = bqmz.f141284d.mo74144da();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bqmz bqmz = (bqmz) da5.f164949b;
                            bqnb2.getClass();
                            bqmz.f141287b = bqnb2;
                            str.getClass();
                            bqmz.f141286a = str;
                            String a11 = GcmReceiverChimeraService.m6627a(context);
                            if (a11 != null) {
                                f22185a.mo25412b("gcmRegistationId is not available - sending updateVaultRequest without it", new Object[0]);
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                a11.getClass();
                                ((bqmz) da5.f164949b).f141288c = a11;
                            }
                            f22185a.mo25414c("Successfully synced with remote vault that has name '%s'", ((bqnb) new jbu(this.f22189e, this.f22186b).mo13566a(new jbo((bqmz) da5.mo74062i()))).f141291a);
                            return;
                        }
                        throw new jck(7, "recoveryKeyBlob is null");
                    }
                    throw new jck(6, "vaultHandle is null");
                }
                throw new jck(5, "maxAttempts is 0");
            }
            throw new jck(4, "CertPath is null");
        }
        f22185a.mo25412b("Snapshot is not available", new Object[0]);
        throw new jck(7, "Snapshot is null");
    }

    /* renamed from: a */
    static ByteString m16519a(KeyChainSnapshot keyChainSnapshot) {
        KeyChainProtectionParams keyChainProtectionParams = (KeyChainProtectionParams) keyChainSnapshot.getKeyChainProtectionParams().get(0);
        KeyDerivationParams keyDerivationParams = keyChainProtectionParams.getKeyDerivationParams();
        int a = jif.m16752a(keyChainProtectionParams.getLockScreenUiFormat());
        bxvd da = jig.f22543i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        jig jig = (jig) da.f164949b;
        int i = a - 1;
        if (a != 0) {
            jig.f22546b = i;
            int i2 = jig.f22545a | 1;
            jig.f22545a = i2;
            if (a == 4) {
                int i3 = i2 | 4;
                jig.f22545a = i3;
                jig.f22548d = 3;
                jig.f22545a = i3 | 2;
                jig.f22547c = 3;
            }
            int algorithm = keyDerivationParams.getAlgorithm();
            if (algorithm == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                jig jig2 = (jig) da.f164949b;
                jig2.f22549e = 1;
                jig2.f22545a |= 8;
            } else if (algorithm != 2) {
                int a2 = jid.m16750a(keyDerivationParams.getAlgorithm());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                jig jig3 = (jig) da.f164949b;
                int i4 = a2 - 1;
                if (a2 != 0) {
                    jig3.f22549e = i4;
                    jig3.f22545a |= 8;
                    Logger Logger = f22185a;
                    int algorithm2 = keyDerivationParams.getAlgorithm();
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Unknown hash type: ");
                    sb.append(algorithm2);
                    Logger.mo25418e(sb.toString(), new Object[0]);
                } else {
                    throw null;
                }
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                jig jig4 = (jig) da.f164949b;
                jig4.f22549e = 3;
                jig4.f22545a |= 8;
            }
            int memoryDifficulty = keyDerivationParams.getMemoryDifficulty();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            jig jig5 = (jig) da.f164949b;
            jig5.f22545a |= 32;
            jig5.f22551g = memoryDifficulty;
            Logger logger2 = f22185a;
            int memoryDifficulty2 = keyDerivationParams.getMemoryDifficulty();
            StringBuilder sb2 = new StringBuilder(58);
            sb2.append("Got memory difficulty from KeyDrivationParams: ");
            sb2.append(memoryDifficulty2);
            logger2.mo25412b(sb2.toString(), new Object[0]);
            ByteString a3 = ByteString.m123261a(keyDerivationParams.getSalt());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            jig jig6 = (jig) da.f164949b;
            a3.getClass();
            jig6.f22545a |= 16;
            jig6.f22550f = a3;
            try {
                ByteString a4 = ByteString.m123261a(keyChainSnapshot.getTrustedHardwareCertPath().getEncoded("PkiPath"));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                jig jig7 = (jig) da.f164949b;
                a4.getClass();
                jig7.f22545a |= 64;
                jig7.f22552h = a4;
                return ((jig) da.mo74062i()).mo73639aL();
            } catch (CertificateEncodingException e) {
                f22185a.mo25417e("The CertPath given by Framework cannot be properly serialized", e, new Object[0]);
                throw new jck(4, "Cannot encode the given CertPath");
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public static jcs m16520a(Context context, Account account) {
        return m16521a(context, account, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static jcs m16521a(Context context, Account account, jcp jcp) {
        boolean z;
        RecoveryController instance = RecoveryController.getInstance(context);
        KeyChainSnapshot keyChainSnapshot = instance.getKeyChainSnapshot();
        if (ccgb.m129585d()) {
            z = account.equals(KeySyncIntentOperation.m6606a(context)) & KeySyncIntentOperation.m6607b(rpr.m34216b());
        } else {
            z = true;
        }
        return new jcs(context, account, z, instance, keyChainSnapshot, jcp);
    }

    /* renamed from: a */
    private final void m16523a(String str, int i) {
        if (!ccfy.f178890a.mo6606a().mo75896k() || this.f22187c.getRecoveryStatus(str) != 3) {
            this.f22187c.setRecoveryStatus(str, i);
        }
    }

    /* renamed from: a */
    public final void mo13587a(int i) {
        if (this.f22188d == null) {
            f22185a.mo25414c("Snapshot is null", new Object[0]);
            return;
        }
        if (!ccgb.m129585d()) {
            List wrappedApplicationKeys = this.f22188d.getWrappedApplicationKeys();
            int size = wrappedApplicationKeys.size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < wrappedApplicationKeys.size(); i2++) {
                strArr[i2] = ((WrappedApplicationKey) wrappedApplicationKeys.get(i2)).getAlias();
            }
            for (int i3 = 0; i3 < size; i3++) {
                m16523a(strArr[i3], i);
            }
        } else {
            List list = this.f22192h;
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                m16523a((String) list.get(i4), i);
            }
            int snapshotVersion = this.f22188d.getSnapshotVersion();
            try {
                jcf jcf = (jcf) jcf.f22150a.mo13145b();
                String str = this.f22186b.name;
                List list2 = this.f22193i;
                bqfy.m112768a(jcf.f22152c.mo60777a(new jcc(jcf.f22151b.mo13599a(str), list2, snapshotVersion), bqfb.INSTANCE), IOException.class);
            } catch (gid | IOException e) {
                f22185a.mo25414c("Failed to store snapshot version", new Object[0]);
            }
        }
        if (this.f22190f) {
            Intent intent = new Intent("com.google.android.gms.auth.folsom.SYNC_DONE").setPackage(this.f22189e.getApplicationContext().getPackageName());
            Bundle bundle = new Bundle();
            bundle.putInt("com.google.android.gms.auth.folsom.EXTRA_SYNC_RESULT", i);
            intent.putExtras(bundle);
            this.f22189e.sendBroadcast(intent);
        }
        if (ccfy.m129506r() && i == 0) {
            int snapshotVersion2 = this.f22188d.getSnapshotVersion();
            try {
                jcf jcf2 = (jcf) jcf.f22150a.mo13145b();
                bqfy.m112768a(jcf2.f22152c.mo60777a(new jcb(jcf2.f22151b.mo13599a(this.f22186b.name), snapshotVersion2), bqfb.INSTANCE), IOException.class);
            } catch (gid | IOException e2) {
                f22185a.mo25414c("Failed to store snapshot version", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo13588a() {
        boolean z;
        int i;
        jcp jcp = this.f22191g;
        if (jcp != null && jcp.f22183d.mo66813a()) {
            return true;
        }
        KeyChainSnapshot keyChainSnapshot = this.f22188d;
        if (keyChainSnapshot != null) {
            int snapshotVersion = keyChainSnapshot.getSnapshotVersion();
            if (this.f22190f) {
                try {
                    if (snapshotVersion != ((jcf) jcf.f22150a.mo13145b()).mo13576c(this.f22186b.name)) {
                        return true;
                    }
                } catch (gid | IOException e) {
                    Logger Logger = f22185a;
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Failed to get snapshot version: ");
                    sb.append(valueOf);
                    Logger.mo25414c(sb.toString(), new Object[0]);
                    throw new jck(13, e);
                }
            }
            try {
                Iterator it = ((jcf) jcf.f22150a.mo13145b()).mo13569a(this.f22186b.name).entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((jbh) ((Map.Entry) it.next()).getValue()).f22096a) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                try {
                    List b = ((jcf) jcf.f22150a.mo13145b()).mo13574b(this.f22186b.name);
                    if (b.size() != 1) {
                        f22185a.mo25418e("KeyPair should be generated before updateVaultRequest", new Object[0]);
                        i = 0;
                    } else {
                        i = ((jbf) b.get(0)).f22089d;
                    }
                    return !z ? i != 0 : i != snapshotVersion;
                } catch (gid | IOException e2) {
                    Logger logger2 = f22185a;
                    String valueOf2 = String.valueOf(e2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
                    sb2.append("Failed to read KeyPair:");
                    sb2.append(valueOf2);
                    logger2.mo25414c(sb2.toString(), new Object[0]);
                    throw new jck(11, e2);
                }
            } catch (gid | IOException e3) {
                Logger logger3 = f22185a;
                String valueOf3 = String.valueOf(e3);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
                sb3.append("Failed to read consent: ");
                sb3.append(valueOf3);
                logger3.mo25412b(sb3.toString(), new Object[0]);
                throw new jck(13, e3);
            }
        } else {
            f22185a.mo25414c("Snapshot is null", new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo13589a(String str) {
        try {
            return this.f22187c.getRecoveryStatus(str) == 1;
        } catch (InternalRecoveryServiceException e) {
            f22185a.mo25417e("Couldn't get recovery status for alias: %s", e, str);
            return false;
        }
    }
}
