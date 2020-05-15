package com.google.android.gms.locationsharing.api;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationSharingChimeraService extends TracingIntentService {

    /* renamed from: a */
    public static final srn f79625a = srn.m36127a(sgj.LOCATION_SHARING);

    /* renamed from: b */
    public rjx f79626b;

    public LocationSharingChimeraService() {
        super("LocationSharingService");
    }

    /* renamed from: a */
    static final /* synthetic */ void m66983a(aic aic, Exception exc) {
        bnsl bnsl = (bnsl) f79625a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("com.google.android.gms.locationsharing.api.LocationSharingChimeraService", "a", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failure getting location reporting state");
        aic.mo749a(bmvz.f131120a);
    }

    /* renamed from: a */
    private final boolean m66984a(String str) {
        for (String str2 : cfaz.f183554a.mo6606a().mo80781d().split(",")) {
            if (str2.equals(str)) {
                return true;
            }
        }
        if (ceyd.m138418b() && str.equals("com.google.android.gms")) {
            return true;
        }
        bnsl bnsl = (bnsl) f79625a.mo68390d();
        bnsl.mo68432a("com.google.android.gms.locationsharing.api.LocationSharingChimeraService", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Given package name \"%s\" is not whitelisted for the Location Sharing API.", str);
        return false;
    }

    /* renamed from: a */
    public final void mo43751a(PendingIntent pendingIntent) {
        Intent intent = new Intent();
        intent.putExtra("api_version", "2");
        try {
            pendingIntent.send(this, 1, intent);
        } catch (PendingIntent.CanceledException e) {
            bnsl bnsl = (bnsl) f79625a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.locationsharing.api.LocationSharingChimeraService", "a", 243, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error sending pending intent: ");
        }
    }

    /* renamed from: a */
    public final void mo43752a(PendingIntent pendingIntent, Intent intent) {
        try {
            pendingIntent.send(this, 0, intent);
        } catch (PendingIntent.CanceledException e) {
            bnsl bnsl = (bnsl) f79625a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.locationsharing.api.LocationSharingChimeraService", "a", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error sending pending intent: ");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023d  */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        bzmy bzmy;
        aeud aeud;
        boolean z;
        int i;
        boolean z2;
        int i2;
        Intent intent2 = intent;
        PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("pending_intent");
        if (pendingIntent == null) {
            pendingIntent = (PendingIntent) intent2.getParcelableExtra("extra_pending_intent");
        }
        String stringExtra = intent2.getStringExtra("account_name");
        if (pendingIntent != null) {
            boolean z3 = false;
            boolean booleanExtra = intent2.getBooleanExtra("is_called_from_settings", false);
            int i3 = Build.VERSION.SDK_INT;
            String creatorPackage = pendingIntent.getCreatorPackage();
            String[] split = cfaz.f183554a.mo6606a().mo80781d().split(",");
            int length = split.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (split[i4].equals(creatorPackage)) {
                        break;
                    }
                    i4++;
                } else if (!ceyd.m138418b() || !creatorPackage.equals("com.google.android.gms")) {
                    bnsl bnsl = (bnsl) f79625a.mo68390d();
                    bnsl.mo68432a("com.google.android.gms.locationsharing.api.LocationSharingChimeraService", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Given package name \"%s\" is not whitelisted for the Location Sharing API.", creatorPackage);
                    return;
                }
            }
            if (stringExtra != null) {
                aeue aeue = new aeue(stringExtra, this);
                bxvd da = bzmx.f170673d.mo74144da();
                bzmf a = aexp.m52655a(aeue.f63812c, aeue.f63811b);
                if (a.f170611a.size() > 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzmx bzmx = (bzmx) da.f164949b;
                    a.getClass();
                    bzmx.f170677c = a;
                    bzmx.f170675a |= 2;
                }
                if (ceyd.m138418b() && booleanExtra) {
                    bxvd da2 = bzmh.f170616c.mo74144da();
                    bxvd da3 = byuj.f168295f.mo74144da();
                    byug byug = byug.ACCOUNT_SETTINGS_MOBILE;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    byuj byuj = (byuj) da3.f164949b;
                    byuj.f168299c = byug.f168292ja;
                    int i5 = byuj.f168297a | 2;
                    byuj.f168297a = i5;
                    byuj.f168298b = 2;
                    byuj.f168297a = i5 | 1;
                    byuj byuj2 = (byuj) da3.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzmh bzmh = (bzmh) da2.f164949b;
                    byuj2.getClass();
                    bzmh.f170619b = byuj2;
                    bzmh.f170618a |= 1;
                    bzmh bzmh2 = (bzmh) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzmx bzmx2 = (bzmx) da.f164949b;
                    bzmh2.getClass();
                    bzmx2.f170676b = bzmh2;
                    bzmx2.f170675a |= 1;
                }
                Account account = null;
                try {
                    bzmy = (bzmy) aeue.mo34565a((bzmx) da.mo74062i(), bzmy.f170678d, "readsharingstate");
                } catch (Exception e) {
                    bnsl bnsl2 = (bnsl) aeue.f63820a.mo68388c();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("aeue", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Exception running ReadSharingStateResponse: ");
                    bqye.m113758a(e);
                    bzmy = null;
                }
                if (bzmy != null) {
                    int a2 = bzmj.m125931a(bzmy.f170681b);
                    if (a2 == 0) {
                        aeud = null;
                    } else if (a2 != 1) {
                        int a3 = bzlp.m125910a(bzmy.f170680a);
                        if (a3 == 0) {
                            aeud = null;
                        } else if (a3 != 1) {
                            bzmm bzmm = bzmy.f170682c;
                            if (bzmm == null) {
                                bzmm = bzmm.f170622e;
                            }
                            boolean equals = bzmm.f170627d.toLowerCase(Locale.US).equals(Locale.KOREA.getCountry().toLowerCase(Locale.US));
                            bzmm bzmm2 = bzmy.f170682c;
                            if (bzmm2 == null) {
                                bzmm2 = bzmm.f170622e;
                            }
                            int a4 = bzmj.m125931a(bzmm2.f170625b);
                            if (a4 == 0) {
                                z = false;
                            } else {
                                z = a4 == 2;
                            }
                            int a5 = bzlp.m125910a(bzmy.f170680a);
                            if (a5 != 0) {
                                i = a5;
                            } else {
                                i = 1;
                            }
                            if (i == 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            bzmm bzmm3 = bzmy.f170682c;
                            if (bzmm3 == null) {
                                bzmm3 = bzmm.f170622e;
                            }
                            int a6 = bzml.m125933a(bzmm3.f170626c);
                            if (a6 != 0) {
                                i2 = a6;
                            } else {
                                i2 = 1;
                            }
                            if (i2 == 4) {
                                z3 = true;
                            }
                            aeud = new aeud(z, z2, z3, equals);
                        }
                    }
                    if (aeud == null) {
                        Intent intent3 = new Intent();
                        intent3.putExtra("account_name", stringExtra);
                        intent3.putExtra("is_sharing_enabled", aeud.f63816a);
                        intent3.putExtra("extra_is_sharing_enabled", aeud.f63816a);
                        intent3.putExtra("is_effectively_sharing", aeud.f63817b);
                        intent3.putExtra("extra_is_effectively_sharing", aeud.f63817b);
                        intent3.putExtra("is_korean", aeud.f63819d);
                        intent3.putExtra("has_signed_tos", aeud.f63818c);
                        intent3.putExtra("api_version", "2");
                        Iterator it = soz.m35801d(this, getPackageName()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Account account2 = (Account) it.next();
                            if (account2.name.equals(stringExtra)) {
                                account = account2;
                                break;
                            }
                        }
                        if (account != null) {
                            bqga.m112781a(aih.m807a(new aesl(this, account)), new aeso(this, intent3, pendingIntent), snp.m35704b(9));
                            return;
                        }
                        throw new IllegalArgumentException("Cannot get location history state for account not signed in on this device");
                    }
                    mo43751a(pendingIntent);
                    return;
                }
                aeud = null;
                if (aeud == null) {
                }
            } else {
                Intent intent4 = new Intent();
                intent4.putExtra("api_version", "2");
                try {
                    pendingIntent.send(this, 0, intent4);
                } catch (PendingIntent.CanceledException e2) {
                    bnsl bnsl3 = (bnsl) f79625a.mo68388c();
                    bnsl3.mo68437a(e2);
                    bnsl3.mo68432a("com.google.android.gms.locationsharing.api.LocationSharingChimeraService", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Issue sending pending intent.");
                }
            }
        }
    }
}
