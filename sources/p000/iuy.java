package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.easyunlock.userpresence.TrustStateTracker$TrustStateBroadcastReceiver;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.WireMessageParams;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: iuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iuy implements jmk {

    /* renamed from: d */
    private static final Role f21835d = new Role("easy_unlock", 8);

    /* renamed from: g */
    private static final sek f21836g = new sek(new String[]{"ProximityAuthClient"}, (char[]) null);

    /* renamed from: a */
    public final Set f21837a;

    /* renamed from: b */
    public final Object f21838b = new Object();

    /* renamed from: c */
    public boolean f21839c;

    /* renamed from: e */
    private final jmx f21840e;

    /* renamed from: f */
    private final iuv f21841f;

    public iuy(Context context, Set set) {
        this.f21840e = jmj.m16923a(context);
        this.f21841f = new iuv(context, this);
        this.f21837a = new HashSet(set);
    }

    /* renamed from: a */
    private final RemoteDevice m16183a(String str) {
        for (RemoteDevice remoteDevice : this.f21837a) {
            if (remoteDevice.f11138b.equals(str)) {
                return remoteDevice;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo13351b() {
        synchronized (this.f21838b) {
            if (this.f21839c) {
                try {
                    aucu.m76783a(mo13352c(), 5, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    f21836g.mo25417e("Error registering device for role", e, new Object[0]);
                }
            }
        }
    }

    /* renamed from: c */
    public final aucb mo13352c() {
        if (!this.f21839c) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (RemoteDevice remoteDevice : this.f21837a) {
            arrayList.add(this.f21840e.mo13888a(remoteDevice.f11138b, f21835d));
        }
        return aucu.m76779a((Collection) arrayList);
    }

    /* renamed from: d */
    public final List mo13353d() {
        synchronized (this.f21838b) {
            aucb a = this.f21840e.mo13887a(f21835d);
            try {
                aucu.m76783a(a, 5, TimeUnit.SECONDS);
                List list = (List) a.mo50386d();
                return list;
            } catch (ExecutionException e) {
                e = e;
                f21836g.mo25417e("Couldn't retrieve connection infos", e, new Object[0]);
                bngx e2 = bngx.m109376e();
                return e2;
            } catch (InterruptedException e3) {
                e = e3;
                f21836g.mo25417e("Couldn't retrieve connection infos", e, new Object[0]);
                bngx e22 = bngx.m109376e();
                return e22;
            } catch (TimeoutException e4) {
                e = e4;
                f21836g.mo25417e("Couldn't retrieve connection infos", e, new Object[0]);
                bngx e222 = bngx.m109376e();
                return e222;
            }
        }
    }

    /* renamed from: a */
    public final void mo13347a() {
        synchronized (this.f21838b) {
            if (!this.f21839c) {
                this.f21840e.mo13890a((jmk) this);
                for (RemoteDevice remoteDevice : this.f21837a) {
                    try {
                        aucu.m76783a(this.f21840e.mo13886a(remoteDevice, f21835d), 5, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                        f21836g.mo25417e("Error registering device for role", e, new Object[0]);
                    }
                }
                this.f21839c = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo13348a(String str, int i, int i2) {
        int i3 = i2;
        synchronized (this.f21838b) {
            RemoteDevice a = m16183a(str);
            if (a != null || str.isEmpty()) {
                iuv iuv = this.f21841f;
                synchronized (iuv.f21829e) {
                    if (a != null) {
                        String str2 = a.f11138b;
                        if (i3 != 3) {
                            iuv.f21831g.remove(str2);
                        } else {
                            iuv.f21831g.add(str2);
                        }
                    }
                    if (iuv.f21831g.isEmpty()) {
                        if (iuv.f21826b.mo13355a()) {
                            iuv.f21824j.mo25414c("Stop tracking lock screen status updates.", new Object[0]);
                            ivb ivb = iuv.f21826b;
                            if (ivb.f21852g.remove(iuv) && ivb.f21852g.size() == 0) {
                                ivu ivu = ivb.f21847b;
                                synchronized (ivu.f21892d) {
                                    ivu.f21894f.remove(ivb);
                                    if (ivu.f21894f.isEmpty()) {
                                        ivl ivl = ivu.f21893e;
                                        ivl.f21870a.unregisterReceiver(ivl);
                                        ivu.f21891c.mo13376b();
                                        ivu.f21895g = 0;
                                    }
                                }
                                ivr ivr = ivb.f21848c;
                                synchronized (ivr.f21880a) {
                                    ivr.f21883d.remove(ivb);
                                    if (ivr.f21883d.size() == 0) {
                                        ivr.f21881b.unregisterReceiver(ivr.f21884e);
                                        ivr.f21884e = null;
                                    }
                                }
                            }
                        }
                    } else if (!iuv.f21826b.mo13355a()) {
                        iuv.f21824j.mo25414c("Start tracking lock screen status updates.", new Object[0]);
                        ivb ivb2 = iuv.f21826b;
                        if (ivb2.f21852g.add(iuv) && ivb2.f21852g.size() == 1) {
                            ivu ivu2 = ivb2.f21847b;
                            sdo.m34959a(ivb2);
                            synchronized (ivu2.f21892d) {
                                ivu2.mo13377a(false);
                                if (ivu2.f21894f.isEmpty()) {
                                    ivl ivl2 = ivu2.f21893e;
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                                    ivl2.f21870a.registerReceiver(ivl2, intentFilter);
                                    if (ivu2.f21895g == 2) {
                                        ivu2.f21891c.mo13375a();
                                    }
                                }
                                ivu2.f21894f.add(ivb2);
                            }
                            ivr ivr2 = ivb2.f21848c;
                            sdo.m34959a(ivb2);
                            bqga.m112781a(ivr2.f21882c.mo13374a(), new ivp(ivb2), bqfb.INSTANCE);
                            synchronized (ivr2.f21880a) {
                                ivr2.f21883d.add(ivb2);
                                if (ivr2.f21884e == null) {
                                    ivr2.f21884e = new TrustStateTracker$TrustStateBroadcastReceiver(ivr2);
                                    IntentFilter intentFilter2 = new IntentFilter();
                                    intentFilter2.addAction("com.google.android.gms.trustagent.TRUST_STATE_CHANGED");
                                    ivr2.f21881b.registerReceiver(ivr2.f21884e, intentFilter2);
                                }
                            }
                        }
                    }
                    if (i3 == 3) {
                        iuv.f21826b.mo13358d();
                        iuv.f21833i = 0;
                    } else if (i == 2 && i3 != 3) {
                        int i4 = iuv.f21833i;
                        if (i4 >= 4) {
                            iuv.f21824j.mo25414c("Forcing device sync for %s", a);
                            if (a != null) {
                                iuv.f21830f.mo13969b(new Account(a.f11140d, "com.google"));
                            } else if (ccfm.f178870a.mo6606a().mo75859a()) {
                                iuv.f21832h.execute(new iur(iuv));
                            }
                            iuv.f21833i = 0;
                        } else {
                            iuv.f21833i = i4 + 1;
                        }
                    }
                }
            } else {
                f21836g.mo25418e("Can't update connection status: %s", str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x021a A[ExcHandler: iuk (e iuk), Splitter:B:11:0x0029] */
    /* renamed from: a */
    public final void mo13349a(String str, String str2, byte[] bArr) {
        synchronized (this.f21838b) {
            if ("easy_unlock".equals(str2)) {
                RemoteDevice a = m16183a(str);
                if (a == null) {
                    f21836g.mo25418e("Unknown device for received message: %s", str);
                } else {
                    iuv iuv = this.f21841f;
                    synchronized (iuv.f21829e) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr));
                            String string = jSONObject.getString("type");
                            if ("event".equals(string)) {
                                Integer num = (Integer) ive.f21856a.get(jSONObject.getString("name"));
                                if (num == null) {
                                    ive.f21857c.mo25416d("Received an unknown event: %s", jSONObject.getString("name"));
                                    num = -1;
                                }
                                ive ive = new ive(num.intValue());
                                iuv.f21824j.mo25414c("Handling status update message...", new Object[0]);
                                if (ive.f21858b == 0) {
                                    synchronized (iuv.f21829e) {
                                        ium ium = iuv.f21828d;
                                        synchronized (ium.f21807c) {
                                            String string2 = ium.f21805a.getString(C0126R.string.auth_proximity_auth_feature_name);
                                            String string3 = ium.f21805a.getString(C0126R.string.auth_proximity_auth_device_unlocked_content, ium.f21808d);
                                            String string4 = ium.f21805a.getString(C0126R.string.auth_proximity_auth_device_unlocked_dialog_content, ium.f21808d);
                                            Context context = ium.f21805a;
                                            Bundle bundle = new Bundle();
                                            int i = Build.VERSION.SDK_INT;
                                            bundle.putString("android.substName", ium.f21805a.getString(C0126R.string.auth_proximity_auth_feature_name));
                                            C1102je jeVar = new C1102je(context);
                                            jeVar.mo13630b(qkj.m32287a(context, C0126R.C0127drawable.auth_ic_proximity_notification));
                                            jeVar.mo13619a(System.currentTimeMillis());
                                            jeVar.mo13627a(true);
                                            jeVar.mo13623a(bundle);
                                            jeVar.f22258j = -1;
                                            jeVar.mo13616a(2);
                                            jeVar.mo13640e(string2);
                                            jeVar.mo13632b(string3);
                                            Context context2 = ium.f21805a;
                                            Intent intent = new Intent(context2, ivk.class);
                                            intent.putExtra("dialog_content_msg", string4);
                                            jeVar.f22254f = PendingIntent.getActivity(context2, 0, intent, 134217728);
                                            int i2 = Build.VERSION.SDK_INT;
                                            jeVar.f22244B = "easy-unlock-notification-channel-id";
                                            ium.f21806b.mo25445a("EasyUnlockNotifications", 2, jeVar.mo13629b());
                                        }
                                    }
                                }
                            } else if ("decrypt_request".equals(string)) {
                                ivc ivc = new ivc(Base64.decode(jSONObject.getString("encrypted_data"), 8));
                                iuv.f21824j.mo25414c("Handling decrypt request message...", new Object[0]);
                                bqga.m112781a(bqdx.m112674a(iuv.f21832h.mo25819b(new ius(iuv, a)), new iut(new iuq(iuv.f21827c.f21813a), ivc), bqfb.INSTANCE), new iuu(iuv, a), bqfb.INSTANCE);
                            } else if ("unlock_request".equals(string)) {
                                iuv.f21824j.mo25414c("Handling unlock request message...", new Object[0]);
                                iuy iuy = iuv.f21825a;
                                String str3 = a.f11138b;
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("type", "unlock_response");
                                iuy.mo13350a(str3, jSONObject2.toString().getBytes("UTF-8"));
                            } else if (!"poll_screen_state".equals(string)) {
                                throw new iuk(String.format("Received unexpected type of message: %s.", string));
                            } else if ("poll_screen_state".equals(jSONObject.getString("type"))) {
                                iuv.f21824j.mo25414c("Handling poll screen state message...", new Object[0]);
                                iuv.f21826b.mo13358d();
                            } else {
                                throw new JSONException("Unexpected type.");
                            }
                        } catch (JSONException e) {
                            throw new IllegalStateException("Failed to parse JSON", e);
                        } catch (iuk e2) {
                        } catch (UnsupportedEncodingException e3) {
                            throw new RuntimeException(e3);
                        } catch (IllegalArgumentException e4) {
                            String valueOf = String.valueOf(e4);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                            sb.append("Failed to decode the data.");
                            sb.append(valueOf);
                            throw new JSONException(sb.toString());
                        } catch (JSONException e5) {
                            e = e5;
                        }
                    }
                }
            }
            return;
        }
        iuv.f21824j.mo25417e("Exception when handling the message.", e, new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo13350a(String str, byte[] bArr) {
        synchronized (this.f21838b) {
            if (!this.f21839c) {
                return;
            }
            if (m16183a(str) == null) {
                f21836g.mo25418e("Can't send message for device: %s", str);
            } else {
                this.f21840e.mo13889a(new WireMessageParams(str, bArr, "easy_unlock"));
            }
        }
    }
}
