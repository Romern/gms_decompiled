package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* renamed from: amxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amxl extends amxi {
    public amxl(amyo amyo, amwt amwt, amvt amvt, anaz anaz, amye amye) {
        super(ammz.REMOVE, amyo, amvt, anaz, amwt, amye);
    }

    /* renamed from: b */
    public final int mo41547b(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((amvp) it.next()).f76092a);
            }
            amwt amwt = this.f76279e;
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (TextUtils.isEmpty(str)) {
                    Log.e("FSA2_ContactSyncGrpc", "@deleteContact: bailing out upon missing contact ID");
                } else {
                    arrayList2.add(str);
                }
            }
            amwt.mo41506a(arrayList2, "FSA_bulkDeletePeople");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                amvp amvp = (amvp) it2.next();
                if (!TextUtils.isEmpty(amvp.f76092a)) {
                    mo41533e(amvp);
                }
            }
            return list.size();
        } catch (amxy | chuw | gid | ArrayStoreException | JSONException e) {
            Exception exc = e;
            if (exc instanceof chuw) {
                alvf a = amxi.m63634a(this.f76275a);
                chuv chuv = ((chuw) exc).f189236a;
                int a2 = this.f76280f.mo41556a(a, chuv.f189233s.f189211r, chuv.f189234t);
                int i = a2 - 1;
                if (a2 == 0) {
                    throw null;
                } else if (i == 1) {
                    mo41528a(list);
                    this.f76278d.mo41636a(this.f76275a, amjf.CONTACT, false, 3, list.size());
                    return list.size();
                } else if (i == 5) {
                    return 0;
                }
            }
            if (amyg.m63718a(false, amjf.CONTACT, this.f76275a, exc, this.f76278d, list.size()) != ammz.REMOVE) {
                return 0;
            }
            mo41528a(list);
            return list.size();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo41531c(amvp amvp) {
        amwt amwt = this.f76279e;
        String str = amvp.f76092a;
        if (!TextUtils.isEmpty(str)) {
            amwt.mo41506a(Arrays.asList(str), "FSA_deletePeople");
            mo41533e(amvp);
            return;
        }
        Log.e("FSA2_ContactSyncGrpc", "@deleteContact: bailing out upon missing contact ID");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo41532d(amvp amvp) {
        throw new UnsupportedOperationException("Filtering invalid group membership before delete requests is not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo41530b(amvp amvp) {
        if (amvp.f76092a != null) {
            return true;
        }
        if (amvp.f76096e == null) {
            this.f76278d.mo41636a(ammz.REMOVE, amjf.CONTACT, false, 3, 1);
            mo41533e(amvp);
            return false;
        }
        Long l = amvp.f76095d;
        ammz ammz = ammz.REMOVE;
        this.f76278d.mo41636a(ammz, amjf.CONTACT, false, 3, 1);
        amig.m62939a();
        if (((Boolean) amid.f74932a.mo41191a()).booleanValue()) {
            this.f76278d.mo41632a(amjf.CONTACT, ammz, "INSERT_FAILED_BEFORE", (Exception) null);
        }
        ((anbh) this.f76278d).f76541a.stats.numIoExceptions++;
        return false;
    }
}
