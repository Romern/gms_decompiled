package com.google.android.gms.ads.internal.csi;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0387d;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.csi.k */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0386k {

    /* renamed from: a */
    final boolean f8296a;

    /* renamed from: b */
    public final Map f8297b = new LinkedHashMap();

    /* renamed from: c */
    public final Object f8298c = new Object();

    /* renamed from: d */
    private final List f8299d = new LinkedList();

    public C0386k(boolean z, String str, String str2) {
        this.f8296a = z;
        this.f8297b.put("action", str);
        this.f8297b.put("ad_format", str2);
    }

    /* renamed from: a */
    public final C0384i mo6616a() {
        return mo6617a(C0387d.m5368f().mo20506b());
    }

    /* renamed from: b */
    public final String mo6619b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f8298c) {
            for (C0384i iVar : this.f8299d) {
                long j = iVar.f8291a;
                String str = iVar.f8292b;
                C0384i iVar2 = iVar.f8293c;
                if (iVar2 != null && j > 0) {
                    sb2.append(str);
                    sb2.append('.');
                    sb2.append(j - iVar2.f8291a);
                    sb2.append(',');
                }
            }
            this.f8299d.clear();
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: c */
    public final void mo6620c() {
        synchronized (this.f8298c) {
        }
    }

    /* renamed from: a */
    public final C0384i mo6617a(long j) {
        if (this.f8296a) {
            return new C0384i(j, null, null);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo6618a(C0384i iVar, String... strArr) {
        if (this.f8296a && iVar != null) {
            long b = C0387d.m5368f().mo20506b();
            synchronized (this.f8298c) {
                for (String str : strArr) {
                    this.f8299d.add(new C0384i(b, str, iVar));
                }
            }
        }
    }
}
