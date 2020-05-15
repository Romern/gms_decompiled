package p000;

import android.text.TextUtils;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import java.util.Collection;

/* renamed from: almg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almg {

    /* renamed from: a */
    public final allx f73684a;

    /* renamed from: b */
    public final bngx f73685b;

    /* renamed from: c */
    public final bngx f73686c;

    public almg(allx allx) {
        this.f73684a = allx;
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        for (int i = 0; i < allx.f73649a.size(); i++) {
            allw allw = (allw) allx.f73649a.get(i);
            j.mo67668c(bnic.m109495a((Collection) allw.f73640b));
            j2.mo67668c(bnic.m109495a((Collection) allw.f73642d));
        }
        this.f73685b = j.mo67664a();
        this.f73686c = j2.mo67664a();
    }

    /* renamed from: a */
    public final ClassifyAccountTypeResult mo40506a(String str, String str2) {
        almb almb;
        if (str == null) {
            allz a = allz.m61245a(this.f73684a.f73650b);
            if (a == null) {
                a = allz.NULL_ACCOUNT;
            }
            return ClassifyAccountTypeResult.m67785a(null, str2, a, almb.EXACT);
        }
        for (int i = 0; i < this.f73684a.f73649a.size(); i++) {
            if (((bnic) this.f73686c.get(i)).contains(str)) {
                almb = almb.NONE;
            } else {
                allw allw = (allw) this.f73684a.f73649a.get(i);
                if (!allw.f73643e && (!(!TextUtils.isEmpty(str2)) ? allw.f73644f.size() != 0 : !allw.f73644f.contains(str2))) {
                    almb = almb.NONE;
                } else {
                    almb a2 = almb.m61249a(allw.f73645g);
                    if (a2 == null) {
                        a2 = almb.UNKNOWN;
                    }
                    if (!((bnic) this.f73685b.get(i)).contains(str)) {
                        bxwc bxwc = allw.f73641c;
                        int size = bxwc.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                almb = almb.NONE;
                                break;
                            }
                            int i3 = i2 + 1;
                            if (!str.contains((String) bxwc.get(i2))) {
                                i2 = i3;
                            } else if (a2 == almb.UNKNOWN) {
                                almb = almb.SUBSTRING;
                            }
                        }
                    } else if (a2 == almb.UNKNOWN) {
                        almb = almb.EXACT;
                    }
                    almb = a2;
                }
            }
            if (almb != almb.NONE) {
                allz a3 = allz.m61245a(((allw) this.f73684a.f73649a.get(i)).f73639a);
                if (a3 == null) {
                    a3 = allz.UNKNOWN;
                }
                return ClassifyAccountTypeResult.m67785a(str, str2, a3, almb);
            }
        }
        allz a4 = allz.m61245a(this.f73684a.f73651c);
        if (a4 == null) {
            a4 = allz.UNKNOWN;
        }
        return ClassifyAccountTypeResult.m67785a(str, str2, a4, almb.NONE);
    }
}
