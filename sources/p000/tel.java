package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.android.cast.JGCastService;
import com.google.android.gms.constellation.verifier.SmsSender$SmsPendingIntentReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: tel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tel implements teu {

    /* renamed from: a */
    public int f45764a = 0;

    /* renamed from: b */
    public int f45765b = 0;

    /* renamed from: c */
    public int f45766c = 2;

    /* renamed from: d */
    private final Logger f45767d = tea.m36798a("mo_verifier");

    /* renamed from: e */
    private final cbqy f45768e;

    /* renamed from: f */
    private final sza f45769f;

    /* renamed from: g */
    private final tet f45770g;

    /* renamed from: h */
    private final tdx f45771h;

    public tel(cbqy cbqy, sza sza, tdx tdx) {
        tet tet = new tet();
        this.f45768e = cbqy;
        this.f45769f = sza;
        this.f45770g = tet;
        this.f45771h = tdx;
    }

    /* renamed from: a */
    public final void mo26427a() {
        cbqg cbqg;
        cbok cbok;
        SmsManager smsManager;
        cbqg cbqg2;
        cbok cbok2;
        cbqg cbqg3;
        cbok cbok3;
        cbqg cbqg4;
        cbok cbok4;
        cbqn cbqn;
        this.f45767d.mo25414c("send message", new Object[0]);
        if (C1133kh.m17835a(rpr.m34216b(), "android.permission.SEND_SMS") == 0) {
            cbqy cbqy = this.f45768e;
            if (cbqy.f178083a == 4) {
                cbqg = (cbqg) cbqy.f178084b;
            } else {
                cbqg = cbqg.f178018b;
            }
            cbnz cbnz = cbqg.f178020a;
            if (cbnz == null) {
                cbnz = cbnz.f177781f;
            }
            if (cbnz.f177783a == 3) {
                cbok = (cbok) cbnz.f177784b;
            } else {
                cbok = cbok.f177826d;
            }
            String str = cbok.f177829b;
            if (str.isEmpty()) {
                this.f45767d.mo25418e("MO verification is halted because an unexpected empty OPT message is obtained from pending verification", new Object[0]);
                return;
            }
            tdx tdx = this.f45771h;
            rpr b = rpr.m34216b();
            HashMap hashMap = new HashMap();
            int i = Build.VERSION.SDK_INT;
            if (SubscriptionManager.from(b).getActiveSubscriptionInfoCount() > 1) {
                for (SubscriptionInfo subscriptionInfo : SubscriptionManager.from(b).getActiveSubscriptionInfoList()) {
                    if (subscriptionInfo != null) {
                        hashMap.put(ted.m36810a(tdx, subscriptionInfo).mo26422b(), SmsManager.getSmsManagerForSubscriptionId(subscriptionInfo.getSubscriptionId()));
                    }
                }
            }
            if (hashMap.isEmpty()) {
                hashMap.put(((TelephonyManager) b.getSystemService("phone")).getSubscriberId(), SmsManager.getDefault());
            }
            SmsManager smsManager2 = null;
            if (hashMap.size() > 1) {
                cbqz cbqz = this.f45768e.f178085c;
                if (cbqz == null) {
                    cbqz = cbqz.f178091c;
                }
                if (cbqz.f178093a == 1) {
                    cbqn = (cbqn) cbqz.f178094b;
                } else {
                    cbqn = cbqn.f178043d;
                }
                cbqp cbqp = cbqn.f178045a;
                if (cbqp == null) {
                    cbqp = cbqp.f178048c;
                }
                bxwc bxwc = cbqp.f178050a;
                int size = bxwc.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    String str2 = (String) bxwc.get(i2);
                    i2++;
                    if (hashMap.containsKey(str2)) {
                        smsManager2 = (SmsManager) hashMap.get(str2);
                        break;
                    }
                }
            }
            if (smsManager2 != null) {
                smsManager = smsManager2;
            } else {
                smsManager = SmsManager.getDefault();
            }
            tek tek = new tek(this);
            cbqy cbqy2 = this.f45768e;
            if (cbqy2.f178083a == 4) {
                cbqg2 = (cbqg) cbqy2.f178084b;
            } else {
                cbqg2 = cbqg.f178018b;
            }
            cbnz cbnz2 = cbqg2.f178020a;
            if (cbnz2 == null) {
                cbnz2 = cbnz.f177781f;
            }
            if (cbnz2.f177783a == 3) {
                cbok2 = (cbok) cbnz2.f177784b;
            } else {
                cbok2 = cbok.f177826d;
            }
            String str3 = cbok2.f177828a;
            cbqy cbqy3 = this.f45768e;
            if (cbqy3.f178083a == 4) {
                cbqg3 = (cbqg) cbqy3.f178084b;
            } else {
                cbqg3 = cbqg.f178018b;
            }
            cbnz cbnz3 = cbqg3.f178020a;
            if (cbnz3 == null) {
                cbnz3 = cbnz.f177781f;
            }
            if (cbnz3.f177783a == 3) {
                cbok3 = (cbok) cbnz3.f177784b;
            } else {
                cbok3 = cbok.f177826d;
            }
            if (cbok3.f177830c == null) {
                this.f45767d.mo25414c("Sending visible sms", new Object[0]);
                tet tet = this.f45770g;
                tet.f45801b.registerReceiver(new SmsSender$SmsPendingIntentReceiver(tet, this.f45771h, this.f45768e, false, tek, str3), new IntentFilter("com.google.android.gms.constellation.VISIBLE_SMS_SENT"));
                PendingIntent broadcast = PendingIntent.getBroadcast(tet.f45801b, 0, new Intent("com.google.android.gms.constellation.VISIBLE_SMS_SENT"), JGCastService.FLAG_PRIVATE_DISPLAY);
                int i3 = Build.VERSION.SDK_INT;
                if (!cdgc.f180745a.mo6606a().mo77492n() || C1133kh.m17835a(tet.f45801b, "android.permission.MODIFY_PHONE_STATE") == 0) {
                    smsManager.sendTextMessage(str3, null, str, broadcast, null);
                } else {
                    smsManager.sendTextMessageWithoutPersisting(str3, null, str, broadcast, null);
                }
            } else {
                cbqy cbqy4 = this.f45768e;
                if (cbqy4.f178083a == 4) {
                    cbqg4 = (cbqg) cbqy4.f178084b;
                } else {
                    cbqg4 = cbqg.f178018b;
                }
                cbnz cbnz4 = cbqg4.f178020a;
                if (cbnz4 == null) {
                    cbnz4 = cbnz.f177781f;
                }
                if (cbnz4.f177783a == 3) {
                    cbok4 = (cbok) cbnz4.f177784b;
                } else {
                    cbok4 = cbok.f177826d;
                }
                cbof cbof = cbok4.f177830c;
                if (cbof == null) {
                    cbof = cbof.f177810b;
                }
                int i4 = cbof.f177812a;
                this.f45767d.mo25414c("Sending data sms", new Object[0]);
                tet tet2 = this.f45770g;
                tet2.f45801b.registerReceiver(new SmsSender$SmsPendingIntentReceiver(tet2, this.f45771h, this.f45768e, true, tek, str3), new IntentFilter("com.google.android.gms.constellation.BINARY_SMS_SENT"));
                smsManager.sendDataMessage(str3, null, (short) i4, str.getBytes(), PendingIntent.getBroadcast(tet2.f45801b, 0, new Intent("com.google.android.gms.constellation.BINARY_SMS_SENT"), JGCastService.FLAG_PRIVATE_DISPLAY), null);
            }
        }
    }

    /* renamed from: b */
    public final cbqy mo26428b() {
        return this.f45768e;
    }

    /* renamed from: c */
    public final String mo26429c() {
        cbqg cbqg;
        cbqy cbqy = this.f45768e;
        if (cbqy.f178083a == 4) {
            cbqg = (cbqg) cbqy.f178084b;
        } else {
            cbqg = cbqg.f178018b;
        }
        cbnz cbnz = cbqg.f178020a;
        if (cbnz == null) {
            cbnz = cbnz.f177781f;
        }
        cboa cboa = cbnz.f177785c;
        if (cboa == null) {
            cboa = cboa.f177788b;
        }
        return cboa.f177790a;
    }

    /* renamed from: d */
    public final cbqy mo26430d() {
        cbqg cbqg;
        cbqg cbqg2;
        cbqg cbqg3;
        cbqg cbqg4;
        this.f45767d.mo25414c("do verification", new Object[0]);
        cbqy cbqy = this.f45768e;
        if (cbqy.f178083a == 4) {
            cbqg = (cbqg) cbqy.f178084b;
        } else {
            cbqg = cbqg.f178018b;
        }
        cbnz cbnz = cbqg.f178020a;
        if (cbnz == null) {
            cbnz = cbnz.f177781f;
        }
        cbrc cbrc = cbnz.f177787e;
        if (cbrc == null) {
            cbrc = cbrc.f178104c;
        }
        bxyk bxyk = cbrc.f178106a;
        if (bxyk == null) {
            bxyk = bxyk.f165095c;
        }
        long a = tdo.m36763a(bxyk);
        cbqy cbqy2 = this.f45768e;
        if (cbqy2.f178083a == 4) {
            cbqg2 = (cbqg) cbqy2.f178084b;
        } else {
            cbqg2 = cbqg.f178018b;
        }
        cbnz cbnz2 = cbqg2.f178020a;
        if (cbnz2 == null) {
            cbnz2 = cbnz.f177781f;
        }
        cbrc cbrc2 = cbnz2.f177787e;
        if (cbrc2 == null) {
            cbrc2 = cbrc.f178104c;
        }
        bxyk bxyk2 = cbrc2.f178107b;
        if (bxyk2 == null) {
            bxyk2 = bxyk.f165095c;
        }
        long a2 = a - tdo.m36763a(bxyk2);
        tdz.m36796a();
        List a3 = tdz.m36795a(cdgc.f180745a.mo6606a().mo77498t());
        ArrayList arrayList = new ArrayList();
        int size = a3.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Long l = (Long) a3.get(i);
            if (l.longValue() > a2) {
                arrayList.add(Long.valueOf(a2));
                a2 = 0;
                break;
            }
            arrayList.add(l);
            a2 -= l.longValue();
            i++;
        }
        if (a2 > 0) {
            arrayList.add(Long.valueOf(a2));
        }
        Logger Logger = this.f45767d;
        String valueOf = String.valueOf(arrayList);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("sleep intervals ");
        sb.append(valueOf);
        Logger.logVerbose(sb.toString(), new Object[0]);
        cbqy cbqy3 = null;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            try {
                Logger logger2 = this.f45767d;
                String valueOf2 = String.valueOf(arrayList.get(i2));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
                sb2.append("sleep ");
                sb2.append(valueOf2);
                sb2.append(" ms");
                logger2.mo25414c(sb2.toString(), new Object[0]);
                Thread.sleep(((Long) arrayList.get(i2)).longValue());
                Logger logger3 = this.f45767d;
                StringBuilder sb3 = new StringBuilder(21);
                sb3.append("ping ");
                sb3.append(i2);
                sb3.append(" time");
                logger3.logVerbose(sb3.toString(), new Object[0]);
                sza sza = this.f45769f;
                tdx tdx = this.f45771h;
                cbqy cbqy4 = this.f45768e;
                bxvd da = cboe.f177806c.mo74144da();
                bxvd da2 = cbol.f177831d.mo74144da();
                int i3 = this.f45766c;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cbol cbol = (cbol) da2.f164949b;
                if (i3 != 1) {
                    cbol.f177833a = i3 - 2;
                    int i4 = this.f45764a;
                    cbol cbol2 = (cbol) da2.f164949b;
                    cbol2.f177834b = (long) i4;
                    cbol2.f177835c = (long) this.f45765b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cboe cboe = (cboe) da.f164949b;
                    cbol cbol3 = (cbol) da2.mo74062i();
                    cbol3.getClass();
                    cboe.f177809b = cbol3;
                    cboe.f177808a = 3;
                    cbqy3 = sza.mo26253a(tdx, cbqy4, (cboe) da.mo74062i());
                    tdz.m36796a();
                    if (tdz.m36797a(cbqy3)) {
                        if (cbqy3.f178083a == 4) {
                            cbqg3 = (cbqg) cbqy3.f178084b;
                        } else {
                            cbqg3 = cbqg.f178018b;
                        }
                        cbnz cbnz3 = cbqg3.f178020a;
                        if (cbnz3 == null) {
                            cbnz3 = cbnz.f177781f;
                        }
                        cboa cboa = cbnz3.f177785c;
                        if (cboa == null) {
                            cboa = cboa.f177788b;
                        }
                        String str = cboa.f177790a;
                        cbqy cbqy5 = this.f45768e;
                        if (cbqy5.f178083a == 4) {
                            cbqg4 = (cbqg) cbqy5.f178084b;
                        } else {
                            cbqg4 = cbqg.f178018b;
                        }
                        cbnz cbnz4 = cbqg4.f178020a;
                        if (cbnz4 == null) {
                            cbnz4 = cbnz.f177781f;
                        }
                        cboa cboa2 = cbnz4.f177785c;
                        if (cboa2 == null) {
                            cboa2 = cboa.f177788b;
                        }
                        if (str.equals(cboa2.f177790a) && this.f45766c != 4) {
                            i2++;
                        }
                    }
                    return cbqy3;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            } catch (InterruptedException e) {
                throw new tdw("Mo verification fails", 39, false, e);
            }
        }
        tds.m36774a(rpr.m34216b()).mo26411a(this.f45771h, this.f45768e, 14);
        return cbqy3;
    }
}
