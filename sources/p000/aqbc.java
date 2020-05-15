package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: aqbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqbc extends aaab {

    /* renamed from: a */
    final int f85530a;

    /* renamed from: b */
    private final apga f85531b;

    /* renamed from: c */
    private final String f85532c;

    /* renamed from: d */
    private final int f85533d;

    /* renamed from: e */
    private final byte[] f85534e;

    /* renamed from: f */
    private final String f85535f;

    /* renamed from: g */
    private final Bundle f85536g;

    static {
        aqbc.class.getSimpleName();
    }

    public aqbc(apga apga, String str, String str2, int i, byte[] bArr, int i2, Bundle bundle) {
        super(45, "pha");
        this.f85531b = apga;
        this.f85535f = str;
        this.f85532c = str2;
        this.f85533d = i;
        this.f85534e = bArr;
        this.f85530a = i2;
        this.f85536g = bundle;
    }

    /* renamed from: a */
    private final void m71279a() {
        m71281b(Status.f30109c);
    }

    /* renamed from: b */
    private final void m71281b(Status status) {
        apga apga = this.f85531b;
        if (apga != null) {
            apga.mo47174b(status, false);
        }
    }

    /* renamed from: a */
    private static final void m71280a(Context context, List list) {
        if (list != null) {
            aqbf a = aqbf.m71285a(context);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Bundle bundle = (Bundle) it.next();
                byte[] byteArray = bundle.getByteArray("digest");
                if (byteArray != null) {
                    aqbe aqbe = new aqbe();
                    aqbe.f85543a = bundle.getString("package_name");
                    aqbe.f85544b = bundle.getString("threat_type");
                    aqbe.f85545c = bundle.getString("description_string");
                    a.mo47727a(byteArray, aqbe);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        Intent intent;
        List<apgr> list;
        JSONObject jSONObject;
        if (apuh.m71028b(context, this.f85532c)) {
            try {
                boolean z = false;
                if (this.f85530a == 1) {
                    byte[] bArr = this.f85534e;
                    String str = this.f85535f;
                    int i = this.f85533d;
                    if (TextUtils.isEmpty(str)) {
                        m71281b(new Status(12001));
                    } else if (bArr != null) {
                        if (i == 1) {
                            String a = apgr.m70245a(bArr);
                            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 30);
                            sb.append("safe.safebrowsing.google.com/");
                            sb.append(a);
                            sb.append("/");
                            list = new apgx(sb.toString()).mo47199a();
                            if (list == null || list.isEmpty()) {
                                m71279a();
                                return;
                            }
                        } else {
                            list = Collections.singletonList(new apgr(bArr));
                        }
                        aqbj.m71299b(context);
                        try {
                            if (aqbj.f85560d.await(60000, TimeUnit.MILLISECONDS)) {
                                if (i == 12) {
                                    aqbo aqbo = aqbj.f85559c;
                                    List<Integer> singletonList = Collections.singletonList(12);
                                    HashSet<Integer> hashSet = new HashSet();
                                    for (Integer num : singletonList) {
                                        int intValue = num.intValue();
                                        bnic bnic = aqbo.f85575b;
                                        Integer valueOf = Integer.valueOf(intValue);
                                        if (bnic.contains(valueOf) && aqbo.f85587n.mo47759a().contains(valueOf)) {
                                            hashSet.add(valueOf);
                                        }
                                    }
                                    if (!hashSet.isEmpty()) {
                                        jSONObject = new JSONObject();
                                        if (aqbo.mo47738b()) {
                                            ArrayList arrayList = new ArrayList();
                                            for (Integer num2 : hashSet) {
                                                int intValue2 = num2.intValue();
                                                aqbk aqbk = (aqbk) aqbo.f85585k.get(intValue2);
                                                if (aqbk != null) {
                                                    for (apgr apgr : list) {
                                                        if (aqbk.mo47730a(apgr)) {
                                                            arrayList.add(Integer.valueOf(intValue2));
                                                        }
                                                    }
                                                }
                                            }
                                            jSONObject = aqde.m71376a(arrayList);
                                        }
                                    } else {
                                        jSONObject = null;
                                    }
                                } else {
                                    jSONObject = aqbj.f85559c.mo47735a(Collections.singletonList(Integer.valueOf(i)), list, str, this.f85532c);
                                }
                                if (jSONObject == null) {
                                    m71281b(new Status(12000));
                                    return;
                                }
                                if (jSONObject.length() != 0) {
                                    z = true;
                                }
                                this.f85531b.mo47174b(Status.f30107a, z);
                                return;
                            }
                            m71279a();
                        } catch (InterruptedException e) {
                            m71279a();
                        }
                    } else {
                        m71279a();
                    }
                } else {
                    int i2 = this.f85533d;
                    if (i2 == 1) {
                        if (cgkt.m145948t()) {
                            Bundle bundle = this.f85536g;
                            if (bundle != null) {
                                m71280a(context, Collections.singletonList(bundle));
                            }
                        }
                        intent = new Intent("com.google.android.gms.safetynet.action.HARMFUL_APP_INSTALLED");
                    } else if (i2 == 3) {
                        intent = new Intent("com.google.android.gms.safetynet.action.HARMFUL_APP_BLOCKED");
                    } else if (i2 == 4) {
                        if (cgkt.m145948t()) {
                            Bundle bundle2 = this.f85536g;
                            if (bundle2 != null) {
                                m71280a(context, bundle2.getParcelableArrayList("harmful_app_bundles"));
                            }
                        }
                        intent = new Intent("com.google.android.gms.safetynet.action.HARMFUL_APPS_FOUND");
                    } else {
                        return;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    PackageManager packageManager = context.getPackageManager();
                    ArrayList<Intent> arrayList2 = new ArrayList();
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers != null) {
                        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                            arrayList2.add(intent2);
                        }
                    }
                    for (Intent intent3 : arrayList2) {
                        context.sendBroadcast(intent3);
                    }
                }
            } catch (RemoteException e2) {
                throw e2;
            } catch (Exception e3) {
                m71279a();
            }
        } else {
            m71279a();
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        m71279a();
    }
}
