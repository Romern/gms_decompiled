package p000;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.LoadRemindersOptions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aovt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovt extends aove {

    /* renamed from: b */
    private final String f83696b;

    /* renamed from: c */
    private final LoadRemindersOptions f83697c;

    /* renamed from: d */
    private aosi f83698d;

    public aovt(aost aost, String str, LoadRemindersOptions loadRemindersOptions) {
        super(aost, "LoadReminders");
        this.f83696b = str;
        this.f83697c = loadRemindersOptions;
    }

    /* renamed from: a */
    private static String m69662a(int i) {
        return i != 1 ? "created_time_millis DESC" : "due_date_millis ASC";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x038e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x038f, code lost:
        r3 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02b7, code lost:
        if (r4 == 3) goto L_0x02b9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x038e A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r2 10  PHI: (r2v4 com.google.android.gms.common.data.DataHolder) = (r2v6 com.google.android.gms.common.data.DataHolder), (r2v6 com.google.android.gms.common.data.DataHolder), (r2v10 com.google.android.gms.common.data.DataHolder), (r2v10 com.google.android.gms.common.data.DataHolder) binds: [B:125:0x0386, B:126:?, B:112:0x0367, B:113:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:112:0x0367] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0397 A[SYNTHETIC, Splitter:B:130:0x0397] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x039e A[Catch:{ NullPointerException -> 0x03a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03a2 A[RETURN] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        DataHolder dataHolder;
        String str;
        int i;
        String str2;
        String[] strArr;
        try {
            int i2 = 0;
            new Object[1][0] = this;
            DataHolder dataHolder2 = null;
            try {
                aosi a = aosf.m69445a(context, this.f83696b);
                this.f83698d = a;
                if (a != null) {
                    List list = this.f83697c.f107037a;
                    if (list != null) {
                        String[] strArr2 = {String.valueOf(a.f83507a)};
                        StringBuilder sb = new StringBuilder();
                        if (list.isEmpty()) {
                            strArr = strArr2;
                        } else {
                            while (i2 < list.size()) {
                                if (sb.length() != 0) {
                                    sb.append(" OR ");
                                }
                                sb.append("client_assigned_id=? ");
                                i2++;
                            }
                            strArr = aowt.m69731a(strArr2, (String[]) list.toArray(new String[list.size()]));
                        }
                        dataHolder = sgq.m35237b(context, aotd.f83574a, null, aowt.m69729a("account_id=?", sb.toString()), strArr, m69662a(this.f83697c.f107048l));
                    } else {
                        long j = a.f83507a;
                        StringBuilder sb2 = new StringBuilder(45);
                        sb2.append("deleted=0 AND account_id=");
                        sb2.append(j);
                        String sb3 = sb2.toString();
                        String[] strArr3 = new String[0];
                        if (this.f83697c.f107038b != null) {
                            String valueOf = String.valueOf(sb3);
                            String join = TextUtils.join(",", this.f83697c.f107038b);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(join).length());
                            sb4.append(valueOf);
                            sb4.append(" AND task_list IN (");
                            sb4.append(join);
                            sb4.append(")");
                            sb3 = sb4.toString();
                        }
                        List list2 = this.f83697c.f107049m;
                        if (list2 != null && !list2.isEmpty()) {
                            StringBuilder sb5 = new StringBuilder();
                            for (int i3 = 0; i3 < list2.size(); i3++) {
                                if (sb5.length() != 0) {
                                    sb5.append(" OR ");
                                }
                                sb5.append("recurrence_id=? ");
                            }
                            strArr3 = aowt.m69731a(strArr3, (String[]) list2.toArray(new String[list2.size()]));
                            sb3 = aowt.m69729a(sb3, sb5.toString());
                        }
                        String[] strArr4 = strArr3;
                        if (!this.f83697c.f107043g) {
                            sb3 = String.valueOf(sb3).concat(" AND archived=0");
                        }
                        if (this.f83697c.f107047k != -1) {
                            ArrayList arrayList = new ArrayList();
                            LoadRemindersOptions loadRemindersOptions = this.f83697c;
                            if (loadRemindersOptions.mo58602a(loadRemindersOptions.f107047k, 0)) {
                                long currentTimeMillis = System.currentTimeMillis();
                                Long l = this.f83697c.f107039c;
                                if (l != null) {
                                    i = currentTimeMillis >= l.longValue() ? 1 : 0;
                                } else {
                                    i = 1;
                                }
                                Long l2 = this.f83697c.f107040d;
                                if (l2 != null) {
                                    if (currentTimeMillis < l2.longValue()) {
                                        i2 = 1;
                                    }
                                    i &= i2;
                                }
                                if (i == 0) {
                                    str2 = "0";
                                } else {
                                    str2 = "(reminder_type=0)";
                                }
                                arrayList.add(str2);
                            }
                            LoadRemindersOptions loadRemindersOptions2 = this.f83697c;
                            if (loadRemindersOptions2.mo58602a(loadRemindersOptions2.f107047k, 1)) {
                                String str3 = "(reminder_type=1";
                                Long l3 = this.f83697c.f107039c;
                                if (l3 != null) {
                                    String valueOf2 = String.valueOf(l3);
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf2).length() + 71);
                                    sb6.append("(reminder_type=1 AND due_date_millis IS NOT NULL  AND due_date_millis>=");
                                    sb6.append(valueOf2);
                                    str3 = sb6.toString();
                                }
                                if (this.f83697c.f107040d != null) {
                                    String valueOf3 = String.valueOf(str3);
                                    String valueOf4 = String.valueOf(this.f83697c.f107040d);
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf3).length() + 54 + String.valueOf(valueOf4).length());
                                    sb7.append(valueOf3);
                                    sb7.append(" AND due_date_millis IS NOT NULL  AND due_date_millis<");
                                    sb7.append(valueOf4);
                                    str3 = sb7.toString();
                                }
                                if (this.f83697c.f107041e != null) {
                                    String valueOf5 = String.valueOf(str3);
                                    String valueOf6 = String.valueOf(this.f83697c.f107041e);
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf5).length() + 52 + String.valueOf(valueOf6).length());
                                    sb8.append(valueOf5);
                                    sb8.append(" AND (due_date_millis IS NULL OR due_date_millis < ");
                                    sb8.append(valueOf6);
                                    sb8.append(")");
                                    str3 = sb8.toString();
                                }
                                if (this.f83697c.f107042f != null) {
                                    String valueOf7 = String.valueOf(str3);
                                    String valueOf8 = String.valueOf(this.f83697c.f107042f);
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf7).length() + 53 + String.valueOf(valueOf8).length());
                                    sb9.append(valueOf7);
                                    sb9.append(" AND (due_date_millis IS NULL OR due_date_millis >= ");
                                    sb9.append(valueOf8);
                                    sb9.append(")");
                                    str3 = sb9.toString();
                                }
                                arrayList.add(String.valueOf(str3).concat(")"));
                            }
                            LoadRemindersOptions loadRemindersOptions3 = this.f83697c;
                            if (loadRemindersOptions3.mo58602a(loadRemindersOptions3.f107047k, 2)) {
                                arrayList.add("(reminder_type=2)");
                            }
                            String valueOf9 = String.valueOf(sb3);
                            String join2 = TextUtils.join(" OR ", arrayList);
                            StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf9).length() + 7 + String.valueOf(join2).length());
                            sb10.append(valueOf9);
                            sb10.append(" AND (");
                            sb10.append(join2);
                            sb10.append(")");
                            sb3 = sb10.toString();
                        }
                        int i4 = this.f83697c.f107044h;
                        if (i4 == 0) {
                            sb3 = String.valueOf(sb3).concat(" AND (recurrence_master IS NULL OR recurrence_master!=1)");
                        } else {
                            if (i4 == 1) {
                            }
                            String concat = String.valueOf(sb3).concat(" AND (recurrence_master IS NULL OR recurrence_master!=0");
                            if (i4 == 3) {
                                concat = String.valueOf(concat).concat(" OR recurrence_exceptional=1");
                            }
                            sb3 = String.valueOf(concat).concat(")");
                        }
                        if (this.f83697c.f107045i) {
                            sb3 = String.valueOf(sb3).concat(" AND (recurrence_exceptional IS NULL OR recurrence_exceptional!=1)");
                        }
                        if (this.f83697c.f107046j) {
                            sb3 = String.valueOf(sb3).concat(" AND recurrence_id IS NOT NULL");
                        }
                        LoadRemindersOptions loadRemindersOptions4 = this.f83697c;
                        if (loadRemindersOptions4.f107050n == null) {
                            if (loadRemindersOptions4.f107051o == null) {
                                str = sb3;
                                dataHolder = sgq.m35237b(context, aotd.f83574a, null, str, strArr4, m69662a(this.f83697c.f107048l));
                            }
                        }
                        String valueOf10 = String.valueOf(sb3);
                        String valueOf11 = String.valueOf(this.f83697c.f107050n);
                        String valueOf12 = String.valueOf(this.f83697c.f107051o);
                        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf10).length() + 79 + String.valueOf(valueOf11).length() + String.valueOf(valueOf12).length());
                        sb11.append(valueOf10);
                        sb11.append(" AND (fired_time_millis BETWEEN IFNULL(");
                        sb11.append(valueOf11);
                        sb11.append(", 0) AND IFNULL(");
                        sb11.append(valueOf12);
                        sb11.append(", 9223372036854775807) )");
                        str = sb11.toString();
                        dataHolder = sgq.m35237b(context, aotd.f83574a, null, str, strArr4, m69662a(this.f83697c.f107048l));
                    }
                    try {
                        this.f83667a.mo46831a(dataHolder, Status.f30107a);
                        dataHolder.close();
                    } catch (RemoteException e) {
                        this.f83667a.mo46831a((DataHolder) null, Status.f30109c);
                        if (dataHolder == null) {
                            dataHolder.close();
                        }
                    } catch (Throwable th) {
                    }
                } else {
                    this.f83667a.mo46830a(new Status(6000));
                }
            } catch (RemoteException e2) {
                dataHolder = null;
                this.f83667a.mo46831a((DataHolder) null, Status.f30109c);
                if (dataHolder == null) {
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                if (dataHolder2 != null) {
                }
                throw th3;
            }
        } catch (NullPointerException e3) {
            throw new NullPointerException(Log.getStackTraceString(e3));
        }
    }
}
