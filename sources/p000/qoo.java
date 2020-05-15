package p000;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.UserHandle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.container.FileApkIntentOperation;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: qoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qoo extends qmh {

    /* renamed from: d */
    private static ConnectivityManager f41880d = null;

    /* renamed from: e */
    private static volatile qoo f41881e = null;

    /* renamed from: a */
    private final Context f41882a;

    /* renamed from: b */
    private final enc f41883b;

    /* renamed from: c */
    private final qog f41884c;

    /* renamed from: f */
    private final emp f41885f;

    public qoo(Context context, emp emp, enc enc, qog qog) {
        this.f41882a = context;
        this.f41885f = emp;
        this.f41883b = enc;
        this.f41884c = qog;
    }

    /* renamed from: a */
    public static qoo m32581a(Context context) {
        qoo qoo = f41881e;
        if (qoo == null) {
            synchronized (qoo.class) {
                qoo = f41881e;
                if (qoo == null) {
                    qmg qmg = new qmg(dgv.m8427a(context).f12990a);
                    qog b = qog.m32551b(qmg);
                    qon qon = new qon(cdjh.f180979a.mo6606a().mo77735O(), qlp.m32393a());
                    qoo qoo2 = new qoo(qmg, new emp(emx.m10741a(qmg, b, qon)), emx.m10741a(qmg, b, qon), b);
                    f41881e = qoo2;
                    qoo = qoo2;
                }
            }
        }
        return qoo;
    }

    /* renamed from: b */
    public static boolean m32583b(Context context) {
        if (f41880d == null) {
            synchronized (qoo.class) {
                if (f41880d == null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    f41880d = connectivityManager;
                    if (connectivityManager == null) {
                        Log.e("ZappDownloader", "Failed to get connectivity manager");
                        return false;
                    }
                }
            }
        }
        return C1185me.m19630a(f41880d);
    }

    /* renamed from: b */
    public final synchronized void mo24174b() {
        qog qog = this.f41884c;
        List<qoi> a = qog.f41841e.mo24160a();
        long z = cdjh.f180979a.mo6606a().mo77761z();
        for (qoi qoi : a) {
            if (qoi.f41852e == 2 && ((long) qoi.f41854g) < z && !qog.f41837a.contains(Long.valueOf(qoi.f41849b)) && qog.f41841e.mo24167b(qoi.f41849b)) {
                qog.mo24159a(qoi.f41849b, qoi.f41850c, qoi.f41851d, qoi.f41853f);
            }
        }
    }

    /* renamed from: a */
    private final boolean m32582a(String str, String str2) {
        File file;
        emp emp = this.f41885f;
        try {
            Bundle b = emp.m10680b(str, str2);
            b.putBoolean("ingest", true);
            String string = emp.f15302a.mo10301a(b).getString("file_path");
            if (string != null) {
                file = new File(string);
            } else {
                emp.mo10289c(str, str2);
                file = null;
            }
            if (file == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
                sb.append("Zapp ingestion failed for module ");
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                Log.e("ZappDownloader", sb.toString());
                return false;
            } else if (!qnd.m32471a(this.f41882a).mo24122a(str, str2, file)) {
                return false;
            } else {
                this.f41885f.mo10289c(str, str2);
                return true;
            }
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071 A[Catch:{ RemoteException -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074 A[Catch:{ RemoteException -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d A[Catch:{ RemoteException -> 0x01af }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e A[Catch:{ RemoteException -> 0x01af }] */
    /* renamed from: a */
    public final synchronized int mo24091a(bnic bnic) {
        boolean z;
        boolean z2;
        String str;
        emo emo;
        synchronized (this) {
            Collection<qnc> a = qnd.m32471a(this.f41882a).mo24118a(bnic);
            if (a == null) {
                return 2;
            }
            ArrayList<emo> arrayList = new ArrayList(a.size());
            boolean g = cdjh.f180979a.mo6606a().mo77742g();
            boolean z3 = false;
            if (g) {
                z = m32583b(this.f41882a);
                StringBuilder sb = new StringBuilder(32);
                sb.append("active network is metered: ");
                sb.append(z);
                sb.toString();
            } else {
                z = false;
            }
            int i = 0;
            boolean z4 = false;
            for (qnc qnc : a) {
                int a2 = this.f41885f.mo10288a(qnc.f41759a, qnc.f41760b);
                if (a2 != 6) {
                    if (a2 != 5) {
                        if (g) {
                            z2 = true;
                        } else {
                            if (z) {
                                if (!qnc.f41761c) {
                                    qlp.m32393a().mo8861a(this.f41882a, 78, qnc.toString());
                                    z3 = true;
                                    z4 = true;
                                }
                            }
                            z2 = qnc.f41761c;
                        }
                        str = qnc.f41762d;
                        String str2 = qnc.f41763e;
                        if (str == null) {
                            if (str2 != null) {
                                String str3 = qnc.f41759a;
                                String str4 = qnc.f41760b;
                                String string = this.f41882a.getString(C0126R.string.zapp_download_manager_notification_title);
                                String string2 = this.f41882a.getString(C0126R.string.zapp_download_manager_notification_description);
                                Log.i("DynamicModuleDownloader", str2.length() == 0 ? new String("Patch being requested ") : "Patch being requested ".concat(str2));
                                emo = new emo(str3, str4, string, string2, z2, str, str2);
                                arrayList.add(emo);
                                i++;
                                z3 = true;
                            }
                        }
                        emo = new emo(qnc.f41759a, qnc.f41760b, this.f41882a.getString(C0126R.string.zapp_download_manager_notification_title), this.f41882a.getString(C0126R.string.zapp_download_manager_notification_description), z2, null, null);
                        arrayList.add(emo);
                        i++;
                        z3 = true;
                    }
                }
                if (m32582a(qnc.f41759a, qnc.f41760b)) {
                }
                if (g) {
                }
                str = qnc.f41762d;
                String str22 = qnc.f41763e;
                if (str == null) {
                }
                emo = new emo(qnc.f41759a, qnc.f41760b, this.f41882a.getString(C0126R.string.zapp_download_manager_notification_title), this.f41882a.getString(C0126R.string.zapp_download_manager_notification_description), z2, null, null);
                arrayList.add(emo);
                i++;
                z3 = true;
            }
            if (!z3) {
                if (bnic.isEmpty()) {
                    mo24093a();
                }
            } else if (i != 0) {
                emp emp = this.f41885f;
                boolean isEmpty = bnic.isEmpty();
                try {
                    enc enc = emp.f15302a;
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    for (emo emo2 : arrayList) {
                        Bundle bundle = new Bundle();
                        bundle.putString("name", emo2.f15295a);
                        String str5 = emo2.f15296b;
                        if (str5 != null) {
                            bundle.putString("version_code", str5);
                        }
                        String str6 = emo2.f15297c;
                        if (str6 != null) {
                            bundle.putString("notification_title", str6);
                        }
                        String str7 = emo2.f15298d;
                        if (str7 != null) {
                            bundle.putString("notification_description", str7);
                        }
                        if (emo2.f15299e) {
                            bundle.putBoolean("metered", true);
                        }
                        String str8 = emo2.f15300f;
                        if (str8 != null) {
                            bundle.putString("existing_version_code", str8);
                        }
                        String str9 = emo2.f15301g;
                        if (str9 != null) {
                            bundle.putString("patch_module_base_external_path", str9);
                        }
                        arrayList2.add(bundle);
                    }
                    if (!enc.mo10303a(arrayList2, isEmpty).getBoolean("download_successful")) {
                        StringBuilder sb2 = new StringBuilder();
                        for (qnc qnc2 : a) {
                            sb2.append(qnc2.toString());
                            sb2.append(",");
                        }
                        qlp.m32393a().mo8861a(this.f41882a, 31, sb2.toString());
                        return 2;
                    }
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
            return z4 ? 3 : 1;
        }
    }

    /* renamed from: a */
    public final synchronized void mo24093a() {
        try {
            enc enc = this.f41885f.f15302a;
            new Bundle();
            enc.mo10308c();
            qog qog = this.f41884c;
            qog.f41837a.clear();
            qog.f41841e.mo24166b();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015b, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo24173a(long j, bxvd bxvd) {
        UserHandle userForSerialNumber;
        try {
            Bundle a = this.f41883b.mo10300a(j);
            String string = a.getString("com.google.android.finsky.zapp.MODULE_NAME");
            String string2 = a.getString("com.google.android.finsky.zapp.MODULE_VERSION");
            if (string != null && string2 != null) {
                boolean z = false;
                int i = 0;
                z = false;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpuj bpuj = (bpuj) bxvd.f164949b;
                bpuj bpuj2 = bpuj.f139241k;
                string.getClass();
                int i2 = bpuj.f139243a | 1;
                bpuj.f139243a = i2;
                bpuj.f139244b = string;
                string2.getClass();
                bpuj.f139243a = i2 | 2;
                bpuj.f139245c = string2;
                qlp.m32393a();
                Context context = this.f41882a;
                bpuj bpuj3 = (bpuj) bxvd.mo74062i();
                bxvd da = bpvf.f139321t.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpvf bpvf = (bpvf) da.f164949b;
                bpuj3.getClass();
                bpvf.f139339q = bpuj3;
                bpvf.f139323a |= 1024;
                FileApkIntentOperation.m22393a(context, 23, ((bpvf) da.mo74062i()).serializeToBytes());
                int a2 = this.f41885f.mo10288a(string, string2);
                StringBuilder sb = new StringBuilder(string.length() + 27 + string2.length());
                sb.append("Module ");
                sb.append(string);
                sb.append(":");
                sb.append(string2);
                sb.append(" status ");
                sb.append(a2);
                sb.toString();
                if (a2 == 6 && m32582a(string, string2)) {
                    qnv a3 = qnv.m32530a(this.f41882a);
                    if (cdjh.m133552b() || cdjh.m133558h()) {
                        ArrayList arrayList = new ArrayList();
                        if (a3.f41804e && a3.f41805f != null) {
                            synchronized (a3) {
                                for (Map.Entry entry : Collections.unmodifiableMap(a3.mo24142d().f41822a).entrySet()) {
                                    if (!(((Long) entry.getKey()).longValue() == a3.f41806g || (userForSerialNumber = a3.f41805f.getUserForSerialNumber(((Long) entry.getKey()).longValue())) == null)) {
                                        arrayList.add(userForSerialNumber);
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Intent intent = new Intent("com.google.android.gms.chimera.container.ACTION_SECONDARY_USER_RECHECK").setPackage(a3.f12990a.getPackageName());
                            int size = arrayList.size();
                            for (i++; i < size; i++) {
                                a3.f12990a.sendBroadcastAsUser(intent, (UserHandle) arrayList.get(i));
                            }
                        }
                    }
                    qnd.m32471a(this.f41882a).mo24126f();
                    z = true;
                }
                qln.m32379a(this.f41882a).mo24086a(z);
            }
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("onDownloadComplete failure: ");
            sb2.append(valueOf);
            Log.e("ZappDownloader", sb2.toString());
        }
    }
}
