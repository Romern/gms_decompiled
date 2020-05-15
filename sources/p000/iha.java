package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.authzen.Permit;
import com.google.android.gms.auth.authzen.PermitAccess;
import com.google.android.gms.auth.authzen.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.GetMyDevicesRequestEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.GetMyDevicesResponseEntity;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: iha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iha {

    /* renamed from: a */
    public static final Logger f20991a = new Logger("ProximitySyncManager");

    /* renamed from: b */
    private static iha f20992b;

    /* renamed from: c */
    private static final byte[] f20993c = new byte[0];

    /* renamed from: d */
    private final Context f20994d;

    /* renamed from: e */
    private final igv f20995e;

    /* renamed from: f */
    private final igy f20996f;

    /* renamed from: g */
    private final iiz f20997g;

    /* renamed from: h */
    private final ijj f20998h;

    /* renamed from: i */
    private final Object f20999i = new Object();

    private iha(Context context) {
        igv igv = new igv(context);
        igz igz = new igz();
        igy igy = new igy(context);
        iiz a = iix.m15497a(context);
        ijj a2 = ijj.m15530a();
        long j = ifj.f20859a;
        this.f20994d = context;
        sdo.m34959a(igv);
        this.f20995e = igv;
        sdo.m34959a(igy);
        this.f20996f = igy;
        sdo.m34959a(igz);
        sdo.m34959a(a);
        this.f20997g = a;
        sdo.m34959a(a2);
        this.f20998h = a2;
    }

    /* renamed from: a */
    public static Intent m15432a(String str, int i) {
        Intent intent = new Intent("com.google.android.gms.auth.authzen.DEVICE_SYNC_FINISHED");
        intent.putExtra("permit_id", str);
        intent.putExtra("invocation_reason", i);
        return intent;
    }

    /* renamed from: a */
    public static synchronized iha m15433a(Context context) {
        iha iha;
        synchronized (iha.class) {
            if (f20992b == null) {
                f20992b = new iha(context.getApplicationContext());
            }
            iha = f20992b;
        }
        return iha;
    }

    /* renamed from: a */
    private static String m15434a(String str) {
        return String.format("permit://google.com/easyunlock/v1/%s", imv.m15741a(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x05df, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x057b A[Catch:{ all -> 0x05ed, VolleyError | iiy -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x05a2 A[SYNTHETIC, Splitter:B:140:0x05a2] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x05a5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0347 A[Catch:{ all -> 0x05ed, VolleyError | iiy -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0352 A[Catch:{ all -> 0x05ed, VolleyError | iiy -> 0x05f3 }] */
    /* renamed from: a */
    public final boolean mo13004a(String str, boolean z, int i, int i2) {
        String str2;
        Permit permit;
        boolean z2;
        iho iho;
        Cursor query;
        ContentValues contentValues;
        Iterator it;
        ClientContext clientContext;
        iho iho2;
        Permit permit2;
        List list;
        List list2;
        String str3 = str;
        int i3 = i;
        synchronized (this.f20999i) {
            try {
                if (ccer.f178841a.mo6606a().mo75837a()) {
                    if (i3 == 4) {
                        f20991a.mo25414c("Not syncing data for account %s since periodic syncs are turned off", Logger.m35081a(str));
                        return true;
                    }
                }
                f20991a.mo25414c("Syncing data for account %s", Logger.m35081a(str));
                byte[] bArr = ifj.m15366a(this.f20994d, new Account(str3, "com.google")).f10517b;
                try {
                    String a = m15434a(str);
                    try {
                        igv igv = this.f20995e;
                        ihq ihq = new ihq();
                        ihq.f21030a = z;
                        ihq.f21034e.add(2);
                        ihq.f21032c = i3;
                        ihq.f21034e.add(5);
                        ihq.f21033d = i2;
                        ihq.f21034e.add(6);
                        ihq.f21031b = (DeviceClassifierEntity) new igx(igv.f20986b).mo13002a();
                        ihq.f21034e.add(4);
                        ihm ihm = igv.f20985a;
                        int i4 = igv.f20986b.getApplicationInfo().uid;
                        String packageName = igv.f20986b.getPackageName();
                        ClientContext clientContext2 = clientContext;
                        ihq ihq2 = ihq;
                        ihm ihm2 = ihm;
                        str2 = a;
                        try {
                            clientContext = new ClientContext(i4, str, str, packageName, packageName);
                            clientContext2.mo17806d((String) igt.f20959i.mo58455c());
                            GetMyDevicesResponseEntity getMyDevicesResponseEntity = (GetMyDevicesResponseEntity) ihm2.f21028a.mo25536a(clientContext2, 1, new StringBuilder("deviceSync/getmydevices").toString(), new GetMyDevicesRequestEntity(ihq2.f21034e, ihq2.f21030a, false, ihq2.f21031b, ihq2.f21032c, ihq2.f21033d), GetMyDevicesResponseEntity.class);
                            if (getMyDevicesResponseEntity.f10444a.contains(2) && (list2 = getMyDevicesResponseEntity.f10445b) != null) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    iho iho3 = (iho) it2.next();
                                    if (iho3.mo7572n()) {
                                        try {
                                            if (Arrays.equals(bArr, sqd.m35971c(iho3.mo7571m()))) {
                                                iho2 = iho3;
                                                break;
                                            }
                                        } catch (IllegalArgumentException e) {
                                            f20991a.mo25416d("Cannot decode public key: %s", iho3.mo7571m());
                                        }
                                    }
                                }
                            }
                            iho2 = null;
                            List<iho> list3 = getMyDevicesResponseEntity.f10445b;
                            if (list3 == null) {
                                f20991a.mo25418e("device list from cryptauth is NULL.", new Object[0]);
                                return false;
                            }
                            list3.remove(iho2);
                            if (iho2 != null) {
                                ifm ifm = new ifm();
                                ifm.f20860a = m15434a(str);
                                ifm.f20861b = str3;
                                ifm.f20862c = "unlock";
                                ifn ifn = new ifn();
                                ifn.f20866a = ryv.m34679a(this.f20996f.f20988a);
                                ifn.f20867b = "AUTHZEN_PUBLIC_KEY";
                                ifn.f20868c = f20993c;
                                ifn.f20869d = iho2.mo7567i();
                                ifn.f20870e = iho2.mo7574p();
                                ifn.f20871f = iho2.mo7573o();
                                ifn.f20872g = iho2.mo7569k();
                                ifn.f20876k = iho2.mo7570l();
                                ifn.f20877l = iho2.mo7561b();
                                ifn.f20873h = iho2.mo7564f();
                                ifn.f20874i = iho2.mo7566h();
                                if (!iho2.mo7563d()) {
                                    list = new ArrayList();
                                } else {
                                    list = iho2.mo7562c();
                                }
                                ifn.mo12971a(list);
                                ifm.f20863d = ifn.mo12970a();
                                ifm.mo12969a("bluetooth_classic");
                                permit2 = ifm.mo12967a();
                                C1245ok okVar = new C1245ok();
                                for (iho iho4 : list3) {
                                    String f = iho4.mo7564f();
                                    if (!bmxx.m108577a(f) && (!okVar.containsKey(f) || iho4.mo7568j() > ((Long) okVar.get(f)).longValue())) {
                                        okVar.put(f, Long.valueOf(iho4.mo7568j()));
                                    }
                                }
                                Collections.sort(list3, new igw());
                                if (list3.size() > ((Integer) igt.f20971u.mo58455c()).intValue()) {
                                    list3 = list3.subList(0, ((Integer) igt.f20971u.mo58455c()).intValue());
                                }
                                for (iho iho5 : list3) {
                                    String f2 = iho5.mo7564f();
                                    if (okVar.get(f2) != null) {
                                        if (((Long) okVar.get(f2)).longValue() > iho5.mo7568j()) {
                                        }
                                    }
                                    f20991a.mo25414c("Generating new permitaccess %s.", iho5);
                                    ifn ifn2 = new ifn();
                                    ifn2.f20866a = iho5.mo7571m();
                                    ifn2.f20867b = "AUTHZEN_PUBLIC_KEY";
                                    ifn2.f20868c = sqd.m35971c(iho5.mo7571m());
                                    ifn2.f20869d = iho5.mo7567i();
                                    ifn2.f20870e = iho5.mo7574p();
                                    ifn2.f20871f = iho5.mo7573o();
                                    ifn2.f20872g = iho5.mo7569k();
                                    ifn2.f20876k = iho5.mo7570l();
                                    ifn2.f20877l = iho5.mo7561b();
                                    ifn2.f20873h = f2;
                                    ifn2.f20875j = iho5.mo7568j();
                                    ifn2.f20874i = iho5.mo7566h();
                                    ifn2.mo12971a(!iho5.mo7563d() ? new ArrayList() : iho5.mo7562c());
                                    PermitAccess a2 = ifn2.mo12970a();
                                    permit2.f10387g.put(a2.f10391b, a2);
                                }
                            } else {
                                permit2 = null;
                            }
                            iho = iho2;
                            permit = permit2;
                            z2 = true;
                            iiz iiz = this.f20997g;
                            iiz.f21079b.logVerbose("Getting permit with permitId: %s...", Logger.m35081a(str2));
                            SQLiteDatabase a3 = iiz.f21080a.mo13052a();
                            String str4 = str2;
                            query = a3.query("permit", null, "id=?", new String[]{str4}, null, null, null);
                            Permit a4 = query.moveToFirst() ? iiz.m15498a(a3, query) : null;
                            query.close();
                            if (permit != null) {
                                iiz iiz2 = this.f20997g;
                                iiz.f21079b.logVerbose("Saving permit with id: %s...", Logger.m35081a(permit.f10382b));
                                SQLiteDatabase a5 = iiz2.f21080a.mo13052a();
                                iiz2.mo13055c(permit.f10382b);
                                a5.beginTransaction();
                                try {
                                    contentValues = new ContentValues();
                                    contentValues.put("id", permit.f10382b);
                                    contentValues.put("account_id", permit.f10383c);
                                    contentValues.put("type", permit.f10384d);
                                    contentValues.put("license__id", permit.f10385e.f10391b);
                                    contentValues.put("license__data", permit.f10385e.f10393d);
                                    contentValues.put("license__type", permit.f10385e.f10392c);
                                    String[] strArr = ija.f21081a;
                                    contentValues.put("allowed_channels", TextUtils.join(",", permit.mo7543a().toArray()));
                                    contentValues.put("license__name", permit.f10385e.f10394e);
                                    contentValues.put("license__is_unlockable", Boolean.valueOf(permit.f10385e.f10395f));
                                    contentValues.put("license__is_unlock_key", Boolean.valueOf(permit.f10385e.f10396g));
                                    contentValues.put("license__is_mobile_hotspot_supported", Boolean.valueOf(permit.f10385e.f10397h));
                                    contentValues.put("license__bt_mac_address", permit.f10385e.f10398i);
                                    contentValues.put("license__device_type", permit.f10385e.f10399j);
                                    contentValues.put("license__is_pixel_phone", Boolean.valueOf(permit.f10385e.f10402m));
                                    contentValues.put("license__is_arc_plus_plus", Boolean.valueOf(permit.f10385e.f10403n));
                                    contentValues.put("license__beacon_seeds", iiu.m15492a(permit.f10385e.mo7549a()));
                                } catch (IOException e2) {
                                    iiz.f21079b.mo25417e("Error writing BeaconSeeds to DB.", e2, new Object[0]);
                                } catch (Throwable th) {
                                    Throwable th2 = th;
                                    a5.endTransaction();
                                    throw th2;
                                }
                                if (a5.insert("permit", null, contentValues) >= 0) {
                                    Iterator it3 = permit.mo7544b().iterator();
                                    while (it3.hasNext()) {
                                        PermitAccess permitAccess = (PermitAccess) it3.next();
                                        String str5 = permit.f10382b;
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("permit_id", str5);
                                        contentValues2.put("id", permitAccess.f10391b);
                                        contentValues2.put("data", permitAccess.f10393d);
                                        contentValues2.put("type", permitAccess.f10392c);
                                        contentValues2.put("name", permitAccess.f10394e);
                                        contentValues2.put("is_unlockable", Boolean.valueOf(permitAccess.f10395f));
                                        contentValues2.put("is_unlock_key", Boolean.valueOf(permitAccess.f10396g));
                                        contentValues2.put("is_mobile_hotspot_supported", Boolean.valueOf(permitAccess.f10397h));
                                        contentValues2.put("bt_mac_address", permitAccess.f10398i);
                                        contentValues2.put("device_type", permitAccess.f10399j);
                                        contentValues2.put("last_update_time", Long.valueOf(permitAccess.f10401l));
                                        contentValues2.put("is_pixel_phone", Boolean.valueOf(permitAccess.f10402m));
                                        contentValues2.put("is_arc_plus_plus", Boolean.valueOf(permitAccess.f10403n));
                                        try {
                                            contentValues2.put("beacon_seeds", iiu.m15492a(permitAccess.mo7549a()));
                                            it = it3;
                                        } catch (IOException e3) {
                                            it = it3;
                                            iiz.f21079b.mo25417e("Error writing BeaconSeeds to DB.", e3, new Object[0]);
                                        }
                                        if (a5.insert("permit__requester_access", null, contentValues2) >= 0) {
                                            it3 = it;
                                        } else {
                                            String str6 = permit.f10382b;
                                            StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 45);
                                            sb.append("Unable to add permit access with permit id: ");
                                            sb.append(str6);
                                            sb.append(".");
                                            throw new iiy(sb.toString());
                                        }
                                    }
                                    a5.setTransactionSuccessful();
                                    a5.endTransaction();
                                    f20991a.mo25412b("Saved permit %s, with %d requester access(es).", permit.f10382b, Integer.valueOf(permit.mo7544b().size()));
                                } else {
                                    String str7 = permit.f10382b;
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 30);
                                    sb2.append("Unable to add permit with id ");
                                    sb2.append(str7);
                                    sb2.append(".");
                                    throw new iiy(sb2.toString());
                                }
                            } else if (a4 != null) {
                                this.f20997g.mo13055c(a4.f10382b);
                                f20991a.mo25412b("Removed permit %s", a4.f10382b);
                            }
                            this.f20994d.sendBroadcast(m15432a(str4, i), "com.google.android.gms.auth.authzen.permission.DEVICE_SYNC_FINISHED");
                            if (!z2) {
                                return false;
                            }
                            if (iho == null) {
                                f20991a.mo25418e("Device didn't appear in the device list after Authzen is registered.", new Object[0]);
                                return false;
                            } else if (((Boolean) igt.f20951a.mo58455c()).booleanValue() && iho.mo7573o() && !iho.mo7565g()) {
                                f20991a.mo25414c("Forcing Authzen registration for account %s because EasyUnlock is enabled and bluetooth address is missing.", Logger.m35081a(str));
                                boolean a6 = this.f20998h.mo13062a(2, str3, 9, 0);
                                return a6;
                            }
                        } catch (gid e4) {
                            e = e4;
                            f20991a.mo25418e("Failed to authenticate account: %s. Clearing data.", Logger.m35081a(str), e);
                            iho = null;
                            z2 = false;
                            permit = null;
                            iiz iiz3 = this.f20997g;
                            iiz.f21079b.logVerbose("Getting permit with permitId: %s...", Logger.m35081a(str2));
                            SQLiteDatabase a32 = iiz3.f21080a.mo13052a();
                            String str42 = str2;
                            query = a32.query("permit", null, "id=?", new String[]{str42}, null, null, null);
                            if (query.moveToFirst()) {
                            }
                            query.close();
                            if (permit != null) {
                            }
                            this.f20994d.sendBroadcast(m15432a(str42, i), "com.google.android.gms.auth.authzen.permission.DEVICE_SYNC_FINISHED");
                            if (!z2) {
                            }
                        }
                    } catch (gid e5) {
                        e = e5;
                        str2 = a;
                        f20991a.mo25418e("Failed to authenticate account: %s. Clearing data.", Logger.m35081a(str), e);
                        iho = null;
                        z2 = false;
                        permit = null;
                        iiz iiz32 = this.f20997g;
                        iiz.f21079b.logVerbose("Getting permit with permitId: %s...", Logger.m35081a(str2));
                        SQLiteDatabase a322 = iiz32.f21080a.mo13052a();
                        String str422 = str2;
                        query = a322.query("permit", null, "id=?", new String[]{str422}, null, null, null);
                        if (query.moveToFirst()) {
                        }
                        query.close();
                        if (permit != null) {
                        }
                        this.f20994d.sendBroadcast(m15432a(str422, i), "com.google.android.gms.auth.authzen.permission.DEVICE_SYNC_FINISHED");
                        if (!z2) {
                        }
                    }
                } catch (VolleyError | iiy e6) {
                    f20991a.mo25418e("Failed to sync data with server for account: %s.", Logger.m35081a(str), e6);
                    return false;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    query.close();
                    throw th4;
                }
            } catch (InterruptedException e7) {
                e = e7;
                f20991a.mo25417e("could not get public key", e, new Object[0]);
                return false;
            } catch (ExecutionException e8) {
                e = e8;
                f20991a.mo25417e("could not get public key", e, new Object[0]);
                return false;
            } catch (TimeoutException e9) {
                e = e9;
                f20991a.mo25417e("could not get public key", e, new Object[0]);
                return false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
