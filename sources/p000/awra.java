package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: awra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awra {

    /* renamed from: a */
    final C1231nx f94886a = new C1231nx(10);

    /* renamed from: b */
    private final Context f94887b;

    /* renamed from: b */
    private static void m80743b(String str) {
        if (!((Boolean) awie.f94421q.mo58455c()).booleanValue()) {
            Log.e("AndroidAppIdCache", str);
            return;
        }
        throw new RuntimeException(str);
    }

    /* renamed from: a */
    public final btrn mo52470a(String str) {
        btrn btrn;
        if (str != null) {
            long currentTimeMillis = System.currentTimeMillis();
            awqz awqz = (awqz) this.f94886a.mo15546a(str);
            try {
                PackageInfo b = svr.m36484b(this.f94887b).mo26176b(str, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC);
                if (!(awqz == null || b.signatures == null || awqz.f94883a < -300000 + currentTimeMillis)) {
                    int length = awqz.f94885c.length;
                    int length2 = b.signatures.length;
                    if (length == b.signatures.length) {
                        int i = 0;
                        while (i < length) {
                            int i2 = 0;
                            while (i2 < length2 && !awqz.f94885c[i].equals(b.signatures[i2])) {
                                i2++;
                            }
                            if (i2 != length2) {
                                i++;
                            }
                        }
                        return awqz.f94884b;
                    }
                }
                if (b.applicationInfo != null) {
                    svr.m36484b(this.f94887b).mo26178b(b.applicationInfo.uid);
                }
                bxvd da = btrn.f150118h.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btrn) da.f164949b).f150121b = 1;
                int i3 = b.versionCode;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btrn) da.f164949b).f150123d = i3;
                if (!TextUtils.isEmpty(b.packageName)) {
                    String str2 = b.packageName;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    str2.getClass();
                    ((btrn) da.f164949b).f150120a = str2;
                }
                if (b.signatures == null || b.signatures.length == 0) {
                    String valueOf = String.valueOf(b.packageName);
                    m80743b(valueOf.length() == 0 ? new String("No package certificates found for ") : "No package certificates found for ".concat(valueOf));
                    btrn = null;
                } else {
                    for (Signature signature : b.signatures) {
                        String a = bjyt.m104926a(signature, "SHA-1");
                        if (TextUtils.isEmpty(a)) {
                            String str3 = b.packageName;
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 84);
                            sb.append("At least one of the package certificates obtained from PackageManagerfor ");
                            sb.append(str3);
                            sb.append(" is invalid");
                            Log.w("AndroidAppIdCache", sb.toString());
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btrn btrn2 = (btrn) da.f164949b;
                            a.getClass();
                            if (!btrn2.f150122c.mo73666a()) {
                                btrn2.f150122c = bxvk.m124021a(btrn2.f150122c);
                            }
                            btrn2.f150122c.add(a);
                        }
                    }
                    if (((btrn) da.f164949b).f150122c.size() != 0) {
                        int a2 = sqr.m35997a(b);
                        if (a2 == -1) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((btrn) da.f164949b).f150126g = 0;
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((btrn) da.f164949b).f150126g = a2;
                        }
                        Bundle bundle = b.applicationInfo.metaData;
                        if (bundle != null) {
                            TreeMap treeMap = new TreeMap();
                            for (String str4 : bundle.keySet()) {
                                if (str4 != null && str4.startsWith("com.google.android.gms.wallet.")) {
                                    Object obj = bundle.get(str4);
                                    treeMap.put(str4, obj == null ? "" : obj.toString());
                                }
                            }
                            for (Map.Entry entry : treeMap.entrySet()) {
                                bxvd da2 = btrm.f150114c.mo74144da();
                                String str5 = (String) entry.getKey();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                str5.getClass();
                                ((btrm) da2.f164949b).f150116a = str5;
                                String str6 = (String) entry.getValue();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                str6.getClass();
                                ((btrm) da2.f164949b).f150117b = str6;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                btrn btrn3 = (btrn) da.f164949b;
                                btrm btrm = (btrm) da2.mo74062i();
                                btrm.getClass();
                                if (!btrn3.f150125f.mo73666a()) {
                                    btrn3.f150125f = bxvk.m124021a(btrn3.f150125f);
                                }
                                btrn3.f150125f.add(btrm);
                            }
                        }
                        btrn = (btrn) da.mo74062i();
                    } else {
                        String valueOf2 = String.valueOf(b.packageName);
                        m80743b(valueOf2.length() == 0 ? new String("No valid package certificate found for ") : "No valid package certificate found for ".concat(valueOf2));
                        btrn = null;
                    }
                }
                if (btrn == null) {
                    Log.e("AndroidAppIdCache", str.length() == 0 ? new String("Unable to construct AndroidAppId for packageName=") : "Unable to construct AndroidAppId for packageName=".concat(str));
                    return null;
                }
                awqz awqz2 = new awqz(currentTimeMillis, btrn, b.signatures);
                this.f94886a.mo15547a(str, awqz2);
                return awqz2.f94884b;
            } catch (PackageManager.NameNotFoundException e) {
                m80743b(str.length() == 0 ? new String("Failed to get package info from PackageManager for ") : "Failed to get package info from PackageManager for ".concat(str));
                return null;
            }
        } else {
            m80743b("getAndroidAppId called with null packageName");
            return null;
        }
    }

    public awra(Context context) {
        this.f94887b = context.getApplicationContext();
    }
}
