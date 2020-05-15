package p000;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SyncAdapterType;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: aytv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aytv {

    /* renamed from: a */
    public final Context f98479a;

    /* renamed from: b */
    public final aytt f98480b;

    public aytv() {
    }

    public aytv(Context context, aytt aytt) {
        this.f98479a = context;
        this.f98480b = aytt;
    }

    /* renamed from: a */
    public static boolean m84811a(Context context, String str) {
        AuthenticatorDescription authenticatorDescription;
        aytu aytu;
        SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
        AuthenticatorDescription[] authenticatorTypes = AccountManager.get(context).getAuthenticatorTypes();
        HashSet hashSet = new HashSet();
        for (SyncAdapterType syncAdapterType : syncAdapterTypes) {
            if ("com.android.contacts".equals(syncAdapterType.authority)) {
                hashSet.add(syncAdapterType.accountType);
            }
        }
        HashMap hashMap = new HashMap();
        for (AuthenticatorDescription authenticatorDescription2 : authenticatorTypes) {
            if (hashSet.contains(authenticatorDescription2.type)) {
                hashMap.put(authenticatorDescription2.type, authenticatorDescription2);
            }
        }
        aytv aytv = new aytv(context, new aytt(hashMap));
        if (str == null || "com.google".equals(str) || (authenticatorDescription = (AuthenticatorDescription) aytv.f98480b.f98472a.get(str)) == null) {
            return false;
        }
        try {
            String str2 = authenticatorDescription.packageName;
            aytu = new aytu(aytv.f98479a);
            aytu.mo54433a();
            PackageManager packageManager = aytu.f98474b.getPackageManager();
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.content.SyncAdapter").setPackage(str2), 132);
            if (queryIntentServices != null) {
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null) {
                        for (String str3 : aytu.f98473a) {
                            XmlResourceParser loadXmlMetaData = serviceInfo.loadXmlMetaData(packageManager, str3);
                            if (loadXmlMetaData != null) {
                                aytu.f98475c = loadXmlMetaData;
                            }
                        }
                    }
                }
            }
            aytu.mo54433a();
            boolean z = true;
            if (aytu.f98475c != null) {
                while (true) {
                    int next = aytu.f98475c.next();
                    if (next != 2) {
                        if (next == 1) {
                            break;
                        }
                    } else {
                        String name = aytu.f98475c.getName();
                        if (!"ContactsAccountType".equals(name)) {
                            if ("ContactsSource".equals(name)) {
                            }
                        }
                        aytu.f98476d = true;
                        int depth = aytu.f98475c.getDepth();
                        while (true) {
                            int next2 = aytu.f98475c.next();
                            if (next2 != 3 || aytu.f98475c.getDepth() > depth) {
                                if (next2 == 1) {
                                    break;
                                } else if (next2 == 2 && aytu.f98475c.getDepth() == depth + 1 && "EditSchema".equals(aytu.f98475c.getName())) {
                                    aytu.f98477e = true;
                                }
                            } else {
                                break;
                            }
                        }
                        aytu.f98478f = true;
                    }
                }
            }
            if (aytu.f98475c == null || !aytu.f98478f || !aytu.f98476d || aytu.f98477e) {
                z = false;
            }
            aytu.close();
            return z;
        } catch (Exception e) {
            Log.e("ReadOnlyPred", str.length() == 0 ? new String("Failed to detect readonly state for ") : "Failed to detect readonly state for ".concat(str), e);
            return false;
        } catch (Throwable th) {
            aytu.close();
            throw th;
        }
    }
}
