package p000;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bglr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bglr extends bgls implements bugl, bugo {

    /* renamed from: a */
    final bugn f116791a;

    /* renamed from: b */
    final bgkg f116792b;

    /* renamed from: c */
    final bfor f116793c;

    /* renamed from: d */
    final Handler f116794d;

    /* renamed from: e */
    long f116795e;

    /* renamed from: f */
    long f116796f;

    /* renamed from: g */
    bugr f116797g;

    public bglr(bugn bugn, bgkg bgkg, bfor bfor, Handler handler) {
        this.f116791a = bugn;
        this.f116792b = bgkg;
        this.f116793c = bfor;
        this.f116794d = handler;
    }

    /* renamed from: a */
    private final void m99262a(boolean z) {
        bfor bfor = this.f116793c;
        bfor.mo62047a(new bfoq(bfos.CHRE_WIFI_NEW_CLIENT, bfor.mo62055b(), "nanoAppState=%2$d", null, z, -1, -1));
        ((bgjo) this.f116792b).f116618a.f116622c.mo62846a(5, z ? 1 : 0, null, false);
    }

    /* renamed from: b */
    private final void m99263b(long j, long j2) {
        bugr bugr = this.f116797g;
        if (bugr != null) {
            bxvd da = buig.f153934d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buig buig = (buig) da.f164949b;
            int i = buig.f153936a | 1;
            buig.f153936a = i;
            buig.f153937b = j;
            buig.f153936a = i | 2;
            buig.f153938c = j2;
            byte[] k = ((buig) da.mo74062i()).mo73642k();
            int length = k.length;
            StringBuilder sb = new StringBuilder(48);
            sb.append("sending client-request msg of length ");
            sb.append(length);
            sb.toString();
            bugr.mo72641a(1, 1, k);
        }
    }

    /* renamed from: e */
    private final bugr m99264e() {
        return this.f116791a.mo72627a(5147455389092024338L);
    }

    /* renamed from: a */
    public final boolean mo62988a() {
        return this.f116797g != null;
    }

    /* renamed from: b */
    public final void mo61884b(int i) {
    }

    /* renamed from: b */
    public final boolean mo62989b() {
        return (this.f116795e == -1 || this.f116796f == -1) ? false : true;
    }

    /* renamed from: c */
    public final void mo62991c() {
        m99263b(0, 0);
        this.f116795e = -1;
        this.f116796f = -1;
    }

    /* renamed from: cr */
    public final void mo61886cr() {
        boolean z;
        bugr e = m99264e();
        this.f116797g = e;
        if (e != null) {
            z = true;
        } else {
            z = false;
        }
        m99262a(z);
        if (this.f116797g != null && mo62989b()) {
            m99263b(this.f116795e, this.f116796f);
        }
    }

    /* renamed from: d */
    public final void mo62992d() {
        boolean z;
        bugr e = m99264e();
        if (e != null) {
            e.mo72643a(this, this.f116794d);
            this.f116791a.mo72629a(5147455389092024338L, this, new adzt(Looper.myLooper()));
        }
        this.f116797g = e;
        if (e != null) {
            z = true;
        } else {
            z = false;
        }
        m99262a(z);
        this.f116795e = -1;
        this.f116796f = -1;
    }

    /* renamed from: a */
    public final void mo61880a(int i) {
        if (i != 1) {
            this.f116797g = null;
            m99262a(false);
            this.f116795e = -1;
            this.f116796f = -1;
        }
    }

    /* renamed from: a */
    public final void mo62990a(long j, long j2) {
        int i;
        long j3 = j;
        long j4 = j2;
        if (mo62988a()) {
            if (this.f116797g != null) {
                m99263b(j, j2);
                this.f116795e = j3;
                this.f116796f = j4;
                i = 1;
                bfor bfor = this.f116793c;
                bfor.mo62047a(new bfoq(bfos.CHRE_WIFI_NEW_CLIENT, bfor.mo62055b(), "intervalSec=%2$d, durationSec=%3$d, appAvail=%4$d", null, (int) (j3 / 1000), (int) (j4 / 1000), i));
            }
            this.f116795e = -1;
            this.f116796f = -1;
        }
        i = 0;
        bfor bfor2 = this.f116793c;
        bfor2.mo62047a(new bfoq(bfos.CHRE_WIFI_NEW_CLIENT, bfor2.mo62055b(), "intervalSec=%2$d, durationSec=%3$d, appAvail=%4$d", null, (int) (j3 / 1000), (int) (j4 / 1000), i));
    }

    /* renamed from: a */
    public final void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        long j;
        int i;
        buhd buhd2 = buhd;
        if (bugr == this.f116797g) {
            int i2 = buhd2.f153831a;
            int i3 = buhd2.f153832b;
            byte[] bArr = buhd2.f153833c;
            StringBuilder sb = new StringBuilder(110);
            sb.append("onMessageReceived(), message type is  ");
            sb.append(i2);
            sb.append(" and version is ");
            sb.append(i3);
            sb.append(" and payload length is ");
            sb.append(bArr.length);
            sb.toString();
            int i4 = 1;
            if (i2 == 2) {
                int a = buii.m119569a(((buij) buhd2.mo72661a((bxxk) buij.f153940b.mo74142c(7))).f153942a);
                if (a != 0) {
                    i4 = a;
                }
                int i5 = i4 - 1;
                StringBuilder sb2 = new StringBuilder(43);
                sb2.append("parsing BATCH_RESPONSE, code is ");
                sb2.append(i5);
                sb2.toString();
                if (i5 != 0) {
                    StringBuilder sb3 = new StringBuilder(31);
                    sb3.append("handle this case -- ");
                    sb3.append(i5);
                    sb3.toString();
                }
            } else if (i2 == 3) {
                buif buif = (buif) buhd2.mo72661a((bxxk) buif.f153928d.mo74142c(7));
                int a2 = buie.m119565a(buif.f153932c);
                if (a2 == 0) {
                    a2 = 1;
                }
                boolean z = buif.f153930a;
                StringBuilder sb4 = new StringBuilder(75);
                sb4.append("smartbatching batch-event with status ");
                sb4.append(a2 - 1);
                sb4.append(" and lastFragment is ");
                sb4.append(z);
                sb4.toString();
                try {
                    bxwc bxwc = buif.f153931b;
                    int size = bxwc.size();
                    StringBuilder sb5 = new StringBuilder(26);
                    sb5.append("received ");
                    sb5.append(size);
                    sb5.append(" scans");
                    sb5.toString();
                    ArrayList<bgkf[]> arrayList = new ArrayList();
                    Iterator it = bxwc.iterator();
                    while (true) {
                        int i6 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        buik buik = (buik) it.next();
                        bxwc<buic> bxwc2 = buik.f153947b;
                        long j2 = buik.f153946a;
                        int size2 = bxwc2.size();
                        StringBuilder sb6 = new StringBuilder(81);
                        sb6.append(" Scan #");
                        sb6.append(i4);
                        sb6.append(" timestamp is ");
                        sb6.append(j2);
                        sb6.append(" and has ");
                        sb6.append(size2);
                        sb6.append(" entries.");
                        sb6.toString();
                        bgkf[] bgkfArr = new bgkf[bxwc2.size()];
                        for (buic buic : bxwc2) {
                            long j3 = buic.f153924a;
                            int i7 = buic.f153925b;
                            StringBuilder sb7 = new StringBuilder(55);
                            sb7.append("  AP is bssid ");
                            sb7.append(j3);
                            sb7.append(" and rssi ");
                            sb7.append(i7);
                            sb7.toString();
                            bgkfArr[i6] = new bgkf(buik.f153946a, buic.f153924a, "", null, -1, false, -1, buic.f153925b, -1, -1, null);
                            i6++;
                        }
                        arrayList.add(bgkfArr);
                        i4++;
                    }
                    for (bgkf[] bgkfArr2 : arrayList) {
                        int length = bgkfArr2.length;
                        if (length != 0) {
                            j = bgkfArr2[0].f116697a;
                        } else {
                            j = 0;
                        }
                        bfor bfor = this.f116793c;
                        long b = bfor.mo62055b();
                        if (j != 0) {
                            i = (int) (b - j);
                        } else {
                            i = -1;
                        }
                        bfor.mo62047a(new bfoq(bfos.CHRE_WIFI_SCAN_SET, b, "apCount=%2$d, ageMs=%3$d", null, length, i, -1));
                    }
                    this.f116792b.mo62905a(arrayList, null);
                } catch (ClassNotFoundException e) {
                } catch (InstantiationException e2) {
                } catch (IllegalAccessException e3) {
                } catch (NoSuchMethodException e4) {
                } catch (InvocationTargetException e5) {
                }
            }
        }
    }
}
