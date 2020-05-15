package p000;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.security.GeneralSecurityException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: aics */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aics {

    /* renamed from: a */
    public final buqh f68704a;

    /* renamed from: b */
    public final ahst f68705b;

    /* renamed from: c */
    public final ahxa f68706c;

    /* renamed from: d */
    public final ahvm f68707d;

    /* renamed from: e */
    public final Context f68708e;

    /* renamed from: f */
    public final ahsi f68709f;

    /* renamed from: g */
    public final buru f68710g;

    /* renamed from: h */
    public final aicw f68711h;

    /* renamed from: i */
    public final ahxj f68712i;

    /* renamed from: j */
    public final ahwb f68713j;

    /* renamed from: k */
    public final ahwk f68714k;

    /* renamed from: l */
    public final ahzi f68715l;

    /* renamed from: m */
    public final busy f68716m;

    /* renamed from: n */
    public final Map f68717n = new HashMap();

    /* renamed from: o */
    public final bqgj f68718o = snp.m35704b(9);

    /* renamed from: p */
    public final Map f68719p = new HashMap();

    /* renamed from: q */
    public aicq f68720q;

    /* renamed from: r */
    public boolean f68721r = false;

    /* renamed from: s */
    public ahsu f68722s = null;

    /* renamed from: t */
    public final buqn f68723t = new aicf(this, "reEnableAllDeviceItems");

    /* renamed from: u */
    public final buqn f68724u = new aich(this, "removeInvalidDevices");

    /* renamed from: v */
    private ahzj f68725v;

    public aics(Context context) {
        this.f68708e = context;
        this.f68704a = (buqh) ahgz.m55754a(context, buqh.class);
        this.f68705b = (ahst) ahgz.m55754a(context, ahst.class);
        this.f68706c = (ahxa) ahgz.m55754a(context, ahxa.class);
        this.f68707d = (ahvm) ahgz.m55754a(context, ahvm.class);
        this.f68711h = (aicw) ahgz.m55754a(context, aicw.class);
        this.f68709f = (ahsi) ahgz.m55754a(context, ahsi.class);
        this.f68710g = (buru) ahgz.m55754a(context, buru.class);
        this.f68712i = (ahxj) ahgz.m55754a(context, ahxj.class);
        this.f68713j = (ahwb) ahgz.m55754a(context, ahwb.class);
        this.f68714k = (ahwk) ahgz.m55754a(context, ahwk.class);
        this.f68715l = (ahzi) ahgz.m55754a(context, ahzi.class);
        this.f68716m = (busy) ahgz.m55754a(context, busy.class);
    }

    /* renamed from: a */
    static aiaa m56976a(ahsu ahsu) {
        aiaa aiaa = ahsu.f67969b;
        bxvd bxvd = (bxvd) aiaa.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) aiaa);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aiaa aiaa2 = (aiaa) bxvd.f164949b;
        aiaa aiaa3 = aiaa.f68501K;
        aiaa2.f68513a &= -5;
        aiaa2.f68517e = aiaa.f68501K.f68517e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aiaa aiaa4 = (aiaa) bxvd.f164949b;
        aiaa4.f68525m = 1;
        int i = aiaa4.f68513a | 1024;
        aiaa4.f68513a = i;
        aiaa4.f68507E = 1;
        aiaa4.f68513a = 134217728 | i;
        return (aiaa) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static String m56977a(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m56978a(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            return false;
        }
        try {
            pendingIntent.send();
            return true;
        } catch (PendingIntent.CanceledException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Error sending PendingIntent=%s", pendingIntent);
            return false;
        }
    }

    /* renamed from: a */
    public final int mo37398a(byte[] bArr, boolean z, String str, byte[] bArr2, byte[] bArr3, boolean z2, double d) {
        int i;
        byte[] bArr4;
        byte[] bArr5;
        ahyz ahyz;
        Context context;
        buqd buqd;
        buru buru;
        ahyz ahyz2;
        boolean z3;
        boolean z4;
        int i2;
        String str2;
        String str3;
        boolean z5;
        byte[] bArr6 = bArr;
        String str4 = str;
        byte[] bArr7 = bArr2;
        byte[] bArr8 = bArr3;
        int i3 = 1;
        if (!this.f68721r) {
            if (this.f68725v == null) {
                this.f68725v = (ahzj) ahgz.m55754a(this.f68708e, ahzj.class);
            }
            if (!this.f68725v.mo37316a(str4)) {
                srn srn = ahsd.f67925a;
                return 1;
            }
            this.f68704a.mo72984b();
            ((ahuu) ahgz.m55754a(this.f68708e, ahuu.class)).mo37179a();
            Context context2 = this.f68708e;
            buru buru2 = this.f68710g;
            if (Double.isNaN(d)) {
                srn srn2 = ahsd.f67925a;
                i = 3;
            } else {
                double i4 = cfog.m141281i();
                boolean z6 = ahur.m56678a(bArr3) && cfoj.m141526G() && d <= cfog.f184854a.mo6606a().mo82039q();
                if (d <= i4 || z6) {
                    if (bArr6 == null) {
                        i = 3;
                    } else {
                        int length = bArr6.length;
                        if (length != 0) {
                            int i5 = length * 8;
                            long j = (long) i5;
                            if (j < cfog.f184854a.mo6606a().mo82043u()) {
                                i = 3;
                            } else if (cfog.f184854a.mo6606a().mo82041s() < j) {
                                i = 3;
                            } else {
                                double h = cfog.m141280h();
                                double h2 = cfog.m141280h();
                                buru buru3 = buru2;
                                long t = cfog.f184854a.mo6606a().mo82042t();
                                BitSet valueOf = BitSet.valueOf(bArr);
                                int cardinality = valueOf.cardinality();
                                double d2 = (double) (length - 2);
                                Double.isNaN(d2);
                                double d3 = (double) ((int) (d2 / h));
                                Double.isNaN(d3);
                                if (cardinality > i5 - (((int) (d3 * (h2 - 4.0d))) + ((int) t))) {
                                    ((bnsl) ahsd.f67925a.mo68388c()).mo68411a("FastPair: Invalid bloom filter, too many bits set. %d out of %d.", valueOf.cardinality(), i5);
                                    i = 3;
                                } else {
                                    buqd buqd2 = new buqd(bArr6, new buqe());
                                    bnha bnha = new bnha();
                                    for (ahyz ahyz3 : ((ahst) ahgz.m55754a(context2, ahst.class)).mo37050d()) {
                                        bnha.mo67695b(ahyz3.f68429c, ahyz3);
                                    }
                                    bnhe b = bnha.mo67618b();
                                    if (bArr7 == null) {
                                        bArr4 = aynj.m84359a(str);
                                    } else {
                                        bArr4 = bArr7;
                                    }
                                    if (!cfoj.f184966a.mo6606a().mo82170c() || !ahur.m56678a(bArr3)) {
                                        bArr5 = bArr4;
                                    } else {
                                        byte[][] bArr9 = new byte[2][];
                                        bArr9[0] = bArr4;
                                        byte[][] bArr10 = new byte[2][];
                                        byte[] bArr11 = new byte[1];
                                        int i6 = 4;
                                        int length2 = bArr8.length << 4;
                                        if (!z2) {
                                            i6 = 3;
                                        }
                                        bArr11[0] = (byte) (length2 | i6);
                                        bArr10[0] = bArr11;
                                        bArr10[1] = bArr8;
                                        bArr9[1] = bqce.m112562a(bArr10);
                                        bArr5 = bqce.m112562a(bArr9);
                                    }
                                    srn srn3 = ahsd.f67925a;
                                    b.size();
                                    Iterator it = b.keySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            ahyz = null;
                                            break;
                                        }
                                        ByteString bxtx = (ByteString) it.next();
                                        if (buqd2.mo72979a(bqce.m112562a(bxtx.getKey(), bArr5))) {
                                            ahyz = (ahyz) b.get(bxtx);
                                            break;
                                        }
                                    }
                                    if (cfoj.f184966a.mo6606a().mo82089aM()) {
                                        bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
                                        String a = boan.f132472f.mo68794a(bArr6);
                                        String str5 = !z6 ? "" : "longer";
                                        Double valueOf2 = Double.valueOf(d);
                                        if (bArr7 != null) {
                                            str2 = boan.f132472f.mo68794a(bArr7);
                                        } else {
                                            str2 = "na";
                                        }
                                        Boolean valueOf3 = Boolean.valueOf(z2);
                                        if (bArr8 != null) {
                                            str3 = boan.f132472f.mo68794a(bArr8);
                                        } else {
                                            str3 = "na";
                                        }
                                        Boolean valueOf4 = Boolean.valueOf(z);
                                        if (ahyz != null) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        z3 = false;
                                        ahyz2 = ahyz;
                                        buru = buru3;
                                        context = context2;
                                        buqd = buqd2;
                                        bnsl.mo68430a("FastPair: Checking bloom filter %s at %s distance %.3fm, addr=%s, salt=%s, suppressBattery=%b, battery=%s, suppressPairing=%b, local cache=%b", a, str5, valueOf2, str, str2, valueOf3, str3, valueOf4, Boolean.valueOf(z5));
                                    } else {
                                        ahyz2 = ahyz;
                                        context = context2;
                                        buru = buru3;
                                        z3 = false;
                                        buqd = buqd2;
                                    }
                                    if (d <= i4) {
                                        i = 3;
                                        if (ahyz2 != null) {
                                            Context context3 = context;
                                            ahvf ahvf = (ahvf) ahgz.m55754a(context3, ahvf.class);
                                            if (cfoj.f184966a.mo6606a().mo82136bG()) {
                                                ByteString bxtx2 = ahyz2.f68429c;
                                                if (!ahvf.f68157b.containsKey(bxtx2) || SystemClock.elapsedRealtime() > ((Long) ahvf.f68157b.get(bxtx2)).longValue()) {
                                                    ahvf.mo37202b("android.bluetooth.device.action.FOUND", ahyz2);
                                                }
                                            }
                                            int i7 = ahyz2.f68427a;
                                            if ((i7 & 4) != 0 && ahyz2.f68430d) {
                                                if ((i7 & 8) != 0) {
                                                    i2 = ahyz2.f68431e + 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                if (((long) i2) <= cfog.f184854a.mo6606a().mo82021bc()) {
                                                    ((ahst) ahgz.m55754a(context3, ahst.class)).mo37038a(ahyz2, z3, i2);
                                                    z4 = true;
                                                    ahur.m56668a().execute(new ahuf(context3, ahyz2, str, bArr3, z2, z4, d, buru));
                                                    i3 = 2;
                                                } else {
                                                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: reset retry no need to update.");
                                                    ((ahst) ahgz.m55754a(context3, ahst.class)).mo37038a(ahyz2, z3, z3 ? 1 : 0);
                                                }
                                            }
                                            z4 = false;
                                            ahur.m56668a().execute(new ahuf(context3, ahyz2, str, bArr3, z2, z4, d, buru));
                                            i3 = 2;
                                        } else {
                                            ahur.m56668a().execute(new ahug(context, bArr, z, buqd, str, bArr5, buru));
                                            i3 = 3;
                                        }
                                    } else if (ahyz2 != null) {
                                        i = 3;
                                        ahur.m56668a().execute(new ahuh(context, ahyz2, bArr3, z2, d, buru, str));
                                        i3 = 2;
                                    } else {
                                        i = 3;
                                        i3 = 1;
                                    }
                                }
                            }
                            srn srn4 = ahsd.f67925a;
                        } else {
                            i = 3;
                        }
                    }
                    srn srn5 = ahsd.f67925a;
                    i3 = 1;
                } else {
                    srn srn6 = ahsd.f67925a;
                    cfog.m141281i();
                    i = 3;
                }
            }
            if ((!cfoj.m141527H() || i3 != i) && cfoj.m141527H()) {
                return i3;
            }
            this.f68725v.mo37317b(str4);
            return i3;
        }
        srn srn7 = ahsd.f67925a;
        return 1;
    }

    /* renamed from: a */
    public final void mo37399a(ahsu ahsu, byte[] bArr, String str, ahvo ahvo) {
        bqgj bqgj;
        if (!cfog.m141283k() && this.f68721r) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: fastpairing, skip pair request, item=%s", ahsu);
            return;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: start pair, item=%s", ahsu);
        this.f68704a.mo72989e(this.f68723t);
        aicq aicq = this.f68720q;
        if (aicq != null) {
            aicq.mo37397a(false);
        }
        this.f68722s = new ahsu(this.f68708e, ahsu.f67969b);
        if (!cfog.m141283k()) {
            bqgj = snp.m35704b(9);
        } else {
            bqgj = this.f68718o;
        }
        bqgg a = bqgj.mo25813a(new ahub(this.f68708e, ahsu, str, bArr, this.f68710g, ahvo), null);
        if (cfog.m141283k()) {
            this.f68719p.put(ahsu.mo37088m(), a);
        }
        this.f68721r = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahst.a(ahyz, boolean):void
     arg types: [ahyz, int]
     candidates:
      ahst.a(java.lang.String, bmzi):java.lang.Object
      ahst.a(java.lang.String, int):void
      ahst.a(java.lang.String, java.lang.String):void
      ahst.a(java.lang.String, boolean):void
      ahst.a(java.util.List, int):void
      ahst.a(ahyz, boolean):void */
    /* renamed from: a */
    public final void mo37400a(ahyz ahyz, String str) {
        ((ahvf) ahgz.m55754a(this.f68708e, ahvf.class)).mo37202b(str, ahyz);
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(str)) {
            this.f68705b.mo37037a(ahyz, true);
        } else {
            this.f68705b.mo37037a(ahyz, false);
        }
    }

    /* renamed from: a */
    public final void mo37401a(BluetoothDevice bluetoothDevice) {
        if (this.f68712i.mo37261a(bluetoothDevice)) {
            ahxj ahxj = this.f68712i;
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("EventStreamManager: Disconnect event stream from device %s", bluetoothDevice);
            ahxk ahxk = (ahxk) ahxj.f68288b.remove(bluetoothDevice);
            if (ahxk != null) {
                ahxk.mo37262a();
                return;
            }
            return;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairEventStream: event stream connection (%s) is disconnected, skip", bluetoothDevice);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2  */
    /* renamed from: a */
    public final void mo37402a(BluetoothDevice bluetoothDevice, ahyz ahyz) {
        ahxj ahxj;
        ahye ahye;
        if (!ahfo.m55646a(this.f68708e)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairEventStream: skip rfcomm connection fast pair is disabled on this device.");
        } else if (!this.f68712i.mo37261a(bluetoothDevice)) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (cfoj.m141544Y()) {
                if (!cfoj.f184966a.mo6606a().mo82112aj()) {
                    z = false;
                } else if (ahyz != null && new bxvv(ahyz.f68438l, ahyz.f68424m).contains(bzay.SILENCE_MODE)) {
                    srn srn = ahsd.f67925a;
                    bluetoothDevice.setSilenceMode(true);
                }
                srn srn2 = ahsd.f67925a;
                ahxj = this.f68712i;
                if (ahxj.f68290d == null) {
                    ahxn ahxn = new ahxn(this.f68708e);
                    ahxj.f68290d = ahxn;
                    for (ahxk ahxk : ahxj.f68288b.values()) {
                        ahxk.mo37264a(ahxn);
                    }
                }
                ahxj ahxj2 = this.f68712i;
                Context context = ahxj2.f68287a;
                ahye = new ahye(context, bluetoothDevice, new ahxl((busy) ahgz.m55754a(context, busy.class)));
                ahye.mo37264a(ahxj2.f68290d);
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RfcommEventStreamMedium: [%s] Connect is requested", ahye.f68333c);
                ahye.f68335e.set((int) cfog.m141294v());
                if (!ahye.mo37281a(new ahxo(ahye), "connect")) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("EventStreamManager: Connect event stream to device %s", bluetoothDevice);
                    ahxj2.f68288b.put(bluetoothDevice, ahye);
                    return;
                } else if (z) {
                    bluetoothDevice.setSilenceMode(false);
                    return;
                } else {
                    return;
                }
            }
            z = false;
            srn srn22 = ahsd.f67925a;
            ahxj = this.f68712i;
            if (ahxj.f68290d == null) {
            }
            ahxj ahxj22 = this.f68712i;
            Context context2 = ahxj22.f68287a;
            ahye = new ahye(context2, bluetoothDevice, new ahxl((busy) ahgz.m55754a(context2, busy.class)));
            ahye.mo37264a(ahxj22.f68290d);
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("RfcommEventStreamMedium: [%s] Connect is requested", ahye.f68333c);
            ahye.f68335e.set((int) cfog.m141294v());
            if (!ahye.mo37281a(new ahxo(ahye), "connect")) {
            }
        } else {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairEventStream: event stream connection (%s) is already connected, skip", bluetoothDevice);
        }
    }

    /* renamed from: a */
    public final void mo37403a(Intent intent, aicp aicp) {
        if (intent.hasExtra("android.bluetooth.device.extra.DEVICE") && !this.f68721r) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("onAclChange: state=%s, device=%s", aicp, bluetoothDevice);
            if (aicp == aicp.DISCONNECTED) {
                ahhd.m55769a(this.f68708e, "com.google.android.gms.nearby.ACTION_FAST_PAIR_DISCONNECTED");
                if (cfoj.m141562l() && !cfoj.m141529J()) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairEventStream: Destroy event stream for %s (DISCONNECTED)", bluetoothDevice);
                    mo37401a(bluetoothDevice);
                }
            }
            ahur.m56675a(new aibr(this, aicp, bluetoothDevice));
            this.f68704a.mo72987c(new aicc(this, "processConnection", bluetoothDevice, aicp, intent));
            return;
        }
        srn srn = ahsd.f67925a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo37404a(String str, String str2, byte[] bArr, ayqh ayqh) {
        buqh buqh;
        aicn aicn;
        try {
            aypk aypk = new aypk(this.f68708e, str, ahvg.m56719a().mo54224a(), null);
            aypk.f98176b = new aibs(aypk, str2);
            aypk.mo54190a(bArr);
            ayqh.mo37372a(2, "");
            buqh = this.f68704a;
            aicn = new aicn(this, "SilentPairDone");
        } catch (ayqn | BluetoothException | PairingException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("FastPair: silentPair failed to pair.");
            ayqh.mo37372a(3, e.getMessage());
            buqh = this.f68704a;
            aicn = new aicn(this, "SilentPairDone");
        } catch (Throwable th) {
            this.f68704a.mo72987c(new aicn(this, "SilentPairDone"));
            throw th;
        }
        buqh.mo72987c(aicn);
    }

    /* renamed from: a */
    public final void mo37405a(boolean z, String str, boolean z2, String str2) {
        long j;
        int i;
        ahsu e = this.f68705b.mo37052e(str);
        if (e != null) {
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            e.mo37065a(i);
            if (cfod.f184793a.mo6606a().mo81902X()) {
                e.mo37067a(e.f67968a.mo20505a());
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: set Lost when pairing process done, %s", e.mo37084i());
            }
            if (str2 == null) {
                str2 = e.mo37088m();
            }
        }
        if (!z && z2) {
            j = cfog.f184854a.mo6606a().mo81972aG();
        } else {
            j = cfog.m141293u();
        }
        this.f68704a.mo72983a(this.f68723t, j);
        this.f68721r = false;
        if (cfog.m141283k() && str2 != null) {
            this.f68719p.remove(str2);
        }
    }
}
