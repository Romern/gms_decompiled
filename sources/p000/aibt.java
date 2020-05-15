package p000;

import android.accounts.Account;
import android.bluetooth.BluetoothDevice;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: aibt */
final /* synthetic */ class aibt implements Runnable {

    /* renamed from: a */
    private final aibu f68634a;

    /* renamed from: b */
    private final BluetoothDevice f68635b;

    public aibt(aibu aibu, BluetoothDevice bluetoothDevice) {
        this.f68634a = aibu;
        this.f68635b = bluetoothDevice;
    }

    public final void run() {
        ahza ahza;
        buru buru;
        aibu aibu = this.f68634a;
        BluetoothDevice bluetoothDevice = this.f68635b;
        aics aics = aibu.f68639d;
        ((bnsl) ahsd.f67925a.mo68390d()).mo68425a("FastPair: handle bonded but not FastPairing for (%s), fastPairAddBondedDeviceFromFootprintsToLocalCache = (%s), fastPairSupportRetroactivePair = (%s).", bluetoothDevice, Boolean.valueOf(cfoj.m141552b()), Boolean.valueOf(cfoj.m141575y()));
        if (cfoj.m141552b()) {
            buru buru2 = aics.f68710g;
            String address = bluetoothDevice.getAddress();
            List a = buru.m120318a(buru2.f154791b);
            int size = a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    ahza = null;
                    break;
                }
                Account account = (Account) a.get(i);
                try {
                    Iterator it = ((List) buru2.mo73055a(account).get()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            buru = buru2;
                            ahza = null;
                            break;
                        }
                        ahza = (ahza) it.next();
                        int i2 = ahza.f68443a;
                        if ((i2 & 1) != 0 && (i2 & 4) != 0) {
                            byte[] k = ahza.f68446d.getKey();
                            byte[] k2 = ahza.f68444b.getKey();
                            buru = buru2;
                            try {
                                if (Arrays.equals(k, bnzi.m110902d().mo68722a(bqce.m112562a(k2, aynj.m84359a(address))).mo68740b())) {
                                    bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
                                    bnsl.mo68432a("buru", "a", 653, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl.mo68420a("FastPair: find the matched device (%s) from footprints.", address);
                                    break;
                                }
                                buru2 = buru;
                            } catch (InterruptedException | ExecutionException e) {
                                bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
                                bnsl2.mo68432a("buru", "a", 622, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68420a("FastPair: fail to read footprints from %s.", account);
                                i++;
                                buru2 = buru;
                            }
                        }
                    }
                    if (ahza != null) {
                        break;
                    }
                    i++;
                    buru2 = buru;
                } catch (InterruptedException | ExecutionException e2) {
                    buru = buru2;
                    bnsl bnsl22 = (bnsl) busr.f154819a.mo68388c();
                    bnsl22.mo68432a("buru", "a", 622, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl22.mo68420a("FastPair: fail to read footprints from %s.", account);
                    i++;
                    buru2 = buru;
                }
            }
            if (ahza == null) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: (%s) bonded without through fast pairing, not found in footprints", bluetoothDevice);
            } else {
                ahst ahst = aics.f68705b;
                String address2 = bluetoothDevice.getAddress();
                try {
                    ByteString bxtx = ahza.f68445c;
                    bxus c = bxus.m123744c();
                    aiaa aiaa = aiaa.f68501K;
                    try {
                        bxuc h = bxtx.mo73764h();
                        GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) aiaa.mo74142c(4);
                        bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                        a2.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                        a2.mo74225d(GeneratedMessageLite);
                        h.mo73787a(0);
                        GeneratedMessageLite.m124027b(GeneratedMessageLite);
                        aiaa aiaa2 = (aiaa) GeneratedMessageLite;
                        bxvd da = ahyz.f68425p.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ahyz ahyz = (ahyz) da.f164949b;
                        address2.getClass();
                        int i3 = ahyz.f68427a | 1;
                        ahyz.f68427a = i3;
                        ahyz.f68428b = address2;
                        ByteString bxtx2 = ahza.f68444b;
                        bxtx2.getClass();
                        int i4 = i3 | 2;
                        ahyz.f68427a = i4;
                        ahyz.f68429c = bxtx2;
                        String str = aiaa2.f68537y;
                        str.getClass();
                        ahyz.f68427a = i4 | 512;
                        ahyz.f68437k = str;
                        byzb byzb = aiaa2.f68511I;
                        if (byzb == null) {
                            byzb = byzb.f169045j;
                        }
                        da.mo74022ab(new bxvv(byzb.f169052f, byzb.f169044g));
                        ahst.mo37036a((ahyz) da.mo74062i());
                    } catch (IOException e3) {
                        if (!(e3.getCause() instanceof bxwf)) {
                            throw new bxwf(e3.getMessage());
                        }
                        throw ((bxwf) e3.getCause());
                    } catch (RuntimeException e4) {
                        if (e4.getCause() instanceof bxwf) {
                            throw ((bxwf) e4.getCause());
                        }
                        throw e4;
                    } catch (bxwf e5) {
                        throw e5;
                    } catch (bxwf e6) {
                        throw e6;
                    }
                } catch (bxwf e7) {
                    bnsl bnsl3 = (bnsl) ahsd.f67925a.mo68388c();
                    bnsl3.mo68437a(e7);
                    bnsl3.mo68405a("FastPair: getStoredDiscoveryItem: Failed to parse device.");
                }
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: handle bonded but not FastPairing for (%s), added to local cache from footprints.", bluetoothDevice);
                if (cfoj.f184966a.mo6606a().mo82154bk()) {
                    aics.f68704a.mo72987c(new aicg(aics, "setupFastPairItem", bluetoothDevice));
                    return;
                }
                return;
            }
        }
        if (cfoj.m141575y()) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: set retroactive pairing for %s", bluetoothDevice);
            ahwb ahwb = aics.f68713j;
            ahwb.f68208c.execute(new ahvs(ahwb, bluetoothDevice));
        }
    }
}
