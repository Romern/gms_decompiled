package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
/* renamed from: aki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aki {

    /* renamed from: f */
    private static final Object f766f = new Object();

    /* renamed from: g */
    private static aki f767g;

    /* renamed from: a */
    private final Context f768a;

    /* renamed from: b */
    private final HashMap f769b = new HashMap();

    /* renamed from: c */
    private final HashMap f770c = new HashMap();

    /* renamed from: d */
    private final ArrayList f771d = new ArrayList();

    /* renamed from: e */
    private final Handler f772e;

    private aki(Context context) {
        this.f768a = context;
        this.f772e = new akf(this, context.getMainLooper());
    }

    /* renamed from: a */
    public static aki m919a(Context context) {
        aki aki;
        synchronized (f766f) {
            if (f767g == null) {
                f767g = new aki(context.getApplicationContext());
            }
            aki = f767g;
        }
        return aki;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r6 >= r5) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r7 = (p000.akh) r4.f761b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r7.f765d != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r7.f763b.onReceive(r10.f768a, r4.f760a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r4 = r2[r3];
        r5 = r4.f761b.size();
        r6 = 0;
     */
    /* renamed from: a */
    public final void mo871a() {
        while (true) {
            synchronized (this.f769b) {
                int size = this.f771d.size();
                if (size > 0) {
                    akg[] akgArr = new akg[size];
                    this.f771d.toArray(akgArr);
                    this.f771d.clear();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo872a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f769b) {
            ArrayList arrayList = (ArrayList) this.f769b.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    akh akh = (akh) arrayList.get(size);
                    akh.f765d = true;
                    for (int i = 0; i < akh.f762a.countActions(); i++) {
                        String action = akh.f762a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f770c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                akh akh2 = (akh) arrayList2.get(size2);
                                if (akh2.f763b == broadcastReceiver) {
                                    akh2.f765d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f770c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo873a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f769b) {
            akh akh = new akh(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f769b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f769b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(akh);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f770c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f770c.put(action, arrayList2);
                }
                arrayList2.add(akh);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015b, code lost:
        return r11;
     */
    /* renamed from: a */
    public final boolean mo874a(Intent intent) {
        boolean z;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        String str;
        String str2;
        int i2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str3;
        Intent intent2 = intent;
        synchronized (this.f769b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent2.resolveTypeIfNeeded(this.f768a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int flags = intent.getFlags() & 8;
            if (flags != 0) {
                "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent2;
            }
            ArrayList arrayList5 = (ArrayList) this.f770c.get(intent.getAction());
            if (arrayList5 == null) {
                z = false;
            } else {
                if (flags != 0) {
                    "Action list: " + arrayList5;
                    arrayList = null;
                    i = 0;
                } else {
                    arrayList = null;
                    i = 0;
                }
                while (i < arrayList5.size()) {
                    akh akh = (akh) arrayList5.get(i);
                    if (flags != 0) {
                        "Matching against filter " + akh.f762a;
                    }
                    if (!akh.f764c) {
                        str2 = action;
                        akh akh2 = akh;
                        i2 = i;
                        arrayList3 = arrayList;
                        str = resolveTypeIfNeeded;
                        arrayList2 = arrayList5;
                        int match = akh.f762a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (flags != 0) {
                                "  Filter matched!  match=0x" + Integer.toHexString(match);
                            }
                            if (arrayList3 != null) {
                                arrayList4 = arrayList3;
                            } else {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(akh2);
                            akh2.f764c = true;
                            i = i2 + 1;
                            action = str2;
                            resolveTypeIfNeeded = str;
                            arrayList5 = arrayList2;
                        } else if (flags != 0) {
                            if (match != -4) {
                                str3 = match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action";
                            } else {
                                str3 = "category";
                            }
                            "  Filter did not match: " + str3;
                        }
                    } else {
                        i2 = i;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList5;
                        str2 = action;
                        str = resolveTypeIfNeeded;
                    }
                    arrayList4 = arrayList3;
                    i = i2 + 1;
                    action = str2;
                    resolveTypeIfNeeded = str;
                    arrayList5 = arrayList2;
                }
                ArrayList arrayList6 = arrayList;
                z = false;
                if (arrayList6 != null) {
                    for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                        ((akh) arrayList6.get(i3)).f764c = false;
                    }
                    this.f771d.add(new akg(intent, arrayList6));
                    if (!this.f772e.hasMessages(1)) {
                        this.f772e.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
