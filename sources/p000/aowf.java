package p000;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.PeriodicSync;
import android.content.SyncResult;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: aowf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowf extends smx {

    /* renamed from: a */
    private final aowg f83734a;

    /* renamed from: b */
    private final aowa f83735b = new aowa(this.f83734a.f83755a);

    public aowf(Context context) {
        super(context, "reminders");
        this.f83734a = m69689a(context);
    }

    /* renamed from: a */
    public static aowg m69689a(Context context) {
        return new aowg(new shl(context, (String) aoss.f83542a.mo58455c(), ((Integer) aoss.f83543b.mo58455c()).intValue(), context.getApplicationInfo().uid, 5632));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 5633;
    }

    /* renamed from: b */
    private static final boolean m69696b(Context context) {
        Long l;
        long j = aowx.m69749a(context).getLong("last_down_sync_time_millis", 0);
        if (j != 0) {
            l = Long.valueOf(j);
        } else {
            l = null;
        }
        return l == null || (System.currentTimeMillis() - l.longValue()) / 1000 > ((Long) aoss.f83563v.mo58455c()).longValue();
    }

    /* renamed from: a */
    static blrk m69690a(Context context, String str, boolean z) {
        String str2;
        bxvd da = blrk.f127482d.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18);
            sb.append("Reminders-Android_");
            sb.append(str);
            str2 = sb.toString();
        } else {
            str2 = "Reminders-Android";
        }
        String a = sic.m35342a(context, str2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blrk blrk = (blrk) da.f164949b;
        a.getClass();
        blrk.f127484a |= 2;
        blrk.f127486c = a;
        if (z) {
            bxvd da2 = bloy.f127165c.mo74144da();
            String id = TimeZone.getDefault().getID();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bloy bloy = (bloy) da2.f164949b;
            id.getClass();
            bloy.f127167a |= 1;
            bloy.f127168b = id;
            bloy bloy2 = (bloy) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrk blrk2 = (blrk) da.f164949b;
            bloy2.getClass();
            blrk2.f127485b = bloy2;
            blrk2.f127484a |= 1;
        }
        return (blrk) da.mo74062i();
    }

    /* renamed from: a */
    public static ClientContext m69691a(Context context, String str) {
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        clientContext.mo17806d((String) aoss.f83545d.mo58455c());
        return clientContext;
    }

    /* renamed from: a */
    private final void m69692a(Account account) {
        Context context = getContext();
        long longValue = ((Long) aoss.f83562u.mo58455c()).longValue();
        boolean z = false;
        for (PeriodicSync periodicSync : ContentResolver.getPeriodicSyncs(account, "com.google.android.gms.reminders")) {
            if (periodicSync.extras == null || !periodicSync.extras.containsKey("periodic") || periodicSync.period != longValue) {
                long j = periodicSync.period;
                StringBuilder sb = new StringBuilder(61);
                sb.append("Removing stale periodic sync with period:");
                sb.append(j);
                sb.toString();
                new rtg(context);
                rtg.m34395a(account, "com.google.android.gms.reminders", periodicSync.extras);
            } else {
                z = true;
            }
        }
        if (!z) {
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append("Adding new periodic sync with period:");
            sb2.append(longValue);
            sb2.toString();
            Bundle bundle = new Bundle();
            bundle.putBoolean("periodic", true);
            new rtg(context);
            rtg.m34396a(account, "com.google.android.gms.reminders", bundle, longValue);
        }
    }

    /* renamed from: a */
    public static void m69693a(aosi aosi) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("reminders_upload_sync", true);
        bundle.putBoolean("expedited", true);
        bundle.putBoolean("ignore_settings", true);
        bundle.putBoolean("ignore_backoff", true);
        ContentResolver.requestSync(aosi.f83508b, "com.google.android.gms.reminders", bundle);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:158:0x04b4 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:542:0x020e */
    /* JADX INFO: additional move instructions added (5) to help type inference */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String[]], assign insn: 0x01d6: NEW_ARRAY  (r2v10 ? I:java.lang.String[]) = (4 int) type: java.lang.String[] */
    /* JADX WARN: Type inference failed for: r11v2, assign insn: PHI: (r11v2 ?) = (r11v60 android.content.Context), (r11v61 android.content.Context), (r11v63 int), (r11v65 int), (r11v66 int) binds: [B:133:0x043c, B:132:0x0434, B:131:0x0430, B:121:?, B:130:0x042c] */
    /* JADX WARN: Type inference failed for: r24v37, assign insn: 0x0267: CONST  (r24v37 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r24v38, assign insn: PHI: (r24v38 ?) = (r24v37 ?), (r24v58 ?) binds: [B:72:0x0253, B:93:0x02f1] */
    /* JADX WARN: Type inference failed for: r16v11, types: [java.lang.String], assign insn: PHI: (r16v11 ?) = (r16v12 ?), (r16v13 ?) binds: [B:129:0x03f6, B:126:0x03cb] */
    /* JADX WARN: Type inference failed for: r16v12, assign insn: 0x0425: MOVE  (r16v12 ? I:?[OBJECT, ARRAY]) = (r16v11 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r16v13, assign insn: ?: MOVE  (r16v13 ?) = (r16v4 android.content.ContentResolver) */
    /* JADX WARN: Type inference failed for: r24v58, assign insn: ?: MOVE  (r24v58 ?) = (r24v45 android.content.ContentResolver) */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04ac, code lost:
        throw new p000.aown(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04ae, code lost:
        r3 = r0;
        r24 = r6;
        r11 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0a89, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0a8a, code lost:
        r24 = r6;
        r3 = r8;
        r6 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03f6 A[Catch:{ chuw -> 0x03c6, all -> 0x0cac }, LOOP:3: B:127:0x03f2->B:129:0x03f6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0445 A[Catch:{ chuw -> 0x03c6, all -> 0x0cac }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0575 A[Catch:{ chuw -> 0x0a02, chuw -> 0x09bb, chuw -> 0x0913, chuw -> 0x08b7, chuw -> 0x083f, chuw -> 0x07ca, chuw -> 0x0744, chuw -> 0x06c5, chuw -> 0x0646, chuw -> 0x05ce, aowh -> 0x0a3e, aown -> 0x0a3c }] */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0a76 A[Catch:{ chuw -> 0x03c6, all -> 0x0cac }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0aad A[Catch:{ chuw -> 0x03c6, all -> 0x0cac }] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0ac4 A[Catch:{ chuw -> 0x03c6, all -> 0x0cac }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0adc A[Catch:{ chuw -> 0x03c6, all -> 0x0cac }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0c6a A[Catch:{ chuw -> 0x03c6, all -> 0x0cac }] */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0c82 A[Catch:{ gid -> 0x0ca7, chuw -> 0x0ca2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0cba A[Catch:{ gid -> 0x0ca7, chuw -> 0x0ca2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0d2e  */
    /* JADX WARNING: Removed duplicated region for block: B:553:0x042c A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    private final boolean m69694a(Account account, Bundle bundle, String str, SyncResult syncResult) {
        boolean z;
        boolean z2;
        ClientContext clientContext;
        Context context;
        char c;
        boolean z3;
        ClientContext clientContext2;
        Context context2;
        int i;
        ContentResolver contentResolver;
        char c2;
        aowh aowh;
        int i2;
        List<blox> list;
        String str2;
        aown aown;
        blpf blpf;
        blpo blpo;
        String str3;
        blpm blpm;
        blpu blpu;
        blps blps;
        blru blru;
        blro blro;
        blqn blqn;
        blql blql;
        blph blph;
        int size;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ContentResolver contentResolver2;
        blrk blrk;
        int i10;
        ContentValues contentValues;
        int i11;
        int i12;
        ? r16;
        ContentResolver contentResolver3;
        int i13;
        ContentResolver contentResolver4;
        ContentResolver contentResolver5;
        Account account2 = account;
        Bundle bundle2 = bundle;
        String str4 = str;
        Context context3 = getContext();
        new Object[1][0] = account2.name;
        if (((Boolean) aoss.f83565x.mo58455c()).booleanValue()) {
            aowu.m69736c("RemindersSync", "Only user requested syncs are run during API tests", new Object[0]);
            return false;
        } else if (bundle2 != null) {
            String valueOf = String.valueOf(bundle);
            String valueOf2 = String.valueOf(syncResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
            sb.append("onPerformSync extras: ");
            sb.append(valueOf);
            sb.append(" authority: ");
            sb.append(str4);
            sb.append(" syncResult: ");
            sb.append(valueOf2);
            sb.toString();
            for (String str5 : bundle.keySet()) {
                String valueOf3 = String.valueOf(bundle2.get(str5));
                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 19 + String.valueOf(valueOf3).length());
                sb2.append("extra key: ");
                sb2.append(str5);
                sb2.append(" value: ");
                sb2.append(valueOf3);
                sb2.toString();
            }
            boolean z4 = bundle2.getBoolean("initialize", false);
            boolean z5 = bundle2.getBoolean("reminders_initialization_sync", false);
            boolean z6 = bundle2.getBoolean("upload", false) || bundle2.getBoolean("reminders_upload_sync", false);
            boolean z7 = bundle2.getBoolean("periodic", false);
            boolean equals = (bundle2.containsKey("feed") ? bundle2.getString("feed") : "").equals(aoss.f83547f.mo58455c());
            boolean z8 = bundle2.getBoolean("chime", false);
            ContentResolver contentResolver6 = "error_count";
            boolean z9 = bundle2.getBoolean("resub", false);
            if (!z4 && !z5 && !z6 && !z7 && !equals && !z8 && !z9) {
                aowu.m69735b("RemindersSync", "Found sync condition that we don't recognize, aborting.", new Object[0]);
                return false;
            }
            aosi a = aosf.m69444a(context3, account2);
            if (a == null) {
                aowu.m69736c("RemindersSync", "Reminder account not found, aborting.", new Object[0]);
                return false;
            }
            if (!cgid.m145535b()) {
                z2 = z5;
                z = equals;
            } else if (!z9) {
                z2 = z5;
                z = equals;
                aymw.m84286a(context3.getContentResolver(), account2, "com.google.android.gms.reminders", (String) aoss.f83548g.mo58455c(), new String[0]);
                if (!z4) {
                    ContentResolver.setIsSyncable(account2, str4, 1);
                    ContentResolver.setSyncAutomatically(account2, str4, true);
                    m69692a(account);
                    if (bundle2.getBoolean("reminders_skip_sync_on_initialization", false)) {
                        return false;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("expedited", true);
                    bundle3.putBoolean("force", true);
                    bundle3.putBoolean("reminders_initialization_sync", true);
                    ContentResolver.requestSync(account2, "com.google.android.gms.reminders", bundle3);
                    return true;
                } else if (z7 && !m69696b(context3)) {
                    return false;
                } else {
                    ClientContext a2 = m69691a(context3, account2.name);
                    try {
                        boolean z10 = z7;
                        aowp aowp = new aowp(getContext(), this.f83734a, this.f83735b, a2, a, syncResult);
                        int i14 = 2;
                        int i15 = 3;
                        ContentResolver contentResolver7 = aowp.f83768e;
                        Cursor query = contentResolver7.query(aota.f83571a, new String[]{"_id", "operation_api", "operation_request", contentResolver6}, "account_id=?", new String[]{String.valueOf(aowp.f83767d.f83507a)}, "_id");
                        if (query == null) {
                            clientContext2 = a2;
                            context2 = context3;
                        } else if (query.getCount() != 0) {
                            while (query.moveToNext()) {
                                if (!((Boolean) aoss.f83523B.mo58455c()).booleanValue() || query.getCount() - query.getPosition() < i14) {
                                    clientContext = a2;
                                    context = context3;
                                    contentResolver = contentResolver6;
                                    c2 = 65535;
                                    i = context3;
                                } else {
                                    int i16 = query.getInt(i15);
                                    if (i16 == 0) {
                                        i5 = ((Integer) aoss.f83524C.mo58455c()).intValue();
                                    } else {
                                        i5 = i16 == 1 ? ((Integer) aoss.f83525D.mo58455c()).intValue() : 1;
                                    }
                                    if (i5 >= i14) {
                                        int position = query.getPosition();
                                        ArrayList arrayList = new ArrayList();
                                        ArrayList arrayList2 = new ArrayList();
                                        ArrayList arrayList3 = new ArrayList();
                                        blrk blrk2 = null;
                                        ? r24 = 1;
                                        int i17 = 0;
                                        int i18 = 0;
                                        int i19 = 0;
                                        int i20 = 0;
                                        Context context4 = context3;
                                        while (true) {
                                            int i21 = i5;
                                            long j = query.getLong(0);
                                            context = context4;
                                            int i22 = query.getInt(1);
                                            clientContext = a2;
                                            byte[] blob = query.getBlob(2);
                                            int i23 = query.getInt(3);
                                            if (i22 == 11) {
                                                i6 = i17;
                                                i7 = i18;
                                                i8 = i19;
                                                i9 = i20;
                                                contentResolver2 = r24;
                                            } else {
                                                aowi aowi = new aowi();
                                                if (aowp.mo46962a(i22, blob, aowi) != null) {
                                                    i6 = i17 + 1;
                                                    arrayList.add(Long.valueOf(j));
                                                    arrayList2.add(Integer.valueOf(i23));
                                                    arrayList3.add((bloz) aowi.f83762e.mo74062i());
                                                    if (r24 == 0) {
                                                        contentResolver5 = r24;
                                                    } else {
                                                        contentResolver5 = r24;
                                                        if (i6 != 1) {
                                                            contentResolver5 = r24;
                                                            if (!aowi.f83758a.equals(blrk2)) {
                                                                contentResolver5 = null;
                                                            }
                                                        }
                                                    }
                                                    blrk2 = aowi.f83758a;
                                                    i18 += aowi.f83759b;
                                                    i19 += aowi.f83760c;
                                                    i20 += aowi.f83761d;
                                                    contentResolver4 = contentResolver5;
                                                } else {
                                                    aowp.mo46964a(j);
                                                    i6 = i17;
                                                    contentResolver4 = r24;
                                                }
                                                if (query.moveToNext() && i6 < (i5 = i21)) {
                                                    i17 = i6;
                                                    context4 = context;
                                                    a2 = clientContext;
                                                    r24 = contentResolver4;
                                                }
                                            }
                                        }
                                        i7 = i18;
                                        i8 = i19;
                                        i9 = i20;
                                        contentResolver2 = contentResolver4;
                                        int position2 = query.getPosition() - 1;
                                        query.moveToPosition(position);
                                        if (i6 >= 2) {
                                            bxvd da = blpa.f127184d.mo74144da();
                                            blrk blrk3 = blrk2;
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            blpa blpa = (blpa) da.f164949b;
                                            if (!blpa.f127188c.mo73666a()) {
                                                blpa.f127188c = GeneratedMessageLite.m124021a(blpa.f127188c);
                                            }
                                            bxsy.m123078a(arrayList3, blpa.f127188c);
                                            if (contentResolver2 == null) {
                                                blrk = aowp.m69706a(aowp.f83771h);
                                            } else {
                                                blrk = blrk3;
                                            }
                                            if (blrk != null) {
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                blpa blpa2 = (blpa) da.f164949b;
                                                blrk.getClass();
                                                blpa2.f127187b = blrk;
                                                blpa2.f127186a |= 1;
                                            }
                                            try {
                                                aowp.f83764a.mo46960a(aowp.f83766c, (blpa) da.mo74062i());
                                                int i24 = i6;
                                                try {
                                                    aowp.f83769f.stats.numUpdates += (long) i7;
                                                    aowp.f83769f.stats.numInserts += (long) i8;
                                                    aowp.f83769f.stats.numDeletes += (long) i9;
                                                    ContentResolver contentResolver8 = aowp.f83768e;
                                                    Uri uri = aota.f83571a;
                                                    String a3 = aowr.m69718a(",", arrayList);
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(a3).length() + 19);
                                                    sb3.append("operation._id IN (");
                                                    sb3.append(a3);
                                                    sb3.append(")");
                                                    contentResolver8.delete(uri, sb3.toString(), null);
                                                    query.moveToPosition(position2);
                                                    contentResolver = contentResolver6;
                                                    c2 = 0;
                                                    i = position2;
                                                    contentResolver7 = i24;
                                                } catch (chuw e) {
                                                    e = e;
                                                    i10 = i24;
                                                    int i25 = new aowl(e).f83763c;
                                                    StringBuilder sb4 = new StringBuilder(47);
                                                    sb4.append("BatchMutate failed with error code: ");
                                                    sb4.append(i25);
                                                    aowu.m69733a("RemindersSync", sb4.toString(), new Object[0]);
                                                    contentValues = new ContentValues();
                                                    i11 = 0;
                                                    r16 = contentResolver6;
                                                    contentResolver3 = position2;
                                                    i12 = i10;
                                                    while (true) {
                                                        i13 = i12;
                                                        if (i11 >= i13) {
                                                        }
                                                        contentValues.put((String) r16, Integer.valueOf(((Integer) arrayList2.get(i11)).intValue() + 1));
                                                        ContentResolver contentResolver9 = aowp.f83768e;
                                                        contentResolver9.update(ContentUris.withAppendedId(aota.f83571a, ((Long) arrayList.get(i11)).longValue()), contentValues, null, null);
                                                        i11++;
                                                        r16 = r16;
                                                        i12 = i13;
                                                        contentResolver3 = contentResolver9;
                                                    }
                                                } catch (Throwable th) {
                                                    Throwable th2 = th;
                                                    query.close();
                                                    throw th2;
                                                }
                                            } catch (chuw e2) {
                                                e = e2;
                                                i10 = i6;
                                                int i252 = new aowl(e).f83763c;
                                                StringBuilder sb42 = new StringBuilder(47);
                                                sb42.append("BatchMutate failed with error code: ");
                                                sb42.append(i252);
                                                aowu.m69733a("RemindersSync", sb42.toString(), new Object[0]);
                                                contentValues = new ContentValues();
                                                i11 = 0;
                                                r16 = contentResolver6;
                                                contentResolver3 = position2;
                                                i12 = i10;
                                                while (true) {
                                                    i13 = i12;
                                                    if (i11 >= i13) {
                                                        contentValues.put((String) r16, Integer.valueOf(((Integer) arrayList2.get(i11)).intValue() + 1));
                                                        ContentResolver contentResolver92 = aowp.f83768e;
                                                        contentResolver92.update(ContentUris.withAppendedId(aota.f83571a, ((Long) arrayList.get(i11)).longValue()), contentValues, null, null);
                                                        i11++;
                                                        r16 = r16;
                                                        i12 = i13;
                                                        contentResolver3 = contentResolver92;
                                                    } else {
                                                        contentResolver = r16;
                                                        c2 = 1;
                                                        contentResolver7 = i12;
                                                        i = contentResolver3;
                                                        if (c2 != 0) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            contentResolver = contentResolver6;
                                            c2 = 65535;
                                            contentResolver7 = contentResolver2;
                                            i = position2;
                                        }
                                    } else {
                                        clientContext = a2;
                                        context = context3;
                                        contentResolver = contentResolver6;
                                        c2 = 65535;
                                        i = context3;
                                    }
                                }
                                if (c2 != 0) {
                                    contentResolver7 = contentResolver;
                                    contentResolver6 = contentResolver7;
                                    context3 = context;
                                    a2 = clientContext;
                                    i15 = 3;
                                    i14 = 2;
                                } else if (c2 != 1) {
                                    long j2 = query.getLong(0);
                                    int i26 = query.getInt(1);
                                    byte[] blob2 = query.getBlob(2);
                                    int i27 = query.getInt(3);
                                    try {
                                        bxxc a4 = aowp.mo46962a(i26, blob2, null);
                                        if (a4 != null) {
                                            switch (i26) {
                                                case 0:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    blpf = (blpf) a4;
                                                    String valueOf4 = String.valueOf(aowp.f83764a.mo46955a(aowp.f83766c, blpf));
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 18);
                                                    sb5.append("BumpTask response:");
                                                    sb5.append(valueOf4);
                                                    sb5.toString();
                                                    aowp.f83769f.stats.numUpdates++;
                                                    break;
                                                case 1:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    blpo = (blpo) a4;
                                                    aowg aowg = aowp.f83764a;
                                                    ClientContext clientContext3 = aowp.f83766c;
                                                    if (aowg.f83737c == null) {
                                                        aowg.f83737c = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/CreateTask", ciie.m150370a(blpo.f127258h), ciie.m150370a(blpp.f127268c));
                                                    }
                                                    blpp blpp = (blpp) aowg.f83755a.mo25553a(aowg.f83737c, clientContext3, blpo, (long) aowg.f83736b, TimeUnit.MILLISECONDS);
                                                    if (blpp != null) {
                                                        blrw blrw = blpp.f127271b;
                                                        if (blrw == null) {
                                                            blrw = blrw.f127541c;
                                                        }
                                                        if ((blrw.f127543a & 2) != 0) {
                                                            blrw blrw2 = blpp.f127271b;
                                                            if (blrw2 == null) {
                                                                blrw2 = blrw.f127541c;
                                                            }
                                                            str3 = blrw2.f127544b;
                                                        } else {
                                                            str3 = "";
                                                        }
                                                        aovd a5 = aovd.m69610a();
                                                        blox blox = blpp.f127270a;
                                                        if (blox == null) {
                                                            blox = blox.f127160d;
                                                        }
                                                        a5.mo46930a(blox, str3);
                                                    }
                                                    aowp.f83769f.stats.numInserts++;
                                                    blox blox2 = blpp.f127270a;
                                                    if (blox2 == null) {
                                                        blox2 = blox.f127160d;
                                                    }
                                                    String valueOf5 = String.valueOf(blox2);
                                                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 22);
                                                    sb6.append("Create response: newId");
                                                    sb6.append(valueOf5);
                                                    sb6.toString();
                                                    break;
                                                case 2:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    blpm = (blpm) a4;
                                                    String valueOf6 = String.valueOf(aowp.f83764a.mo46957a(aowp.f83766c, blpm));
                                                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf6).length() + 26);
                                                    sb7.append("CreateRecurrence response:");
                                                    sb7.append(valueOf6);
                                                    sb7.toString();
                                                    aowp.f83769f.stats.numInserts++;
                                                    break;
                                                case 3:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    blpu = (blpu) a4;
                                                    aowg aowg2 = aowp.f83764a;
                                                    ClientContext clientContext4 = aowp.f83766c;
                                                    if (aowg.f83738d == null) {
                                                        aowg.f83738d = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/DeleteTask", ciie.m150370a(blpu.f127295d), ciie.m150370a(blpv.f127300a));
                                                    }
                                                    String valueOf7 = String.valueOf((blpv) aowg2.f83755a.mo25553a(aowg.f83738d, clientContext4, blpu, (long) aowg.f83736b, TimeUnit.MILLISECONDS));
                                                    StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf7).length() + 16);
                                                    sb8.append("Delete response:");
                                                    sb8.append(valueOf7);
                                                    sb8.toString();
                                                    aowp.f83769f.stats.numDeletes++;
                                                    break;
                                                case 4:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    blps = (blps) a4;
                                                    aowg aowg3 = aowp.f83764a;
                                                    ClientContext clientContext5 = aowp.f83766c;
                                                    if (aowg.f83739e == null) {
                                                        aowg.f83739e = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/DeleteRecurrence", ciie.m150370a(blps.f127286e), ciie.m150370a(blpt.f127292a));
                                                    }
                                                    String valueOf8 = String.valueOf((blpt) aowg3.f83755a.mo25553a(aowg.f83739e, clientContext5, blps, (long) aowg.f83736b, TimeUnit.MILLISECONDS));
                                                    StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf8).length() + 26);
                                                    sb9.append("DeleteRecurrence response:");
                                                    sb9.append(valueOf8);
                                                    sb9.toString();
                                                    aowp.f83769f.stats.numDeletes++;
                                                    break;
                                                case 5:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    blru = (blru) a4;
                                                    aowg aowg4 = aowp.f83764a;
                                                    ClientContext clientContext6 = aowp.f83766c;
                                                    if (aowg.f83742h == null) {
                                                        aowg.f83742h = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/UpdateTask", ciie.m150370a(blru.f127527g), ciie.m150370a(blrv.f127536b));
                                                    }
                                                    aowp.f83769f.stats.numUpdates++;
                                                    blrj blrj = ((blrv) aowg4.f83755a.mo25553a(aowg.f83742h, clientContext6, blru, (long) aowg.f83736b, TimeUnit.MILLISECONDS)).f127538a;
                                                    if (blrj == null) {
                                                        blrj = blrj.f127456w;
                                                    }
                                                    blox blox3 = blrj.f127459b;
                                                    if (blox3 == null) {
                                                        blox3 = blox.f127160d;
                                                    }
                                                    String valueOf9 = String.valueOf(blox3);
                                                    StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf9).length() + 22);
                                                    sb10.append("Update response: newId");
                                                    sb10.append(valueOf9);
                                                    sb10.toString();
                                                    break;
                                                case 6:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    blro = (blro) a4;
                                                    aowg aowg5 = aowp.f83764a;
                                                    ClientContext clientContext7 = aowp.f83766c;
                                                    if (aowg.f83744j == null) {
                                                        aowg.f83744j = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/UpdateRecurrence", ciie.m150370a(blro.f127492g), ciie.m150370a(blrp.f127501a));
                                                    }
                                                    String valueOf10 = String.valueOf((blrp) aowg5.f83755a.mo25553a(aowg.f83744j, clientContext7, blro, (long) aowg.f83736b, TimeUnit.MILLISECONDS));
                                                    StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf10).length() + 26);
                                                    sb11.append("UpdateRecurrence response:");
                                                    sb11.append(valueOf10);
                                                    sb11.toString();
                                                    aowp.f83769f.stats.numUpdates++;
                                                    break;
                                                case 7:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    blqn = (blqn) a4;
                                                    aowg aowg6 = aowp.f83764a;
                                                    ClientContext clientContext8 = aowp.f83766c;
                                                    if (aowg.f83745k == null) {
                                                        aowg.f83745k = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/MakeTaskRecurring", ciie.m150370a(blqn.f127372g), ciie.m150370a(blqo.f127381a));
                                                    }
                                                    String valueOf11 = String.valueOf((blqo) aowg6.f83755a.mo25553a(aowg.f83745k, clientContext8, blqn, (long) aowg.f83736b, TimeUnit.MILLISECONDS));
                                                    StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf11).length() + 27);
                                                    sb12.append("MakeTaskRecurring response:");
                                                    sb12.append(valueOf11);
                                                    sb12.toString();
                                                    aowp.f83769f.stats.numUpdates++;
                                                    break;
                                                case 8:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    blql = (blql) a4;
                                                    aowg aowg7 = aowp.f83764a;
                                                    ClientContext clientContext9 = aowp.f83766c;
                                                    if (aowg.f83746l == null) {
                                                        aowg.f83746l = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/MakeRecurrenceSingleInstance", ciie.m150370a(blql.f127360g), ciie.m150370a(blqm.f127369a));
                                                    }
                                                    String valueOf12 = String.valueOf((blqm) aowg7.f83755a.mo25553a(aowg.f83746l, clientContext9, blql, (long) aowg.f83736b, TimeUnit.MILLISECONDS));
                                                    StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf12).length() + 38);
                                                    sb13.append("MakeRecurrenceSingleInstance response:");
                                                    sb13.append(valueOf12);
                                                    sb13.toString();
                                                    aowp.f83769f.stats.numUpdates++;
                                                    break;
                                                case 9:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    blph = (blph) a4;
                                                    blpi a6 = aowp.f83764a.mo46956a(aowp.f83766c, blph);
                                                    aowp.f83769f.stats.numUpdates++;
                                                    String valueOf13 = String.valueOf(a6);
                                                    StringBuilder sb14 = new StringBuilder(String.valueOf(valueOf13).length() + 27);
                                                    sb14.append("Change recurrence response:");
                                                    sb14.append(valueOf13);
                                                    sb14.toString();
                                                    break;
                                                case 10:
                                                    blpd blpd = (blpd) a4;
                                                    try {
                                                        aowg aowg8 = aowp.f83764a;
                                                        ClientContext clientContext10 = aowp.f83766c;
                                                        if (aowg.f83743i != null) {
                                                            contentResolver7 = contentResolver;
                                                        } else {
                                                            contentResolver7 = contentResolver;
                                                            try {
                                                                aowg.f83743i = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/BatchUpdateTask", ciie.m150370a(blpd.f127200d), ciie.m150370a(blpe.f127206c));
                                                            } catch (chuw e3) {
                                                                e = e3;
                                                                i4 = i27;
                                                                chuw chuw = e;
                                                                ArrayList arrayList4 = new ArrayList();
                                                                bxwc bxwc = blpd.f127204c;
                                                                size = bxwc.size();
                                                                for (i3 = 0; i3 < size; i3++) {
                                                                    blox blox4 = ((blpc) bxwc.get(i3)).f127196b;
                                                                    if (blox4 == null) {
                                                                        blox4 = blox.f127160d;
                                                                    }
                                                                    arrayList4.add(blox4);
                                                                }
                                                                throw new aowo(chuw, arrayList4);
                                                            } catch (aowh e4) {
                                                                e = e4;
                                                                aowh = e;
                                                                i2 = i27;
                                                                aowu.m69733a("RemindersSync", "Task operation %s failed: %s", Integer.valueOf(i26), Integer.valueOf(aowh.f83763c));
                                                                if (!aowh.mo46961a() && !aowp.mo46966a(j2, i2)) {
                                                                    aowp.mo46963a();
                                                                    try {
                                                                        query.close();
                                                                        c = 1;
                                                                        if (c == 1) {
                                                                        }
                                                                    } catch (gid e5) {
                                                                        e = e5;
                                                                        aowu.m69734a("RemindersSync", e, "AuthError", new Object[0]);
                                                                        syncResult.stats.numAuthExceptions++;
                                                                        return false;
                                                                    } catch (chuw e6) {
                                                                        e = e6;
                                                                        aowu.m69734a("RemindersSync", e, "NetworkError", new Object[0]);
                                                                        syncResult.stats.numIoExceptions++;
                                                                        return false;
                                                                    }
                                                                } else {
                                                                    aowu.m69733a("RemindersSync", "Removing the record from local DB and clearing option.", new Object[0]);
                                                                    list = aowh.f83756a;
                                                                    if (list != null) {
                                                                        for (blox blox5 : list) {
                                                                            aowp.mo46965a(blox5);
                                                                        }
                                                                    }
                                                                    str2 = aowh.f83757b;
                                                                    if (str2 != null) {
                                                                        ArrayList<blrj> arrayList5 = new ArrayList();
                                                                        blpl blpl = null;
                                                                        while (true) {
                                                                            try {
                                                                                bxvd da2 = blqj.f127345f.mo74144da();
                                                                                blrk blrk4 = aowp.f83770g;
                                                                                if (blrk4 != null) {
                                                                                    if (da2.f164950c) {
                                                                                        da2.mo74035c();
                                                                                        da2.f164950c = false;
                                                                                    }
                                                                                    blqj blqj = (blqj) da2.f164949b;
                                                                                    blrk4.getClass();
                                                                                    blqj.f127348b = blrk4;
                                                                                    blqj.f127347a |= 1;
                                                                                }
                                                                                if (da2.f164950c) {
                                                                                    da2.mo74035c();
                                                                                    da2.f164950c = false;
                                                                                }
                                                                                blqj.m107471a((blqj) da2.f164949b);
                                                                                bxvd da3 = blqy.f127421c.mo74144da();
                                                                                if (da3.f164950c) {
                                                                                    da3.mo74035c();
                                                                                    da3.f164950c = false;
                                                                                }
                                                                                blqy blqy = (blqy) da3.f164949b;
                                                                                blqy.f127424b = 2;
                                                                                blqy.f127423a |= 1;
                                                                                if (da2.f164950c) {
                                                                                    da2.mo74035c();
                                                                                    da2.f164950c = false;
                                                                                }
                                                                                blqj blqj2 = (blqj) da2.f164949b;
                                                                                blqy blqy2 = (blqy) da3.mo74062i();
                                                                                blqy2.getClass();
                                                                                blqj2.f127350d = blqy2;
                                                                                blqj2.f127347a |= 1048576;
                                                                                bxvd da4 = blou.f127145c.mo74144da();
                                                                                if (da4.f164950c) {
                                                                                    da4.mo74035c();
                                                                                    da4.f164950c = false;
                                                                                }
                                                                                blou blou = (blou) da4.f164949b;
                                                                                str2.getClass();
                                                                                blou.f127147a |= 1;
                                                                                blou.f127148b = str2;
                                                                                if (da2.f164950c) {
                                                                                    da2.mo74035c();
                                                                                    da2.f164950c = false;
                                                                                }
                                                                                blqj blqj3 = (blqj) da2.f164949b;
                                                                                blou blou2 = (blou) da4.mo74062i();
                                                                                blou2.getClass();
                                                                                if (!blqj3.f127349c.mo73666a()) {
                                                                                    blqj3.f127349c = GeneratedMessageLite.m124021a(blqj3.f127349c);
                                                                                }
                                                                                blqj3.f127349c.add(blou2);
                                                                                if (blpl != null) {
                                                                                    if (da2.f164950c) {
                                                                                        da2.mo74035c();
                                                                                        da2.f164950c = false;
                                                                                    }
                                                                                    blqj blqj4 = (blqj) da2.f164949b;
                                                                                    blpl.getClass();
                                                                                    blqj4.f127351e = blpl;
                                                                                    blqj4.f127347a |= 8388608;
                                                                                }
                                                                                blqk a7 = aowp.f83764a.mo46959a(aowp.f83766c, (blqj) da2.mo74062i());
                                                                                arrayList5.addAll(a7.f127356b);
                                                                                if ((a7.f127355a & 2) == 0) {
                                                                                    ArrayList arrayList6 = new ArrayList();
                                                                                    arrayList6.add(ContentProviderOperation.newUpdate(aotd.f83574a).withSelection("recurrence_id=? AND account_id=?", new String[]{str2, String.valueOf(aowp.f83767d.f83507a)}).withValue("deleted", 1).build());
                                                                                    for (blrj blrj2 : arrayList5) {
                                                                                        ContentValues contentValues2 = new ContentValues();
                                                                                        aowy.m69767a(contentValues2, blrj2);
                                                                                        contentValues2.put("account_id", Long.valueOf(aowp.f83767d.f83507a));
                                                                                        arrayList6.add(ContentProviderOperation.newInsert(aotd.f83575b).withValues(contentValues2).build());
                                                                                    }
                                                                                    sgq.m35236a(aowp.f83768e, arrayList6, "RemindersSync");
                                                                                } else {
                                                                                    blpl = a7.f127357c;
                                                                                    if (blpl == null) {
                                                                                        blpl = blpl.f127242a;
                                                                                    }
                                                                                }
                                                                            } catch (chuw e7) {
                                                                                aowu.m69734a("RemindersSync", e7, "NetworkError when listing recurrence", new Object[0]);
                                                                            } catch (gid e8) {
                                                                                aowu.m69734a("RemindersSync", e8, "GoogleAuthException when listing recurrence", new Object[0]);
                                                                            }
                                                                        }
                                                                    }
                                                                    aowp.mo46964a(j2);
                                                                    contentResolver6 = contentResolver7;
                                                                    context3 = context;
                                                                    a2 = clientContext;
                                                                    i15 = 3;
                                                                    i14 = 2;
                                                                }
                                                            } catch (aown e9) {
                                                                e = e9;
                                                                i = i27;
                                                                aown = e;
                                                                int i28 = aown.f83763c;
                                                                StringBuilder sb15 = new StringBuilder(73);
                                                                sb15.append("SetSnoozePreset operation failed ");
                                                                sb15.append(i28);
                                                                sb15.append(" for operation: ");
                                                                sb15.append(i26);
                                                                sb15.append(". ");
                                                                aowu.m69733a("RemindersSync", sb15.toString(), new Object[0]);
                                                                if (!aown.mo46961a() && !aowp.mo46966a(j2, i)) {
                                                                    aowp.mo46963a();
                                                                    query.close();
                                                                    c = 1;
                                                                    if (c == 1) {
                                                                    }
                                                                } else {
                                                                    aowu.m69733a("RemindersSync", "Removing the record from local DB and clearing operation.", new Object[0]);
                                                                    aowp.mo46964a(j2);
                                                                    contentResolver6 = contentResolver7;
                                                                    context3 = context;
                                                                    a2 = clientContext;
                                                                    i15 = 3;
                                                                    i14 = 2;
                                                                }
                                                            }
                                                        }
                                                        shl shl = aowg8.f83755a;
                                                        i4 = i27;
                                                        try {
                                                            blpe blpe = (blpe) shl.mo25553a(aowg.f83743i, clientContext10, blpd, (long) aowg.f83736b, TimeUnit.MILLISECONDS);
                                                            for (blrj blrj3 : blpe.f127208a) {
                                                                aowp.f83769f.stats.numUpdates++;
                                                                blox blox6 = blrj3.f127459b;
                                                                if (blox6 == null) {
                                                                    blox6 = blox.f127160d;
                                                                }
                                                                String valueOf14 = String.valueOf(blox6);
                                                                StringBuilder sb16 = new StringBuilder(String.valueOf(valueOf14).length() + 28);
                                                                sb16.append("Batch update response: newId");
                                                                sb16.append(valueOf14);
                                                                sb16.toString();
                                                            }
                                                            if (blpe.f127209b.size() != 0) {
                                                                for (blox blox7 : blpe.f127209b) {
                                                                    aowp.mo46965a(blox7);
                                                                }
                                                            }
                                                        } catch (chuw e10) {
                                                            e = e10;
                                                            chuw chuw2 = e;
                                                            ArrayList arrayList42 = new ArrayList();
                                                            bxwc bxwc2 = blpd.f127204c;
                                                            size = bxwc2.size();
                                                            while (i3 < size) {
                                                            }
                                                            throw new aowo(chuw2, arrayList42);
                                                        }
                                                    } catch (chuw e11) {
                                                        e = e11;
                                                        contentResolver7 = contentResolver;
                                                        i4 = i27;
                                                        chuw chuw22 = e;
                                                        ArrayList arrayList422 = new ArrayList();
                                                        bxwc bxwc22 = blpd.f127204c;
                                                        size = bxwc22.size();
                                                        while (i3 < size) {
                                                        }
                                                        throw new aowo(chuw22, arrayList422);
                                                    }
                                                    break;
                                                case 11:
                                                    String valueOf15 = String.valueOf(aowp.f83765b.mo46947a(aowp.f83766c, (blrh) a4));
                                                    StringBuilder sb17 = new StringBuilder(String.valueOf(valueOf15).length() + 26);
                                                    sb17.append("SetSnoozePresets response:");
                                                    sb17.append(valueOf15);
                                                    sb17.toString();
                                                    aowp.f83769f.stats.numUpdates++;
                                                    contentResolver7 = contentResolver;
                                                    break;
                                                default:
                                                    contentResolver7 = contentResolver;
                                                    i = i27;
                                                    try {
                                                        StringBuilder sb18 = new StringBuilder(29);
                                                        sb18.append("Unknown operation:");
                                                        sb18.append(i26);
                                                        aowu.m69733a("RemindersSync", sb18.toString(), new Object[0]);
                                                    } catch (chuw e12) {
                                                        chuw chuw3 = e12;
                                                        blox blox8 = blpf.f127215c;
                                                        if (blox8 == null) {
                                                            blox8 = blox.f127160d;
                                                        }
                                                        throw new aowo(chuw3, blox8);
                                                    } catch (chuw e13) {
                                                        chuw chuw4 = e13;
                                                        blox blox9 = blpo.f127263d;
                                                        if (blox9 == null) {
                                                            blox9 = blox.f127160d;
                                                        }
                                                        throw new aowo(chuw4, blox9);
                                                    } catch (chuw e14) {
                                                        chuw chuw5 = e14;
                                                        blou blou3 = blpm.f127249d;
                                                        if (blou3 == null) {
                                                            blou3 = blou.f127145c;
                                                        }
                                                        throw new aowm(chuw5, blou3.f127148b);
                                                    } catch (chuw e15) {
                                                        chuw chuw6 = e15;
                                                        if (blpu.f127299c.size() > 1) {
                                                            aowu.m69733a("RemindersSync", "Multiple taskId in delete request", new Object[0]);
                                                        }
                                                        throw new aowo(chuw6, (blox) blpu.f127299c.get(0));
                                                    } catch (chuw e16) {
                                                        chuw chuw7 = e16;
                                                        blou blou4 = blps.f127290c;
                                                        if (blou4 == null) {
                                                            blou4 = blou.f127145c;
                                                        }
                                                        throw new aowm(chuw7, blou4.f127148b);
                                                    } catch (chuw e17) {
                                                        chuw chuw8 = e17;
                                                        blox blox10 = blru.f127531c;
                                                        if (blox10 == null) {
                                                            blox10 = blox.f127160d;
                                                        }
                                                        throw new aowo(chuw8, blox10);
                                                    } catch (chuw e18) {
                                                        chuw chuw9 = e18;
                                                        blou blou5 = blro.f127496c;
                                                        if (blou5 == null) {
                                                            blou5 = blou.f127145c;
                                                        }
                                                        throw new aowm(chuw9, blou5.f127148b);
                                                    } catch (chuw e19) {
                                                        chuw chuw10 = e19;
                                                        blox blox11 = blqn.f127376c;
                                                        if (blox11 == null) {
                                                            blox11 = blox.f127160d;
                                                        }
                                                        blou blou6 = blqn.f127377d;
                                                        if (blou6 == null) {
                                                            blou6 = blou.f127145c;
                                                        }
                                                        throw new aowk(chuw10, blox11, blou6.f127148b);
                                                    } catch (chuw e20) {
                                                        chuw chuw11 = e20;
                                                        blox blox12 = blql.f127365d;
                                                        if (blox12 == null) {
                                                            blox12 = blox.f127160d;
                                                        }
                                                        blou blou7 = blql.f127364c;
                                                        if (blou7 == null) {
                                                            blou7 = blou.f127145c;
                                                        }
                                                        throw new aowj(chuw11, blox12, blou7.f127148b);
                                                    } catch (chuw e21) {
                                                        chuw chuw12 = e21;
                                                        blou blou8 = blph.f127223c;
                                                        if (blou8 == null) {
                                                            blou8 = blou.f127145c;
                                                        }
                                                        throw new aowm(chuw12, blou8.f127148b);
                                                    } catch (aowh e22) {
                                                        aowh = e22;
                                                        i2 = i;
                                                        break;
                                                    } catch (aown e23) {
                                                        e = e23;
                                                        aown = e;
                                                        int i282 = aown.f83763c;
                                                        StringBuilder sb152 = new StringBuilder(73);
                                                        sb152.append("SetSnoozePreset operation failed ");
                                                        sb152.append(i282);
                                                        sb152.append(" for operation: ");
                                                        sb152.append(i26);
                                                        sb152.append(". ");
                                                        aowu.m69733a("RemindersSync", sb152.toString(), new Object[0]);
                                                        if (!aown.mo46961a()) {
                                                        }
                                                        aowu.m69733a("RemindersSync", "Removing the record from local DB and clearing operation.", new Object[0]);
                                                        aowp.mo46964a(j2);
                                                        contentResolver6 = contentResolver7;
                                                        context3 = context;
                                                        a2 = clientContext;
                                                        i15 = 3;
                                                        i14 = 2;
                                                    }
                                                    break;
                                            }
                                            aowp.mo46964a(j2);
                                            contentResolver6 = contentResolver7;
                                            context3 = context;
                                            a2 = clientContext;
                                            i15 = 3;
                                            i14 = 2;
                                        } else {
                                            contentResolver7 = contentResolver;
                                            aowp.mo46964a(j2);
                                            contentResolver6 = contentResolver7;
                                            context3 = context;
                                            a2 = clientContext;
                                            i15 = 3;
                                            i14 = 2;
                                        }
                                    } catch (aowh e24) {
                                        e = e24;
                                        contentResolver7 = contentResolver;
                                        aowh = e;
                                        i2 = i27;
                                        aowu.m69733a("RemindersSync", "Task operation %s failed: %s", Integer.valueOf(i26), Integer.valueOf(aowh.f83763c));
                                        if (!aowh.mo46961a()) {
                                        }
                                        aowu.m69733a("RemindersSync", "Removing the record from local DB and clearing option.", new Object[0]);
                                        list = aowh.f83756a;
                                        if (list != null) {
                                        }
                                        str2 = aowh.f83757b;
                                        if (str2 != null) {
                                        }
                                        aowp.mo46964a(j2);
                                        contentResolver6 = contentResolver7;
                                        context3 = context;
                                        a2 = clientContext;
                                        i15 = 3;
                                        i14 = 2;
                                    } catch (aown e25) {
                                        e = e25;
                                        contentResolver7 = contentResolver;
                                        i = i27;
                                        aown = e;
                                        int i2822 = aown.f83763c;
                                        StringBuilder sb1522 = new StringBuilder(73);
                                        sb1522.append("SetSnoozePreset operation failed ");
                                        sb1522.append(i2822);
                                        sb1522.append(" for operation: ");
                                        sb1522.append(i26);
                                        sb1522.append(". ");
                                        aowu.m69733a("RemindersSync", sb1522.toString(), new Object[0]);
                                        if (!aown.mo46961a()) {
                                        }
                                        aowu.m69733a("RemindersSync", "Removing the record from local DB and clearing operation.", new Object[0]);
                                        aowp.mo46964a(j2);
                                        contentResolver6 = contentResolver7;
                                        context3 = context;
                                        a2 = clientContext;
                                        i15 = 3;
                                        i14 = 2;
                                    }
                                } else {
                                    aowp.mo46963a();
                                    query.close();
                                    c = 1;
                                    if (c == 1) {
                                        return false;
                                    }
                                    if (z6) {
                                        if (c == 65535) {
                                            return false;
                                        }
                                        if (ContentResolver.getMasterSyncAutomatically()) {
                                            return false;
                                        }
                                    }
                                    if (!((Boolean) aoss.f83539R.mo58455c()).booleanValue()) {
                                        z3 = new aowc(getContext(), this.f83734a, this.f83735b, clientContext, a, aowc.m69680a(z2, z6, z10, z)).mo46948a();
                                    } else {
                                        z3 = m69695a(clientContext, a, z2, z6, z10, z);
                                    }
                                    if (!z3) {
                                        return false;
                                    }
                                    aowx.m69749a(context).edit().putLong("last_down_sync_time_millis", System.currentTimeMillis()).apply();
                                    return true;
                                }
                            }
                            clientContext = a2;
                            context = context3;
                            query.close();
                            c = 0;
                            if (c == 1) {
                            }
                        } else {
                            clientContext2 = a2;
                            context2 = context3;
                            query.close();
                        }
                        c = 65535;
                        if (c == 1) {
                        }
                    } catch (gid e26) {
                        e = e26;
                        aowu.m69734a("RemindersSync", e, "AuthError", new Object[0]);
                        syncResult.stats.numAuthExceptions++;
                        return false;
                    } catch (chuw e27) {
                        e = e27;
                        aowu.m69734a("RemindersSync", e, "NetworkError", new Object[0]);
                        syncResult.stats.numIoExceptions++;
                        return false;
                    }
                }
            } else {
                z2 = z5;
                z = equals;
            }
            aymw.m84285a(context3.getContentResolver(), account2, "com.google.android.gms.reminders", (String) aoss.f83548g.mo58455c(), Collections.singleton((String) aoss.f83547f.mo58455c()));
            if (!z4) {
            }
        } else {
            aowu.m69736c("RemindersSync", "Expected extras to not be null", new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m69695a(ClientContext clientContext, aosi aosi, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        blqw blqw;
        blqv blqv;
        blqw blqw2;
        byte[] bArr;
        if (z) {
            i = 5;
        } else {
            i = !z2 ? z3 ? 3 : z4 ? 2 : 1 : 4;
        }
        aowb aowb = new aowb(getContext(), this.f83734a, clientContext, aosi, i);
        bxvd da = blqr.f127394f.mo74144da();
        blrk b = aowb.f83720e.mo46953b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blqr blqr = (blqr) da.f164949b;
        b.getClass();
        blqr.f127397b = b;
        blqr.f127396a |= 1;
        bxvd da2 = blqp.f127386f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blqp blqp = (blqp) da2.f164949b;
        int i2 = blqp.f127388a | 2;
        blqp.f127388a = i2;
        blqp.f127390c = true;
        int i3 = i2 | 1;
        blqp.f127388a = i3;
        blqp.f127389b = true;
        blqp.f127388a = i3 | 4;
        blqp.f127391d = false;
        int intValue = ((Integer) aoss.f83546e.mo58455c()).intValue();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blqp blqp2 = (blqp) da2.f164949b;
        blqp2.f127388a |= 8;
        blqp2.f127392e = intValue;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blqr blqr2 = (blqr) da.f164949b;
        blqp blqp3 = (blqp) da2.mo74062i();
        blqp3.getClass();
        blqr2.f127398c = blqp3;
        blqr2.f127396a = 2 | blqr2.f127396a;
        int i4 = aowb.f83721f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blqr blqr3 = (blqr) da.f164949b;
        blqr3.f127399d = i4 - 1;
        blqr3.f127396a |= 4;
        byte[] bArr2 = aowb.f83719d.f83510d;
        if (bArr2 != null) {
            try {
                blqw = (blqw) GeneratedMessageLite.m124016a(blqw.f127418a, bArr2, bxus.m123744c());
            } catch (bxwf e) {
                aowu.m69733a("RemindersSync", "Error parsing OneSyncStatus", new Object[0]);
                blqw = null;
            }
        } else {
            blqw = null;
        }
        if (blqw != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blqr blqr4 = (blqr) da.f164949b;
            blqw.getClass();
            blqr4.f127400e = blqw;
            blqr4.f127396a |= 8;
        }
        do {
            aowg aowg = aowb.f83717b;
            ClientContext clientContext2 = aowb.f83718c;
            blqr blqr5 = (blqr) da.mo74062i();
            if (aowg.f83741g == null) {
                aowg.f83741g = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/OneSync", ciie.m150370a(blqr.f127394f), ciie.m150370a(blqv.f127409g));
            }
            blqv = (blqv) aowg.f83755a.mo25553a(aowg.f83741g, clientContext2, blqr5, (long) aowg.f83736b, TimeUnit.MILLISECONDS);
            if (blqv.f127413c) {
                aosf.m69447a(aowb.f83716a, aowb.f83719d);
            }
            ArrayList arrayList = new ArrayList();
            bxwc bxwc = blqv.f127412b;
            int size = bxwc.size();
            for (int i5 = 0; i5 < size; i5++) {
                blqu blqu = (blqu) bxwc.get(i5);
                int a = blqt.m107482a(blqu.f127404a);
                if (a == 0) {
                    a = 1;
                }
                if (a - 1 != 0) {
                    aowd aowd = aowb.f83720e;
                    blox blox = blqu.f127405b;
                    if (blox == null) {
                        blox = blox.f127160d;
                    }
                    arrayList.add(aowd.mo46950a(blox));
                } else {
                    aowd aowd2 = aowb.f83720e;
                    blrj blrj = blqu.f127406c;
                    if (blrj == null) {
                        blrj = blrj.f127456w;
                    }
                    arrayList.add(aowd2.mo46951a(blrj));
                }
            }
            if ((blqv.f127411a & 8) != 0) {
                aowd aowd3 = aowb.f83720e;
                blpr blpr = blqv.f127414d;
                if (blpr == null) {
                    blpr = blpr.f127278d;
                }
                ContentValues contentValues = new ContentValues();
                aowy.m69766a(contentValues, blpr);
                arrayList.add(ContentProviderOperation.newUpdate(ContentUris.withAppendedId(aosy.f83568a, aowd3.f83729a.f83507a)).withValues(contentValues).build());
            }
            if ((blqv.f127411a & 32) != 0) {
                blqw2 = blqv.f127416f;
                if (blqw2 == null) {
                    blqw2 = blqw.f127418a;
                }
            } else {
                blqw2 = null;
            }
            ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(ContentUris.withAppendedId(aosy.f83568a, aowb.f83719d.f83507a));
            if (blqw2 != null) {
                bArr = blqw2.serializeToBytes();
            } else {
                bArr = null;
            }
            arrayList.add(newUpdate.withValue("sync_status", bArr).build());
            if (blqv.f127413c) {
                arrayList.add(aowb.f83720e.mo46949a());
            }
            if (!aowb.f83720e.mo46952a(arrayList)) {
                return false;
            }
            if ((blqv.f127411a & 32) != 0) {
                blqw blqw3 = blqv.f127416f;
                if (blqw3 == null) {
                    blqw3 = blqw.f127418a;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blqr blqr6 = (blqr) da.f164949b;
                blqw3.getClass();
                blqr6.f127400e = blqw3;
                blqr6.f127396a |= 8;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blqr blqr7 = (blqr) da.f164949b;
                blqr7.f127400e = null;
                blqr7.f127396a &= -9;
            }
        } while (blqv.f127415e);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        Context context = getContext();
        aosi a = aosf.m69444a(context, account);
        if (a == null) {
            aowu.m69736c("RemindersSync", "Reminder account not found, aborting sync.", new Object[0]);
            return false;
        }
        boolean a2 = m69694a(account, bundle, str, syncResult);
        boolean hasError = syncResult.hasError();
        ContentValues contentValues = new ContentValues();
        contentValues.put("was_last_sync_error", Boolean.valueOf(hasError));
        context.getContentResolver().update(ContentUris.withAppendedId(aosy.f83568a, a.f83507a), contentValues, null, null);
        StringBuilder sb = new StringBuilder(37);
        sb.append("Returning error: ");
        sb.append(hasError);
        sb.append(" to SyncManager");
        sb.toString();
        return a2;
    }
}
