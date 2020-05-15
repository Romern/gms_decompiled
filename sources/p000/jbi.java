package p000;

import android.content.Context;
import android.security.keystore.recovery.DecryptionFailedException;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.KeyChainProtectionParams;
import android.security.keystore.recovery.KeyDerivationParams;
import android.security.keystore.recovery.RecoveryController;
import android.security.keystore.recovery.RecoverySession;
import android.security.keystore.recovery.SessionExpiredException;
import android.security.keystore.recovery.WrappedApplicationKey;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: jbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jbi implements AutoCloseable {

    /* renamed from: a */
    private static final Logger f22099a = jdh.m16547a("KeyRecoveryController");

    /* renamed from: b */
    private final jbk f22100b;

    /* renamed from: c */
    private final Context f22101c;

    /* renamed from: d */
    private bqnb f22102d;

    /* renamed from: e */
    private RecoverySession f22103e;

    public jbi(Context context, jbk jbk) {
        this.f22100b = jbk;
        this.f22101c = context;
    }

    /* renamed from: c */
    private final bqnb m16458c() {
        bqnb bqnb = this.f22102d;
        if (bqnb != null) {
            return bqnb;
        }
        throw new jbl("Please first call startRecovery().", 15);
    }

    /* renamed from: a */
    public final bqmv mo13560a() {
        long j;
        KeyChainProtectionParams build = new KeyChainProtectionParams.Builder().setUserSecretType(100).setLockScreenUiFormat(2).setKeyDerivationParams(KeyDerivationParams.createSha256Params(new byte[0])).setSecret(this.f22100b.f22109b.getKey()).build();
        ArrayList arrayList = new ArrayList();
        arrayList.add(build);
        byte[] array = ByteBuffer.allocate(94).order(ByteOrder.LITTLE_ENDIAN).put(this.f22100b.f22112e.getKey()).putLong(this.f22100b.f22114g).putInt(this.f22100b.f22113f).put(this.f22100b.f22115h.getKey()).array();
        f22099a.mo25414c("Vault params have length %d", Integer.valueOf(array.length));
        f22099a.mo25414c("Starting a recovery session", new Object[0]);
        RecoverySession createRecoverySession = RecoveryController.getInstance(this.f22101c).createRecoverySession();
        this.f22103e = createRecoverySession;
        try {
            String q = ccfy.m129505q();
            jbk jbk = this.f22100b;
            byte[] start = createRecoverySession.start(q, jbk.f22111d, array, jbk.f22110c.getKey(), arrayList);
            if (start != null) {
                f22099a.mo25414c("Recovery claim has length %d", Integer.valueOf(start.length));
                Logger Logger = f22099a;
                Object[] objArr = new Object[2];
                ByteString bxtx = this.f22100b.f22115h;
                if (bxtx != null) {
                    ByteBuffer order = ByteBuffer.wrap(bxtx.getKey()).order(ByteOrder.LITTLE_ENDIAN);
                    order.get();
                    order.getLong();
                    j = order.getLong();
                } else {
                    j = -1;
                }
                objArr[0] = Long.valueOf(j);
                objArr[1] = srv.m36160a(this.f22100b.f22110c.getKey());
                Logger.mo25412b("Opening vault for device %d with challenge '%s' ... ", objArr);
                ByteString a = bxtx.m123261a(start);
                jbk jbk2 = this.f22100b;
                ByteString bxtx2 = jbk2.f22115h;
                ByteString bxtx3 = jbk2.f22110c;
                bxvd da = bqmu.f141262d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqmu bqmu = (bqmu) da.f164949b;
                bxtx3.getClass();
                bqmu.f141266c = bxtx3;
                a.getClass();
                bqmu.f141265b = a;
                bxtx2.getClass();
                bqmu.f141264a = bxtx2;
                f22099a.mo25414c("Using vault service for account '%s'", Logger.m35081a(this.f22100b.f22108a.name));
                bqmv bqmv = (bqmv) new jbu(this.f22101c, this.f22100b.f22108a).mo13566a(new jbp((bqmu) da.mo74062i()));
                bqnb bqnb = bqmv.f141270b;
                if (bqnb == null) {
                    bqnb = bqnb.f141289f;
                }
                this.f22102d = bqnb;
                return bqmv;
            }
            f22099a.mo25418e("Recovery claim is null", new Object[0]);
            throw new jbl("Failed to recover snapshot", 17);
        } catch (InternalRecoveryServiceException e) {
            f22099a.mo25417e("Failed to call session.start", e, new Object[0]);
            throw new jbl("Failed to recover snapshot", 17);
        } catch (CertificateException e2) {
            f22099a.mo25417e("Failed to call session.start", e2, new Object[0]);
            throw new jbl("Failed to recover snapshot", 13);
        }
    }

    /* renamed from: b */
    public final void mo13561b() {
        ByteString bxtx;
        if (this.f22103e != null) {
            byte[] k = m16458c().f141294d.getKey();
            bxwc bxwc = m16458c().f141295e;
            ArrayList arrayList = new ArrayList(bxwc.size());
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bqmm bqmm = (bqmm) bxwc.get(i);
                WrappedApplicationKey.Builder alias = new WrappedApplicationKey.Builder().setAlias(bqmm.f141237c);
                if (bqmm.f141235a == 3) {
                    bxtx = (ByteString) bqmm.f141236b;
                } else {
                    bxtx = bxtx.f164797b;
                }
                arrayList.add(alias.setEncryptedKeyMaterial(bxtx.getKey()).build());
            }
            f22099a.mo25414c("Attempting to recover %d application keys", Integer.valueOf(arrayList.size()));
            try {
                Map recoverKeyChainSnapshot = this.f22103e.recoverKeyChainSnapshot(k, arrayList);
                f22099a.mo25414c("Got %d keys back from framework", Integer.valueOf(recoverKeyChainSnapshot.size()));
                this.f22102d = null;
            } catch (SessionExpiredException e) {
                throw new jbl("Recovery session expired", 15);
            } catch (DecryptionFailedException e2) {
                throw new jbl("Client crypto error", 13);
            } catch (InternalRecoveryServiceException e3) {
                throw new jbl("Failed to recover snapshot", 16);
            }
        } else {
            throw new jbl("Cannot import application keys before starting session", 15);
        }
    }

    public final void close() {
        RecoverySession recoverySession = this.f22103e;
        if (recoverySession != null) {
            recoverySession.close();
        }
    }
}
