package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.ServiceType;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aqzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqzy {

    /* renamed from: b */
    public static final /* synthetic */ int f87183b = 0;

    /* renamed from: c */
    private static final sek f87184c = ascp.m73787a("D2D", "EsimController");

    /* renamed from: a */
    public final SharedPreferences f87185a;

    /* renamed from: d */
    private final Context f87186d;

    public aqzy(Context context) {
        this.f87186d = context;
        this.f87185a = context.getSharedPreferences("SmartDevice.EsimController", 0);
    }

    /* renamed from: a */
    public final aucb mo48314a() {
        String string = this.f87185a.getString("esimActivationPayload", null);
        if (string == null) {
            return aucu.m76778a((Object) new ArrayList());
        }
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                EsimActivationPayload esimActivationPayload = new EsimActivationPayload();
                esimActivationPayload.mo59187e(jSONArray.getJSONObject(i).toString().getBytes("UTF-8"));
                arrayList.add(esimActivationPayload);
            }
            return aucu.m76778a((Object) arrayList);
        } catch (asbx | UnsupportedEncodingException | JSONException e) {
            return aucu.m76777a(e);
        }
    }

    /* renamed from: a */
    public final aucb mo48315a(EsimActivationInfo esimActivationInfo) {
        aucb aucb;
        boolean z;
        int i = Build.VERSION.SDK_INT;
        List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) this.f87186d.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
        ArrayList arrayList = new ArrayList(activeSubscriptionInfoList.size());
        int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
            if (subscriptionInfo.isEmbedded()) {
                arrayList.add(subscriptionInfo);
                if (subscriptionInfo.getSubscriptionId() == defaultDataSubscriptionId) {
                    defaultDataSubscriptionId = -1;
                }
            }
        }
        if (defaultDataSubscriptionId != -1) {
            for (SubscriptionInfo subscriptionInfo2 : activeSubscriptionInfoList) {
                if (subscriptionInfo2.getSubscriptionId() == defaultDataSubscriptionId) {
                    arrayList.add(subscriptionInfo2);
                }
            }
        }
        for (SubscriptionInfo subscriptionInfo3 : activeSubscriptionInfoList) {
            if (!subscriptionInfo3.isEmbedded() && subscriptionInfo3.getSubscriptionId() != defaultDataSubscriptionId) {
                arrayList.add(subscriptionInfo3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        agzp agzp = new agzp(this.f87186d);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            SubscriptionInfo subscriptionInfo4 = (SubscriptionInfo) arrayList.get(i2);
            try {
                long parseLong = Long.parseLong(esimActivationInfo.f107890e);
                aqzx aqzx = new aqzx();
                TelephonyManager createForSubscriptionId = ((TelephonyManager) this.f87186d.getSystemService(TelephonyManager.class)).createForSubscriptionId(subscriptionInfo4.getSubscriptionId());
                ahak ahak = new ahak();
                ahak.f66941a.f80346a = "smartDevice";
                ahak.f66941a.f80348c = Long.valueOf(parseLong);
                ServiceType serviceType = new ahay().f66948a;
                serviceType.f80384a = 6;
                ahak.f66941a.f80347b = serviceType;
                AuthType authType = new ahag().f66939a;
                authType.f80342a = 2;
                ahak.f66941a.f80349d = authType;
                String subscriberId = createForSubscriptionId.getSubscriberId();
                CheckAuthStatusRequest checkAuthStatusRequest = ahak.f66941a;
                checkAuthStatusRequest.f80350e = subscriberId;
                sdo.m34975b(true, "Need a non-null request.");
                if (checkAuthStatusRequest.f80346a != null) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34975b(z, "Need a non-null request_id.");
                roz b = rpa.m34196b();
                b.f43472a = new agzi(checkAuthStatusRequest);
                b.f43473b = new Feature[]{agzg.f66904a};
                aucb = agzp.mo24732b(b.mo24977a()).mo50364a(new aqzw(aqzx, agzp)).mo50364a(new aqzv(aqzx, esimActivationInfo, createForSubscriptionId, agzp)).mo50364a(new aqzu(aqzx, esimActivationInfo, subscriptionInfo4));
            } catch (NumberFormatException e) {
                aucb = aucu.m76777a((Exception) e);
            }
            arrayList2.add(aucb);
        }
        return aucu.m76788c(arrayList2).mo50363a(aqzt.f87171a);
    }

    /* renamed from: a */
    public final void mo48316a(ArrayList arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(((EsimActivationPayload) it.next()).toString()));
            }
            this.f87185a.edit().putString("esimActivationPayload", jSONArray.toString()).apply();
        } catch (JSONException e) {
            sek sek = f87184c;
            String valueOf = String.valueOf(arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Invalid esimActivationPayloads: ");
            sb.append(valueOf);
            sek.mo25418e(sb.toString(), new Object[0]);
        }
    }
}
