package p000;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: acxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxr extends bnch implements acwo {

    /* renamed from: a */
    private final Iterator f61049a;

    /* renamed from: b */
    private final ParcelFileDescriptor f61050b;

    /* renamed from: c */
    private final acxp f61051c;

    /* renamed from: d */
    private final acxb f61052d;

    public acxr(Iterator it, ParcelFileDescriptor parcelFileDescriptor, acxp acxp, acxb acxb) {
        this.f61049a = it;
        this.f61050b = parcelFileDescriptor;
        this.f61051c = acxp;
        this.f61052d = acxb;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f1  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        Set set;
        abyy a;
        while (true) {
            absr absr = null;
            if (this.f61049a.hasNext()) {
                abuu abuu = (abuu) this.f61049a.next();
                acxp acxp = this.f61051c;
                String str = abuu.f58472b;
                String str2 = abuu.f58474d;
                if (!acxp.mo33216a(str, abuu.f58473c)) {
                    absg.m48206e("Invalid usage report: reporting package installed after report -- %s", str);
                } else if (acxp.mo33216a(str2, abuu.f58473c)) {
                    abuy a2 = abuy.m48299a(abuu.f58478h);
                    if (a2 == null) {
                        a2 = abuy.GENERAL_USE;
                    }
                    if (a2 != abuy.GLOBAL_SEARCH_USE || ((a = acxp.mo33215a(str)) != null && a.f58777c)) {
                        if (abuu.f58475e.isEmpty()) {
                            if (!str.equals(str2)) {
                                absg.m48207e("Invalid usage report: pkg name mismatch -- caller %s vs %s", str, str2);
                            } else if ((abuu.f58471a & 128) == 0) {
                                absg.m48206e("Invalid usage report: no corpus name and no document -- %s", str);
                            }
                        }
                        if (!abuu.f58475e.isEmpty()) {
                            acxp acxp2 = this.f61051c;
                            acxb acxb = this.f61052d;
                            acak acak = new acak(abuu.f58474d, abuu.f58475e);
                            String str3 = abuu.f58472b;
                            if (!acxp2.f61042b.containsKey(str3)) {
                                abyy a3 = acxp2.mo33215a(str3);
                                if (a3 == null) {
                                    set = Collections.emptySet();
                                } else {
                                    set = acxp2.f61043c.mo32528a(a3, null, true, null);
                                }
                                acxp2.f61042b.put(str3, set);
                            } else {
                                set = (Set) acxp2.f61042b.get(str3);
                            }
                            if (!set.contains(acak)) {
                                if (abuu.f58474d.equals("com.google.android.gms")) {
                                    try {
                                        acxb.mo33184a(abuu.f58472b, abuu.f58475e);
                                    } catch (acxa e) {
                                        absg.m48206e("Failed to authenticate report: %s", e);
                                    }
                                }
                                absg.m48205e("Invalid usage report: no access");
                                if (absr == null) {
                                    absg.m48206e("UsageReport from %s ignored -- corpus not found", abuu.f58472b);
                                }
                            }
                            absr d = acxp2.f61043c.mo32543d(acak);
                            if (d == null) {
                                absg.m48205e("Invalid usage report: missing config");
                            } else {
                                absr = d;
                            }
                            if (absr == null) {
                            }
                        }
                        abyy a4 = this.f61051c.mo33215a(abuu.f58472b);
                        if (a4 != null) {
                            return new acxq(abuu, absr, a4);
                        }
                    } else {
                        abuy a5 = abuy.m48299a(abuu.f58478h);
                        if (a5 == null) {
                            a5 = abuy.GENERAL_USE;
                        }
                        absg.m48207e("Illegal usage type: %s from %s", a5, str);
                    }
                } else {
                    absg.m48206e("Invalid usage report: doc package installed after report -- %s", str2);
                }
            } else {
                mo67118d();
                return null;
            }
        }
    }

    public final void close() {
        ParcelFileDescriptor parcelFileDescriptor = this.f61050b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                absg.m48191b("Failed to close file descriptor.");
            }
        }
        acxp acxp = this.f61051c;
        acxp.f61041a.clear();
        acxp.f61042b.clear();
    }
}
