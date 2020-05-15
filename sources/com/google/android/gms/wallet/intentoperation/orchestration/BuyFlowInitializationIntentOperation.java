package com.google.android.gms.wallet.intentoperation.orchestration;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BuyFlowInitializationIntentOperation extends IntentOperation {

    /* renamed from: a */
    awtz f110275a;

    /* renamed from: b */
    awew f110276b;

    /* renamed from: c */
    private long f110277c = -1;

    public BuyFlowInitializationIntentOperation() {
    }

    /* renamed from: a */
    private final void m94036a(BuyFlowConfig buyFlowConfig, InitializeBuyFlowRequest initializeBuyFlowRequest) {
        Intent registerReceiver;
        int intExtra;
        BuyFlowConfig buyFlowConfig2 = buyFlowConfig;
        InitializeBuyFlowRequest initializeBuyFlowRequest2 = initializeBuyFlowRequest;
        sdo.m34966a(initializeBuyFlowRequest2.f110165b, "PurchaseContext bytes cannot be null");
        ArrayList a = bjvn.m104714a(getApplicationContext());
        long j = this.f110277c;
        if ((j == -1 || j + ((Long) awih.f94440a.mo58455c()).longValue() <= System.currentTimeMillis()) && !new ActivityManager.MemoryInfo().lowMemory) {
            int intValue = ((Integer) awih.f94441b.mo58455c()).intValue();
            if (!(intValue < 0 || intValue > 100 || (registerReceiver = getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || (intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(intExtra2 == -1 || intExtra3 == -1)) {
                    double d = (double) intExtra2;
                    double d2 = (double) intExtra3;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    if (((int) Math.floor((d / d2) * 100.0d)) < intValue) {
                        return;
                    }
                }
            }
            if (awfx.m79881a(buyFlowConfig2.f110418b.f110407b)) {
                String a2 = bjyw.m104936a(this);
                byte[][] bArr = initializeBuyFlowRequest2.f110165b;
                int length = bArr.length;
                int i = 0;
                while (i < length) {
                    if (this.f110276b.mo52086a(bArr[i], buyFlowConfig2, a2, a) == null) {
                        try {
                            ServerResponse a3 = this.f110275a.mo52577a(buyFlowConfig2, initializeBuyFlowRequest2);
                            if (a3.mo60050c() == 38) {
                                blxz blxz = (blxz) a3.mo60052e();
                                boolean z = true;
                                if ((blxz.f128178a & 1) == 0 && blxz.f128181d.size() != 0) {
                                    Iterator it = blxz.f128181d.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if ((((blxs) it.next()).f128132a & 4) == 0) {
                                                this.f110277c = System.currentTimeMillis();
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    awew awew = this.f110276b;
                                    String a4 = bjyw.m104936a(this);
                                    ApplicationParameters applicationParameters = buyFlowConfig2.f110418b;
                                    String str = applicationParameters.f110407b.name;
                                    int i2 = applicationParameters.f110406a;
                                    String str2 = buyFlowConfig2.f110419c;
                                    sdo.m34966a(blxz, "Cannot cache null response");
                                    if (blxz.f128181d.size() <= 0) {
                                        z = false;
                                    }
                                    sdo.m34975b(z, "No templates to cache");
                                    HashMap hashMap = new HashMap();
                                    for (blxs blxs : blxz.f128181d) {
                                        blxs blxs2 = blxs;
                                        HashMap hashMap2 = hashMap;
                                        String a5 = awew.m79827a(blxs.f128133b.mo73780k(), str, i2, str2, a4, a);
                                        ArrayList arrayList = (ArrayList) hashMap2.get(a5);
                                        if (arrayList == null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(blxs2);
                                            hashMap2.put(a5, arrayList2);
                                            hashMap = hashMap2;
                                        } else if (((blxs) arrayList.get(0)).f128138g != blxs2.f128138g) {
                                            Log.w("InitTemplateCache", "Detected templates with the same purchase context but different expiration dates, ignoring!");
                                            hashMap = hashMap2;
                                        } else {
                                            arrayList.add(blxs2);
                                            hashMap = hashMap2;
                                        }
                                    }
                                    SharedPreferences.Editor edit = awew.f94251a.edit();
                                    for (Map.Entry entry : hashMap.entrySet()) {
                                        String str3 = (String) entry.getKey();
                                        ArrayList arrayList3 = (ArrayList) entry.getValue();
                                        bxvd bxvd = (bxvd) blxz.mo74142c(5);
                                        bxvd.mo73625a((bxvk) blxz);
                                        int size = arrayList3.size();
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        blxz blxz2 = blxz.f128176e;
                                        ((blxz) bxvd.f164949b).f128181d = bxvk.m124030de();
                                        long currentTimeMillis = System.currentTimeMillis() + ((blxs) arrayList3.get(0)).f128138g;
                                        for (int i3 = 0; i3 < size; i3++) {
                                            blxs blxs3 = (blxs) arrayList3.get(i3);
                                            bxvd bxvd2 = (bxvd) blxs3.mo74142c(5);
                                            bxvd2.mo73625a((bxvk) blxs3);
                                            if (bxvd2.f164950c) {
                                                bxvd2.mo74035c();
                                                bxvd2.f164950c = false;
                                            }
                                            blxs blxs4 = (blxs) bxvd2.f164949b;
                                            blxs blxs5 = blxs.f128130j;
                                            blxs4.f128132a |= 16;
                                            blxs4.f128138g = currentTimeMillis;
                                            blxs blxs6 = (blxs) bxvd2.mo74062i();
                                            if (bxvd.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd.f164950c = false;
                                            }
                                            blxz blxz3 = (blxz) bxvd.f164949b;
                                            blxs6.getClass();
                                            if (!blxz3.f128181d.mo73666a()) {
                                                blxz3.f128181d = bxvk.m124021a(blxz3.f128181d);
                                            }
                                            blxz3.f128181d.add(blxs6);
                                        }
                                        edit.putString(str3, bjvp.m104734a(bxvd.mo74062i()));
                                    }
                                    edit.apply();
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (RemoteException e) {
                            Log.e("BuyFlowInitService", "Error when fetching initialize buyflow templates.", e);
                            return;
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final void onCreate() {
        this.f110275a = new awvy(this, new awgj(rpr.m34216b().getRequestQueue()));
        this.f110276b = new awew(getApplicationContext());
    }

    public final void onHandleIntent(Intent intent) {
        boolean z;
        boolean z2;
        boolean z3;
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) sef.m35067a(intent, "BuyFlowInitializationIntentOperation.buyflowConfig", BuyFlowConfig.CREATOR);
        sdo.m34975b(buyFlowConfig != null, "Buy Flow config not specified.");
        boolean booleanExtra = intent.getBooleanExtra("BuyFlowInitializationIntentOperation.refreshBuyflowRequests", false);
        InitializeBuyFlowRequest initializeBuyFlowRequest = (InitializeBuyFlowRequest) sef.m35067a(intent, "BuyFlowInitializationIntentOperation.initializeBuyFlowRequest", InitializeBuyFlowRequest.CREATOR);
        if (!booleanExtra || initializeBuyFlowRequest != null) {
            z = !booleanExtra && initializeBuyFlowRequest != null;
        } else {
            z = true;
        }
        sdo.m34975b(z, "Invalid intent extras");
        if (booleanExtra) {
            awew awew = this.f110276b;
            String str = buyFlowConfig.f110418b.f110407b.name;
            int i = buyFlowConfig.f110418b.f110406a;
            HashSet hashSet = new HashSet();
            for (String str2 : awew.f94251a.getAll().keySet()) {
                if (!"VERSION".equals(str2)) {
                    byab byab = (byab) bjvp.m104732a(str2, (bxxk) byab.f165222h.mo74142c(7));
                    if (byab.f165226c.equals(str) && byab.f165227d == i) {
                        hashSet.add(byab.f165229f);
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                awyb a = BuyFlowConfig.m94176a(buyFlowConfig);
                a.mo52751b((String) it.next());
                a.mo52750a((String) null);
                BuyFlowConfig a2 = a.mo52748a();
                awew awew2 = this.f110276b;
                ApplicationParameters applicationParameters = a2.f110418b;
                String str3 = applicationParameters.f110407b.name;
                int i2 = applicationParameters.f110406a;
                String str4 = a2.f110419c;
                awew2.mo52088a();
                HashMap hashMap = new HashMap();
                Iterator it2 = awew2.mo52087a(str3, i2, str4).iterator();
                while (it2.hasNext()) {
                    byab byab2 = (byab) it2.next();
                    ByteBuffer wrap = ByteBuffer.wrap(byab2.f165225b.mo73780k());
                    if (hashMap.containsKey(wrap)) {
                        z2 = ((Boolean) hashMap.get(wrap)).booleanValue();
                    } else {
                        z2 = true;
                    }
                    blxz a3 = awew2.mo52085a(bjvp.m104734a(byab2));
                    if (a3 == null || a3.f128181d.size() != 1) {
                        z3 = false;
                    } else {
                        z3 = ((blxs) a3.f128181d.get(0)).f128139h;
                    }
                    hashMap.put(wrap, Boolean.valueOf(z3 & z2));
                }
                awew awew3 = this.f110276b;
                int size = hashMap.size();
                byte[][] bArr = new byte[size][];
                int i3 = 0;
                for (ByteBuffer byteBuffer : hashMap.keySet()) {
                    bArr[i3] = m94037a(byteBuffer);
                    i3++;
                }
                ApplicationParameters applicationParameters2 = a2.f110418b;
                String str5 = applicationParameters2.f110407b.name;
                int i4 = applicationParameters2.f110406a;
                String str6 = a2.f110419c;
                SharedPreferences.Editor edit = awew3.f94251a.edit();
                HashSet a4 = awew3.mo52087a(str5, i4, str6);
                for (int i5 = 0; i5 < size; i5++) {
                    byte[] bArr2 = bArr[i5];
                    Iterator it3 = a4.iterator();
                    while (it3.hasNext()) {
                        byab byab3 = (byab) it3.next();
                        if (Arrays.equals(byab3.f165225b.mo73780k(), bArr2)) {
                            edit.remove(bjvp.m104734a(byab3));
                        }
                    }
                }
                edit.apply();
                ArrayList arrayList = new ArrayList();
                for (ByteBuffer byteBuffer2 : hashMap.keySet()) {
                    if (((Boolean) hashMap.get(byteBuffer2)).booleanValue()) {
                        arrayList.add(m94037a(byteBuffer2));
                    }
                }
                byte[][] bArr3 = (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
                if (bArr3.length != 0) {
                    m94036a(a2, new InitializeBuyFlowRequest(bArr3));
                }
            }
            return;
        }
        m94036a(buyFlowConfig, initializeBuyFlowRequest);
    }

    public BuyFlowInitializationIntentOperation(Context context) {
        attachBaseContext(context);
    }

    /* renamed from: a */
    private static byte[] m94037a(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.position(byteBuffer.position() - remaining);
        return bArr;
    }
}
