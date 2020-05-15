package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.os.DropBoxManager;
import android.os.TransactionTooLargeException;
import android.util.EventLog;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: qeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qeq {

    /* renamed from: a */
    public static final Logger f41085a = qgn.m32143a("EventLogAggregator");

    /* renamed from: b */
    private static final Pattern f41086b = Pattern.compile(",?([a-z_]+)(?:\\(([0-9]+)\\))?");

    /* renamed from: c */
    private static final HashMap f41087c = new HashMap();

    /* renamed from: d */
    private static final SimpleDateFormat f41088d = new SimpleDateFormat("MM-dd HH:mm:ss:SSS", Locale.US);

    /* renamed from: e */
    private Object f41089e;

    /* renamed from: f */
    private int[] f41090f = new int[0];

    /* renamed from: g */
    private final HashMap f41091g = new HashMap();

    static {
        f41087c.put("count", new qdz());
        f41087c.put("sum", new qeb());
        f41087c.put("mean", new qed());
        f41087c.put("min", new qef());
        f41087c.put("max", new qeh());
        f41087c.put("group_by", new qej());
        f41087c.put("packages", new qel());
    }

    /* renamed from: a */
    private static long m32019a(EventLog.Event event) {
        return (event.getTimeNanos() + 500000) / 1000000;
    }

    /* renamed from: a */
    public static long m32020a(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        throw new IllegalArgumentException("number expected");
    }

    /* renamed from: a */
    public static Object m32021a(Object obj, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("parameter required");
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (i < objArr.length) {
                return objArr[i];
            }
            throw new IllegalArgumentException("bad index");
        } else if (i <= 0) {
            return obj;
        } else {
            throw new IllegalArgumentException("list expected");
        }
    }

    /* renamed from: a */
    static String m32022a(long j) {
        return j >= 0 ? f41088d.format(new Date(j)) : "-1";
    }

    /* renamed from: a */
    private final synchronized void m32023a(long j, long j2, List list, DropBoxManager dropBoxManager, int i) {
        qem qem = new qem(dropBoxManager, i);
        if (j2 != j) {
            StringBuilder sb = new StringBuilder(41);
            sb.append(j2);
            sb.append(",0,0,event_log_start\n");
            qem.mo23988a(sb.toString());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EventLog.Event event = (EventLog.Event) it.next();
            qep qep = (qep) this.f41091g.get(Integer.valueOf(event.getTag()));
            if (qep != null && qep.f41081b) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m32019a(event));
                sb2.append(',');
                sb2.append(event.getProcessId());
                sb2.append(',');
                sb2.append(event.getThreadId());
                sb2.append(',');
                sb2.append(qep.f41080a);
                try {
                    Object data = event.getData();
                    if (data instanceof Object[]) {
                        Object[] objArr = (Object[]) data;
                        for (Object obj : objArr) {
                            sb2.append(',');
                            sqy.m36056a(obj.toString(), sb2);
                        }
                    } else if (data != null) {
                        sb2.append(',');
                        sqy.m36056a(data.toString(), sb2);
                    }
                } catch (IOException e) {
                    f41085a.mo25419f("IOException writing StringBuilder", e, new Object[0]);
                }
                sb2.append(10);
                qem.mo23988a(sb2.toString());
            }
        }
        qem.mo23987a();
    }

    /* renamed from: a */
    private final synchronized void m32024a(ContentResolver contentResolver, boolean z) {
        Object a = aymn.m84262a(contentResolver);
        if (a != this.f41089e) {
            this.f41091g.clear();
            int i = 0;
            for (Map.Entry entry : qer.m32027a(aymn.m84266a(contentResolver, "event:"), "event:", z, aymn.m84264a(contentResolver, "checkin_event_whitelist")).entrySet()) {
                String substring = ((String) entry.getKey()).substring(6);
                int tagCode = EventLog.getTagCode(substring);
                if (tagCode < 0) {
                    if (!"checkin_event_log_entries".equals(substring)) {
                        Logger Logger = f41085a;
                        String valueOf = String.valueOf(substring);
                        Logger.mo25416d(valueOf.length() == 0 ? new String("Unknown tag: ") : "Unknown tag: ".concat(valueOf), new Object[0]);
                    } else {
                        tagCode = 70220;
                    }
                }
                String str = (String) entry.getValue();
                if (str.length() > 0) {
                    try {
                        qep qep = new qep();
                        Matcher matcher = f41086b.matcher(str);
                        while (matcher.regionStart() < matcher.regionEnd()) {
                            if (!matcher.lookingAt()) {
                                String valueOf2 = String.valueOf(str.substring(matcher.regionStart()));
                                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("bad spec: ") : "bad spec: ".concat(valueOf2));
                            }
                            String group = matcher.group(1);
                            if (!group.equals("log")) {
                                String group2 = matcher.group(2);
                                int i2 = -1;
                                if (!(group2 == null || group2.length() == 0)) {
                                    i2 = Integer.parseInt(group2);
                                }
                                if (f41087c.containsKey(group)) {
                                    qep.f41083d.add((qen) f41087c.get(group));
                                    ArrayList arrayList = qep.f41084e;
                                    Integer valueOf3 = Integer.valueOf(i2);
                                    arrayList.add(valueOf3);
                                    if (group.equals("group_by")) {
                                        qep.f41082c.add(valueOf3);
                                    }
                                } else {
                                    String valueOf4 = String.valueOf(group);
                                    throw new IllegalArgumentException(valueOf4.length() == 0 ? new String("bad function: ") : "bad function: ".concat(valueOf4));
                                }
                            } else {
                                qep.f41081b = true;
                            }
                            matcher.region(matcher.end(), matcher.regionEnd());
                        }
                        if (!qep.f41081b) {
                            if (qep.f41083d.isEmpty()) {
                            }
                        }
                        qep.f41080a = substring;
                        this.f41091g.put(Integer.valueOf(tagCode), qep);
                    } catch (IllegalArgumentException e) {
                        Logger logger2 = f41085a;
                        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 13 + String.valueOf(str).length());
                        sb.append("Bad spec: ");
                        sb.append(substring);
                        sb.append(" = ");
                        sb.append(str);
                        logger2.mo25415d(sb.toString(), e, new Object[0]);
                    }
                } else {
                    continue;
                }
            }
            this.f41090f = new int[(this.f41091g.size() + 1)];
            for (Integer num : this.f41091g.keySet()) {
                this.f41090f[i] = num.intValue();
                i++;
            }
            int[] iArr = this.f41090f;
            iArr[i] = 70200;
            if (i + 1 == iArr.length) {
                this.f41089e = a;
            } else {
                throw new AssertionError();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized long mo23989a(qws qws, Context context, long j, long j2, DropBoxManager dropBoxManager, snf snf, boolean z) {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        long j3;
        long j4;
        ArrayList arrayList2;
        long j5;
        long j6;
        Context context2;
        DropBoxManager dropBoxManager2;
        long j7 = j2;
        boolean z2 = z;
        synchronized (this) {
            ContentResolver contentResolver = context.getContentResolver();
            int a = aymn.m84260a(contentResolver, "checkin_log_event_max_buffer", 1000000);
            m32024a(contentResolver, z2);
            long currentTimeMillis = System.currentTimeMillis();
            EventLog.writeEvent(70200, currentTimeMillis);
            ArrayList arrayList3 = new ArrayList();
            EventLog.readEvents(this.f41090f, arrayList3);
            int size = arrayList3.size();
            int size2 = arrayList3.size();
            int size3 = arrayList3.size();
            Logger Logger = f41085a;
            String a2 = m32022a(j);
            String a3 = m32022a(j2);
            String a4 = m32022a(currentTimeMillis);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 77 + String.valueOf(a3).length() + String.valueOf(a4).length());
            sb.append("Event Aggregation Bookmarks, Event Count: ");
            sb.append(size3);
            sb.append("\nLogs : ");
            sb.append(a2);
            sb.append("\nData : ");
            sb.append(a3);
            sb.append("\nNew  : ");
            sb.append(a4);
            Logger.logVerbose(sb.toString(), new Object[0]);
            long j8 = currentTimeMillis;
            int i4 = size;
            int i5 = size2;
            int i6 = 0;
            long j9 = j8;
            while (true) {
                if (i6 >= size3) {
                    arrayList = arrayList3;
                    i = a;
                    i2 = i5;
                    i3 = size3;
                    j3 = j9;
                    j4 = j8;
                    break;
                }
                EventLog.Event event = (EventLog.Event) arrayList3.get(i6);
                int tag = event.getTag();
                long a5 = m32019a(event);
                Logger logger2 = f41085a;
                String a6 = m32022a(a5);
                i = a;
                String valueOf = String.valueOf(event.getData());
                arrayList = arrayList3;
                StringBuilder sb2 = new StringBuilder(String.valueOf(a6).length() + 51 + String.valueOf(valueOf).length());
                sb2.append("Event[");
                sb2.append(i6);
                sb2.append("]  Tag:  ");
                sb2.append(tag);
                sb2.append(" Time: ");
                sb2.append(a6);
                sb2.append(" Data: ");
                sb2.append(valueOf);
                logger2.logVerbose(sb2.toString(), new Object[0]);
                if (i4 == size3) {
                    if (a5 >= j) {
                        if (a5 < j9) {
                            i4 = i6;
                            j9 = a5;
                        } else {
                            i4 = i6;
                        }
                    }
                }
                if (i5 == size3) {
                    if (a5 >= j7) {
                        if (a5 < j8) {
                            i5 = i6;
                            j8 = a5;
                        } else {
                            i5 = i6;
                        }
                    }
                }
                if (tag == 70200) {
                    Object data = event.getData();
                    if (data instanceof Long) {
                        long longValue = ((Long) data).longValue();
                        if (longValue == j) {
                            i4 = i6 + 1;
                            j9 = j;
                        }
                        if (longValue == j7) {
                            i5 = i6 + 1;
                            j8 = j7;
                        }
                        if (longValue == currentTimeMillis) {
                            i3 = i6;
                            i2 = i5;
                            j3 = j9;
                            j4 = j8;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i6++;
                a = i;
                arrayList3 = arrayList;
            }
            if (j <= -1) {
                j5 = j4;
                arrayList2 = arrayList;
                j6 = currentTimeMillis;
            } else if (dropBoxManager != null) {
                try {
                    arrayList2 = arrayList;
                    j5 = j4;
                    j6 = currentTimeMillis;
                    m32023a(j, j3, arrayList.subList(Math.min(i4, i3), i3), dropBoxManager, i);
                } catch (RuntimeException e) {
                    if (e.getCause() instanceof TransactionTooLargeException) {
                        f41085a.mo25415d("Dropbox write exceeds buffer limit.", e.getCause(), new Object[0]);
                        qdg.m31921b("Aggregation failure due to TransactionTooLargeException.");
                        throw new IOException(e.getCause());
                    }
                    throw e;
                }
            } else {
                j5 = j4;
                arrayList2 = arrayList;
                j6 = currentTimeMillis;
            }
            if (j7 > -1) {
                dropBoxManager2 = dropBoxManager;
                if (dropBoxManager2 != null) {
                    List<EventLog.Event> subList = arrayList2.subList(Math.min(i2, i3), i3);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("start=");
                    sb3.append(j7);
                    sb3.append("\nend=");
                    sb3.append(j6);
                    sb3.append(10);
                    if (j5 != j7) {
                        sb3.append("log_start=");
                        sb3.append(j5);
                        sb3.append(10);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    HashMap hashMap = new HashMap();
                    for (EventLog.Event event2 : subList) {
                        int tag2 = event2.getTag();
                        qep qep = (qep) this.f41091g.get(Integer.valueOf(tag2));
                        if (qep != null && !qep.f41083d.isEmpty()) {
                            arrayList4.clear();
                            arrayList4.add(qep.f41080a);
                            Object data2 = event2.getData();
                            Iterator it = qep.f41082c.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(m32021a(data2, ((Integer) it.next()).intValue()));
                            }
                            try {
                                ArrayList arrayList5 = (ArrayList) hashMap.get(arrayList4);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList(qep.f41083d.size());
                                    for (int i7 = 0; i7 < qep.f41083d.size(); i7++) {
                                        arrayList5.add(((qen) qep.f41083d.get(i7)).mo23986a(((Integer) qep.f41084e.get(i7)).intValue()));
                                    }
                                    hashMap.put(new ArrayList(arrayList4), arrayList5);
                                }
                                Iterator it2 = arrayList5.iterator();
                                while (it2.hasNext()) {
                                    ((qeo) it2.next()).mo23984a(data2);
                                }
                            } catch (IllegalArgumentException e2) {
                                Logger logger3 = f41085a;
                                String valueOf2 = String.valueOf(qep.f41080a);
                                logger3.mo25417e(valueOf2.length() == 0 ? new String("Can't accumulate event: ") : "Can't accumulate event: ".concat(valueOf2), e2, new Object[0]);
                                this.f41091g.remove(Integer.valueOf(tag2));
                            }
                        }
                    }
                    try {
                        sb3.append(10);
                        for (Map.Entry entry : hashMap.entrySet()) {
                            sqy.m36056a(((ArrayList) entry.getKey()).get(0).toString(), sb3);
                            Iterator it3 = ((ArrayList) entry.getValue()).iterator();
                            while (it3.hasNext()) {
                                qeo qeo = (qeo) it3.next();
                                sb3.append(',');
                                context2 = context;
                                try {
                                    qeo.mo23985a(sb3, context2);
                                } catch (IOException e3) {
                                    e = e3;
                                    f41085a.mo25419f("IOException writing StringBuilder", e, new Object[0]);
                                    dropBoxManager2.addText("event_data", sb3.toString());
                                    Logger logger4 = f41085a;
                                    long c = cdbz.m132513c();
                                    StringBuilder sb4 = new StringBuilder(79);
                                    sb4.append("Upload log to clearcut scheduled to run in: ");
                                    sb4.append(c);
                                    sb4.append(" millisecond(s)");
                                    logger4.mo25412b(sb4.toString(), new Object[0]);
                                    snf.mo25814a(new qdw(context2, dropBoxManager2, qws, z), cdbz.m132513c(), TimeUnit.MILLISECONDS).mo741a(qdx.f41063a, snf);
                                    return j6;
                                }
                            }
                            sb3.append(10);
                        }
                        context2 = context;
                    } catch (IOException e4) {
                        e = e4;
                        context2 = context;
                        f41085a.mo25419f("IOException writing StringBuilder", e, new Object[0]);
                        dropBoxManager2.addText("event_data", sb3.toString());
                        Logger logger42 = f41085a;
                        long c2 = cdbz.m132513c();
                        StringBuilder sb42 = new StringBuilder(79);
                        sb42.append("Upload log to clearcut scheduled to run in: ");
                        sb42.append(c2);
                        sb42.append(" millisecond(s)");
                        logger42.mo25412b(sb42.toString(), new Object[0]);
                        snf.mo25814a(new qdw(context2, dropBoxManager2, qws, z), cdbz.m132513c(), TimeUnit.MILLISECONDS).mo741a(qdx.f41063a, snf);
                        return j6;
                    }
                    dropBoxManager2.addText("event_data", sb3.toString());
                } else {
                    context2 = context;
                }
            } else {
                context2 = context;
                dropBoxManager2 = dropBoxManager;
            }
            if (dropBoxManager2 != null && cdbz.f180442a.mo6606a().mo77215b()) {
                Logger logger422 = f41085a;
                long c22 = cdbz.m132513c();
                StringBuilder sb422 = new StringBuilder(79);
                sb422.append("Upload log to clearcut scheduled to run in: ");
                sb422.append(c22);
                sb422.append(" millisecond(s)");
                logger422.mo25412b(sb422.toString(), new Object[0]);
                snf.mo25814a(new qdw(context2, dropBoxManager2, qws, z), cdbz.m132513c(), TimeUnit.MILLISECONDS).mo741a(qdx.f41063a, snf);
            }
        }
        return j6;
    }

    /* renamed from: a */
    public final long mo23990a(qws qws, Context context, long j, long j2, DropBoxManager dropBoxManager, boolean z) {
        return mo23989a(qws, context, j, j2, dropBoxManager, new sny(1, 10), z);
    }
}
