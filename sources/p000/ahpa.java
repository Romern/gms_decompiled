package p000;

import android.content.Context;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahpa implements ahky {

    /* renamed from: a */
    private final ahov f67688a;

    /* renamed from: b */
    private final ahne f67689b = new ahne(this.f67688a);

    /* renamed from: c */
    private final ahnp f67690c = new ahnp(this.f67689b);

    /* renamed from: d */
    private final ahra f67691d;

    /* renamed from: e */
    private final ahlh f67692e;

    /* renamed from: f */
    private final ahqj f67693f;

    public ahpa(Context context) {
        this.f67688a = new ahov(context);
        this.f67691d = new ahra(context, this.f67690c);
        this.f67692e = new ahlh(this.f67688a, this.f67690c, this.f67689b);
        this.f67693f = new ahqj(this.f67688a, this.f67690c, this.f67689b, this.f67692e);
    }

    /* renamed from: a */
    public final int mo36754a(ahkv ahkv, long j) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68417a("Client %d cancelled payload %d.", ahkv.mo36706b(), j);
        ahqy a = this.f67691d.f67855d.mo36987a(j);
        if (a == null) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68415a("Client requested cancel for unknown payload %d, ignoring.", j);
            return 8014;
        }
        a.f67849c.set(true);
        return 0;
    }

    /* renamed from: b */
    public final void mo36764b() {
    }

    /* renamed from: c */
    public final void mo36767c(ahkv ahkv, String str) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Client %d requested a disconnection from endpoint %s.", ahkv.mo36706b(), str);
        ahnp ahnp = this.f67690c;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ahnp.mo36895a(new ahnj(ahnp, ahkv, str, countDownLatch));
        ahhf.m55774a(String.format("unregisterEndpoint(%s)", str), countDownLatch);
    }

    /* renamed from: b */
    public final void mo36765b(ahkv ahkv, int i) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68415a("Client %d requested discovery to stop.", ahkv.mo36706b());
        ahqi a = this.f67693f.mo36963a(ahkv);
        if (a != null) {
            a.mo36864i(ahkv);
        }
    }

    /* renamed from: a */
    public final int mo36755a(ahkv ahkv, String str) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Client %d rejected the connection with endpoint %s.", ahkv.mo36706b(), str);
        ahqi a = this.f67693f.mo36963a(ahkv);
        if (a == null) {
            return 8009;
        }
        return a.mo36832a(ahkv, str);
    }

    /* renamed from: b */
    public final void mo36766b(ahkv ahkv, String str) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Client %d initiated a manual bandwidth upgrade with endpoint %s.", ahkv.mo36706b(), str);
        this.f67692e.mo36778a(ahkv, str);
    }

    /* renamed from: a */
    public final int mo36756a(ahkv ahkv, String str, DiscoveryOptions discoveryOptions, aigh aigh) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68415a("Client %d requested discovery to start.", ahkv.mo36706b());
        ahqj ahqj = this.f67693f;
        int a = ahqj.m56374a(ahkv, discoveryOptions.f80467a);
        if (a != 0) {
            return a;
        }
        ahqi a2 = ahqj.mo36963a(ahkv);
        if (a2 == null) {
            return 13;
        }
        return a2.mo36833a(ahkv, str, discoveryOptions, aigh);
    }

    /* renamed from: a */
    public final int mo36757a(ahkv ahkv, String str, byte[] bArr, aigo aigo) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Client %d accepted the connection with endpoint %s.", ahkv.mo36706b(), str);
        ahqi a = this.f67693f.mo36963a(ahkv);
        if (a == null) {
            return 8009;
        }
        return a.mo36834a(ahkv, str, bArr, aigo);
    }

    /* renamed from: a */
    public final int mo36758a(ahkv ahkv, byte[] bArr, String str, AdvertisingOptions advertisingOptions, aify aify) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68415a("Client %d requested advertising to start.", ahkv.mo36706b());
        ahqj ahqj = this.f67693f;
        int a = ahqj.m56374a(ahkv, advertisingOptions.f80442a);
        if (a != 0) {
            return a;
        }
        ahqi a2 = ahqj.mo36963a(ahkv);
        if (a2 == null) {
            return 13;
        }
        return a2.mo36835a(ahkv, str, bArr, advertisingOptions, aify);
    }

    /* renamed from: a */
    public final int mo36759a(ahkv ahkv, byte[] bArr, String str, byte[] bArr2, ConnectionOptions connectionOptions, aify aify) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Client %d requested a connection to endpoint %s.", ahkv.mo36706b(), str);
        ahqi a = this.f67693f.mo36963a(ahkv);
        if (a == null) {
            return 8009;
        }
        return a.mo36836a(ahkv, bArr, str, bArr2, connectionOptions, aify);
    }

    /* renamed from: a */
    public final void mo36760a() {
        ahpa ahpa = this;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Initiating shutdown of OfflineServiceController.");
        ahqj ahqj = ahpa.f67693f;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Initiating shutdown of PCPManager.");
        for (int i = 0; i < ahqj.f67788a.size(); i++) {
            ((ahqi) ahqj.f67788a.valueAt(i)).mo36840a();
        }
        ahqj.f67788a.clear();
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("PCPManager has shut down.");
        ahlh ahlh = ahpa.f67692e;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Initiating shutdown of BandwidthUpgradeManager.");
        ahlh.f67435a.mo36896b(buuw.BANDWIDTH_UPGRADE_NEGOTIATION, ahlh);
        ahhr.m55805a(ahlh.f67437c, "BandwidthUpgradeManager.alarmExecutor");
        ahhr.m55805a(ahlh.f67438d, "BandwidthUpgradeManager.serialExecutor");
        for (ahna ahna : ahlh.f67440f.values()) {
            ahna.mo36796a(6);
        }
        ahlh.f67440f.clear();
        ahlh.f67441g.clear();
        ahlh.mo36777a();
        ahlh.f67443i = bvif.UNKNOWN_MEDIUM;
        for (ahll ahll : ahlh.f67439e.values()) {
            ahll.mo36793a();
        }
        ahlh.f67439e.clear();
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("BandwidthUpgradeManager has shut down.");
        ahra ahra = ahpa.f67691d;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Initiating shutdown of PayloadManager.");
        ahra.f67852a.mo36896b(buuw.PAYLOAD_TRANSFER, ahra);
        ahhr.m55805a(ahra.f67853b, "PayloadManager.readStatusExecutor");
        ahhr.m55805a(ahra.f67854c, "PayloadManager.payloadStatusUpdateExecutor");
        List a = ahra.f67855d.mo36988a();
        int size = a.size();
        int i2 = 0;
        while (i2 < size) {
            ahqy ahqy = (ahqy) a.get(i2);
            ahra.f67855d.mo36990b(ahqy.mo36978a());
            ahqy.mo36985d();
            i2++;
            ahpa = this;
        }
        ahnp ahnp = ahpa.f67690c;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Initiating shutdown of EndpointManager.");
        ahhr.m55805a(ahnp.f67635b, "EndpointManager.serialExecutor");
        ahhr.m55805a(ahnp.f67637d, "EndpointManager.endpointReadersThreadPool");
        ahhr.m55805a(ahnp.f67638e, "EndpointManager.endpointKeepAliveManagerThreadPool");
        ahnp.f67636c.clear();
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("EndpointManager has shut down.");
        ahpa.f67689b.mo36877a();
        ahov ahov = ahpa.f67688a;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Initiating shutdown of MediumManager.");
        synchronized (ahov.f67668d) {
            synchronized (ahov.f67669e) {
                synchronized (ahov.f67670f) {
                    synchronized (ahov.f67671g) {
                        synchronized (ahov.f67672h) {
                            synchronized (ahov.f67673i) {
                                synchronized (ahov.f67674j) {
                                    synchronized (ahov.f67675k) {
                                        if (ahov.f67667c.get()) {
                                            ailh ailh = ahov.f67666b;
                                            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl.mo68432a("ailh", "a", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl.mo68405a("Initiating shutdown of Bluetooth.");
                                            ailh.f69119f.mo37610a();
                                            ailh.f69118e.mo37575a();
                                            ailh.f69115b.mo37632b();
                                            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl2.mo68432a("ailh", "a", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl2.mo68405a("Bluetooth has shut down.");
                                            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl3.mo68432a("ailh", "a", 69, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl3.mo68405a("Initiating shutdown of WiFi.");
                                            aine aine = ailh.f69123j;
                                            ahhr.m55805a(aine.f69245c, "WifiDirect.singleThreadOffloader");
                                            aine.mo37712c();
                                            aine.mo37715f();
                                            aine.f69243a.mo38144a();
                                            ailh.f69122i.mo37687a();
                                            ailh.f69121h.mo37770a();
                                            aiof aiof = ailh.f69120g;
                                            aiof.mo37755j();
                                            synchronized (aiof) {
                                                ahhr.m55805a(aiof.f69331l, "WifiHotspot.singleThreadOffloader");
                                                aiof.mo37752g();
                                                aiof.mo37750e();
                                                aiof.mo37753h();
                                            }
                                            ailh.f69116c.mo37792d();
                                            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl4.mo68432a("ailh", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl4.mo68405a("WiFi has shut down.");
                                            bnsl bnsl5 = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl5.mo68432a("ailh", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl5.mo68405a("Initiating shutdown of NFC.");
                                            ailh.f69125l.mo37647a();
                                            bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl6.mo68432a("ailh", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl6.mo68405a("NFC has shut down.");
                                            bnsl bnsl7 = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl7.mo68432a("ailh", "a", 84, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl7.mo68405a("Initiating shutdown of WebRTC.");
                                            ailh.f69124k.mo37678b();
                                            bnsl bnsl8 = (bnsl) ailf.f69111a.mo68390d();
                                            bnsl8.mo68432a("ailh", "a", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl8.mo68405a("WebRTC has shut down.");
                                            airs airs = ailh.f69114a;
                                            String str = "airs";
                                            String str2 = "a";
                                            if (airs.f69587f.compareAndSet(false, true)) {
                                                synchronized (airs) {
                                                    for (airq airq : airs.f69584c.values()) {
                                                        String str3 = str;
                                                        String str4 = str2;
                                                        airq.f69576b.mo36396b();
                                                        str = str3;
                                                        str2 = str4;
                                                    }
                                                    ahhr.m55805a(airs.f69586e, "MultiMediumDependencyManager.needsRetryExecutor");
                                                    Iterator it = airs.mo37909b().iterator();
                                                    while (it.hasNext()) {
                                                        airo airo = (airo) it.next();
                                                        bnsl bnsl9 = (bnsl) ailf.f69111a.mo68390d();
                                                        bnsl9.mo68432a(str, str2, 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl9.mo68424a("%s MediumOperation %s is unexpectedly registered and will be unregistered.", "[MMD]:", airo.mo37902d());
                                                        airs.mo37910c(airo);
                                                        it = it;
                                                        str = str;
                                                        str2 = str2;
                                                    }
                                                }
                                            }
                                            ahov.f67667c.set(false);
                                            ahov.f67665a.mo36912b(ahov);
                                            ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("MediumManager has shut down.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("OfflineServiceController has shut down.");
    }

    /* renamed from: a */
    public final void mo36761a(ahkv ahkv, int i) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68415a("Client %d requested advertising to stop.", ahkv.mo36706b());
        ahqi a = this.f67693f.mo36963a(ahkv);
        if (a != null) {
            a.mo36863h(ahkv);
        }
    }

    /* renamed from: a */
    public final void mo36762a(ahkv ahkv, String[] strArr, ParcelablePayload parcelablePayload) {
        bqgj bqgj;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Client %d is sending payload %d to endpoints %s.", Long.valueOf(ahkv.mo36706b()), Long.valueOf(parcelablePayload.f80605a), Arrays.toString(strArr));
        ahra ahra = this.f67691d;
        int i = parcelablePayload.f80606b;
        if (i != 1) {
            bqgj = i != 2 ? i != 3 ? null : ahkv.f67393i : ahkv.f67394j;
        } else {
            bqgj = ahkv.f67395k;
        }
        if (bqgj == null) {
            ahra.mo36995b(ahkv, strArr, parcelablePayload);
            ((bnsl) ahkm.f67363a.mo68390d()).mo68416a("PayloadManager failed to determine the right executor for outgoing payload (ID: %d, type: %d), aborting sendPayload().", parcelablePayload.f80605a, parcelablePayload.f80606b);
            return;
        }
        bqgj.execute(new ahqv(ahra, parcelablePayload, strArr, ahkv));
    }

    /* renamed from: a */
    public final void mo36763a(PrintWriter printWriter) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ailh ailh = this.f67688a.f67666b;
        airs airs = ailh.f69114a;
        printWriter.write(String.format("%s\n", "[MMD]:"));
        airo airo = airs.f69588g;
        if (airo != null) {
            printWriter.write(String.format("  Currently Registering: %s\n", airo.mo37902d()));
        }
        printWriter.write(String.format("  Ready To Run: %s\n", airs.m57810a(airs.f69582a)));
        printWriter.write(String.format("  Running: %s\n", airs.m57810a(airs.f69583b)));
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (airo airo2 : airs.f69584c.keySet()) {
            sb.append(airo2.mo37902d());
            sb.append(" (attempts: ");
            sb.append(((airq) airs.f69584c.get(airo2)).f69575a);
            sb.append(")");
        }
        sb.append("]");
        objArr[0] = sb.toString();
        printWriter.write(String.format("  Awaiting Retry: %s\n", objArr));
        printWriter.write(String.format("  Paused: %s\n", airs.m57810a(airs.f69585d.keySet())));
        printWriter.flush();
        aijh aijh = ailh.f69118e;
        airo airo3 = aijh.f68962c;
        airo airo4 = aijh.f68963d;
        printWriter.write("[BluetoothClassic]:\n");
        printWriter.write(String.format("  Is Available: %s\n", Boolean.valueOf(aijh.mo37580b())));
        Object[] objArr2 = new Object[1];
        if (airo3 != null) {
            z = true;
        } else {
            z = false;
        }
        objArr2[0] = Boolean.valueOf(z);
        printWriter.write(String.format("  Scanning: %s\n", objArr2));
        Object[] objArr3 = new Object[1];
        if (airo4 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        objArr3[0] = Boolean.valueOf(z2);
        printWriter.write(String.format("  Advertising: %s\n", objArr3));
        if (airo3 != null) {
            airo3.mo37567a(printWriter);
        }
        if (airo4 != null) {
            airo4.mo37567a(printWriter);
        }
        printWriter.flush();
        aikx aikx = ailh.f69119f;
        aijv aijv = aikx.f69081c;
        aikw aikw = aikx.f69082d;
        aikl aikl = aikx.f69083e;
        aikl aikl2 = aikx.f69084f;
        aikb aikb = aikx.f69085g;
        aikb aikb2 = aikx.f69086h;
        printWriter.write("[BluetoothLowEnergy]:\n");
        printWriter.write(String.format("  Is Available: %s\n", Boolean.valueOf(aikx.mo37621b())));
        Object[] objArr4 = new Object[1];
        objArr4[0] = Boolean.valueOf(aijv != null);
        printWriter.write(String.format("  GATT Server Opened: %s\n", objArr4));
        Object[] objArr5 = new Object[1];
        objArr5[0] = Boolean.valueOf(aikw != null);
        printWriter.write(String.format("  Socket Opened: %s\n", objArr5));
        Object[] objArr6 = new Object[1];
        objArr6[0] = Boolean.valueOf(aikl != null);
        printWriter.write(String.format("  Legacy Advertising: %s\n", objArr6));
        Object[] objArr7 = new Object[1];
        objArr7[0] = Boolean.valueOf(aikl2 != null);
        printWriter.write(String.format("  Fast Legacy Advertising: %s\n", objArr7));
        Object[] objArr8 = new Object[1];
        if (aikb != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        objArr8[0] = Boolean.valueOf(z3);
        printWriter.write(String.format("  Regular Extended Advertising: %s\n", objArr8));
        Object[] objArr9 = new Object[1];
        if (aikb2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        objArr9[0] = Boolean.valueOf(z4);
        printWriter.write(String.format("  Fast Extended Advertising: %s\n", objArr9));
        if (aikl != null) {
            aikl.mo37567a(printWriter);
        }
        if (aikl2 != null) {
            aikl2.mo37567a(printWriter);
        }
        if (aikb != null) {
            aikb.mo37567a(printWriter);
        }
        if (aikb2 != null) {
            aikb2.mo37567a(printWriter);
        }
        printWriter.flush();
        aiof aiof = ailh.f69120g;
        printWriter.write("[WifiHotspot]:\n");
        printWriter.write(String.format("  Is Available: %s\n", Boolean.valueOf(aiof.mo37744a())));
        printWriter.flush();
        aiox aiox = ailh.f69121h;
        printWriter.write("[WifiLan]:\n");
        printWriter.write(String.format("  Is Available: %s\n", Boolean.valueOf(aiox.mo37780b())));
        printWriter.flush();
        aimn aimn = ailh.f69122i;
        printWriter.write("[WifiAware]:\n");
        printWriter.write(String.format("  Is Available: %s\n", Boolean.valueOf(aimn.mo37688b())));
        printWriter.flush();
        aine aine = ailh.f69123j;
        ainc ainc = aine.f69244b;
        printWriter.write("[WifiDirect]:\n");
        printWriter.write(String.format("  Is Available: %s\n", Boolean.valueOf(aine.mo37708a())));
        Object[] objArr10 = new Object[1];
        if (ainc != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        objArr10[0] = Boolean.valueOf(z5);
        printWriter.write(String.format("  Hosting a Group: %s\n", objArr10));
        if (ainc != null) {
            ainc.mo37567a(printWriter);
        }
        printWriter.flush();
        ailq ailq = ailh.f69125l;
        printWriter.write("[NearFieldCommunication]:\n");
        printWriter.write(String.format("  Is Available: %s\n", Boolean.valueOf(ailq.mo37656b())));
        printWriter.flush();
        aimk aimk = ailh.f69124k;
        printWriter.write("[WebRTC]:\n");
        printWriter.write(String.format("  Is Available: %s\n", Boolean.valueOf(aimk.mo37675a())));
        printWriter.flush();
    }
}
