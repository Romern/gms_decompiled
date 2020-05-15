package com.google.android.gms.auth.account.p016be.accountstate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.account.gencode.server.api.RevokeDevice;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.auth.account.be.accountstate.CredentialRevocationIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CredentialRevocationIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f9985a = ght.m13171a("CredentialRevocationIntentOperation");

    /* renamed from: c */
    private static BroadcastReceiver f9986c = null;

    /* renamed from: b */
    private gnk f9987b;

    /* renamed from: com.google.android.gms.auth.account.be.accountstate.CredentialRevocationIntentOperation$ConnectivityActionBroadcastReceiver */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ConnectivityActionBroadcastReceiver extends aacn {
        public ConnectivityActionBroadcastReceiver() {
            super("auth_account");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                context.startService(IntentOperation.getStartIntent(context, CredentialRevocationIntentOperation.class, "com.google.android.gms.auth.account.be.accountstate.revoke_scheduled_credentials_action"));
            }
        }
    }

    /* renamed from: a */
    public static Intent m6281a(Context context, String str) {
        return new Intent("com.google.android.gms.auth.account.be.accountstate.revoke_credential_action").setClassName(context, "com.google.android.gms.chimera.GmsIntentOperationService").putExtra("accountId", str);
    }

    /* renamed from: b */
    private final void m6284b() {
        for (String str : m6286c()) {
            m6282a(str);
        }
    }

    /* renamed from: c */
    private final Set m6286c() {
        HashSet hashSet = new HashSet(Arrays.asList(mo7374a().getString("key_revocation_set_string", "").split(",")));
        hashSet.remove("");
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    public final void onHandleIntent(Intent intent) {
        char c;
        if (gnv.m13528aa()) {
            String action = intent.getAction();
            int hashCode = action.hashCode();
            if (hashCode != -2143707069) {
                if (hashCode != -226057370) {
                    if (hashCode == 798292259 && action.equals("android.intent.action.BOOT_COMPLETED")) {
                        c = 1;
                        if (c != 0) {
                            String stringExtra = intent.getStringExtra("accountId");
                            if (stringExtra != null) {
                                m6282a(stringExtra);
                                return;
                            }
                            return;
                        } else if (c == 1) {
                            m6284b();
                            return;
                        } else if (c != 2) {
                            f9985a.mo25416d("Received unknown action: %s", action);
                            return;
                        } else {
                            m6284b();
                            return;
                        }
                    }
                } else if (action.equals("com.google.android.gms.auth.account.be.accountstate.revoke_scheduled_credentials_action")) {
                    c = 2;
                    if (c != 0) {
                    }
                }
            } else if (action.equals("com.google.android.gms.auth.account.be.accountstate.revoke_credential_action")) {
                c = 0;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
    }

    /* renamed from: b */
    private final void m6285b(String str) {
        Set c = m6286c();
        c.add(str);
        m6283a(c);
        if (f9986c == null) {
            f9986c = new ConnectivityActionBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getApplicationContext().registerReceiver(f9986c, intentFilter);
        }
    }

    /* renamed from: c */
    private final void m6287c(String str) {
        Set c = m6286c();
        c.remove(str);
        m6283a(c);
        if (c.isEmpty() && f9986c != null) {
            try {
                getApplicationContext().unregisterReceiver(f9986c);
            } catch (IllegalArgumentException e) {
            }
            f9986c = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012d  */
    /* renamed from: a */
    private final void m6282a(String str) {
        gnk gnk;
        izj izj;
        try {
            Context applicationContext = getApplicationContext();
            try {
                gnk = new gnk(applicationContext.getApplicationContext(), new gni(new grc(new shj(applicationContext, (String) ((bmzm) rsv.f43624m).f131273a, (String) gnv.f18727F.mo58455c(), false, true, null, null, 1025))), str);
            } catch (rqy e) {
                e = e;
                sek sek = f9985a;
                String message = e.getMessage();
                String valueOf = String.valueOf(e.f43534a);
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 1 + String.valueOf(valueOf).length());
                sb.append(message);
                sb.append(" ");
                sb.append(valueOf);
                sek.mo25416d("RevokeCredential -> %s", sb.toString());
                if (izj.NETWORK_ERROR.equals(e.f43534a)) {
                }
            }
            try {
                this.f9987b = gnk;
                Context context = gnk.f18696a;
                ClientContext clientContext = new ClientContext();
                clientContext.f30212b = context.getApplicationInfo().uid;
                clientContext.f30216f = context.getPackageName();
                String str2 = gnk.f18697b;
                if (str2 != null) {
                    grc grc = gnk.f18698c.f18688a;
                    StringBuilder sb2 = new StringBuilder("RevokeDevice");
                    shd.m35269a(sb2, "user_id", shd.m35267a(str2));
                    if (((RevokeDevice) grc.f18882a.mo25536a(clientContext, 1, sb2.toString(), (Object) null, RevokeDevice.class)).f10011a.contains(2)) {
                        izj = izj.SUCCESS;
                    } else {
                        izj = izj.BAD_REQUEST;
                    }
                } else {
                    izj = izj.BAD_REQUEST;
                }
                if (izj.equals(izj.SUCCESS)) {
                    f9985a.mo25412b("Credential revocation succeeded.", new Object[0]);
                    m6287c(str);
                } else if (izj.NETWORK_ERROR.equals(izj)) {
                    f9985a.mo25416d("Network error - will repeat credentials revocation", new Object[0]);
                    m6285b(str);
                } else {
                    m6287c(str);
                }
            } catch (gid e2) {
                e = e2;
                throw new rqy(izj.BAD_AUTHENTICATION, "Unauthorized request to revoke token", e);
            } catch (AuthFailureError e3) {
                e = e3;
                throw new rqy(izj.BAD_AUTHENTICATION, "Unauthorized request to revoke token", e);
            } catch (VolleyError e4) {
                throw new rqy(izj.NETWORK_ERROR, "Error communicating with LSO to revoke token.", e4);
            } catch (rqy e5) {
                e = e5;
                sek sek2 = f9985a;
                String message2 = e.getMessage();
                String valueOf2 = String.valueOf(e.f43534a);
                StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 1 + String.valueOf(valueOf2).length());
                sb3.append(message2);
                sb3.append(" ");
                sb3.append(valueOf2);
                sek2.mo25416d("RevokeCredential -> %s", sb3.toString());
                if (izj.NETWORK_ERROR.equals(e.f43534a)) {
                    f9985a.mo25416d("Network error - will repeat credentials revocation", new Object[0]);
                    m6285b(str);
                    return;
                }
                m6287c(str);
            }
        } catch (rqy e6) {
            e = e6;
            sek sek22 = f9985a;
            String message22 = e.getMessage();
            String valueOf22 = String.valueOf(e.f43534a);
            StringBuilder sb32 = new StringBuilder(String.valueOf(message22).length() + 1 + String.valueOf(valueOf22).length());
            sb32.append(message22);
            sb32.append(" ");
            sb32.append(valueOf22);
            sek22.mo25416d("RevokeCredential -> %s", sb32.toString());
            if (izj.NETWORK_ERROR.equals(e.f43534a)) {
            }
        }
    }

    /* renamed from: a */
    private final void m6283a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z) {
                sb.append(",");
            }
            sb.append(str);
            z = false;
        }
        SharedPreferences.Editor edit = mo7374a().edit();
        edit.putString("key_revocation_set_string", sb.toString());
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SharedPreferences mo7374a() {
        return getApplicationContext().getSharedPreferences("credentials_revocation_storage", 0);
    }
}
