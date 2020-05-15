package p000;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.RequestQueue;
import com.google.android.gms.auth.managed.DownloadStatusResponse;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* renamed from: jhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jhl {

    /* renamed from: a */
    public static final sek f22492a = ght.m13171a("AuthManaged", "AuthManagedHelper");

    /* renamed from: b */
    private static jhl f22493b;

    /* renamed from: a */
    public static jhi m16703a(Context context, String str, camd camd, Account account, Bundle bundle, Boolean bool, boolean z, String str2) {
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return new jhi(new Status(21518, "getApplicationInfo returns null."), null);
            }
            if (!applicationInfo.enabled) {
                try {
                    packageManager.setApplicationEnabledSetting(str, 1, 1);
                } catch (SecurityException e) {
                    return new jhi(new Status(21519, "Failed to enable device management app."), null);
                }
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return new jhi(new Status(21520, "Failed to create launch intent."), null);
            }
            Bundle bundle2 = new Bundle();
            if (account != null) {
                bundle2.putParcelable("account", account);
            }
            if (bool != null) {
                bundle2.putBoolean("is_setup_wizard", bool.booleanValue());
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putBoolean("is_from_google_settings", z);
            if (!TextUtils.isEmpty(str2)) {
                bundle2.putString("enrollment_link", str2);
            }
            if (camd != null) {
                bxwc bxwc = camd.f175258l;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    camc camc = (camc) bxwc.get(i);
                    bundle2.putString(camc.f175242a, camc.f175243b);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            launchIntentForPackage.setFlags(0);
            return new jhi(Status.f30107a, launchIntentForPackage);
        } catch (PackageManager.NameNotFoundException e2) {
            return new jhi(new Status(21518, "Package does not exist."), null);
        }
    }

    /* renamed from: b */
    public final void mo13742b(Context context, Account account) {
        sdo.m34959a(account);
        try {
            ((Boolean) adyd.m51363a(context).mo33906a(account, new String[]{aymh.m84252a("uca")}, (AccountManagerCallback) null).getResult()).booleanValue();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            f22492a.mo25415d("Exception when checking account features for Unicorn.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static synchronized jhl m16704a() {
        jhl jhl;
        synchronized (jhl.class) {
            if (f22493b == null) {
                f22493b = new jhl();
            }
            jhl = f22493b;
        }
        return jhl;
    }

    /* renamed from: a */
    public final int mo13737a(Context context, camd camd) {
        sdo.m34959a(camd);
        if ((camd.f175247a & 64) != 0) {
            try {
                return context.getPackageManager().getPackageInfo(camd.f175248b, 0).versionCode < camd.f175253g ? 2 : 3;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return 1;
    }

    /* renamed from: a */
    public final camd mo13738a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (camd) bxvk.m124016a(camd.f175245n, bArr, bxus.m123744c());
        } catch (bxwf e) {
            f22492a.mo25417e("Failed to parse PackageInformation data: ", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final DownloadStatusResponse mo13739a(Context context, long j) {
        Cursor query;
        int i = 0;
        DownloadManager.Query filterById = new DownloadManager.Query().setFilterById(j);
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        DownloadStatusResponse downloadStatusResponse = new DownloadStatusResponse(1, 0, 0);
        try {
            query = downloadManager.query(filterById);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i2 = query.getInt(query.getColumnIndex("status"));
                    if (i2 == 2) {
                        downloadStatusResponse.f11050b = 21510;
                        long j2 = query.getLong(query.getColumnIndex("total_size"));
                        if (j2 > 0) {
                            i = (int) ((query.getLong(query.getColumnIndex("bytes_so_far")) * 100) / j2);
                        }
                    } else if (i2 == 4) {
                        downloadStatusResponse.f11050b = 21509;
                    } else if (i2 == 8) {
                        downloadStatusResponse.f11050b = 21508;
                    } else if (i2 != 16) {
                        downloadStatusResponse.f11050b = 21512;
                    } else {
                        downloadStatusResponse.f11050b = 21511;
                    }
                    query.close();
                    downloadStatusResponse.f11051c = i;
                    return downloadStatusResponse;
                }
            }
            downloadStatusResponse.f11050b = 21507;
            if (query != null) {
                query.close();
            }
            return downloadStatusResponse;
        } catch (SQLException | IllegalArgumentException e) {
            downloadStatusResponse.f11050b = 21507;
            return downloadStatusResponse;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f6 A[Catch:{ InterruptedException | ExecutionException -> 0x0239 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f7 A[Catch:{ InterruptedException | ExecutionException -> 0x0239 }] */
    /* renamed from: a */
    public final jhh mo13740a(Context context, Account account) {
        bxvd da;
        bzxn a;
        int i = Build.VERSION.SDK_INT;
        sdo.m34959a(account);
        long a2 = spn.m35843a(context);
        if (a2 == 0) {
            f22492a.mo25418e("Checkin has not happened yet.", new Object[0]);
            return new jhh(new Status(21500, "Checkin not happened yet."));
        }
        String a3 = adyd.m51363a(context).mo33908a(account);
        if (TextUtils.isEmpty(a3)) {
            f22492a.mo25418e("No token found for the account.", new Object[0]);
            return new jhh(new Status(21501, "No token found for the account."));
        }
        bxvd da2 = bzxl.f171767e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzxl bzxl = (bzxl) da2.f164949b;
        a3.getClass();
        bzxl.f171769a |= 1;
        bzxl.f171770b = a3;
        try {
            String packageName = context.getPackageName();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzxl bzxl2 = (bzxl) da2.f164949b;
            packageName.getClass();
            bzxl2.f171769a |= 2;
            bzxl2.f171771c = packageName;
            String lowerCase = spn.m35882e(context, packageName).toLowerCase(Locale.US);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzxl bzxl3 = (bzxl) da2.f164949b;
            lowerCase.getClass();
            bzxl3.f171769a |= 4;
            bzxl3.f171772d = lowerCase;
            bxvd da3 = cama.f175229e.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cama cama = (cama) da3.f164949b;
            cama.f175231a |= 2;
            cama.f175233c = a2;
            Locale locale = Locale.getDefault();
            int i2 = Build.VERSION.SDK_INT;
            String languageTag = locale.toLanguageTag();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cama cama2 = (cama) da3.f164949b;
            languageTag.getClass();
            cama2.f175231a |= 1;
            cama2.f175232b = languageTag;
            cama cama3 = (cama) da3.mo74062i();
            bxvd bxvd = (bxvd) cama3.mo74142c(5);
            bxvd.mo73625a((bxvk) cama3);
            try {
                String b = qdf.m31915b(context);
                if (b != null || !ccge.f178935a.mo6606a().mo75918a()) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    cama cama4 = (cama) bxvd.f164949b;
                    b.getClass();
                    cama4.f175231a |= 8;
                    cama4.f175234d = b;
                    da = bzxm.f171773d.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzxm bzxm = (bzxm) da.f164949b;
                    bzxl bzxl4 = (bzxl) da2.mo74062i();
                    bzxl4.getClass();
                    bzxm.f171777c = bzxl4;
                    bzxm.f171775a |= 2;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzxm bzxm2 = (bzxm) da.f164949b;
                    cama cama5 = (cama) bxvd.mo74062i();
                    cama5.getClass();
                    bzxm2.f171776b = cama5;
                    bzxm2.f171775a |= 1;
                    RequestQueue requestQueue = rpr.m34216b().getRequestQueue();
                    jhg jhg = new jhg();
                    requestQueue.add(rqw.m34279a(context, ccgh.f178939a.mo6606a().mo75928e(), (bzxm) da.mo74062i(), bzxn.f171778c, jhg));
                    try {
                        a = jhg.get();
                        sek sek = f22492a;
                        String valueOf = String.valueOf(a);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                        sb.append("Got response: ");
                        sb.append(valueOf);
                        sek.mo25414c(sb.toString(), new Object[0]);
                        if (a == null) {
                            if ((a.f171780a & 1) != 0) {
                                camb camb = a.f171781b;
                                if (camb == null) {
                                    camb = camb.f175235c;
                                }
                                byte[] k = ((camd) camb.f175237a.get(0)).mo73642k();
                                camb camb2 = a.f171781b;
                                if (camb2 == null) {
                                    camb2 = camb.f175235c;
                                }
                                return new jhh(Status.f30107a, k, camb2.f175238b);
                            }
                        }
                        f22492a.mo25418e("Null response from sever.", new Object[0]);
                        return new jhh(new Status(21504, "Null response from server."));
                    } catch (InterruptedException | ExecutionException e) {
                        f22492a.mo25417e("Error from server", e, new Object[0]);
                        Thread.currentThread().interrupt();
                        return new jhh(new Status(21505, "Error from server."));
                    }
                } else {
                    f22492a.mo25418e("No device data version in the client.", new Object[0]);
                    if (!ccgi.m129606c()) {
                        return new jhh(new Status(21503, "No device data version in the client."));
                    }
                    da = bzxm.f171773d.mo74144da();
                    if (da.f164950c) {
                    }
                    bzxm bzxm3 = (bzxm) da.f164949b;
                    bzxl bzxl42 = (bzxl) da2.mo74062i();
                    bzxl42.getClass();
                    bzxm3.f171777c = bzxl42;
                    bzxm3.f171775a |= 2;
                    if (da.f164950c) {
                    }
                    bzxm bzxm22 = (bzxm) da.f164949b;
                    cama cama52 = (cama) bxvd.mo74062i();
                    cama52.getClass();
                    bzxm22.f171776b = cama52;
                    bzxm22.f171775a |= 1;
                    RequestQueue requestQueue2 = rpr.m34216b().getRequestQueue();
                    jhg jhg2 = new jhg();
                    requestQueue2.add(rqw.m34279a(context, ccgh.f178939a.mo6606a().mo75928e(), (bzxm) da.mo74062i(), bzxn.f171778c, jhg2));
                    a = jhg2.get();
                    sek sek2 = f22492a;
                    String valueOf2 = String.valueOf(a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
                    sb2.append("Got response: ");
                    sb2.append(valueOf2);
                    sek2.mo25414c(sb2.toString(), new Object[0]);
                    if (a == null) {
                    }
                    f22492a.mo25418e("Null response from sever.", new Object[0]);
                    return new jhh(new Status(21504, "Null response from server."));
                }
            } catch (IOException | rfv | rfw e2) {
                f22492a.mo25417e("No device data version info.", e2, new Object[0]);
                if (!ccgi.m129606c()) {
                    return new jhh(new Status(21503, "No device data version info."));
                }
            }
        } catch (PackageManager.NameNotFoundException e3) {
            f22492a.mo25418e("Invalid calling package.", new Object[0]);
            return new jhh(new Status(21502, "Invalid calling package."));
        }
    }

    /* renamed from: a */
    public final boolean mo13741a(String str) {
        return str != null && !izj.DM_SCREENLOCK_REQUIRED.mo13527b(str);
    }
}
