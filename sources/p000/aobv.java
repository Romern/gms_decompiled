package p000;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.lso.AuthApps;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: aobv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobv extends aoba {

    /* renamed from: a */
    private final ClientContext f78136a;

    /* renamed from: b */
    private final antn f78137b;

    public aobv(ClientContext clientContext, antn antn) {
        this.f78136a = clientContext;
        this.f78137b = antn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0290, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0294 A[ExcHandler: VolleyError (e com.android.volley.VolleyError), PHI: r1 10  PHI: (r1v5 aobv) = (r1v0 aobv), (r1v0 aobv), (r1v0 aobv), (r1v0 aobv), (r1v0 aobv), (r1v0 aobv), (r1v12 aobv), (r1v12 aobv), (r1v0 aobv), (r1v0 aobv) binds: [B:1:0x0006, B:2:?, B:4:0x000a, B:12:0x0044, B:13:?, B:19:0x004f, B:109:0x025d, B:110:?, B:15:0x0048, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a1 A[ExcHandler: gid (e gid), PHI: r1 10  PHI: (r1v3 aobv) = (r1v0 aobv), (r1v0 aobv), (r1v0 aobv), (r1v0 aobv), (r1v0 aobv), (r1v0 aobv), (r1v12 aobv), (r1v12 aobv), (r1v0 aobv), (r1v0 aobv) binds: [B:1:0x0006, B:2:?, B:4:0x000a, B:12:0x0044, B:13:?, B:19:0x004f, B:109:0x025d, B:110:?, B:15:0x0048, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0006] */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        int i;
        String str;
        int i2;
        int i3;
        List list;
        boolean z;
        aobv aobv = this;
        Context context2 = context;
        try {
            AuthApps a = anru.f77555f.f77560b.mo25430a(aobv.f78136a, "third_party", anxj.m65495a(context));
            SparseArray sparseArray = new SparseArray();
            if (a.f30255a.contains(2)) {
                for (AuthApps.Api_scopes api_scopes : a.f30256b) {
                    sparseArray.put(api_scopes.f30262d, api_scopes.f30260b);
                }
            }
            List list2 = a.f30257c;
            if (list2 != null) {
                i = list2.size();
            } else {
                i = 0;
            }
            ArrayList arrayList = new ArrayList(i);
            String[] split = ((String) ansx.f77652B.mo25081c()).split(";");
            ArrayList arrayList2 = new ArrayList(split.length);
            int i4 = 0;
            while (i4 < split.length) {
                List list3 = list2;
                try {
                    arrayList2.add(Integer.valueOf(Integer.parseInt(split[i4])));
                } catch (Exception e) {
                }
                i4++;
                context2 = context;
                list2 = list3;
            }
            int intValue = ((Integer) ansx.f77653C.mo25081c()).intValue();
            PackageManager packageManager = context.getPackageManager();
            MessageDigest b = spn.m35868b("SHA1");
            StringBuilder sb = new StringBuilder();
            String string = context2.getString(C0126R.string.plus_manage_moment_acl_separator);
            int i5 = 0;
            while (i5 < i) {
                try {
                    AuthApps.Apps apps = (AuthApps.Apps) list2.get(i5);
                    String a2 = rzi.m34704a(apps.f30268d);
                    List list4 = list2;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("display_name", apps.f30267c);
                    contentValues.put("icon_url", a2);
                    contentValues.put("revoke_handle", apps.f30270f);
                    if (apps.f30265a.contains(7)) {
                        contentValues.put("revoke_message", apps.f30271g);
                    }
                    sb.setLength(0);
                    Iterator it = apps.f30272h.iterator();
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        int intValue2 = ((Integer) it.next()).intValue();
                        boolean z5 = z2;
                        if (!arrayList2.contains(Integer.valueOf(intValue2))) {
                            z = z5;
                        } else {
                            z = true;
                        }
                        if (intValue == intValue2) {
                            z3 = true;
                        }
                        boolean z6 = z;
                        if (intValue2 >= 57000) {
                            if (intValue2 <= 57099) {
                                z4 = true;
                            }
                        }
                        String str2 = (String) sparseArray.get(intValue2);
                        if (str2 != null) {
                            if (sb.length() > 0) {
                                sb.append(string);
                            }
                            sb.append(str2);
                        }
                        z2 = z6;
                        it = it2;
                    }
                    boolean z7 = z2;
                    String str3 = apps.f30269e;
                    if (str3 != null) {
                        try {
                            sdo.m34977c(str3);
                            String valueOf = String.valueOf(Long.toHexString(Long.parseLong(str3)));
                            str = valueOf.length() == 0 ? new String("e") : "e".concat(valueOf);
                        } catch (Exception e2) {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = UUID.randomUUID().toString();
                        z7 = false;
                    }
                    contentValues.put("application_id", str);
                    contentValues.put("is_aspen", Boolean.valueOf(z7));
                    contentValues.put("has_conn_read", Boolean.valueOf(z3));
                    contentValues.put("is_fitness", Boolean.valueOf(z4));
                    if (sb.length() > 0) {
                        contentValues.put("scopes", sb.toString());
                    }
                    List list5 = apps.f30266b;
                    if (list5 != null) {
                        i2 = ((ArrayList) list5).size();
                    } else {
                        i2 = 0;
                    }
                    StringBuilder sb2 = sb;
                    ApplicationInfo applicationInfo = null;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i2) {
                            break;
                        }
                        AuthApps.Apps.Clients clients = (AuthApps.Apps.Clients) ((ArrayList) list5).get(i6);
                        if (!clients.mo17836b()) {
                            list = list5;
                            i3 = i2;
                        } else {
                            list = list5;
                            if (clients.f30276c != null) {
                                try {
                                    i3 = i2;
                                    try {
                                        ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo(clients.f30275b, 0);
                                        PackageInfo packageInfo = packageManager.getPackageInfo(clients.f30275b, 64);
                                        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                                            if (clients.f30276c.equalsIgnoreCase(srv.m36164d(b.digest(packageInfo.signatures[0].toByteArray())))) {
                                                if (applicationInfo != null) {
                                                    applicationInfo = null;
                                                    break;
                                                }
                                                applicationInfo = applicationInfo2;
                                            } else {
                                                continue;
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException e3) {
                                    }
                                } catch (PackageManager.NameNotFoundException e4) {
                                    i3 = i2;
                                }
                            } else {
                                i3 = i2;
                            }
                        }
                        i6++;
                        list5 = list;
                        i2 = i3;
                    }
                    if (applicationInfo != null) {
                        contentValues.put("display_name", packageManager.getApplicationLabel(applicationInfo).toString());
                        contentValues.put("application_info", anwt.m65476a(applicationInfo));
                    }
                    arrayList.add(contentValues);
                    i5++;
                    list2 = list4;
                    sb = sb2;
                } catch (UserRecoverableAuthException e5) {
                    e = e5;
                    aobv = this;
                    context2 = context;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e.mo7366a(), 0));
                    aobv.f78137b.mo42250a(DataHolder.m22536a(4, bundle), (String) null);
                } catch (gid e6) {
                    aobv = this;
                    aobv.f78137b.mo42250a(DataHolder.m22536a(4, anuj.m65341a(context, aobv.f78136a)), (String) null);
                    return;
                } catch (VolleyError e7) {
                    aobv = this;
                    aobv.f78137b.mo42250a(DataHolder.m22539b(7), (String) null);
                    return;
                }
            }
            Collections.sort(arrayList, new anrw());
            rtu a3 = DataHolder.m22537a(anwt.f77841a);
            for (int i7 = 0; i7 < i; i7++) {
                a3.mo25160a((ContentValues) arrayList.get(i7));
            }
            Pair create = Pair.create(a3.mo25163a(0), null);
            aobv = this;
            aobv.f78137b.mo42250a((DataHolder) create.first, (String) create.second);
        } catch (UserRecoverableAuthException e8) {
            e = e8;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e.mo7366a(), 0));
            aobv.f78137b.mo42250a(DataHolder.m22536a(4, bundle2), (String) null);
        } catch (gid e9) {
        } catch (VolleyError e10) {
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78137b;
        if (antn != null) {
            antn.mo42250a(DataHolder.m22539b(8), (String) null);
        }
    }
}
