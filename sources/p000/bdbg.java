package p000;

import android.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bdbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdbg implements catz {

    /* renamed from: b */
    private static final String f105258b = bdbg.class.getSimpleName();

    /* renamed from: c */
    private final boolean f105259c;

    /* renamed from: d */
    private final bdbj f105260d;

    /* renamed from: e */
    private final bdbk f105261e;

    public bdbg() {
        this(new bdbi(), new bdbf());
    }

    /* renamed from: d */
    private static final List m90528d(String str) {
        if (str == null) {
            throw new UnknownHostException("null == hostname");
        }
        new Object[1][0] = str;
        throw null;
    }

    /* renamed from: a */
    public final List mo57846a(String str) {
        if (this.f105259c) {
            return mo57848c(str);
        }
        return m90528d(str);
    }

    /* renamed from: b */
    public final void mo57847b(String str) {
        long j;
        try {
            if (!this.f105259c) {
                j = (long) m90528d(str).size();
            } else {
                j = (long) mo57848c(str).size();
            }
            Object[] objArr = {str, Long.valueOf(j)};
        } catch (UnknownHostException e) {
            Log.i(f105258b, String.format("Hinting triggered for %s: No usable result.", str));
        }
    }

    /* renamed from: c */
    public final synchronized List mo57848c(String str) {
        ArrayList arrayList;
        if (str != null) {
            new Object[1][0] = str;
            arrayList = new ArrayList();
            try {
                List<InetAddress> asList = Arrays.asList(InetAddress.getAllByName(str));
                for (InetAddress inetAddress : asList) {
                    if (this.f105260d.mo57845a(str, inetAddress)) {
                        arrayList.add(inetAddress);
                    }
                }
                Object[] objArr = {str, Integer.valueOf(arrayList.size()), Integer.valueOf(asList.size())};
            } catch (UnknownHostException e) {
            }
            if (arrayList.isEmpty()) {
                new Object[1][0] = str;
                if (arrayList.addAll(this.f105261e.mo57849a(str))) {
                    Object[] objArr2 = {str, bmxr.m108544a(",").mo66874a((Iterable) arrayList)};
                } else {
                    Log.w(f105258b, String.format("No verified mapping and No cache for %s.", str));
                    throw new UnknownHostException(str.concat(" cannot be resolved, or poisoned but cannot fixed"));
                }
            } else {
                Object[] objArr3 = {str, bmxr.m108544a(",").mo66874a((Iterable) arrayList)};
                this.f105261e.mo57850a(str, arrayList);
            }
        } else {
            throw new UnknownHostException("null == hostname");
        }
        return Collections.unmodifiableList(arrayList);
    }

    public bdbg(bdbk bdbk, bdbj bdbj) {
        this.f105261e = bdbk;
        this.f105260d = bdbj;
        this.f105259c = true;
    }
}
