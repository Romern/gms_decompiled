package com.google.android.gms.fido.fido2.pollux;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CableAuthenticatorChimeraService extends Service {

    /* renamed from: d */
    public static final sek f31840d = new sek(new String[]{"CableAuthenticatorChimeraService"}, (short[]) null);

    /* renamed from: a */
    public final Context f31841a;

    /* renamed from: b */
    public final Set f31842b;

    /* renamed from: c */
    public xtk f31843c;

    /* renamed from: e */
    private final xbo f31844e;

    /* renamed from: f */
    private xdx f31845f;

    /* renamed from: g */
    private BroadcastReceiver f31846g;

    public CableAuthenticatorChimeraService() {
        this.f31841a = this;
        this.f31845f = new xdx();
        this.f31844e = (xbo) xbo.f51879a.mo33309a();
        this.f31842b = Collections.synchronizedSet(new HashSet());
    }

    /* renamed from: a */
    public static Intent m23548a(Context context) {
        return new Intent().setClassName(context.getApplicationContext(), "com.google.android.gms.fido.fido2.pollux.CableAuthenticatorService");
    }

    /* renamed from: b */
    private final void m23550b() {
        if (this.f31846g != null) {
            f31840d.mo25414c("Unregistering receiver.", new Object[0]);
            this.f31841a.unregisterReceiver(this.f31846g);
            this.f31846g = null;
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onDestroy() {
        f31840d.mo25414c("onDestroy()", new Object[0]);
        this.f31843c = null;
        m23550b();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        bmvz bmvz;
        Intent intent2 = intent;
        if (!((Boolean) xmn.f52751a.mo58455c()).booleanValue()) {
            stopSelf();
            return 2;
        }
        f31840d.mo25412b("onStartCommand() called.", new Object[0]);
        if (((Boolean) xmn.f52770t.mo58455c()).booleanValue()) {
            f31840d.mo25416d("************************************************", new Object[0]);
            f31840d.mo25416d("************************************************", new Object[0]);
            f31840d.mo25416d("             CABLE DEBUG MODE ENABLED", new Object[0]);
            f31840d.mo25416d("************************************************", new Object[0]);
            f31840d.mo25416d("************************************************", new Object[0]);
            f31840d.mo25416d("DEBUG: printing sample session data for each enrolled credential...", new Object[0]);
            Random random = new Random();
            List a = mo18785a();
            int size = a.size();
            int i3 = 1;
            for (int i4 = 0; i4 < size; i4++) {
                xjn xjn = (xjn) a.get(i4);
                byte[] bArr = new byte[8];
                random.nextBytes(bArr);
                xjm a2 = xjt.m43059a(xjn, bArr);
                if (a2 != null) {
                    f31840d.mo25414c("  Credential %s:", Integer.valueOf(i3));
                    f31840d.mo25414c("    account: %s", xjn.f52434c.name);
                    f31840d.mo25414c("    nonce: %s", srv.m36164d(bArr));
                    f31840d.mo25414c("    clientEid: %s", srv.m36164d(a2.f52427b));
                    f31840d.mo25414c("    authenticatorEid: %s", srv.m36164d(a2.f52428c));
                    f31840d.mo25414c("    sessionPreKey: %s", srv.m36164d(a2.f52429d));
                    i3++;
                }
            }
            f31840d.mo25416d("************************************************", new Object[0]);
            f31840d.mo25416d("************************************************", new Object[0]);
        }
        if (this.f31846g != null) {
            m23550b();
        }
        if (this.f31846g == null) {
            this.f31846g = new aacn("fido") {
                /* class com.google.android.gms.fido.fido2.pollux.CableAuthenticatorChimeraService.C15672 */

                /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
                /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
                /* renamed from: a */
                public final void mo6253a(Context context, Intent intent) {
                    char c;
                    int i;
                    CableAuthenticatorChimeraService.f31840d.mo25414c("Broadcast receiver triggered: %s", intent.getAction());
                    xtk xtk = CableAuthenticatorChimeraService.this.f31843c;
                    if (xtk == null || !xtk.mo30123c()) {
                        String action = intent.getAction();
                        int hashCode = action.hashCode();
                        if (hashCode != -1454123155) {
                            if (hashCode == 1765966489 && action.equals("com.google.android.gms.fido.CABLE_AUTHENTICATOR")) {
                                c = 1;
                                if (c == 0) {
                                    i = 2;
                                } else if (c == 1) {
                                    i = 1;
                                } else {
                                    throw new IllegalArgumentException("Unknown action in Intent to start session");
                                }
                                CableAuthenticatorChimeraService cableAuthenticatorChimeraService = CableAuthenticatorChimeraService.this;
                                byte[] byteArrayExtra = intent.getByteArrayExtra("client_eid");
                                if (!((Boolean) xmn.f52751a.mo58455c()).booleanValue()) {
                                    cableAuthenticatorChimeraService.stopSelf();
                                    return;
                                }
                                CableAuthenticatorChimeraService.f31840d.mo25414c("Starting authentication session...", new Object[0]);
                                xtq xtq = new xtq(cableAuthenticatorChimeraService.f31841a, cableAuthenticatorChimeraService.mo18785a(), cableAuthenticatorChimeraService.f31842b);
                                xwj a = xwj.m43507a(xwi.PAASK);
                                if (byteArrayExtra != null) {
                                    a.f53296b = byteArrayExtra;
                                }
                                cableAuthenticatorChimeraService.f31843c = xti.m43385a(cableAuthenticatorChimeraService, a, xtq, new xdx(), new xst(cableAuthenticatorChimeraService), i, false);
                                cableAuthenticatorChimeraService.f31843c.mo30119a();
                                return;
                            }
                        } else if (action.equals("android.intent.action.SCREEN_ON")) {
                            c = 0;
                            if (c == 0) {
                            }
                            CableAuthenticatorChimeraService cableAuthenticatorChimeraService2 = CableAuthenticatorChimeraService.this;
                            byte[] byteArrayExtra2 = intent.getByteArrayExtra("client_eid");
                            if (!((Boolean) xmn.f52751a.mo58455c()).booleanValue()) {
                            }
                        }
                        c = 65535;
                        if (c == 0) {
                        }
                        CableAuthenticatorChimeraService cableAuthenticatorChimeraService22 = CableAuthenticatorChimeraService.this;
                        byte[] byteArrayExtra22 = intent.getByteArrayExtra("client_eid");
                        if (!((Boolean) xmn.f52751a.mo58455c()).booleanValue()) {
                        }
                    }
                }
            };
            f31840d.mo25414c("Registering broadcast receiver.", new Object[0]);
            IntentFilter intentFilter = new IntentFilter();
            if (((Boolean) xmn.f52769s.mo58455c()).booleanValue()) {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
            }
            intentFilter.addAction("com.google.android.gms.fido.CABLE_AUTHENTICATOR");
            this.f31841a.registerReceiver(this.f31846g, intentFilter);
        }
        if (intent2 == null || !intent2.hasExtra("cable_session_data") || !intent2.hasExtra("cable_feature") || !intent2.hasExtra("cable_client_info")) {
            return 1;
        }
        xtk xtk = this.f31843c;
        if (xtk != null && xtk.f53056j && xtk.mo30123c()) {
            return 1;
        }
        xtk xtk2 = this.f31843c;
        if (xtk2 != null && xtk2.mo30123c()) {
            this.f31843c.mo30122b();
        }
        try {
            int intExtra = intent2.getIntExtra("cable_feature", 0);
            char c = intExtra != 0 ? intExtra != 1 ? (char) 0 : 3 : 2;
            if (!(c == 0 || c == 2)) {
                byte[] byteArrayExtra = intent2.getByteArrayExtra("cable_session_data");
                String str = ((bsno) bxvk.m124014a(bsno.f146308c, intent2.getByteArrayExtra("cable_client_info"))).f146311b;
                bsnq bsnq = ((bsnp) bxvk.m124014a(bsnp.f146312b, byteArrayExtra)).f146314a;
                if (bsnq == null) {
                    bsnq = bsnq.f146315f;
                }
                byte[] k = bsnq.f146317a.mo73780k();
                byte[] k2 = bsnq.f146318b.mo73780k();
                byte[] k3 = bsnq.f146319c.mo73780k();
                byte[] k4 = bsnq.f146320d.mo73780k();
                try {
                    bmvz = bmxv.m108566b(xjz.m43074a("google.com", new xkb(bsnq.f146321e.mo73780k())));
                } catch (xma e) {
                    bmvz = bmvz.f131120a;
                }
                xtk a3 = xti.m43385a(this, xwj.m43507a(xwi.PAASK), new xuf(new xjm(k, k2, k3, k4, bmvz, str)), new xdx(), new xsv(this), 1, true);
                this.f31843c = a3;
                a3.mo30119a();
            }
        } catch (bxwf e2) {
            f31840d.mo25417e("Failed to extract caBLE session data for silent flow", e2, new Object[0]);
        }
        return 1;
    }

    /* renamed from: a */
    public final List mo18785a() {
        try {
            Account[] d = gie.m13199d(this.f31841a, "com.google");
            if (d == null || (r2 = d.length) == 0) {
                f31840d.mo25412b("No accounts signed in", new Object[0]);
                return bngx.m109376e();
            }
            bngs j = bngx.m109377j();
            for (Account account : d) {
                try {
                    List<xjx> a = this.f31844e.mo29613a(account.name);
                    if (a.isEmpty()) {
                        sek sek = f31840d;
                        String valueOf = String.valueOf(account.name);
                        sek.mo25414c(valueOf.length() == 0 ? new String("Skipping account with no active caBLE credentials: ") : "Skipping account with no active caBLE credentials: ".concat(valueOf), new Object[0]);
                    }
                    for (xjx xjx : a) {
                        xdx xdx = this.f31845f;
                        bmxy.m108581a(xjx);
                        if (xdx.f52037c.containsKey(xjx.mo29847a())) {
                            xlu a2 = ((xdm) xdx.f52037c.get(xjx.mo29847a())).mo29648a(xdx.f52035a.mo29657b(xjx));
                            if (a2 != null) {
                                j.mo67668c(new xjn(a2, bmxv.m108566b(xjx), account));
                            }
                        } else {
                            String valueOf2 = String.valueOf(xjx);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                            sb.append("Unsupported type in identifier: ");
                            sb.append(valueOf2);
                            throw new xma(sb.toString());
                        }
                    }
                    continue;
                } catch (xdk e) {
                    throw new xma("Key does not exist", e);
                } catch (xbn e2) {
                    f31840d.mo25417e("Error checking account enrollment status", e2, new Object[0]);
                } catch (xma e3) {
                    f31840d.mo25417e("Error loading key from ESK", e3, new Object[0]);
                }
            }
            if (((Boolean) xmn.f52770t.mo58455c()).booleanValue()) {
                f31840d.mo25416d("Adding debug caBLE credentials for %s", d[0].name);
                j.mo67668c(new xjn(new xlu(sqd.m35969b("HQiGlGcc5sLi-ukoW3NSNAGjOU4beL-WPBXCDCd0GpE="), sqd.m35969b("cfCOuQwpOhy0bo6KYMJZkPrlL-5oWI6-xxfjSK46vwE=")), bmvz.f131120a, d[0]));
            }
            return j.mo67664a();
        } catch (RemoteException | rfv | rfw e4) {
            f31840d.mo25417e("Error listing Google accounts on device", e4, new Object[0]);
            return bngx.m109376e();
        }
    }

    public CableAuthenticatorChimeraService(Context context, xti xti, xbo xbo, xdx xdx) {
        this.f31841a = context;
        this.f31844e = xbo;
        this.f31845f = xdx;
        this.f31842b = Collections.synchronizedSet(new HashSet());
    }
}
