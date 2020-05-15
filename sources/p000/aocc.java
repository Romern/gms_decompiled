package p000;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.Application;
import com.google.android.gms.plus.service.v1whitelisted.models.Applications;
import com.google.android.gms.plus.service.v1whitelisted.models.PlusAppClient;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;

/* renamed from: aocc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocc extends aoba {

    /* renamed from: a */
    private final ClientContext f78155a;

    /* renamed from: b */
    private final String f78156b;

    /* renamed from: c */
    private final int f78157c;

    /* renamed from: d */
    private final String f78158d;

    /* renamed from: e */
    private final antn f78159e;

    public aocc(ClientContext clientContext, String str, int i, String str2, antn antn) {
        this.f78155a = clientContext;
        this.f78156b = str;
        this.f78157c = i;
        this.f78158d = str2;
        this.f78159e = antn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        String str;
        int i;
        ApplicationInfo applicationInfo;
        Application.Icon icon;
        Context context2 = context;
        String str2 = null;
        try {
            String str3 = this.f78156b;
            if (str3 == null) {
                this.f78159e.mo42250a(DataHolder.m22539b(8), (String) null);
                return;
            }
            ClientContext clientContext = this.f78155a;
            int i2 = this.f78157c;
            String str4 = this.f78158d;
            aodk aodk = anru.f77552c.f77579c;
            String a = anxj.m65495a(context);
            Integer valueOf = Integer.valueOf(i2);
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("people/%1$s/applications/%2$s", shd.m35267a("me"), shd.m35267a(str3));
            if (a != null) {
                shd.m35269a(sb, "language", shd.m35267a(a));
            }
            shd.m35269a(sb, "maxResults", String.valueOf(valueOf));
            if (str4 != null) {
                shd.m35269a(sb, "pageToken", shd.m35267a(str4));
            }
            Applications applications = (Applications) aodk.f78221a.mo25536a(clientContext, 0, sb.toString(), (Object) null, Applications.class);
            List list = applications.f82842c;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest b = spn.m35868b("SHA1");
            int i3 = 0;
            while (i3 < size) {
                Application application = (Application) list.get(i3);
                ContentValues contentValues = new ContentValues();
                contentValues.put("display_name", application.f82832d);
                contentValues.put("application_id", application.f82834f);
                if (application == null || (icon = application.f82833e) == null) {
                    str = str2;
                } else {
                    str = rzi.m34704a(icon.f82838c);
                }
                contentValues.put("icon_url", str);
                contentValues.put("is_aspen", (Boolean) true);
                List list2 = application.f82831c;
                if (list2 != null) {
                    i = ((ArrayList) list2).size();
                } else {
                    i = 0;
                }
                String str5 = str2;
                int i4 = 0;
                while (true) {
                    if (i4 >= i) {
                        applicationInfo = str5;
                        break;
                    }
                    PlusAppClient plusAppClient = (PlusAppClient) ((ArrayList) list2).get(i4);
                    List list3 = list2;
                    if ("android".equals(plusAppClient.f83051e) && plusAppClient.f83049c != null) {
                        try {
                            Object applicationInfo2 = packageManager.getApplicationInfo(plusAppClient.f83050d, 0);
                            PackageInfo packageInfo = packageManager.getPackageInfo(plusAppClient.f83050d, 64);
                            if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                                if (plusAppClient.f83049c.equalsIgnoreCase(srv.m36164d(b.digest(packageInfo.signatures[0].toByteArray())))) {
                                    if (str5 != null) {
                                        applicationInfo = 0;
                                        break;
                                    }
                                    str5 = applicationInfo2;
                                } else {
                                    continue;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                        }
                    }
                    i4++;
                    list2 = list3;
                }
                if (applicationInfo != 0) {
                    contentValues.put("display_name", packageManager.getApplicationLabel(applicationInfo).toString());
                    contentValues.put("application_info", anwt.m65476a(applicationInfo));
                }
                arrayList.add(contentValues);
                i3++;
                str2 = null;
            }
            Collections.sort(arrayList, new ansf());
            rtu a2 = DataHolder.m22537a(anwt.f77841a);
            for (int i5 = 0; i5 < size; i5++) {
                a2.mo25160a((ContentValues) arrayList.get(i5));
            }
            Pair create = Pair.create(a2.mo25163a(0), applications.f82843d);
            this.f78159e.mo42250a((DataHolder) create.first, (String) create.second);
        } catch (UserRecoverableAuthException e2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context2, 0, e2.mo7366a(), 0));
            this.f78159e.mo42250a(DataHolder.m22536a(4, bundle), (String) null);
        } catch (gid e3) {
            this.f78159e.mo42250a(DataHolder.m22536a(4, anuj.m65341a(context2, this.f78155a)), (String) null);
        } catch (VolleyError e4) {
            this.f78159e.mo42250a(DataHolder.m22539b(7), (String) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78159e;
        if (antn != null) {
            antn.mo42250a(DataHolder.m22539b(8), (String) null);
        }
    }
}
