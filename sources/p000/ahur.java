package p000;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahur {
    /* renamed from: a */
    public static ahsu m56665a(Context context, bxvd bxvd, String str, byte[] bArr) {
        ahsu e = ((ahst) ahgz.m55754a(context, ahst.class)).mo37052e(((aiaa) bxvd.f164949b).f68515c);
        if (e != null) {
            int J = e.mo37063J();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiaa aiaa = (aiaa) bxvd.f164949b;
            int i = J - 1;
            aiaa aiaa2 = aiaa.f68501K;
            if (J != 0) {
                aiaa.f68525m = i;
                aiaa.f68513a |= 1024;
                int I = e.mo37062I();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                aiaa aiaa3 = (aiaa) bxvd.f164949b;
                int i2 = I - 1;
                if (I != 0) {
                    aiaa3.f68507E = i2;
                    aiaa3.f68513a |= 134217728;
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aiaa aiaa4 = (aiaa) bxvd.f164949b;
        aiaa aiaa5 = aiaa.f68501K;
        str.getClass();
        aiaa4.f68513a |= 4;
        aiaa4.f68517e = str;
        ahyw a = ahvd.m56704a(context, str);
        if (a != null) {
            long j = a.f68415y;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiaa aiaa6 = (aiaa) bxvd.f164949b;
            aiaa6.f68513a |= 512;
            aiaa6.f68524l = j;
        }
        long a2 = ((sqv) ahgz.m55754a(context, sqv.class)).mo20505a();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aiaa aiaa7 = (aiaa) bxvd.f164949b;
        aiaa7.f68513a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aiaa7.f68523k = a2;
        String string = context.getString(C0126R.string.common_tap_to_pair);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aiaa aiaa8 = (aiaa) bxvd.f164949b;
        string.getClass();
        aiaa8.f68513a |= 64;
        aiaa8.f68521i = string;
        aiaa8.f68505C = GeneratedMessageLite.m124030de();
        bxvd.mo74023ac(ahsf.m56460a(601));
        Intent putExtra = DiscoveryChimeraService.m67336a(context).setPackage(context.getPackageName()).setAction("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", ((aiaa) bxvd.f164949b).f68515c).putExtra("com.google.android.gms.nearby.discovery.EXTRA_FAST_PAIR_SECRET", boan.f132472f.mo68794a(bArr));
        aiaa aiaa9 = (aiaa) bxvd.f164949b;
        if ((aiaa9.f68513a & 8) != 0) {
            try {
                putExtra.putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", Intent.parseUri(aiaa9.f68518f, 0).getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP"));
            } catch (URISyntaxException e2) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e2);
                bnsl.mo68420a("Failed to parse action url %s", ((aiaa) bxvd.f164949b).f68518f);
            }
        }
        String uri = putExtra.toUri(1);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aiaa aiaa10 = (aiaa) bxvd.f164949b;
        uri.getClass();
        int i3 = aiaa10.f68513a | 8;
        aiaa10.f68513a = i3;
        aiaa10.f68518f = uri;
        String str2 = aiaa10.f68520h;
        str2.getClass();
        aiaa10.f68513a = i3 | 64;
        aiaa10.f68521i = str2;
        String string2 = context.getString(C0126R.string.fast_pair_your_device);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aiaa aiaa11 = (aiaa) bxvd.f164949b;
        string2.getClass();
        aiaa11.f68513a |= 32;
        aiaa11.f68520h = string2;
        return new ahsu(context, (aiaa) bxvd.mo74062i());
    }

    /* renamed from: a */
    public static boolean m56678a(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }

    /* renamed from: a */
    static ahza m56666a(List list, ahyz ahyz) {
        srn srn = ahsd.f67925a;
        list.size();
        if (!(ahyz == null || (ahyz.f68427a & 2) == 0)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ahza ahza = (ahza) it.next();
                if (Arrays.equals(ahyz.f68429c.getKey(), ahza.f68444b.getKey())) {
                    return ahza;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        if ((r0.getCause() instanceof p000.bxwf) != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        throw ((p000.bxwf) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        if ((r0.getCause() instanceof p000.bxwf) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        throw new p000.bxwf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        throw ((p000.bxwf) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab A[ExcHandler: InterruptedException | ExecutionException (e java.lang.Throwable), Splitter:B:14:0x003d] */
    /* renamed from: a */
    static aiaa m56667a(Context context, ahyz ahyz, buru buru) {
        if ((ahyz.f68427a & 1024) != 0) {
            aiaa aiaa = ahyz.f68439n;
            return aiaa == null ? aiaa.f68501K : aiaa;
        } else if (cfom.m141867b() && context == null) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPair: Unable to read Footprints due to context is null.");
            return null;
        } else {
            for (Account account : soz.m35801d(context, context.getPackageName())) {
                try {
                    ahza a = m56666a((List) buru.mo73055a(account).get(), ahyz);
                    if (a != null) {
                        ByteString bxtx = a.f68445c;
                        bxus c = bxus.m123744c();
                        aiaa aiaa2 = aiaa.f68501K;
                        bxuc h = bxtx.mo73764h();
                        GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) aiaa2.mo74142c(4);
                        bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                        a2.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                        a2.mo74225d(GeneratedMessageLite);
                        h.mo73787a(0);
                        GeneratedMessageLite.m124027b(GeneratedMessageLite);
                        return (aiaa) GeneratedMessageLite;
                    }
                    continue;
                } catch (InterruptedException | ExecutionException e) {
                } catch (bxwf e2) {
                    e = e2;
                }
            }
            return null;
        }
        bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
        bnsl.mo68437a(e);
        bnsl.mo68405a("FastPair: Failed to read device from Footprints based on cached item.");
    }

    /* renamed from: a */
    public static Executor m56668a() {
        return snp.m35704b(10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0238, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0242, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0245, code lost:
        r2 = (p000.bnsl) p000.ahsd.f67925a.mo68387b();
        r2.mo68437a(r0);
        r2.mo68405a("FastPair: Error");
        r11.mo37148a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0259, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0214, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0215, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r2 = (p000.bnsl) p000.ahsd.f67925a.mo68388c();
        r2.mo68437a(r1);
        r2.mo68405a("FastPair: Failed to insert device into cache.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x022c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022d, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0232, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0238 A[ExcHandler: ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException (e java.lang.Throwable), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ac A[Catch:{ all -> 0x022c, all -> 0x0232, BluetoothException -> 0x0244, InterruptedException -> 0x0242, ayqn -> 0x0240, TimeoutException -> 0x023e, ExecutionException -> 0x023c, PairingException -> 0x023a, ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ad A[Catch:{ all -> 0x022c, all -> 0x0232, BluetoothException -> 0x0244, InterruptedException -> 0x0242, ayqn -> 0x0240, TimeoutException -> 0x023e, ExecutionException -> 0x023c, PairingException -> 0x023a, ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01be A[Catch:{ all -> 0x022c, all -> 0x0232, BluetoothException -> 0x0244, InterruptedException -> 0x0242, ayqn -> 0x0240, TimeoutException -> 0x023e, ExecutionException -> 0x023c, PairingException -> 0x023a, ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ca A[Catch:{ all -> 0x022c, all -> 0x0232, BluetoothException -> 0x0244, InterruptedException -> 0x0242, ayqn -> 0x0240, TimeoutException -> 0x023e, ExecutionException -> 0x023c, PairingException -> 0x023a, ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01cd A[Catch:{ all -> 0x022c, all -> 0x0232, BluetoothException -> 0x0244, InterruptedException -> 0x0242, ayqn -> 0x0240, TimeoutException -> 0x023e, ExecutionException -> 0x023c, PairingException -> 0x023a, ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d6 A[Catch:{ all -> 0x022c, all -> 0x0232, BluetoothException -> 0x0244, InterruptedException -> 0x0242, ayqn -> 0x0240, TimeoutException -> 0x023e, ExecutionException -> 0x023c, PairingException -> 0x023a, ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e9 A[Catch:{ all -> 0x022c, all -> 0x0232, BluetoothException -> 0x0244, InterruptedException -> 0x0242, ayqn -> 0x0240, TimeoutException -> 0x023e, ExecutionException -> 0x023c, PairingException -> 0x023a, ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ee A[Catch:{ all -> 0x022c, all -> 0x0232, BluetoothException -> 0x0244, InterruptedException -> 0x0242, ayqn -> 0x0240, TimeoutException -> 0x023e, ExecutionException -> 0x023c, PairingException -> 0x023a, ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f9 A[Catch:{ all -> 0x022c, all -> 0x0232, BluetoothException -> 0x0244, InterruptedException -> 0x0242, ayqn -> 0x0240, TimeoutException -> 0x023e, ExecutionException -> 0x023c, PairingException -> 0x023a, ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException -> 0x0238 }] */
    /* renamed from: a */
    static void m56669a(Context context, ahsu ahsu, String str, byte[] bArr, buru buru, ahvo ahvo) {
        String G;
        aypk aypk;
        bngx bngx;
        boolean z;
        byte[] bArr2;
        byte[] a;
        int a2;
        Throwable th;
        Context context2 = context;
        byte[] bArr3 = bArr;
        ahvo ahvo2 = ahvo;
        ((ahuu) ahgz.m55754a(context2, ahuu.class)).mo37179a();
        try {
            ahvo.mo37204d();
            if (((KeyguardManager) context2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                srn srn = ahsd.f67925a;
                ayqo ayqo = new ayqo(context2, ahvg.m56719a().mo54224a(), "android.intent.action.USER_PRESENT");
                ayqo.mo54283a(cfog.f184854a.mo6606a().mo82023be(), TimeUnit.MILLISECONDS);
                ayqo.close();
            }
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("PairingProgressHandler:onScreenUnlocked");
            ahvo2.f68175e.mo37126b();
            if (cfod.m141147g() && !burl.m120292a()) {
                if (BluetoothAdapter.getDefaultAdapter().enable()) {
                    ((buqh) ahgz.m55754a(context2, buqh.class)).mo72987c(new ahum("enableBluetoothToast", context2));
                } else {
                    return;
                }
            }
            ahvo.mo37207e();
            G = ahsu.mo37060G();
            boolean contains = Arrays.asList(cfog.f184854a.mo6606a().mo81940B().split(",")).contains(G);
            ayqi a3 = ahvg.m56719a();
            a3.mo54240f(contains);
            a3.mo54252l(true);
            ahvo2.mo37146a(a3);
            if (ahsu.mo37091p() != null) {
                if ((ahsu.mo37091p().f169047a & 1) != 0) {
                    a3.mo54270u(ahsu.mo37091p().f169048b);
                }
            }
            if (cfoj.f184966a.mo6606a().mo82051B()) {
                if (!(ahsu.mo37091p() == null || (ahsu.mo37091p().f169047a & 32) == 0 || (a2 = bzap.m125587a(ahsu.mo37091p().f169054i)) == 0 || a2 != 9)) {
                    a3.mo54275x(true);
                    a3.mo54239f(1);
                }
            }
            aypk = new aypk(context2, ahsu.mo37088m(), a3.mo54224a(), new ahts(ahvo2.f68175e));
            aypk.f98176b = new ahud(context, ahsu, str, ahvo, aypk, bArr, buru);
            if (cfoj.m141524E()) {
                aypk.f98181g = new ahue(ahvo2);
            }
            bngs j = bngx.m109377j();
            for (ahza ahza : (List) buru.mo73054a().get()) {
                int i = ahza.f68443a;
                if (!((i & 1) == 0 || (i & 4) == 0)) {
                    j.mo67668c(new aynh(ahza.f68444b, ahza.f68446d));
                }
            }
            bngx = j.mo67664a();
        } catch (ExecutionException e) {
            e = e;
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("FastPair: Failed to read sha256 and account key from Footprints.");
            bngx = null;
            bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
            bnsl2.mo68432a("aypk", "a", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Paired history has been set.");
            aypk.f98178d = new aypg(bngx);
            if (cfoj.m141568r()) {
            }
            ahvo.mo37152c();
            if (cfoj.f184966a.mo6606a().mo82187t()) {
            }
            if (bArr3 == null) {
            }
            if (z) {
            }
            if (bArr3 == null) {
            }
            a = ahvo2.mo37149a(bArr3, aypk, aypk.mo54190a(bArr2));
            if (a != null) {
            }
            ahvo2.mo37151b(aypk.f98177c);
            return;
        } catch (InterruptedException e2) {
            e = e2;
            bnsl bnsl3 = (bnsl) ahsd.f67925a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68405a("FastPair: Failed to read sha256 and account key from Footprints.");
            bngx = null;
            bnsl bnsl22 = (bnsl) aypn.f98194a.mo68390d();
            bnsl22.mo68432a("aypk", "a", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl22.mo68405a("Paired history has been set.");
            aypk.f98178d = new aypg(bngx);
            if (cfoj.m141568r()) {
            }
            ahvo.mo37152c();
            if (cfoj.f184966a.mo6606a().mo82187t()) {
            }
            if (bArr3 == null) {
            }
            if (z) {
            }
            if (bArr3 == null) {
            }
            a = ahvo2.mo37149a(bArr3, aypk, aypk.mo54190a(bArr2));
            if (a != null) {
            }
            ahvo2.mo37151b(aypk.f98177c);
            return;
        } catch (ayqn | BluetoothException | PairingException | GeneralSecurityException | ExecutionException | TimeoutException e3) {
        }
        bnsl bnsl222 = (bnsl) aypn.f98194a.mo68390d();
        bnsl222.mo68432a("aypk", "a", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl222.mo68405a("Paired history has been set.");
        aypk.f98178d = new aypg(bngx);
        if (cfoj.m141568r()) {
            aypk.f98180f = G;
        }
        ahvo.mo37152c();
        if (cfoj.f184966a.mo6606a().mo82187t()) {
            int i2 = Build.VERSION.SDK_INT;
            z = sre.m36084d(context);
        } else {
            z = false;
        }
        if (bArr3 == null || ahsu.mo37089n() != null) {
            if (z) {
                if (cfoj.f184966a.mo6606a().mo82164bu()) {
                }
            }
            if (bArr3 == null) {
                bArr2 = ahsu.mo37089n();
            } else {
                bArr2 = bArr3;
            }
            a = ahvo2.mo37149a(bArr3, aypk, aypk.mo54190a(bArr2));
            if (a != null) {
                ((buqh) ahgz.m55754a(context2, buqh.class)).mo72982a(new ahun("FastPairCacheDevice", aypk.f98177c, ahsu, a, context));
            }
            ahvo2.mo37151b(aypk.f98177c);
            return;
        }
        aypk.mo54201e();
        ahvo2.mo37151b(aypk.f98177c);
        return;
        throw th;
    }

    /* renamed from: a */
    static final /* synthetic */ void m56670a(Context context, ahyz ahyz, buru buru, BluetoothDevice bluetoothDevice) {
        String str;
        aiaa a = m56667a(context, ahyz, buru);
        if (a != null) {
            try {
                str = Intent.parseUri(a.f68518f, 0).getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP");
            } catch (URISyntaxException e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("FastPair: Failed to parse companion app.");
                str = null;
            }
            m56674a(context, bluetoothDevice.getAddress(), a, str);
            return;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Failed to get stored discovery item for writing bluetooth metadata.");
    }

    /* renamed from: a */
    public static void m56671a(Context context, ahyz ahyz, byte[] bArr, boolean z, double d, buru buru, String str) {
        aiaa aiaa;
        bmxv bmxv;
        if ((ahyz.f68427a & 1024) == 0) {
            aiaa = m56667a(context, ahyz, buru);
        } else {
            aiaa = ahyz.f68439n;
            if (aiaa == null) {
                aiaa = aiaa.f68501K;
            }
        }
        if (aiaa != null) {
            ahwk ahwk = (ahwk) ahgz.m55754a(context, ahwk.class);
            if (!cfoj.f184966a.mo6606a().mo82182o() || !ahwk.mo37238b(ahyz.f68428b)) {
                BatteryAdvertisement batteryAdvertisement = new BatteryAdvertisement();
                batteryAdvertisement.mo44197a(bArr);
                batteryAdvertisement.f80506c = z;
                batteryAdvertisement.f80507d = d;
                batteryAdvertisement.f80509f = ahyz.f68429c;
                batteryAdvertisement.f80504a = ahyz.f68428b;
                batteryAdvertisement.mo44196a(aiaa);
                batteryAdvertisement.f80522s = 1;
                ahyw a = ahvd.m56704a(context, str);
                if (a == null) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairUtils: Failed to find the scan result for %s", str);
                    bmxv = bmvz.f131120a;
                } else {
                    bmxv = bmxv.m108566b(Long.valueOf(a.f68415y));
                }
                batteryAdvertisement.f80518o = ((Long) bmxv.mo66812a((Object) -1L)).longValue();
                ahwk.mo37237b(batteryAdvertisement);
            }
        }
    }

    /* renamed from: a */
    public static void m56672a(Context context, BluetoothDevice bluetoothDevice, ahyz ahyz, buru buru) {
        if (cfoj.m141551af()) {
            int i = Build.VERSION.SDK_INT;
            if (buqx.m120257a(bluetoothDevice, 1) != null) {
                srn srn = ahsd.f67925a;
                return;
            }
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Backfilling bluetooth metadata for %s", bluetoothDevice);
            m56675a(new ahul(context, ahyz, buru, bluetoothDevice));
        }
    }

    /* renamed from: a */
    public static void m56673a(Context context, BluetoothDevice bluetoothDevice, aiaa aiaa, int i, ahzs ahzs) {
        String a = buqx.m120257a(bluetoothDevice, i);
        if (!bmxx.m108577a(a) && !ahzt.m56927a(context, Uri.parse(a))) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: re-get image's content uri:%s", ahzt.m56924a(aiaa, ahzs).mo37328a(context));
        }
    }

    /* renamed from: a */
    public static void m56674a(Context context, String str, aiaa aiaa, String str2) {
        BluetoothAdapter defaultAdapter;
        Set<BluetoothDevice> bondedDevices;
        if (cfom.m141867b() && cfoj.f184966a.mo6606a().mo82142bM()) {
            if (!bmxx.m108577a(str) && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && (bondedDevices = defaultAdapter.getBondedDevices()) != null && !bondedDevices.isEmpty()) {
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    if (bluetoothDevice == null || !str.equals(bluetoothDevice.getAddress())) {
                    }
                }
            }
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Skipping writing metadata due to %s is not bonded", str);
            return;
        }
        bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
        Boolean valueOf = Boolean.valueOf(cfoj.m141551af());
        int i = Build.VERSION.SDK_INT;
        bnsl.mo68426a("FastPair: Preparing to write metadata: %s, %s (SDK_INT: %d, Q: %d)", valueOf, true, Integer.valueOf(Build.VERSION.SDK_INT), 29);
        if (cfoj.m141551af()) {
            int i2 = Build.VERSION.SDK_INT;
            boolean a = buqy.m120264a(aiaa);
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            buqx.m120258a(remoteDevice, 1, aiaa.f68520h);
            byzb byzb = aiaa.f68511I;
            if (byzb == null) {
                byzb = byzb.f169045j;
            }
            buqx.m120258a(remoteDevice, 0, byzb.f169053h);
            String valueOf2 = String.valueOf(aiaa.f68537y);
            buqx.m120258a(remoteDevice, 3, valueOf2.length() == 0 ? new String("FAST_PAIR_") : "FAST_PAIR_".concat(valueOf2));
            if (m56677a(str2)) {
                buqx.m120258a(remoteDevice, 4, str2);
            }
            buqx.m120258a(remoteDevice, 6, (!a ? Boolean.FALSE : Boolean.TRUE).toString());
            buqx.m120258a(remoteDevice, 16, new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath("links").appendQueryParameter("address", str).toString());
            Uri a2 = ahzt.m56924a(aiaa, ahzs.MAIN).mo37328a(context);
            if (a2 != null) {
                buqx.m120258a(remoteDevice, 5, a2.toString());
            }
            if (a) {
                Uri a3 = ahzt.m56924a(aiaa, ahzs.LEFT).mo37328a(context);
                if (a3 != null) {
                    buqx.m120258a(remoteDevice, 7, a3.toString());
                }
                Uri a4 = ahzt.m56924a(aiaa, ahzs.RIGHT).mo37328a(context);
                if (a4 != null) {
                    buqx.m120258a(remoteDevice, 8, a4.toString());
                }
                Uri a5 = ahzt.m56924a(aiaa, ahzs.CASE).mo37328a(context);
                if (a5 != null) {
                    buqx.m120258a(remoteDevice, 9, a5.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m56675a(Runnable runnable) {
        m56668a().execute(runnable);
    }

    /* renamed from: a */
    static boolean m56676a(ahsu ahsu, byte[] bArr) {
        return bArr == null && ahsu.mo37089n() != null;
    }

    /* renamed from: a */
    static boolean m56677a(String str) {
        return !TextUtils.isEmpty(str);
    }
}
