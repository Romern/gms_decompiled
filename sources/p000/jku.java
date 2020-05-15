package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jku {

    /* renamed from: a */
    private static final bngx f22718a;

    /* renamed from: b */
    private final ios f22719b;

    /* renamed from: c */
    private final jks f22720c;

    static {
        ArrayList arrayList = new ArrayList();
        bsni[] values = bsni.values();
        for (bsni bsni : values) {
            if (!bsni.equals(bsni.UNKNOWN_FEATURE) && !bsni.equals(bsni.UNRECOGNIZED)) {
                arrayList.add(bsni.name());
                arrayList.add(String.valueOf(bsni.name()).concat("_SUPPORTED"));
            }
        }
        f22718a = bngx.m109368a((Collection) arrayList);
    }

    public jku(ios ios) {
        this(ios, new jks());
    }

    /* renamed from: a */
    public final void mo13836a(Context context, Account account) {
        List list;
        SyncedCryptauthDevice syncedCryptauthDevice;
        int i;
        boolean z;
        Context context2 = context;
        Account account2 = account;
        jta a = jsz.m17257a();
        if (!cchu.m129750f()) {
            a.mo14055k(5);
        } else if (account2 != null && soz.m35791a(context, account)) {
            byte[] b = jpt.m17081b(context);
            if (b != null) {
                List list2 = null;
                SyncedCryptauthDevice a2 = !cchu.m129747c() ? jpv.m17086a(context2, account2.name, true) : null;
                SyncedCryptauthDevice a3 = jpv.m17086a(context2, account2.name, false);
                jks jks = this.f22720c;
                jtq jtq = new jtq(context2);
                if (a2 != null) {
                    list2 = jij.m16758a(a2.mo7813a());
                }
                if (!cchu.f179012a.mo6606a().mo75988h()) {
                    jsz.m17257a().mo14043a("beacon_seed_coordinator_v1_result", jks.m16854a(list));
                    jtq.mo14079a(list);
                    syncedCryptauthDevice = a3;
                } else {
                    if (a2 == null && a3 == null) {
                        list = jks.m16855a(jks.f22717a.mo13761a(), false, jtq);
                        syncedCryptauthDevice = a3;
                    } else {
                        List a4 = jij.m16758a(a3 != null ? a3.mo7813a() : a2.mo7813a());
                        boolean z2 = list != null && list.equals(a4);
                        List a5 = jks.f22717a.mo13761a();
                        jto jto = (jto) a5.get(0);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= a4.size()) {
                                syncedCryptauthDevice = a3;
                                i = -1;
                                break;
                            }
                            jto jto2 = (jto) a4.get(i2);
                            syncedCryptauthDevice = a3;
                            int i3 = i2;
                            if (jto2.f23189b == jto.f23189b && jto2.f23190c == jto.f23190c) {
                                i = i3;
                                break;
                            } else {
                                i2 = i3 + 1;
                                a3 = syncedCryptauthDevice;
                            }
                        }
                        if (i == -1) {
                            list = jks.m16855a(a5, false, jtq);
                        } else if (i != 0) {
                            List subList = a4.subList(i, a4.size());
                            subList.addAll(a5.subList(subList.size(), 4));
                            list = jks.m16855a(subList, false, jtq);
                        } else if (z2) {
                            int size = a4.size() - 1;
                            byte[] a6 = jtq.mo14080a(((jto) a4.get(size)).f23189b);
                            jto jto3 = (jto) a5.get(size);
                            if (a6 == null || Arrays.equals(((jto) a4.get(size)).f23188a.getKey(), a6)) {
                                z = true;
                            } else {
                                bxvd da = jto.f23186d.mo74144da();
                                long j = ((jto) a4.get(size)).f23189b;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                ((jto) da.f164949b).f23189b = j;
                                long j2 = ((jto) a4.get(size)).f23190c;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                ((jto) da.f164949b).f23190c = j2;
                                ByteString a7 = ByteString.m123261a(a6);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                a7.getClass();
                                ((jto) da.f164949b).f23188a = a7;
                                jto3 = (jto) da.mo74062i();
                                z = false;
                            }
                            a4.remove(size);
                            a4.add(jto3);
                            list = jks.m16855a(a4, z, jtq);
                        } else {
                            list = jks.m16855a(a4, false, jtq);
                        }
                    }
                    jsz.m17257a().mo14043a("beacon_seed_coordinator_v2_result", jks.m16854a(list));
                    jtq.mo14079a(list);
                }
                if (list == null || list.isEmpty()) {
                    a.mo14055k(4);
                    throw new jkt("Failed to generate beacon seeds");
                }
                bxvd da2 = jtp.f23191d.mo74144da();
                ByteString a8 = ByteString.m123261a(b);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                a8.getClass();
                ((jtp) da2.f164949b).f23193a = a8;
                String str = Build.MODEL;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                jtp jtp = (jtp) da2.f164949b;
                str.getClass();
                jtp.f23194b = str;
                if (!jtp.f23195c.mo73666a()) {
                    jtp.f23195c = GeneratedMessageLite.m124021a(jtp.f23195c);
                }
                bxsy.m123078a(list, jtp.f23195c);
                try {
                    aucu.m76783a(this.f22719b.mo24732b(new inm("DeviceSync:BetterTogether", account2, ((jtp) da2.mo74062i()).serializeToBytes(), f22718a)), cchu.m129751g(), TimeUnit.SECONDS);
                    a.mo14055k(syncedCryptauthDevice == null ? 0 : 1);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    a.mo14055k(2);
                    throw new jkt("Failed sync", e);
                }
            } else {
                a.mo14055k(3);
                throw new jkt("Failed to retrieve public key");
            }
        } else {
            a.mo14055k(6);
        }
    }

    public jku(ios ios, jks jks) {
        this.f22719b = ios;
        this.f22720c = jks;
    }
}
