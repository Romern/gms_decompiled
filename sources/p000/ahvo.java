package p000;

import android.content.Context;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: ahvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahvo {

    /* renamed from: a */
    private ahtg f68172a;

    /* renamed from: c */
    protected final Context f68173c;

    /* renamed from: d */
    protected final ahsu f68174d;

    /* renamed from: e */
    protected final ahti f68175e;

    protected ahvo(Context context, ahsu ahsu) {
        this.f68173c = context;
        this.f68174d = ahsu;
        this.f68175e = new ahti(ahsu.mo37060G(), ahsu.mo37088m(), context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bvjc mo37144a();

    /* renamed from: a */
    public String mo37145a(aypk aypk, byte[] bArr, buru buru, String str) {
        String str2;
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("PairingProgressHandler:onPairedCallbackCalled with address:%s", str);
        byte[] b = aypk.mo54197b();
        if (ahur.m56676a(this.f68174d, bArr) && b == null) {
            buru.mo73062b();
        }
        Context context = this.f68173c;
        ahsu ahsu = this.f68174d;
        String a = aypk.mo54191a();
        if (buqx.m120262c(str) != null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: No need to rename because device has alias name in Settings.");
            str2 = buqx.m120262c(str);
        } else if (!ahur.m56676a(ahsu, bArr)) {
            str2 = bArr == null ? ahsu.mo37086k() : ahsu.mo37087l();
        } else if (b != null) {
            try {
                Iterator it = ((List) buru.mo73054a().get()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("Fast Pair: Should never happen, can't find existing item with the existing account key.");
                        str2 = ahsu.mo37086k();
                        break;
                    }
                    ahza ahza = (ahza) it.next();
                    if ((ahza.f68443a & 1) != 0 && Arrays.equals(ahza.f68444b.getKey(), b)) {
                        try {
                            str2 = ((aiaa) GeneratedMessageLite.m124016a(aiaa.f68501K, ahza.f68445c.getKey(), bxus.m123744c())).f68520h;
                            break;
                        } catch (bxwf e) {
                            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                            bnsl.mo68437a(e);
                            bnsl.mo68405a("FastPair: Fail to parse the matched discover item data.");
                            str2 = ahsu.mo37086k();
                        }
                    }
                }
            } catch (InterruptedException | ExecutionException e2) {
                bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("FastPair: Failed to read devices from Footprints.");
                str2 = ahsu.mo37086k();
            }
        } else {
            str2 = a == null ? ahuy.m56682a(context, ahsu) : a;
        }
        buqx.m120259a(str, str2);
        if (ahur.m56676a(ahsu, bArr) && a == null) {
            aypk.mo54192a(str2);
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairBattery: preemptively suppressing battery notification for %s", str);
        ((ahwm) ahgz.m55754a(this.f68173c, ahwm.class)).f68241e.put(str, null);
        return str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bvjc mo37150b();

    /* renamed from: b */
    public void mo37151b(String str) {
        qxq qxq;
        qxq qxq2;
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("PairingProgressHandler:onPairingSuccess with address:%s", str);
        this.f68175e.mo37121a(this.f68172a.mo37111a());
        ahti ahti = this.f68175e;
        if (cfoj.m141554d() && (qxq2 = ahti.f67988a.f67130b) != null) {
            qxq2.mo24383c("FastPairImpressionCounter").mo24359a();
        }
        ahti ahti2 = this.f68175e;
        if (cfoj.m141554d() && (qxq = ahti2.f67988a.f67130b) != null) {
            qxq.mo24388e();
        }
    }

    /* renamed from: c */
    public void mo37152c() {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("PairingProgressHandler:onPairingSetupCompleted");
    }

    /* renamed from: d */
    public void mo37204d() {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("PairingProgressHandler:onPairingStarted");
        this.f68175e.mo37122a(mo37144a());
        ahtg f = ahth.m56604f();
        f.mo37114a(mo37150b());
        this.f68172a = f;
        this.f68175e.mo37127b(bvjc.WAIT_FOR_SCREEN_UNLOCK);
    }

    /* renamed from: e */
    public void mo37207e() {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("PairingProgressHandler:onReadyToPair");
    }

    /* renamed from: a */
    public void mo37146a(ayqi ayqi) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("PairingProgressHandler:onSetupPreferencesBuilder");
    }

    /* renamed from: a */
    public void mo37147a(String str) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("PairingProgressHandler:onGetBluetoothAddress");
    }

    /* renamed from: a */
    public void mo37148a(Throwable th) {
        bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68405a("PairingProgressHandler:onPairingFailed");
        if (this.f68175e.mo37124a()) {
            this.f68175e.mo37123a(th);
        }
        ahti ahti = this.f68175e;
        ahtg ahtg = this.f68172a;
        ahtg.f67983a = th;
        ahti.mo37121a(ahtg.mo37111a());
    }

    /* renamed from: a */
    public byte[] mo37149a(byte[] bArr, aypk aypk, aypj aypj) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("PairingProgressHandler:getKeyForLocalCache");
        return bArr == null ? aypk.mo54197b() : bArr;
    }
}
