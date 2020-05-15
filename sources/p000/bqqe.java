package p000;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;

/* renamed from: bqqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqe {

    /* renamed from: a */
    private static final String f141363a = bqqe.class.getSimpleName();

    /* renamed from: b */
    private final bqnu f141364b;

    /* renamed from: c */
    private final boolean f141365c;

    /* renamed from: d */
    private final bqng f141366d;

    /* renamed from: e */
    private final bqsf f141367e;

    /* renamed from: f */
    private bqnt f141368f;

    /* renamed from: g */
    private final bqqi f141369g;

    public bqqe(bqqd bqqd) {
        bqnt bqnt;
        bqnu bqnu = bqqd.f141358a;
        this.f141364b = bqnu;
        if (bqnu != null) {
            bqqi bqqi = bqqd.f141362e;
            this.f141369g = bqqi;
            if (bqqi != null) {
                boolean z = bqqd.f141360c;
                this.f141365c = z;
                if (!z || bqqd.f141359b != null) {
                    if (m113235c()) {
                        String str = bqqd.f141359b;
                        String a = bqwl.m113525a("android-keystore://", str);
                        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                        instance.load(null);
                        if (!instance.containsAlias(a)) {
                            String a2 = bqwl.m113525a("android-keystore://", str);
                            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                            instance2.init(new KeyGenParameterSpec.Builder(a2, 3).setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                            instance2.generateKey();
                        }
                        new bqqg();
                        this.f141366d = bqqg.m113239a(str);
                    } else {
                        this.f141366d = null;
                    }
                    this.f141367e = bqqd.f141361d;
                    try {
                        bqnt = m113234b();
                    } catch (IOException e) {
                        String str2 = f141363a;
                        String valueOf = String.valueOf(e.toString());
                        Log.i(str2, valueOf.length() == 0 ? new String("cannot read keyset: ") : "cannot read keyset: ".concat(valueOf));
                        if (this.f141367e != null) {
                            bqnt = bqnt.m113060a();
                            bqnt.mo69310b(this.f141367e);
                            if (m113235c()) {
                                bqnt.mo69309b().mo69306a(this.f141369g, this.f141366d);
                            } else {
                                bqns b = bqnt.mo69309b();
                                bqqi bqqi2 = this.f141369g;
                                if (!bqqi2.f141373a.putString(bqqi2.f141374b, bqvz.m113507a(b.f141318a.mo73642k())).commit()) {
                                    throw new IOException("Failed to write to SharedPreferences");
                                }
                            }
                        } else {
                            throw new GeneralSecurityException("cannot obtain keyset handle");
                        }
                    } catch (IOException e2) {
                        throw new GeneralSecurityException(e2);
                    }
                    this.f141368f = bqnt;
                    return;
                }
                throw new IllegalArgumentException("need a master key URI, please set it with Builder#masterKeyUri");
            }
            throw new IllegalArgumentException("need to specify where to write the keyset to with Builder#withSharedPref");
        }
        throw new IllegalArgumentException("need to specify where to read the keyset from with Builder#withSharedPref");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        r0 = new java.lang.String("cannot decrypt keyset: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        r0 = "cannot decrypt keyset: ".concat(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[ExcHandler: GeneralSecurityException (e java.security.GeneralSecurityException), Splitter:B:2:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* renamed from: b */
    private final bqnt m113234b() {
        String str;
        if (m113235c()) {
            try {
                bqnu bqnu = this.f141364b;
                bqng bqng = this.f141366d;
                bqrx bqrx = (bqrx) bxvk.m124016a(bqrx.f141492c, ((bqqh) bqnu).mo69326b(), bxus.m123743b());
                if (bqrx == null || bqrx.f141494a.mo73744a() == 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                bqsj bqsj = (bqsj) bxvk.m124016a(bqsj.f141531c, bqng.mo69282b(bqrx.f141494a.mo73780k(), new byte[0]), bxus.m123743b());
                bqns.m113056b(bqsj);
                return bqnt.m113061a(new bqns(bqsj));
            } catch (bxwf e) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            } catch (GeneralSecurityException e2) {
            } catch (bxwf e3) {
                e = e3;
                String str2 = f141363a;
                String valueOf = String.valueOf(e.toString());
                if (valueOf.length() != 0) {
                }
                Log.i(str2, str);
                bqns a = bqns.m113055a((bqsj) bxvk.m124016a(bqsj.f141531c, ((bqqh) this.f141364b).mo69326b(), bxus.m123743b()));
                if (m113235c()) {
                }
                return bqnt.m113061a(a);
            }
        }
        bqns a2 = bqns.m113055a((bqsj) bxvk.m124016a(bqsj.f141531c, ((bqqh) this.f141364b).mo69326b(), bxus.m123743b()));
        if (m113235c()) {
            a2.mo69306a(this.f141369g, this.f141366d);
        }
        return bqnt.m113061a(a2);
    }

    /* renamed from: c */
    private final boolean m113235c() {
        if (!this.f141365c) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: a */
    public final synchronized bqns mo69325a() {
        return this.f141368f.mo69309b();
    }
}
