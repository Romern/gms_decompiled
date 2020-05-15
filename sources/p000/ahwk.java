package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: ahwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahwk {

    /* renamed from: a */
    public final ahwm f68225a;

    /* renamed from: b */
    public final Map f68226b = new HashMap();

    /* renamed from: c */
    public final Set f68227c = new HashSet();

    /* renamed from: d */
    public ByteString f68228d = null;

    /* renamed from: e */
    private final Context f68229e;

    /* renamed from: f */
    private buru f68230f;

    /* renamed from: g */
    private busy f68231g;

    /* renamed from: h */
    private final ahwn f68232h;

    /* renamed from: i */
    private final buqn f68233i = new ahwi(this, "dismissBatteryNotification");

    public ahwk(Context context) {
        this.f68229e = context;
        this.f68225a = (ahwm) ahgz.m55754a(context, ahwm.class);
        this.f68232h = new ahwn(context);
        if (cfoj.m141557g()) {
            this.f68231g = (busy) ahgz.m55754a(context, busy.class);
            if (cfoj.f184966a.mo6606a().mo82181n()) {
                this.f68231g.mo73092a(new ahwj(this));
            }
        }
    }

    /* renamed from: c */
    private final void m56784c(BatteryAdvertisement batteryAdvertisement) {
        aypl.m84458a(this.f68229e);
        ahwn ahwn = this.f68232h;
        String str = batteryAdvertisement.f80504a;
        TrueWirelessHeadset a = batteryAdvertisement.mo44195a();
        if (cfoj.f184966a.mo6606a().mo82162bs()) {
            Intent intent = new Intent("com.google.android.gms.nearby.discovery.ACTION_BATTERY_CHANGED");
            intent.setPackage(cfog.f184854a.mo6606a().mo81989aX());
            intent.putExtra("com.google.android.gms.nearby.discovery.EXTRA_DEVICE_ADDRESS", str);
            intent.putExtra("com.google.android.gms.nearby.discovery.EXTRA_BATTERY_DETAIL", a);
            ahwn.f68245a.sendBroadcast(intent);
            return;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("SmartBatteryHelper: disabled.");
    }

    /* renamed from: d */
    private final void m56785d(BatteryAdvertisement batteryAdvertisement) {
        TrueWirelessHeadset a;
        if (cfoj.f184966a.mo6606a().mo82062M()) {
            ByteString bxtx = this.f68228d;
            if ((bxtx == null || !bxtx.equals(batteryAdvertisement.f80509f)) && batteryAdvertisement.f80506c) {
                int i = batteryAdvertisement.f80522s;
                if (i == 0) {
                    throw null;
                } else if (i == 1) {
                    srn srn = ahsd.f67925a;
                    this.f68225a.mo37241a(batteryAdvertisement.f80504a);
                }
            }
            ByteString bxtx2 = this.f68228d;
            if (bxtx2 != null) {
                if (bxtx2.equals(batteryAdvertisement.f80509f)) {
                    buqh buqh = (buqh) ahgz.m55754a(this.f68229e, buqh.class);
                    if (!m56787f(batteryAdvertisement)) {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairBattery: suppress battery notification with %s", batteryAdvertisement);
                        m56786e(batteryAdvertisement);
                        buqh.mo72989e(this.f68233i);
                        return;
                    }
                    if (batteryAdvertisement.f80521r) {
                        TrueWirelessHeadset a2 = batteryAdvertisement.mo44195a();
                        if (a2 != null) {
                            this.f68225a.mo37240a(a2, batteryAdvertisement.f80504a, batteryAdvertisement.f80509f);
                            batteryAdvertisement.f80521r = false;
                            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairBattery: update battery notification with %s", batteryAdvertisement);
                        } else {
                            return;
                        }
                    }
                    buqh.mo72989e(this.f68233i);
                    int i2 = batteryAdvertisement.f80522s;
                    if (i2 == 0) {
                        throw null;
                    } else if (i2 == 1) {
                        buqh.mo72983a(this.f68233i, TimeUnit.SECONDS.toMillis(cfog.m141278f()));
                    }
                }
            } else if (!batteryAdvertisement.f80520q && m56787f(batteryAdvertisement)) {
                if (!m56787f(batteryAdvertisement)) {
                    batteryAdvertisement.f80520q = false;
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairBattery: ignore creation, it's a suppress battery notification, %s", batteryAdvertisement);
                } else if (batteryAdvertisement.f80507d <= cfog.m141281i() && (a = batteryAdvertisement.mo44195a()) != null) {
                    this.f68225a.mo37240a(a, batteryAdvertisement.f80504a, batteryAdvertisement.f80509f);
                    batteryAdvertisement.f80520q = true;
                    batteryAdvertisement.f80521r = false;
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairBattery: create battery notification with %s", batteryAdvertisement);
                    int i3 = batteryAdvertisement.f80522s;
                    if (i3 == 0) {
                        throw null;
                    } else if (i3 == 1) {
                        ((buqh) ahgz.m55754a(this.f68229e, buqh.class)).mo72983a(this.f68233i, TimeUnit.SECONDS.toMillis(cfog.m141278f()));
                    }
                } else {
                    return;
                }
                this.f68228d = batteryAdvertisement.f80509f;
                if (!batteryAdvertisement.f80506c) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairBattery: Increasing scan frequency.");
                    if (cfoj.m141550ae()) {
                        ahhd.m55769a(this.f68229e, "com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_BATTERY");
                    } else {
                        ahhd.m55769a(this.f68229e, "com.google.android.gms.nearby.ACTION_LOW_LATENCY_SCAN_BURST");
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private final synchronized void m56786e(BatteryAdvertisement batteryAdvertisement) {
        mo37234a(batteryAdvertisement);
        if (batteryAdvertisement != null) {
            this.f68225a.mo37241a(batteryAdvertisement.f80504a);
        }
    }

    /* renamed from: f */
    private final boolean m56787f(BatteryAdvertisement batteryAdvertisement) {
        if (!batteryAdvertisement.f80506c) {
            return true;
        }
        if (!mo37238b(batteryAdvertisement.f80504a)) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = batteryAdvertisement.f80505b;
            if (i >= bArr.length) {
                return false;
            }
            byte b = bArr[i];
            int a = BatteryAdvertisement.m67328a(b);
            if (a != -1) {
                if (((long) a) <= (i != 2 ? cfog.m141277e() : cfog.m141276d()) && !BatteryAdvertisement.m67330b(b)) {
                    return true;
                }
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r0 = r4.f68445c;
        r4 = p000.bxus.m123744c();
        r5 = p000.aiaa.f68501K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = r0.mo73764h();
        r5 = (p000.GeneratedMessageLite) r5.mo74142c(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r6 = p000.bxxm.f165037a.mo74228a(r5);
        r6.mo74220a(r5, p000.bxud.m123454a(r0), r4);
        r6.mo74225d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0.mo73787a(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        p000.GeneratedMessageLite.m124027b(r5);
        r0 = (p000.aiaa) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
        if ((r0.getCause() instanceof p000.bxwf) != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
        throw ((p000.bxwf) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d0, code lost:
        if ((r0.getCause() instanceof p000.bxwf) == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        throw new p000.bxwf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e2, code lost:
        throw ((p000.bxwf) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e9, code lost:
        java.lang.Thread.currentThread().interrupt();
        r4 = (p000.bnsl) p000.ahsd.f67925a.mo68388c();
        r4.mo68437a(r0);
        r4.mo68405a("FastPairBattery: Failed to read device from Footprints");
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0104, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e8 A[ExcHandler: InterruptedException (r0v11 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:14:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0104 A[EDGE_INSN: B:37:?->B:65:0x0104 ?: BREAK  , ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), Splitter:B:14:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0173 A[RETURN] */
    /* renamed from: a */
    public final BatteryAdvertisement mo37231a(String str) {
        BatteryAdvertisement b;
        aiaa aiaa;
        ahyz a = ((ahst) ahgz.m55754a(this.f68229e, ahst.class)).mo37033a(str);
        if (a == null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairBattery: No associated accountKey is found when query battery info, address:%s", str);
            return null;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairBattery: query battery advertisement, address: %s", str);
        ByteString bxtx = a.f68429c;
        synchronized (this) {
            b = mo37236b(bxtx);
        }
        if ((a.f68427a & 1024) != 0) {
            aiaa = a.f68439n;
            if (aiaa == null) {
                aiaa = aiaa.f68501K;
            }
        } else {
            try {
                synchronized (this) {
                    if (this.f68230f == null) {
                        this.f68230f = (buru) ahgz.m55754a(this.f68229e, buru.class);
                    }
                }
                Iterator it = ((List) this.f68230f.mo73054a().get()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        ahza ahza = (ahza) it.next();
                        if (ahza.f68444b.equals(bxtx)) {
                            break;
                        }
                    } else {
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairBattery: No matched accountKey on Footprints");
                        aiaa = null;
                        break;
                    }
                }
            } catch (ExecutionException e) {
            } catch (bxwf e2) {
                e = e2;
            } catch (InterruptedException e3) {
            }
        }
        if (aiaa != null) {
            return b;
        }
        if (b == null && buqy.m120264a(aiaa)) {
            b = new BatteryAdvertisement();
            b.f80504a = str;
            b.mo44197a(new byte[]{Byte.MAX_VALUE, Byte.MAX_VALUE, Byte.MAX_VALUE});
            b.f80509f = bxtx;
            b.mo44196a(aiaa);
        }
        if (b == null) {
            return null;
        }
        b.f80514k = ahzt.m56924a(aiaa, ahzs.MAIN).mo37328a(this.f68229e);
        b.f80515l = ahzt.m56924a(aiaa, ahzs.LEFT).mo37328a(this.f68229e);
        b.f80516m = ahzt.m56924a(aiaa, ahzs.RIGHT).mo37328a(this.f68229e);
        b.f80517n = ahzt.m56924a(aiaa, ahzs.CASE).mo37328a(this.f68229e);
        return b;
        bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
        bnsl.mo68437a(e);
        bnsl.mo68405a("FastPairBattery: Failed to read device from Footprints");
        aiaa = null;
        if (aiaa != null) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final BatteryAdvertisement mo37236b(ByteString bxtx) {
        return (BatteryAdvertisement) this.f68226b.get(bxtx);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo37237b(BatteryAdvertisement batteryAdvertisement) {
        boolean z;
        if (batteryAdvertisement.f80505b.length == 3) {
            ByteString bxtx = batteryAdvertisement.f80509f;
            if (bxtx == null) {
                ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPairBattery: invalid batteryAdvertisement when updateCache, %s", batteryAdvertisement);
                batteryAdvertisement = null;
            } else {
                BatteryAdvertisement b = mo37236b(bxtx);
                if (b == null) {
                    this.f68226b.put(bxtx, batteryAdvertisement);
                    BatteryAdvertisement.m67329a(batteryAdvertisement.f80504a, null, batteryAdvertisement.f80505b);
                    srn srn = ahsd.f67925a;
                } else {
                    if (!Arrays.equals(b.f80505b, batteryAdvertisement.f80505b)) {
                        BatteryAdvertisement.m67329a(b.f80504a, b.f80505b, batteryAdvertisement.f80505b);
                        b.f80505b = batteryAdvertisement.f80505b;
                        b.f80521r = true;
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = batteryAdvertisement.f80522s;
                    if (i == 1) {
                        boolean z2 = b.f80506c;
                        boolean z3 = batteryAdvertisement.f80506c;
                        if (z2 != z3) {
                            b.f80506c = z3;
                            b.f80521r = true;
                        }
                    }
                    b.f80522s = i;
                    b.f80507d = batteryAdvertisement.f80507d;
                    b.f80508e = batteryAdvertisement.f80508e;
                    if (z) {
                        m56784c(b);
                    }
                    srn srn2 = ahsd.f67925a;
                    batteryAdvertisement = b;
                }
            }
            if (batteryAdvertisement != null) {
                m56785d(batteryAdvertisement);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.lang.Object, java.lang.Object):bngx
     arg types: [int, int]
     candidates:
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.lang.Object, java.lang.Object):bngx */
    /* renamed from: b */
    public final boolean mo37238b(String str) {
        boolean contains;
        busy busy = this.f68231g;
        if (busy == null) {
            synchronized (this.f68227c) {
                contains = this.f68227c.contains(str);
            }
            return contains;
        } else if (busy.mo73090a(str, bngx.m109357a((Object) 2, (Object) 1)) == null) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo37232a(ByteString bxtx) {
        BatteryAdvertisement batteryAdvertisement = (BatteryAdvertisement) this.f68226b.remove(bxtx);
        if (bxtx.equals(this.f68228d)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairBattery: Dismiss battery notification when adv removed");
            m56786e(batteryAdvertisement);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo37233a(ByteString bxtx, String str) {
        BatteryAdvertisement b = mo37236b(bxtx);
        if (b == null) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairBattery: no cached battery advertisement when device name is changed");
        } else if (!str.equals(b.f80510g)) {
            b.f80510g = str;
            b.f80521r = true;
            m56784c(b);
            m56785d(b);
        }
    }

    /* renamed from: a */
    public final synchronized void mo37234a(BatteryAdvertisement batteryAdvertisement) {
        if (batteryAdvertisement != null) {
            batteryAdvertisement.f80520q = false;
        }
        this.f68225a.mo37239a();
        this.f68228d = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* renamed from: a */
    public final void mo37235a(String str, boolean z) {
        if (!cfoj.m141557g()) {
            synchronized (this.f68227c) {
                if (z) {
                    this.f68227c.add(str);
                } else {
                    this.f68227c.remove(str);
                }
            }
            ((bnsl) ahsd.f67925a.mo68390d()).mo68431a("FastPairBattery, connection state of %s changes to %b", (Object) str, z);
        }
    }
}
