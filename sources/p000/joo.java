package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.proximity.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.GetMyDevicesRequestEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.GetMyDevicesResponseEntity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: joo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class joo {

    /* renamed from: a */
    public static final /* synthetic */ int f22939a = 0;

    /* renamed from: b */
    private static final Logger f22940b = jsy.m17256a("CryptauthDevicesSyncUpdater");

    /* renamed from: c */
    private final Context f22941c;

    /* renamed from: d */
    private final jku f22942d;

    public joo(Context context, jku jku) {
        this.f22941c = context;
        this.f22942d = jku;
    }

    /* renamed from: a */
    public final void mo13945a(Account account, int i) {
        if (!cchu.m129750f()) {
            mo13946b(account, i);
            return;
        }
        try {
            this.f22942d.mo13836a(this.f22941c, account);
        } catch (jkt e) {
            f22940b.mo25417e("Error syncing devices", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo13946b(Account account, int i) {
        jta a;
        Account account2 = account;
        jtt a2 = jtu.m17328a(this.f22941c);
        try {
            a = jsz.m17257a();
            if (account2 != null) {
                jod a3 = joc.m17012a(this.f22941c);
                byte[] b = jpt.m17081b(this.f22941c);
                if (b != null) {
                    String str = account2.name;
                    jrp jrp = new jrp();
                    jrp.f23136a = true;
                    jrp.f23139d.add(2);
                    jrp.f23138c = i;
                    jrp.f23139d.add(5);
                    jrp.f23139d.add(6);
                    jrp.f23137b = (DeviceClassifierEntity) a3.mo13932a();
                    jrp.f23139d.add(4);
                    jrm jrm = a3.f22924a;
                    List list = ((GetMyDevicesResponseEntity) jrm.f23135a.mo25536a(a3.mo13931a(str), 1, new StringBuilder("deviceSync/getmydevices").toString(), new GetMyDevicesRequestEntity(jrp.f23139d, jrp.f23136a, false, jrp.f23137b, jrp.f23138c, 0), GetMyDevicesResponseEntity.class)).f11240b;
                    if (list != null) {
                        f22940b.mo25412b("Synced devices: %s", TextUtils.join(", ", list));
                        int i2 = 0;
                        while (true) {
                            if (i2 >= list.size()) {
                                i2 = -1;
                                break;
                            }
                            jrn jrn = (jrn) list.get(i2);
                            if (jrn.mo7841n()) {
                                try {
                                    if (Arrays.equals(b, sqd.m35971c(jrn.mo7840m()))) {
                                        break;
                                    }
                                } catch (IllegalArgumentException e) {
                                    f22940b.mo25416d("Cannot decode public key: %s", jrn.mo7840m());
                                }
                            }
                            i2++;
                        }
                        jrn jrn2 = i2 != -1 ? (jrn) list.remove(i2) : null;
                        if (jrn2 != null) {
                            f22940b.mo25412b("My synced feature state: { Account: %s, Supported: %s, Enabled: %s}", account2.name, jrn2.mo7842o(), jrn2.mo7834g());
                            if (!a2.mo14084a(account2, jrn2)) {
                                a.mo14054j(5);
                                f22940b.mo25418e("Failed to store my metadata: %s", jrn2);
                            } else {
                                Collections.sort(list, jol.f22938a);
                                if (((long) list.size()) > cchr.m129717e()) {
                                    list = list.subList(0, (int) cchr.m129717e());
                                }
                                if (!cchu.m129750f()) {
                                    jlg a4 = jlf.m16865a(this.f22941c);
                                    bngx a5 = bngx.m109368a((Collection) a4.f22748b.mo14089a(account2));
                                    jlg.f22747a.mo25414c("Updating previously enabled features (%s) and with enabled features synced from Cryptauth (%s)", a5, jrn2.mo7834g());
                                    a4.f22748b.mo14091b(account2);
                                    if (!jrn2.mo7835h()) {
                                        a4.f22749c.mo14091b(account2);
                                        bnre i3 = a5.listIterator();
                                        while (i3.hasNext()) {
                                            a4.mo13853b(account2, (bsni) i3.next(), false);
                                        }
                                    } else {
                                        for (String str2 : jrn2.mo7834g()) {
                                            try {
                                                bsni a6 = bsni.m116007a(jkq.m16852a(str2));
                                                a4.f22748b.mo14092b(account2, a6);
                                                if (!a5.contains(a6)) {
                                                    a4.mo13853b(account2, a6, true);
                                                }
                                            } catch (IllegalArgumentException e2) {
                                                jlg.f22747a.mo25418e("Failed to parse enabled feature (%s) to FeatureName", str2, e2);
                                                jsw.m17254a().mo14033a(e2);
                                            }
                                        }
                                        a4.mo13849a(account2, a5);
                                    }
                                }
                                if (!a2.mo14083a(account2, list)) {
                                    a.mo14054j(4);
                                    f22940b.mo25418e("Failed to store devices: %s", TextUtils.join(", ", list));
                                } else {
                                    a.mo14054j(0);
                                }
                                jop.m17032a();
                                joq.m17033a(this.f22941c, account2);
                            }
                        } else {
                            f22940b.mo25418e("Synced list missing my device metadata.", new Object[0]);
                            a.mo14054j(7);
                        }
                    } else {
                        f22940b.mo25418e("Synced list is null.", new Object[0]);
                        a.mo14054j(8);
                        throw new jon();
                    }
                } else {
                    a.mo14054j(6);
                }
            } else {
                a.mo14054j(1);
            }
            if (a2 != null) {
                a2.close();
            }
        } catch (VolleyError | gid e3) {
            f22940b.mo25417e("Failure to fetch devices.", e3, new Object[0]);
            if (e3 instanceof gid) {
                a.mo14054j(2);
            } else {
                a.mo14054j(3);
            }
            jsw.m17254a().mo14033a(e3);
            throw new jon(e3);
        } catch (Throwable th) {
            Throwable th2 = th;
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Throwable th3) {
                    bqye.m113761a(th2, th3);
                }
            }
            throw th2;
        }
    }
}
