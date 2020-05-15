package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.database.Cursor;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ashp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashp extends smx {

    /* renamed from: a */
    public static final /* synthetic */ int f88985a = 0;

    /* renamed from: b */
    private final String f88986b;

    public ashp(Context context, String str) {
        super(context, true, "subscribedfeeds");
        this.f88986b = str;
    }

    /* renamed from: a */
    public static void m74137a(Context context, Account account) {
        new rtg(context);
        if (cgvi.m147139d()) {
            rtg.m34396a(account, "subscribedfeeds", Bundle.EMPTY, 86400);
            rtg.m34395a(account, "com.google.android.gms.subscribedfeeds", Bundle.EMPTY);
            return;
        }
        rtg.m34396a(account, "com.google.android.gms.subscribedfeeds", Bundle.EMPTY, 86400);
        rtg.m34395a(account, "subscribedfeeds", Bundle.EMPTY);
    }

    /* renamed from: b */
    public static final String m74139b() {
        return !cgvi.m147139d() ? "com.google.android.gms.subscribedfeeds" : "subscribedfeeds";
    }

    /* renamed from: b */
    private static final void m74140b(Exception exc) {
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Soft failure: ");
        sb.append(valueOf);
        Log.w("SubscribedFeeds", sb.toString());
    }

    /* renamed from: a */
    private static final void m74138a(Exception exc) {
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Hard error: ");
        sb.append(valueOf);
        Log.w("SubscribedFeeds", sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return !"com.google.android.gms.subscribedfeeds".equals(this.f88986b) ? 8449 : 8450;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0307 A[Catch:{ IOException -> 0x0367, RemoteException -> 0x0365, OperationCanceledException -> 0x0363, camq -> 0x033c, AuthenticatorException -> 0x032d, camv -> 0x031e, all -> 0x031b }] */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        String str2;
        Throwable th;
        Cursor cursor;
        boolean z;
        boolean z2;
        String str3;
        Account account2 = account;
        SyncResult syncResult2 = syncResult;
        if ("com.google.android.gms.subscribedfeeds".equals(this.f88986b) && cgvi.f187809a.mo6606a().mo84541h()) {
            return true;
        }
        m74137a(getContext(), account2);
        ashz ashz = new ashz(getContext());
        try {
            Context context = getContext();
            String str4 = this.f88986b;
            Context context2 = getContext();
            String a = aaks.m21407a(context2);
            if (!TextUtils.isEmpty(a)) {
                long a2 = spn.getAndroidId(context2);
                if (a2 != 0) {
                    String hexString = Long.toHexString(a2);
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 24 + String.valueOf(hexString).length());
                    sb.append("gcm://?regId=");
                    sb.append(a);
                    sb.append("&androidId=");
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    camp camp = new camp(ashz, new canb(new asia()));
                    ashs ashs = r15;
                    ashs ashs2 = new ashs(context, str4, contentProviderClient, sb2, camp);
                    if (cgvi.f187809a.mo6606a().mo84539f() <= 0) {
                        str2 = "mail";
                        ashs.f88990c.mo74667a("gms_version", "20.15.15-000");
                    } else {
                        str2 = "oauth2:https://www.googleapis.com/auth/gsync";
                    }
                    ashf ashf = new ashf(account2, str2, adyd.m51363a(ashs.f88989b));
                    String str5 = account2.name;
                    ArrayList<camz> arrayList = new ArrayList();
                    Cursor cursor2 = null;
                    try {
                        String str6 = "_id";
                        String str7 = "feed";
                        String str8 = "_sync_id";
                        String str9 = "service";
                        if (ashs.f88991d.equals("subscribedfeeds")) {
                            String str10 = str9;
                            String str11 = str8;
                            String str12 = str6;
                            String str13 = str7;
                            cursor = ashs.f88988a.query(aymv.f97996a, null, "_sync_account=?", new String[]{str5}, null);
                            while (cursor != null) {
                                try {
                                    if (!cursor.moveToNext()) {
                                        break;
                                    }
                                    String str14 = str12;
                                    String str15 = str10;
                                    String str16 = str13;
                                    arrayList.add(ashs.mo49161a(cursor.getString(cursor.getColumnIndex(str10)), cursor.getString(cursor.getColumnIndex(str11)), cursor.getString(cursor.getColumnIndex(str13)), Long.valueOf(cursor.getLong(cursor.getColumnIndex(str12))).longValue()));
                                    str12 = str14;
                                    str13 = str16;
                                    str10 = str15;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                    }
                                    throw th;
                                }
                            }
                        } else if (ashs.f88991d.equals("com.google.android.gms.subscribedfeeds")) {
                            cursor = ashs.f88988a.query(ashq.f88987a, null, "_sync_account=?", new String[]{str5}, null);
                            while (cursor != null) {
                                try {
                                    if (!cursor.moveToNext()) {
                                        break;
                                    }
                                    String str17 = str9;
                                    String str18 = str8;
                                    String str19 = str6;
                                    String str20 = str7;
                                    arrayList.add(ashs.mo49161a(cursor.getString(cursor.getColumnIndex(str9)), cursor.getString(cursor.getColumnIndex(str8)), cursor.getString(cursor.getColumnIndex(str7)), Long.valueOf(cursor.getLong(cursor.getColumnIndex(str6))).longValue()));
                                    str8 = str18;
                                    str9 = str17;
                                    str6 = str19;
                                    str7 = str20;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            cursor = null;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        camp camp2 = ashs.f88992e;
                        camr camr = ashs.f88990c;
                        String str21 = "https://android.clients.google.com/gsync/sub";
                        if (!TextUtils.isEmpty(null) || !camr.f175311a.isEmpty()) {
                            if (TextUtils.isEmpty(null)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str21);
                                Set<String> keySet = camr.f175311a.keySet();
                                if (!str21.contains("?")) {
                                    sb3.append('?');
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                for (String str22 : keySet) {
                                    String str23 = (String) camr.f175311a.get(str22);
                                    if (str23 != null) {
                                        if (!z2) {
                                            sb3.append('&');
                                        }
                                        sb3.append(str22);
                                        sb3.append('=');
                                        try {
                                            str3 = URLEncoder.encode(str23, "UTF-8");
                                        } catch (UnsupportedEncodingException e) {
                                            Log.w("QueryParamsImpl", "UTF-8 not supported -- should not happen. Using default encoding.", e);
                                            str3 = URLEncoder.encode(str23);
                                        }
                                        sb3.append(str3);
                                        z2 = false;
                                    }
                                }
                                str21 = sb3.toString();
                            } else if (camr.f175311a.isEmpty()) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf((Object) null).length() + 45);
                                sb4.append(str21);
                                sb4.append("/null");
                                str21 = sb4.toString();
                            } else {
                                throw new IllegalStateException("Cannot set both an entry ID and other query parameters");
                            }
                        }
                        camw[] camwArr = new camw[1];
                        new ashn(camp2, camwArr, str21).mo49160a(ashf);
                        camwArr[0].mo74676e();
                        ArrayList<camz> arrayList2 = new ArrayList();
                        while (camwArr[0].mo74673b()) {
                            arrayList2.add((camz) camwArr[0].mo74678g());
                        }
                        camwArr[0].mo74675d();
                        for (camz camz : arrayList2) {
                            if (camz == null || camz.f175334p == null) {
                                z = false;
                            } else {
                                Iterator it = arrayList.iterator();
                                z = false;
                                while (it.hasNext()) {
                                    camz camz2 = (camz) it.next();
                                    if (camz2 != null && camz.f175334p.equals(camz2.f175334p)) {
                                        it.remove();
                                        z = true;
                                    }
                                }
                            }
                            if (!z) {
                                new ashm(ashs.f88992e, camz).mo49160a(ashf);
                            }
                        }
                        for (camz camz3 : arrayList) {
                            new ashl(ashs.f88992e, camz3).mo49160a(ashf);
                        }
                        return true;
                    } catch (Throwable th4) {
                        th = th4;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } else {
                    throw new IOException("No Android ID assigned to this device yet");
                }
            } else {
                throw new IOException("GmsCore hasn't registered with GCM yet");
            }
        } catch (IOException e2) {
            e = e2;
            m74140b(e);
            syncResult2.stats.numIoExceptions++;
            return false;
        } catch (RemoteException e3) {
            e = e3;
            m74140b(e);
            syncResult2.stats.numIoExceptions++;
            return false;
        } catch (OperationCanceledException e4) {
            e = e4;
            m74140b(e);
            syncResult2.stats.numIoExceptions++;
            return false;
        } catch (camq e5) {
            camq camq = e5;
            int i = camq.f175310a;
            if (i != 401) {
                if (i != 403) {
                    m74140b(camq);
                    syncResult2.stats.numIoExceptions++;
                    return false;
                }
            }
            m74138a(camq);
            syncResult2.stats.numAuthExceptions++;
            return false;
        } catch (AuthenticatorException e6) {
            m74138a(e6);
            syncResult2.stats.numAuthExceptions++;
            return false;
        } catch (camv e7) {
            m74138a(e7);
            syncResult2.stats.numParseExceptions++;
            return false;
        } catch (Throwable th5) {
            throw th5;
        }
    }
}
