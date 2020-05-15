package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appstate.service.AppStateAndroidChimeraService;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: gas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gas implements gai {

    /* renamed from: a */
    private final sck f17802a;

    /* renamed from: b */
    private final int f17803b;

    /* renamed from: c */
    private final String f17804c;

    /* renamed from: d */
    private final Account f17805d;

    /* renamed from: e */
    private final Account f17806e;

    /* renamed from: f */
    private final String[] f17807f;

    /* renamed from: g */
    private final boolean f17808g;

    public gas(sck sck, int i, String str, Account account, Account account2, String[] strArr, boolean z) {
        this.f17802a = sck;
        this.f17803b = i;
        this.f17804c = str;
        sdo.checkIfNull(account, "RequestedAccount cannot be null.");
        this.f17805d = account;
        this.f17806e = account2;
        this.f17807f = strArr;
        this.f17808g = z;
    }

    /* renamed from: a */
    private final void m12868a(Context context, int i, IBinder iBinder, Intent intent) {
        Bundle bundle = new Bundle();
        if (intent != null) {
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, intent, 134217728));
        }
        try {
            this.f17802a.mo16678a(i, iBinder, bundle);
        } catch (RemoteException e) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010c, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        m12868a(r12, 7, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0114, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011d, code lost:
        m12868a(r12, 4, null, ((com.google.android.gms.auth.UserRecoverableAuthException) r13).mo7366a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0126, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0127, code lost:
        m12868a(r12, 8, null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012c, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010f A[ExcHandler: IOException (e java.io.IOException), Splitter:B:50:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0127  */
    /* renamed from: a */
    public final void mo11592a(Context context, fzw fzw) {
        String str;
        ClientContext clientContext;
        gaa gaa;
        Object obj;
        if (soz.m35807f(context)) {
            sok sok = new sok(context);
            sok.f44864a.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_TITLE", (int) C0126R.string.common_google_play_services_error_dialog_title);
            sok.f44864a.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_MESSAGE_STR", sau.m34809c(context, 20));
            sok.f44864a.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE", 0);
            m12868a(context, 6, null, sok.f44864a);
            return;
        }
        int i = this.f17803b;
        String a = spn.m35849a(context, this.f17804c, "com.google.android.gms.appstate.APP_ID");
        if (a == null) {
            a = "";
        } else {
            try {
                Long.parseLong(a);
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder(a.length() + 109);
                sb.append("Application ID (");
                sb.append(a);
                sb.append(") must be a numeric value. Please verify that your manifest refers to the correct project ID.");
                Log.e("ValidateServiceOp", sb.toString());
                m12868a(context, 10, null, null);
                return;
            }
        }
        if (TextUtils.isEmpty(a) && this.f17803b != Process.myUid()) {
            String valueOf = String.valueOf(this.f17804c);
            Log.e("ValidateServiceOp", valueOf.length() == 0 ? new String("Missing metadata tag with the name \"com.google.android.gms.appstate.APP_ID\" in the application tag of the manifest for ") : "Missing metadata tag with the name \"com.google.android.gms.appstate.APP_ID\" in the application tag of the manifest for ".concat(valueOf));
            m12868a(context, 10, null, null);
            return;
        }
        if (!this.f17808g) {
            String str2 = this.f17805d.name;
            if ("<<default account>>".equals(str2)) {
                str2 = soz.m35784a(context, this.f17804c);
            } else if (str2 != null && !soz.m35806e(context, str2, this.f17804c)) {
                str2 = null;
                if (str2 == null) {
                    str = str2;
                } else {
                    Intent a2 = sbv.m34869a();
                    a2.addFlags(536870912);
                    m12868a(context, 4, null, a2);
                    return;
                }
            }
            List d = soz.m35801d(context, this.f17804c);
            if (str2 == null) {
                if (d.size() == 1) {
                    str2 = ((Account) d.get(0)).name;
                } else {
                    str2 = null;
                }
            }
            if (str2 == null) {
            }
        } else {
            str = this.f17806e.name;
        }
        String str3 = this.f17804c;
        sdo.m34977c(str);
        ClientContext a3 = ClientContext.m22584a(context, i, ClientContext.m22586c(str), str3);
        if (a3 != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.f17807f;
                if (i2 < strArr.length) {
                    if (!a3.mo17801a(strArr[i2])) {
                        clientContext = null;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        clientContext = a3;
        if (clientContext == null) {
            try {
                String str4 = this.f17804c;
                ClientContext clientContext2 = new ClientContext(i, str, str, str4, str4);
                clientContext2.mo17799a(this.f17807f);
                new sie(clientContext2, null).mo25586b(context);
                clientContext2.mo17796a(context);
                clientContext = clientContext2;
            } catch (gid e2) {
                e = e2;
                clientContext.mo17804b(context);
                if (!(e instanceof UserRecoverableAuthException)) {
                }
            } catch (IOException e3) {
            }
        }
        synchronized (AppStateAndroidChimeraService.f9812b) {
            WeakReference weakReference = (WeakReference) AppStateAndroidChimeraService.f9811a.get(clientContext);
            if (weakReference != null) {
                HashMap hashMap = AppStateAndroidChimeraService.f9811a;
                if (hashMap.containsKey(clientContext)) {
                    Iterator it = hashMap.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        obj = it.next();
                        if (obj.equals(clientContext)) {
                            break;
                        }
                    }
                }
                obj = null;
                ClientContext clientContext3 = (ClientContext) obj;
                if (clientContext3.equals(clientContext) && new HashSet(clientContext.f30217g).equals(new HashSet(clientContext3.f30217g)) && new HashSet(clientContext.f30218h).equals(new HashSet(clientContext3.f30218h))) {
                    Set<String> keySet = clientContext.f30219i.keySet();
                    if (keySet.equals(clientContext3.f30219i.keySet())) {
                        for (String str5 : keySet) {
                            if (!sdg.m34949a(clientContext.f30219i.get(str5), clientContext3.f30219i.get(str5))) {
                            }
                        }
                        gaa = (gaa) weakReference.get();
                    }
                }
                gaa = null;
                break;
            }
            gaa = null;
        }
        if (gaa == null || !a.equals(gaa.f17772a)) {
            gaa = new gaa(context.getApplicationContext(), clientContext, a);
            synchronized (AppStateAndroidChimeraService.f9812b) {
                AppStateAndroidChimeraService.f9811a.put(clientContext, new WeakReference(gaa));
            }
        }
        if (!this.f17808g) {
            soz.m35787a(context, clientContext);
        }
        m12868a(context, 0, gaa, null);
    }
}
