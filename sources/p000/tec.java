package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.UserManager;
import android.telephony.ServiceState;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: tec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tec {

    /* renamed from: a */
    public static final Logger f45721a = tea.m36798a("phone_util");

    /* renamed from: e */
    private static WeakReference f45722e = new WeakReference(null);

    /* renamed from: b */
    public final tds f45723b;

    /* renamed from: c */
    public final boolean f45724c = cdft.f180703a.mo6606a().mo77444e();

    /* renamed from: d */
    public final bngx f45725d;

    private tec(Context context, tdx tdx) {
        this.f45723b = tds.m36774a(context);
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (this.f45724c) {
            arrayList.add(ted.m36809a(tdx));
        } else {
            try {
                List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(context).getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList != null && !activeSubscriptionInfoList.isEmpty()) {
                    for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                        if (subscriptionInfo != null) {
                            arrayList.add(ted.m36810a(tdx, subscriptionInfo));
                        }
                    }
                }
            } catch (SecurityException e) {
                f45721a.mo25417e("No READ_PHONE_STATE permission", e, new Object[0]);
                this.f45723b.mo26410a(tdx, 43, e);
            }
        }
        this.f45725d = bngx.m109368a((Collection) arrayList);
    }

    /* renamed from: a */
    public static final String m36804a(String str) {
        byte[] bArr = new byte[0];
        try {
            bArr = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
        } catch (NoSuchAlgorithmException e) {
        }
        return bArr.length != 0 ? Base64.encodeToString(bArr, 2) : "";
    }

    /* renamed from: b */
    public final Map mo26420b(tdx tdx, Context context) {
        bnhe bnhe;
        long j;
        Pair pair;
        int i;
        int i2;
        int i3;
        tdx tdx2 = tdx;
        Map map = tdx2.f45710c;
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        bnre i4 = this.f45725d.listIterator();
        while (i4.hasNext()) {
            ted ted = (ted) i4.next();
            String b = ted.mo26422b();
            if (TextUtils.isEmpty(b)) {
                tds.m36774a(rpr.m34216b()).mo26407a(ted.f45727a, 48, 42);
                pair = null;
            } else {
                cbre cbre = (cbre) cbrh.f178114t.mo74144da();
                int intValue = Integer.valueOf(ted.mo26423c()).intValue();
                if (intValue != 1) {
                    i = intValue != 2 ? intValue != 3 ? 2 : 5 : 4;
                } else {
                    i = 3;
                }
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                ((cbrh) cbre.f164949b).f178117b = i - 2;
                int i5 = Build.VERSION.SDK_INT;
                String str = (String) bmxu.m108565a(ted.f45728b.getGroupIdLevel1(), "");
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                str.getClass();
                ((cbrh) cbre.f164949b).f178118c = str;
                bxvd da = cbrd.f178108e.mo74144da();
                String d = ted.mo26424d();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                d.getClass();
                ((cbrd) da.f164949b).f178110a = d;
                String e = ted.mo26425e();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                e.getClass();
                ((cbrd) da.f164949b).f178111b = e;
                String str2 = (String) bmxu.m108565a(ted.f45728b.getSimOperatorName(), "");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str2.getClass();
                ((cbrd) da.f164949b).f178112c = str2;
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                cbrd cbrd = (cbrd) da.mo74062i();
                cbrd.getClass();
                ((cbrh) cbre.f164949b).f178119d = cbrd;
                bxvd da2 = cbrd.f178108e.mo74144da();
                String str3 = (String) bmxu.m108565a(ted.f45728b.getNetworkCountryIso(), "");
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str3.getClass();
                ((cbrd) da2.f164949b).f178110a = str3;
                String str4 = (String) bmxu.m108565a(ted.f45728b.getNetworkOperator(), "");
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str4.getClass();
                ((cbrd) da2.f164949b).f178111b = str4;
                String str5 = (String) bmxu.m108565a(ted.f45728b.getNetworkOperatorName(), "");
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str5.getClass();
                ((cbrd) da2.f164949b).f178112c = str5;
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                cbrd cbrd2 = (cbrd) da2.mo74062i();
                cbrd2.getClass();
                ((cbrh) cbre.f164949b).f178120e = cbrd2;
                int i6 = !Boolean.valueOf(ted.f45728b.isNetworkRoaming()).booleanValue() ? 3 : 4;
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                ((cbrh) cbre.f164949b).f178121f = cbrf.m128128a(i6);
                int i7 = Integer.valueOf(ted.f45728b.getSimState()).intValue() == 5 ? 4 : 3;
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                ((cbrh) cbre.f164949b).f178116a = i7 - 2;
                boolean isSmsCapable = ted.f45728b.isSmsCapable();
                rpr b2 = rpr.m34216b();
                int a = C1133kh.m17835a(b2, "android.permission.READ_SMS");
                int a2 = C1133kh.m17835a(b2, "android.permission.SEND_SMS");
                if (a != 0) {
                    i2 = 5;
                } else if (a2 == 0) {
                    int i8 = Build.VERSION.SDK_INT;
                    i2 = ((UserManager) b2.getSystemService("user")).getUserRestrictions().getBoolean("no_sms") ? 6 : isSmsCapable ? 4 : 3;
                } else {
                    i2 = 5;
                }
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                ((cbrh) cbre.f164949b).f178123h = i2 - 2;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) rpr.m34216b().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    i3 = activeNetworkInfo.isRoaming() ? 4 : 3;
                } else {
                    i3 = 2;
                }
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                ((cbrh) cbre.f164949b).f178122g = cbrf.m128128a(i3);
                int i9 = Build.VERSION.SDK_INT;
                int activeSubscriptionInfoCount = SubscriptionManager.from(rpr.m34216b()).getActiveSubscriptionInfoCount();
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                ((cbrh) cbre.f164949b).f178126k = activeSubscriptionInfoCount;
                int i10 = Build.VERSION.SDK_INT;
                int activeSubscriptionInfoCountMax = SubscriptionManager.from(rpr.m34216b()).getActiveSubscriptionInfoCountMax();
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                ((cbrh) cbre.f164949b).f178127l = activeSubscriptionInfoCountMax;
                int i11 = !ted.mo26421a() ? 3 : 4;
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                ((cbrh) cbre.f164949b).f178124i = i11 - 2;
                int i12 = C1133kh.m17835a(rpr.m34216b(), "android.permission.SEND_SMS_NO_CONFIRMATION") != 0 ? 3 : 4;
                if (cbre.f164950c) {
                    cbre.mo74035c();
                    cbre.f164950c = false;
                }
                ((cbrh) cbre.f164949b).f178125j = i12 - 2;
                if (cdft.f180703a.mo6606a().mo77440a()) {
                    int i13 = Build.VERSION.SDK_INT;
                    String str6 = ted.mo26423c() == 1 ? (String) bmxu.m108565a(ted.f45728b.getImei(), "") : ted.mo26423c() == 2 ? (String) bmxu.m108565a(ted.f45728b.getMeid(), "") : null;
                    if (cbre.f164950c) {
                        cbre.mo74035c();
                        cbre.f164950c = false;
                    }
                    str6.getClass();
                    ((cbrh) cbre.f164949b).f178129n = str6;
                }
                if (cdft.f180703a.mo6606a().mo77442c()) {
                    int i14 = Build.VERSION.SDK_INT;
                    ServiceState serviceState = ted.f45728b.getServiceState();
                    if (serviceState != null) {
                        int state = serviceState.getState();
                        if (state == 0) {
                            if (cbre.f164950c) {
                                cbre.mo74035c();
                                cbre.f164950c = false;
                            }
                            ((cbrh) cbre.f164949b).f178130o = cbrg.m128130a(3);
                        } else if (state == 1) {
                            if (cbre.f164950c) {
                                cbre.mo74035c();
                                cbre.f164950c = false;
                            }
                            ((cbrh) cbre.f164949b).f178130o = cbrg.m128130a(4);
                        } else if (state == 2) {
                            if (cbre.f164950c) {
                                cbre.mo74035c();
                                cbre.f164950c = false;
                            }
                            ((cbrh) cbre.f164949b).f178130o = cbrg.m128130a(5);
                        } else if (state == 3) {
                            if (cbre.f164950c) {
                                cbre.mo74035c();
                                cbre.f164950c = false;
                            }
                            ((cbrh) cbre.f164949b).f178130o = cbrg.m128130a(6);
                        }
                    }
                }
                if (cdft.f180703a.mo6606a().mo77443d()) {
                    int i15 = Build.VERSION.SDK_INT;
                    boolean isEmbedded = ted.f45729c.isEmbedded();
                    if (cbre.f164950c) {
                        cbre.mo74035c();
                        cbre.f164950c = false;
                    }
                    ((cbrh) cbre.f164949b).f178128m = isEmbedded;
                }
                pair = new Pair(b, (cbrh) cbre.mo74062i());
            }
            if (pair != null) {
                hashMap.put((String) pair.first, (cbrh) pair.second);
            }
        }
        String string = szq.m36667a(context).f45525b.getString("inactive_sims", null);
        if (!TextUtils.isEmpty(string)) {
            bnhe = bnhe.m109413a(bnmt.m109799a(bmyx.m108640a(',').mo66919b(':').mo66915a(string), szp.f45522a));
        } else {
            bnhe = bnoj.f131912b;
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str7 = (String) entry.getKey();
            cbrh cbrh = (cbrh) entry.getValue();
            bxvd bxvd = (bxvd) cbrh.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) cbrh);
            cbre cbre2 = (cbre) bxvd;
            if (cbre2 != null) {
                cbrd cbrd3 = ((cbrh) cbre2.f164949b).f178120e;
                if (cbrd3 == null) {
                    cbrd3 = cbrd.f178108e;
                }
                if (cbrd3.f178111b.isEmpty()) {
                    cbrd cbrd4 = ((cbrh) cbre2.f164949b).f178120e;
                    if (cbrd4 == null) {
                        cbrd4 = cbrd.f178108e;
                    }
                    if (cbrd4.f178110a.isEmpty()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (bnhe.containsKey(str7)) {
                            j = ((Long) bnhe.get(str7)).longValue();
                        } else {
                            j = 1 + currentTimeMillis;
                        }
                        hashMap2.put(str7, Long.valueOf(j));
                        cbrd cbrd5 = ((cbrh) cbre2.f164949b).f178120e;
                        if (cbrd5 == null) {
                            cbrd5 = cbrd.f178108e;
                        }
                        bxvd bxvd2 = (bxvd) cbrd5.mo74142c(5);
                        bxvd2.mo73625a((GeneratedMessageLite) cbrd5);
                        int i16 = (int) (currentTimeMillis - j);
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        ((cbrd) bxvd2.f164949b).f178113d = i16;
                        if (cbre2.f164950c) {
                            cbre2.mo74035c();
                            cbre2.f164950c = false;
                        }
                        cbrd cbrd6 = (cbrd) bxvd2.mo74062i();
                        cbrh cbrh2 = cbrh.f178114t;
                        cbrd6.getClass();
                        ((cbrh) cbre2.f164949b).f178120e = cbrd6;
                    }
                }
            }
            entry.setValue((cbrh) cbre2.mo74062i());
        }
        szq a3 = szq.m36667a(context);
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append((String) entry2.getKey());
            sb.append(":");
            sb.append(entry2.getValue());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        SharedPreferences.Editor edit = a3.f45525b.edit();
        edit.putString("inactive_sims", sb.toString());
        edit.apply();
        tdx2.f45710c = hashMap;
        return hashMap;
    }

    /* renamed from: a */
    public static synchronized tec m36805a(Context context, tdx tdx) {
        tec tec;
        synchronized (tec.class) {
            tec = (tec) f45722e.get();
            if (tec == null) {
                tec = new tec(context, tdx);
                f45722e = new WeakReference(tec);
            }
        }
        return tec;
    }

    /* renamed from: a */
    public final List mo26418a(tdx tdx, Context context) {
        ArrayList arrayList = new ArrayList();
        teb a = teb.m36800a(context);
        int i = Build.VERSION.SDK_INT;
        if (this.f45724c) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String subscriberId = telephonyManager.getSubscriberId();
            if (!TextUtils.isEmpty(subscriberId)) {
                arrayList.add(Pair.create(subscriberId.toLowerCase(Locale.US), a.mo26417a(tdx, telephonyManager.getLine1Number(), a.mo26416a())));
            } else {
                this.f45723b.mo26407a(tdx, 15, 42);
            }
        } else {
            bnre i2 = this.f45725d.listIterator();
            while (i2.hasNext()) {
                ted ted = (ted) i2.next();
                String b = ted.mo26422b();
                String d = ted.mo26424d();
                if (!TextUtils.isEmpty(b)) {
                    arrayList.add(Pair.create(b.toLowerCase(Locale.US), a.mo26417a(tdx, ted.f45729c.getNumber(), teb.m36799a(d))));
                } else {
                    this.f45723b.mo26407a(tdx, 15, 42);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Map mo26419a() {
        HashMap hashMap = new HashMap();
        int i = Build.VERSION.SDK_INT;
        if (this.f45724c) {
            return null;
        }
        bnre i2 = this.f45725d.listIterator();
        while (i2.hasNext()) {
            ted ted = (ted) i2.next();
            hashMap.put(ted.mo26422b(), Integer.valueOf(ted.f45729c.getSubscriptionId()));
        }
        return hashMap;
    }
}
