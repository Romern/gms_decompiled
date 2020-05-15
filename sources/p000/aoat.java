package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SyncResult;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzEventEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzExtensionEntity;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: aoat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoat extends smx {

    /* renamed from: a */
    public static aoat f78051a;

    /* renamed from: b */
    private final anru f78052b;

    /* renamed from: c */
    private final PackageManager f78053c;

    public aoat(Context context, anru anru, PackageManager packageManager) {
        super(context, "plus");
        this.f78052b = anru;
        this.f78053c = packageManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099 A[ExcHandler: gid (e gid), Splitter:B:15:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* renamed from: a */
    private final void m65710a(Account account, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        Cursor cursor;
        Account account2 = account;
        SyncResult syncResult2 = syncResult;
        ArrayList arrayList = new ArrayList();
        try {
            cursor = contentProviderClient.query(anub.f77731a, aoar.f78048a, "accountName=?", new String[]{account2.name}, "_id");
            while (cursor.moveToNext()) {
                try {
                    aoaq aoaq = new aoaq();
                    aoaq.f78044a = cursor.getLong(0);
                    aoaq.f78045b = cursor.getString(1);
                    aoaq.f78046c = cursor.getString(2);
                    aoaq.f78047d = cursor.getString(3);
                    arrayList.add(aoaq);
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aoaq aoaq2 = (aoaq) arrayList.get(i);
                try {
                    int i2 = this.f78053c.getApplicationInfo(aoaq2.f78047d, 0).uid;
                    String str = account2.name;
                    String str2 = account2.name;
                    String str3 = aoaq2.f78047d;
                    ClientContext clientContext = new ClientContext(i2, str, str2, str3, str3);
                    clientContext.mo17806d("https://www.googleapis.com/auth/plus.login");
                    clientContext.mo17798a("application_name", "100");
                    try {
                        this.f78052b.f77554e.mo42170a(clientContext, aoaq2.f78045b, aoaq2.f78046c);
                    } catch (VolleyError e) {
                        throw e;
                    } catch (gid e2) {
                    } catch (VolleyError e3) {
                        if (e3.networkResponse == null) {
                            break;
                        }
                        syncResult2.stats.numIoExceptions++;
                    }
                    arrayList2.add(ContentProviderOperation.newDelete(ContentUris.withAppendedId(anub.f77731a, aoaq2.f78044a)).build());
                } catch (PackageManager.NameNotFoundException e4) {
                    arrayList2.add(ContentProviderOperation.newDelete(ContentUris.withAppendedId(anub.f77731a, aoaq2.f78044a)).build());
                }
            }
            if (arrayList2.size() > 0) {
                try {
                    contentProviderClient.applyBatch(arrayList2);
                } catch (OperationApplicationException e5) {
                    Log.e("OASyncAdapter", "Failed to delete", e5);
                    syncResult2.databaseError = true;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 9217;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0170 A[Catch:{ RemoteException -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x017b A[SYNTHETIC] */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        ClientOzEventEntity clientOzEventEntity;
        ByteArrayInputStream byteArrayInputStream;
        long j;
        aoat aoat = this;
        Account account2 = account;
        ContentProviderClient contentProviderClient2 = contentProviderClient;
        SyncResult syncResult2 = syncResult;
        if (!"com.google.android.gms.plus.action".equals(str)) {
            return false;
        }
        try {
            aoat.m65710a(account2, contentProviderClient2, syncResult2);
            contentProviderClient2.delete(anua.f77730a, "timestamp<?", new String[]{Long.toString(System.currentTimeMillis() - 172800000)});
            Cursor query = contentProviderClient.query(anua.f77730a, aoap.f78043a, "accountName=? AND type=?", new String[]{account2.name, Integer.toString(1)}, "onBehalfOf, timestamp");
            try {
                HashMap hashMap = new HashMap();
                while (query.moveToNext()) {
                    ContentProviderClient contentProviderClient3 = contentProviderClient2;
                    String string = query.getString(0);
                    clientOzEventEntity = new ClientOzEventEntity();
                    byteArrayInputStream = new ByteArrayInputStream(string.getBytes());
                    new sja().mo25625a(byteArrayInputStream, clientOzEventEntity);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e) {
                    }
                    String string2 = query.getString(1);
                    aoas aoas = (aoas) hashMap.get(string2);
                    if (clientOzEventEntity == null) {
                        syncResult2.stats.numParseExceptions++;
                        aoat = this;
                        contentProviderClient2 = contentProviderClient3;
                    } else {
                        if (aoas == null) {
                            aoas = new aoas();
                            hashMap.put(string2, aoas);
                        }
                        long j2 = clientOzEventEntity.f82891d;
                        if (j2 > aoas.f78049a) {
                            aoas.f78049a = j2;
                        }
                        aoas.f78050b.add(clientOzEventEntity);
                        aoat = this;
                        contentProviderClient2 = contentProviderClient3;
                    }
                }
                query.close();
                hashMap.size();
                int myUid = Process.myUid();
                String str2 = account2.name;
                String str3 = account2.name;
                String packageName = getContext().getPackageName();
                ClientContext clientContext = new ClientContext(myUid, str2, str3, packageName, packageName);
                clientContext.mo17806d("https://www.googleapis.com/auth/plus.me");
                clientContext.mo17806d("https://www.googleapis.com/auth/plus.pages.manage");
                clientContext.mo17798a("application_name", "80");
                long j3 = 0;
                for (String str4 : hashMap.keySet()) {
                    aoas aoas2 = (aoas) hashMap.get(str4);
                    long j4 = aoas2.f78049a;
                    if (j4 > j3) {
                        j3 = j4;
                    }
                    ArrayList arrayList = aoas2.f78050b;
                    try {
                        anru anru = aoat.f78052b;
                        int e2 = spn.m35881e(getContext());
                        boolean z = getContext().getResources().getBoolean(C0126R.bool.plus_is_tablet);
                        ansg ansg = anru.f77552c;
                        String str5 = !z ? "4" : "10";
                        long currentTimeMillis = System.currentTimeMillis();
                        aogp aogp = new aogp();
                        aogp.f78310a = clientContext.f30215e;
                        aogp.f78315f.add(2);
                        aogp.f78311b = arrayList;
                        aogp.f78315f.add(3);
                        aogp.f78312c = str5;
                        aogp.f78315f.add(4);
                        aogp.f78313d = Integer.toString(e2);
                        aogp.f78315f.add(5);
                        aogp.f78314e = currentTimeMillis;
                        aogp.f78315f.add(6);
                        j = j3;
                        try {
                            ClientOzExtensionEntity clientOzExtensionEntity = new ClientOzExtensionEntity(aogp.f78315f, aogp.f78310a, aogp.f78311b, aogp.f78312c, aogp.f78313d, aogp.f78314e);
                            aodq aodq = ansg.f77583g;
                            StringBuilder sb = new StringBuilder("rpc/insertLog");
                            if (str4 != null) {
                                shd.m35269a(sb, "onBehalfOf", shd.m35267a(str4));
                            }
                            aodq.f78227a.mo25539a(clientContext, 1, sb.toString(), clientOzExtensionEntity);
                        } catch (VolleyError e3) {
                            e = e3;
                            if (e.networkResponse == null) {
                            }
                        } catch (gid | IOException e4) {
                        }
                    } catch (VolleyError e5) {
                        e = e5;
                        j = j3;
                        if (e.networkResponse == null) {
                            syncResult2.stats.numIoExceptions++;
                        }
                    } catch (gid | IOException e6) {
                        j = j3;
                    }
                    aoat = this;
                    j3 = j;
                }
                contentProviderClient.delete(anua.f77730a, "accountName=? AND type=? AND timestamp<=?", new String[]{account2.name, Integer.toString(1), Long.toString(j3)});
                return true;
            } catch (siy e7) {
                try {
                    byteArrayInputStream.close();
                    clientOzEventEntity = null;
                } catch (IOException e8) {
                    clientOzEventEntity = null;
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (RemoteException e9) {
            Log.e("OASyncAdapter", "Sync Failed", e9);
            syncResult2.databaseError = true;
            return true;
        }
    }
}
