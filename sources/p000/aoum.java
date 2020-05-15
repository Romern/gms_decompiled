package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.reminders.internal.ref.TaskRef;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: aoum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoum {

    /* renamed from: a */
    public static final long f83632a = (((long) ((Integer) aoss.f83531J.mo58455c()).intValue()) * 1000);

    /* renamed from: b */
    public static final String f83633b;

    /* renamed from: d */
    private static final Collection f83634d = Arrays.asList(Pair.create(4, (Integer) aoss.f83534M.mo58455c()), Pair.create(3, (Integer) aoss.f83535N.mo58455c()));

    /* renamed from: c */
    public final Context f83635c;

    static {
        String valueOf = String.valueOf(aoun.f83636a);
        f83633b = valueOf.length() == 0 ? new String("reminder_type=2 AND snoozed == 1 AND ") : "reminder_type=2 AND snoozed == 1 AND ".concat(valueOf);
    }

    public aoum(Context context) {
        rjo rjo = lrh.f26630a;
        this.f83635c = context;
    }

    /* renamed from: a */
    public static final String m69529a(long j) {
        StringBuilder sb = new StringBuilder(35);
        sb.append("reminder_fence_");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo46913a(String str) {
        HashSet hashSet = new HashSet();
        String concat = String.valueOf(str).concat(" AND task_list IN (");
        for (Pair pair : f83634d) {
            String c = aowr.m69723c(((Integer) pair.first).intValue());
            if (!TextUtils.isEmpty(c)) {
                try {
                    if (this.f83635c.getPackageManager().getPackageInfo(c, 0).versionCode >= ((Integer) pair.second).intValue()) {
                        hashSet.add((Integer) pair.first);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
        }
        String valueOf = String.valueOf(concat);
        String join = TextUtils.join(",", hashSet);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(join).length());
        sb.append(valueOf);
        sb.append(join);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo46914a(Cursor cursor) {
        mo46915a(cursor, new aouj(this));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo46915a(Cursor cursor, aoul aoul) {
        int i;
        String str = null;
        DataHolder dataHolder = new DataHolder(cursor, null);
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (i2 < dataHolder.f30168h) {
            try {
                long a = dataHolder.mo17763a("account_id", i2, dataHolder.mo17762a(i2));
                long a2 = dataHolder.mo17763a("_id", i2, dataHolder.mo17762a(i2));
                TaskRef taskRef = new TaskRef(dataHolder, i2);
                Long valueOf = Long.valueOf(a);
                boolean containsKey = hashMap.containsKey(valueOf);
                if (!containsKey) {
                    hashMap.put(valueOf, new lrk());
                }
                try {
                    boolean a3 = aoul.mo46912a((lrk) hashMap.get(valueOf), a2, taskRef);
                    if (!containsKey && !a3) {
                        hashMap.remove(valueOf);
                        i2++;
                    } else {
                        i2++;
                    }
                } catch (Exception e) {
                    aowu.m69733a("RemindersNS", "Failed processing location reminder, moving on to next reminder", new Object[0]);
                    i2++;
                }
            } catch (Exception e2) {
                aowu.m69733a("RemindersNS", "Failed processing location reminder, moving on to next reminder", new Object[0]);
                i2++;
            }
        }
        dataHolder.close();
        for (Map.Entry entry : hashMap.entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            FenceUpdateRequestImpl a4 = ((lrk) entry.getValue()).mo15389a();
            Context context = this.f83635c;
            StringBuilder sb = new StringBuilder(32);
            sb.append("account._id=");
            sb.append(longValue);
            Cursor a5 = sgq.m35235a(context, aosy.f83568a, new String[]{"account_name"}, sb.toString(), null, null);
            try {
                String string = a5.moveToFirst() ? a5.getString(0) : str;
                a5.close();
                if (!TextUtils.isEmpty(string)) {
                    if (!cgig.f186989a.mo6606a().mo83832a()) {
                        rjy rjy = new rjy(this.f83635c);
                        rjo rjo = lrh.f26630a;
                        sdo.m34977c("reminders");
                        rjy.mo24780a(rjo, new lri("reminders", 1, null, null, -1, null));
                        rjy.mo24778a(string);
                        rkb b = rjy.mo24784b();
                        String valueOf2 = String.valueOf(string);
                        aosr aosr = new aosr(b, valueOf2.length() == 0 ? new String("updateAwarenessFencesForAccount") : "updateAwarenessFencesForAccount".concat(valueOf2));
                        Status status = null;
                        int i3 = 0;
                        while (true) {
                            if (status == null || !status.mo17710c()) {
                                if (i3 > ((Integer) aoss.f83538Q.mo58455c()).intValue()) {
                                    str = null;
                                    break;
                                } else if (status != null && (i = status.f30115i) != 15 && i != 14) {
                                    str = null;
                                    break;
                                } else {
                                    aouk aouk = new aouk(a4);
                                    ConnectionResult a6 = aosr.f83520a.mo24785a((long) ((Integer) aoss.f83537P.mo58455c()).intValue(), TimeUnit.SECONDS);
                                    if (!a6.mo17671b()) {
                                        aowu.m69736c("RemindersGApiWrapper", "Failed to connect API client for %s: %s", aosr.f83521b, a6);
                                        status = null;
                                    } else {
                                        status = (Status) tkf.m37133a(aosr.f83520a, aouk.f83631a).mo9455a();
                                        aosr.f83520a.mo24803g();
                                    }
                                    i3++;
                                }
                            } else {
                                str = null;
                                break;
                            }
                        }
                    } else {
                        try {
                            aucu.m76782a(lrh.m19577a(this.f83635c, lri.m19582a("reminders", new Account(string, "com.google"))).mo24681a(a4));
                        } catch (InterruptedException | ExecutionException e3) {
                            aowu.m69733a("RemindersNS", "Failed to update fence from Connectionless Api. %s", e3);
                        }
                    }
                } else {
                    aowu.m69733a("RemindersNS", "Account name for account %s not found, fences not updated.", Long.valueOf(longValue));
                }
            } catch (Throwable th) {
                a5.close();
                throw th;
            }
        }
    }
}
