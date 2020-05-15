package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: befa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befa {

    /* renamed from: a */
    private final Map f111474a;

    /* renamed from: b */
    private final Map f111475b;

    /* renamed from: c */
    private final List f111476c;

    public befa(List list) {
        this(list, Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: g */
    public static final Uri m94920g(Uri uri) {
        return uri.buildUpon().fragment(null).build();
    }

    /* renamed from: i */
    private final bngx m94921i(Uri uri) {
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        bnre i = behf.m95041a(uri).listIterator();
        while (i.hasNext()) {
            j2.mo67668c(behf.m95042a((String) i.next()));
        }
        bnre i2 = j2.mo67664a().listIterator();
        while (i2.hasNext()) {
            String str = (String) i2.next();
            beid beid = (beid) this.f111475b.get(str);
            if (beid != null) {
                j.mo67668c(beid);
            } else {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(valueOf).length());
                sb.append("No such transform: ");
                sb.append(str);
                sb.append(": ");
                sb.append(valueOf);
                throw new begy(sb.toString());
            }
        }
        return j.mo67664a().mo67670d();
    }

    /* renamed from: a */
    public final beey mo60641a(Uri uri, beer... beerArr) {
        bngx i = m94921i(uri);
        beex beex = new beex();
        beex.f111460a = this;
        beex.f111461b = mo60642a(uri.getScheme());
        beex.f111463d = this.f111476c;
        beex.f111462c = i;
        beex.f111464e = uri;
        if (!i.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = i.listIterator(i.size());
                while (listIterator.hasPrevious()) {
                    ((beid) listIterator.previous()).mo60721c();
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        beex.f111465f = uri;
        beex.f111466g = Arrays.asList(beerArr);
        return new beey(beex);
    }

    /* renamed from: b */
    public final void mo60646b(Uri uri) {
        mo60642a(uri.getScheme()).mo36268f(m94920g(uri));
    }

    /* renamed from: c */
    public final boolean mo60647c(Uri uri) {
        beey a = mo60641a(uri, new beer[0]);
        return a.f111468b.mo36262a(a.f111472f);
    }

    /* renamed from: d */
    public final boolean mo60648d(Uri uri) {
        return mo60642a(uri.getScheme()).mo36269g(m94920g(uri));
    }

    /* renamed from: e */
    public final long mo60649e(Uri uri) {
        beey a = mo60641a(uri, new beer[0]);
        return a.f111468b.mo36271i(a.f111472f);
    }

    /* renamed from: f */
    public final Iterable mo60650f(Uri uri) {
        behy a = mo60642a(uri.getScheme());
        bngx i = m94921i(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        for (Uri uri2 : a.mo36272j(m94920g(uri))) {
            Uri build = uri2.buildUpon().encodedFragment(encodedFragment).build();
            if (!i.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(build.getPathSegments());
                if (!arrayList2.isEmpty() && !build.getPath().endsWith("/")) {
                    String str = (String) bnjd.m109595d(arrayList2);
                    int size = i.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((beid) i.get(i2)).mo60720b();
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    build = build.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(build);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Iterable], assign insn: 0x0010: INVOKE  (r0v2 ? I:java.lang.Iterable) = (r4v0 'this' befa A[THIS]), (r5v0 android.net.Uri) type: VIRTUAL call: befa.f(android.net.Uri):java.lang.Iterable */
    @Deprecated
    /* renamed from: h */
    public final void mo60651h(Uri uri) {
        if (!mo60647c(uri)) {
            return;
        }
        if (!mo60648d(uri)) {
            mo60644a(uri);
            return;
        }
        ? f = mo60650f(uri);
        int size = f.size();
        for (int i = 0; i < size; i++) {
            mo60651h((Uri) f.get(i));
        }
        mo60646b(uri);
    }

    public befa(List list, List list2) {
        this(list, list2, Collections.emptyList());
    }

    public befa(List list, List list2, List list3) {
        this.f111474a = new HashMap();
        this.f111475b = new HashMap();
        this.f111476c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            behy behy = (behy) it.next();
            if (TextUtils.isEmpty(behy.mo36259a())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                behy behy2 = (behy) this.f111474a.put(behy.mo36259a(), behy);
                if (behy2 != null) {
                    String canonicalName = behy2.getClass().getCanonicalName();
                    String canonicalName2 = behy.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb.append("Cannot override Backend ");
                    sb.append(canonicalName);
                    sb.append(" with ");
                    sb.append(canonicalName2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            beid beid = (beid) it2.next();
            if (TextUtils.isEmpty(beid.mo60719a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                beid beid2 = (beid) this.f111475b.put(beid.mo60719a(), beid);
                if (beid2 != null) {
                    String canonicalName3 = beid2.getClass().getCanonicalName();
                    String canonicalName4 = beid.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length());
                    sb2.append("Cannot to override Transform ");
                    sb2.append(canonicalName3);
                    sb2.append(" with ");
                    sb2.append(canonicalName4);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        this.f111476c.addAll(list3);
    }

    /* renamed from: a */
    public final behy mo60642a(String str) {
        behy behy = (behy) this.f111474a.get(str);
        if (behy != null) {
            return behy;
        }
        throw new begy(String.format("Cannot open, unregistered backend: %s", str));
    }

    /* renamed from: a */
    public final Object mo60643a(Uri uri, beez beez, beer... beerArr) {
        return beez.mo14941a(mo60641a(uri, beerArr));
    }

    /* renamed from: a */
    public final void mo60644a(Uri uri) {
        beey a = mo60641a(uri, new beer[0]);
        a.f111468b.mo36266d(a.f111472f);
    }

    /* renamed from: a */
    public final void mo60645a(Uri uri, Uri uri2) {
        beey a = mo60641a(uri, new beer[0]);
        beey a2 = mo60641a(uri2, new beer[0]);
        behy behy = a.f111468b;
        if (behy == a2.f111468b) {
            behy.mo36260a(a.f111472f, a2.f111472f);
            return;
        }
        throw new begy("Cannot rename file across backends");
    }
}
