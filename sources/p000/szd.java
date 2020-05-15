package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: szd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class szd {

    /* renamed from: a */
    private final Logger f45473a = tea.m36798a("throttler");

    /* renamed from: b */
    private final Context f45474b;

    /* renamed from: c */
    private final String f45475c;

    /* renamed from: d */
    private final long f45476d;

    /* renamed from: e */
    private final long f45477e;

    /* renamed from: a */
    private final List m36641a(long j) {
        String a = szq.m36667a(this.f45474b).mo26282a(this.f45475c, (String) null);
        ArrayList arrayList = new ArrayList();
        if (a != null) {
            for (String str : bmyx.m108640a(',').mo66918a((CharSequence) a)) {
                arrayList.add(Long.valueOf(str));
            }
        }
        long j2 = j - this.f45477e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l.longValue() < j2) {
                Logger Logger = this.f45473a;
                String valueOf = String.valueOf(l);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                sb.append("Removing old timestamp ");
                sb.append(valueOf);
                sb.append(", threshold: ");
                sb.append(j2);
                Logger.logVerbose(sb.toString(), new Object[0]);
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final boolean mo26264b() {
        List a = m36641a(tdn.m36762a());
        Logger Logger = this.f45473a;
        int size = a.size();
        long j = this.f45476d;
        StringBuilder sb = new StringBuilder(67);
        sb.append("Recent events size: ");
        sb.append(size);
        sb.append(", Allowed Count:");
        sb.append(j);
        Logger.logVerbose(sb.toString(), new Object[0]);
        if (((long) a.size()) < this.f45476d) {
            return true;
        }
        return false;
    }

    public szd(Context context, String str, long j, long j2) {
        this.f45474b = context;
        this.f45475c = str;
        this.f45476d = j;
        this.f45477e = j2;
    }

    /* renamed from: a */
    public final void mo26263a() {
        long a = tdn.m36762a();
        List a2 = m36641a(a);
        a2.add(Long.valueOf(a));
        szq a3 = szq.m36667a(this.f45474b);
        String str = this.f45475c;
        ArrayList arrayList = new ArrayList();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            Long l = (Long) a2.get(i);
            if (l != null) {
                arrayList.add(l);
            } else {
                this.f45473a.logVerbose("Removing lingering null timestamp from db", new Object[0]);
            }
        }
        a3.mo26290b(str, TextUtils.join(",", arrayList));
    }
}
