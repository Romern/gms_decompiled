package com.google.android.gms.update.reminder;

import android.content.Intent;
import android.os.SystemProperties;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateReminderDialogIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f109529a = avpq.m79017d("UpdateReminderDialogControl");

    /* renamed from: b */
    private static final avtk f109530b = new avtk("control.popupdialog.last_aggresive_dialog_displayed_at", 0L);

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    private static final void m93759a() {
        avmc avmc;
        int a;
        avmc avmc2;
        String str;
        char c;
        boolean z;
        Intent intent;
        if (!((String) avma.f93358d.mo51364a()).isEmpty()) {
            SystemUpdateStatus d = ((avmx) avmx.f93453h.mo51589b()).mo51414d();
            if (d.f109461c == 0) {
                f109529a.mo25412b("No pending update.", new Object[0]);
            } else if (!d.f109476r.f109420a) {
                if (!bmxx.m108577a(cfro.m142719c())) {
                    try {
                        avmc = avmc.m78777a(cfro.m142719c());
                    } catch (avlq e) {
                        f109529a.mo25418e("Unable to parse display time window: %s.", cfro.m142719c());
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    long currentTimeMillis2 = System.currentTimeMillis() - d.f109472n;
                    long days = TimeUnit.MILLISECONDS.toDays(currentTimeMillis2);
                    a = avmd.m78785a(currentTimeMillis2);
                    avtn avtn = (avtn) avtn.f93892a.mo51589b();
                    long longValue = ((Long) avtn.mo51607b(f109530b)).longValue();
                    if (a <= 0) {
                        int a2 = avmd.m78785a(currentTimeMillis2);
                        String b = cfro.f185519a.mo6606a().mo82575b();
                        long j = 31104000000L;
                        if (!bmxx.m108577a(b)) {
                            ArrayList arrayList = new ArrayList();
                            for (String str2 : bmyx.m108640a(',').mo66918a((CharSequence) b)) {
                                try {
                                    arrayList.add(Long.valueOf(Long.parseLong(str2.trim())));
                                } catch (NumberFormatException e2) {
                                    avmd.f93376a.mo25412b("Malformed retry delayed period string: %s.", str2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                if (arrayList.size() > a2) {
                                    j = ((Long) arrayList.get(a2)).longValue();
                                } else {
                                    j = ((Long) arrayList.get(arrayList.size() - 1)).longValue();
                                }
                                if (currentTimeMillis >= longValue + j && avmc.mo51368a(currentTimeMillis)) {
                                    try {
                                        avmc2 = avmc.m78777a(cfsj.m142903c());
                                    } catch (avlq e3) {
                                        f109529a.mo25418e("Unable to parse restart time window: %s.", cfsj.m142903c());
                                        avmc2 = avmc.f93371a;
                                    }
                                    avtn.mo51605a(f109530b.mo51602b(Long.valueOf(currentTimeMillis)));
                                    rpr b2 = rpr.m34216b();
                                    String charSequence = TextUtils.expandTemplate(b2.getText(C0126R.string.system_update_update_available_aggressive_message_text), String.valueOf(days)).toString();
                                    if ((d.f109461c & 31) == 11) {
                                        String valueOf = String.valueOf(charSequence);
                                        String valueOf2 = String.valueOf(TextUtils.expandTemplate(b2.getText(C0126R.string.system_update_mobile_data_warning_dialog_message), new CharSequence[0]));
                                        String valueOf3 = String.valueOf(TextUtils.expandTemplate(b2.getText(C0126R.string.system_update_size_label), new CharSequence[0]));
                                        String str3 = d.f109482x.f109487c;
                                        int length = String.valueOf(valueOf).length();
                                        int length2 = String.valueOf(valueOf2).length();
                                        StringBuilder sb = new StringBuilder(length + 7 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str3).length());
                                        sb.append(valueOf);
                                        sb.append("\n\n");
                                        sb.append(valueOf2);
                                        sb.append("\n\n");
                                        sb.append(valueOf3);
                                        sb.append(" ");
                                        sb.append(str3);
                                        sb.append("\n\n");
                                        str = sb.toString();
                                    } else {
                                        str = charSequence;
                                    }
                                    String str4 = SystemProperties.get("setupwizard.theme");
                                    switch (str4.hashCode()) {
                                        case -2128555920:
                                            if (str4.equals("glif_v2_light")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1241052239:
                                            if (str4.equals("glif_v3_light")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3175618:
                                            if (str4.equals("glif")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 115650329:
                                            if (str4.equals("glif_v2")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 115650330:
                                            if (str4.equals("glif_v3")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 767685465:
                                            if (str4.equals("glif_light")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (avmc2.mo51367a() && d.f109483y) {
                                        String b3 = cfro.m142718b();
                                        intent = avmg.m78797a(str, b3, d.f109461c, a, d.f109479u, z).putExtra("restart_window_start_time", avmc2.mo51366a(b2, System.currentTimeMillis()));
                                    } else {
                                        intent = avmg.m78797a(str, cfro.m142718b(), d.f109461c, a, d.f109479u, z);
                                    }
                                    b2.startActivity(intent);
                                    return;
                                }
                                return;
                            }
                        }
                        if (currentTimeMillis >= longValue + j) {
                            return;
                        }
                        return;
                    }
                    return;
                }
                avmc = avmc.f93372b;
                long currentTimeMillis3 = System.currentTimeMillis();
                long currentTimeMillis22 = System.currentTimeMillis() - d.f109472n;
                long days2 = TimeUnit.MILLISECONDS.toDays(currentTimeMillis22);
                a = avmd.m78785a(currentTimeMillis22);
                avtn avtn2 = (avtn) avtn.f93892a.mo51589b();
                long longValue2 = ((Long) avtn2.mo51607b(f109530b)).longValue();
                if (a <= 0) {
                }
            } else {
                f109529a.mo25412b("SystemUpdate activity already foregrounded.", new Object[0]);
            }
        }
    }

    public final void onHandleIntent(Intent intent) {
        String b = bmxx.m108578b(intent.getAction());
        f109529a.mo25412b("Received action: %s", b);
        if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(b)) {
            if ("android.intent.action.USER_PRESENT".equals(b) && !bmxx.m108577a(cfro.m142719c())) {
                m93759a();
            }
        } else if (cfro.f185519a.mo6606a().mo82578e()) {
            m93759a();
        }
    }
}
